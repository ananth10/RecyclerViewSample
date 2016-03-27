package com.ananth.recyclerviewsample;

import java.util.Random;

/**
 * Created by anantha on 3/27/2016.
 */
public class FoodsItems {


    private static final Random RANDOM = new Random();

    public static int getRandomCheeseDrawable() {
        switch (RANDOM.nextInt(20)) {
            default:
            case 0:
                return R.drawable.image1;
            case 1:
                return R.drawable.image2;
            case 2:
                return R.drawable.image3;
            case 3:
                return R.drawable.image4;
            case 4:
                return R.drawable.image5;
            case 5:
                return R.drawable.image6;
            case 6:
                return R.drawable.image7;
            case 7:
                return R.drawable.image8;
            case 8:
                return R.drawable.image9;
            case 9:
                return R.drawable.image10;
            case 10:
                return R.drawable.image11;
            case 11:
                return R.drawable.image12;
            case 13:
                return R.drawable.image13;
            case 14:
                return R.drawable.image14;
            case 15:
                return R.drawable.image15;
            case 16:
                return R.drawable.image17;
            case 17:
                return R.drawable.image18;
            case 18:
                return R.drawable.image19;
            case 19:
                return R.drawable.image20;
        }
    }

    public static final Integer[] mFoodsImages={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5
            ,R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10,R.drawable.image11,R.drawable.image12,
            R.drawable.image13,R.drawable.image14,R.drawable.image15,R.drawable.image17,R.drawable.image18,R.drawable.image19,R.drawable.image20};

}
