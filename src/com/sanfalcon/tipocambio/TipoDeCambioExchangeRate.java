package com.sanfalcon.tipocambio;

public record TipoDeCambioExchangeRate(String result,
                                       String base_code,
                                       String target_code,
                                       double conversion_rate,
                                       double conversion_result) {
}
