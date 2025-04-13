package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.List;
import okio.Buffer;
import okio.BufferedSource;

/* loaded from: classes2.dex */
public interface PushObserver {

    /* renamed from: com.squareup.okhttp.internal.framed.PushObserver$1 */
    public static class C24941 implements PushObserver {
        @Override // com.squareup.okhttp.internal.framed.PushObserver
        /* renamed from: a */
        public void mo13995a(int i2, ErrorCode errorCode) {
        }

        @Override // com.squareup.okhttp.internal.framed.PushObserver
        public boolean onData(int i2, BufferedSource bufferedSource, int i3, boolean z) throws IOException {
            ((Buffer) bufferedSource).skip(i3);
            return true;
        }

        @Override // com.squareup.okhttp.internal.framed.PushObserver
        public boolean onHeaders(int i2, List<Header> list, boolean z) {
            return true;
        }

        @Override // com.squareup.okhttp.internal.framed.PushObserver
        public boolean onRequest(int i2, List<Header> list) {
            return true;
        }
    }

    /* renamed from: a */
    void mo13995a(int i2, ErrorCode errorCode);

    boolean onData(int i2, BufferedSource bufferedSource, int i3, boolean z) throws IOException;

    boolean onHeaders(int i2, List<Header> list, boolean z);

    boolean onRequest(int i2, List<Header> list);
}
