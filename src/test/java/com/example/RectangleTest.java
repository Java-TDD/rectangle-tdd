package com.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RectangleTest {

    @Test
    public void toReturnEightAsAreaOfRectangleWhenLengthAndBreadthIsFourAndTwo(){
        int four = 4, two = 2, eight = 8;
        Rectangle rectangle = new Rectangle(four, two);

    }
}