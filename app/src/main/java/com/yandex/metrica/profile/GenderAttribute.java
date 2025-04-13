package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3197Bf;
import com.yandex.metrica.impl.p023ob.C3222Cf;
import com.yandex.metrica.impl.p023ob.C3247Df;
import com.yandex.metrica.impl.p023ob.C3272Ef;
import com.yandex.metrica.impl.p023ob.C3380In;
import com.yandex.metrica.impl.p023ob.C4168no;
import com.yandex.metrica.impl.p023ob.C4289sf;
import com.yandex.metrica.impl.p023ob.C4367vf;
import com.yandex.metrica.impl.p023ob.InterfaceC3347Hf;

/* loaded from: classes2.dex */
public class GenderAttribute {

    /* renamed from: a */
    public final C4367vf f47218a = new C4367vf("appmetrica_gender", new C4168no(), new C3247Df());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");

        private final String mStringValue;

        Gender(String str) {
            this.mStringValue = str;
        }

        public String getStringValue() {
            return this.mStringValue;
        }
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withValue(@NonNull Gender gender) {
        return new UserProfileUpdate<>(new C3272Ef(this.f47218a.m20942a(), gender.getStringValue(), new C3380In(), this.f47218a.m20943b(), new C4289sf(this.f47218a.m20944c())));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withValueIfUndefined(@NonNull Gender gender) {
        return new UserProfileUpdate<>(new C3272Ef(this.f47218a.m20942a(), gender.getStringValue(), new C3380In(), this.f47218a.m20943b(), new C3222Cf(this.f47218a.m20944c())));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC3347Hf> withValueReset() {
        return new UserProfileUpdate<>(new C3197Bf(0, this.f47218a.m20942a(), this.f47218a.m20943b(), this.f47218a.m20944c()));
    }
}
