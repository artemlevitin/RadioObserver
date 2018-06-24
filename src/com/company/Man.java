package com.company;

public class Man implements Observer {

   private String name;

   @Override
   public void listen(){
        System.out.printf( "I'm %s",name);
    }
}
