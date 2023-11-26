package com.example.demo.Filter;

import com.example.demo.Entities.Thing;

public interface Filter{
boolean match(Thing thing);
}