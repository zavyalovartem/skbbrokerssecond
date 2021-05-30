package com.example.skbbrokerssecond.services;

import com.example.skbbrokerssecond.models.ToSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class Sender {
    @Autowired
    StreamBridge bridge;

    public void publishProcessed(ToSend message){
        bridge.send("toStream-out-0", message);
    }

}
