package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.C4483l;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.rtm.wrapper.InterfaceC4620d;

/* renamed from: com.yandex.metrica.impl.ob.l0 */
/* loaded from: classes2.dex */
public class C4092l0 extends AbstractC3381J {

    /* renamed from: p */
    @NonNull
    private final C3687V6 f45842p;

    /* renamed from: q */
    @NonNull
    private final C3891d7 f45843q;

    public C4092l0(@NonNull Context context, @NonNull C3659U3 c3659u3, @NonNull C4483l c4483l, @NonNull C4146n2 c4146n2) {
        this(context, c3659u3, c4483l, c4146n2, new C3407K0(context));
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3381J, com.yandex.metrica.impl.p023ob.InterfaceC3833b1
    /* renamed from: a */
    public void mo18346a(@NonNull C4203p7 c4203p7) {
        this.f45842p.m19269a(this.f45843q.m19711a(c4203p7, this.f43154b));
        m18351b(c4203p7);
    }

    private C4092l0(@NonNull Context context, @NonNull C3659U3 c3659u3, @NonNull C4483l c4483l, @NonNull C4146n2 c4146n2, @NonNull C3407K0 c3407k0) {
        this(context, c4146n2, new C4068k2(c3659u3, new CounterConfiguration(c4483l, CounterConfiguration.EnumC3079b.CRASH), c4483l.userProfileID), c3407k0, new C3687V6(context), new C3891d7(), C3755Y.m19410g().m19419j(), new C4291sh(), new C4395wh(null, null), new C3289F7(), new C3164A7(), new C4333u7(), new C4281s7(), new C3813a7(c3407k0));
    }

    @VisibleForTesting
    public C4092l0(@NonNull Context context, @NonNull C4146n2 c4146n2, @NonNull C4068k2 c4068k2, @NonNull C3407K0 c3407k0, @NonNull C3687V6 c3687v6, @NonNull C3891d7 c3891d7, @NonNull InterfaceC3354Hm interfaceC3354Hm, @NonNull InterfaceC4620d interfaceC4620d, @NonNull C4395wh c4395wh, @NonNull C3289F7 c3289f7, @NonNull C3164A7 c3164a7, @NonNull C4333u7 c4333u7, @NonNull C4281s7 c4281s7, @NonNull C3813a7 c3813a7) {
        super(context, c4146n2, c4068k2, c3407k0, interfaceC3354Hm, interfaceC4620d, c4395wh, c3289f7, c3164a7, c4333u7, c4281s7, c3813a7);
        this.f45842p = c3687v6;
        this.f45843q = c3891d7;
    }
}
