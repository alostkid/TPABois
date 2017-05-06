package com.example.android.talonsparkouradventure.Game.Game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.android.talonsparkouradventure.R;

/**
 * Created by Gavin Ham on 5/6/2017.
 */

abstract class AbstractObject {
    //Bitmap to get character from image
    protected Bitmap bitmap;
    //coordinates
    protected int x;
    protected int y;

    AbstractObject(Context context) {
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.cute_talon_icon);
        y = 50;
        x = 75;
    }

    //Method to update coordinate of character
    public abstract void update();

    /*
        * These are getters you can generate it autmaticallyl
        * right click on editor -> generate -> getters
        * */
    public Bitmap getBitmap() {
        return bitmap;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
