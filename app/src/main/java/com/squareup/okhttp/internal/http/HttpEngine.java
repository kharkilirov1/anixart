package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

/* loaded from: classes2.dex */
public final class HttpEngine {

    /* renamed from: c */
    public static final ResponseBody f25169c = new ResponseBody() { // from class: com.squareup.okhttp.internal.http.HttpEngine.1
        @Override // com.squareup.okhttp.ResponseBody
        /* renamed from: a */
        public BufferedSource mo13882a() {
            return new Buffer();
        }
    };

    /* renamed from: a */
    public final OkHttpClient f25170a;

    /* renamed from: b */
    public final Request f25171b;

    /* renamed from: com.squareup.okhttp.internal.http.HttpEngine$2 */
    class C24992 implements Source {

        /* renamed from: b */
        public boolean f25172b;

        /* renamed from: c */
        public final /* synthetic */ BufferedSource f25173c;

        /* renamed from: d */
        public final /* synthetic */ CacheRequest f25174d;

        /* renamed from: e */
        public final /* synthetic */ BufferedSink f25175e;

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f25172b && !Util.m13937e(this, 100, TimeUnit.MILLISECONDS)) {
                this.f25172b = true;
                this.f25174d.abort();
            }
            this.f25173c.close();
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
            try {
                long read = this.f25173c.read(buffer, j2);
                if (read != -1) {
                    buffer.m34535c(this.f25175e.getF68785b(), buffer.f68742c - read, read);
                    this.f25175e.mo34541f0();
                    return read;
                }
                if (!this.f25172b) {
                    this.f25172b = true;
                    this.f25175e.close();
                }
                return -1L;
            } catch (IOException e2) {
                if (!this.f25172b) {
                    this.f25172b = true;
                    this.f25174d.abort();
                }
                throw e2;
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getF68772c() {
            return this.f25173c.getF68772c();
        }
    }

    public class NetworkInterceptorChain implements Interceptor.Chain {
    }

    /* renamed from: a */
    public void m14006a(Headers headers) throws IOException {
        CookieHandler cookieHandler = this.f25170a.f24892j;
        if (cookieHandler != null) {
            cookieHandler.put(this.f25171b.m13924a(), OkHeaders.m14007a(headers, null));
        }
    }
}
