package ru.devray.allurerefresher;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SimpleTest {

    //{0} substitutes 0th input parameter in our test method,
    //while index - test run number (inside parameterized suite)
    @ParameterizedTest(name = "Parameterized test #{index} {0}")
    @ValueSource(strings = {"abc", "def", "123", "456"})
    void test1(String userInput){
        System.out.printf("User entered '%s'", userInput);
    }

    @Tag("smoke")
    @Test
    void test2(){
        SuperUtil su = new SuperUtil();
        su.loadData();
        su.processData();
        su.flushToDB();
        su.saveToLocalFile();
    }

    @Tag("smoke")
    @Test
    void test3(){
        SuperUtil su = new SuperUtil();
        su.loadData();
        su.processData();
    }




}
