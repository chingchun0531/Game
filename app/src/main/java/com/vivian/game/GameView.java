package com.vivian.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
  Shiba shiba;
  Bitmap BitmapShiba;
  Bitmap BitmapShibaNG;
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (shiba ==null){
            shiba = new Shiba(this);
        }
        Paint paint = new Paint();
        BitmapShiba = BitmapFactory.decodeResource(getResources(),R.drawable.shiba_inu);
        BitmapShibaNG = BitmapFactory.decodeResource(getResources(),R.drawable.shiba_ng);
        canvas.drawBitmap(BitmapShiba,shiba.getX(),shiba.getY(),paint);
        Log.d("Game","OnDraw:"+getWidth()+","+getHeight());
    }
    public void moveRight(){
        if(shiba.getX()<getWidth()-200){
            shiba.setDirection(Shiba.DIRECTION_RIGHT);
            invalidate();
        }
    }
    public void moveLeft(){
        if(shiba.getX()>50){
            shiba.setDirection(Shiba.DIRECTION_LEFT);
            invalidate();
        }
    }
    public void moveUp(){
        if(shiba.getY()>50){
            shiba.setDirection(Shiba.DIRECTION_UP);
            invalidate();
        }
    }
    public void moveDown(){
        if(shiba.getY()<getHeight()-200){
            shiba.setDirection(Shiba.DIRECTION_DOWN);
            invalidate();
        }
    }
}



