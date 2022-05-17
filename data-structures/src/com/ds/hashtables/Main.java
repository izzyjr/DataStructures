package com.ds.hashtables;

import com.ds.Employee;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 321);
        Employee marySmith = new Employee("Mary", "Smith", 456);
        Employee mikeWilson = new Employee("Mike", "Wilson", 987);
        Employee billEnd = new Employee("Bill", "End", 986);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put("Jones", janeJones);
        hashtable.put("Doe", johnDoe);
        hashtable.put("Smith", marySmith);
        hashtable.put("Wilson", mikeWilson);
        hashtable.put("End", billEnd);

        hashtable.printHashtable();

        System.out.println("Retrieve key Wilson: " + hashtable.get("wilson"));
    }
}
