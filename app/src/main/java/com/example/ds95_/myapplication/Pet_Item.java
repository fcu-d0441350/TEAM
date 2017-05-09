package com.example.ds95_.myapplication;

/**
 * Created by ds95_ on 2017/5/9.
 */

public class Pet_Item {
    public Pet_Item(int pet_Img, String text) {
        Pet_Img = pet_Img;
        Text = text;
    }

    public int getPet_Img() {
        return Pet_Img;
    }

    public void setPet_Img(int pet_Img) {
        Pet_Img = pet_Img;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    private int Pet_Img;
    private String Text;
}
