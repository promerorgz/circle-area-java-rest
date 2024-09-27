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

  // POST Request
  @CrossOrigin(origins = "http://localhost:3000")
  @PostMapping(value = "/area")
  public ResponseEntity<?> calculateArea(@RequestBody CircleAreaDTO cadto) {
    try {
      String radius = cadto.getRadius();
      System.out.println(radius);

      if (radius == "") {
        System.err.println("radius is empty " + radius);
        return new ResponseEntity<String>("Radius must be provided", HttpStatus.BAD_REQUEST);
      }

      if (!isNumeric(radius)) {
        System.err.println("radius is not numeric " + radius);

        return new ResponseEntity<String>("Radius must be numeric", HttpStatus.BAD_REQUEST);
      }

      if (Double.parseDouble(radius) < 1 || Double.parseDouble(radius) > 100) {
        System.err.println("radius is not valid " + radius);
        return new ResponseEntity<String>("Radius must be 1-100", HttpStatus.BAD_REQUEST);
      }

      String area = circleAreaService.calculateArea(Double.parseDouble(radius));
      return new ResponseEntity<String>(area, HttpStatus.OK);

    } catch (Exception e) {
      return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
    }
  }

  public static boolean isNumeric(String str) {
    try {
      Double.parseDouble(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

}
