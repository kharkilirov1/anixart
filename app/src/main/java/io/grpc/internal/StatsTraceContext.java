package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import io.grpc.ClientStreamTracer;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StreamTracer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
public final class StatsTraceContext {

    /* renamed from: c */
    public static final StatsTraceContext f59157c = new StatsTraceContext(new StreamTracer[0]);

    /* renamed from: a */
    public final StreamTracer[] f59158a;

    /* renamed from: b */
    public final AtomicBoolean f59159b = new AtomicBoolean(false);

    @VisibleForTesting
    public StatsTraceContext(StreamTracer[] streamTracerArr) {
        this.f59158a = streamTracerArr;
    }

    /* renamed from: a */
    public void m31198a(Metadata metadata) {
        for (StreamTracer streamTracer : this.f59158a) {
            ((ClientStreamTracer) streamTracer).mo30821k(metadata);
        }
    }

    /* renamed from: b */
    public void m31199b() {
        for (StreamTracer streamTracer : this.f59158a) {
            ((ClientStreamTracer) streamTracer).mo30822l();
        }
    }

    /* renamed from: c */
    public void m31200c(int i2) {
        for (StreamTracer streamTracer : this.f59158a) {
            streamTracer.mo30950a(i2);
        }
    }

    /* renamed from: d */
    public void m31201d(int i2, long j2, long j3) {
        for (StreamTracer streamTracer : this.f59158a) {
            streamTracer.mo30951b(i2, j2, j3);
        }
    }

    /* renamed from: e */
    public void m31202e(long j2) {
        for (StreamTracer streamTracer : this.f59158a) {
            streamTracer.mo30953d(j2);
        }
    }

    /* renamed from: f */
    public void m31203f(int i2) {
        for (StreamTracer streamTracer : this.f59158a) {
            streamTracer.mo30954e(i2);
        }
    }

    /* renamed from: g */
    public void m31204g(int i2, long j2, long j3) {
        for (StreamTracer streamTracer : this.f59158a) {
            streamTracer.mo30955f(i2, j2, j3);
        }
    }

    /* renamed from: h */
    public void m31205h(Status status) {
        if (this.f59159b.compareAndSet(false, true)) {
            for (StreamTracer streamTracer : this.f59158a) {
                streamTracer.mo30958i(status);
            }
        }
    }
}
