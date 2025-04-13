package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.Nullable;

/* compiled from: Views.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/widget/AppearanceAffectingViewProperty;", "T", "Lkotlin/properties/ReadWriteProperty;", "Landroid/view/View;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class AppearanceAffectingViewProperty<T> implements ReadWriteProperty<View, T> {

    /* renamed from: a */
    public T f32963a;

    /* renamed from: b */
    @Nullable
    public final Function1<T, T> f32964b;

    /* JADX WARN: Multi-variable type inference failed */
    public AppearanceAffectingViewProperty(T t, @Nullable Function1<? super T, ? extends T> function1) {
        this.f32963a = t;
        this.f32964b = function1;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public Object getValue(View view, KProperty property) {
        View thisRef = view;
        Intrinsics.m32179h(thisRef, "thisRef");
        Intrinsics.m32179h(property, "property");
        return this.f32963a;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(View view, KProperty property, Object obj) {
        T invoke;
        View thisRef = view;
        Intrinsics.m32179h(thisRef, "thisRef");
        Intrinsics.m32179h(property, "property");
        Function1<T, T> function1 = this.f32964b;
        if (function1 != null && (invoke = function1.invoke(obj)) != null) {
            obj = invoke;
        }
        if (Intrinsics.m32174c(this.f32963a, obj)) {
            return;
        }
        this.f32963a = (T) obj;
        thisRef.invalidate();
    }
}
