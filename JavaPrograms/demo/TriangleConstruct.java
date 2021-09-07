package com.demo;

//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
//by creating a class named 'Triangle' with constructor having the three sides as its parameters.

class TriangleConstruct
{
    int a1,a2,a3;
    public TriangleConstruct(int side1,int side2,int side3)
     {
        a1=side1;
        a2=side2;
        a3=side3;
     }
       public static void main(String[] args)
       {
             TriangleConstruct t1=new TriangleConstruct(3,4,5);
             
             int P=(t1.a1+t1.a2+t1.a3);
             
             System.out.println("perimeter is:"+P);
             
             int sp=(P/2);
             
             int ar=((((sp*(sp-t1.a1))*(sp-t1.a2))*(sp-t1.a3)));       
             
             int area=(int)Math.sqrt(ar);   
             
             System.out.println("Area is:"+area);
        }
}