package com.assign2a;

import java.util.*;

public class Asssign2a {


    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        Scanner s=new Scanner(System.in);
        String temp;
        String[] str;
        System.out.println("Enter numbers to insert");

        temp=s.nextLine();
        str=temp.split(" ");
        for(int i=0;i<str.length;i++)
        {
            int tem=Integer.parseInt(str[i]);
            al.add(tem);
        }
        System.out.println("ArrayList=  "+al);
        System.out.println("Enter number to search");
        int num=s.nextInt();
        System.out.println(al.contains(num)+"(contains "+num+")");


    }

}