package com.sanfalcon.menus;

public class Menu {
    private int id;
    private String nombre;
    private boolean finalizar;

    public Menu(int id, String nombre, boolean finalizar) {
        this.id = id;
        this.nombre = nombre;
        this.finalizar = finalizar;
    }

    public String descripcion() {
        return this.id + ") " + this.nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isFinalizar() {
        return finalizar;
    }

    public String getMonedaBase() {
        return "";
    }

    public String getMonedaConversion() {
        return "";
    }
}



