package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzds {

    /* renamed from: a */
    public byte[] f19956a = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: b */
    public int f19957b;

    /* renamed from: c */
    public long f19958c;

    /* renamed from: d */
    public long f19959d;

    /* renamed from: e */
    public int f19960e;

    /* renamed from: f */
    public int f19961f;

    /* renamed from: g */
    public int f19962g;

    /* renamed from: h */
    public boolean f19963h;

    /* renamed from: i */
    @Nullable
    public String f19964i;

    public zzds() {
        m10790c();
    }

    /* renamed from: a */
    public final int m10788a(byte[] bArr, int i2, int i3) {
        int m10791d = m10791d(30, bArr, i2, i3);
        if (m10791d == -1) {
            return -1;
        }
        if (this.f19958c == -1) {
            long m10764b = zzbr.m10764b(this.f19956a, 0);
            this.f19958c = m10764b;
            if (m10764b == 67324752) {
                this.f19963h = false;
                this.f19959d = zzbr.m10764b(this.f19956a, 18);
                this.f19962g = zzbr.m10763a(this.f19956a, 8);
                this.f19960e = zzbr.m10763a(this.f19956a, 26);
                int m10763a = this.f19960e + 30 + zzbr.m10763a(this.f19956a, 28);
                this.f19961f = m10763a;
                int length = this.f19956a.length;
                if (length < m10763a) {
                    do {
                        length += length;
                    } while (length < m10763a);
                    this.f19956a = Arrays.copyOf(this.f19956a, length);
                }
            } else {
                this.f19963h = true;
            }
        }
        int m10791d2 = m10791d(this.f19961f, bArr, i2 + m10791d, i3 - m10791d);
        if (m10791d2 == -1) {
            return -1;
        }
        int i4 = m10791d + m10791d2;
        if (!this.f19963h && this.f19964i == null) {
            this.f19964i = new String(this.f19956a, 30, this.f19960e);
        }
        return i4;
    }

    /* renamed from: b */
    public final zzet m10789b() {
        int i2 = this.f19957b;
        int i3 = this.f19961f;
        if (i2 < i3) {
            return new zzbq(this.f19964i, this.f19959d, this.f19962g, true, this.f19963h, Arrays.copyOf(this.f19956a, i2));
        }
        zzbq zzbqVar = new zzbq(this.f19964i, this.f19959d, this.f19962g, false, this.f19963h, Arrays.copyOf(this.f19956a, i3));
        m10790c();
        return zzbqVar;
    }

    /* renamed from: c */
    public final void m10790c() {
        this.f19957b = 0;
        this.f19960e = -1;
        this.f19958c = -1L;
        this.f19963h = false;
        this.f19961f = 30;
        this.f19959d = -1L;
        this.f19962g = -1;
        this.f19964i = null;
    }

    /* renamed from: d */
    public final int m10791d(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.f19957b;
        if (i5 >= i2) {
            return 0;
        }
        int min = Math.min(i4, i2 - i5);
        System.arraycopy(bArr, i3, this.f19956a, this.f19957b, min);
        int i6 = this.f19957b + min;
        this.f19957b = i6;
        if (i6 < i2) {
            return -1;
        }
        return min;
    }
}
