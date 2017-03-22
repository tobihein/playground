package org.example.calculator.impl;

import org.example.calculator.CalculatorService;
import org.example.calculator.multiply.MultiplyService;

public class CalculatorServiceImpl implements CalculatorService {
    private MultiplyService multiplyService;

    public void bind( final MultiplyService multiplyService ) {
        this.multiplyService = multiplyService;
    }

    public void unbind( final MultiplyService multiplyService ) {
        if( this.multiplyService == multiplyService ) {
            this.multiplyService = null;
        }
    }

    @Override
    public int multiply( final int x, final int y ) {
        return multiplyService.multiply( x, y );
    }

}
