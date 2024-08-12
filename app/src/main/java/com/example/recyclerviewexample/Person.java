package com.example.recyclerviewexample;

public class Person {
    private String Name;
    private String Description;
    public Person(){
        Name="No Name";
        Description="Nothing";
    }
    public Person(String name,String description){
        Name=name;
        Description=description;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name=name;
    }
    public String getDescription(){
        return Description;
    }
    public void setDescription(String description){
        Description=description;
    }
}
