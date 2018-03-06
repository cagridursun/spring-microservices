package com.cagri.microservices.currencyconversionservice;

import lombok.*;

import java.math.BigDecimal;

/**
 * Created by Çağrı on 17.01.2018.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CurrencyConversionBean {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int port;
}
