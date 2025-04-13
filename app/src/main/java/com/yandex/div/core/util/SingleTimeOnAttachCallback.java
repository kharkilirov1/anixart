package com.yandex.div.core.util;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Views.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SingleTimeOnAttachCallback {

    /* renamed from: a */
    @Nullable
    public Function0<Unit> f31468a;

    public SingleTimeOnAttachCallback(@NotNull View view, @Nullable Function0<Unit> function0) {
        this.f31468a = function0;
        if (view.isAttachedToWindow()) {
            m16766a();
        }
    }

    /* renamed from: a */
    public final void m16766a() {
        Function0<Unit> function0 = this.f31468a;
        if (function0 != null) {
            function0.invoke();
        }
        this.f31468a = null;
    }
}
