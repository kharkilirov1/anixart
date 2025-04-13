package com.squareup.okhttp;

import java.io.Closeable;
import java.io.IOException;
import okio.BufferedSource;

/* loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: com.squareup.okhttp.ResponseBody$1 */
    final class C24731 extends ResponseBody {
        @Override // com.squareup.okhttp.ResponseBody
        /* renamed from: a */
        public BufferedSource mo13882a() {
            return null;
        }
    }

    /* renamed from: a */
    public abstract BufferedSource mo13882a() throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo13882a().close();
    }
}
