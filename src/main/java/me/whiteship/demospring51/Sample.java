package me.whiteship.demospring51;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sample {

    @Value("5")
    int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
