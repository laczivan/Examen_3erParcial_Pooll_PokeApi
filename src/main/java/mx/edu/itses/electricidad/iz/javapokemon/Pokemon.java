/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.javapokemon;

import java.util.Objects;

/**
 *
 * @author zunig
 */
public class Pokemon {
    private String nombre;
    private int peso;
    private int altura;
    private int experienciaBase;
    private String imageUrl;

    public Pokemon(String nombre, int peso, int altura, int experienciaBase, String imageUrl) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.experienciaBase = experienciaBase;
        this.imageUrl = imageUrl;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public int getExperienciaBase() {
        return experienciaBase;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    
    @Override
    public boolean equals(Object o){
        if(this ==o)
            return true;
        if(o==null|| getClass() !=o.getClass())
            return false;
        Pokemon pokemon = (Pokemon)o;
        return Objects.equals(nombre, pokemon.nombre);
    }
    @Override
    public int hashCode(){
        return Objects.hash(nombre);
    }
    
}
