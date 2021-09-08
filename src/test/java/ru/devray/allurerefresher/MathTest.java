package ru.devray.allurerefresher;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import ru.devray.allurerefresher.testutil.Pair;

import java.util.List;
import java.util.Map;

public class MathTest {

    private static IntCalculator calc;

    @BeforeAll
    static void setUp(){
        calc = new IntCalculator();
    }

    @Tag("integration")
    @ParameterizedTest
    @CsvSource({
            "3,4,7",
            "2,8,10",
            "-6,-7,-13",
            "0,1,1",
            "5,6,1", //некорректный набор данных - падающий тест
            "-90,-10,-100",
            "2,2,5" //некорректный набор данных - падающий тест
    })
    void testAdd(int i1, int i2, int expectedResult){
        int actualResult = calc.add(i1, i2);
        Assertions.assertEquals(expectedResult, actualResult,
                "Error in add operation! Value does not match with expected result.");
    }

    @Test
    @Tag("smoke")
    void testSubtract(){
        Assertions.assertEquals(-1, calc.subtract(1, 2),
                "Error in subtract operation! Value does not match with expected result.");
    }

    @Test
    @Story("This is a positive scenario on ordering a coffeemachine.")
    void multiStepTest(){
//        initialize();
//        doMainLogic();
//        finish();
    }

//    @Step("Preparation")
//    void initialize(){}
//    @Step("Execution")
//    void doMainLogic(){}
//    @Step("Termination")
//    void finish(){}
//    @ParameterizedTest
//    @MethodSource("intArrayTestProvider")
//    void testAddArray(int){
//        calc.add()
//    }
//
//    public List<Pair<int[], Integer>> intArrayTestProvider(){
//
//        return
//    }


}
