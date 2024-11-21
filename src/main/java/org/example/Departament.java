package org.example;

public class Departament{
    private int id;
    private String name;
    private static int nextId = 1;

    public Departament(int id, String name){
        this.id=id;
        this.name=name;
    }
    public Departament(){
        this.id=nextId++;
        this.name="null";
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

    //set
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}


