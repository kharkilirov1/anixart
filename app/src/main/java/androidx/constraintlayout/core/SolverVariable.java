package androidx.constraintlayout.core;

import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {

    /* renamed from: n */
    public static int f1929n = 1;

    /* renamed from: b */
    public boolean f1930b;

    /* renamed from: f */
    public float f1934f;

    /* renamed from: j */
    public Type f1938j;

    /* renamed from: c */
    public int f1931c = -1;

    /* renamed from: d */
    public int f1932d = -1;

    /* renamed from: e */
    public int f1933e = 0;

    /* renamed from: g */
    public boolean f1935g = false;

    /* renamed from: h */
    public float[] f1936h = new float[9];

    /* renamed from: i */
    public float[] f1937i = new float[9];

    /* renamed from: k */
    public ArrayRow[] f1939k = new ArrayRow[16];

    /* renamed from: l */
    public int f1940l = 0;

    /* renamed from: m */
    public int f1941m = 0;

    /* renamed from: androidx.constraintlayout.core.SolverVariable$1 */
    public static /* synthetic */ class C01771 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1942a;

        static {
            int[] iArr = new int[Type.values().length];
            f1942a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1942a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1942a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1942a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1942a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum Type {
        UNRESTRICTED,
        /* JADX INFO: Fake field, exist only in values array */
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.f1938j = type;
    }

    /* renamed from: a */
    public final void m1201a(ArrayRow arrayRow) {
        int i2 = 0;
        while (true) {
            int i3 = this.f1940l;
            if (i2 >= i3) {
                ArrayRow[] arrayRowArr = this.f1939k;
                if (i3 >= arrayRowArr.length) {
                    this.f1939k = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.f1939k;
                int i4 = this.f1940l;
                arrayRowArr2[i4] = arrayRow;
                this.f1940l = i4 + 1;
                return;
            }
            if (this.f1939k[i2] == arrayRow) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* renamed from: b */
    public final void m1202b(ArrayRow arrayRow) {
        int i2 = this.f1940l;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f1939k[i3] == arrayRow) {
                while (i3 < i2 - 1) {
                    ArrayRow[] arrayRowArr = this.f1939k;
                    int i4 = i3 + 1;
                    arrayRowArr[i3] = arrayRowArr[i4];
                    i3 = i4;
                }
                this.f1940l--;
                return;
            }
            i3++;
        }
    }

    /* renamed from: c */
    public void m1203c() {
        this.f1938j = Type.UNKNOWN;
        this.f1933e = 0;
        this.f1931c = -1;
        this.f1932d = -1;
        this.f1934f = 0.0f;
        this.f1935g = false;
        int i2 = this.f1940l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1939k[i3] = null;
        }
        this.f1940l = 0;
        this.f1941m = 0;
        this.f1930b = false;
        Arrays.fill(this.f1937i, 0.0f);
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.f1931c - solverVariable.f1931c;
    }

    /* renamed from: d */
    public void m1204d(LinearSystem linearSystem, float f2) {
        this.f1934f = f2;
        this.f1935g = true;
        int i2 = this.f1940l;
        this.f1932d = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1939k[i3].m1173l(linearSystem, this, false);
        }
        this.f1940l = 0;
    }

    /* renamed from: e */
    public final void m1205e(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i2 = this.f1940l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1939k[i3].mo1174m(linearSystem, arrayRow, false);
        }
        this.f1940l = 0;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("");
        m24u.append(this.f1931c);
        return m24u.toString();
    }
}
