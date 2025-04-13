package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3727Wl;

/* renamed from: com.yandex.metrica.impl.ob.Uk */
/* loaded from: classes2.dex */
public class C3676Uk implements InterfaceC4010hm {

    /* renamed from: a */
    @NonNull
    private final String f44188a;

    public C3676Uk(@NonNull String str) {
        this.f44188a = str;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4010hm
    /* renamed from: a */
    public boolean mo17941a(@NonNull Object obj) {
        return ((String) obj).equals(this.f44188a);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4010hm
    @NonNull
    /* renamed from: a */
    public C3727Wl.b mo17940a() {
        return C3727Wl.b.EQUALS;
    }
}
