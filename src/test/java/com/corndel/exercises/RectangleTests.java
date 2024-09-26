package com.corndel.exercises;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTests {
    @Test
    public void areaRectangle() {
        // arrange
        double width = 8.0;
        double height = 12.0;

       // act
        Rectangle rectangle = new Rectangle(8,12);
        assertEquals(96.0, rectangle.getArea());
    }

    public void perimeterRectangle() {
        // act && assert
        // create an instance of class to access the methods
        Rectangle rectangle = new Rectangle(8,12);
        assertEquals(96.0, rectangle.getPerimeter());
    }

}
