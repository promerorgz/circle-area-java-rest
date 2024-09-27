package com.pr.CircleArea.dto;


public class CircleAreaDTO {
  // could also use javax validation (min max). Would add dep if further validation needs arise
  private String radius;
  public String getRadius(){
    return radius;
  }
  public void setRadius(String radius){
    this.radius = radius;
  }
  
}
