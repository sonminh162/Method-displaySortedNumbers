package com.company;

import java.util.Scanner;



public class Main {
    public static void displaySortedNumbers(int a, int b, int c){
        if(b<a){
            if(c<b)System.out.print(c+" "+b+" "+a);
            else if(c<a)System.out.print(b+" "+c+" "+a);
            else System.out.print(b+" "+a+" "+c);
        }
        if(a<b){
            if(c<a)System.out.print(c+" "+a+" "+b);
            else if(b<c)System.out.print(a+" "+b+" "+c);
            else System.out.print(a+" "+c+" "+b);
        }
    }
    public static void main(String[] args){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao lan luot 3 gia tri a, b, c:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        displaySortedNumbers(a,b,c);
    }
}
