package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.gpllibrary.C3127a;
import com.yandex.metrica.impl.p023ob.C4082kg;

/* renamed from: com.yandex.metrica.impl.ob.na */
/* loaded from: classes2.dex */
public class C4154na implements InterfaceC3920ea {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.k.a.b.C7006a mo17818b(@NonNull C3344Hc c3344Hc) {
        C4082kg.k.a.b.C7006a c7006a = new C4082kg.k.a.b.C7006a();
        c7006a.f45745b = c3344Hc.f43053b;
        c7006a.f45746c = c3344Hc.f43054c;
        int ordinal = c3344Hc.f43052a.ordinal();
        int i2 = 3;
        if (ordinal == 1) {
            i2 = 1;
        } else if (ordinal == 2) {
            i2 = 2;
        } else if (ordinal != 3) {
            i2 = 0;
        }
        c7006a.f45747d = i2;
        return c7006a;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3344Hc mo17817a(@NonNull C4082kg.k.a.b.C7006a c7006a) {
        C3127a.b bVar;
        int i2 = c7006a.f45747d;
        if (i2 == 1) {
            bVar = C3127a.b.PRIORITY_LOW_POWER;
        } else if (i2 == 2) {
            bVar = C3127a.b.PRIORITY_BALANCED_POWER_ACCURACY;
        } else if (i2 != 3) {
            bVar = C3127a.b.PRIORITY_NO_POWER;
        } else {
            bVar = C3127a.b.PRIORITY_HIGH_ACCURACY;
        }
        return new C3344Hc(bVar, c7006a.f45745b, c7006a.f45746c);
    }
}
