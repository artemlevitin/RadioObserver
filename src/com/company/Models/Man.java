package com.company.Models;

import com.company.Interfaces.Observer;

import java.io.PrintStream;

public class Man implements Observer {

   private String nameMan;

    public Man(String name) {
        this.nameMan =name;
    }

    @Override
   public void listen(String str){
        PrintStream printf = System.out.printf("I'm %s and listen %s", nameMan, str);
    }
}
