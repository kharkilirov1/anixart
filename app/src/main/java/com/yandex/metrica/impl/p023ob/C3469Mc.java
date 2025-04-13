package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Mc */
/* loaded from: classes2.dex */
public class C3469Mc extends AbstractC4390wc {

    /* renamed from: com.yandex.metrica.impl.ob.Mc$a */
    public class a implements InterfaceC3519Oc {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3519Oc
        /* renamed from: a */
        public long mo18500a() {
            return C3469Mc.this.f46863a.m18288c(0L);
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3519Oc
        /* renamed from: a */
        public void mo18501a(long j2) {
            C3469Mc.this.f46863a.m18299h(j2);
        }
    }

    public C3469Mc(@NonNull C4079kd c4079kd, @NonNull C3366I9 c3366i9) {
        this(c4079kd, c3366i9, new C3808a2());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4390wc
    @NonNull
    /* renamed from: a */
    public InterfaceC3519Oc mo18588a() {
        return new a();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4390wc
    @NonNull
    /* renamed from: b */
    public String mo18590b() {
        return "gps";
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4390wc
    @NonNull
    /* renamed from: c */
    public String mo18591c() {
        return "gps";
    }

    @VisibleForTesting
    public C3469Mc(@NonNull C4079kd c4079kd, @NonNull C3366I9 c3366i9, @NonNull C3808a2 c3808a2) {
        super(c4079kd, c3366i9, c3808a2);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4390wc
    @NonNull
    /* renamed from: a */
    public InterfaceC3976ge mo18589a(@NonNull C3950fe c3950fe) {
        return this.f46865c.m19565c(c3950fe);
    }
}
