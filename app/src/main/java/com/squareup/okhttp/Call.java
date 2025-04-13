package com.squareup.okhttp;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.internal.NamedRunnable;

/* loaded from: classes2.dex */
public class Call {

    public class ApplicationInterceptorChain implements Interceptor.Chain {
    }

    public final class AsyncCall extends NamedRunnable {
        /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
        
            throw null;
         */
        @Override // com.squareup.okhttp.internal.NamedRunnable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo13883a() {
            /*
                r1 = this;
                r0 = 0
                java.util.Objects.requireNonNull(r0)     // Catch: java.io.IOException -> L5 java.lang.Throwable -> L6
                throw r0     // Catch: java.io.IOException -> L5 java.lang.Throwable -> L6
            L5:
                throw r0     // Catch: java.lang.Throwable -> L6
            L6:
                java.util.Objects.requireNonNull(r0)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Call.AsyncCall.mo13883a():void");
        }
    }
}
