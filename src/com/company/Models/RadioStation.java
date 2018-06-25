package com.company.Models;

import com.company.Interfaces.Observable;

import java.util.ArrayList;

public class RadioStation implements Observable {
  private String name;
  float frequency;
  private ArrayList<Man> audience ;

  public RadioStation(String name){
      this.name =name;
      audience = new ArrayList<>();

  }
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
                    man.listen(name);
                }
      }
  }

  class Song{
        String name;
        int duarationTima;
  }
}
