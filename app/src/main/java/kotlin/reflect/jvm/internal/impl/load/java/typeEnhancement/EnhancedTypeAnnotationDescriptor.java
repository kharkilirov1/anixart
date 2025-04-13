package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes3.dex */
final class EnhancedTypeAnnotationDescriptor implements AnnotationDescriptor {

    /* renamed from: a */
    public static final EnhancedTypeAnnotationDescriptor f64642a = new EnhancedTypeAnnotationDescriptor();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: a */
    public Map<Name, ConstantValue<?>> mo32586a() {
        m32835b();
        throw null;
    }

    /* renamed from: b */
    public final Void m32835b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
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
        m32835b();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: i */
    public SourceElement mo32588i() {
        m32835b();
        throw null;
    }

    @NotNull
    public String toString() {
        return "[EnhancedType]";
    }
}
