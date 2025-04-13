package com.google.android.play.core.internal;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzcn extends zzcm {

    /* renamed from: b */
    public final zzcm f20139b;

    /* renamed from: c */
    public final long f20140c;

    /* renamed from: d */
    public final long f20141d;

    public zzcn(zzcm zzcmVar, long j2, long j3) {
        this.f20139b = zzcmVar;
        long m10896c = m10896c(j2);
        this.f20140c = m10896c;
        this.f20141d = m10896c(m10896c + j3);
    }

    @Override // com.google.android.play.core.internal.zzcm
    /* renamed from: a */
    public final long mo10749a() {
        return this.f20141d - this.f20140c;
    }

    @Override // com.google.android.play.core.internal.zzcm
    /* renamed from: b */
    public final InputStream mo10750b(long j2, long j3) throws IOException {
        long m10896c = m10896c(this.f20140c);
        return this.f20139b.mo10750b(m10896c, m10896c(j3 + m10896c) - m10896c);
    }

    /* renamed from: c */
    public final long m10896c(long j2) {
        if (j2 < 0) {
            return 0L;
        }
        return j2 > this.f20139b.mo10749a() ? this.f20139b.mo10749a() : j2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
