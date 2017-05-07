package org.caeercup.chapter08.objectOrientedDesign.elevator;

import java.util.HashSet;
import java.util.Set;

public class Building {
 
  private int id;
  
  private String name;
  
  private String address;
  
  private int totalFloor;
  
  private Set<Elevator> elevators = new HashSet<>();

  public Building(int id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getTotalFloor() {
    return totalFloor;
  }

  public void setTotalFloor(int totalFloor) {
    this.totalFloor = totalFloor;
  }

  public Set<Elevator> getElevators() {
    return elevators;
  }

  public void addElevators(Elevator elevator) {
    this.elevators.add(elevator);
  }
  
  public void reomoveElevators(Elevator elevator) {
    this.elevators.remove(elevator);
  }
  

}
