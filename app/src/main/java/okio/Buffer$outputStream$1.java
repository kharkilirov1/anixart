package okio;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Buffer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"okio/Buffer$outputStream$1", "Ljava/io/OutputStream;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Buffer$outputStream$1 extends OutputStream {

    /* renamed from: b */
    public final /* synthetic */ Buffer f68751b;

    public Buffer$outputStream$1(Buffer buffer) {
        this.f68751b = buffer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    @NotNull
    public String toString() {
        return this.f68751b + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        this.f68751b.m34524Q(i2);
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] data, int i2, int i3) {
        Intrinsics.m32179h(data, "data");
        this.f68751b.m34521N(data, i2, i3);
    }
}
