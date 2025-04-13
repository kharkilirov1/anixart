package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class TrackSampleTable {

    /* renamed from: a */
    public final Track f11315a;

    /* renamed from: b */
    public final int f11316b;

    /* renamed from: c */
    public final long[] f11317c;

    /* renamed from: d */
    public final int[] f11318d;

    /* renamed from: e */
    public final int f11319e;

    /* renamed from: f */
    public final long[] f11320f;

    /* renamed from: g */
    public final int[] f11321g;

    /* renamed from: h */
    public final long f11322h;

    public TrackSampleTable(Track track, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
        Assertions.m7513a(iArr.length == jArr2.length);
        Assertions.m7513a(jArr.length == jArr2.length);
        Assertions.m7513a(iArr2.length == jArr2.length);
        this.f11315a = track;
        this.f11317c = jArr;
        this.f11318d = iArr;
        this.f11319e = i2;
        this.f11320f = jArr2;
        this.f11321g = iArr2;
        this.f11322h = j2;
        this.f11316b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int m6532a(long j2) {
        for (int m7737f = Util.m7737f(this.f11320f, j2, true, false); m7737f >= 0; m7737f--) {
            if ((this.f11321g[m7737f] & 1) != 0) {
                return m7737f;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m6533b(long j2) {
        for (int m7730b = Util.m7730b(this.f11320f, j2, true, false); m7730b < this.f11320f.length; m7730b++) {
            if ((this.f11321g[m7730b] & 1) != 0) {
                return m7730b;
            }
        }
        return -1;
    }
}
