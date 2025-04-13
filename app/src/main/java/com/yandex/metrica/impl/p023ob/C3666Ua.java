package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Ua */
/* loaded from: classes2.dex */
public class C3666Ua implements InterfaceC3869cb {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3354Hm f44131a;

    public C3666Ua(@NonNull InterfaceC3354Hm interfaceC3354Hm) {
        this.f44131a = interfaceC3354Hm;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3869cb
    /* renamed from: a */
    public long mo19238a(@NonNull C3241D9 c3241d9) {
        return c3241d9.m18216a(new C4444ye(C0000a.m14k("LAST_ACTIVATION_DIAGNOSTICS_SENT_TIME_", ((C3254Dm) this.f44131a).m17984b()), null).m21201a(), Long.MAX_VALUE);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3869cb
    /* renamed from: a */
    public void mo19239a(@NonNull C3241D9 c3241d9, long j2) {
    }
}
