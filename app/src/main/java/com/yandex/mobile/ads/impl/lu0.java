package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
final class lu0 extends Lambda implements Function0<List<? extends Certificate>> {

    /* renamed from: a */
    public final /* synthetic */ C5079fh f52531a;

    /* renamed from: b */
    public final /* synthetic */ C4993dy f52532b;

    /* renamed from: c */
    public final /* synthetic */ C6008x6 f52533c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu0(C5079fh c5079fh, C4993dy c4993dy, C6008x6 c6008x6) {
        super(0);
        this.f52531a = c5079fh;
        this.f52532b = c4993dy;
        this.f52533c = c6008x6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Certificate> invoke() {
        AbstractC5027eh m24596a = this.f52531a.m24596a();
        Intrinsics.m32176e(m24596a);
        return m24596a.mo24154a(this.f52533c.m29677k().m28392g(), this.f52532b.m23957c());
    }
}
