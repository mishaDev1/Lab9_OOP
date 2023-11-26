package com.example.demo.Filter;

import com.example.demo.Entities.Thing;

public class PriceFilter implements Filter {
    private int maxVal;


    public PriceFilter(int maxVal){
        this.maxVal = maxVal;
    }
    @Override
    public boolean match(Thing thing) {
        if (thing.getPrice() <= maxVal ){
            return true;
        }
        return false;
    }
    
}
