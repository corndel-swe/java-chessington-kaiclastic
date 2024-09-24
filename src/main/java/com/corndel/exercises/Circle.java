package com.corndel.exercises;

public class Circle implements Shape{
  private double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double getArea() {
     return getRadius()*getRadius()*3.14;
  }

  @Override
  public double getPerimeter() {
    return 2*3.14*getRadius();
  }

  public static void main(String[] args) {
    Circle circle = new Circle(4);
    System.out.println(circle.getPerimeter());
  }
}
