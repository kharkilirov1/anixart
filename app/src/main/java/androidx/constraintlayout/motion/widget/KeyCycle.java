package androidx.constraintlayout.motion.widget;

import android.util.SparseIntArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public class KeyCycle extends Key {

    /* renamed from: f */
    public String f2471f = null;

    /* renamed from: g */
    public int f2472g = 0;

    /* renamed from: h */
    public int f2473h = -1;

    /* renamed from: i */
    public String f2474i = null;

    /* renamed from: j */
    public float f2475j = Float.NaN;

    /* renamed from: k */
    public float f2476k = 0.0f;

    /* renamed from: l */
    public float f2477l = 0.0f;

    /* renamed from: m */
    public float f2478m = Float.NaN;

    /* renamed from: n */
    public int f2479n = -1;

    /* renamed from: o */
    public float f2480o = Float.NaN;

    /* renamed from: p */
    public float f2481p = Float.NaN;

    /* renamed from: q */
    public float f2482q = Float.NaN;

    /* renamed from: r */
    public float f2483r = Float.NaN;

    /* renamed from: s */
    public float f2484s = Float.NaN;

    /* renamed from: t */
    public float f2485t = Float.NaN;

    /* renamed from: u */
    public float f2486u = Float.NaN;

    /* renamed from: v */
    public float f2487v = Float.NaN;

    /* renamed from: w */
    public float f2488w = Float.NaN;

    /* renamed from: x */
    public float f2489x = Float.NaN;

    /* renamed from: y */
    public float f2490y = Float.NaN;

    public static class Loader {

        /* renamed from: a */
        public static SparseIntArray f2491a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2491a = sparseIntArray;
            sparseIntArray.append(13, 1);
            f2491a.append(11, 2);
            f2491a.append(14, 3);
            f2491a.append(10, 4);
            f2491a.append(19, 5);
            f2491a.append(17, 6);
            f2491a.append(16, 7);
            f2491a.append(20, 8);
            f2491a.append(0, 9);
            f2491a.append(9, 10);
            f2491a.append(5, 11);
            f2491a.append(6, 12);
            f2491a.append(7, 13);
            f2491a.append(15, 14);
            f2491a.append(3, 15);
            f2491a.append(4, 16);
            f2491a.append(1, 17);
            f2491a.append(2, 18);
            f2491a.append(8, 19);
            f2491a.append(12, 20);
            f2491a.append(18, 21);
        }
    }

    public KeyCycle() {
        this.f2452d = 4;
        this.f2453e = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: a */
    public Key clone() {
        KeyCycle keyCycle = new KeyCycle();
        super.m1392b(this);
        keyCycle.f2471f = this.f2471f;
        keyCycle.f2472g = this.f2472g;
        keyCycle.f2473h = this.f2473h;
        keyCycle.f2474i = this.f2474i;
        keyCycle.f2475j = this.f2475j;
        keyCycle.f2476k = this.f2476k;
        keyCycle.f2477l = this.f2477l;
        keyCycle.f2478m = this.f2478m;
        keyCycle.f2479n = this.f2479n;
        keyCycle.f2480o = this.f2480o;
        keyCycle.f2481p = this.f2481p;
        keyCycle.f2482q = this.f2482q;
        keyCycle.f2483r = this.f2483r;
        keyCycle.f2484s = this.f2484s;
        keyCycle.f2485t = this.f2485t;
        keyCycle.f2486u = this.f2486u;
        keyCycle.f2487v = this.f2487v;
        keyCycle.f2488w = this.f2488w;
        keyCycle.f2489x = this.f2489x;
        keyCycle.f2490y = this.f2490y;
        return keyCycle;
    }
}
