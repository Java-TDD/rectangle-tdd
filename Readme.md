# Rectangle
- Test class `RectangleTest` is created.
- An instance is created for the `Rectangle` class present in the main.
- `length` and `breadth` arguments are passed into the constructor

### Requirement 1: 
As a fan of geometry, I want to find the area of the rectangle.

#### TestCase: 
- The method `calculateArea()` is called with the created instance and the area of the rectangle is obtained by the method.
- `assertThat()` method is used to evaluate the equality of the expected area and the actual area.
- Created a suit with `@Nested` annotation to suit up the testcases for calculating the area of the rectangle.

### Requirement 2:
As a fan of geometry, I want to find the perimeter of the rectangle.

#### TestCase:
- The method `calculatePerimeter()` is called with the created instance and the perimeter of the rectangle is obtained by the method.
- `assertThat()` method is used to evaluate the equality of the expected area and the actual perimeter.
- Created a suit with `@Nested` annotation to suit up the testcases for calculating the perimeter of the rectangle.


### Requirement 3: 
As a fan of geometry, I want to find the area of perimeter of the `square`.

#### Testcase:
- Testcase is written as to create an instance of rectangle class by calling the function `createSquare()` which returns a Rectangle object.
- Then the testcase is written to calculate the perimeter and area of the square.

#### Codebase:
- since we have implemented the code to calculate the area and perimeter of the rectangle, we can use the same method to find the area and perimeter of the square, since lxb can be taken as axa.
- But creating a square with a rectangle instance would be inconsistent.
- So we create a method to create a square called `createSquare()`. This function takes the side value of the square and create an instance of the rectangle class by passing the side value as length and breadth to the rectangle
- We can create another class called `Square` to calculate the perimeter and area of the square, but this would not follow `BECK` principle as this would result in code duplication. 