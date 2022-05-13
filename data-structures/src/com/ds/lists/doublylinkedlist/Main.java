package com.ds.lists.doublylinkedlist;

import com.ds.lists.Employee;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new  Employee("Jane", "Jones", 444);
        Employee johnDoe = new Employee("John", "Doe", 777);
        Employee marySmith =  new Employee("Mary", "Smith", 999);
        Employee mikeWilson = new Employee("Mike", "Wilson", 111);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(janeJones);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        Employee danzig = new Employee("Glenn", "Danzig", 234);

        list.addToEnd(danzig);
        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
    }

}
