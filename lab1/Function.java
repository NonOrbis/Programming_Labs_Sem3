//Made by Orbis (A.K. 7 group)
package com.lab1;

public class Function {
    public int k;
    public double x;

    public void setK(int k){
        this.k = k;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getK(){
        return k;
    }

    public double getX(){
        return x;
    }

    public double MathFunc(){
        return Math.log(1 + x);
    }

    public double logX() throws Exception{
        if (x<=-1 || x>1) {
            throw new Exception("Wrong input data, try again");
        }
        double result = 0;
        double num = -x;
        int denomin = 1;
        while (Math.abs(num) > Math.pow(10,-k)){
            result += (num / denomin);
            num *= -x;
            denomin++;
        }
        return result;
    }
}