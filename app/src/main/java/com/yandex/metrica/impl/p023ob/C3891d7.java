package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4172o2;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.d7 */
/* loaded from: classes2.dex */
public class C3891d7 {

    /* renamed from: a */
    @NonNull
    private final C4359v7 f44910a;

    public C3891d7() {
        this(new C4359v7());
    }

    /* renamed from: a */
    public C4172o2.f m19711a(@NonNull C4203p7 c4203p7, @NonNull C4068k2 c4068k2) {
        String m20447b;
        C4151n7 c4151n7 = c4203p7.f46120a;
        String str = "";
        if (c4151n7 != null && (m20447b = c4151n7.m20447b()) != null) {
            str = m20447b;
        }
        byte[] m20925a = this.f44910a.m20925a(c4203p7);
        C3379Im m21313b = AbstractC4478zm.m21313b(c4068k2.m19136b().m17753c());
        List<Integer> list = C3382J0.f43175i;
        C3605S c3605s = new C3605S(m20925a, str, EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.m20218b(), m21313b);
        c3605s.m20200c(c4068k2.m20223d());
        return new C4172o2.f(c3605s, c4068k2).m20488a(c3605s.m19073s()).m20489a(true);
    }

    @VisibleForTesting
    public C3891d7(@NonNull C4359v7 c4359v7) {
        this.f44910a = c4359v7;
    }
}
