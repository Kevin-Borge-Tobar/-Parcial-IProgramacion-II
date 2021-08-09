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
public class Coordenadas {
    private String CoordenadaX  = "";
    private String CoordenadaY  = "";
    private String Nombre = "";
    
    public Coordenadas(){
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    

    public String getCoordenadaX() {
        return CoordenadaX;
    }

    public void setCoordenadaX(String CoordenadaX) {
        this.CoordenadaX = CoordenadaX;
    }

    public String getCoordenadaY() {
        return CoordenadaY;
    }

    public void setCoordenadaY(String CoordenadaY) {
        this.CoordenadaY = CoordenadaY;
    }
    
    
}
