package com.my.app;

/**
 * Created by david on 6/4/16.
 */
public class Show {
    private String instrument;
    private String song;

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String guitarSong(){
        return "More Than Words";
    }
    public void present(){
        System.out.println("Playing " + song + " with instrument " + instrument);
    }
}
