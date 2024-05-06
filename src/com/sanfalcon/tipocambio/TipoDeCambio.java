package com.sanfalcon.tipocambio;

public class TipoDeCambio {
    private String codigoBaseMoneda;
    private String codigoConversionMoneda;

    private double montoConversion;
    private double tasaDeConversion;
    private double resultadoConversion;

    public TipoDeCambio(String codigoBaseMoneda, String codigoConversionMoneda, double montoConversion, TipoDeCambioExchangeRate tipoDeCambioExchangeRate) {
        this.codigoBaseMoneda = codigoBaseMoneda;
        this.codigoConversionMoneda = codigoConversionMoneda;
        this.montoConversion = montoConversion;
        this.tasaDeConversion = tipoDeCambioExchangeRate.conversion_rate();
        this.resultadoConversion = tipoDeCambioExchangeRate.conversion_result();
    }

    public double getResultadoConversion() {
        return resultadoConversion;
    }

    public String mensaje() {
        String mensaje = "El valor de " + this.montoConversion + " [" + codigoBaseMoneda + "] ";
        mensaje += "corresponde al valor final de " + this.resultadoConversion + " [" + this.codigoConversionMoneda + "]";
        return mensaje;
    }
}
