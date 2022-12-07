package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {
    String name = "Piotr Szkaradek";

    @Override
    public String getMessage() {
        return this.name;
    }
}
