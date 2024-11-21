package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Person {
    private int id;
    private String name;
    private String gender;
    private Departament departament;
    private double salary;
    private Date dateOfBirth;

    public Person(int id, String name, String gender, Departament departament, double salary, Date dateOfBirth)
    {
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.departament=departament;
        this.salary=salary;
        this.dateOfBirth=dateOfBirth;
    }
    public Person()
    {
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.departament=departament;
        this.salary=salary;
        this.dateOfBirth=dateOfBirth;
    }
    //get
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    public Departament getDepartament()
    {
        return departament;
    }
    public double getSalary()
    {
        return salary;
    }
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    //set
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public void setDepartament(Departament departament)
    {
        this.departament=departament;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth=dateOfBirth;
    }
}