package com.pr.CircleArea.dto;


public class CircleAreaDTO {
  // could also use javax validation (min max). Would add dep if further validation needs arise
  private double radius;
  public double getRadius(){
    return radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
  }
  
}
