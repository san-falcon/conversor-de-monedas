package com.sanfalcon.consulta;

import com.google.gson.Gson;
import com.sanfalcon.tipocambio.TipoDeCambio;
import com.sanfalcon.tipocambio.TipoDeCambioExchangeRate;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarTipoDeCambio {

    public TipoDeCambio consultar(String codigoMonedaBase, String codigoMonedaCambio, double montoConversion) {

        HttpClient client = HttpClient.newHttpClient();
        URI urlConsulta = URI.create("https://v6.exchangerate-api.com/v6/80a82cf0bf52fa0b4c276211/pair/" + codigoMonedaBase + "/" + codigoMonedaCambio + "/" + montoConversion);

        HttpRequest request = HttpRequest
                .newBuilder(urlConsulta)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            TipoDeCambioExchangeRate tipoDeCambioExchangeRate = new Gson().fromJson(response.body(), TipoDeCambioExchangeRate.class);
            return new TipoDeCambio(codigoMonedaBase, codigoMonedaCambio, montoConversion, tipoDeCambioExchangeRate);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
