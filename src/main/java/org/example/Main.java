package org.example;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        PersonReader personReader = new PersonReader();
        List<Person> people = personReader.readCsvFile("foreign_names.csv", ";");

        for (Person person : people)
        {
            System.out.println("Person ID: " + person.getId());
            System.out.println("Name: " + person.getName());
            System.out.println("Gender: " + person.getGender());
            System.out.println("Birth Date: " + person.getDateOfBirth());
            System.out.println("Department: " + person.getDepartament().getId()+ person.getDepartament().getName());
            System.out.println("Salary: " + person.getSalary());
            System.out.println("------------------------------");
        }
    }
}