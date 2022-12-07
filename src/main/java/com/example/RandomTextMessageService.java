package com.example;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component("randomMessageService")
public class RandomTextMessageService implements MessageService{
    String[] messages = {"Sprzedam Opla", "Pawel Jumper",
            "Ciuch ciuch", "FBI",
            "Wihajster", "Kanapka z chlebem",
            "Korek niekapek", "Płaska Ziemia",
            "Piwo piwo", "Przgrałem w gre"};

    @Override
    public String getMessage() {
        Random rand = new Random();
        int i = rand.nextInt(10);
        return this.messages[i];
    }
}
