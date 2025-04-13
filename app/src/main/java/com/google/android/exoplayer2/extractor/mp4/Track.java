package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class Track {

    /* renamed from: a */
    public final int f11282a;

    /* renamed from: b */
    public final int f11283b;

    /* renamed from: c */
    public final long f11284c;

    /* renamed from: d */
    public final long f11285d;

    /* renamed from: e */
    public final long f11286e;

    /* renamed from: f */
    public final Format f11287f;

    /* renamed from: g */
    public final int f11288g;

    /* renamed from: h */
    @Nullable
    public final long[] f11289h;

    /* renamed from: i */
    @Nullable
    public final long[] f11290i;

    /* renamed from: j */
    public final int f11291j;

    /* renamed from: k */
    @Nullable
    public final TrackEncryptionBox[] f11292k;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    public Track(int i2, int i3, long j2, long j3, long j4, Format format, int i4, @Nullable TrackEncryptionBox[] trackEncryptionBoxArr, int i5, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f11282a = i2;
        this.f11283b = i3;
        this.f11284c = j2;
        this.f11285d = j3;
        this.f11286e = j4;
        this.f11287f = format;
        this.f11288g = i4;
        this.f11292k = trackEncryptionBoxArr;
        this.f11291j = i5;
        this.f11289h = jArr;
        this.f11290i = jArr2;
    }

    @Nullable
    /* renamed from: a */
    public TrackEncryptionBox m6531a(int i2) {
        TrackEncryptionBox[] trackEncryptionBoxArr = this.f11292k;
        if (trackEncryptionBoxArr == null) {
            return null;
        }
        return trackEncryptionBoxArr[i2];
    }
}
