package com.company.Interfaces;

import com.company.Models.Man;

public interface Observable {
   void broadcast();
   void addObserver(Observer obs);
   void remObserver(Observer obs);

}
