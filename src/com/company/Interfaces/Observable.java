package com.company.Interfaces;

import com.company.Models.Man;

public interface Observable {
   void addObserver(Man man);
   void remObserver(Man man);
   void onAir();
}
