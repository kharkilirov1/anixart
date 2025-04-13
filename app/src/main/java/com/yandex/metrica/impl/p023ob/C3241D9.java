package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.D9 */
/* loaded from: classes2.dex */
public class C3241D9 extends AbstractC3341H9 {

    /* renamed from: c */
    private static final C4444ye f42706c = new C4444ye("LAST_SATELLITE_CLIDS_DIAGNOSTICS_SENT_TIME", null);

    /* renamed from: d */
    private static final C4444ye f42707d = new C4444ye("LAST_PRELOAD_INFO_DIAGNOSTICS_SENT_TIME", null);

    public C3241D9(@NonNull InterfaceC4464z8 interfaceC4464z8) {
        super(interfaceC4464z8);
    }

    /* renamed from: b */
    public long m17955b(long j2) {
        return m18216a(f42706c.m21201a(), j2);
    }

    /* renamed from: c */
    public long m17956c(long j2) {
        return m18216a(f42707d.m21201a(), j2);
    }

    /* renamed from: d */
    public C3241D9 m17957d(long j2) {
        return (C3241D9) m18221b(f42706c.m21201a(), j2);
    }

    /* renamed from: e */
    public C3241D9 m17958e(long j2) {
        return (C3241D9) m18221b(f42707d.m21201a(), j2);
    }
}
