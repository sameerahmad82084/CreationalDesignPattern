package com.ParkingLot.ParkingLot2.CreationalDesignPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingleTon {
    // here can be multiple attributes
    private static SingleTon obj;
    private static final Lock lock=new ReentrantLock();;
    private SingleTon(){

        }
        public static SingleTon getObj(){
        if(obj==null) {
            lock.lock();
            if (obj == null) {
                obj = new SingleTon();
            }
            lock.unlock();
        }

                return obj;


}}
