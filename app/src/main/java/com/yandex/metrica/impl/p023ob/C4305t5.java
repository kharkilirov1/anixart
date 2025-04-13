package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.IReporter;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.t5 */
/* loaded from: classes2.dex */
public class C4305t5 extends AbstractC4279s5 {

    /* renamed from: b */
    @NonNull
    private final IReporter f46487b;

    public C4305t5(@NonNull C3940f4 c3940f4, @NonNull IReporter iReporter) {
        super(c3940f4);
        this.f46487b = iReporter;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4149n5
    /* renamed from: a */
    public boolean mo17815a(@NonNull C4066k0 c4066k0) {
        C3787Z6 m19505a = C3787Z6.m19505a(c4066k0.m20212n());
        HashMap hashMap = new HashMap();
        hashMap.put("type", m19505a.f44629a);
        hashMap.put("delivery_method", m19505a.f44630b);
        this.f46487b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
