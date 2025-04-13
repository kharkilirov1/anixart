package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class fh1 {

    /* renamed from: a */
    @NonNull
    private final aj1 f50271a = new aj1();

    /* renamed from: b */
    @NonNull
    private final xz0 f50272b = xz0.m29823b();

    @Nullable
    /* renamed from: a */
    public final Rect m24605a(@NonNull View view) {
        Rect rect = new Rect();
        Context context = view.getContext();
        if (view.getGlobalVisibleRect(rect)) {
            cz0 m29824a = this.f50272b.m29824a(context);
            if (!(m29824a != null && m29824a.m23582U())) {
                return rect;
            }
            Objects.requireNonNull(this.f50271a);
            Rect m22530a = aj1.m22530a(view);
            Rect rect2 = new Rect(rect);
            if (rect2.intersect(m22530a)) {
                return rect2;
            }
        }
        return null;
    }
}
