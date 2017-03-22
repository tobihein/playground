package org.example.calculator.multiply.impl;

import org.example.calculator.multiply.MultiplyService;

public class MultiplyServiceImpl implements MultiplyService {

    @Override
    public int multiply( final int x, final int y ) {
        return x * x;
    }

}
