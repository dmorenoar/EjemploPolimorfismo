/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejherencia;

/**
 *
 * @author
 */
public class EjHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Monstruo[] listaMonstruos = new Monstruo[2];

        Vampiro pepito = new Vampiro(3, "Pepe", "A+", "Guarida 1");
        Momia juanita = new Momia(3, "Juanita", "Guarida 1");

        listaMonstruos[0] = pepito;
        listaMonstruos[1] = juanita;

        for (int i = 0; i < listaMonstruos.length; i++) {
            
            if (listaMonstruos[i] instanceof Vampiro) {
                //Podría hacer las cosas que le pertocan a vampiro
                Vampiro aux = (Vampiro) listaMonstruos[i];
                
                aux.metodoVampiro();
                
                System.out.println("Soy una momia: " + listaMonstruos[i].getNombre()) ;
            }
                    
                    
        }

    }

}
