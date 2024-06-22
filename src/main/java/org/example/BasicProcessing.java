package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicProcessing {
    public static void main(String[] args) {
        // empid and emp name map
        List<Employee> employees =EmployeeMockData.generateMockData(10);
        Map<Integer,String> employeesMap = employees.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
        //employeesMap.forEach((x,y) -> System.out.println("key :: "+x+" value:: "+y));
        // employees name by depts
        Map<String,Map<Integer,String>> map= employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.toMap(Employee::getId,Employee::getName)));
        map.forEach((x,y) -> {
            System.out.print("department :: "+x);
            y.forEach((a,b) ->System.out.print(" id :: "+a+" name :: "+b));
            System.out.println();
            System.out.println("---------------------------");
        });
        employees.stream().toArray(Employee[]::new);
        System.out.println(IntStream.range(0, 100).parallel().findAny());
        System.out.println(IntStream.range(0, 100).parallel().findFirst());



    }
}
