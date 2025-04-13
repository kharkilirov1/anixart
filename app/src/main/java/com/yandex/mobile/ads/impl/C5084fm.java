package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.yandex.mobile.ads.impl.fm */
/* loaded from: classes3.dex */
public final class C5084fm extends InputStream {

    /* renamed from: a */
    private final InterfaceC4978dm f50300a;

    /* renamed from: b */
    private final C5192hm f50301b;

    /* renamed from: d */
    private boolean f50303d = false;

    /* renamed from: e */
    private boolean f50304e = false;

    /* renamed from: c */
    private final byte[] f50302c = new byte[1];

    public C5084fm(d41 d41Var, C5192hm c5192hm) {
        this.f50300a = d41Var;
        this.f50301b = c5192hm;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f50304e) {
            return;
        }
        this.f50300a.close();
        this.f50304e = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (read(this.f50302c) == -1) {
            return -1;
        }
        return this.f50302c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        C5220ia.m25476b(!this.f50304e);
        if (!this.f50303d) {
            this.f50300a.mo22487a(this.f50301b);
            this.f50303d = true;
        }
        int read = this.f50300a.read(bArr, i2, i3);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
