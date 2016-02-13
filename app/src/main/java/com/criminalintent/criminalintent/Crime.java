package com.criminalintent.criminalintent;


import java.util.UUID;

public class Crime {
//Поля
    private UUID mId;
    private String mTitle;

//Геттеры и сеттеры
    public UUID getId() {return mId;}
    public String getTitle() {return mTitle;}
    public void setTitle(String title) {mTitle = title;}
//Конструктор
    public Crime(){
//        Генерирование уникального идентификатора
        mId = UUID.randomUUID();
    }
}
