package com.ensa.gi4.listeners;

import com.ensa.gi4.modele.Material;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;


public class ApplicationPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;

    }

    public <T> void  publish(MyEvent<T> event) {
        applicationEventPublisher.publishEvent(event);

    }
}
