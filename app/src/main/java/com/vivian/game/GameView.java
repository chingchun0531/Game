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
   private float posX,posY =400;



    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Paint paint1 = new Paint();
        paint1.setColor(0);
        canvas.drawLine(400,0,0,300,paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.shiba);
        canvas.drawBitmap(bitmap,posX,posY,paint);
        Log.d("Game","OnDraw:"+getWidth()+","+getHeight());
    }
    public float getPosX() {
        return posX;
    }
    public void setPosX(float posX) {
        if (posX > 0 && posX < getWidth() - 100) {
            this.posX = posX;
        }
    }
    public float getPosY() {
        return posY;
    }
    public void setPosY(float posY){
        if (posY > 0 && posY < getHeight() - 100) {
            this.posY = posY;
        }
    }
}
