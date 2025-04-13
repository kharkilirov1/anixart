package com.yandex.div.internal.util;

import kotlin.Metadata;
import kotlin.properties.ReadWriteProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class UtilsKt {
    @NotNull
    /* renamed from: a */
    public static final <T> ReadWriteProperty<Object, T> m17398a(@Nullable T t) {
        return new WeakRef(t);
    }
}
