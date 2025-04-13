package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3197Bf;
import com.yandex.metrica.impl.p023ob.C3222Cf;
import com.yandex.metrica.impl.p023ob.C4263rf;
import com.yandex.metrica.impl.p023ob.C4289sf;
import com.yandex.metrica.impl.p023ob.C4367vf;
import com.yandex.metrica.impl.p023ob.InterfaceC3347Hf;
import com.yandex.metrica.impl.p023ob.InterfaceC4211pf;
import com.yandex.metrica.impl.p023ob.InterfaceC4350uo;

/* loaded from: classes2.dex */
public class BooleanAttribute {

    /* renamed from: a */
    public final C4367vf f47216a;

    public BooleanAttribute(@NonNull String str, @NonNull InterfaceC4350uo<String> interfaceC4350uo, @NonNull InterfaceC4211pf interfaceC4211pf) {
        this.f47216a = new C4367vf(str, interfaceC4350uo, interfaceC4211pf);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withValue(boolean z) {
        return new UserProfileUpdate<>(new C4263rf(this.f47216a.m20942a(), z, this.f47216a.m20943b(), new C4289sf(this.f47216a.m20944c())));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withValueIfUndefined(boolean z) {
        return new UserProfileUpdate<>(new C4263rf(this.f47216a.m20942a(), z, this.f47216a.m20943b(), new C3222Cf(this.f47216a.m20944c())));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withValueReset() {
        return new UserProfileUpdate<>(new C3197Bf(3, this.f47216a.m20942a(), this.f47216a.m20943b(), this.f47216a.m20944c()));
    }
}
