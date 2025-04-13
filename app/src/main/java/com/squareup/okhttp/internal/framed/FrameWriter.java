package com.squareup.okhttp.internal.framed;

import java.io.Closeable;
import java.io.IOException;
import okio.Buffer;

/* loaded from: classes2.dex */
public interface FrameWriter extends Closeable {
    /* renamed from: G0 */
    void mo13946G0(int i2, ErrorCode errorCode) throws IOException;

    /* renamed from: M */
    void mo13947M(int i2, ErrorCode errorCode, byte[] bArr) throws IOException;

    void data(boolean z, int i2, Buffer buffer, int i3) throws IOException;

    void flush() throws IOException;

    int maxDataLength();

    void ping(boolean z, int i2, int i3) throws IOException;

    void windowUpdate(int i2, long j2) throws IOException;

    /* renamed from: y0 */
    void mo13948y0(Settings settings) throws IOException;
}
