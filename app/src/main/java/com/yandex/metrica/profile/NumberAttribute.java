package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3197Bf;
import com.yandex.metrica.impl.p023ob.C3222Cf;
import com.yandex.metrica.impl.p023ob.C3330Gn;
import com.yandex.metrica.impl.p023ob.C4289sf;
import com.yandex.metrica.impl.p023ob.C4367vf;
import com.yandex.metrica.impl.p023ob.C4393wf;
import com.yandex.metrica.impl.p023ob.C4419xf;
import com.yandex.metrica.impl.p023ob.C4471zf;
import com.yandex.metrica.impl.p023ob.InterfaceC3347Hf;
import com.yandex.metrica.impl.p023ob.InterfaceC4211pf;
import com.yandex.metrica.impl.p023ob.InterfaceC4350uo;

/* loaded from: classes2.dex */
public final class NumberAttribute {

    /* renamed from: a */
    public final C4367vf f47219a;

    public NumberAttribute(@NonNull String str, @NonNull InterfaceC4350uo<String> interfaceC4350uo, @NonNull InterfaceC4211pf interfaceC4211pf) {
        this.f47219a = new C4367vf(str, interfaceC4350uo, interfaceC4211pf);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withValue(double d) {
        return new UserProfileUpdate<>(new C4471zf(this.f47219a.m20942a(), d, new C4393wf(), new C4289sf(new C4419xf(new C3330Gn(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withValueIfUndefined(double d) {
        return new UserProfileUpdate<>(new C4471zf(this.f47219a.m20942a(), d, new C4393wf(), new C3222Cf(new C4419xf(new C3330Gn(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withValueReset() {
        return new UserProfileUpdate<>(new C3197Bf(1, this.f47219a.m20942a(), new C4393wf(), new C4419xf(new C3330Gn(100))));
    }
}
