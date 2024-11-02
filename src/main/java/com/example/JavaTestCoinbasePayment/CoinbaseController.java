package com.example.JavaTestCoinbasePayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/coinbase")
public class CoinbaseController {

    @Autowired
    private CoinbaseService coinbaseService;

    @PostMapping("/buy")
    public Mono<String> buyStablecoin(@RequestParam String accountId, 
                                      @RequestParam Double amount, 
                                      @RequestParam String currency) {
        return coinbaseService.buyStablecoin(accountId, amount, currency);
    }

    @PostMapping("/transfer")
    public Mono<String> transferStablecoin(@RequestParam String fromAccountId,
                                           @RequestParam String toAddress,
                                           @RequestParam Double amount,
                                           @RequestParam String currency) {
        return coinbaseService.transferStablecoin(fromAccountId, toAddress, amount, currency);
    }

    @PostMapping("/sell")
    public Mono<String> sellStablecoin(@RequestParam String accountId, 
                                       @RequestParam Double amount, 
                                       @RequestParam String currency) {
        return coinbaseService.sellStablecoin(accountId, amount, currency);
    }
}
