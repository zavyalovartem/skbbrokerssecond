package com.example.skbbrokerssecond.models;

import lombok.Data;

@Data
public class ToSend {
    private Integer id;
    private String state;
    private String time;
    private String message;

    public ToSend(Integer id, String state, String time, String message) {
        this.id = id;
        this.state = state;
        this.time = time;
        this.message = message;
    }
}
