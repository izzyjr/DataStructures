package com.ds.hashtables;

import com.ds.Employee;

public class SimpleHashtable {

    private Employee[] hashtable;

    public SimpleHashtable() {
        this.hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null) {
            System.out.println("There's already an employee at position: " + hashedKey + " for last name: " + key);
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        return hashtable[hashKey(key)];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
