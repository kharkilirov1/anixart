package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.dc */
/* loaded from: classes2.dex */
public class C3896dc implements InterfaceC3870cc {

    /* renamed from: a */
    private final InterfaceC3870cc f44915a;

    /* renamed from: com.yandex.metrica.impl.ob.dc$a */
    public class a implements InterfaceC3778Ym<C3844bc> {

        /* renamed from: a */
        public final /* synthetic */ Context f44916a;

        public a(Context context) {
            this.f44916a = context;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3778Ym
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3844bc mo19487a() {
            return C3896dc.this.f44915a.mo19674a(this.f44916a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dc$b */
    public class b implements InterfaceC3778Ym<C3844bc> {

        /* renamed from: a */
        public final /* synthetic */ Context f44918a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC4156nc f44919b;

        public b(Context context, InterfaceC4156nc interfaceC4156nc) {
            this.f44918a = context;
            this.f44919b = interfaceC4156nc;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3778Ym
        /* renamed from: a */
        public C3844bc mo19487a() {
            return C3896dc.this.f44915a.mo19675a(this.f44918a, this.f44919b);
        }
    }

    public C3896dc(@NonNull InterfaceC3870cc interfaceC3870cc) {
        this.f44915a = interfaceC3870cc;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3870cc
    @NonNull
    /* renamed from: a */
    public C3844bc mo19674a(@NonNull Context context) {
        return m19715a(new a(context));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3870cc
    @NonNull
    /* renamed from: a */
    public C3844bc mo19675a(@NonNull Context context, @NonNull InterfaceC4156nc interfaceC4156nc) {
        return m19715a(new b(context, interfaceC4156nc));
    }

    @NonNull
    /* renamed from: a */
    private C3844bc m19715a(@NonNull InterfaceC3778Ym<C3844bc> interfaceC3778Ym) {
        C3844bc mo19487a = interfaceC3778Ym.mo19487a();
        C3818ac c3818ac = mo19487a.f44822a;
        return (c3818ac == null || !"00000000-0000-0000-0000-000000000000".equals(c3818ac.f44734b)) ? mo19487a : new C3844bc(null, EnumC3911e1.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
