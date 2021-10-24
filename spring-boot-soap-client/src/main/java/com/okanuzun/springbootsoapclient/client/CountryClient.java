package com.okanuzun.springbootsoapclient.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import com.okanuzun.springbootsoapclient.wsdl.*;

public class CountryClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(CountryClient.class);

    public GetCountryResponse getCountry(String name) {

        GetCountryByNameRequest request = new GetCountryByNameRequest();
        request.setName(name);

        log.info("Requesting location for " + name);

        return (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/countries", request,
                        new SoapActionCallback(
                                "http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));
    }

    public GetCountryResponse getCountry(Currency currency) {

        GetCountryByCurrencyRequest request = new GetCountryByCurrencyRequest();
        request.setCurrency(currency);

        log.info("Requesting location for " + currency);

        return (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/countries", request,
                        new SoapActionCallback(
                                "http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));
    }
}
