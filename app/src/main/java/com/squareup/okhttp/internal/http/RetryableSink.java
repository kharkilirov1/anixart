package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.ProtocolException;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class RetryableSink implements Sink {

    /* renamed from: b */
    public boolean f25180b;

    /* renamed from: d */
    public final Buffer f25182d = new Buffer();

    /* renamed from: c */
    public final int f25181c = -1;

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f25180b) {
            return;
        }
        this.f25180b = true;
        if (this.f25182d.f68742c >= this.f25181c) {
            return;
        }
        StringBuilder m24u = C0000a.m24u("content-length promised ");
        m24u.append(this.f25181c);
        m24u.append(" bytes, but received ");
        m24u.append(this.f25182d.f68742c);
        throw new ProtocolException(m24u.toString());
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public Timeout getF68778c() {
        return Timeout.NONE;
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j2) throws IOException {
        if (this.f25180b) {
            throw new IllegalStateException("closed");
        }
        Util.m13933a(buffer.f68742c, 0L, j2);
        int i2 = this.f25181c;
        if (i2 != -1 && this.f25182d.f68742c > i2 - j2) {
            throw new ProtocolException(C0000a.m18o(C0000a.m24u("exceeded content-length limit of "), this.f25181c, " bytes"));
        }
        this.f25182d.write(buffer, j2);
    }
}
