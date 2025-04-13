package io.grpc.internal;

/* loaded from: classes3.dex */
final class CallTracer {

    /* renamed from: a */
    public final TimeProvider f58458a;

    /* renamed from: b */
    public final LongCounter f58459b;

    /* renamed from: c */
    public final LongCounter f58460c;

    /* renamed from: d */
    public final LongCounter f58461d;

    /* renamed from: e */
    public volatile long f58462e;

    /* renamed from: io.grpc.internal.CallTracer$1 */
    public class C63431 implements Factory {
    }

    public interface Factory {
    }

    /* renamed from: a */
    public void m31040a(boolean z) {
        if (z) {
            this.f58460c.mo31037a(1L);
        } else {
            this.f58461d.mo31037a(1L);
        }
    }

    /* renamed from: b */
    public void m31041b() {
        this.f58459b.mo31037a(1L);
        this.f58462e = this.f58458a.mo31206a();
    }
}
