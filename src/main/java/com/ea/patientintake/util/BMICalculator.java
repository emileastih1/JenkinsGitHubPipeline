package com.ea.patientintake.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

//BMI Calculator
public class BMICalculator {

  public static double calculateBmi(Integer inches, Integer pounds) {
    Double bmi = (double) (pounds * 703) / (inches * inches);
    return new BigDecimal(bmi).setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
}
