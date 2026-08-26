package com.ParkingLot.ParkingLot2.CreationalDesignPattern.FactoryDesignPattern;

import javax.management.Query;

public interface DbConnection {
    String connectDb(String username,String password,String url);
    DbQuery executeQuery();
}
