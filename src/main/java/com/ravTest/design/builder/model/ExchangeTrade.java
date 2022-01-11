package com.ravTest.design.builder.model;

public class ExchangeTrade implements Trade{
    @Override
    public String setPrdType() {
        return "exchange";
    }

    @Override
    public String setTranType() {
        return "UPI";
    }
}
