package com.squareup.okhttp.internal.framed;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface FrameReader extends Closeable {

    public interface Handler {
        void priority(int i2, int i3, int i4, boolean z);
    }

    /* renamed from: H0 */
    void mo13944H0() throws IOException;

    /* renamed from: m0 */
    boolean mo13945m0(Handler handler) throws IOException;
}
