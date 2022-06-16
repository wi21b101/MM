package com.example.mm;

public class MM {

    public String status(){
        return "Everything is fine";
    }

    public String set(double a){
        if (a >= 99.95){
            return "Everything is fine";
        } else{
            return "Error";
        }
    }
}
