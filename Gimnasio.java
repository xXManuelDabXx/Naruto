package Gimnasio;

import java.util.Date;

public class Gimnasio {

    private String administrador;
    private int servicios;
    private String precio;
    private Date fecha;
    private Boolean sedes;

        public Gimnasio(    
            String administrador,
            int servicios,
            String precio,
            Date fecha,
            Boolean sedes) {
        this.administrador = administrador;
        this.servicios = servicios;
        this.precio = precio;
        this.fecha = fecha;
        this.sedes = sedes;
    }
   
    public void abrirMancuernas(){
        this.servicios += 20;
        this.precio  += 45000;
        this.sedes = true;
    }
     
    public void cambiarDeDueño(
            String nuevoDueno, 
            String nuevoPrecio){
        this.administrador = nuevoDueno;
        this.precio = nuevoPrecio;          
    }

    public String cambiarPlanta() {
        return administrador;
    }

    public void nuevoDueno(String duenoDeLaTienda) {
        this.administrador = nuevoDueno;
    }
    
    public void nuevoServicio(String no se) {
        this.servicios = nuevoServicio
    }
    
    public int nuevoServicio() {
        return servicios;
    }
    
    public int masPrecio() {
        return precio;
    }

    public void masPrecio(int precios) {
        this.precio = precio;
    }
   
    public static void main(String[] args) {
        Gimnasio gimnasio = new Gimnasio(80, 8500, "No", true);
         
         System.out.println(Gimnasio.abrirMancuernas());
         System.out.println(Gimnasio.cambiarPlanta());
         System.out.println(Gimnasio.nuevoDueno());
         System.out.println(Gimnasio.nuevoServicio());
         System.out.println(Gimnasio.masPrecio());
  
         Gimnasio.nuevoDueno();
                  
         System.out.println(Gimnasio.abrirMancuernas());
         System.out.println(Gimnasio.cambiarPlanta());
         System.out.println(Gimnasio.nuevoDueno());
         System.out.println(Gimnasio.nuevoServicio());
         System.out.println(Gimnasio.masPrecio());
        
         
    }
   
}
