package com.sanfalcon.menus.items;

import com.sanfalcon.menus.Menu;

public class Salir extends Menu {

    public Salir(int id, String nombre, boolean finalizar) {
        super(id, nombre, finalizar);
    }

    public boolean init(){
        return true;
    }
}
