package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p023ob.C3734X3;
import com.yandex.metrica.impl.p023ob.C4057jh;

/* renamed from: com.yandex.metrica.impl.ob.W3 */
/* loaded from: classes2.dex */
public class C3709W3 extends C3940f4 {
    public C3709W3(@NonNull Context context, @NonNull C3575Qi c3575Qi, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull C4057jh.e eVar, @NonNull AbstractC3724Wi abstractC3724Wi) {
        this(context, c3862c4, new C3684V3(), new C3583R2(), new C3966g4(context, c3862c4, aVar, abstractC3724Wi, c3575Qi, eVar, C3532P0.m18696i().m18716s().m21320e(), C3658U2.m19216b(context, c3862c4.m19669b()), C3532P0.m18696i().m18707j()));
    }

    @Override // com.yandex.metrica.impl.p023ob.C3940f4
    @NonNull
    /* renamed from: s */
    public CounterConfiguration.EnumC3079b mo19350s() {
        return CounterConfiguration.EnumC3079b.APPMETRICA;
    }

    @VisibleForTesting
    public C3709W3(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3684V3 c3684v3, @NonNull C3583R2 c3583r2, @NonNull C3966g4 c3966g4) {
        super(context, c3862c4, c3684v3, c3583r2, c3966g4);
    }
}
