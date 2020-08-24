package me.whiteship.demospring51;


import org.springframework.core.convert.converter.Converter;

public class EventConverter{

    public static class StringToEventConverter implements Converter<String, Event> {
        @Override
        public Event convert(String s) {
            return new Event(Integer.parseInt(s), "suengjun");
        }
    }

    public static class EventToStringConverter implements Converter<Event, String> {
        @Override
        public String convert(Event event) {
            return event.toString();
        }
    }

}
