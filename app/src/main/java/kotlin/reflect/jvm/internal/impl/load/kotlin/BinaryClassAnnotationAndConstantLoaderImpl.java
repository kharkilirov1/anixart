package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes3.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* renamed from: d */
    public final AnnotationDeserializer f64764d;

    /* renamed from: e */
    public final ModuleDescriptor f64765e;

    /* renamed from: f */
    public final NotFoundClasses f64766f;

    public BinaryClassAnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses, @NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        this.f64765e = moduleDescriptor;
        this.f64766f = notFoundClasses;
        this.f64764d = new AnnotationDeserializer(moduleDescriptor, notFoundClasses);
    }

    @Nullable
    /* renamed from: x */
    public static final KClassValue m32894x(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, @NotNull KotlinJvmBinaryClass.ClassLiteralId classLiteralId) {
        ClassDescriptor m32519a = FindClassInModuleKt.m32519a(binaryClassAnnotationAndConstantLoaderImpl.f64765e, classLiteralId.f64800a);
        if (m32519a == null) {
            return null;
        }
        SimpleType mo32502r = m32519a.mo32502r();
        Intrinsics.m32175d(mo32502r, "classDescriptor.defaultType");
        int i2 = 0;
        int i3 = classLiteralId.f64801b;
        while (i2 < i3) {
            SimpleType m32411u = i2 == 0 ? binaryClassAnnotationAndConstantLoaderImpl.f64765e.mo32547n().m32411u(mo32502r) : null;
            mo32502r = m32411u != null ? m32411u : binaryClassAnnotationAndConstantLoaderImpl.f64765e.mo32547n().m32399g(Variance.INVARIANT, mo32502r);
            i2++;
        }
        return new KClassValue(KotlinTypeFactory.m33664b(Annotations.Companion.f64024a, FindClassInModuleKt.m32520b(binaryClassAnnotationAndConstantLoaderImpl.f64765e, ClassId.m33188i(KotlinBuiltIns.f63730l.f63764W.m33207g()), binaryClassAnnotationAndConstantLoaderImpl.f64766f), CollectionsKt.m31993F(new TypeProjectionImpl(Variance.INVARIANT, mo32502r))));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @Nullable
    /* renamed from: s */
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo32884s(@NotNull ClassId annotationClassId, @NotNull SourceElement source, @NotNull List<AnnotationDescriptor> result) {
        Intrinsics.m32180i(annotationClassId, "annotationClassId");
        Intrinsics.m32180i(source, "source");
        Intrinsics.m32180i(result, "result");
        return new BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1(this, FindClassInModuleKt.m32520b(this.f64765e, annotationClassId, this.f64766f), result, source);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    /* renamed from: u */
    public AnnotationDescriptor mo32886u(ProtoBuf.Annotation annotation, NameResolver nameResolver) {
        return this.f64764d.m33555a(annotation, nameResolver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    /* renamed from: w */
    public ConstantValue<?> mo32888w(ConstantValue<?> constantValue) {
        ConstantValue<?> uLongValue;
        ConstantValue<?> constantValue2 = constantValue;
        if (constantValue2 instanceof ByteValue) {
            uLongValue = new UByteValue(((Number) ((ByteValue) constantValue2).f65921a).byteValue());
        } else if (constantValue2 instanceof ShortValue) {
            uLongValue = new UShortValue(((Number) ((ShortValue) constantValue2).f65921a).shortValue());
        } else if (constantValue2 instanceof IntValue) {
            uLongValue = new UIntValue(((Number) ((IntValue) constantValue2).f65921a).intValue());
        } else {
            if (!(constantValue2 instanceof LongValue)) {
                return constantValue2;
            }
            uLongValue = new ULongValue(((Number) ((LongValue) constantValue2).f65921a).longValue());
        }
        return uLongValue;
    }
}
