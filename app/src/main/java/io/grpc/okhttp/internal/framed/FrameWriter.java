package io.grpc.okhttp.internal.framed;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okio.Buffer;

/* loaded from: classes3.dex */
public interface FrameWriter extends Closeable {
    /* renamed from: C0 */
    void mo31215C0(Settings settings) throws IOException;

    /* renamed from: b1 */
    void mo31216b1(boolean z, boolean z2, int i2, int i3, List<Header> list) throws IOException;

    void connectionPreface() throws IOException;

    /* renamed from: d */
    void mo31217d(int i2, ErrorCode errorCode) throws IOException;

    void data(boolean z, int i2, Buffer buffer, int i3) throws IOException;

    void flush() throws IOException;

    /* renamed from: l1 */
    void mo31218l1(int i2, ErrorCode errorCode, byte[] bArr) throws IOException;

    int maxDataLength();

    void ping(boolean z, int i2, int i3) throws IOException;

    /* renamed from: v0 */
    void mo31219v0(Settings settings) throws IOException;

    void windowUpdate(int i2, long j2) throws IOException;
}
