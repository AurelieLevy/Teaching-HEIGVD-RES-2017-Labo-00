/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author aurel
 */
interface IInstrument {

    public String play();
    public int getSoundVolume();
    public String getColor();
}

public class Trumpet implements IInstrument {

    public String play() {
        return "pouet";
    }

    public int getSoundVolume() {
        return 5;
    }
    public String getColor(){
        return "golden";
    }
}

class Flute implements IInstrument {
    public String play() {
        return "tuuut";
    }
    public int getSoundVolume() {
        return 3;
    }
    public String getColor(){
        return "wood";
    }
}
