package com.example.constructorinj;

public class Person {
    private String name;
    private int personid;
    public Person(String name, int personid) {
        this.name = name;
        this.personid = personid;
    }
    @Override
    public String toString() {
        return "Person [name=" + this.name + ", personid=" + this.personid + "]";
    }
    
    
}
