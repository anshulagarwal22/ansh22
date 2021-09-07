package com.demo;
//Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively
//by creating two objects of class 'Student'.

class Student1
{
    int  rollSam=1;
    int rollJohn=23;
    long phoneNoSam=8743631332L;
    long phoneNoJohn=9384272727L;
    String adrrSam="delhi";
    String addrJohn="mumbai";
   public static void main(String[] args)
    {
       Student1 sam=new Student1();
       Student1 john=new Student1();
       System.out.println( sam.rollSam);
       System.out.println(john.rollJohn);
       System.out.println(sam.phoneNoSam);
       System.out.println(john.phoneNoJohn);
       System.out.println(sam.adrrSam);
       System.out.println(john.addrJohn);
    }
}
