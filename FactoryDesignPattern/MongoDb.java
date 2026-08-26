package com.ParkingLot.ParkingLot2.CreationalDesignPattern.FactoryDesignPattern;

import javax.management.Query;

public class MongoDb implements DbConnection{
    @Override
    public String connectDb(String username, String password, String url) {
        return "Connected to Mongo Database:Username "+username+" Password "+password+" Url "+url;
    }

    @Override
    public MongoDbQuery executeQuery() {
        return new MongoDbQuery();
    }
}
