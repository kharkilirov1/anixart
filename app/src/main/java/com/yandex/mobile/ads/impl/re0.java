package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class re0 {

    /* renamed from: com.yandex.mobile.ads.impl.re0$a */
    public static final class C5686a extends Lambda implements Function1<d60, Unit> {

        /* renamed from: a */
        public static final C5686a f54295a = new C5686a();

        public C5686a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(d60 d60Var) {
            d60 it = d60Var;
            Intrinsics.m32179h(it, "it");
            throw it;
        }
    }

    /* renamed from: a */
    public final void m27911a() {
        mo26112a(C5686a.f54295a);
    }

    /* renamed from: a */
    public abstract void mo26112a(@NotNull Function1<? super d60, Unit> function1);
}
