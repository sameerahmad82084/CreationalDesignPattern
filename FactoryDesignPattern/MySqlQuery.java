package com.ParkingLot.ParkingLot2.CreationalDesignPattern.FactoryDesignPattern;

public class MySqlQuery implements DbQuery{
    @Override
    public String get(String id) {
        return "MySql Get Query Executed with data: "+id;
    }

    @Override
    public String insert(String data) {
        return "MySql Insert Query Executed with data: "+data;
    }

    @Override
    public String delete(String id) {
        return "MySql Delete Query Executed with id: "+id;
    }

    @Override
    public String update(String data) {
        return "MySql Update Query Executed with data: "+data;
    }
}
