package com.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.example.Rectangle.createSquare;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RectangleTest {

    @Nested
    class Area {
        @Test
        public void toReturnEightAsAreaOfRectangleWhenLengthAndBreadthIsFourAndTwo(){
            int four = 4, two = 2, eight = 8;
            Rectangle rectangle = new Rectangle(four, two);

            int areaOfRectangle4x2 = rectangle.calculateArea();
            assertThat(areaOfRectangle4x2, is(equalTo(eight)));
        }

        @Test
        public void toReturnZeroAsAreaOfRectangleWhenLengthAndBreadthIsZeroAndThree(){
            int zero = 0, three = 3;
            Rectangle rectangle = new Rectangle(zero, three);

            int areaOfRectangle0x3 = rectangle.calculateArea();
            assertThat(areaOfRectangle0x3, is(equalTo(zero)));
        }

        @Test
        public void toReturnNineAsAreaOfSquareWhenSideValueOfSquareIsThree(){
            int three = 3, nine = 9;
            Rectangle square3x3 = createSquare(three);

            int areaOfSquare3x3 = square3x3.calculateArea();
            assertThat(areaOfSquare3x3, is(equalTo(nine)));
        }
    }

    @Nested
    class Perimeter{
        @Test
        public void toReturnTenAsPerimeterWhenLengthAndBreadthIsThreeAndTwo(){
            int two = 2, three = 3, ten = 10;
            Rectangle rectangle = new Rectangle(two, three);

            int perimeterOfRectangle2x3 = rectangle.calculatePerimeter();
            assertThat(perimeterOfRectangle2x3, is(equalTo(ten)));
        }

        @Test
        public void toReturnTwelveAsPerimeterOfSquareWhenSideValueOfSquareIsThree(){
            int three = 3, twelve = 12;
            Rectangle square3x3 = createSquare(three);

            int perimeterOfSquare3x3 = square3x3.calculatePerimeter();
            assertThat(perimeterOfSquare3x3, is(equalTo(twelve)));
        }
    }
}
