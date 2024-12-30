package com.vishal.collection;

import java.util.TreeMap;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    int id;
    String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        TreeSet<Student> tree = new TreeSet<>();
        Student zz = new Student(1, "zz");
        tree.add(zz);
        Student bb = new Student(6, "bb");
        tree.add(bb);
        Student yy = new Student(2, "yy");
        tree.add(yy);
        Student www = new Student(3, "www");
        Student aa = new Student(4, "aa");
        tree.add(aa);
        Student ab = new Student(5, "ab");
        tree.add(ab);
        tree.forEach(System.out::println);
        TreeMap<Student,String> treeMap = new TreeMap<>();
        treeMap.put(bb, "Grade B");
        treeMap.put(zz, "Grade A");
        treeMap.put(www, "Grade D");
        treeMap.put(ab, "Grade F");
        treeMap.put(yy, "Grade C");
        treeMap.put(aa, "Grade E");
        treeMap.forEach((k,v)->System.out.println(k+" "+v));
        
    }
}
