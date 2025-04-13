package com.yandex.div.internal.util;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/internal/util/WeakRef;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class WeakRef<T> implements ReadWriteProperty<Object, T> {

    /* renamed from: a */
    @Nullable
    public WeakReference<T> f33905a;

    public WeakRef() {
        this.f33905a = null;
    }

    @Override // kotlin.properties.ReadWriteProperty
    @Nullable
    public T getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.m32179h(property, "property");
        WeakReference<T> weakReference = this.f33905a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> property, @Nullable T t) {
        Intrinsics.m32179h(property, "property");
        this.f33905a = t == null ? null : new WeakReference<>(t);
    }

    public WeakRef(@Nullable T t) {
        this.f33905a = t == null ? null : new WeakReference<>(t);
    }
}
