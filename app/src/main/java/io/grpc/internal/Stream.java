package io.grpc.internal;

import io.grpc.Compressor;
import java.io.InputStream;

/* loaded from: classes3.dex */
public interface Stream {
    /* renamed from: b */
    boolean mo30979b();

    /* renamed from: c */
    void mo30980c(boolean z);

    /* renamed from: e */
    void mo30981e(Compressor compressor);

    void flush();

    /* renamed from: g */
    void mo30982g(int i2);

    /* renamed from: r */
    void mo30990r(InputStream inputStream);

    /* renamed from: s */
    void mo30991s();
}
