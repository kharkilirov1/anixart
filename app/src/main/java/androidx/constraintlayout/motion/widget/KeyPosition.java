package androidx.constraintlayout.motion.widget;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class KeyPosition extends KeyPositionBase {

    /* renamed from: f */
    public String f2494f = null;

    /* renamed from: g */
    public int f2495g = -1;

    /* renamed from: h */
    public int f2496h = 0;

    /* renamed from: i */
    public float f2497i = Float.NaN;

    /* renamed from: j */
    public float f2498j = Float.NaN;

    /* renamed from: k */
    public float f2499k = Float.NaN;

    /* renamed from: l */
    public float f2500l = Float.NaN;

    /* renamed from: m */
    public float f2501m = Float.NaN;

    /* renamed from: n */
    public float f2502n = Float.NaN;

    /* renamed from: o */
    public int f2503o = 0;

    /* renamed from: p */
    public float f2504p = Float.NaN;

    /* renamed from: q */
    public float f2505q = Float.NaN;

    public static class Loader {

        /* renamed from: a */
        public static SparseIntArray f2506a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2506a = sparseIntArray;
            sparseIntArray.append(4, 1);
            f2506a.append(2, 2);
            f2506a.append(11, 3);
            f2506a.append(0, 4);
            f2506a.append(1, 5);
            f2506a.append(8, 6);
            f2506a.append(9, 7);
            f2506a.append(3, 9);
            f2506a.append(10, 8);
            f2506a.append(7, 11);
            f2506a.append(6, 12);
            f2506a.append(5, 10);
        }
    }

    public KeyPosition() {
        this.f2452d = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: a */
    public Key clone() {
        KeyPosition keyPosition = new KeyPosition();
        super.m1392b(this);
        keyPosition.f2494f = this.f2494f;
        keyPosition.f2495g = this.f2495g;
        keyPosition.f2496h = this.f2496h;
        keyPosition.f2497i = this.f2497i;
        keyPosition.f2498j = Float.NaN;
        keyPosition.f2499k = this.f2499k;
        keyPosition.f2500l = this.f2500l;
        keyPosition.f2501m = this.f2501m;
        keyPosition.f2502n = this.f2502n;
        keyPosition.f2504p = this.f2504p;
        keyPosition.f2505q = this.f2505q;
        return keyPosition;
    }
}
