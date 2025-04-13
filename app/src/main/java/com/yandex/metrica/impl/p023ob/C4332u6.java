package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import okhttp3.internal.connection.RealConnection;

/* renamed from: com.yandex.metrica.impl.ob.u6 */
/* loaded from: classes2.dex */
public class C4332u6 {

    /* renamed from: a */
    @NonNull
    private final C3365I8 f46590a;

    public C4332u6(@NonNull C3365I8 c3365i8) {
        this.f46590a = c3365i8;
    }

    /* renamed from: a */
    public long m20868a() {
        long m18267j = this.f46590a.m18267j();
        long j2 = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
        if (m18267j >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
            j2 = 1 + m18267j;
        }
        this.f46590a.m18252a(j2);
        return j2;
    }
}
