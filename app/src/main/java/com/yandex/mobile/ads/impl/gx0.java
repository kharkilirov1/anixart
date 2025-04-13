package com.yandex.mobile.ads.impl;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
final class gx0 extends BufferedOutputStream {

    /* renamed from: a */
    private boolean f50755a;

    public gx0(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public final void m24994a(OutputStream outputStream) {
        C5220ia.m25476b(this.f50755a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f50755a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f50755a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i2 = s91.f54530a;
        throw th;
    }

    public gx0(FileOutputStream fileOutputStream, int i2) {
        super(fileOutputStream, i2);
    }
}
