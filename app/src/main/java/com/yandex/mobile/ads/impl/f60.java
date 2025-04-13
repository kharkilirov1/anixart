package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.se0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f60 {

    /* renamed from: com.yandex.mobile.ads.impl.f60$a */
    public static final class C5059a extends Lambda implements Function1<d60, CharSequence> {

        /* renamed from: a */
        public static final C5059a f50127a = new C5059a();

        public C5059a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(d60 d60Var) {
            d60 cause = d60Var;
            Intrinsics.m32179h(cause, "cause");
            return "\t·\t" + cause.getMessage();
        }
    }

    @NotNull
    /* renamed from: a */
    public static String m24321a(@NotNull se0.InterfaceC5743a.b result) {
        Intrinsics.m32179h(result, "result");
        return CollectionsKt.m31989B(result.m28236a(), "\n", "Yandex Mobile Ads integrated incorrectly\n", null, 0, null, C5059a.f50127a, 28, null);
    }
}
