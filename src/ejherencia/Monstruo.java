/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejherencia;

/**
 *
 * @author Clase Padre
 */
public class Monstruo {
    private int vidas;
    private String nombre;
    private String cueva;
    
    public Monstruo(int vidas, String nombre,String cueva) {
        this.vidas = vidas;
        this.nombre = nombre;
        this.cueva = cueva;
    }

    public Monstruo(){}
    
    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void saludar(String saludo){
        System.out.println("Hola soy desde monstruo" + saludo);
    }
  
}
