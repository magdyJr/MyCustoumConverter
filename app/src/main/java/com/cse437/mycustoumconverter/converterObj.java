package com.cse437.mycustoumconverter;

public final class converterObj {
    converterObj(){}
    double converFromFahrenheitToCelsius(double val){
        return (val-32)*(5/9);
    }
    double converFromCelsiusToFahrenheit(double val){
        return (val*9/5)+32;
    }
}
