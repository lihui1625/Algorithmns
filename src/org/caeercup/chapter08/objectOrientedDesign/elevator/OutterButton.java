package org.caeercup.chapter08.objectOrientedDesign.elevator;

public class OutterButton {
  
  private int floor;
  
  private Elevator elevator; 
  
  private UpDownRequestStatus upDownRequestStatus ;

  public OutterButton(int floor, Elevator elevator) { 
    this.floor = floor;
    this.elevator = elevator;
  }

  public int getFloor() {
    return floor;
  }

  public Elevator getElevator() {
    return elevator;
  }
   
}

enum UpDownRequestStatus{
  UP,
  DOWN,
  NONE;
}
