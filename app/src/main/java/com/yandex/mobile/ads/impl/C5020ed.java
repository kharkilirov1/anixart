package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.banner.AbstractC4639g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ed */
/* loaded from: classes3.dex */
public final class C5020ed<T extends ViewGroup> {

    /* renamed from: a */
    @NotNull
    private final Context f49926a;

    /* renamed from: b */
    @NotNull
    private final ViewGroup f49927b;

    /* renamed from: c */
    @NotNull
    private final r70<T> f49928c;

    /* renamed from: d */
    @NotNull
    private final q70<T> f49929d;

    /* renamed from: e */
    @NotNull
    private final C4966dd<T> f49930e;

    public C5020ed(@NotNull Context context, @NotNull AbstractC4639g container, @NotNull List designs, @NotNull ViewTreeObserver.OnPreDrawListener preDrawListener, @NotNull r70 layoutDesignProvider, @NotNull q70 layoutDesignCreator, @NotNull C4966dd layoutDesignBinder) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(container, "container");
        Intrinsics.m32179h(designs, "designs");
        Intrinsics.m32179h(preDrawListener, "preDrawListener");
        Intrinsics.m32179h(layoutDesignProvider, "layoutDesignProvider");
        Intrinsics.m32179h(layoutDesignCreator, "layoutDesignCreator");
        Intrinsics.m32179h(layoutDesignBinder, "layoutDesignBinder");
        this.f49926a = context;
        this.f49927b = container;
        this.f49928c = layoutDesignProvider;
        this.f49929d = layoutDesignCreator;
        this.f49930e = layoutDesignBinder;
    }

    /* renamed from: a */
    public final void m24114a() {
        T m27649a;
        o70<T> m27856a = this.f49928c.m27856a(this.f49926a);
        if (m27856a == null || (m27649a = this.f49929d.m27649a(this.f49927b, m27856a)) == null) {
            return;
        }
        this.f49930e.m23871a(this.f49927b, m27649a, m27856a);
    }

    /* renamed from: b */
    public final void m24115b() {
        this.f49930e.m23870a(this.f49927b);
    }

    public /* synthetic */ C5020ed(Context context, AbstractC4639g abstractC4639g, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(context, abstractC4639g, list, onPreDrawListener, new r70(list), new q70(), new C4966dd(onPreDrawListener));
    }
}
