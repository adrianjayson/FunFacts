package adrianjayson.com.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by adrian on 16/09/2017.
 */

public class ColorWheel {
    final String[] COLORS = {
            "#51b46d", // green
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#39add1", // light blue
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor() {
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randColor = randomGenerator.nextInt(COLORS.length);
        int color = Color.parseColor(COLORS[randColor]);

        return color;
    }
}
