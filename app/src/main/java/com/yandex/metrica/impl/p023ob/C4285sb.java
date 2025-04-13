package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.metrica.impl.p023ob.C3596Rf;

/* renamed from: com.yandex.metrica.impl.ob.sb */
/* loaded from: classes2.dex */
public class C4285sb implements InterfaceC3920ea<C3318Gb, C4311tb<C3596Rf.m, InterfaceC3305Fn>> {

    /* renamed from: a */
    @NonNull
    private final C4337ub f46358a;

    /* renamed from: b */
    @NonNull
    private final C3679Un f46359b;

    /* renamed from: c */
    @NonNull
    private final C3679Un f46360c;

    public C4285sb() {
        this(new C4337ub(), new C3679Un(100), new C3679Un(RecyclerView.ViewHolder.FLAG_MOVED));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C3318Gb mo17817a(@NonNull C4311tb<C3596Rf.m, InterfaceC3305Fn> c4311tb) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C4285sb(@NonNull C4337ub c4337ub, @NonNull C3679Un c3679Un, @NonNull C3679Un c3679Un2) {
        this.f46358a = c4337ub;
        this.f46359b = c3679Un;
        this.f46360c = c3679Un2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4311tb<C3596Rf.m, InterfaceC3305Fn> mo17818b(@NonNull C3318Gb c3318Gb) {
        C4311tb<C3596Rf.n, InterfaceC3305Fn> c4311tb;
        C3596Rf.m mVar = new C3596Rf.m();
        C3580Qn<String, InterfaceC3305Fn> mo19058a = this.f46359b.mo19058a(c3318Gb.f42995a);
        mVar.f43864b = C3509O2.m18658c(mo19058a.f43777a);
        C3580Qn<String, InterfaceC3305Fn> mo19058a2 = this.f46360c.mo19058a(c3318Gb.f42996b);
        mVar.f43865c = C3509O2.m18658c(mo19058a2.f43777a);
        C3343Hb c3343Hb = c3318Gb.f42997c;
        if (c3343Hb != null) {
            c4311tb = this.f46358a.mo17818b(c3343Hb);
            mVar.f43866d = c4311tb.f46509a;
        } else {
            c4311tb = null;
        }
        return new C4311tb<>(mVar, C3280En.m18019a(mo19058a, mo19058a2, c4311tb));
    }
}
