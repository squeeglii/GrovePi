package com.dexterind.grovepi.sensors.base;

import com.dexterind.grovepi.utils.Debug;

import java.io.IOException;

public class I2cSensor extends Sensor {
  protected int pin = 0;
  protected Debug debug;

  public I2cSensor(int pin) throws IOException, InterruptedException, Exception {
	super();
	this.pin = pin;
  }
}
