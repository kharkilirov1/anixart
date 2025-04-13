package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3197Bf;
import com.yandex.metrica.impl.p023ob.C3222Cf;
import com.yandex.metrica.impl.p023ob.C3272Ef;
import com.yandex.metrica.impl.p023ob.C4289sf;
import com.yandex.metrica.impl.p023ob.C4367vf;
import com.yandex.metrica.impl.p023ob.InterfaceC3347Hf;
import com.yandex.metrica.impl.p023ob.InterfaceC3555Pn;
import com.yandex.metrica.impl.p023ob.InterfaceC4211pf;
import com.yandex.metrica.impl.p023ob.InterfaceC4350uo;

/* loaded from: classes2.dex */
public class StringAttribute {

    /* renamed from: a */
    public final InterfaceC3555Pn<String> f47220a;

    /* renamed from: b */
    public final C4367vf f47221b;

    public StringAttribute(@NonNull String str, @NonNull InterfaceC3555Pn<String> interfaceC3555Pn, @NonNull InterfaceC4350uo<String> interfaceC4350uo, @NonNull InterfaceC4211pf interfaceC4211pf) {
        this.f47221b = new C4367vf(str, interfaceC4350uo, interfaceC4211pf);
        this.f47220a = interfaceC3555Pn;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withValue(@NonNull String str) {
        return new UserProfileUpdate<>(new C3272Ef(this.f47221b.m20942a(), str, this.f47220a, this.f47221b.m20943b(), new C4289sf(this.f47221b.m20944c())));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withValueIfUndefined(@NonNull String str) {
        return new UserProfileUpdate<>(new C3272Ef(this.f47221b.m20942a(), str, this.f47220a, this.f47221b.m20943b(), new C3222Cf(this.f47221b.m20944c())));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withValueReset() {
        return new UserProfileUpdate<>(new C3197Bf(0, this.f47221b.m20942a(), this.f47221b.m20943b(), this.f47221b.m20944c()));
    }
}
