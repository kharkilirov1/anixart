package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
/* loaded from: classes3.dex */
public final class LazyJavaAnnotationDescriptor implements AnnotationDescriptor {

    /* renamed from: g */
    public static final /* synthetic */ KProperty[] f64505g = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a */
    @Nullable
    public final NullableLazyValue f64506a;

    /* renamed from: b */
    @NotNull
    public final NotNullLazyValue f64507b;

    /* renamed from: c */
    @NotNull
    public final JavaSourceElement f64508c;

    /* renamed from: d */
    @NotNull
    public final NotNullLazyValue f64509d;

    /* renamed from: e */
    public final LazyJavaResolverContext f64510e;

    /* renamed from: f */
    public final JavaAnnotation f64511f;

    public LazyJavaAnnotationDescriptor(@NotNull LazyJavaResolverContext c2, @NotNull JavaAnnotation javaAnnotation) {
        Intrinsics.m32180i(c2, "c");
        Intrinsics.m32180i(javaAnnotation, "javaAnnotation");
        this.f64510e = c2;
        this.f64511f = javaAnnotation;
        this.f64506a = c2.f64479c.f64446a.mo33624d(new Function0<FqName>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$fqName$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public FqName invoke() {
                ClassId mo32796g = LazyJavaAnnotationDescriptor.this.f64511f.mo32796g();
                if (mo32796g != null) {
                    return mo32796g.m33189a();
                }
                return null;
            }
        });
        this.f64507b = c2.f64479c.f64446a.mo33623c(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$type$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SimpleType invoke() {
                FqName mo32587d = LazyJavaAnnotationDescriptor.this.mo32587d();
                if (mo32587d == null) {
                    StringBuilder m24u = C0000a.m24u("No fqName: ");
                    m24u.append(LazyJavaAnnotationDescriptor.this.f64511f);
                    return ErrorUtils.m33652c(m24u.toString());
                }
                ClassDescriptor m32462k = JavaToKotlinClassMap.m32462k(JavaToKotlinClassMap.f63882m, mo32587d, LazyJavaAnnotationDescriptor.this.f64510e.f64479c.f64460o.mo32547n(), null, 4);
                if (m32462k == null) {
                    JavaClass mo32797t = LazyJavaAnnotationDescriptor.this.f64511f.mo32797t();
                    m32462k = mo32797t != null ? LazyJavaAnnotationDescriptor.this.f64510e.f64479c.f64456k.mo32726a(mo32797t) : null;
                }
                if (m32462k == null) {
                    LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = LazyJavaAnnotationDescriptor.this;
                    ModuleDescriptor moduleDescriptor = lazyJavaAnnotationDescriptor.f64510e.f64479c.f64460o;
                    ClassId classId = new ClassId(mo32587d.m33198c(), mo32587d.m33199d());
                    DeserializationComponents deserializationComponents = lazyJavaAnnotationDescriptor.f64510e.f64479c.f64449d.f64787a;
                    if (deserializationComponents == null) {
                        Intrinsics.m32189r("components");
                        throw null;
                    }
                    m32462k = FindClassInModuleKt.m32520b(moduleDescriptor, classId, deserializationComponents.f66061m);
                }
                return m32462k.mo32502r();
            }
        });
        this.f64508c = c2.f64479c.f64455j.mo32360a(javaAnnotation);
        this.f64509d = c2.f64479c.f64446a.mo33623c(new Function0<Map<Name, ? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Map<Name, ? extends ConstantValue<?>> invoke() {
                Collection<JavaAnnotationArgument> mo32795c = LazyJavaAnnotationDescriptor.this.f64511f.mo32795c();
                ArrayList arrayList = new ArrayList();
                for (JavaAnnotationArgument javaAnnotationArgument : mo32795c) {
                    Name f66549a = javaAnnotationArgument.getF66549a();
                    if (f66549a == null) {
                        f66549a = JvmAnnotationNames.f64349b;
                    }
                    ConstantValue<?> m32735b = LazyJavaAnnotationDescriptor.this.m32735b(javaAnnotationArgument);
                    Pair pair = m32735b != null ? new Pair(f66549a, m32735b) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return MapsKt.m32067l(arrayList);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: a */
    public Map<Name, ConstantValue<?>> mo32586a() {
        return (Map) StorageKt.m33635a(this.f64509d, f64505g[2]);
    }

    /* renamed from: b */
    public final ConstantValue<?> m32735b(JavaAnnotationArgument javaAnnotationArgument) {
        KotlinType m32399g;
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.f65922a.m33525c(((JavaLiteralAnnotationArgument) javaAnnotationArgument).getF66569c());
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            ClassId mo32821b = javaEnumValueAnnotationArgument.mo32821b();
            Name mo32822d = javaEnumValueAnnotationArgument.mo32822d();
            if (mo32821b == null || mo32822d == null) {
                return null;
            }
            return new EnumValue(mo32821b, mo32822d);
        }
        if (!(javaAnnotationArgument instanceof JavaArrayAnnotationArgument)) {
            if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
                return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.f64510e, ((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).mo32798a()));
            }
            if (!(javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument)) {
                return null;
            }
            KotlinType m32777d = this.f64510e.f64478b.m32777d(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).mo32814c(), JavaTypeResolverKt.m32782c(TypeUsage.COMMON, false, null, 3));
            SimpleType simpleType = TypeUtils.f66355a;
            UnwrappedType mo32787K0 = m32777d.mo33662J0().mo32787K0(false);
            Intrinsics.m32175d(mo32787K0, "TypeUtils.makeNotNullabl…toAttributes())\n        )");
            ClassDescriptor m33539l = DescriptorUtilsKt.m33539l(this.f64510e.f64479c.f64460o, new FqName("java.lang.Class"), NoLookupLocation.FOR_NON_TRACKED_SCOPE);
            if (m33539l == null) {
                return null;
            }
            List m31993F = CollectionsKt.m31993F(new TypeProjectionImpl(Variance.INVARIANT, mo32787K0));
            int i2 = Annotations.f64023H1;
            return new KClassValue(KotlinTypeFactory.m33664b(Annotations.Companion.f64024a, m33539l, m31993F));
        }
        Name DEFAULT_ANNOTATION_MEMBER_NAME = javaAnnotationArgument.getF66549a();
        if (DEFAULT_ANNOTATION_MEMBER_NAME == null) {
            DEFAULT_ANNOTATION_MEMBER_NAME = JvmAnnotationNames.f64349b;
            Intrinsics.m32175d(DEFAULT_ANNOTATION_MEMBER_NAME, "DEFAULT_ANNOTATION_MEMBER_NAME");
        }
        List<JavaAnnotationArgument> mo32801e = ((JavaArrayAnnotationArgument) javaAnnotationArgument).mo32801e();
        SimpleType type = (SimpleType) StorageKt.m33635a(this.f64507b, f64505g[1]);
        Intrinsics.m32175d(type, "type");
        if (KotlinTypeKt.m33667a(type)) {
            return null;
        }
        ClassDescriptor m33533f = DescriptorUtilsKt.m33533f(this);
        if (m33533f == null) {
            Intrinsics.m32188q();
            throw null;
        }
        ValueParameterDescriptor m32695a = DescriptorResolverUtils.m32695a(DEFAULT_ANNOTATION_MEMBER_NAME, m33533f);
        if (m32695a == null || (m32399g = m32695a.getType()) == null) {
            m32399g = this.f64510e.f64479c.f64460o.mo32547n().m32399g(Variance.INVARIANT, ErrorUtils.m33652c("Unknown array element type"));
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32801e, 10));
        Iterator<T> it = mo32801e.iterator();
        while (it.hasNext()) {
            ConstantValue<?> m32735b = m32735b((JavaAnnotationArgument) it.next());
            if (m32735b == null) {
                m32735b = new NullValue();
            }
            arrayList.add(m32735b);
        }
        return ConstantValueFactory.f65922a.m33524b(arrayList, m32399g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    /* renamed from: d */
    public FqName mo32587d() {
        NullableLazyValue receiver$0 = this.f64506a;
        KProperty p = f64505g[0];
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(p, "p");
        return (FqName) receiver$0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public KotlinType getType() {
        return (SimpleType) StorageKt.m33635a(this.f64507b, f64505g[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    /* renamed from: i */
    public SourceElement mo32588i() {
        return this.f64508c;
    }

    @NotNull
    public String toString() {
        String mo33364s;
        mo33364s = DescriptorRenderer.f65766a.mo33364s(this, null);
        return mo33364s;
    }
}
