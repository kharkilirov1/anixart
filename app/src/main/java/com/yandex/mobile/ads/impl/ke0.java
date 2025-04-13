package com.yandex.mobile.ads.impl;

import com.yandex.div.core.DivKit;
import com.yandex.div2.C3033a;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ke0 extends re0 {

    /* renamed from: b */
    private static final int f51957b = new lb1(BuildConfigFieldProvider.getDivKitVersion()).m26425a();

    /* renamed from: a */
    private final boolean f51958a;

    public ke0(boolean z) {
        this.f51958a = z;
    }

    @Override // com.yandex.mobile.ads.impl.re0
    /* renamed from: a */
    public final void mo26112a(@NotNull Function1<? super d60, Unit> onValidationFailed) {
        Intrinsics.m32179h(onValidationFailed, "onValidationFailed");
        try {
            DivKit.Companion companion = DivKit.f30958b;
            lb1 lb1Var = new lb1("25.2.0");
            if (this.f51958a) {
                return;
            }
            int m26425a = lb1Var.m26425a();
            int i2 = f51957b;
            if (m26425a == i2) {
                return;
            }
            onValidationFailed.invoke(new d60(C3033a.m17745g(new Object[]{Integer.valueOf(i2), Integer.valueOf(lb1Var.m26425a())}, 2, "Unsupported DivKit major version. Expected: %s. Actual: %s", "format(this, *args)")));
            throw null;
        } catch (NoClassDefFoundError unused) {
            onValidationFailed.invoke(new d60(C3033a.m17745g(new Object[0], 0, "DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", "format(this, *args)")));
            throw null;
        }
    }
}
