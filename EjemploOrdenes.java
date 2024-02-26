package com.mycompany.ejemploordenes;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class EjemploOrdenes {
    public static void main(String[] args) {
        int opcion_a = 0,opcion_b = 0,opcion_c = 0,opcion_d,back=1;
        int ress;
        Scanner scanner=new Scanner(System.in);
        String nombre=new String ("");
        String apellido=new String ("");
        
        String title=new String("=====================================================================================\n" +
                                "                    _________                                                                     \n" +
                                "                    \\_   ___ \\  ____   _____ __________________                                    \n" +
                                "                    /    \\  \\/ /  _ \\ /     \\\\____ \\_  __ \\__  \\                                   \n" +
                                "                    \\     \\___(  <_> )  Y Y  \\  |_> >  | \\// __ \\_                                 \n" +
                                "                     \\______  /\\____/|__|_|  /   __/|__|  (____  /                                 \n" +
                                "                            \\/             \\/|__|              \\/                                   \n" +
                                "                                                                                   \n" +
                                "=====================================================================================");
       
        System.out.println(title+"\n");
        nombre=JOptionPane.showInputDialog("Escribe tu nombre");
        apellido=JOptionPane.showInputDialog("Escribe tu apellido");
        int incremento=0;
        Cliente cliente_1=new Cliente();
        cliente_1.setNombre(nombre);
        cliente_1.setApellido(apellido);
        Orden_Compra oc1=new Orden_Compra();
        Producto prod_1=new Producto();
        for (int i = 0; i<12; i++){ 
            incremento++;
            System.out.print("<"+ incremento+">"+prod_1.getFabricante(i)+" "+prod_1.getNombre_producto(i)+"-------$"+prod_1.getPrecio(i)+"\n"); 
        }
        System.out.println("Dato 1->");
        while(back==1){
            try{
                opcion_a=scanner.nextInt();
                if(opcion_a>=0&&opcion_a<=13){
                    oc1.AddProductos(opcion_a-1);
                    back=0;
                }else{
                back=1;
                System.out.println("error al ingresar dato");
                }
            }
            catch(Exception e){
                System.out.println("Error:"+e);
                 System.exit(0);
            }
        }
        System.out.println("Dato 2->");
        back=1;
        while(back==1){
            try{
                opcion_b=scanner.nextInt();
                if(opcion_b>=0&&opcion_b<=13){
                    oc1.AddProductos(opcion_b-1);
                    back=0;
                
                }else{
                back=1;
                System.out.println("error al ingresar dato");
                }
            }
            catch(Exception e){
                System.out.println("Error:"+e);
                 System.exit(0);
            }
        }
        System.out.println("Dato 3->");
        back=1;
        while(back==1){
            try{
                opcion_c=scanner.nextInt();
                if(opcion_c>=0&&opcion_c<=13){
                    oc1.AddProductos(opcion_c-1);
                    back=0;
                
                }else{
                back=1;
                System.out.println("error al ingresar dato");
                }
            }
            catch(Exception e){
                System.out.println("Error:"+e);
                 System.exit(0);
            }
        }
        Cosa co=new Cosa();
        
        oc1.Imprimir_Orden(opcion_a,opcion_b,opcion_c);       
        System.out.println("a");
        
    }
}