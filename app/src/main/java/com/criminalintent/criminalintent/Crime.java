package com.criminalintent.criminalintent;


import java.util.UUID;

public class Crime {
    private UUID mId;
    public UUID getId() {return mId;}


    private String mTitle;
    public String getTitle() {return mTitle;}
    public void setTitle(String title) {mTitle = title;}

    public Crime(){
//        Генерирование уникального идентификатора
        mId = UUID.randomUUID();
    }
}
