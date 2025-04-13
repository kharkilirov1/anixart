package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4341uf;
import com.yandex.metrica.impl.p023ob.C4367vf;
import com.yandex.metrica.impl.p023ob.InterfaceC3347Hf;
import com.yandex.metrica.impl.p023ob.InterfaceC4211pf;
import com.yandex.metrica.impl.p023ob.InterfaceC4350uo;

/* loaded from: classes2.dex */
public final class CounterAttribute {

    /* renamed from: a */
    public final C4367vf f47217a;

    public CounterAttribute(@NonNull String str, @NonNull InterfaceC4350uo<String> interfaceC4350uo, @NonNull InterfaceC4211pf interfaceC4211pf) {
        this.f47217a = new C4367vf(str, interfaceC4350uo, interfaceC4211pf);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withDelta(double d) {
        return new UserProfileUpdate<>(new C4341uf(this.f47217a.m20942a(), d));
    }
}
