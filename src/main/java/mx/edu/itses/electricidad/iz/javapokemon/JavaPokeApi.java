/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itses.electricidad.iz.javapokemon;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author zunig
 */
public class JavaPokeApi {
 public static Set<Pokemon> listaPokemonesGuardados = new HashSet<>();
    public static void main(String[] args) {
       
        FormBuscador objetoFormulario = new FormBuscador();
        objetoFormulario.setVisible(true);
    }
}
