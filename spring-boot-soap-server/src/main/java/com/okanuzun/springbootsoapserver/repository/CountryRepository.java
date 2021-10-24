package com.okanuzun.springbootsoapserver.repository;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CountryRepository {
    private static final Map<String, Country> nameToCountry = new HashMap<>(4);
    private static final Map<Currency, Country> currencyToCountry = new HashMap<>(4);

    @PostConstruct
    public void initData() {
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        nameToCountry.put(spain.getName(), spain);
        currencyToCountry.put(spain.getCurrency(), spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        nameToCountry.put(poland.getName(), poland);
        currencyToCountry.put(poland.getCurrency(), poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);

        nameToCountry.put(uk.getName(), uk);
        currencyToCountry.put(uk.getCurrency(), uk);

        Country tr = new Country();
        tr.setName("Turkey");
        tr.setCapital("Ankara");
        tr.setCurrency(Currency.TRY);
        tr.setPopulation(84000000);

        nameToCountry.put(tr.getName(), tr);
        currencyToCountry.put(tr.getCurrency(), tr);
    }

    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return nameToCountry.get(name);
    }

    public Country findCountry(final Currency currency) {
        Assert.notNull(currency, "The country's currency must not be null");
        return currencyToCountry.get(currency);
    }
}
