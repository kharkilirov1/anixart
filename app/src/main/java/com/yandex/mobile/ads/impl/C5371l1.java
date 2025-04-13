package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l1 */
/* loaded from: classes3.dex */
public final class C5371l1 {

    /* renamed from: b */
    @NotNull
    private static final Object f52204b = new Object();

    /* renamed from: c */
    @Nullable
    private static volatile C5371l1 f52205c;

    /* renamed from: d */
    public static final /* synthetic */ int f52206d = 0;

    /* renamed from: a */
    @NotNull
    private final C5313k1 f52207a;

    /* renamed from: com.yandex.mobile.ads.impl.l1$a */
    public static final class a {
        @JvmStatic
        @NotNull
        /* renamed from: a */
        public static C5371l1 m26316a(@NotNull Context context) {
            Intrinsics.m32179h(context, "context");
            if (C5371l1.f52205c == null) {
                synchronized (C5371l1.f52204b) {
                    if (C5371l1.f52205c == null) {
                        C5371l1.f52205c = new C5371l1(r80.m27863a(context));
                    }
                }
            }
            C5371l1 c5371l1 = C5371l1.f52205c;
            if (c5371l1 != null) {
                return c5371l1;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private C5371l1(C5313k1 c5313k1) {
        this.f52207a = c5313k1;
    }

    @NotNull
    /* renamed from: c */
    public final C5313k1 m26315c() {
        return this.f52207a;
    }

    public /* synthetic */ C5371l1(p80 p80Var) {
        this(new C5313k1(p80Var));
    }
}
