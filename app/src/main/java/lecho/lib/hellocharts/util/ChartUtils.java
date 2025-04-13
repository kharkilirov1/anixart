package lecho.lib.hellocharts.util;

import android.graphics.Color;

/* loaded from: classes3.dex */
public abstract class ChartUtils {

    /* renamed from: a */
    public static final int f68712a = Color.parseColor("#DFDFDF");

    /* renamed from: b */
    public static final int f68713b = Color.parseColor("#DDDDDD");

    static {
        Color.parseColor("#33B5E5");
        Color.parseColor("#AA66CC");
        Color.parseColor("#99CC00");
        Color.parseColor("#FFBB33");
        Color.parseColor("#FF4444");
    }

    /* renamed from: a */
    public static int m34494a(int i2) {
        float[] fArr = new float[3];
        int alpha = Color.alpha(i2);
        Color.colorToHSV(i2, fArr);
        fArr[1] = Math.min(fArr[1] * 1.1f, 1.0f);
        fArr[2] = fArr[2] * 0.9f;
        int HSVToColor = Color.HSVToColor(fArr);
        return Color.argb(alpha, Color.red(HSVToColor), Color.green(HSVToColor), Color.blue(HSVToColor));
    }

    /* renamed from: b */
    public static int m34495b(float f2, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return (int) ((i2 * f2) + 0.5f);
    }

    /* renamed from: c */
    public static int m34496c(float f2, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return (int) ((i2 * f2) + 0.5f);
    }
}
