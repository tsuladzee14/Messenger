package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
   private int id;
   private int SenderId;
   private String SenderName;
   private Integer roomId;
   private Integer receiverId;
   private String text;
   private LocalDateTime  sentAt;

    public Message(int id, int senderId, String senderName, Integer roomId, Integer receiverId, String text, LocalDateTime sentAt) {
        this.id = id;
        SenderId = senderId;
        SenderName = senderName;
        this.roomId = roomId;
        this.receiverId = receiverId;
        this.text = text;
        this.sentAt = sentAt;
    }

    public boolean isPrivate(){
         return receiverId != null;
    }

    public String format(){
        String time = sentAt != null ? sentAt.format(TIME_FORMATTER) : "--:--";
        return "[" + time + "] " + SenderName + ": " + text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenderId() {
        return SenderId;
    }

    public void setSenderId(int senderId) {
        SenderId = senderId;
    }

    public String getSenderName() {
        return SenderName;
    }

    public void setSenderName(String senderName) {
        SenderName = senderName;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }
}
