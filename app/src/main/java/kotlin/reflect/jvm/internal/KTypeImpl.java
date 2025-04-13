package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KTypeImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\nX\u008a\u0084\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/reflect/KType;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "", "parameterizedTypeArguments", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KTypeImpl implements KType {

    /* renamed from: f */
    public static final /* synthetic */ KProperty[] f63611f = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KTypeImpl.class), "javaType", "getJavaType$kotlin_reflect_api()Ljava/lang/reflect/Type;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KTypeImpl.class), "arguments", "getArguments()Ljava/util/List;")), Reflection.m32196d(new PropertyReference0Impl(Reflection.m32193a(KTypeImpl.class), "parameterizedTypeArguments", "<v#0>"))};

    /* renamed from: b */
    @NotNull
    public final ReflectProperties.LazySoftVal f63612b;

    /* renamed from: c */
    @Nullable
    public final ReflectProperties.LazySoftVal f63613c;

    /* renamed from: d */
    @NotNull
    public final ReflectProperties.LazySoftVal f63614d;

    /* renamed from: e */
    @NotNull
    public final KotlinType f63615e;

    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
        }
    }

    public KTypeImpl(@NotNull KotlinType kotlinType, @NotNull Function0<? extends Type> computeJavaType) {
        Intrinsics.m32180i(computeJavaType, "computeJavaType");
        this.f63615e = kotlinType;
        this.f63612b = ReflectProperties.m32304a(computeJavaType);
        this.f63613c = ReflectProperties.m32304a(new Function0<KClassifier>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$classifier$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public KClassifier invoke() {
                KTypeImpl kTypeImpl = KTypeImpl.this;
                return kTypeImpl.m32301h(kTypeImpl.f63615e);
            }
        });
        this.f63614d = ReflectProperties.m32304a(new KTypeImpl$arguments$2(this));
    }

    @Override // kotlin.reflect.KType
    @NotNull
    /* renamed from: c */
    public List<KTypeProjection> mo32218c() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f63614d;
        KProperty kProperty = f63611f[2];
        return (List) lazySoftVal.m32305a();
    }

    @Override // kotlin.reflect.KType
    @Nullable
    /* renamed from: e */
    public KClassifier getF63357b() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f63613c;
        KProperty kProperty = f63611f[1];
        return (KClassifier) lazySoftVal.m32305a();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof KTypeImpl) && Intrinsics.m32174c(this.f63615e, ((KTypeImpl) obj).f63615e);
    }

    /* renamed from: h */
    public final KClassifier m32301h(KotlinType kotlinType) {
        KotlinType type;
        ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
        if (!(mo32449b instanceof ClassDescriptor)) {
            if (mo32449b instanceof TypeParameterDescriptor) {
                return new KTypeParameterImpl((TypeParameterDescriptor) mo32449b);
            }
            if (mo32449b instanceof TypeAliasDescriptor) {
                throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
        Class<?> m32326i = UtilKt.m32326i((ClassDescriptor) mo32449b);
        if (m32326i == null) {
            return null;
        }
        if (!m32326i.isArray()) {
            if (TypeUtils.m33694d(kotlinType)) {
                return new KClassImpl(m32326i);
            }
            List<KClass<? extends Object>> list = ReflectClassUtilKt.f66541a;
            Class<? extends Object> cls = ReflectClassUtilKt.f66542b.get(m32326i);
            if (cls != null) {
                m32326i = cls;
            }
            return new KClassImpl(m32326i);
        }
        TypeProjection typeProjection = (TypeProjection) CollectionsKt.m32013Z(kotlinType.mo33514G0());
        if (typeProjection == null || (type = typeProjection.getType()) == null) {
            return new KClassImpl(m32326i);
        }
        KClassifier m32301h = m32301h(type);
        if (m32301h != null) {
            return new KClassImpl(ReflectClassUtilKt.m33797a(JvmClassMappingKt.m32147b(KTypesJvm.m32252a(m32301h))));
        }
        throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
    }

    public int hashCode() {
        return this.f63615e.hashCode();
    }

    @NotNull
    /* renamed from: i */
    public final Type m32302i() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f63612b;
        KProperty kProperty = f63611f[0];
        return (Type) lazySoftVal.m32305a();
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.f63635b.m32312e(this.f63615e);
    }
}
