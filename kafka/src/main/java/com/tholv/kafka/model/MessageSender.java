package com.tholv.kafka.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MessageSender {
    private String name;
    private String message;

    public MessageSender() {
    }
    public String toString() {
        return "MessageSender(name=" + this.getName() + ", message=" + this.getMessage() + ")";
    }
}
