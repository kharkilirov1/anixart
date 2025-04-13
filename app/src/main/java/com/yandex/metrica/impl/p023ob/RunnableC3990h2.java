package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.h2 */
/* loaded from: classes2.dex */
class RunnableC3990h2 implements Runnable {

    /* renamed from: a */
    @NonNull
    private final Context f45251a;

    /* renamed from: b */
    private final C4066k0 f45252b;

    /* renamed from: c */
    private final Bundle f45253c;

    /* renamed from: d */
    @NonNull
    private final C3236D4 f45254d;

    public RunnableC3990h2(@NonNull Context context, C4066k0 c4066k0, Bundle bundle, @NonNull C3236D4 c3236d4) {
        this.f45251a = context;
        this.f45252b = c4066k0;
        this.f45253c = bundle;
        this.f45254d = c3236d4;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3634T3 c3634t3 = new C3634T3(this.f45253c);
        if (C3634T3.m19134a(c3634t3, this.f45251a)) {
            return;
        }
        C3211C4 m17918a = C3211C4.m17918a(c3634t3);
        C3734X3 c3734x3 = new C3734X3(c3634t3);
        this.f45254d.m17949a(m17918a, c3734x3).mo17811a(this.f45252b, c3734x3);
    }
}
