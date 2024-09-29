package com.pr.CircleArea;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

class CircleAreaControllerTests {

  public static boolean isNumeric(String str) {
    try {
      Double.parseDouble(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

	@Test
	public void testIsNumeric_withValidNumber() {
    assertTrue(isNumeric("123"), "Valid integer should return true");
    assertTrue(isNumeric("123.45"), "Valid decimal should return true");
}

}
