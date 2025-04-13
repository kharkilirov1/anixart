package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.ma */
/* loaded from: classes2.dex */
public class C4128ma implements InterfaceC3920ea {

    /* renamed from: a */
    @NonNull
    private final C4102la f45945a;

    public C4128ma() {
        this(new C4102la());
    }

    @VisibleForTesting
    public C4128ma(@NonNull C4102la c4102la) {
        this.f45945a = c4102la;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.k.a.C7004a mo17818b(@NonNull C3269Ec c3269Ec) {
        C4082kg.k.a.C7004a c7004a = new C4082kg.k.a.C7004a();
        C4443yd c4443yd = c3269Ec.f42804a;
        c7004a.f45737b = c4443yd.f46999a;
        c7004a.f45738c = c4443yd.f47000b;
        C3244Dc c3244Dc = c3269Ec.f42805b;
        if (c3244Dc != null) {
            Objects.requireNonNull(this.f45945a);
            C4082kg.k.a.C7004a.C7005a c7005a = new C4082kg.k.a.C7004a.C7005a();
            c7005a.f45740b = c3244Dc.f42710a;
            c7005a.f45741c = c3244Dc.f42711b;
            c7004a.f45739d = c7005a;
        }
        return c7004a;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3269Ec mo17817a(@NonNull C4082kg.k.a.C7004a c7004a) {
        C3244Dc c3244Dc;
        C4082kg.k.a.C7004a.C7005a c7005a = c7004a.f45739d;
        if (c7005a != null) {
            Objects.requireNonNull(this.f45945a);
            c3244Dc = new C3244Dc(c7005a.f45740b, c7005a.f45741c);
        } else {
            c3244Dc = null;
        }
        return new C3269Ec(new C4443yd(c7004a.f45737b, c7004a.f45738c), c3244Dc);
    }
}
