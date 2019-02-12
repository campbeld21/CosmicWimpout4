package com.example.cosmicwimpout4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class DrawDice extends SurfaceView {

    public DrawDice(Context context) {
        super(context);
        init();
    }


    public DrawDice(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DrawDice(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public DrawDice(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init(){
        setWillNotDraw(false);
    }

    @Override
    protected void onDraw(Canvas canvas){
        Bitmap dieImage = BitmapFactory.decodeResource(getResources(), R.drawable.wimpoutdice);
        Bitmap bigDieImage = Bitmap.createScaledBitmap(dieImage,800, 500, false);
        canvas.drawBitmap(bigDieImage, 550.0f, 175.0f, null);
    }
}
