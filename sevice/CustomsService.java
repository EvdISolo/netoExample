package ru.netology.sevice;


public class CustomsService {
    public static int calculateCustoms( int price,int weight) {
        int Customs =  price/100+weight * 3;
        return Customs;
    }


    }

