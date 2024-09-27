package com.pr.CircleArea.service;
import org.springframework.stereotype.Service;

@Service
public class CircleAreaService {
  public String calculateArea(double radius){
  return Double.toString(Math.PI * radius * radius);
}
  
}
