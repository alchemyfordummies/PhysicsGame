package com.example.timothy.physicsgame;

/*
Info goes in this order:
- constant value
- ceiling
- floor
 */

import com.example.timothy.physicsgame.CelestialObjects.Sun;

public class Globals {
    public static final int PLAYER_PLANET   = 0;
    public static final int PLANET          = 1;
    public static final int SUN             = 2;

    public static final int[] PLAYER_PLANET_INFO = {PLAYER_PLANET, 170, 55};
    public static final int[] PLANET_INFO        = {PLANET, 510, 111};
    public static final int[] SUN_INFO           = {SUN, 20000, 3333};

    public static int[] returnInfo(int type) {
        switch(type) {
            case 0:
                return PLAYER_PLANET_INFO;
            case 1:
                return PLANET_INFO;
            case 2:
                return SUN_INFO;
            default:
                return null;
        }
    }
}
