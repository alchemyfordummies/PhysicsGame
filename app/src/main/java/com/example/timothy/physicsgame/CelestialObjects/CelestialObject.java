package com.example.timothy.physicsgame.CelestialObjects;

import android.graphics.Color;
import java.util.Random;
import java.util.UUID;

public abstract class CelestialObject {
    static {
        System.loadLibrary("celestialObject");
    }

    protected int weight;

    protected double gravity;
    protected double speed;
    protected double radius;

    protected String id;

    protected Color color;

    protected Random random;

    public CelestialObject(double initialSpeed, int seed) {
        speed = initialSpeed;
        id = UUID.randomUUID().toString();
        init(seed);
    }

    protected void init(int seed) {
        random = new Random();
        color = Color.valueOf(random.nextFloat(), random.nextFloat(), random.nextFloat());
        weight = random.nextInt(seed);
        gravity = random.nextDouble() / calcGravitySeed(seed);
        radius = random.nextDouble() / calcRadiusSeed(seed);
    }

    protected double calcGravitySeed(int seed) {
        return 2.6;
    }

    protected double calcRadiusSeed(int seed) {
        return 1.7;
    }
}
