package io.grpc.internal;

import io.grpc.Compressor;
import java.io.InputStream;

/* loaded from: classes3.dex */
public interface Framer {
    /* renamed from: c */
    Framer mo31006c(boolean z);

    void close();

    /* renamed from: e */
    Framer mo31007e(Compressor compressor);

    /* renamed from: f */
    void mo31008f(InputStream inputStream);

    void flush();

    /* renamed from: i */
    void mo31009i(int i2);

    boolean isClosed();
}
