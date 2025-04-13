package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;

/* renamed from: com.yandex.mobile.ads.impl.s4 */
/* loaded from: classes3.dex */
public final class C5726s4 {

    /* renamed from: a */
    @NonNull
    private final C5519o1 f54501a;

    public C5726s4(@NonNull C5519o1 c5519o1) {
        this.f54501a = c5519o1;
    }

    @NonNull
    /* renamed from: a */
    public final C4842b6 m28065a() {
        return this.f54501a.m26979b().m29379a();
    }

    @Nullable
    /* renamed from: b */
    public final String m28066b() {
        AdBreakParameters m26982e = this.f54501a.m26982e();
        if (m26982e != null) {
            return m26982e.m30768c();
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public final String m28067c() {
        return this.f54501a.m26979b().m29380b();
    }

    @Nullable
    /* renamed from: d */
    public final String m28068d() {
        AdBreakParameters m26982e = this.f54501a.m26982e();
        if (m26982e != null) {
            return m26982e.m30769d();
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public final String m28069e() {
        AdBreakParameters m26982e = this.f54501a.m26982e();
        if (m26982e != null) {
            return m26982e.m30770e();
        }
        return null;
    }
}
