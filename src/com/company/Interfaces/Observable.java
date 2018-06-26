package com.company.Interfaces;

import com.company.Models.Man;

public interface Observable {
   void onAir();
   void addObserver(Observer obs);
   void remObserver(Observer obs);

}
