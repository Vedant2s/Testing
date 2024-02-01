/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calc;

/**
 *
 * @author Admin
 */
public class calculator {
    
    public static int add(int a,int b){
    return a+b;
    }
    public static int mul(int a,int b){
    return a*b;
    }
    public static int div(int a,int b){
    return a/b;
    }
    public static double divd(int a,int b){
    return (double)a/b;
    }
    public static int maxe(int a[]){
    int max=a[0];
        for(int i=0;i<a.length;i++){
             if(a[i]>max)
                 max=a[i];
        }
        return max;
    }

    public static short divd(int[] a1, int b1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void main(){
    }
    
}
