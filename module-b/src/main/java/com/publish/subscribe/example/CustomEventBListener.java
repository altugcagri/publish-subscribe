package com.publish.subscribe.example;

import com.publish.subscribe.example.events.CustomEventB;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventBListener implements ApplicationListener<CustomEventB> {

  @Override
  public void onApplicationEvent(CustomEventB event) {
    System.out.println("CustomEventBListener: Custom Event Occurred:" + event.getEventMessage());
  }
}
