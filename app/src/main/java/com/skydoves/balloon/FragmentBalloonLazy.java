package com.skydoves.balloon;

import android.content.Context;
import androidx.fragment.app.Fragment;
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

/* compiled from: FragmentBalloonLazy.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/skydoves/balloon/FragmentBalloonLazy;", "Lcom/skydoves/balloon/Balloon$Factory;", "T", "Lkotlin/Lazy;", "Lcom/skydoves/balloon/Balloon;", "balloon_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class FragmentBalloonLazy<T extends Balloon.Factory> implements Lazy<Balloon> {

    /* renamed from: b */
    public Balloon f24712b;

    /* renamed from: c */
    public final Fragment f24713c;

    /* renamed from: d */
    public final KClass<T> f24714d;

    public FragmentBalloonLazy(@NotNull Fragment fragment, @NotNull KClass<T> clazz) {
        Intrinsics.m32179h(clazz, "clazz");
        this.f24713c = fragment;
        this.f24714d = clazz;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.skydoves.balloon.FragmentBalloonLazy$value$factory$1] */
    @Override // kotlin.Lazy
    public Balloon getValue() {
        Balloon balloon = this.f24712b;
        if (balloon != null || this.f24713c.getContext() == null) {
            return balloon;
        }
        final KClass<T> kClass = this.f24714d;
        Balloon.Factory factory = (Balloon.Factory) ((Class) new PropertyReference0Impl(kClass) { // from class: com.skydoves.balloon.FragmentBalloonLazy$value$factory$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            @Nullable
            public Object get() {
                return JvmClassMappingKt.m32147b((KClass) this.receiver);
            }
        }.get()).newInstance();
        LifecycleOwner viewLifecycleOwner = this.f24713c.getView() != null ? this.f24713c.getViewLifecycleOwner() : this.f24713c;
        Intrinsics.m32178g(viewLifecycleOwner, "if (fragment.view != nul…       fragment\n        }");
        Context requireContext = this.f24713c.requireContext();
        Intrinsics.m32178g(requireContext, "fragment.requireContext()");
        Balloon mo13871a = factory.mo13871a(requireContext, viewLifecycleOwner);
        this.f24712b = mo13871a;
        return mo13871a;
    }
}
