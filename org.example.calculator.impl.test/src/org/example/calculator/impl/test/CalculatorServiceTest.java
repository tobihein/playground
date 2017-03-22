package org.example.calculator.impl.test;

import static org.junit.Assert.assertEquals;

import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

import org.example.calculator.impl.CalculatorServiceImpl;
import org.example.calculator.multiply.MultiplyService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith( JMockit.class )
public class CalculatorServiceTest {
    CalculatorServiceImpl calculatorService;
    @Mocked
    MultiplyService multiplyServiceMock;

    @Before
    public void init() {
        calculatorService = new CalculatorServiceImpl();
        calculatorService.bind( multiplyServiceMock );
    }

    @SuppressWarnings( "unused" )
    @Test
    public void multiply_2_and_3() {
        new Expectations() {
            {
                multiplyServiceMock.multiply( 2, 3 );
                result = Integer.valueOf( 6 );
            }
        };
        assertEquals( 6, calculatorService.multiply( 2, 3 ) );
    }
}