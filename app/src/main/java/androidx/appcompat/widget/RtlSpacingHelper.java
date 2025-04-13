package androidx.appcompat.widget;

/* loaded from: classes.dex */
class RtlSpacingHelper {

    /* renamed from: a */
    public int f1410a = 0;

    /* renamed from: b */
    public int f1411b = 0;

    /* renamed from: c */
    public int f1412c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f1413d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f1414e = 0;

    /* renamed from: f */
    public int f1415f = 0;

    /* renamed from: g */
    public boolean f1416g = false;

    /* renamed from: h */
    public boolean f1417h = false;

    /* renamed from: a */
    public void m897a(int i2, int i3) {
        this.f1412c = i2;
        this.f1413d = i3;
        this.f1417h = true;
        if (this.f1416g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f1410a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1411b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1410a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1411b = i3;
        }
    }
}
