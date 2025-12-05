/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electricidad.iz.javapokemon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import org.json.JSONObject;

/**
 *
 * @author zunig
 */
public class CPokeApi {
    public Pokemon buscarPokemon (String idOrName){
        if(idOrName ==null|| idOrName.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "");
            return null;
        }
        try{
            String pokemonIdOrName = idOrName.toLowerCase();
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/"+ pokemonIdOrName);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            if(conn.getResponseCode()!=200){
                JOptionPane.showMessageDialog(null, "Error, pokemon no encontrado :(");
                return null;
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while((line= reader.readLine())!=null){
                response.append(line);
            }
            reader.close();
            JSONObject jsonobject = new JSONObject(response.toString());
            String name = jsonobject.getString("name");
            int weight = jsonobject.getInt("weight");
            int height = jsonobject.getInt("height");
            int experience = jsonobject.getInt("base_experience");
            String imageUrl = jsonobject.getJSONObject("sprites").getString("front_default");
            
            String capitalizedName = name.substring(0,1).toUpperCase()+
                    name.substring(1);
            return new Pokemon(capitalizedName, weight, height, experience, imageUrl);
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
            return null;
        }
    }
}
