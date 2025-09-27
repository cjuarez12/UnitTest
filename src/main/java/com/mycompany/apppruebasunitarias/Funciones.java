package com.mycompany.apppruebasunitarias;

public class Funciones {
    public String concatenarTexto(String a, String b)
    {
        return a.concat(b);
    }
    
    public int sumar (int a, int b){
        return a+b;
    }
    
    public boolean esPositivo (int a){
        return a > 0;
    }
    
    public Object obtenerObjetoNulo(){
        return null;
    }
    
     public Object obtenerObjetoNoNulo(){
        return new Object();
    }
     
    public Object obtenerObjeto(){
        return new Object();
    } 
}