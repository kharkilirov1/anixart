package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.cq */
/* loaded from: classes3.dex */
public final class C4935cq implements DivTypefaceProvider {

    /* renamed from: a */
    @NotNull
    private final Context f49336a;

    public C4935cq(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f49336a = context;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public final Typeface getBold() {
        C5361kv m26533a = C5414lv.m26533a(this.f49336a);
        if (m26533a != null) {
            return m26533a.m26283a();
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public final Typeface getLight() {
        C5361kv m26533a = C5414lv.m26533a(this.f49336a);
        if (m26533a != null) {
            return m26533a.m26284b();
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public final Typeface getMedium() {
        C5361kv m26533a = C5414lv.m26533a(this.f49336a);
        if (m26533a != null) {
            return m26533a.m26285c();
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public final Typeface getRegular() {
        C5361kv m26533a = C5414lv.m26533a(this.f49336a);
        if (m26533a != null) {
            return m26533a.m26286d();
        }
        return null;
    }

    @androidx.annotation.Nullable
    @Deprecated
    public Typeface getRegularLegacy() {
        return getRegular();
    }
}
