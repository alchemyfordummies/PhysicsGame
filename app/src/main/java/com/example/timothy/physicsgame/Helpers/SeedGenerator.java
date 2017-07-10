package com.example.timothy.physicsgame.Helpers;

import com.example.timothy.physicsgame.CelestialObjects.CelestialObjectEnum;
import com.example.timothy.physicsgame.Globals;

import java.util.Random;

public class SeedGenerator {
    private static int type;
    private static int floor;
    private static int ceiling;

    public SeedGenerator(int objectType) {
        type = objectType;
        int[] objectInfo = Globals.returnInfo(type);

        floor = objectInfo[2];
        ceiling = objectInfo[1];
    }

    public static int generate() {
        Random random = new Random();

        return 3;
    }
}
