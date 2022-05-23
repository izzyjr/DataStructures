package com.ds.hashtables;

import com.ds.Employee;

public class Main {

    public static void main(String[] args) {

        StoredEmployee janeJones = new StoredEmployee("Jones", new Employee("Jane", "Jones", 123));
        StoredEmployee johnDoe = new StoredEmployee("Doe", new Employee("John", "Doe", 321));
        StoredEmployee marySmith = new StoredEmployee("Smith", new Employee("Mary", "Smith", 456));
        StoredEmployee mikeWilson = new StoredEmployee("Wilson", new Employee("Mike", "Wilson", 987));
        StoredEmployee billEnd = new StoredEmployee("End", new Employee("Bill", "End", 986));


        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put("Jones", janeJones.employee);
        hashtable.put("Doe", johnDoe.employee);
        hashtable.put("Smith", marySmith.employee);
        hashtable.put("Wilson", mikeWilson.employee);


        System.out.println("Retrieve key Wilson: " + hashtable.get("Wilson"));
        System.out.println("Retrieve key Smith: " + hashtable.get("Smith"));

        hashtable.remove("Wilson");
        hashtable.remove("Jones");
        hashtable.printHashtable();

        System.out.println("Retrieve key Smith: " + hashtable.get("Smith"));

        // *********************************************** - CHAINED HASHTABLE - ********************************************************

        System.out.println("****************************** - CHAINED HASHTABLE - ***************************************************");

        ChainedHashtable ht = new ChainedHashtable();
        ht.put("Jones", janeJones.employee);
        ht.put("Doe", johnDoe.employee);
        ht.put("Wilson", mikeWilson.employee);
        ht.put("Smith", marySmith.employee);

        ht.printHashtable();

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Doe");
        ht.remove("Jones");
        ht.printHashtable();

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
    }
}
