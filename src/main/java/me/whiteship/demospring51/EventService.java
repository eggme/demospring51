package me.whiteship.demospring51;

import org.springframework.stereotype.Service;

public interface EventService {
    void createEvent();

    void publishEvent();

    void deleteEvent();
}
