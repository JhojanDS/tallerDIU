/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Estudiante
 */
public class GestionIdiomas extends Properties {
    
    public GestionIdiomas(String idioma) 
    {
        switch(idioma)
        {
            case "Español":
                getProperties("español.properties");
                break;
            case "Inglés":
                getProperties("ingles.properties");
                break;
            default:
                getProperties("español.properties");
        }        
    }
    
    public void getProperties(String idioma)
    {
        try {
            this.load(getClass().getResourceAsStream(idioma));
        } catch (IOException e) {
            System.out.println("Error GestionIdiomas "+e.getMessage());
        }
    }
    
}
