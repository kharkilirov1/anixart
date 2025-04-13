package androidx.constraintlayout.motion.widget;

import android.util.SparseIntArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public class KeyAttributes extends Key {

    /* renamed from: f */
    public int f2454f = -1;

    /* renamed from: g */
    public boolean f2455g = false;

    /* renamed from: h */
    public float f2456h = Float.NaN;

    /* renamed from: i */
    public float f2457i = Float.NaN;

    /* renamed from: j */
    public float f2458j = Float.NaN;

    /* renamed from: k */
    public float f2459k = Float.NaN;

    /* renamed from: l */
    public float f2460l = Float.NaN;

    /* renamed from: m */
    public float f2461m = Float.NaN;

    /* renamed from: n */
    public float f2462n = Float.NaN;

    /* renamed from: o */
    public float f2463o = Float.NaN;

    /* renamed from: p */
    public float f2464p = Float.NaN;

    /* renamed from: q */
    public float f2465q = Float.NaN;

    /* renamed from: r */
    public float f2466r = Float.NaN;

    /* renamed from: s */
    public float f2467s = Float.NaN;

    /* renamed from: t */
    public float f2468t = Float.NaN;

    /* renamed from: u */
    public float f2469u = Float.NaN;

    public static class Loader {

        /* renamed from: a */
        public static SparseIntArray f2470a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2470a = sparseIntArray;
            sparseIntArray.append(0, 1);
            f2470a.append(11, 2);
            f2470a.append(7, 4);
            f2470a.append(8, 5);
            f2470a.append(9, 6);
            f2470a.append(1, 19);
            f2470a.append(2, 20);
            f2470a.append(5, 7);
            f2470a.append(18, 8);
            f2470a.append(17, 9);
            f2470a.append(15, 10);
            f2470a.append(13, 12);
            f2470a.append(12, 13);
            f2470a.append(6, 14);
            f2470a.append(3, 15);
            f2470a.append(4, 16);
            f2470a.append(10, 17);
            f2470a.append(14, 18);
        }
    }

    public KeyAttributes() {
        this.f2452d = 1;
        this.f2453e = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: a */
    public Key clone() {
        KeyAttributes keyAttributes = new KeyAttributes();
        super.m1392b(this);
        keyAttributes.f2454f = this.f2454f;
        keyAttributes.f2455g = this.f2455g;
        keyAttributes.f2456h = this.f2456h;
        keyAttributes.f2457i = this.f2457i;
        keyAttributes.f2458j = this.f2458j;
        keyAttributes.f2459k = this.f2459k;
        keyAttributes.f2460l = this.f2460l;
        keyAttributes.f2461m = this.f2461m;
        keyAttributes.f2462n = this.f2462n;
        keyAttributes.f2463o = this.f2463o;
        keyAttributes.f2464p = this.f2464p;
        keyAttributes.f2465q = this.f2465q;
        keyAttributes.f2466r = this.f2466r;
        keyAttributes.f2467s = this.f2467s;
        keyAttributes.f2468t = this.f2468t;
        keyAttributes.f2469u = this.f2469u;
        return keyAttributes;
    }
}
