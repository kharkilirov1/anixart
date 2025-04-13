package com.airbnb.lottie.utils;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.model.KeyPath;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class MiscUtils {

    /* renamed from: a */
    public static PointF f7846a = new PointF();

    /* renamed from: a */
    public static PointF m4844a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static float m4845b(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f4, f2));
    }

    /* renamed from: c */
    public static int m4846c(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i4, i2));
    }

    /* renamed from: d */
    public static int m4847d(float f2, float f3) {
        int i2 = (int) f2;
        int i3 = (int) f3;
        int i4 = i2 / i3;
        int i5 = i2 % i3;
        if (!((i2 ^ i3) >= 0) && i5 != 0) {
            i4--;
        }
        return i2 - (i3 * i4);
    }

    /* renamed from: e */
    public static float m4848e(float f2, float f3, @FloatRange float f4) {
        return C0000a.m4a(f3, f2, f4, f2);
    }

    /* renamed from: f */
    public static int m4849f(int i2, int i3, @FloatRange float f2) {
        return (int) ((f2 * (i3 - i2)) + i2);
    }

    /* renamed from: g */
    public static void m4850g(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2, KeyPathElementContent keyPathElementContent) {
        if (keyPath.m4732c(keyPathElementContent.getName(), i2)) {
            list.add(keyPath2.m4730a(keyPathElementContent.getName()).m4736g(keyPathElementContent));
        }
    }
}
