package com.pr.CircleArea.service;
import org.springframework.stereotype.Service;

@Service
public class CircleAreaService {
  public double calculateArea(double radius){
  return Math.PI * radius * radius;
}
  
}
