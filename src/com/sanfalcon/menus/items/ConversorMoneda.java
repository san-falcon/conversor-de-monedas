package com.sanfalcon.menus.items;

import com.sanfalcon.consulta.ConsultarTipoDeCambio;
import com.sanfalcon.menus.Menu;
import com.sanfalcon.tipocambio.TipoDeCambio;

public class ConversorMoneda extends Menu {
    private String monedaBase;
    private String monedaConversion;

    public ConversorMoneda(int id, String nombre, String monedaBase, String monedaConversion, boolean finalizar) {
        super(id, nombre, finalizar);
        this.monedaBase = monedaBase;
        this.monedaConversion = monedaConversion;
    }

    @Override
    public String getMonedaBase() {
        return monedaBase;
    }

    @Override
    public String getMonedaConversion() {
        return monedaConversion;
    }
}
