package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.p013io.RealConnection;

/* loaded from: classes2.dex */
public final class StreamAllocation {

    /* renamed from: a */
    public final Address f25187a;

    /* renamed from: b */
    public final ConnectionPool f25188b;

    /* renamed from: c */
    public RouteSelector f25189c;

    /* renamed from: d */
    public RealConnection f25190d;

    /* renamed from: e */
    public boolean f25191e;

    /* renamed from: f */
    public HttpStream f25192f;

    /* renamed from: a */
    public final void m14009a(boolean z, boolean z2, boolean z3) {
        RealConnection realConnection;
        RealConnection realConnection2;
        synchronized (this.f25188b) {
            realConnection = null;
            if (z3) {
                try {
                    this.f25192f = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                this.f25191e = true;
            }
            RealConnection realConnection3 = this.f25190d;
            if (realConnection3 != null) {
                if (z) {
                    realConnection3.f25199g = true;
                }
                if (this.f25192f == null && (this.f25191e || realConnection3.f25199g)) {
                    int size = realConnection3.f25198f.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (realConnection3.f25198f.get(i2).get() == this) {
                            realConnection3.f25198f.remove(i2);
                            RealConnection realConnection4 = this.f25190d;
                            if (realConnection4.f25197e > 0) {
                                this.f25189c = null;
                            }
                            if (realConnection4.f25198f.isEmpty()) {
                                this.f25190d.f25200h = System.nanoTime();
                                if (Internal.f24955b.mo13923b(this.f25188b, this.f25190d)) {
                                    realConnection2 = this.f25190d;
                                    this.f25190d = null;
                                    realConnection = realConnection2;
                                }
                            }
                            realConnection2 = null;
                            this.f25190d = null;
                            realConnection = realConnection2;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        }
        if (realConnection != null) {
            Util.m13936d(realConnection.f25194b);
        }
    }

    /* renamed from: b */
    public void m14010b() {
        m14009a(true, false, false);
    }

    /* renamed from: c */
    public void m14011c(HttpStream httpStream) {
        synchronized (this.f25188b) {
            if (httpStream != null) {
                if (httpStream == this.f25192f) {
                }
            }
            throw new IllegalStateException("expected " + this.f25192f + " but was " + httpStream);
        }
        m14009a(false, false, true);
    }

    public String toString() {
        return this.f25187a.toString();
    }
}
