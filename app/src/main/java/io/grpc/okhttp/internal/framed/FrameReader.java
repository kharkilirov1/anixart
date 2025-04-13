package io.grpc.okhttp.internal.framed;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okio.BufferedSource;
import okio.ByteString;

/* loaded from: classes3.dex */
public interface FrameReader extends Closeable {

    public interface Handler {
        /* renamed from: d */
        void mo31246d(int i2, ErrorCode errorCode);

        void data(boolean z, int i2, BufferedSource bufferedSource, int i3) throws IOException;

        /* renamed from: e */
        void mo31247e(int i2, ErrorCode errorCode, ByteString byteString);

        /* renamed from: f */
        void mo31248f(boolean z, Settings settings);

        /* renamed from: g */
        void mo31249g(boolean z, boolean z2, int i2, int i3, List<Header> list, HeadersMode headersMode);

        void ping(boolean z, int i2, int i3);

        void priority(int i2, int i3, int i4, boolean z);

        void pushPromise(int i2, int i3, List<Header> list) throws IOException;

        void windowUpdate(int i2, long j2);
    }

    /* renamed from: W */
    boolean mo31297W(Handler handler) throws IOException;
}
