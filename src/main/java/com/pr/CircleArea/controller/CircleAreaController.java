package com.pr.CircleArea.controller;
import org.springframework.web.bind.annotation.*;

import com.pr.CircleArea.dto.CircleAreaDTO;
import com.pr.CircleArea.service.CircleAreaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/circle")
public class CircleAreaController {
  @Autowired
  private CircleAreaService circleAreaService;
  //POST Request
  @CrossOrigin(origins = "http://localhost:3000")
  @PostMapping(value="/area")
  public ResponseEntity<?> calculateArea(@RequestBody CircleAreaDTO cadto){
   try {
    double radius = cadto.getRadius();


    if (radius < 1 || radius > 100) {
     return new ResponseEntity<String>("Radius must be 1-100", HttpStatus.BAD_REQUEST);
           
         }
         
         double area = circleAreaService.calculateArea(radius);
         return new ResponseEntity<>(area, HttpStatus.OK);
   } catch (Exception e) {
    return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
  }
  }
  @GetMapping(value="/")
  public String getThings(){
    return "foo";
  }

  
}
