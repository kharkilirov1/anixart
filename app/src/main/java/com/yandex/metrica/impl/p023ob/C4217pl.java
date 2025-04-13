package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3727Wl;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.pl */
/* loaded from: classes2.dex */
public class C4217pl implements InterfaceC4010hm {

    /* renamed from: a */
    @NonNull
    private final Pattern f46207a;

    public C4217pl(@NonNull Pattern pattern) {
        this.f46207a = pattern;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4010hm
    /* renamed from: a */
    public boolean mo17941a(@NonNull Object obj) {
        return this.f46207a.matcher((String) obj).matches();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4010hm
    @NonNull
    /* renamed from: a */
    public C3727Wl.b mo17940a() {
        return C3727Wl.b.BAD_REGEXP_MATCHED;
    }
}
