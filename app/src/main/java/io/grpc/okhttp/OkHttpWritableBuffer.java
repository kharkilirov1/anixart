package io.grpc.okhttp;

import io.grpc.internal.WritableBuffer;
import okio.Buffer;

/* loaded from: classes3.dex */
class OkHttpWritableBuffer implements WritableBuffer {

    /* renamed from: a */
    public final Buffer f59316a;

    /* renamed from: b */
    public int f59317b;

    /* renamed from: c */
    public int f59318c;

    public OkHttpWritableBuffer(Buffer buffer, int i2) {
        this.f59316a = buffer;
        this.f59317b = i2;
    }

    @Override // io.grpc.internal.WritableBuffer
    /* renamed from: a */
    public int mo31209a() {
        return this.f59317b;
    }

    @Override // io.grpc.internal.WritableBuffer
    /* renamed from: b */
    public void mo31210b(byte b) {
        this.f59316a.m34524Q(b);
        this.f59317b--;
        this.f59318c++;
    }

    @Override // io.grpc.internal.WritableBuffer
    /* renamed from: r */
    public int mo31211r() {
        return this.f59318c;
    }

    @Override // io.grpc.internal.WritableBuffer
    public void release() {
    }

    @Override // io.grpc.internal.WritableBuffer
    public void write(byte[] bArr, int i2, int i3) {
        this.f59316a.m34521N(bArr, i2, i3);
        this.f59317b -= i3;
        this.f59318c += i3;
    }
}
