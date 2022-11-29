/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoArboles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author danieldangelo
 */
public class LecturaArchivos {
    
    String cadena;
    
    public LecturaArchivos(String cadena){
        this.cadena = cadena;
    }
    /**
     * Método que recibe una cadena para luego escribirla en el archivo de texto llamado Arbol.txt
     * @param cadena 
     */
    public void EscribirTxt(String cadena){
        try {
            String ruta = "test//Arbol.txt";
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(this.cadena);
            bw.close();
            JOptionPane.showMessageDialog(null, "La expresión se ha guardado y cargado correctamente. ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Función que lee la expresión que se encuentra en el archivo de texto y regresa el string que se le pasará al arbol como parametro
     * @return String expresionTxt
     */
    public String LeerTxt() {
        String linea;
        String expresionTxt = "";
        String ruta = "test//Arbol.txt";
        File file = new File(ruta);
        try{
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((linea = br.readLine()) != null){
                    if(!linea.isEmpty()){
                        expresionTxt += linea;
                    }
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al leer la expresión. ");
        }
        return expresionTxt;
        
    }
}
