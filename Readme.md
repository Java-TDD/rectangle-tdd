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
