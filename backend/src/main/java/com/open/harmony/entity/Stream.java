package com.open.harmony.entity;

import lombok.Data;

import java.time.LocalDateTime;


public class Stream {
    private int id;
    private LocalDateTime timestamp;
    private int footfallCount;
    private int marketId;
    private String location;

    public Stream(int id, LocalDateTime timestamp, int footfallCount, int marketId, String location) {
        this.id = id;
        this.timestamp = timestamp;
        this.footfallCount = footfallCount;
        this.marketId = marketId;
        this.location = location;
    }

    public Stream() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getFootfallCount() {
        return footfallCount;
    }

    public void setFootfallCount(int footfallCount) {
        this.footfallCount = footfallCount;
    }

    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}