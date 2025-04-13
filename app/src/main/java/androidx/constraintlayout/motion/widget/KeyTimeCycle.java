package androidx.constraintlayout.motion.widget;

import android.util.SparseIntArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public class KeyTimeCycle extends Key {

    /* renamed from: f */
    public String f2507f;

    /* renamed from: g */
    public int f2508g = -1;

    /* renamed from: h */
    public float f2509h = Float.NaN;

    /* renamed from: i */
    public float f2510i = Float.NaN;

    /* renamed from: j */
    public float f2511j = Float.NaN;

    /* renamed from: k */
    public float f2512k = Float.NaN;

    /* renamed from: l */
    public float f2513l = Float.NaN;

    /* renamed from: m */
    public float f2514m = Float.NaN;

    /* renamed from: n */
    public float f2515n = Float.NaN;

    /* renamed from: o */
    public float f2516o = Float.NaN;

    /* renamed from: p */
    public float f2517p = Float.NaN;

    /* renamed from: q */
    public float f2518q = Float.NaN;

    /* renamed from: r */
    public float f2519r = Float.NaN;

    /* renamed from: s */
    public float f2520s = Float.NaN;

    /* renamed from: t */
    public int f2521t = 0;

    /* renamed from: u */
    public float f2522u = Float.NaN;

    /* renamed from: v */
    public float f2523v = 0.0f;

    public static class Loader {

        /* renamed from: a */
        public static SparseIntArray f2524a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2524a = sparseIntArray;
            sparseIntArray.append(0, 1);
            f2524a.append(9, 2);
            f2524a.append(5, 4);
            f2524a.append(6, 5);
            f2524a.append(7, 6);
            f2524a.append(3, 7);
            f2524a.append(15, 8);
            f2524a.append(14, 9);
            f2524a.append(13, 10);
            f2524a.append(11, 12);
            f2524a.append(10, 13);
            f2524a.append(4, 14);
            f2524a.append(1, 15);
            f2524a.append(2, 16);
            f2524a.append(8, 17);
            f2524a.append(12, 18);
            f2524a.append(18, 20);
            f2524a.append(17, 21);
            f2524a.append(20, 19);
        }
    }

    public KeyTimeCycle() {
        this.f2452d = 3;
        this.f2453e = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: a */
    public Key clone() {
        KeyTimeCycle keyTimeCycle = new KeyTimeCycle();
        super.m1392b(this);
        keyTimeCycle.f2507f = this.f2507f;
        keyTimeCycle.f2508g = this.f2508g;
        keyTimeCycle.f2521t = this.f2521t;
        keyTimeCycle.f2522u = this.f2522u;
        keyTimeCycle.f2523v = this.f2523v;
        keyTimeCycle.f2520s = this.f2520s;
        keyTimeCycle.f2509h = this.f2509h;
        keyTimeCycle.f2510i = this.f2510i;
        keyTimeCycle.f2511j = this.f2511j;
        keyTimeCycle.f2514m = this.f2514m;
        keyTimeCycle.f2512k = this.f2512k;
        keyTimeCycle.f2513l = this.f2513l;
        keyTimeCycle.f2515n = this.f2515n;
        keyTimeCycle.f2516o = this.f2516o;
        keyTimeCycle.f2517p = this.f2517p;
        keyTimeCycle.f2518q = this.f2518q;
        keyTimeCycle.f2519r = this.f2519r;
        return keyTimeCycle;
    }
}
