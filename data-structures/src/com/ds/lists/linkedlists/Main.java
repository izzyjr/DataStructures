package com.ds.lists.linkedlists;

import com.ds.Employee;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new  Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 321);
        Employee marySmith =  new Employee("Mary", "Smith", 456);
        Employee mikeWilson = new Employee("Mike", "Wilson", 987);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());

        list.removeFromFront();

        list.printList();

        System.out.println(list.getSize());
    }

}
