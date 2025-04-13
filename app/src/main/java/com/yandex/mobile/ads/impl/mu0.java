package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
final class mu0 extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* renamed from: a */
    public final /* synthetic */ ku0 f52815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu0(ku0 ku0Var) {
        super(0);
        this.f52815a = ku0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends X509Certificate> invoke() {
        C4993dy c4993dy;
        c4993dy = this.f52815a.f52155e;
        Intrinsics.m32176e(c4993dy);
        List<Certificate> m23957c = c4993dy.m23957c();
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m23957c, 10));
        for (Certificate certificate : m23957c) {
            Intrinsics.m32177f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
