package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0218R;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ConstraintSet {

    /* renamed from: d */
    public static final int[] f2877d = {0, 4, 8};

    /* renamed from: e */
    public static SparseIntArray f2878e = new SparseIntArray();

    /* renamed from: f */
    public static SparseIntArray f2879f = new SparseIntArray();

    /* renamed from: a */
    public HashMap<String, ConstraintAttribute> f2880a = new HashMap<>();

    /* renamed from: b */
    public boolean f2881b = true;

    /* renamed from: c */
    public HashMap<Integer, Constraint> f2882c = new HashMap<>();

    public static class Constraint {

        /* renamed from: a */
        public int f2883a;

        /* renamed from: b */
        public String f2884b;

        /* renamed from: c */
        public final PropertySet f2885c = new PropertySet();

        /* renamed from: d */
        public final Motion f2886d = new Motion();

        /* renamed from: e */
        public final Layout f2887e = new Layout();

        /* renamed from: f */
        public final Transform f2888f = new Transform();

        /* renamed from: g */
        public HashMap<String, ConstraintAttribute> f2889g = new HashMap<>();

        /* renamed from: h */
        public Delta f2890h;

        public static class Delta {

            /* renamed from: a */
            public int[] f2891a = new int[10];

            /* renamed from: b */
            public int[] f2892b = new int[10];

            /* renamed from: c */
            public int f2893c = 0;

            /* renamed from: d */
            public int[] f2894d = new int[10];

            /* renamed from: e */
            public float[] f2895e = new float[10];

            /* renamed from: f */
            public int f2896f = 0;

            /* renamed from: g */
            public int[] f2897g = new int[5];

            /* renamed from: h */
            public String[] f2898h = new String[5];

            /* renamed from: i */
            public int f2899i = 0;

            /* renamed from: j */
            public int[] f2900j = new int[4];

            /* renamed from: k */
            public boolean[] f2901k = new boolean[4];

            /* renamed from: l */
            public int f2902l = 0;

            /* renamed from: a */
            public void m1460a(int i2, float f2) {
                int i3 = this.f2896f;
                int[] iArr = this.f2894d;
                if (i3 >= iArr.length) {
                    this.f2894d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2895e;
                    this.f2895e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2894d;
                int i4 = this.f2896f;
                iArr2[i4] = i2;
                float[] fArr2 = this.f2895e;
                this.f2896f = i4 + 1;
                fArr2[i4] = f2;
            }

            /* renamed from: b */
            public void m1461b(int i2, int i3) {
                int i4 = this.f2893c;
                int[] iArr = this.f2891a;
                if (i4 >= iArr.length) {
                    this.f2891a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2892b;
                    this.f2892b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2891a;
                int i5 = this.f2893c;
                iArr3[i5] = i2;
                int[] iArr4 = this.f2892b;
                this.f2893c = i5 + 1;
                iArr4[i5] = i3;
            }

            /* renamed from: c */
            public void m1462c(int i2, String str) {
                int i3 = this.f2899i;
                int[] iArr = this.f2897g;
                if (i3 >= iArr.length) {
                    this.f2897g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2898h;
                    this.f2898h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2897g;
                int i4 = this.f2899i;
                iArr2[i4] = i2;
                String[] strArr2 = this.f2898h;
                this.f2899i = i4 + 1;
                strArr2[i4] = str;
            }

            /* renamed from: d */
            public void m1463d(int i2, boolean z) {
                int i3 = this.f2902l;
                int[] iArr = this.f2900j;
                if (i3 >= iArr.length) {
                    this.f2900j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2901k;
                    this.f2901k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2900j;
                int i4 = this.f2902l;
                iArr2[i4] = i2;
                boolean[] zArr2 = this.f2901k;
                this.f2902l = i4 + 1;
                zArr2[i4] = z;
            }
        }

        /* renamed from: a */
        public void m1456a(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.f2887e;
            layoutParams.f2817e = layout.f2946i;
            layoutParams.f2819f = layout.f2948j;
            layoutParams.f2821g = layout.f2950k;
            layoutParams.f2823h = layout.f2952l;
            layoutParams.f2825i = layout.f2954m;
            layoutParams.f2827j = layout.f2956n;
            layoutParams.f2829k = layout.f2958o;
            layoutParams.f2831l = layout.f2960p;
            layoutParams.f2833m = layout.f2962q;
            layoutParams.f2835n = layout.f2963r;
            layoutParams.f2837o = layout.f2964s;
            layoutParams.f2844s = layout.f2965t;
            layoutParams.f2845t = layout.f2966u;
            layoutParams.f2846u = layout.f2967v;
            layoutParams.f2847v = layout.f2968w;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.f2910G;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.f2911H;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.f2912I;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.f2913J;
            layoutParams.f2783A = layout.f2922S;
            layoutParams.f2784B = layout.f2921R;
            layoutParams.f2849x = layout.f2918O;
            layoutParams.f2851z = layout.f2920Q;
            layoutParams.f2787E = layout.f2969x;
            layoutParams.f2788F = layout.f2970y;
            layoutParams.f2839p = layout.f2904A;
            layoutParams.f2841q = layout.f2905B;
            layoutParams.f2843r = layout.f2906C;
            layoutParams.f2789G = layout.f2971z;
            layoutParams.f2802T = layout.f2907D;
            layoutParams.f2803U = layout.f2908E;
            layoutParams.f2791I = layout.f2924U;
            layoutParams.f2790H = layout.f2925V;
            layoutParams.f2793K = layout.f2927X;
            layoutParams.f2792J = layout.f2926W;
            layoutParams.f2805W = layout.f2955m0;
            layoutParams.f2806X = layout.f2957n0;
            layoutParams.f2794L = layout.f2928Y;
            layoutParams.f2795M = layout.f2929Z;
            layoutParams.f2798P = layout.f2931a0;
            layoutParams.f2799Q = layout.f2933b0;
            layoutParams.f2796N = layout.f2935c0;
            layoutParams.f2797O = layout.f2937d0;
            layoutParams.f2800R = layout.f2939e0;
            layoutParams.f2801S = layout.f2941f0;
            layoutParams.f2804V = layout.f2909F;
            layoutParams.f2813c = layout.f2942g;
            layoutParams.f2809a = layout.f2938e;
            layoutParams.f2811b = layout.f2940f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.f2934c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.f2936d;
            String str = layout.f2953l0;
            if (str != null) {
                layoutParams.f2807Y = str;
            }
            layoutParams.f2808Z = layout.f2961p0;
            layoutParams.setMarginStart(layout.f2915L);
            layoutParams.setMarginEnd(this.f2887e.f2914K);
            layoutParams.m1441a();
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Constraint clone() {
            Constraint constraint = new Constraint();
            constraint.f2887e.m1464a(this.f2887e);
            constraint.f2886d.m1466a(this.f2886d);
            constraint.f2885c.m1468a(this.f2885c);
            constraint.f2888f.m1470a(this.f2888f);
            constraint.f2883a = this.f2883a;
            constraint.f2890h = this.f2890h;
            return constraint;
        }

        /* renamed from: c */
        public final void m1458c(int i2, ConstraintLayout.LayoutParams layoutParams) {
            this.f2883a = i2;
            Layout layout = this.f2887e;
            layout.f2946i = layoutParams.f2817e;
            layout.f2948j = layoutParams.f2819f;
            layout.f2950k = layoutParams.f2821g;
            layout.f2952l = layoutParams.f2823h;
            layout.f2954m = layoutParams.f2825i;
            layout.f2956n = layoutParams.f2827j;
            layout.f2958o = layoutParams.f2829k;
            layout.f2960p = layoutParams.f2831l;
            layout.f2962q = layoutParams.f2833m;
            layout.f2963r = layoutParams.f2835n;
            layout.f2964s = layoutParams.f2837o;
            layout.f2965t = layoutParams.f2844s;
            layout.f2966u = layoutParams.f2845t;
            layout.f2967v = layoutParams.f2846u;
            layout.f2968w = layoutParams.f2847v;
            layout.f2969x = layoutParams.f2787E;
            layout.f2970y = layoutParams.f2788F;
            layout.f2971z = layoutParams.f2789G;
            layout.f2904A = layoutParams.f2839p;
            layout.f2905B = layoutParams.f2841q;
            layout.f2906C = layoutParams.f2843r;
            layout.f2907D = layoutParams.f2802T;
            layout.f2908E = layoutParams.f2803U;
            layout.f2909F = layoutParams.f2804V;
            layout.f2942g = layoutParams.f2813c;
            layout.f2938e = layoutParams.f2809a;
            layout.f2940f = layoutParams.f2811b;
            layout.f2934c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.f2936d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.f2910G = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.f2911H = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.f2912I = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.f2913J = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.f2916M = layoutParams.f2786D;
            layout.f2924U = layoutParams.f2791I;
            layout.f2925V = layoutParams.f2790H;
            layout.f2927X = layoutParams.f2793K;
            layout.f2926W = layoutParams.f2792J;
            layout.f2955m0 = layoutParams.f2805W;
            layout.f2957n0 = layoutParams.f2806X;
            layout.f2928Y = layoutParams.f2794L;
            layout.f2929Z = layoutParams.f2795M;
            layout.f2931a0 = layoutParams.f2798P;
            layout.f2933b0 = layoutParams.f2799Q;
            layout.f2935c0 = layoutParams.f2796N;
            layout.f2937d0 = layoutParams.f2797O;
            layout.f2939e0 = layoutParams.f2800R;
            layout.f2941f0 = layoutParams.f2801S;
            layout.f2953l0 = layoutParams.f2807Y;
            layout.f2918O = layoutParams.f2849x;
            layout.f2920Q = layoutParams.f2851z;
            layout.f2917N = layoutParams.f2848w;
            layout.f2919P = layoutParams.f2850y;
            layout.f2922S = layoutParams.f2783A;
            layout.f2921R = layoutParams.f2784B;
            layout.f2923T = layoutParams.f2785C;
            layout.f2961p0 = layoutParams.f2808Z;
            layout.f2914K = layoutParams.getMarginEnd();
            this.f2887e.f2915L = layoutParams.getMarginStart();
        }

        /* renamed from: d */
        public final void m1459d(int i2, Constraints.LayoutParams layoutParams) {
            m1458c(i2, layoutParams);
            this.f2885c.f2990d = layoutParams.f3012r0;
            Transform transform = this.f2888f;
            transform.f2994b = layoutParams.f3015u0;
            transform.f2995c = layoutParams.f3016v0;
            transform.f2996d = layoutParams.f3017w0;
            transform.f2997e = layoutParams.f3018x0;
            transform.f2998f = layoutParams.f3019y0;
            transform.f2999g = layoutParams.f3020z0;
            transform.f3000h = layoutParams.f3008A0;
            transform.f3002j = layoutParams.f3009B0;
            transform.f3003k = layoutParams.f3010C0;
            transform.f3004l = layoutParams.f3011D0;
            transform.f3006n = layoutParams.f3014t0;
            transform.f3005m = layoutParams.f3013s0;
        }
    }

    public static class Layout {

        /* renamed from: q0 */
        public static SparseIntArray f2903q0;

        /* renamed from: c */
        public int f2934c;

        /* renamed from: d */
        public int f2936d;

        /* renamed from: j0 */
        public int[] f2949j0;

        /* renamed from: k0 */
        public String f2951k0;

        /* renamed from: l0 */
        public String f2953l0;

        /* renamed from: a */
        public boolean f2930a = false;

        /* renamed from: b */
        public boolean f2932b = false;

        /* renamed from: e */
        public int f2938e = -1;

        /* renamed from: f */
        public int f2940f = -1;

        /* renamed from: g */
        public float f2942g = -1.0f;

        /* renamed from: h */
        public boolean f2944h = true;

        /* renamed from: i */
        public int f2946i = -1;

        /* renamed from: j */
        public int f2948j = -1;

        /* renamed from: k */
        public int f2950k = -1;

        /* renamed from: l */
        public int f2952l = -1;

        /* renamed from: m */
        public int f2954m = -1;

        /* renamed from: n */
        public int f2956n = -1;

        /* renamed from: o */
        public int f2958o = -1;

        /* renamed from: p */
        public int f2960p = -1;

        /* renamed from: q */
        public int f2962q = -1;

        /* renamed from: r */
        public int f2963r = -1;

        /* renamed from: s */
        public int f2964s = -1;

        /* renamed from: t */
        public int f2965t = -1;

        /* renamed from: u */
        public int f2966u = -1;

        /* renamed from: v */
        public int f2967v = -1;

        /* renamed from: w */
        public int f2968w = -1;

        /* renamed from: x */
        public float f2969x = 0.5f;

        /* renamed from: y */
        public float f2970y = 0.5f;

        /* renamed from: z */
        public String f2971z = null;

        /* renamed from: A */
        public int f2904A = -1;

        /* renamed from: B */
        public int f2905B = 0;

        /* renamed from: C */
        public float f2906C = 0.0f;

        /* renamed from: D */
        public int f2907D = -1;

        /* renamed from: E */
        public int f2908E = -1;

        /* renamed from: F */
        public int f2909F = -1;

        /* renamed from: G */
        public int f2910G = 0;

        /* renamed from: H */
        public int f2911H = 0;

        /* renamed from: I */
        public int f2912I = 0;

        /* renamed from: J */
        public int f2913J = 0;

        /* renamed from: K */
        public int f2914K = 0;

        /* renamed from: L */
        public int f2915L = 0;

        /* renamed from: M */
        public int f2916M = 0;

        /* renamed from: N */
        public int f2917N = Integer.MIN_VALUE;

        /* renamed from: O */
        public int f2918O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f2919P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f2920Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f2921R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f2922S = Integer.MIN_VALUE;

        /* renamed from: T */
        public int f2923T = Integer.MIN_VALUE;

        /* renamed from: U */
        public float f2924U = -1.0f;

        /* renamed from: V */
        public float f2925V = -1.0f;

        /* renamed from: W */
        public int f2926W = 0;

        /* renamed from: X */
        public int f2927X = 0;

        /* renamed from: Y */
        public int f2928Y = 0;

        /* renamed from: Z */
        public int f2929Z = 0;

        /* renamed from: a0 */
        public int f2931a0 = 0;

        /* renamed from: b0 */
        public int f2933b0 = 0;

        /* renamed from: c0 */
        public int f2935c0 = 0;

        /* renamed from: d0 */
        public int f2937d0 = 0;

        /* renamed from: e0 */
        public float f2939e0 = 1.0f;

        /* renamed from: f0 */
        public float f2941f0 = 1.0f;

        /* renamed from: g0 */
        public int f2943g0 = -1;

        /* renamed from: h0 */
        public int f2945h0 = 0;

        /* renamed from: i0 */
        public int f2947i0 = -1;

        /* renamed from: m0 */
        public boolean f2955m0 = false;

        /* renamed from: n0 */
        public boolean f2957n0 = false;

        /* renamed from: o0 */
        public boolean f2959o0 = true;

        /* renamed from: p0 */
        public int f2961p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2903q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            f2903q0.append(44, 25);
            f2903q0.append(46, 28);
            f2903q0.append(47, 29);
            f2903q0.append(52, 35);
            f2903q0.append(51, 34);
            f2903q0.append(24, 4);
            f2903q0.append(23, 3);
            f2903q0.append(19, 1);
            f2903q0.append(61, 6);
            f2903q0.append(62, 7);
            f2903q0.append(31, 17);
            f2903q0.append(32, 18);
            f2903q0.append(33, 19);
            f2903q0.append(15, 90);
            f2903q0.append(0, 26);
            f2903q0.append(48, 31);
            f2903q0.append(49, 32);
            f2903q0.append(30, 10);
            f2903q0.append(29, 9);
            f2903q0.append(66, 13);
            f2903q0.append(69, 16);
            f2903q0.append(67, 14);
            f2903q0.append(64, 11);
            f2903q0.append(68, 15);
            f2903q0.append(65, 12);
            f2903q0.append(55, 38);
            f2903q0.append(41, 37);
            f2903q0.append(40, 39);
            f2903q0.append(54, 40);
            f2903q0.append(39, 20);
            f2903q0.append(53, 36);
            f2903q0.append(28, 5);
            f2903q0.append(42, 91);
            f2903q0.append(50, 91);
            f2903q0.append(45, 91);
            f2903q0.append(22, 91);
            f2903q0.append(18, 91);
            f2903q0.append(3, 23);
            f2903q0.append(5, 27);
            f2903q0.append(7, 30);
            f2903q0.append(8, 8);
            f2903q0.append(4, 33);
            f2903q0.append(6, 2);
            f2903q0.append(1, 22);
            f2903q0.append(2, 21);
            f2903q0.append(56, 41);
            f2903q0.append(34, 42);
            f2903q0.append(17, 41);
            f2903q0.append(16, 42);
            f2903q0.append(71, 76);
            f2903q0.append(25, 61);
            f2903q0.append(27, 62);
            f2903q0.append(26, 63);
            f2903q0.append(60, 69);
            f2903q0.append(38, 70);
            f2903q0.append(12, 71);
            f2903q0.append(10, 72);
            f2903q0.append(11, 73);
            f2903q0.append(13, 74);
            f2903q0.append(9, 75);
        }

        /* renamed from: a */
        public void m1464a(Layout layout) {
            this.f2930a = layout.f2930a;
            this.f2934c = layout.f2934c;
            this.f2932b = layout.f2932b;
            this.f2936d = layout.f2936d;
            this.f2938e = layout.f2938e;
            this.f2940f = layout.f2940f;
            this.f2942g = layout.f2942g;
            this.f2944h = layout.f2944h;
            this.f2946i = layout.f2946i;
            this.f2948j = layout.f2948j;
            this.f2950k = layout.f2950k;
            this.f2952l = layout.f2952l;
            this.f2954m = layout.f2954m;
            this.f2956n = layout.f2956n;
            this.f2958o = layout.f2958o;
            this.f2960p = layout.f2960p;
            this.f2962q = layout.f2962q;
            this.f2963r = layout.f2963r;
            this.f2964s = layout.f2964s;
            this.f2965t = layout.f2965t;
            this.f2966u = layout.f2966u;
            this.f2967v = layout.f2967v;
            this.f2968w = layout.f2968w;
            this.f2969x = layout.f2969x;
            this.f2970y = layout.f2970y;
            this.f2971z = layout.f2971z;
            this.f2904A = layout.f2904A;
            this.f2905B = layout.f2905B;
            this.f2906C = layout.f2906C;
            this.f2907D = layout.f2907D;
            this.f2908E = layout.f2908E;
            this.f2909F = layout.f2909F;
            this.f2910G = layout.f2910G;
            this.f2911H = layout.f2911H;
            this.f2912I = layout.f2912I;
            this.f2913J = layout.f2913J;
            this.f2914K = layout.f2914K;
            this.f2915L = layout.f2915L;
            this.f2916M = layout.f2916M;
            this.f2917N = layout.f2917N;
            this.f2918O = layout.f2918O;
            this.f2919P = layout.f2919P;
            this.f2920Q = layout.f2920Q;
            this.f2921R = layout.f2921R;
            this.f2922S = layout.f2922S;
            this.f2923T = layout.f2923T;
            this.f2924U = layout.f2924U;
            this.f2925V = layout.f2925V;
            this.f2926W = layout.f2926W;
            this.f2927X = layout.f2927X;
            this.f2928Y = layout.f2928Y;
            this.f2929Z = layout.f2929Z;
            this.f2931a0 = layout.f2931a0;
            this.f2933b0 = layout.f2933b0;
            this.f2935c0 = layout.f2935c0;
            this.f2937d0 = layout.f2937d0;
            this.f2939e0 = layout.f2939e0;
            this.f2941f0 = layout.f2941f0;
            this.f2943g0 = layout.f2943g0;
            this.f2945h0 = layout.f2945h0;
            this.f2947i0 = layout.f2947i0;
            this.f2953l0 = layout.f2953l0;
            int[] iArr = layout.f2949j0;
            if (iArr == null || layout.f2951k0 != null) {
                this.f2949j0 = null;
            } else {
                this.f2949j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f2951k0 = layout.f2951k0;
            this.f2955m0 = layout.f2955m0;
            this.f2957n0 = layout.f2957n0;
            this.f2959o0 = layout.f2959o0;
            this.f2961p0 = layout.f2961p0;
        }

        /* renamed from: b */
        public void m1465b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0218R.styleable.f3030f);
            this.f2932b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = f2903q0.get(index);
                switch (i3) {
                    case 1:
                        int i4 = this.f2962q;
                        int[] iArr = ConstraintSet.f2877d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i4);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2962q = resourceId;
                        break;
                    case 2:
                        this.f2913J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2913J);
                        break;
                    case 3:
                        int i5 = this.f2960p;
                        int[] iArr2 = ConstraintSet.f2877d;
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, i5);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2960p = resourceId2;
                        break;
                    case 4:
                        int i6 = this.f2958o;
                        int[] iArr3 = ConstraintSet.f2877d;
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, i6);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2958o = resourceId3;
                        break;
                    case 5:
                        this.f2971z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f2907D = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2907D);
                        break;
                    case 7:
                        this.f2908E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2908E);
                        break;
                    case 8:
                        this.f2914K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2914K);
                        break;
                    case 9:
                        int i7 = this.f2968w;
                        int[] iArr4 = ConstraintSet.f2877d;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, i7);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2968w = resourceId4;
                        break;
                    case 10:
                        int i8 = this.f2967v;
                        int[] iArr5 = ConstraintSet.f2877d;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, i8);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2967v = resourceId5;
                        break;
                    case 11:
                        this.f2920Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f2920Q);
                        break;
                    case 12:
                        this.f2921R = obtainStyledAttributes.getDimensionPixelSize(index, this.f2921R);
                        break;
                    case 13:
                        this.f2917N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2917N);
                        break;
                    case 14:
                        this.f2919P = obtainStyledAttributes.getDimensionPixelSize(index, this.f2919P);
                        break;
                    case 15:
                        this.f2922S = obtainStyledAttributes.getDimensionPixelSize(index, this.f2922S);
                        break;
                    case 16:
                        this.f2918O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2918O);
                        break;
                    case 17:
                        this.f2938e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2938e);
                        break;
                    case 18:
                        this.f2940f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2940f);
                        break;
                    case 19:
                        this.f2942g = obtainStyledAttributes.getFloat(index, this.f2942g);
                        break;
                    case 20:
                        this.f2969x = obtainStyledAttributes.getFloat(index, this.f2969x);
                        break;
                    case 21:
                        this.f2936d = obtainStyledAttributes.getLayoutDimension(index, this.f2936d);
                        break;
                    case 22:
                        this.f2934c = obtainStyledAttributes.getLayoutDimension(index, this.f2934c);
                        break;
                    case 23:
                        this.f2910G = obtainStyledAttributes.getDimensionPixelSize(index, this.f2910G);
                        break;
                    case 24:
                        int i9 = this.f2946i;
                        int[] iArr6 = ConstraintSet.f2877d;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, i9);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2946i = resourceId6;
                        break;
                    case 25:
                        int i10 = this.f2948j;
                        int[] iArr7 = ConstraintSet.f2877d;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, i10);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2948j = resourceId7;
                        break;
                    case 26:
                        this.f2909F = obtainStyledAttributes.getInt(index, this.f2909F);
                        break;
                    case 27:
                        this.f2911H = obtainStyledAttributes.getDimensionPixelSize(index, this.f2911H);
                        break;
                    case 28:
                        int i11 = this.f2950k;
                        int[] iArr8 = ConstraintSet.f2877d;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, i11);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2950k = resourceId8;
                        break;
                    case 29:
                        int i12 = this.f2952l;
                        int[] iArr9 = ConstraintSet.f2877d;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, i12);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2952l = resourceId9;
                        break;
                    case 30:
                        this.f2915L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2915L);
                        break;
                    case 31:
                        int i13 = this.f2965t;
                        int[] iArr10 = ConstraintSet.f2877d;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, i13);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2965t = resourceId10;
                        break;
                    case 32:
                        int i14 = this.f2966u;
                        int[] iArr11 = ConstraintSet.f2877d;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, i14);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2966u = resourceId11;
                        break;
                    case 33:
                        this.f2912I = obtainStyledAttributes.getDimensionPixelSize(index, this.f2912I);
                        break;
                    case 34:
                        int i15 = this.f2956n;
                        int[] iArr12 = ConstraintSet.f2877d;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, i15);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2956n = resourceId12;
                        break;
                    case 35:
                        int i16 = this.f2954m;
                        int[] iArr13 = ConstraintSet.f2877d;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, i16);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2954m = resourceId13;
                        break;
                    case 36:
                        this.f2970y = obtainStyledAttributes.getFloat(index, this.f2970y);
                        break;
                    case 37:
                        this.f2925V = obtainStyledAttributes.getFloat(index, this.f2925V);
                        break;
                    case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        this.f2924U = obtainStyledAttributes.getFloat(index, this.f2924U);
                        break;
                    case 39:
                        this.f2926W = obtainStyledAttributes.getInt(index, this.f2926W);
                        break;
                    case 40:
                        this.f2927X = obtainStyledAttributes.getInt(index, this.f2927X);
                        break;
                    case 41:
                        ConstraintSet.m1447h(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        ConstraintSet.m1447h(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i3) {
                            case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                int i17 = this.f2904A;
                                int[] iArr14 = ConstraintSet.f2877d;
                                int resourceId14 = obtainStyledAttributes.getResourceId(index, i17);
                                if (resourceId14 == -1) {
                                    resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                }
                                this.f2904A = resourceId14;
                                break;
                            case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                this.f2905B = obtainStyledAttributes.getDimensionPixelSize(index, this.f2905B);
                                break;
                            case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                this.f2906C = obtainStyledAttributes.getFloat(index, this.f2906C);
                                break;
                            default:
                                switch (i3) {
                                    case 69:
                                        this.f2939e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                        this.f2941f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                        this.f2943g0 = obtainStyledAttributes.getInt(index, this.f2943g0);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                                        this.f2945h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2945h0);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                                        this.f2951k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                                        this.f2959o0 = obtainStyledAttributes.getBoolean(index, this.f2959o0);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                                        this.f2961p0 = obtainStyledAttributes.getInt(index, this.f2961p0);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                                        int i18 = this.f2963r;
                                        int[] iArr15 = ConstraintSet.f2877d;
                                        int resourceId15 = obtainStyledAttributes.getResourceId(index, i18);
                                        if (resourceId15 == -1) {
                                            resourceId15 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.f2963r = resourceId15;
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                                        int i19 = this.f2964s;
                                        int[] iArr16 = ConstraintSet.f2877d;
                                        int resourceId16 = obtainStyledAttributes.getResourceId(index, i19);
                                        if (resourceId16 == -1) {
                                            resourceId16 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.f2964s = resourceId16;
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                                        this.f2923T = obtainStyledAttributes.getDimensionPixelSize(index, this.f2923T);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                        this.f2916M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2916M);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                        this.f2928Y = obtainStyledAttributes.getInt(index, this.f2928Y);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                        this.f2929Z = obtainStyledAttributes.getInt(index, this.f2929Z);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                        this.f2933b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2933b0);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                        this.f2931a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2931a0);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                                        this.f2937d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2937d0);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_panelBackground /* 86 */:
                                        this.f2935c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2935c0);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                                        this.f2955m0 = obtainStyledAttributes.getBoolean(index, this.f2955m0);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                        this.f2957n0 = obtainStyledAttributes.getBoolean(index, this.f2957n0);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                                        this.f2953l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f2944h = obtainStyledAttributes.getBoolean(index, this.f2944h);
                                        break;
                                    case 91:
                                        StringBuilder m24u = C0000a.m24u("unused attribute 0x");
                                        m24u.append(Integer.toHexString(index));
                                        m24u.append("   ");
                                        m24u.append(f2903q0.get(index));
                                        Log.w("ConstraintSet", m24u.toString());
                                        break;
                                    default:
                                        StringBuilder m24u2 = C0000a.m24u("Unknown attribute 0x");
                                        m24u2.append(Integer.toHexString(index));
                                        m24u2.append("   ");
                                        m24u2.append(f2903q0.get(index));
                                        Log.w("ConstraintSet", m24u2.toString());
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class Motion {

        /* renamed from: o */
        public static SparseIntArray f2972o;

        /* renamed from: a */
        public boolean f2973a = false;

        /* renamed from: b */
        public int f2974b = -1;

        /* renamed from: c */
        public int f2975c = 0;

        /* renamed from: d */
        public String f2976d = null;

        /* renamed from: e */
        public int f2977e = -1;

        /* renamed from: f */
        public int f2978f = 0;

        /* renamed from: g */
        public float f2979g = Float.NaN;

        /* renamed from: h */
        public int f2980h = -1;

        /* renamed from: i */
        public float f2981i = Float.NaN;

        /* renamed from: j */
        public float f2982j = Float.NaN;

        /* renamed from: k */
        public int f2983k = -1;

        /* renamed from: l */
        public String f2984l = null;

        /* renamed from: m */
        public int f2985m = -3;

        /* renamed from: n */
        public int f2986n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2972o = sparseIntArray;
            sparseIntArray.append(3, 1);
            f2972o.append(5, 2);
            f2972o.append(9, 3);
            f2972o.append(2, 4);
            f2972o.append(1, 5);
            f2972o.append(0, 6);
            f2972o.append(4, 7);
            f2972o.append(8, 8);
            f2972o.append(7, 9);
            f2972o.append(6, 10);
        }

        /* renamed from: a */
        public void m1466a(Motion motion) {
            this.f2973a = motion.f2973a;
            this.f2974b = motion.f2974b;
            this.f2976d = motion.f2976d;
            this.f2977e = motion.f2977e;
            this.f2978f = motion.f2978f;
            this.f2981i = motion.f2981i;
            this.f2979g = motion.f2979g;
            this.f2980h = motion.f2980h;
        }

        /* renamed from: b */
        public void m1467b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0218R.styleable.f3031g);
            this.f2973a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (f2972o.get(index)) {
                    case 1:
                        this.f2981i = obtainStyledAttributes.getFloat(index, this.f2981i);
                        break;
                    case 2:
                        this.f2977e = obtainStyledAttributes.getInt(index, this.f2977e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2976d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f2976d = Easing.f2023c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f2978f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i3 = this.f2974b;
                        int[] iArr = ConstraintSet.f2877d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f2974b = resourceId;
                        break;
                    case 6:
                        this.f2975c = obtainStyledAttributes.getInteger(index, this.f2975c);
                        break;
                    case 7:
                        this.f2979g = obtainStyledAttributes.getFloat(index, this.f2979g);
                        break;
                    case 8:
                        this.f2983k = obtainStyledAttributes.getInteger(index, this.f2983k);
                        break;
                    case 9:
                        this.f2982j = obtainStyledAttributes.getFloat(index, this.f2982j);
                        break;
                    case 10:
                        int i4 = obtainStyledAttributes.peekValue(index).type;
                        if (i4 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            this.f2986n = resourceId2;
                            if (resourceId2 != -1) {
                                this.f2985m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i4 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f2984l = string;
                            if (string.indexOf("/") > 0) {
                                this.f2986n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f2985m = -2;
                                break;
                            } else {
                                this.f2985m = -1;
                                break;
                            }
                        } else {
                            this.f2985m = obtainStyledAttributes.getInteger(index, this.f2986n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class PropertySet {

        /* renamed from: a */
        public boolean f2987a = false;

        /* renamed from: b */
        public int f2988b = 0;

        /* renamed from: c */
        public int f2989c = 0;

        /* renamed from: d */
        public float f2990d = 1.0f;

        /* renamed from: e */
        public float f2991e = Float.NaN;

        /* renamed from: a */
        public void m1468a(PropertySet propertySet) {
            this.f2987a = propertySet.f2987a;
            this.f2988b = propertySet.f2988b;
            this.f2990d = propertySet.f2990d;
            this.f2991e = propertySet.f2991e;
            this.f2989c = propertySet.f2989c;
        }

        /* renamed from: b */
        public void m1469b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0218R.styleable.f3033i);
            this.f2987a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.f2990d = obtainStyledAttributes.getFloat(index, this.f2990d);
                } else if (index == 0) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f2988b);
                    this.f2988b = i3;
                    int[] iArr = ConstraintSet.f2877d;
                    this.f2988b = ConstraintSet.f2877d[i3];
                } else if (index == 4) {
                    this.f2989c = obtainStyledAttributes.getInt(index, this.f2989c);
                } else if (index == 3) {
                    this.f2991e = obtainStyledAttributes.getFloat(index, this.f2991e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class Transform {

        /* renamed from: o */
        public static SparseIntArray f2992o;

        /* renamed from: a */
        public boolean f2993a = false;

        /* renamed from: b */
        public float f2994b = 0.0f;

        /* renamed from: c */
        public float f2995c = 0.0f;

        /* renamed from: d */
        public float f2996d = 0.0f;

        /* renamed from: e */
        public float f2997e = 1.0f;

        /* renamed from: f */
        public float f2998f = 1.0f;

        /* renamed from: g */
        public float f2999g = Float.NaN;

        /* renamed from: h */
        public float f3000h = Float.NaN;

        /* renamed from: i */
        public int f3001i = -1;

        /* renamed from: j */
        public float f3002j = 0.0f;

        /* renamed from: k */
        public float f3003k = 0.0f;

        /* renamed from: l */
        public float f3004l = 0.0f;

        /* renamed from: m */
        public boolean f3005m = false;

        /* renamed from: n */
        public float f3006n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2992o = sparseIntArray;
            sparseIntArray.append(6, 1);
            f2992o.append(7, 2);
            f2992o.append(8, 3);
            f2992o.append(4, 4);
            f2992o.append(5, 5);
            f2992o.append(0, 6);
            f2992o.append(1, 7);
            f2992o.append(2, 8);
            f2992o.append(3, 9);
            f2992o.append(9, 10);
            f2992o.append(10, 11);
            f2992o.append(11, 12);
        }

        /* renamed from: a */
        public void m1470a(Transform transform) {
            this.f2993a = transform.f2993a;
            this.f2994b = transform.f2994b;
            this.f2995c = transform.f2995c;
            this.f2996d = transform.f2996d;
            this.f2997e = transform.f2997e;
            this.f2998f = transform.f2998f;
            this.f2999g = transform.f2999g;
            this.f3000h = transform.f3000h;
            this.f3001i = transform.f3001i;
            this.f3002j = transform.f3002j;
            this.f3003k = transform.f3003k;
            this.f3004l = transform.f3004l;
            this.f3005m = transform.f3005m;
            this.f3006n = transform.f3006n;
        }

        /* renamed from: b */
        public void m1471b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0218R.styleable.f3035k);
            this.f2993a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (f2992o.get(index)) {
                    case 1:
                        this.f2994b = obtainStyledAttributes.getFloat(index, this.f2994b);
                        break;
                    case 2:
                        this.f2995c = obtainStyledAttributes.getFloat(index, this.f2995c);
                        break;
                    case 3:
                        this.f2996d = obtainStyledAttributes.getFloat(index, this.f2996d);
                        break;
                    case 4:
                        this.f2997e = obtainStyledAttributes.getFloat(index, this.f2997e);
                        break;
                    case 5:
                        this.f2998f = obtainStyledAttributes.getFloat(index, this.f2998f);
                        break;
                    case 6:
                        this.f2999g = obtainStyledAttributes.getDimension(index, this.f2999g);
                        break;
                    case 7:
                        this.f3000h = obtainStyledAttributes.getDimension(index, this.f3000h);
                        break;
                    case 8:
                        this.f3002j = obtainStyledAttributes.getDimension(index, this.f3002j);
                        break;
                    case 9:
                        this.f3003k = obtainStyledAttributes.getDimension(index, this.f3003k);
                        break;
                    case 10:
                        this.f3004l = obtainStyledAttributes.getDimension(index, this.f3004l);
                        break;
                    case 11:
                        this.f3005m = true;
                        this.f3006n = obtainStyledAttributes.getDimension(index, this.f3006n);
                        break;
                    case 12:
                        int i3 = this.f3001i;
                        int[] iArr = ConstraintSet.f2877d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f3001i = resourceId;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public class WriteJsonEngine {
    }

    public class WriteXmlEngine {
    }

    static {
        f2878e.append(82, 25);
        f2878e.append(83, 26);
        f2878e.append(85, 29);
        f2878e.append(86, 30);
        f2878e.append(92, 36);
        f2878e.append(91, 35);
        f2878e.append(63, 4);
        f2878e.append(62, 3);
        f2878e.append(58, 1);
        f2878e.append(60, 91);
        f2878e.append(59, 92);
        f2878e.append(101, 6);
        f2878e.append(C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 7);
        f2878e.append(70, 17);
        f2878e.append(71, 18);
        f2878e.append(72, 19);
        f2878e.append(54, 99);
        f2878e.append(0, 27);
        f2878e.append(87, 32);
        f2878e.append(88, 33);
        f2878e.append(69, 10);
        f2878e.append(68, 9);
        f2878e.append(C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 13);
        f2878e.append(C4632R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 16);
        f2878e.append(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 14);
        f2878e.append(C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 11);
        f2878e.append(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 15);
        f2878e.append(C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall, 12);
        f2878e.append(95, 40);
        f2878e.append(80, 39);
        f2878e.append(79, 41);
        f2878e.append(94, 42);
        f2878e.append(78, 20);
        f2878e.append(93, 37);
        f2878e.append(67, 5);
        f2878e.append(81, 87);
        f2878e.append(90, 87);
        f2878e.append(84, 87);
        f2878e.append(61, 87);
        f2878e.append(57, 87);
        f2878e.append(5, 24);
        f2878e.append(7, 28);
        f2878e.append(23, 31);
        f2878e.append(24, 8);
        f2878e.append(6, 34);
        f2878e.append(8, 2);
        f2878e.append(3, 23);
        f2878e.append(4, 21);
        f2878e.append(96, 95);
        f2878e.append(73, 96);
        f2878e.append(2, 22);
        f2878e.append(13, 43);
        f2878e.append(26, 44);
        f2878e.append(21, 45);
        f2878e.append(22, 46);
        f2878e.append(20, 60);
        f2878e.append(18, 47);
        f2878e.append(19, 48);
        f2878e.append(14, 49);
        f2878e.append(15, 50);
        f2878e.append(16, 51);
        f2878e.append(17, 52);
        f2878e.append(25, 53);
        f2878e.append(97, 54);
        f2878e.append(74, 55);
        f2878e.append(98, 56);
        f2878e.append(75, 57);
        f2878e.append(99, 58);
        f2878e.append(76, 59);
        f2878e.append(64, 61);
        f2878e.append(66, 62);
        f2878e.append(65, 63);
        f2878e.append(28, 64);
        f2878e.append(C4632R.styleable.AppCompatTheme_windowFixedHeightMinor, 65);
        f2878e.append(35, 66);
        f2878e.append(C4632R.styleable.AppCompatTheme_windowFixedWidthMajor, 67);
        f2878e.append(C4632R.styleable.AppCompatTheme_toolbarStyle, 79);
        f2878e.append(1, 38);
        f2878e.append(C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 68);
        f2878e.append(100, 69);
        f2878e.append(77, 70);
        f2878e.append(C4632R.styleable.AppCompatTheme_textColorSearchUrl, 97);
        f2878e.append(32, 71);
        f2878e.append(30, 72);
        f2878e.append(31, 73);
        f2878e.append(33, 74);
        f2878e.append(29, 75);
        f2878e.append(C4632R.styleable.AppCompatTheme_tooltipForegroundColor, 76);
        f2878e.append(89, 77);
        f2878e.append(123, 78);
        f2878e.append(56, 80);
        f2878e.append(55, 81);
        f2878e.append(C4632R.styleable.AppCompatTheme_viewInflaterClass, 82);
        f2878e.append(C4632R.styleable.AppCompatTheme_windowFixedHeightMajor, 83);
        f2878e.append(C4632R.styleable.AppCompatTheme_windowActionModeOverlay, 84);
        f2878e.append(C4632R.styleable.AppCompatTheme_windowActionBarOverlay, 85);
        f2878e.append(C4632R.styleable.AppCompatTheme_windowActionBar, 86);
        f2879f.append(85, 6);
        f2879f.append(85, 7);
        f2879f.append(0, 27);
        f2879f.append(89, 13);
        f2879f.append(92, 16);
        f2879f.append(90, 14);
        f2879f.append(87, 11);
        f2879f.append(91, 15);
        f2879f.append(88, 12);
        f2879f.append(78, 40);
        f2879f.append(71, 39);
        f2879f.append(70, 41);
        f2879f.append(77, 42);
        f2879f.append(69, 20);
        f2879f.append(76, 37);
        f2879f.append(60, 5);
        f2879f.append(72, 87);
        f2879f.append(75, 87);
        f2879f.append(73, 87);
        f2879f.append(57, 87);
        f2879f.append(56, 87);
        f2879f.append(5, 24);
        f2879f.append(7, 28);
        f2879f.append(23, 31);
        f2879f.append(24, 8);
        f2879f.append(6, 34);
        f2879f.append(8, 2);
        f2879f.append(3, 23);
        f2879f.append(4, 21);
        f2879f.append(79, 95);
        f2879f.append(64, 96);
        f2879f.append(2, 22);
        f2879f.append(13, 43);
        f2879f.append(26, 44);
        f2879f.append(21, 45);
        f2879f.append(22, 46);
        f2879f.append(20, 60);
        f2879f.append(18, 47);
        f2879f.append(19, 48);
        f2879f.append(14, 49);
        f2879f.append(15, 50);
        f2879f.append(16, 51);
        f2879f.append(17, 52);
        f2879f.append(25, 53);
        f2879f.append(80, 54);
        f2879f.append(65, 55);
        f2879f.append(81, 56);
        f2879f.append(66, 57);
        f2879f.append(82, 58);
        f2879f.append(67, 59);
        f2879f.append(59, 62);
        f2879f.append(58, 63);
        f2879f.append(28, 64);
        f2879f.append(C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall, 65);
        f2879f.append(34, 66);
        f2879f.append(C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 67);
        f2879f.append(96, 79);
        f2879f.append(1, 38);
        f2879f.append(97, 98);
        f2879f.append(95, 68);
        f2879f.append(83, 69);
        f2879f.append(68, 70);
        f2879f.append(32, 71);
        f2879f.append(30, 72);
        f2879f.append(31, 73);
        f2879f.append(33, 74);
        f2879f.append(29, 75);
        f2879f.append(98, 76);
        f2879f.append(74, 77);
        f2879f.append(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 78);
        f2879f.append(55, 80);
        f2879f.append(54, 81);
        f2879f.append(100, 82);
        f2879f.append(C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 83);
        f2879f.append(C4632R.styleable.AppCompatTheme_textAppearanceListItem, 84);
        f2879f.append(C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 85);
        f2879f.append(101, 86);
        f2879f.append(94, 97);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m1447h(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.m1447h(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: i */
    public static void m1448i(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i2 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.f2789G = str;
    }

    /* renamed from: a */
    public void m1449a(ConstraintLayout constraintLayout) {
        m1450b(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* renamed from: b */
    public void m1450b(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2882c.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id2 = childAt.getId();
            if (!this.f2882c.containsKey(Integer.valueOf(id2))) {
                StringBuilder m24u = C0000a.m24u("id unknown ");
                m24u.append(Debug.m1389c(childAt));
                Log.w("ConstraintSet", m24u.toString());
            } else {
                if (this.f2881b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f2882c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        Constraint constraint = this.f2882c.get(Integer.valueOf(id2));
                        if (constraint != null) {
                            if (childAt instanceof Barrier) {
                                constraint.f2887e.f2947i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(constraint.f2887e.f2943g0);
                                barrier.setMargin(constraint.f2887e.f2945h0);
                                barrier.setAllowsGoneWidget(constraint.f2887e.f2959o0);
                                Layout layout = constraint.f2887e;
                                int[] iArr = layout.f2949j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = layout.f2951k0;
                                    if (str != null) {
                                        layout.f2949j0 = m1452d(barrier, str);
                                        barrier.setReferencedIds(constraint.f2887e.f2949j0);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.m1441a();
                            constraint.m1456a(layoutParams);
                            if (z) {
                                ConstraintAttribute.m1419b(childAt, constraint.f2889g);
                            }
                            childAt.setLayoutParams(layoutParams);
                            PropertySet propertySet = constraint.f2885c;
                            if (propertySet.f2989c == 0) {
                                childAt.setVisibility(propertySet.f2988b);
                            }
                            childAt.setAlpha(constraint.f2885c.f2990d);
                            childAt.setRotation(constraint.f2888f.f2994b);
                            childAt.setRotationX(constraint.f2888f.f2995c);
                            childAt.setRotationY(constraint.f2888f.f2996d);
                            childAt.setScaleX(constraint.f2888f.f2997e);
                            childAt.setScaleY(constraint.f2888f.f2998f);
                            Transform transform = constraint.f2888f;
                            if (transform.f3001i != -1) {
                                if (((View) childAt.getParent()).findViewById(constraint.f2888f.f3001i) != null) {
                                    float bottom = (r4.getBottom() + r4.getTop()) / 2.0f;
                                    float right = (r4.getRight() + r4.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(transform.f2999g)) {
                                    childAt.setPivotX(constraint.f2888f.f2999g);
                                }
                                if (!Float.isNaN(constraint.f2888f.f3000h)) {
                                    childAt.setPivotY(constraint.f2888f.f3000h);
                                }
                            }
                            childAt.setTranslationX(constraint.f2888f.f3002j);
                            childAt.setTranslationY(constraint.f2888f.f3003k);
                            childAt.setTranslationZ(constraint.f2888f.f3004l);
                            Transform transform2 = constraint.f2888f;
                            if (transform2.f3005m) {
                                childAt.setElevation(transform2.f3006n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            Constraint constraint2 = this.f2882c.get(num);
            if (constraint2 != null) {
                if (constraint2.f2887e.f2947i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    Layout layout2 = constraint2.f2887e;
                    int[] iArr2 = layout2.f2949j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = layout2.f2951k0;
                        if (str2 != null) {
                            layout2.f2949j0 = m1452d(barrier2, str2);
                            barrier2.setReferencedIds(constraint2.f2887e.f2949j0);
                        }
                    }
                    barrier2.setType(constraint2.f2887e.f2943g0);
                    barrier2.setMargin(constraint2.f2887e.f2945h0);
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m1429p();
                    constraint2.m1456a(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (constraint2.f2887e.f2930a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.m1456a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).mo1381h(constraintLayout);
            }
        }
    }

    /* renamed from: c */
    public void m1451c(ConstraintLayout constraintLayout) {
        ConstraintSet constraintSet = this;
        int childCount = constraintLayout.getChildCount();
        constraintSet.f2882c.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (constraintSet.f2881b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!constraintSet.f2882c.containsKey(Integer.valueOf(id2))) {
                constraintSet.f2882c.put(Integer.valueOf(id2), new Constraint());
            }
            Constraint constraint = constraintSet.f2882c.get(Integer.valueOf(id2));
            if (constraint != null) {
                HashMap<String, ConstraintAttribute> hashMap = constraintSet.f2880a;
                HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    ConstraintAttribute constraintAttribute = hashMap.get(str);
                    try {
                    } catch (IllegalAccessException e2) {
                        e = e2;
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                    } catch (InvocationTargetException e4) {
                        e = e4;
                    }
                    if (str.equals("BackgroundColor")) {
                        hashMap2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        try {
                            hashMap2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e5) {
                            e = e5;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e6) {
                            e = e6;
                            e.printStackTrace();
                        } catch (InvocationTargetException e7) {
                            e = e7;
                            e.printStackTrace();
                        }
                    }
                }
                constraint.f2889g = hashMap2;
                constraint.m1458c(id2, layoutParams);
                constraint.f2885c.f2988b = childAt.getVisibility();
                constraint.f2885c.f2990d = childAt.getAlpha();
                constraint.f2888f.f2994b = childAt.getRotation();
                constraint.f2888f.f2995c = childAt.getRotationX();
                constraint.f2888f.f2996d = childAt.getRotationY();
                constraint.f2888f.f2997e = childAt.getScaleX();
                constraint.f2888f.f2998f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    Transform transform = constraint.f2888f;
                    transform.f2999g = pivotX;
                    transform.f3000h = pivotY;
                }
                constraint.f2888f.f3002j = childAt.getTranslationX();
                constraint.f2888f.f3003k = childAt.getTranslationY();
                constraint.f2888f.f3004l = childAt.getTranslationZ();
                Transform transform2 = constraint.f2888f;
                if (transform2.f3005m) {
                    transform2.f3006n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    constraint.f2887e.f2959o0 = barrier.getAllowsGoneWidget();
                    constraint.f2887e.f2949j0 = barrier.getReferencedIds();
                    constraint.f2887e.f2943g0 = barrier.getType();
                    constraint.f2887e.f2945h0 = barrier.getMargin();
                }
            }
            i2++;
            constraintSet = this;
        }
    }

    /* renamed from: d */
    public final int[] m1452d(View view, String str) {
        int i2;
        Object m1432d;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = C0218R.id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m1432d = ((ConstraintLayout) view.getParent()).m1432d(0, trim)) != null && (m1432d instanceof Integer)) {
                i2 = ((Integer) m1432d).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    /* renamed from: e */
    public final Constraint m1453e(Context context, AttributeSet attributeSet, boolean z) {
        Constraint constraint = new Constraint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? C0218R.styleable.f3027c : C0218R.styleable.f3025a);
        int i2 = 3;
        int i3 = 1;
        int i4 = 0;
        if (z) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            Constraint.Delta delta = new Constraint.Delta();
            constraint.f2890h = delta;
            constraint.f2886d.f2973a = false;
            constraint.f2887e.f2932b = false;
            constraint.f2885c.f2987a = false;
            constraint.f2888f.f2993a = false;
            int i5 = 0;
            while (i5 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i5);
                switch (f2879f.get(index)) {
                    case 2:
                        delta.m1461b(2, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2913J));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case C4632R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                    case C4632R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder m24u = C0000a.m24u("Unknown attribute 0x");
                        m24u.append(Integer.toHexString(index));
                        m24u.append("   ");
                        m24u.append(f2878e.get(index));
                        Log.w("ConstraintSet", m24u.toString());
                        break;
                    case 5:
                        delta.m1462c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        delta.m1461b(6, obtainStyledAttributes.getDimensionPixelOffset(index, constraint.f2887e.f2907D));
                        break;
                    case 7:
                        delta.m1461b(7, obtainStyledAttributes.getDimensionPixelOffset(index, constraint.f2887e.f2908E));
                        break;
                    case 8:
                        delta.m1461b(8, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2914K));
                        break;
                    case 11:
                        delta.m1461b(11, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2920Q));
                        break;
                    case 12:
                        delta.m1461b(12, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2921R));
                        break;
                    case 13:
                        delta.m1461b(13, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2917N));
                        break;
                    case 14:
                        delta.m1461b(14, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2919P));
                        break;
                    case 15:
                        delta.m1461b(15, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2922S));
                        break;
                    case 16:
                        delta.m1461b(16, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2918O));
                        break;
                    case 17:
                        delta.m1461b(17, obtainStyledAttributes.getDimensionPixelOffset(index, constraint.f2887e.f2938e));
                        break;
                    case 18:
                        delta.m1461b(18, obtainStyledAttributes.getDimensionPixelOffset(index, constraint.f2887e.f2940f));
                        break;
                    case 19:
                        delta.m1460a(19, obtainStyledAttributes.getFloat(index, constraint.f2887e.f2942g));
                        break;
                    case 20:
                        delta.m1460a(20, obtainStyledAttributes.getFloat(index, constraint.f2887e.f2969x));
                        break;
                    case 21:
                        delta.m1461b(21, obtainStyledAttributes.getLayoutDimension(index, constraint.f2887e.f2936d));
                        break;
                    case 22:
                        delta.m1461b(22, f2877d[obtainStyledAttributes.getInt(index, constraint.f2885c.f2988b)]);
                        break;
                    case 23:
                        delta.m1461b(23, obtainStyledAttributes.getLayoutDimension(index, constraint.f2887e.f2934c));
                        break;
                    case 24:
                        delta.m1461b(24, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2910G));
                        break;
                    case 27:
                        delta.m1461b(27, obtainStyledAttributes.getInt(index, constraint.f2887e.f2909F));
                        break;
                    case 28:
                        delta.m1461b(28, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2911H));
                        break;
                    case 31:
                        delta.m1461b(31, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2915L));
                        break;
                    case 34:
                        delta.m1461b(34, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2912I));
                        break;
                    case 37:
                        delta.m1460a(37, obtainStyledAttributes.getFloat(index, constraint.f2887e.f2970y));
                        break;
                    case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        int resourceId = obtainStyledAttributes.getResourceId(index, constraint.f2883a);
                        constraint.f2883a = resourceId;
                        delta.m1461b(38, resourceId);
                        break;
                    case 39:
                        delta.m1460a(39, obtainStyledAttributes.getFloat(index, constraint.f2887e.f2925V));
                        break;
                    case 40:
                        delta.m1460a(40, obtainStyledAttributes.getFloat(index, constraint.f2887e.f2924U));
                        break;
                    case 41:
                        delta.m1461b(41, obtainStyledAttributes.getInt(index, constraint.f2887e.f2926W));
                        break;
                    case 42:
                        delta.m1461b(42, obtainStyledAttributes.getInt(index, constraint.f2887e.f2927X));
                        break;
                    case 43:
                        delta.m1460a(43, obtainStyledAttributes.getFloat(index, constraint.f2885c.f2990d));
                        break;
                    case 44:
                        delta.m1463d(44, true);
                        delta.m1460a(44, obtainStyledAttributes.getDimension(index, constraint.f2888f.f3006n));
                        break;
                    case 45:
                        delta.m1460a(45, obtainStyledAttributes.getFloat(index, constraint.f2888f.f2995c));
                        break;
                    case 46:
                        delta.m1460a(46, obtainStyledAttributes.getFloat(index, constraint.f2888f.f2996d));
                        break;
                    case 47:
                        delta.m1460a(47, obtainStyledAttributes.getFloat(index, constraint.f2888f.f2997e));
                        break;
                    case 48:
                        delta.m1460a(48, obtainStyledAttributes.getFloat(index, constraint.f2888f.f2998f));
                        break;
                    case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        delta.m1460a(49, obtainStyledAttributes.getDimension(index, constraint.f2888f.f2999g));
                        break;
                    case 50:
                        delta.m1460a(50, obtainStyledAttributes.getDimension(index, constraint.f2888f.f3000h));
                        break;
                    case 51:
                        delta.m1460a(51, obtainStyledAttributes.getDimension(index, constraint.f2888f.f3002j));
                        break;
                    case 52:
                        delta.m1460a(52, obtainStyledAttributes.getDimension(index, constraint.f2888f.f3003k));
                        break;
                    case 53:
                        delta.m1460a(53, obtainStyledAttributes.getDimension(index, constraint.f2888f.f3004l));
                        break;
                    case 54:
                        delta.m1461b(54, obtainStyledAttributes.getInt(index, constraint.f2887e.f2928Y));
                        break;
                    case 55:
                        delta.m1461b(55, obtainStyledAttributes.getInt(index, constraint.f2887e.f2929Z));
                        break;
                    case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                        delta.m1461b(56, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2931a0));
                        break;
                    case 57:
                        delta.m1461b(57, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2933b0));
                        break;
                    case 58:
                        delta.m1461b(58, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2935c0));
                        break;
                    case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        delta.m1461b(59, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2937d0));
                        break;
                    case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        delta.m1460a(60, obtainStyledAttributes.getFloat(index, constraint.f2888f.f2994b));
                        break;
                    case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        delta.m1461b(62, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2905B));
                        break;
                    case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        delta.m1460a(63, obtainStyledAttributes.getFloat(index, constraint.f2887e.f2906C));
                        break;
                    case 64:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, constraint.f2886d.f2974b);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        delta.m1461b(64, resourceId2);
                        break;
                    case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            delta.m1462c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            delta.m1462c(65, Easing.f2023c[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        delta.m1461b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        delta.m1460a(67, obtainStyledAttributes.getFloat(index, constraint.f2886d.f2981i));
                        break;
                    case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        delta.m1460a(68, obtainStyledAttributes.getFloat(index, constraint.f2885c.f2991e));
                        break;
                    case 69:
                        delta.m1460a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case C4632R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                        delta.m1460a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case C4632R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                        delta.m1461b(72, obtainStyledAttributes.getInt(index, constraint.f2887e.f2943g0));
                        break;
                    case C4632R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                        delta.m1461b(73, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2945h0));
                        break;
                    case C4632R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                        delta.m1462c(74, obtainStyledAttributes.getString(index));
                        break;
                    case C4632R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                        delta.m1463d(75, obtainStyledAttributes.getBoolean(index, constraint.f2887e.f2959o0));
                        break;
                    case C4632R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                        delta.m1461b(76, obtainStyledAttributes.getInt(index, constraint.f2886d.f2977e));
                        break;
                    case C4632R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                        delta.m1462c(77, obtainStyledAttributes.getString(index));
                        break;
                    case C4632R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                        delta.m1461b(78, obtainStyledAttributes.getInt(index, constraint.f2885c.f2989c));
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                        delta.m1460a(79, obtainStyledAttributes.getFloat(index, constraint.f2886d.f2979g));
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        delta.m1463d(80, obtainStyledAttributes.getBoolean(index, constraint.f2887e.f2955m0));
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                        delta.m1463d(81, obtainStyledAttributes.getBoolean(index, constraint.f2887e.f2957n0));
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                        delta.m1461b(82, obtainStyledAttributes.getInteger(index, constraint.f2886d.f2975c));
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, constraint.f2888f.f3001i);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        delta.m1461b(83, resourceId3);
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                        delta.m1461b(84, obtainStyledAttributes.getInteger(index, constraint.f2886d.f2983k));
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                        delta.m1460a(85, obtainStyledAttributes.getFloat(index, constraint.f2886d.f2982j));
                        break;
                    case C4632R.styleable.AppCompatTheme_panelBackground /* 86 */:
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == i3) {
                            constraint.f2886d.f2986n = obtainStyledAttributes.getResourceId(index, -1);
                            delta.m1461b(89, constraint.f2886d.f2986n);
                            Motion motion = constraint.f2886d;
                            if (motion.f2986n != -1) {
                                motion.f2985m = -2;
                                delta.m1461b(88, -2);
                                break;
                            } else {
                                break;
                            }
                        } else if (i6 == 3) {
                            constraint.f2886d.f2984l = obtainStyledAttributes.getString(index);
                            delta.m1462c(90, constraint.f2886d.f2984l);
                            if (constraint.f2886d.f2984l.indexOf("/") > 0) {
                                constraint.f2886d.f2986n = obtainStyledAttributes.getResourceId(index, -1);
                                delta.m1461b(89, constraint.f2886d.f2986n);
                                constraint.f2886d.f2985m = -2;
                                delta.m1461b(88, -2);
                                break;
                            } else {
                                constraint.f2886d.f2985m = -1;
                                delta.m1461b(88, -1);
                                break;
                            }
                        } else {
                            Motion motion2 = constraint.f2886d;
                            motion2.f2985m = obtainStyledAttributes.getInteger(index, motion2.f2986n);
                            delta.m1461b(88, constraint.f2886d.f2985m);
                            break;
                        }
                    case C4632R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                        StringBuilder m24u2 = C0000a.m24u("unused attribute 0x");
                        m24u2.append(Integer.toHexString(index));
                        m24u2.append("   ");
                        m24u2.append(f2878e.get(index));
                        Log.w("ConstraintSet", m24u2.toString());
                        break;
                    case 93:
                        delta.m1461b(93, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2916M));
                        break;
                    case C4632R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                        delta.m1461b(94, obtainStyledAttributes.getDimensionPixelSize(index, constraint.f2887e.f2923T));
                        break;
                    case C4632R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                        m1447h(delta, obtainStyledAttributes, index, i4);
                        break;
                    case C4632R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                        m1447h(delta, obtainStyledAttributes, index, i3);
                        break;
                    case C4632R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        delta.m1461b(97, obtainStyledAttributes.getInt(index, constraint.f2887e.f2961p0));
                        break;
                    case C4632R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                        int i7 = MotionLayout.f2567m0;
                        if (obtainStyledAttributes.peekValue(index).type == i2) {
                            constraint.f2884b = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            constraint.f2883a = obtainStyledAttributes.getResourceId(index, constraint.f2883a);
                            break;
                        }
                    case C4632R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                        delta.m1463d(99, obtainStyledAttributes.getBoolean(index, constraint.f2887e.f2944h));
                        break;
                }
                i5++;
                i2 = 3;
                i3 = 1;
                i4 = 0;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount2; i8++) {
                int index2 = obtainStyledAttributes.getIndex(i8);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    constraint.f2886d.f2973a = true;
                    constraint.f2887e.f2932b = true;
                    constraint.f2885c.f2987a = true;
                    constraint.f2888f.f2993a = true;
                }
                switch (f2878e.get(index2)) {
                    case 1:
                        Layout layout = constraint.f2887e;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index2, layout.f2962q);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout.f2962q = resourceId4;
                        break;
                    case 2:
                        Layout layout2 = constraint.f2887e;
                        layout2.f2913J = obtainStyledAttributes.getDimensionPixelSize(index2, layout2.f2913J);
                        break;
                    case 3:
                        Layout layout3 = constraint.f2887e;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index2, layout3.f2960p);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout3.f2960p = resourceId5;
                        break;
                    case 4:
                        Layout layout4 = constraint.f2887e;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index2, layout4.f2958o);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout4.f2958o = resourceId6;
                        break;
                    case 5:
                        constraint.f2887e.f2971z = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        Layout layout5 = constraint.f2887e;
                        layout5.f2907D = obtainStyledAttributes.getDimensionPixelOffset(index2, layout5.f2907D);
                        break;
                    case 7:
                        Layout layout6 = constraint.f2887e;
                        layout6.f2908E = obtainStyledAttributes.getDimensionPixelOffset(index2, layout6.f2908E);
                        break;
                    case 8:
                        Layout layout7 = constraint.f2887e;
                        layout7.f2914K = obtainStyledAttributes.getDimensionPixelSize(index2, layout7.f2914K);
                        break;
                    case 9:
                        Layout layout8 = constraint.f2887e;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index2, layout8.f2968w);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout8.f2968w = resourceId7;
                        break;
                    case 10:
                        Layout layout9 = constraint.f2887e;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index2, layout9.f2967v);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout9.f2967v = resourceId8;
                        break;
                    case 11:
                        Layout layout10 = constraint.f2887e;
                        layout10.f2920Q = obtainStyledAttributes.getDimensionPixelSize(index2, layout10.f2920Q);
                        break;
                    case 12:
                        Layout layout11 = constraint.f2887e;
                        layout11.f2921R = obtainStyledAttributes.getDimensionPixelSize(index2, layout11.f2921R);
                        break;
                    case 13:
                        Layout layout12 = constraint.f2887e;
                        layout12.f2917N = obtainStyledAttributes.getDimensionPixelSize(index2, layout12.f2917N);
                        break;
                    case 14:
                        Layout layout13 = constraint.f2887e;
                        layout13.f2919P = obtainStyledAttributes.getDimensionPixelSize(index2, layout13.f2919P);
                        break;
                    case 15:
                        Layout layout14 = constraint.f2887e;
                        layout14.f2922S = obtainStyledAttributes.getDimensionPixelSize(index2, layout14.f2922S);
                        break;
                    case 16:
                        Layout layout15 = constraint.f2887e;
                        layout15.f2918O = obtainStyledAttributes.getDimensionPixelSize(index2, layout15.f2918O);
                        break;
                    case 17:
                        Layout layout16 = constraint.f2887e;
                        layout16.f2938e = obtainStyledAttributes.getDimensionPixelOffset(index2, layout16.f2938e);
                        break;
                    case 18:
                        Layout layout17 = constraint.f2887e;
                        layout17.f2940f = obtainStyledAttributes.getDimensionPixelOffset(index2, layout17.f2940f);
                        break;
                    case 19:
                        Layout layout18 = constraint.f2887e;
                        layout18.f2942g = obtainStyledAttributes.getFloat(index2, layout18.f2942g);
                        break;
                    case 20:
                        Layout layout19 = constraint.f2887e;
                        layout19.f2969x = obtainStyledAttributes.getFloat(index2, layout19.f2969x);
                        break;
                    case 21:
                        Layout layout20 = constraint.f2887e;
                        layout20.f2936d = obtainStyledAttributes.getLayoutDimension(index2, layout20.f2936d);
                        break;
                    case 22:
                        PropertySet propertySet = constraint.f2885c;
                        propertySet.f2988b = obtainStyledAttributes.getInt(index2, propertySet.f2988b);
                        PropertySet propertySet2 = constraint.f2885c;
                        propertySet2.f2988b = f2877d[propertySet2.f2988b];
                        break;
                    case 23:
                        Layout layout21 = constraint.f2887e;
                        layout21.f2934c = obtainStyledAttributes.getLayoutDimension(index2, layout21.f2934c);
                        break;
                    case 24:
                        Layout layout22 = constraint.f2887e;
                        layout22.f2910G = obtainStyledAttributes.getDimensionPixelSize(index2, layout22.f2910G);
                        break;
                    case 25:
                        Layout layout23 = constraint.f2887e;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index2, layout23.f2946i);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout23.f2946i = resourceId9;
                        break;
                    case 26:
                        Layout layout24 = constraint.f2887e;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index2, layout24.f2948j);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout24.f2948j = resourceId10;
                        break;
                    case 27:
                        Layout layout25 = constraint.f2887e;
                        layout25.f2909F = obtainStyledAttributes.getInt(index2, layout25.f2909F);
                        break;
                    case 28:
                        Layout layout26 = constraint.f2887e;
                        layout26.f2911H = obtainStyledAttributes.getDimensionPixelSize(index2, layout26.f2911H);
                        break;
                    case 29:
                        Layout layout27 = constraint.f2887e;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index2, layout27.f2950k);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout27.f2950k = resourceId11;
                        break;
                    case 30:
                        Layout layout28 = constraint.f2887e;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index2, layout28.f2952l);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout28.f2952l = resourceId12;
                        break;
                    case 31:
                        Layout layout29 = constraint.f2887e;
                        layout29.f2915L = obtainStyledAttributes.getDimensionPixelSize(index2, layout29.f2915L);
                        break;
                    case 32:
                        Layout layout30 = constraint.f2887e;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index2, layout30.f2965t);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout30.f2965t = resourceId13;
                        break;
                    case 33:
                        Layout layout31 = constraint.f2887e;
                        int resourceId14 = obtainStyledAttributes.getResourceId(index2, layout31.f2966u);
                        if (resourceId14 == -1) {
                            resourceId14 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout31.f2966u = resourceId14;
                        break;
                    case 34:
                        Layout layout32 = constraint.f2887e;
                        layout32.f2912I = obtainStyledAttributes.getDimensionPixelSize(index2, layout32.f2912I);
                        break;
                    case 35:
                        Layout layout33 = constraint.f2887e;
                        int resourceId15 = obtainStyledAttributes.getResourceId(index2, layout33.f2956n);
                        if (resourceId15 == -1) {
                            resourceId15 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout33.f2956n = resourceId15;
                        break;
                    case 36:
                        Layout layout34 = constraint.f2887e;
                        int resourceId16 = obtainStyledAttributes.getResourceId(index2, layout34.f2954m);
                        if (resourceId16 == -1) {
                            resourceId16 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout34.f2954m = resourceId16;
                        break;
                    case 37:
                        Layout layout35 = constraint.f2887e;
                        layout35.f2970y = obtainStyledAttributes.getFloat(index2, layout35.f2970y);
                        break;
                    case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        constraint.f2883a = obtainStyledAttributes.getResourceId(index2, constraint.f2883a);
                        break;
                    case 39:
                        Layout layout36 = constraint.f2887e;
                        layout36.f2925V = obtainStyledAttributes.getFloat(index2, layout36.f2925V);
                        break;
                    case 40:
                        Layout layout37 = constraint.f2887e;
                        layout37.f2924U = obtainStyledAttributes.getFloat(index2, layout37.f2924U);
                        break;
                    case 41:
                        Layout layout38 = constraint.f2887e;
                        layout38.f2926W = obtainStyledAttributes.getInt(index2, layout38.f2926W);
                        break;
                    case 42:
                        Layout layout39 = constraint.f2887e;
                        layout39.f2927X = obtainStyledAttributes.getInt(index2, layout39.f2927X);
                        break;
                    case 43:
                        PropertySet propertySet3 = constraint.f2885c;
                        propertySet3.f2990d = obtainStyledAttributes.getFloat(index2, propertySet3.f2990d);
                        break;
                    case 44:
                        Transform transform = constraint.f2888f;
                        transform.f3005m = true;
                        transform.f3006n = obtainStyledAttributes.getDimension(index2, transform.f3006n);
                        break;
                    case 45:
                        Transform transform2 = constraint.f2888f;
                        transform2.f2995c = obtainStyledAttributes.getFloat(index2, transform2.f2995c);
                        break;
                    case 46:
                        Transform transform3 = constraint.f2888f;
                        transform3.f2996d = obtainStyledAttributes.getFloat(index2, transform3.f2996d);
                        break;
                    case 47:
                        Transform transform4 = constraint.f2888f;
                        transform4.f2997e = obtainStyledAttributes.getFloat(index2, transform4.f2997e);
                        break;
                    case 48:
                        Transform transform5 = constraint.f2888f;
                        transform5.f2998f = obtainStyledAttributes.getFloat(index2, transform5.f2998f);
                        break;
                    case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        Transform transform6 = constraint.f2888f;
                        transform6.f2999g = obtainStyledAttributes.getDimension(index2, transform6.f2999g);
                        break;
                    case 50:
                        Transform transform7 = constraint.f2888f;
                        transform7.f3000h = obtainStyledAttributes.getDimension(index2, transform7.f3000h);
                        break;
                    case 51:
                        Transform transform8 = constraint.f2888f;
                        transform8.f3002j = obtainStyledAttributes.getDimension(index2, transform8.f3002j);
                        break;
                    case 52:
                        Transform transform9 = constraint.f2888f;
                        transform9.f3003k = obtainStyledAttributes.getDimension(index2, transform9.f3003k);
                        break;
                    case 53:
                        Transform transform10 = constraint.f2888f;
                        transform10.f3004l = obtainStyledAttributes.getDimension(index2, transform10.f3004l);
                        break;
                    case 54:
                        Layout layout40 = constraint.f2887e;
                        layout40.f2928Y = obtainStyledAttributes.getInt(index2, layout40.f2928Y);
                        break;
                    case 55:
                        Layout layout41 = constraint.f2887e;
                        layout41.f2929Z = obtainStyledAttributes.getInt(index2, layout41.f2929Z);
                        break;
                    case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                        Layout layout42 = constraint.f2887e;
                        layout42.f2931a0 = obtainStyledAttributes.getDimensionPixelSize(index2, layout42.f2931a0);
                        break;
                    case 57:
                        Layout layout43 = constraint.f2887e;
                        layout43.f2933b0 = obtainStyledAttributes.getDimensionPixelSize(index2, layout43.f2933b0);
                        break;
                    case 58:
                        Layout layout44 = constraint.f2887e;
                        layout44.f2935c0 = obtainStyledAttributes.getDimensionPixelSize(index2, layout44.f2935c0);
                        break;
                    case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        Layout layout45 = constraint.f2887e;
                        layout45.f2937d0 = obtainStyledAttributes.getDimensionPixelSize(index2, layout45.f2937d0);
                        break;
                    case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        Transform transform11 = constraint.f2888f;
                        transform11.f2994b = obtainStyledAttributes.getFloat(index2, transform11.f2994b);
                        break;
                    case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        Layout layout46 = constraint.f2887e;
                        int resourceId17 = obtainStyledAttributes.getResourceId(index2, layout46.f2904A);
                        if (resourceId17 == -1) {
                            resourceId17 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout46.f2904A = resourceId17;
                        break;
                    case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        Layout layout47 = constraint.f2887e;
                        layout47.f2905B = obtainStyledAttributes.getDimensionPixelSize(index2, layout47.f2905B);
                        break;
                    case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        Layout layout48 = constraint.f2887e;
                        layout48.f2906C = obtainStyledAttributes.getFloat(index2, layout48.f2906C);
                        break;
                    case 64:
                        Motion motion3 = constraint.f2886d;
                        int resourceId18 = obtainStyledAttributes.getResourceId(index2, motion3.f2974b);
                        if (resourceId18 == -1) {
                            resourceId18 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        motion3.f2974b = resourceId18;
                        break;
                    case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            constraint.f2886d.f2976d = obtainStyledAttributes.getString(index2);
                            break;
                        } else {
                            constraint.f2886d.f2976d = Easing.f2023c[obtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        }
                    case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        constraint.f2886d.f2978f = obtainStyledAttributes.getInt(index2, 0);
                        break;
                    case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        Motion motion4 = constraint.f2886d;
                        motion4.f2981i = obtainStyledAttributes.getFloat(index2, motion4.f2981i);
                        break;
                    case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        PropertySet propertySet4 = constraint.f2885c;
                        propertySet4.f2991e = obtainStyledAttributes.getFloat(index2, propertySet4.f2991e);
                        break;
                    case 69:
                        constraint.f2887e.f2939e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case C4632R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                        constraint.f2887e.f2941f0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case C4632R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                        Layout layout49 = constraint.f2887e;
                        layout49.f2943g0 = obtainStyledAttributes.getInt(index2, layout49.f2943g0);
                        break;
                    case C4632R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                        Layout layout50 = constraint.f2887e;
                        layout50.f2945h0 = obtainStyledAttributes.getDimensionPixelSize(index2, layout50.f2945h0);
                        break;
                    case C4632R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                        constraint.f2887e.f2951k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case C4632R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                        Layout layout51 = constraint.f2887e;
                        layout51.f2959o0 = obtainStyledAttributes.getBoolean(index2, layout51.f2959o0);
                        break;
                    case C4632R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                        Motion motion5 = constraint.f2886d;
                        motion5.f2977e = obtainStyledAttributes.getInt(index2, motion5.f2977e);
                        break;
                    case C4632R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                        constraint.f2887e.f2953l0 = obtainStyledAttributes.getString(index2);
                        break;
                    case C4632R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                        PropertySet propertySet5 = constraint.f2885c;
                        propertySet5.f2989c = obtainStyledAttributes.getInt(index2, propertySet5.f2989c);
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                        Motion motion6 = constraint.f2886d;
                        motion6.f2979g = obtainStyledAttributes.getFloat(index2, motion6.f2979g);
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        Layout layout52 = constraint.f2887e;
                        layout52.f2955m0 = obtainStyledAttributes.getBoolean(index2, layout52.f2955m0);
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                        Layout layout53 = constraint.f2887e;
                        layout53.f2957n0 = obtainStyledAttributes.getBoolean(index2, layout53.f2957n0);
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                        Motion motion7 = constraint.f2886d;
                        motion7.f2975c = obtainStyledAttributes.getInteger(index2, motion7.f2975c);
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                        Transform transform12 = constraint.f2888f;
                        int resourceId19 = obtainStyledAttributes.getResourceId(index2, transform12.f3001i);
                        if (resourceId19 == -1) {
                            resourceId19 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        transform12.f3001i = resourceId19;
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                        Motion motion8 = constraint.f2886d;
                        motion8.f2983k = obtainStyledAttributes.getInteger(index2, motion8.f2983k);
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                        Motion motion9 = constraint.f2886d;
                        motion9.f2982j = obtainStyledAttributes.getFloat(index2, motion9.f2982j);
                        break;
                    case C4632R.styleable.AppCompatTheme_panelBackground /* 86 */:
                        int i9 = obtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            constraint.f2886d.f2986n = obtainStyledAttributes.getResourceId(index2, -1);
                            Motion motion10 = constraint.f2886d;
                            if (motion10.f2986n != -1) {
                                motion10.f2985m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i9 == 3) {
                            constraint.f2886d.f2984l = obtainStyledAttributes.getString(index2);
                            if (constraint.f2886d.f2984l.indexOf("/") > 0) {
                                constraint.f2886d.f2986n = obtainStyledAttributes.getResourceId(index2, -1);
                                constraint.f2886d.f2985m = -2;
                                break;
                            } else {
                                constraint.f2886d.f2985m = -1;
                                break;
                            }
                        } else {
                            Motion motion11 = constraint.f2886d;
                            motion11.f2985m = obtainStyledAttributes.getInteger(index2, motion11.f2986n);
                            break;
                        }
                    case C4632R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                        StringBuilder m24u3 = C0000a.m24u("unused attribute 0x");
                        m24u3.append(Integer.toHexString(index2));
                        m24u3.append("   ");
                        m24u3.append(f2878e.get(index2));
                        Log.w("ConstraintSet", m24u3.toString());
                        break;
                    case C4632R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                    case C4632R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                    case 90:
                    default:
                        StringBuilder m24u4 = C0000a.m24u("Unknown attribute 0x");
                        m24u4.append(Integer.toHexString(index2));
                        m24u4.append("   ");
                        m24u4.append(f2878e.get(index2));
                        Log.w("ConstraintSet", m24u4.toString());
                        break;
                    case 91:
                        Layout layout54 = constraint.f2887e;
                        int resourceId20 = obtainStyledAttributes.getResourceId(index2, layout54.f2963r);
                        if (resourceId20 == -1) {
                            resourceId20 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout54.f2963r = resourceId20;
                        break;
                    case 92:
                        Layout layout55 = constraint.f2887e;
                        int resourceId21 = obtainStyledAttributes.getResourceId(index2, layout55.f2964s);
                        if (resourceId21 == -1) {
                            resourceId21 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        layout55.f2964s = resourceId21;
                        break;
                    case 93:
                        Layout layout56 = constraint.f2887e;
                        layout56.f2916M = obtainStyledAttributes.getDimensionPixelSize(index2, layout56.f2916M);
                        break;
                    case C4632R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                        Layout layout57 = constraint.f2887e;
                        layout57.f2923T = obtainStyledAttributes.getDimensionPixelSize(index2, layout57.f2923T);
                        break;
                    case C4632R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                        m1447h(constraint.f2887e, obtainStyledAttributes, index2, 0);
                        break;
                    case C4632R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                        m1447h(constraint.f2887e, obtainStyledAttributes, index2, 1);
                        break;
                    case C4632R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        Layout layout58 = constraint.f2887e;
                        layout58.f2961p0 = obtainStyledAttributes.getInt(index2, layout58.f2961p0);
                        break;
                }
            }
            Layout layout59 = constraint.f2887e;
            if (layout59.f2951k0 != null) {
                layout59.f2949j0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return constraint;
    }

    /* renamed from: f */
    public final Constraint m1454f(int i2) {
        if (!this.f2882c.containsKey(Integer.valueOf(i2))) {
            this.f2882c.put(Integer.valueOf(i2), new Constraint());
        }
        return this.f2882c.get(Integer.valueOf(i2));
    }

    /* renamed from: g */
    public void m1455g(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    Constraint m1453e = m1453e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        m1453e.f2887e.f2930a = true;
                    }
                    this.f2882c.put(Integer.valueOf(m1453e.f2883a), m1453e);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
