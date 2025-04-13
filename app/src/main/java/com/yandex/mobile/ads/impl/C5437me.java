package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.me */
/* loaded from: classes3.dex */
public final class C5437me {

    /* renamed from: a */
    @NotNull
    private final g21 f52652a = new g21();

    @Nullable
    /* renamed from: a */
    public final f21 m26629a(@NotNull RectF viewRect, @NotNull z10 imageValue) {
        List<f21> m26793c;
        Intrinsics.m32179h(viewRect, "viewRect");
        Intrinsics.m32179h(imageValue, "imageValue");
        RectF rectF = new RectF(0.0f, 0.0f, imageValue.m30043e(), imageValue.m30034a());
        n21 m30041c = imageValue.m30041c();
        Object obj = null;
        if (m30041c == null || (m26793c = m30041c.m26793c()) == null) {
            return null;
        }
        Iterator<T> it = m26793c.iterator();
        if (it.hasNext()) {
            obj = it.next();
            while (it.hasNext()) {
                f21 f21Var = (f21) it.next();
                Objects.requireNonNull(this.f52652a);
                obj = g21.m24800a((f21) obj, f21Var, rectF, viewRect);
            }
        }
        return (f21) obj;
    }
}
