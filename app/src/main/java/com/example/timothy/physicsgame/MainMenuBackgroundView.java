package com.example.timothy.physicsgame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.example.timothy.physicsgame.CelestialObjects.Planet;
import com.example.timothy.physicsgame.CelestialObjects.Sun;

import java.util.Random;

public class MainMenuBackgroundView extends View {

    private Paint _easel    = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Random _random  = new Random();

    private Planet[] planets;
    private Sun sun;


    public MainMenuBackgroundView(Context context) {
        super(context);
        init(null, 0);
    }

    public MainMenuBackgroundView(Context context, AttributeSet attributes) {
        super(context, attributes);
        init(attributes, 0);
    }

    public MainMenuBackgroundView(Context context, AttributeSet attributes, int defStyle) {
        super(context, attributes);
        init(attributes, defStyle);
    }

    public void init(AttributeSet attrs, int defStyle) {
        _easel.setColor(Color.BLUE);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int xCoordinate = _random.nextInt(getWidth());
        int yCoordinate = _random.nextInt(getHeight());
        canvas.drawLine(0, 0, xCoordinate, yCoordinate, _easel);
    }
}
