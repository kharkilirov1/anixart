package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class su0 implements ReadWriteProperty<Object, Object> {

    /* renamed from: a */
    @NotNull
    private WeakReference<Object> f54809a;

    public su0(Object obj) {
        this.f54809a = new WeakReference<>(obj);
    }

    @Override // kotlin.properties.ReadWriteProperty
    @Nullable
    public final Object getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.m32179h(property, "property");
        return this.f54809a.get();
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(@Nullable Object obj, @NotNull KProperty<?> property, @Nullable Object obj2) {
        Intrinsics.m32179h(property, "property");
        this.f54809a = new WeakReference<>(obj2);
    }
}
