package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.ha */
/* loaded from: classes2.dex */
public class C3998ha implements InterfaceC3920ea {

    /* renamed from: a */
    @NonNull
    private final C3972ga f45264a;

    public C3998ha() {
        this(new C3972ga());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public Object mo17817a(@NonNull Object obj) {
        C4082kg.f fVar = (C4082kg.f) obj;
        return new C3741Xa(m20006a(fVar.f45682b), m20006a(fVar.f45683c), m20006a(fVar.f45684d));
    }

    @VisibleForTesting
    public C3998ha(@NonNull C3972ga c3972ga) {
        this.f45264a = c3972ga;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.f mo17818b(@NonNull C3741Xa c3741Xa) {
        C4082kg.f fVar = new C4082kg.f();
        fVar.f45682b = m20007a(c3741Xa.f44474a);
        fVar.f45683c = m20007a(c3741Xa.f44475b);
        fVar.f45684d = m20007a(c3741Xa.f44476c);
        return fVar;
    }

    @NonNull
    /* renamed from: a */
    public C3741Xa m20008a(@NonNull C4082kg.f fVar) {
        return new C3741Xa(m20006a(fVar.f45682b), m20006a(fVar.f45683c), m20006a(fVar.f45684d));
    }

    @Nullable
    /* renamed from: a */
    private C4082kg.e m20007a(@Nullable C3716Wa c3716Wa) {
        if (c3716Wa == null) {
            return null;
        }
        Objects.requireNonNull(this.f45264a);
        C4082kg.e eVar = new C4082kg.e();
        eVar.f45680b = c3716Wa.f44374a;
        eVar.f45681c = c3716Wa.f44375b;
        return eVar;
    }

    @Nullable
    /* renamed from: a */
    private C3716Wa m20006a(@Nullable C4082kg.e eVar) {
        if (eVar == null) {
            return null;
        }
        return this.f45264a.mo17817a(eVar);
    }
}
