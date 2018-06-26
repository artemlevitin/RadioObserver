package com.company.Models;

import com.company.Interfaces.Observer;

import java.io.PrintStream;

public class Man implements Observer {

   private String nameMan;

    public Man(String name) {
        this.nameMan = name;
    }

    @Override
   public void listen(Song song){
        PrintStream printf = System.out.printf("%s listen: %s \n", nameMan, song.nameSong);
    }
}
