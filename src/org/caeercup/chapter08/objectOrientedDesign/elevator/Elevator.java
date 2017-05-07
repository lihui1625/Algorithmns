package org.caeercup.chapter08.objectOrientedDesign.elevator;

import java.util.HashMap;
import java.util.Map;

public class Elevator {
  
  private int id;
  
  private int currentFloor;
  
  private int targetFloor;
  
  private OpenCloseStatus openCloseStatus;
  
  private UpDownStatus upDownStatus; 
  
  private InnerButton innerButton;
  
  private Map<Integer, OutterButton> outterButtonMap = new HashMap<>();
  
  private Building building;

  public Elevator(int id, Building building) {  
    super();
    this.id = id;
    this.innerButton = new InnerButton(this);
    this.building = building;
    for(int i=1; i<= this.building.getTotalFloor();i++){
      outterButtonMap.put(i, new OutterButton(i, this));
    }
    this.building.addElevators(this); 
    this.currentFloor = 0;
    this.targetFloor = 0;
    this.openCloseStatus = OpenCloseStatus.CLOSE;
    this.upDownStatus = UpDownStatus.STOP; 
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCurrentFloor() {
    return currentFloor;
  }

  public void setCurrentFloor(int currentFloor) {
    this.currentFloor = currentFloor;
  }

  public int getTargetFloor() {
    return targetFloor;
  }

  public void setTargetFloor(int targetFloor) {
    this.targetFloor = targetFloor;
  }

  public OpenCloseStatus getOpenCloseStatus() {
    return openCloseStatus;
  }

  public void setOpenCloseStatus(OpenCloseStatus openCloseStatus) {
    this.openCloseStatus = openCloseStatus;
  }

  public UpDownStatus getUpDownStatus() {
    return upDownStatus;
  }

  public void setUpDownStatus(UpDownStatus upDownStatus) {
    this.upDownStatus = upDownStatus;
  }

  public InnerButton getInnerButton() {
    return innerButton;
  }

  public void setInnerButton(InnerButton innerButton) {
    this.innerButton = innerButton;
  }

  public Building getBuilding() {
    return building;
  }

  public void setBuilding(Building building) {
    this.building = building;
  }

  public Map<Integer, OutterButton> getOutterButtonMap() {
    return outterButtonMap;
  }  
  
  
}



enum OpenCloseStatus{
  OPEN,
  CLOSE 
}

enum UpDownStatus{
  UP,
  DOWN,
  STOP  
}
