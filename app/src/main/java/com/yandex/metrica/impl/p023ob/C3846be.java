package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.be */
/* loaded from: classes2.dex */
public class C3846be implements InterfaceC3898de {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3898de f44826a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3898de f44827b;

    /* renamed from: com.yandex.metrica.impl.ob.be$a */
    public static class a {

        /* renamed from: a */
        @NonNull
        private InterfaceC3898de f44828a;

        /* renamed from: b */
        @NonNull
        private InterfaceC3898de f44829b;

        public a(@NonNull InterfaceC3898de interfaceC3898de, @NonNull InterfaceC3898de interfaceC3898de2) {
            this.f44828a = interfaceC3898de;
            this.f44829b = interfaceC3898de2;
        }

        /* renamed from: a */
        public a m19654a(@NonNull C3575Qi c3575Qi) {
            this.f44829b = new C4132me(c3575Qi.m18824E());
            return this;
        }

        /* renamed from: a */
        public a m19655a(boolean z) {
            this.f44828a = new C3924ee(z);
            return this;
        }

        /* renamed from: a */
        public C3846be m19656a() {
            return new C3846be(this.f44828a, this.f44829b);
        }
    }

    @VisibleForTesting
    public C3846be(@NonNull InterfaceC3898de interfaceC3898de, @NonNull InterfaceC3898de interfaceC3898de2) {
        this.f44826a = interfaceC3898de;
        this.f44827b = interfaceC3898de2;
    }

    /* renamed from: b */
    public static a m19651b() {
        return new a(new C3924ee(false), new C4132me(null));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3898de
    /* renamed from: a */
    public boolean mo19653a(@NonNull String str) {
        return this.f44827b.mo19653a(str) && this.f44826a.mo19653a(str);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("AskForPermissionsStrategy{mLocationFlagStrategy=");
        m24u.append(this.f44826a);
        m24u.append(", mStartupStateStrategy=");
        m24u.append(this.f44827b);
        m24u.append('}');
        return m24u.toString();
    }

    /* renamed from: a */
    public a m19652a() {
        return new a(this.f44826a, this.f44827b);
    }
}
