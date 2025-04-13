package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.Player;

/* renamed from: com.yandex.mobile.ads.impl.j4 */
/* loaded from: classes3.dex */
public final class C5267j4 implements ss0 {

    /* renamed from: a */
    @NonNull
    private final C4794a6 f51487a;

    /* renamed from: b */
    @NonNull
    private final zq0 f51488b;

    /* renamed from: c */
    @NonNull
    private final C5603ps f51489c;

    public C5267j4(@NonNull C4794a6 c4794a6, @NonNull yq0 yq0Var) {
        this.f51487a = c4794a6;
        this.f51488b = yq0Var.m29965d();
        this.f51489c = yq0Var.m29964c();
    }

    @Override // com.yandex.mobile.ads.impl.ss0
    @NonNull
    /* renamed from: a */
    public final oq0 mo24583a() {
        Player m27369a;
        dr0 m22384b = this.f51487a.m22384b();
        if (m22384b == null) {
            return oq0.f53308c;
        }
        boolean m30284c = this.f51488b.m30284c();
        d40 m22380a = this.f51487a.m22380a(m22384b.m23928b());
        oq0 oq0Var = oq0.f53308c;
        return (d40.f49559a.equals(m22380a) || !m30284c || (m27369a = this.f51489c.m27369a()) == null) ? oq0Var : new oq0(m27369a.getCurrentPosition(), m27369a.getDuration());
    }
}
