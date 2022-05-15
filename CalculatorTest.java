package at.fhj.msd;
import org.junit.jupiter.api.*;


public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setup(){
        calc = new Calculator();
    }

    @Test
    public void firstAddingTest(){
        Assertions.assertEquals(50, calc.add(15.0, 35));
    }

    @Test
    public void secondAddingTest(){
        int a = 58;
        int b = 19;
        int result = a + b;
        Assertions.assertEquals(result, calc.add(a, b));
    }

    @Test
    public void firstSubtractTest(){
        Assertions.assertEquals(-7.6, calc.subtract(15.4, 23));
    }

    @Test
    public void secondSubtractTest(){
        int a = 27;
        int b = 92;
        int result = a - b;
        Assertions.assertEquals(result, calc.subtract(a, b));
    }

    @Test
    public void firstMultiplyTest(){
        Assertions.assertEquals(4104, calc.multiply(9, 456));
    }

    @Test
    public void secondMultiplyTest(){
        double a = 25.8;
        double b = 2.9;
        double result = a * b;
        Assertions.assertEquals(result, calc.multiply(a, b));
    }

    @Test
    public void firstDivideTest(){
        Assertions.assertEquals(1090.6, calc.divide(545.3, 0.5));
    }

    @Test
    public void secondDivideTest(){
        double a = 67;
        double b = 0;
        double result = a / b;
        Assertions.assertEquals(result, calc.divide(a, b));
    }

    @Test
    public void firstTestFaculty(){
        Assertions.assertEquals(120, calc.getFaculty(5));
    }

    @Test
    public void secondTestFaculty(){
        Assertions.assertEquals(0, calc.getFaculty(0));
    }

    @Test
    public void thirdTestFaculty(){
        Assertions.assertEquals(0, calc.getFaculty(-200));
    }



    @AfterEach
    public void tearDown() { /* … */ }


}

