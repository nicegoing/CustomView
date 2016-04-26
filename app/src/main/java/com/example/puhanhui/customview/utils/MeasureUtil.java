package com.example.puhanhui.customview.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/**
 * @author puhanhui
 * @version $$Rev$$
 * @date $$Date$$
 */
public class MeasureUtil {
    public static int[] getScreenSize(Activity context) {
        WindowManager manager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = manager.getDefaultDisplay();
        DisplayMetrics outMetrics=new DisplayMetrics();
        display.getMetrics(outMetrics);
        int[] measure={outMetrics.widthPixels,outMetrics.heightPixels};
        return measure;
    }
}
