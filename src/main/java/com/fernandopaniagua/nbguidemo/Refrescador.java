package com.fernandopaniagua.nbguidemo;

public class Refrescador extends Thread {
    private App app;
    public Refrescador(App app){
        this.app = app;
    }
    
    @Override
    public void run() {
        while(true){
            System.out.println("Refrescando...");
            try {
                //Llamar al método recuperarEmpleados de App.java
                Thread.sleep(5000);
                app.recuperarEmpleados();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
