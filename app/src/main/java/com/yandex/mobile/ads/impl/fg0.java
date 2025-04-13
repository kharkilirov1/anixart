package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
/* loaded from: classes3.dex */
public final class fg0 {

    /* renamed from: c */
    @NotNull
    public static final C5078a f50259c = new C5078a(0);

    /* renamed from: d */
    @Nullable
    private static volatile fg0 f50260d;

    /* renamed from: a */
    private final int f50261a;

    /* renamed from: b */
    @NotNull
    private final WeakHashMap<ka0, yf0> f50262b;

    /* renamed from: com.yandex.mobile.ads.impl.fg0$a */
    public static final class C5078a {
        private C5078a() {
        }

        public /* synthetic */ C5078a(int i2) {
            this();
        }

        @AnyThread
        @NotNull
        /* renamed from: a */
        public final fg0 m24595a(@NotNull Context context) {
            Intrinsics.m32179h(context, "context");
            fg0 fg0Var = fg0.f50260d;
            if (fg0Var == null) {
                synchronized (this) {
                    fg0Var = fg0.f50260d;
                    if (fg0Var == null) {
                        cz0 m29824a = xz0.m29823b().m29824a(context);
                        fg0 fg0Var2 = new fg0(m29824a != null ? m29824a.m23606o() : 0, 0);
                        fg0.f50260d = fg0Var2;
                        fg0Var = fg0Var2;
                    }
                }
            }
            return fg0Var;
        }
    }

    private fg0(int i2) {
        this.f50261a = i2;
        this.f50262b = new WeakHashMap<>();
    }

    public /* synthetic */ fg0(int i2, int i3) {
        this(i2);
    }

    @Nullable
    /* renamed from: b */
    public final yf0 m24593b(@NotNull ka0 media) {
        Intrinsics.m32179h(media, "media");
        return this.f50262b.remove(media);
    }

    /* renamed from: b */
    public final boolean m24594b() {
        return this.f50262b.size() == this.f50261a;
    }

    /* renamed from: a */
    public final void m24591a(@NotNull yf0 mraidWebView, @NotNull ka0 media) {
        Intrinsics.m32179h(media, "media");
        Intrinsics.m32179h(mraidWebView, "mraidWebView");
        if (this.f50262b.size() < this.f50261a) {
            this.f50262b.put(media, mraidWebView);
        }
    }

    /* renamed from: a */
    public final boolean m24592a(@NotNull ka0 media) {
        Intrinsics.m32179h(media, "media");
        return this.f50262b.containsKey(media);
    }
}
