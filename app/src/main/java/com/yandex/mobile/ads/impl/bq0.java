package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.AbstractC4967de;

/* loaded from: classes3.dex */
public final class bq0 implements g91 {

    /* renamed from: a */
    @NonNull
    private final Context f48961a;

    /* renamed from: b */
    @NonNull
    private final iw0 f48962b = iw0.m25739a();

    public bq0(@NonNull Context context) {
        this.f48961a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.g91
    /* renamed from: a */
    public final void mo22922a(@NonNull String str) {
        aq0 aq0Var = new aq0(this.f48961a, str, new C4881a(str));
        iw0 iw0Var = this.f48962b;
        Context context = this.f48961a;
        synchronized (iw0Var) {
            um0.m29048a(context).m26292a(aq0Var);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bq0$a */
    public static class C4881a implements AbstractC4967de.a<km0> {

        /* renamed from: a */
        private final String f48963a;

        public C4881a(String str) {
            this.f48963a = str;
        }

        @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5822b
        /* renamed from: a */
        public final void mo22924a(Object obj) {
            n60.m26812e("Tracking url ... %s, http response code: %d", this.f48963a, Integer.valueOf(((km0) obj).f52032a));
        }

        @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5821a
        /* renamed from: a */
        public final void mo22923a(@NonNull qh1 qh1Var) {
            n60.m26810c("Something was wrong while tracking url: %s .. \n%s", this.f48963a, qh1Var.toString());
        }
    }
}
