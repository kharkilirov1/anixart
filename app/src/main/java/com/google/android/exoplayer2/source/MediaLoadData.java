package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class MediaLoadData {

    /* renamed from: a */
    public final int f12345a;

    /* renamed from: b */
    public final int f12346b;

    /* renamed from: c */
    @Nullable
    public final Format f12347c;

    /* renamed from: d */
    public final int f12348d;

    /* renamed from: e */
    @Nullable
    public final Object f12349e;

    /* renamed from: f */
    public final long f12350f;

    /* renamed from: g */
    public final long f12351g;

    public MediaLoadData(int i2) {
        this(i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public MediaLoadData(int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3) {
        this.f12345a = i2;
        this.f12346b = i3;
        this.f12347c = format;
        this.f12348d = i4;
        this.f12349e = obj;
        this.f12350f = j2;
        this.f12351g = j3;
    }
}
