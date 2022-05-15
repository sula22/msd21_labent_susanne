# Exercise 4
Configuration Management

### Topics and goals
Testing Java code with JUnit / Learn to test methods automatically

### Steps
- Configurate XML file to include JUNit testing
- Organize packages and building testfiles
- Write testcases to test functionality and performance of the class 'Calculator'
- Test my own method "faculty" in various testcases

In this exercise I have learned how to test simple Java methods with JUnit.
First I wrote some testcases to proof my written methods have the right results.
- firstAddingTest(): 15.0 + 35 / I proofed if a double value added to a integer value leads to the right result
- secondAddingTest(): 58 + 19 / Here its shown that the in-method calculated result equals the result of the method
- firstSubtractTest(): 15.4 - 23 / An integer subtracted from a double value leads to no problem
- secondSubtractTest(): ...
- firstMultiplyTest(): ...
- secondMultiplyTest(): ...
- firstDivideTest(): ...
- secondDivideTest(): Dividing by zero leads to no problems
In the next step I wrote a method that calculates the faculty of an integer value and returns a long value.
I set the return value to 0 and wrote 3 testcases in CalculatorTest.

