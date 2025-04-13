package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Fj */
/* loaded from: classes2.dex */
public class C3301Fj {

    /* renamed from: b */
    @Nullable
    private static volatile C3301Fj f42924b;

    /* renamed from: a */
    @NonNull
    private final C3829an f42925a;

    @VisibleForTesting
    public C3301Fj(@NonNull C3829an c3829an) {
        this.f42925a = c3829an;
    }

    @NonNull
    /* renamed from: a */
    public static C3301Fj m18110a(@NonNull Context context) {
        if (f42924b == null) {
            synchronized (C3301Fj.class) {
                if (f42924b == null) {
                    f42924b = new C3301Fj(new C3829an(context, "uuid.dat"));
                }
            }
        }
        return f42924b;
    }

    /* renamed from: b */
    public C3276Ej m18112b(@NonNull Context context, @NonNull InterfaceC3226Cj interfaceC3226Cj) {
        return new C3276Ej(interfaceC3226Cj, new C3201Bj(), this.f42925a, new C3326Gj(context, new C3432L0(), new C3603Rm()));
    }

    /* renamed from: a */
    public C3276Ej m18111a(@NonNull Context context, @NonNull InterfaceC3226Cj interfaceC3226Cj) {
        return new C3276Ej(interfaceC3226Cj, new C3351Hj(context, new C3432L0()), this.f42925a, new C3326Gj(context, new C3432L0(), new C3603Rm()));
    }
}
