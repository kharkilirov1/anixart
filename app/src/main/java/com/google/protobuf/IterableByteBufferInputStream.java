package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes2.dex */
class IterableByteBufferInputStream extends InputStream {

    /* renamed from: b */
    public Iterator<ByteBuffer> f24223b;

    /* renamed from: c */
    public ByteBuffer f24224c;

    /* renamed from: d */
    public int f24225d;

    /* renamed from: e */
    public int f24226e;

    /* renamed from: f */
    public int f24227f;

    /* renamed from: g */
    public boolean f24228g;

    /* renamed from: h */
    public byte[] f24229h;

    /* renamed from: i */
    public int f24230i;

    /* renamed from: j */
    public long f24231j;

    /* renamed from: a */
    public final boolean m13464a() {
        this.f24226e++;
        if (!this.f24223b.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f24223b.next();
        this.f24224c = next;
        this.f24227f = next.position();
        if (this.f24224c.hasArray()) {
            this.f24228g = true;
            this.f24229h = this.f24224c.array();
            this.f24230i = this.f24224c.arrayOffset();
        } else {
            this.f24228g = false;
            this.f24231j = UnsafeUtil.m13675b(this.f24224c);
            this.f24229h = null;
        }
        return true;
    }

    /* renamed from: b */
    public final void m13465b(int i2) {
        int i3 = this.f24227f + i2;
        this.f24227f = i3;
        if (i3 == this.f24224c.limit()) {
            m13464a();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f24226e == this.f24225d) {
            return -1;
        }
        if (this.f24228g) {
            int i2 = this.f24229h[this.f24227f + this.f24230i] & 255;
            m13465b(1);
            return i2;
        }
        int m13683j = UnsafeUtil.m13683j(this.f24227f + this.f24231j) & 255;
        m13465b(1);
        return m13683j;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f24226e == this.f24225d) {
            return -1;
        }
        int limit = this.f24224c.limit();
        int i4 = this.f24227f;
        int i5 = limit - i4;
        if (i3 > i5) {
            i3 = i5;
        }
        if (this.f24228g) {
            System.arraycopy(this.f24229h, i4 + this.f24230i, bArr, i2, i3);
            m13465b(i3);
        } else {
            int position = this.f24224c.position();
            this.f24224c.position(this.f24227f);
            this.f24224c.get(bArr, i2, i3);
            this.f24224c.position(position);
            m13465b(i3);
        }
        return i3;
    }
}
