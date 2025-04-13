package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes.dex */
public class KeyTrigger extends Key {

    /* renamed from: s */
    public float f2538s;

    /* renamed from: f */
    public int f2525f = -1;

    /* renamed from: g */
    public String f2526g = null;

    /* renamed from: h */
    public int f2527h = -1;

    /* renamed from: i */
    public String f2528i = null;

    /* renamed from: j */
    public String f2529j = null;

    /* renamed from: k */
    public int f2530k = -1;

    /* renamed from: l */
    public int f2531l = -1;

    /* renamed from: m */
    public View f2532m = null;

    /* renamed from: n */
    public float f2533n = 0.1f;

    /* renamed from: o */
    public boolean f2534o = true;

    /* renamed from: p */
    public boolean f2535p = true;

    /* renamed from: q */
    public boolean f2536q = true;

    /* renamed from: r */
    public float f2537r = Float.NaN;

    /* renamed from: t */
    public boolean f2539t = false;

    /* renamed from: u */
    public RectF f2540u = new RectF();

    /* renamed from: v */
    public RectF f2541v = new RectF();

    /* renamed from: w */
    public HashMap<String, Method> f2542w = new HashMap<>();

    public static class Loader {

        /* renamed from: a */
        public static SparseIntArray f2543a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2543a = sparseIntArray;
            sparseIntArray.append(0, 8);
            f2543a.append(4, 4);
            f2543a.append(5, 1);
            f2543a.append(6, 2);
            f2543a.append(1, 7);
            f2543a.append(7, 6);
            f2543a.append(9, 5);
            f2543a.append(3, 9);
            f2543a.append(2, 10);
            f2543a.append(8, 11);
            f2543a.append(10, 12);
            f2543a.append(11, 13);
            f2543a.append(12, 14);
        }
    }

    public KeyTrigger() {
        this.f2452d = 5;
        this.f2453e = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: a */
    public Key clone() {
        KeyTrigger keyTrigger = new KeyTrigger();
        super.m1392b(this);
        keyTrigger.f2525f = this.f2525f;
        keyTrigger.f2526g = this.f2526g;
        keyTrigger.f2527h = this.f2527h;
        keyTrigger.f2528i = this.f2528i;
        keyTrigger.f2529j = this.f2529j;
        keyTrigger.f2530k = this.f2530k;
        keyTrigger.f2531l = this.f2531l;
        keyTrigger.f2532m = this.f2532m;
        keyTrigger.f2533n = this.f2533n;
        keyTrigger.f2534o = this.f2534o;
        keyTrigger.f2535p = this.f2535p;
        keyTrigger.f2536q = this.f2536q;
        keyTrigger.f2537r = this.f2537r;
        keyTrigger.f2538s = this.f2538s;
        keyTrigger.f2539t = this.f2539t;
        keyTrigger.f2540u = this.f2540u;
        keyTrigger.f2541v = this.f2541v;
        keyTrigger.f2542w = this.f2542w;
        return keyTrigger;
    }
}
