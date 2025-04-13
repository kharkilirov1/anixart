package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes3.dex */
public final class JavaTypeResolver {

    /* renamed from: a */
    public final LazyJavaResolverContext f64622a;

    /* renamed from: b */
    public final TypeParameterResolver f64623b;

    public JavaTypeResolver(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull TypeParameterResolver typeParameterResolver) {
        this.f64622a = lazyJavaResolverContext;
        this.f64623b = typeParameterResolver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x00ac, code lost:
    
        if (r13 == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType m32774a(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType r19, final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r20, kotlin.reflect.jvm.internal.impl.types.SimpleType r21) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.m32774a(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.SimpleType):kotlin.reflect.jvm.internal.impl.types.SimpleType");
    }

    /* renamed from: b */
    public final TypeConstructor m32775b(JavaClassifierType javaClassifierType) {
        FqName fqName = new FqName(javaClassifierType.mo32818s());
        ClassId classId = new ClassId(fqName.m33198c(), fqName.m33199d());
        DeserializationComponents deserializationComponents = this.f64622a.f64479c.f64449d.f64787a;
        if (deserializationComponents == null) {
            Intrinsics.m32189r("components");
            throw null;
        }
        TypeConstructor mo32440j = deserializationComponents.f66061m.m32549a(classId, CollectionsKt.m31993F(0)).mo32440j();
        Intrinsics.m32175d(mo32440j, "c.components.deserialize…istOf(0)).typeConstructor");
        return mo32440j;
    }

    @NotNull
    /* renamed from: c */
    public final KotlinType m32776c(@NotNull JavaArrayType arrayType, @NotNull JavaTypeAttributes attr, boolean z) {
        Intrinsics.m32180i(arrayType, "arrayType");
        Intrinsics.m32180i(attr, "attr");
        JavaType mo32802m = arrayType.mo32802m();
        JavaPrimitiveType javaPrimitiveType = (JavaPrimitiveType) (!(mo32802m instanceof JavaPrimitiveType) ? null : mo32802m);
        PrimitiveType type = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        if (type != null) {
            SimpleType m32410t = this.f64622a.f64479c.f64460o.mo32547n().m32410t(type);
            Intrinsics.m32175d(m32410t, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            return attr.f64616c ? m32410t : KotlinTypeFactory.m33663a(m32410t, m32410t.mo32787K0(true));
        }
        KotlinType m32777d = m32777d(mo32802m, JavaTypeResolverKt.m32782c(TypeUsage.COMMON, attr.f64616c, null, 2));
        if (attr.f64616c) {
            return this.f64622a.f64479c.f64460o.mo32547n().m32399g(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, m32777d);
        }
        return KotlinTypeFactory.m33663a(this.f64622a.f64479c.f64460o.mo32547n().m32399g(Variance.INVARIANT, m32777d), this.f64622a.f64479c.f64460o.mo32547n().m32399g(Variance.OUT_VARIANCE, m32777d).mo32787K0(true));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$transformJavaClassifierType$1] */
    @NotNull
    /* renamed from: d */
    public final KotlinType m32777d(@NotNull JavaType javaType, @NotNull JavaTypeAttributes attr) {
        KotlinType m32777d;
        Intrinsics.m32180i(javaType, "javaType");
        Intrinsics.m32180i(attr, "attr");
        if (javaType instanceof JavaPrimitiveType) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            SimpleType m32412w = type != null ? this.f64622a.f64479c.f64460o.mo32547n().m32412w(type) : this.f64622a.f64479c.f64460o.mo32547n().m32394A();
            Intrinsics.m32175d(m32412w, "if (primitiveType != nul….module.builtIns.unitType");
            return m32412w;
        }
        boolean z = false;
        if (!(javaType instanceof JavaClassifierType)) {
            if (javaType instanceof JavaArrayType) {
                return m32776c((JavaArrayType) javaType, attr, false);
            }
            if (!(javaType instanceof JavaWildcardType)) {
                throw new UnsupportedOperationException("Unsupported type: " + javaType);
            }
            JavaType mo32834w = ((JavaWildcardType) javaType).mo32834w();
            if (mo32834w != null && (m32777d = m32777d(mo32834w, attr)) != null) {
                return m32777d;
            }
            SimpleType m32408r = this.f64622a.f64479c.f64460o.mo32547n().m32408r();
            Intrinsics.m32175d(m32408r, "c.module.builtIns.defaultBound");
            return m32408r;
        }
        final JavaClassifierType javaClassifierType = (JavaClassifierType) javaType;
        ?? r0 = new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$transformJavaClassifierType$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SimpleType invoke() {
                StringBuilder m24u = C0000a.m24u("Unresolved java class ");
                m24u.append(JavaClassifierType.this.mo32816n());
                return ErrorUtils.m33652c(m24u.toString());
            }
        };
        if (!attr.f64616c && attr.f64614a != TypeUsage.SUPERTYPE) {
            z = true;
        }
        boolean mo32817r = javaClassifierType.mo32817r();
        if (!mo32817r && !z) {
            SimpleType m32774a = m32774a(javaClassifierType, attr, null);
            return m32774a != null ? m32774a : r0.invoke();
        }
        SimpleType m32774a2 = m32774a(javaClassifierType, attr.m32773a(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (m32774a2 == null) {
            return r0.invoke();
        }
        SimpleType m32774a3 = m32774a(javaClassifierType, attr.m32773a(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), m32774a2);
        if (m32774a3 != null) {
            return mo32817r ? new RawTypeImpl(m32774a2, m32774a3) : KotlinTypeFactory.m33663a(m32774a2, m32774a3);
        }
        return r0.invoke();
    }
}
