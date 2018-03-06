package com.cagri.microservices.currencyexchangeservice;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
public class ExchangeValue {

    @NonNull
    @Id
    private Long id;

    @NonNull
    @Column(name = "currency_from")
    private String from;

    @NonNull
    @Column(name = "currency_to")
    private String to;

    @NonNull
    private BigDecimal conversionMultiple;

    private int port;

}
