package com.mycompany.ejemploordenes;

import java.util.ArrayList;

public  class Cliente {
    //atributos
    private String nombre=new String("");
    private String apellido= new String("");  
    
//constructor
    
    //asignacion_de_valor_a_la_variable_nombre clase->Cliete
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //sustraccion_de_valor_de_la_variable_nombre clase->Cliete
    public String getNombre(){
        return nombre;
    }
    //asignacion_de_valor_a_la_variable_apellido clase->Cliete
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    //sustraccion_de_valor_de_la_variable_apellido clase->Cliete
    public String getApellido(){
        return apellido;
    }
    //metodo
    public void Mostrar(){
        System.out.println(nombre+" "+apellido);
    }
    
    
}
