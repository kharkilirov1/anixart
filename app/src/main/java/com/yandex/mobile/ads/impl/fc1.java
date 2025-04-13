package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fc1 {

    /* renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f50202d = {Reflection.m32195c(new MutablePropertyReference1Impl(fc1.class, "view", "getView()Landroid/view/View;", 0))};

    /* renamed from: a */
    @NotNull
    private final EnumC5072a f50203a;

    /* renamed from: b */
    @Nullable
    private final String f50204b;

    /* renamed from: c */
    @NotNull
    private final su0 f50205c;

    /* renamed from: com.yandex.mobile.ads.impl.fc1$a */
    public enum EnumC5072a {
        f50206a,
        f50207b,
        f50208c,
        f50209d;

        EnumC5072a() {
        }
    }

    public fc1(@NotNull View view, @NotNull EnumC5072a purpose, @Nullable String str) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(purpose, "purpose");
        this.f50203a = purpose;
        this.f50204b = str;
        this.f50205c = tu0.m28737a(view);
    }

    @Nullable
    /* renamed from: a */
    public final String m24543a() {
        return this.f50204b;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC5072a m24544b() {
        return this.f50203a;
    }

    @Nullable
    /* renamed from: c */
    public final View m24545c() {
        return (View) this.f50205c.getValue(this, f50202d[0]);
    }
}
