package com.company.Models;

import com.company.Interfaces.Observable;
import com.company.Interfaces.Observer;

import java.util.ArrayList;

public class RadioStation implements Observable {
  private String name;
  float frequency;
  private ArrayList<Observer> audiences ;
  private ArrayList<Song> songs;
  public RadioStation(String name, float frequency){
      this.name =name;
      this.frequency = frequency;
      audiences = new ArrayList<>();
      songs = new ArrayList<>();
  }

  public void addSongs(Song song){
      songs.add(song);
  }

    @Override
    public void addObserver(Observer obs) {
        audiences.add(obs);
    }

    @Override
    public void remObserver(Observer obs) {
        audiences.remove(obs);
    }
    @Override
    public void onAir(){
        //   broadcast();

            for(Song sng: songs) {
                for (int curTime = 0; curTime <= sng.duaration; ++curTime) {
                    for (Observer obs : audiences) {
                        obs.listen(sng);
                    }
                }
            }

      }


}


