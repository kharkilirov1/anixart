package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class SeekPoint {

    /* renamed from: c */
    public static final SeekPoint f10876c = new SeekPoint(0, 0);

    /* renamed from: a */
    public final long f10877a;

    /* renamed from: b */
    public final long f10878b;

    public SeekPoint(long j2, long j3) {
        this.f10877a = j2;
        this.f10878b = j3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekPoint.class != obj.getClass()) {
            return false;
        }
        SeekPoint seekPoint = (SeekPoint) obj;
        return this.f10877a == seekPoint.f10877a && this.f10878b == seekPoint.f10878b;
    }

    public int hashCode() {
        return (((int) this.f10877a) * 31) + ((int) this.f10878b);
    }

    public String toString() {
        long j2 = this.f10877a;
        return C0000a.m19p(C0576a.m4121t(60, "[timeUs=", j2, ", position="), this.f10878b, "]");
    }
}
