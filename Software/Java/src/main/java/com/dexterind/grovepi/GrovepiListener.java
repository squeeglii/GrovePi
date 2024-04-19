package com.dexterind.grovepi;

import com.dexterind.grovepi.events.SensorEvent;
import com.dexterind.grovepi.events.StatusEvent;

import java.util.EventListener;

public interface GrovepiListener extends EventListener {
  void onStatusEvent(StatusEvent event);
  void onSensorEvent(SensorEvent event);
}
