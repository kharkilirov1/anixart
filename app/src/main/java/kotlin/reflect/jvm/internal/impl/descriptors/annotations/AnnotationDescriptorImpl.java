package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class AnnotationDescriptorImpl implements AnnotationDescriptor {

    /* renamed from: a */
    public final KotlinType f64002a;

    /* renamed from: b */
    public final Map<Name, ConstantValue<?>> f64003b;

    /* renamed from: c */
    public final SourceElement f64004c;

    public AnnotationDescriptorImpl(@NotNull KotlinType kotlinType, @NotNull Map<Name, ConstantValue<?>> map, @NotNull SourceElement sourceElement) {
        this.f64002a = kotlinType;
        this.f64003b = map;
        this.f64004c = sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: a */
    public Map<Name, ConstantValue<?>> mo32586a() {
        return this.f64003b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    /* renamed from: d */
    public FqName mo32587d() {
        return AnnotationDescriptor.DefaultImpls.m32589a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        return this.f64002a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: i */
    public SourceElement mo32588i() {
        return this.f64004c;
    }

    public String toString() {
        return DescriptorRenderer.f65766a.mo33364s(this, null);
    }
}
