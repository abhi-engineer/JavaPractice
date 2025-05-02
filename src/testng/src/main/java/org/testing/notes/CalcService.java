package org.testing.notes;

public class CalcService {

    public int sum(int i, int j) {
        return i + j;
    }

    public int divide(int i, int j){
        if(j==0)
            throw new IllegalArgumentException("can't divide by zero");
        return i/j;
    }


}
