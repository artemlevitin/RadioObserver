package com.company;

import java.util.ArrayList;

public class RadioStation implements Observable  {
  String name;
  float frequency;
  ArrayList<Man> audience;

    @Override
    public void addObserver(Man man) {
        audience.add(man);
    }

    @Override
    public void remObserver(Man man) {
        audience.remove(man);
    }

    @Override
    public void onAir(){
      int countLoop =10;
            for(int i=0;i<countLoop;++i){
         //   broadcast();
                for(Man man : audience){
                    man.listen();
                }
      }
  }

  class Song{
        String name;
        int duarationTima;
  }
}
