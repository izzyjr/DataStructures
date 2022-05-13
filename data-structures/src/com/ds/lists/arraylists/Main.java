package com.ds.lists.arraylists;

import com.ds.lists.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 321));
        employeeList.add(new Employee("Mary", "Smith", 456));
        employeeList.add(new Employee("Mike", "Wilson", 987));

        employeeList.forEach(employee -> System.out.println(employee.getFirstName()));

        employeeList.remove(3);

        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());
        employeeList.set(1, new Employee("John", "Adams", 222));
        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray) {
            System.out.println("Array: " + employee);
        }

        System.out.println(employeeList.contains(new Employee("Jane", "Jones", 123)));
        System.out.println(employeeList.indexOf(new Employee("Mary", "Smith", 456)));


    }

}
