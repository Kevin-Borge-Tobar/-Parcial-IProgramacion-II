/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aventure.game;

/**
 *
 * @author Kevin Borge
 */
public class  ObjetosMuebles extends Coordenadas{
    private int energia;
    private  int potenciador;
    private int danno;
    
    
    ObjetosMuebles(){
    energia = 0;
    potenciador = 0;
    danno = 0;
    
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getPotenciador() {
        return potenciador;
    }

    public void setPotenciador(int potenciador) {
        this.potenciador = potenciador;
    }

    public int getDanno() {
        return danno;
    }

    public void setDanno(int danno) {
        this.danno = danno;
    }
}
