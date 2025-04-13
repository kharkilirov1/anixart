package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyJavaStaticScope.kt */
/* loaded from: classes3.dex */
public abstract class LazyJavaStaticScope extends LazyJavaScope {
    public LazyJavaStaticScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        super(lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: m */
    public void mo32756m(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: o */
    public /* bridge */ /* synthetic */ ReceiverParameterDescriptor mo32758o() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* renamed from: r */
    public LazyJavaScope.MethodSignatureData mo32761r(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> valueParameters) {
        Intrinsics.m32180i(valueParameters, "valueParameters");
        return new LazyJavaScope.MethodSignatureData(kotlinType, null, valueParameters, list, false, EmptyList.f63144b);
    }
}
