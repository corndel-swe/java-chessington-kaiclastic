package com.corndel.exercises;
/*
public class Square {
  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double getArea() {
    return this.side * this.side;
  }

  public double getPerimeter() {
    return 4 * this.side;
  }

  public double getWidth() {
    return this.side;
  }

  public double getHeight() {
    return this.side;
  }
}
*/

public class Square extends Rectangle{
  public static int side;
  public Square(int side) {
    super(side, side);
  }
  public static void main(String[] args) {
    Square square = new Square(4);
    System.out.println(square.getWidth());
  }
}


