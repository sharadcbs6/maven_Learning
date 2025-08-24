package com.example.constructorinj;
import java.util.*;
public class Person {
    private String name;
    private int personid;
    private Character Chars;
   private List<String> phones;
    public Person(String name, int personid,Character Chars,List<String> phones) {
        this.name = name;
        this.personid = personid;
        this.Chars=Chars;
        this.phones=phones;
    }
    @Override
    public String toString() {
        return "Person [name=" + this.name + ", personid=" + this.personid +",character="+this.Chars.Behaviour+",Phones="+this.phones+ "]";
    }
    
    
}
