package com.company;

public interface Observable {
   void addObserver(Man man);
   void remObserver(Man man);
   void onAir();
}
