package com.mycompany.ejemploordenes;
import java.util.ArrayList;
import java.util.List;
public class Producto{
    private List<String> fabricante= new ArrayList<String>();
    private List<String> nombre_producto= new ArrayList<String>();
    private ArrayList<Integer> precio=new ArrayList<Integer>();
    public Producto(){
        //PRODUCTO 1
        fabricante.add("Marinela");
        nombre_producto.add("Gansito---");
        precio.add(20);
        //PRODUCTO 2
        fabricante.add("Marinela");
        nombre_producto.add("Pinwinitos");
        precio.add(22);
        //PRODUCTO 3
        fabricante.add("Bimbo   ");
        nombre_producto.add("Donitas---");   
        precio.add(18);
        //PRODUCTO 4
        fabricante.add("Bimbo   ");
        nombre_producto.add("Nito------");
        precio.add(16);
        //PRODUCTO 5
        fabricante.add("Cocacola");
        nombre_producto.add("Cocacola--");
        precio.add(17);
        //PRODUCTO 6
        fabricante.add("Sabritas");
        nombre_producto.add("Especies--");
        precio.add(12);
        //PRODUCTO 7
        fabricante.add("Sabritas");
        nombre_producto.add("Naturales-");
        precio.add(12);
        //PRODUCTO 7
        fabricante.add("Sabritas");
        nombre_producto.add("Adobadas--");
        precio.add(12);
        //PRODUCTO 8
        fabricante.add("Sabritas");
        nombre_producto.add("Limon-----");
        precio.add(12);
        //PRODUCTO 9
        fabricante.add("Chips   ");
        nombre_producto.add("Moradas xd");
        precio.add(15);
        //PRODUCTO 10
        fabricante.add("Sabritas");
        nombre_producto.add("Especies--");
        precio.add(12);
        //PRODUCTO 11
        fabricante.add("Jumex   ");
        nombre_producto.add("Jugo------");
        precio.add(25);
        //PRODUCTO 12
        fabricante.add("Volt    ");
        nombre_producto.add("rojo xd?--");
        precio.add(19);
    }
    //sustraccion_de_valor_de_la_variable_fabricante,nombre_productos,precio clase->Produto
    public String getFabricante(int x){
            
        return fabricante.get(x);
    }
    public String getNombre_producto(int x){
        return nombre_producto.get(x);
    }
    public int getPrecio(int x){
        return precio.get(x);
    }
}
