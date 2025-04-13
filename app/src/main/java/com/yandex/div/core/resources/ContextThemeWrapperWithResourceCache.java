package com.yandex.div.core.resources;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ContextThemeWrapperWithResourceCache.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/resources/ContextThemeWrapperWithResourceCache;", "Landroidx/appcompat/view/ContextThemeWrapper;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ContextThemeWrapperWithResourceCache extends ContextThemeWrapper {

    /* renamed from: g */
    @NotNull
    public final Lazy f31313g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextThemeWrapperWithResourceCache(@NotNull Context baseContext, @StyleRes int i2) {
        super(baseContext, i2);
        Intrinsics.m32179h(baseContext, "baseContext");
        this.f31313g = LazyKt.m31881b(new Function0<PrimitiveResourceCache>() { // from class: com.yandex.div.core.resources.ContextThemeWrapperWithResourceCache$resourceCache$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public PrimitiveResourceCache invoke() {
                Resources resources;
                resources = super/*androidx.appcompat.view.ContextThemeWrapper*/.getResources();
                Intrinsics.m32178g(resources, "super.getResources()");
                return new PrimitiveResourceCache(resources);
            }
        });
    }

    @Override // androidx.appcompat.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        return (Resources) this.f31313g.getValue();
    }
}
