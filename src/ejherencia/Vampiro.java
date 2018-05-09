/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejherencia;

/**
 *
 * @author Clase hijo de la clase Monstruo
 */
public class Vampiro extends Monstruo{
    
    private String tipoSangre;

    public Vampiro(int vidas, String nombre,String cueva, String tipoSangre ) {
        super(vidas, nombre, cueva);
        this.tipoSangre = tipoSangre;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
/*
    @Override
    public void saludar() {
        System.out.println("Hola me llamo: " + this.getNombre());
    }
*/

    @Override
    public void saludar(String saludo) {
        super.saludar("Hola yo soy desde vampiro: " + saludo); //To change body of generated methods, choose Tools | Templates.
       // System.out.println("Hola ahora soy el Vampiro");
    }
  
    public void metodoVampiro(){
        System.out.println("Vampiro");
               
    }
    
    
}
