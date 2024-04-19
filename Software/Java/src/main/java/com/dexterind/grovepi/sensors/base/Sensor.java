/**
 * TODO: Implement "watch" and "stream" methods, such as the Node.js library
 */
package com.dexterind.grovepi.sensors.base;

import com.dexterind.grovepi.Board;

import java.io.IOException;

public class Sensor {
  protected Board board;
  
  public Sensor() throws IOException, InterruptedException, Exception {
    board = Board.getInstance();
  }
  
  public byte[] readBytes() throws IOException { byte[] ret = {}; return ret; }
  public boolean write() throws IOException { return true; }
}
