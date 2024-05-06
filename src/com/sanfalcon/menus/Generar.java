package com.sanfalcon.menus;

import com.sanfalcon.menus.items.ConversorMoneda;
import com.sanfalcon.menus.items.Salir;

import java.util.ArrayList;


public class Generar {
    private ArrayList<Menu> list = new ArrayList<>();

    public Generar() {
        ConversorMoneda dolarAPesoAgentino = new ConversorMoneda(list.size() + 1, "Dólar           => Peso Argentino", "USD", "ARS", false);
        list.add(dolarAPesoAgentino);
        ConversorMoneda pesoAgrentinoADolar = new ConversorMoneda(list.size() + 1, "Peso Argentino  => Dólar", "ARS", "USD", false);
        list.add(pesoAgrentinoADolar);
        ConversorMoneda dolarARealBrasilenio = new ConversorMoneda(list.size() + 1, "Dólar           => Real Brasileño", "USD", "BRL", false);
        list.add(dolarARealBrasilenio);
        ConversorMoneda realBrasilenioADolar = new ConversorMoneda(list.size() + 1, "Real Brasileño  => Dólar", "BRL", "USD", false);
        list.add(realBrasilenioADolar);
        ConversorMoneda dolarAPesoColombiano = new ConversorMoneda(list.size() + 1, "Dólar           => Peso Colombiano", "USD", "COP", false);
        list.add(dolarAPesoColombiano);
        ConversorMoneda pesoColombiadoADolar = new ConversorMoneda(list.size() + 1, "Peso Colombiano => Dólar", "COP", "USD", false);
        list.add(pesoColombiadoADolar);
        ConversorMoneda dolarASolesPeruanos = new ConversorMoneda(list.size() + 1, "Dólar            => Soles Peruanos", "USD", "PEN", false);
        list.add(dolarASolesPeruanos);
        ConversorMoneda solesPeruanosADolar = new ConversorMoneda(list.size() + 1, "Soles Peruanos   => Dólar", "PEN", "USD", false);
        list.add(solesPeruanosADolar);
        Salir salir = new Salir(list.size() + 1, "Salir", true);
        list.add(salir);
    }

    public String getListMenu() {
        String menu = """
                ************************************
                Son bienvenidos al conversor de monedas
                """;
        for (Menu menus : list) {
            menu += menus.descripcion() + "\n";
        }
        menu += """
                Elija una opción valida
                ************************************""";
        return menu;
    }

    public ArrayList<Menu> getList() {
        return list;
    }
}
