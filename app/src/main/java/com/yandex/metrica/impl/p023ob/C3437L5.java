package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.L5 */
/* loaded from: classes2.dex */
public class C3437L5 extends AbstractC4279s5 {
    public C3437L5(C3940f4 c3940f4) {
        super(c3940f4);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4149n5
    /* renamed from: a */
    public boolean mo17815a(@NonNull C4066k0 c4066k0) {
        String m19885p = m20685a().m19885p();
        String m20210l = c4066k0.m20210l();
        m20685a().m19871b(m20210l);
        if (TextUtils.equals(m19885p, m20210l)) {
            return false;
        }
        m20685a().mo19139a(C3605S.m19064r());
        return false;
    }
}
