package com.squareup.okhttp.internal;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;

/* loaded from: classes2.dex */
class FaultHidingSink extends ForwardingSink {

    /* renamed from: b */
    public boolean f24953b;

    /* renamed from: a */
    public void mo13930a(IOException iOException) {
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f24953b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e2) {
            this.f24953b = true;
            mo13930a(e2);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.f24953b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e2) {
            this.f24953b = true;
            mo13930a(e2);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(Buffer buffer, long j2) throws IOException {
        if (this.f24953b) {
            buffer.skip(j2);
            return;
        }
        try {
            super.write(buffer, j2);
        } catch (IOException e2) {
            this.f24953b = true;
            mo13930a(e2);
        }
    }
}
