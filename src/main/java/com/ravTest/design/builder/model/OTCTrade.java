package com.ravTest.design.builder.model;

public class OTCTrade implements Trade{
    @Override
    public String setPrdType() {
        return "FX-COM";
    }

    @Override
    public String setTranType() {
        return "S2B";
    }
}
