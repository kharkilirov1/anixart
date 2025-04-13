package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.bk */
/* loaded from: classes3.dex */
public interface InterfaceC4872bk {

    /* renamed from: a */
    @NotNull
    public static final a f48907a = a.f48908a;

    /* renamed from: com.yandex.mobile.ads.impl.bk$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f48908a = new a();

        /* renamed from: b */
        @NotNull
        private static final Object f48909b = new Object();

        /* renamed from: c */
        @Nullable
        private static volatile InterfaceC4872bk f48910c;

        private a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public static InterfaceC4872bk m22851a(@NotNull Context context) {
            Intrinsics.m32179h(context, "context");
            if (f48910c == null) {
                synchronized (f48909b) {
                    if (f48910c == null) {
                        f48910c = new C4928ck(r80.m27863a(context));
                    }
                }
            }
            InterfaceC4872bk interfaceC4872bk = f48910c;
            if (interfaceC4872bk != null) {
                return interfaceC4872bk;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Nullable
    /* renamed from: a */
    cz0 mo22849a();

    /* renamed from: a */
    void mo22850a(@NotNull cz0 cz0Var);
}
