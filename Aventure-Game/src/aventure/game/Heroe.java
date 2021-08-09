/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aventure.game;

//import java.util.List;

import java.util.List;


/**
 *
 * @author Kevin Borge
 */
public class Heroe extends Personaje implements Ataque {
    private java.util.List<ObjetosMuebles>Mochila;
    
    public Heroe(){
    
    }

    public List<ObjetosMuebles> getMochila() {
        return Mochila;
    }

    public void setMochila(List<ObjetosMuebles> Mochila) {
        this.Mochila = Mochila;
    }

    @Override
    public String Atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

  

    
}
