package com.ds.lists.jdk;

import com.ds.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new  Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 321);
        Employee marySmith =  new Employee("Mary", "Smith", 456);
        Employee mikeWilson = new Employee("Mike", "Wilson", 987);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("*********************************************************************");

        Employee coreyTaylor = new Employee("Corey", "Taylor", 123);
        list.addLast(coreyTaylor);

        list.removeFirst();

        System.out.println(list.size());

        for (Employee employee: list) {
            System.out.println(employee);
        }

    }

}
