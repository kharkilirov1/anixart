package com.google.android.exoplayer2.mediacodec;

/* loaded from: classes.dex */
final class C2Mp3TimestampTracker {

    /* renamed from: a */
    public long f11865a;

    /* renamed from: b */
    public long f11866b;

    /* renamed from: c */
    public boolean f11867c;

    /* renamed from: a */
    public final long m6634a(long j2) {
        return Math.max(0L, ((this.f11866b - 529) * 1000000) / j2) + this.f11865a;
    }
}
