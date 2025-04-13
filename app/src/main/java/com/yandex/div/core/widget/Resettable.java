package com.yandex.div.core.widget;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GridContainer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/widget/Resettable;", "T", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class Resettable<T> {

    /* renamed from: a */
    @NotNull
    public final Function0<T> f33059a;

    /* renamed from: b */
    @Nullable
    public T f33060b;

    /* JADX WARN: Multi-variable type inference failed */
    public Resettable(@NotNull Function0<? extends T> function0) {
        this.f33059a = function0;
    }

    /* renamed from: a */
    public final T m17184a() {
        if (this.f33060b == null) {
            this.f33060b = this.f33059a.invoke();
        }
        T t = this.f33060b;
        if (t != null) {
            return t;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }
}
