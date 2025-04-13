package com.yandex.div.histogram;

import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HistogramConfiguration.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/histogram/DoubleCheckProvider;", "T", "Ljavax/inject/Provider;", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class DoubleCheckProvider<T> implements Provider<T> {

    /* renamed from: a */
    @NotNull
    public final Lazy f33669a;

    public DoubleCheckProvider(@NotNull Function0<? extends T> init) {
        Intrinsics.m32179h(init, "init");
        this.f33669a = LazyKt.m31881b(init);
    }

    @Override // javax.inject.Provider
    public T get() {
        return (T) this.f33669a.getValue();
    }
}
