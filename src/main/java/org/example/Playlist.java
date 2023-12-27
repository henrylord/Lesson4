package org.example;

import java.util.ArrayList;

public class Playlist {
    ArrayList<String> songList = new ArrayList<String>();
    public void addSong(String songName){

        songList.add(songName);

    }

    public void removeSong(String songName){

        for(int i=0; i<songList.size(); i++){

            if (songList.get(i).equals(songName)){

                songList.remove(i);
                break;
            }
        }
    }

    public void songListDisplay(){

        for (String i: songList){
            System.out.println(i);
        }
    }

    public void randomSong(){

            int index = (int)(Math.random() *songList.size());

            System.out.println(songList.get(index));

    }
}




