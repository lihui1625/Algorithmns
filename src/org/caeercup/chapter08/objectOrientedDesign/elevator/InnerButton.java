package org.caeercup.chapter08.objectOrientedDesign.elevator;

import java.util.HashSet;
import java.util.Set;

public class InnerButton {
  
  private Elevator elevator;
  
  private Set<Integer> requestFloors = new HashSet<>();

  public InnerButton(Elevator elevator) {
    this.elevator = elevator;
  }

  public Elevator getElevator() {
    return elevator;
  }
  
  public void addRequestFloor(int i){
    requestFloors.add(i);
  }
  
  public void removeRequestFloor(int i){
    requestFloors.remove(i);
  }
   
  public void reset(int i){
    requestFloors.clear();;
  }

  public Set<Integer> getRequestFloors() {
    return requestFloors;
  } 
  
}
