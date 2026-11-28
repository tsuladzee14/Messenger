package org.example;

import java.time.LocalDateTime;

public class Room {
    private int id;
    private String name;
    private LocalDateTime createdAt;

    public Room(int id, String name, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}