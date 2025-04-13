package io.grpc.okhttp.internal.framed;

/* loaded from: classes3.dex */
public final class Settings {

    /* renamed from: a */
    public int f59478a;

    /* renamed from: b */
    public int f59479b;

    /* renamed from: c */
    public int f59480c;

    /* renamed from: d */
    public final int[] f59481d = new int[10];

    /* renamed from: a */
    public boolean m31320a(int i2) {
        return ((1 << i2) & this.f59478a) != 0;
    }

    /* renamed from: b */
    public Settings m31321b(int i2, int i3, int i4) {
        int[] iArr = this.f59481d;
        if (i2 >= iArr.length) {
            return this;
        }
        int i5 = 1 << i2;
        this.f59478a |= i5;
        if ((i3 & 1) != 0) {
            this.f59479b |= i5;
        } else {
            this.f59479b &= ~i5;
        }
        if ((i3 & 2) != 0) {
            this.f59480c |= i5;
        } else {
            this.f59480c &= ~i5;
        }
        iArr[i2] = i4;
        return this;
    }
}
