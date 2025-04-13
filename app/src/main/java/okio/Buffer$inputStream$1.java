package okio;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Buffer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"okio/Buffer$inputStream$1", "Ljava/io/InputStream;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Buffer$inputStream$1 extends InputStream {

    /* renamed from: b */
    public final /* synthetic */ Buffer f68750b;

    public Buffer$inputStream$1(Buffer buffer) {
        this.f68750b = buffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return (int) Math.min(this.f68750b.f68742c, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.InputStream
    public int read() {
        Buffer buffer = this.f68750b;
        if (buffer.f68742c > 0) {
            return buffer.readByte() & 255;
        }
        return -1;
    }

    @NotNull
    public String toString() {
        return this.f68750b + ".inputStream()";
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] sink, int i2, int i3) {
        Intrinsics.m32179h(sink, "sink");
        return this.f68750b.read(sink, i2, i3);
    }
}
