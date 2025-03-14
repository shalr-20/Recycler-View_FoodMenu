package com.tweak.recyclerview.Models;

public class RecipeModel {
    int pic;  //image is stored in the binary format
    String text;

    public RecipeModel(int pic, String text) {   //parameterized constructor
        this.pic = pic;
        this.text = text;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
