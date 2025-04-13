package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.YandexMetricaConfig;

/* renamed from: com.yandex.metrica.impl.ob.ab */
/* loaded from: classes2.dex */
public class C3817ab {

    /* renamed from: com.yandex.metrica.impl.ob.ab$a */
    public class a implements InterfaceC3703Vm<C3741Xa, C3716Wa> {
        public a(C3817ab c3817ab) {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
        /* renamed from: a */
        public C3716Wa mo17917a(@NonNull C3741Xa c3741Xa) {
            return c3741Xa.f44474a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$b */
    public class b implements InterfaceC3703Vm<C3741Xa, C3716Wa> {
        public b(C3817ab c3817ab) {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
        /* renamed from: a */
        public C3716Wa mo17917a(@NonNull C3741Xa c3741Xa) {
            return c3741Xa.f44476c;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$c */
    public class c implements InterfaceC3869cb {
        public c(C3817ab c3817ab) {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3869cb
        /* renamed from: a */
        public long mo19238a(@NonNull C3241D9 c3241d9) {
            return c3241d9.m17956c(Long.MAX_VALUE);
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3869cb
        /* renamed from: a */
        public void mo19239a(@NonNull C3241D9 c3241d9, long j2) {
            c3241d9.m17958e(j2);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$d */
    public class d implements InterfaceC3703Vm<C3741Xa, C3716Wa> {
        public d(C3817ab c3817ab) {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
        /* renamed from: a */
        public C3716Wa mo17917a(@NonNull C3741Xa c3741Xa) {
            return c3741Xa.f44475b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$e */
    public class e implements InterfaceC3869cb {
        public e(C3817ab c3817ab) {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3869cb
        /* renamed from: a */
        public long mo19238a(@NonNull C3241D9 c3241d9) {
            return c3241d9.m17955b(Long.MAX_VALUE);
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3869cb
        /* renamed from: a */
        public void mo19239a(@NonNull C3241D9 c3241d9, long j2) {
            c3241d9.m17957d(j2);
        }
    }

    @NonNull
    /* renamed from: a */
    public C3791Za<YandexMetricaConfig> m19573a(@NonNull Context context, @NonNull InterfaceC3807a1 interfaceC3807a1) {
        C3254Dm c3254Dm = new C3254Dm();
        return new C3791Za<>(context, interfaceC3807a1, "activation", new C3641Ta(c3254Dm, new C3921eb()), new a(this), new C3666Ua(c3254Dm));
    }

    @NonNull
    /* renamed from: b */
    public C3791Za<C3535P3> m19574b(@NonNull Context context, @NonNull InterfaceC3807a1 interfaceC3807a1) {
        return new C3791Za<>(context, interfaceC3807a1, "clids_info", new C3691Va(), new d(this), new e(this));
    }

    @NonNull
    /* renamed from: c */
    public C3791Za<C3196Be> m19575c(@NonNull Context context, @NonNull InterfaceC3807a1 interfaceC3807a1) {
        return new C3791Za<>(context, interfaceC3807a1, "preload_info", new C3895db(), new b(this), new c(this));
    }
}
