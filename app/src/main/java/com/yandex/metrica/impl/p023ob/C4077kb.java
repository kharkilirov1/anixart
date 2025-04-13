package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import java.math.BigDecimal;
import kotlin.Pair;

/* renamed from: com.yandex.metrica.impl.ob.kb */
/* loaded from: classes2.dex */
public class C4077kb implements InterfaceC3920ea<BigDecimal, C3596Rf.e> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public BigDecimal mo17817a(@NonNull C3596Rf.e eVar) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3596Rf.e mo17818b(@NonNull BigDecimal bigDecimal) {
        Pair m20848a = C4322tm.m20848a(bigDecimal);
        C4296sm c4296sm = new C4296sm(((Number) m20848a.f63055b).longValue(), ((Number) m20848a.f63056c).intValue());
        C3596Rf.e eVar = new C3596Rf.e();
        eVar.f43837b = c4296sm.m20768b();
        eVar.f43838c = c4296sm.m20767a();
        return eVar;
    }
}
