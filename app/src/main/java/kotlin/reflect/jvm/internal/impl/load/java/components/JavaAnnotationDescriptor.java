package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes3.dex */
public class JavaAnnotationDescriptor implements AnnotationDescriptor {

    /* renamed from: e */
    public static final /* synthetic */ KProperty[] f64381e = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a */
    @NotNull
    public final SourceElement f64382a;

    /* renamed from: b */
    @NotNull
    public final NotNullLazyValue f64383b;

    /* renamed from: c */
    @Nullable
    public final JavaAnnotationArgument f64384c;

    /* renamed from: d */
    @NotNull
    public final FqName f64385d;

    public JavaAnnotationDescriptor(@NotNull final LazyJavaResolverContext lazyJavaResolverContext, @Nullable JavaAnnotation javaAnnotation, @NotNull FqName fqName) {
        Collection<JavaAnnotationArgument> mo32795c;
        SourceElement mo32360a;
        this.f64385d = fqName;
        this.f64382a = (javaAnnotation == null || (mo32360a = lazyJavaResolverContext.f64479c.f64455j.mo32360a(javaAnnotation)) == null) ? SourceElement.f63979a : mo32360a;
        this.f64383b = lazyJavaResolverContext.f64479c.f64446a.mo33623c(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$type$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SimpleType invoke() {
                ClassDescriptor m32401i = lazyJavaResolverContext.f64479c.f64460o.mo32547n().m32401i(JavaAnnotationDescriptor.this.f64385d);
                Intrinsics.m32175d(m32401i, "c.module.builtIns.getBuiltInClassByFqName(fqName)");
                return m32401i.mo32502r();
            }
        });
        this.f64384c = (javaAnnotation == null || (mo32795c = javaAnnotation.mo32795c()) == null) ? null : (JavaAnnotationArgument) CollectionsKt.m32045v(mo32795c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: a */
    public Map<Name, ConstantValue<?>> mo32586a() {
        Map<Name, ConstantValue<?>> map;
        map = EmptyMap.f63145b;
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: d */
    public FqName mo32587d() {
        return this.f64385d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public KotlinType getType() {
        return (SimpleType) StorageKt.m33635a(this.f64383b, f64381e[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: i */
    public SourceElement mo32588i() {
        return this.f64382a;
    }
}
