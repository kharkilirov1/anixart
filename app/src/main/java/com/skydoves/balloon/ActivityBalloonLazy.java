package com.skydoves.balloon;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.Balloon.Factory;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActivityBalloonLazy.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/skydoves/balloon/ActivityBalloonLazy;", "Lcom/skydoves/balloon/Balloon$Factory;", "T", "Lkotlin/Lazy;", "Lcom/skydoves/balloon/Balloon;", "balloon_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ActivityBalloonLazy<T extends Balloon.Factory> implements Lazy<Balloon> {

    /* renamed from: b */
    public Balloon f24581b;

    /* renamed from: c */
    public final Context f24582c;

    /* renamed from: d */
    public final LifecycleOwner f24583d;

    /* renamed from: e */
    public final KClass<T> f24584e;

    public ActivityBalloonLazy(@NotNull Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull KClass<T> clazz) {
        Intrinsics.m32179h(clazz, "clazz");
        this.f24582c = context;
        this.f24583d = lifecycleOwner;
        this.f24584e = clazz;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.skydoves.balloon.ActivityBalloonLazy$value$factory$1] */
    @Override // kotlin.Lazy
    public Balloon getValue() {
        Balloon balloon = this.f24581b;
        if (balloon != null) {
            return balloon;
        }
        final KClass<T> kClass = this.f24584e;
        Balloon mo13871a = ((Balloon.Factory) ((Class) new PropertyReference0Impl(kClass) { // from class: com.skydoves.balloon.ActivityBalloonLazy$value$factory$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            @Nullable
            public Object get() {
                return JvmClassMappingKt.m32147b((KClass) this.receiver);
            }
        }.get()).newInstance()).mo13871a(this.f24582c, this.f24583d);
        this.f24581b = mo13871a;
        return mo13871a;
    }
}
