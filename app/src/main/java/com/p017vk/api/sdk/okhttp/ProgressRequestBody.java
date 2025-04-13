package com.p017vk.api.sdk.okhttp;

import com.p017vk.api.sdk.VKApiProgressListener;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.RealBufferedSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProgressRequestBody.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/ProgressRequestBody;", "Lokhttp3/RequestBody;", "Companion", "CountingSink", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ProgressRequestBody extends RequestBody {

    /* renamed from: d */
    public static final long f30738d = TimeUnit.MILLISECONDS.toMillis(160);

    /* renamed from: a */
    public long f30739a;

    /* renamed from: b */
    public final RequestBody f30740b;

    /* renamed from: c */
    public final VKApiProgressListener f30741c;

    /* compiled from: ProgressRequestBody.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/ProgressRequestBody$Companion;", "", "", "NOTIFY_INTERVAL", "J", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    /* compiled from: ProgressRequestBody.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/ProgressRequestBody$CountingSink;", "Lokio/ForwardingSink;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public final class CountingSink extends ForwardingSink {

        /* renamed from: b */
        public long f30742b;

        /* renamed from: c */
        public long f30743c;

        public CountingSink(@NotNull Sink sink) {
            super(sink);
            this.f30743c = -1L;
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(@NotNull Buffer source, long j2) throws IOException {
            Intrinsics.m32180i(source, "source");
            super.write(source, j2);
            this.f30742b += j2;
            if (this.f30743c < 0) {
                this.f30743c = ProgressRequestBody.this.contentLength();
            }
            long j3 = this.f30743c;
            if (j3 < 0) {
                ProgressRequestBody.m16523a(ProgressRequestBody.this, 0L, 1L);
            } else {
                ProgressRequestBody.m16523a(ProgressRequestBody.this, this.f30742b, j3);
            }
        }
    }

    /* renamed from: a */
    public static final void m16523a(ProgressRequestBody progressRequestBody, long j2, long j3) {
        if (progressRequestBody.f30741c != null && System.currentTimeMillis() - progressRequestBody.f30739a >= f30738d) {
            float f2 = j3;
            float f3 = 1000.0f / f2;
            progressRequestBody.f30741c.mo16491a((int) (j2 * f3), (int) (f2 * f3));
            progressRequestBody.f30739a = System.currentTimeMillis();
        }
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        return this.f30740b.contentLength();
    }

    @Override // okhttp3.RequestBody
    @Nullable
    /* renamed from: contentType */
    public MediaType get$contentType() {
        return this.f30740b.get$contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink sink) throws IOException {
        Intrinsics.m32180i(sink, "sink");
        BufferedSink m34601c = Okio.m34601c(new CountingSink(sink));
        this.f30740b.writeTo(m34601c);
        ((RealBufferedSink) m34601c).flush();
    }
}
