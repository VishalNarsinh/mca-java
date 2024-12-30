package com.vishal.io;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class DemoStringbufferBuilder {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        String s1=new String("MCA");
//        concat1(s1);
//        StringBuffer s2=new StringBuffer("MCA");
//        concat2(s2);
//        StringBuilder s3=new StringBuilder("MCA");
//        concat3(s3);
//        ArrayList<Integer> al  = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>(new MyOrder());
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println(set);
    }
    public static void concat1(String s)
    {
        s.concat("College ");
        System.out.println(s);
    }
    public static void concat2(StringBuffer s)
    {
        s.append("College");
        System.out.println(s);
    }
    public static void concat3(StringBuilder s)
    {
        s.append("College ");
        System.out.println(s);
    }
}
class MyOrder implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}