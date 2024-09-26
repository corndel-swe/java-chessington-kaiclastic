package com.corndel.exercises;

/*
public class RightTriangle {
  private double base;
  private double height;

  RightTriangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double getBase() {
    return this.base;
  }

  public double getHeight() {
    return this.height;
  }

  public double getHypotenuse() {
    return Math.sqrt(base * base + height * height);
  }
}
*/

public class RightTriangle implements Shape {

  private final double base;
  private final double height;

  RightTriangle(double base, double height) {
    this.base = base;
    this.height = height;

  }
  public double getBase() {
    return base;
  }

  public double getHeight() {
    return height;
  }


  public double getHypotenuse() {
    return Math.sqrt(base * base + height * height);
  }

  @Override
  public double getArea() {
    return (getBase()*getHeight())/2;
  }

  @Override
  public double getPerimeter() {
    return getBase()+getHeight()+getHypotenuse();
  }

  public static void main(String[] args) {
    RightTriangle rightTriangle = new RightTriangle(4,6);
    System.out.println(rightTriangle.getHypotenuse());
  }

}