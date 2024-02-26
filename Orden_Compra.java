package com.mycompany.ejemploordenes;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Orden_Compra{ 
    private int incremento=0;
    private String descripcion;
    private Date fecha=new Date();
    private Cliente cliente=new Cliente();
    private Producto prod=new Producto();
    
    public void Imprimir_Orden(int a,int b,int c){
        ArrayList<Integer> acumm=new ArrayList<Integer>();
        acumm.add(a);
        acumm.add(b);
        acumm.add(c);
        try{
            for(int i=0;i<12;i++){
            incremento++;
            System.out.println("<"+incremento+">"+prod.getFabricante(i)+" "+prod.getNombre_producto(i)+"-------$"+prod.getPrecio(i));
            for(int x=1;x<4;x++)
            {
                if(x==acumm.get(x)){
                System.out.println("(producto agregado)\n");
            }
            else{
                System.out.println("\n");
            }
            }
        }}
        catch(Exception e){
            
        }
        
    }
    public void AddProductos(int numero){
        incremento=0;
        
        System.out.println("Productos disponibles:");
        for (int i = 0; i<12; i++){ 
            incremento++;
            
            System.out.print("<"+ incremento+">"+prod.getFabricante(i)+" "+prod.getNombre_producto(i)+"-------$"+prod.getPrecio(i)); 
            if(i==numero){
                System.out.println("(producto agregado)\n");
            } 
            else{
                System.out.println("\n");
            }
        }
       
        
        
    } 
        
    
    
    
    
}
