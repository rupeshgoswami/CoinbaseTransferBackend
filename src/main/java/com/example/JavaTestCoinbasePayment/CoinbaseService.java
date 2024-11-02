package com.example.JavaTestCoinbasePayment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CoinbaseService {
    
    private final WebClient webClient;

    public CoinbaseService(@Value("${coinbase.api.url}") String apiUrl,
                           @Value("${coinbase.api.key}") String apiKey,
                           @Value("${coinbase.api.secret}") String apiSecret) {
        this.webClient = WebClient.builder()
                .baseUrl(apiUrl)
                .defaultHeader("CB-ACCESS-KEY", apiKey)
                .defaultHeader("CB-ACCESS-SIGN", apiSecret)
                .build();
    }

    public Mono<String> buyStablecoin(String accountId, Double amount, String currency) {
        return webClient.post()
                .uri("/accounts/" + accountId + "/buys")
                .bodyValue("{\"amount\":\"" + amount + "\", \"currency\":\"" + currency + "\"}")
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> transferStablecoin(String fromAccountId, String toAddress, Double amount, String currency) {
        return webClient.post()
                .uri("/accounts/" + fromAccountId + "/transactions")
                .bodyValue("{\"to\":\"" + toAddress + "\", \"amount\":\"" + amount + "\", \"currency\":\"" + currency + "\"}")
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> sellStablecoin(String accountId, Double amount, String currency) {
        return webClient.post()
                .uri("/accounts/" + accountId + "/sells")
                .bodyValue("{\"amount\":\"" + amount + "\", \"currency\":\"" + currency + "\"}")
                .retrieve()
                .bodyToMono(String.class);
    }
}
