package com.example.timothy.physicsgame.CelestialObjects;

/**
 * Created by timothy on 7/9/17.
 */

public enum CelestialObjectEnum {
    SUN(0),
    PLANET(1),
    PLAYER_PLANET(2);

    int index;

    CelestialObjectEnum(int i) {
        index = i;
    }

    int getIndex() {
        return index;
    }
}
