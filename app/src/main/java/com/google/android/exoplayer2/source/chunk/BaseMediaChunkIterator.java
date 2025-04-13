package com.google.android.exoplayer2.source.chunk;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class BaseMediaChunkIterator implements MediaChunkIterator {

    /* renamed from: b */
    public final long f12675b;

    /* renamed from: c */
    public final long f12676c;

    /* renamed from: d */
    public long f12677d;

    public BaseMediaChunkIterator(long j2, long j3) {
        this.f12675b = j2;
        this.f12676c = j3;
        this.f12677d = j2 - 1;
    }

    /* renamed from: c */
    public final void m6957c() {
        long j2 = this.f12677d;
        if (j2 < this.f12675b || j2 > this.f12676c) {
            throw new NoSuchElementException();
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean next() {
        long j2 = this.f12677d + 1;
        this.f12677d = j2;
        return !(j2 > this.f12676c);
    }
}
