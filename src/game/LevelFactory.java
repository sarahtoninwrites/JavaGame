package game;

import game.levels.*;

public class LevelFactory {
    public static Level getLevel(int levelNumber) {
        switch (levelNumber) {
            case 1: return new Level1();
            case 2: return new Level2();
            case 3: return new Level3();
            case 4: return new Level4();
            case 5: return new Level5();
            case 6: return new Level6();
            case 7: return new Level7();
            case 8: return new Level8();
            case 9: return new Level9();
            case 10: return new Level10();
            case 11: return new Level11();
            case 12: return new Level12();
            case 13: return new Level13();
            case 14: return new Level14();
            case 15: return new Level15();
            case 16: return new Level16();
            case 17: return new Level17();
            default: return null;
        }
    }

}


