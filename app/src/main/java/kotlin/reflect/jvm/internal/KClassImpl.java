package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: KClassImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005:\u0001\u0014R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "", "T", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflect_api", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflect_api", "staticScope", "Data", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KClassifierImpl {

    /* renamed from: f */
    public static final /* synthetic */ int f63476f = 0;

    /* renamed from: d */
    @NotNull
    public final ReflectProperties.LazyVal<KClassImpl<T>.Data> f63477d = new ReflectProperties.LazyVal<>(new Function0<KClassImpl<T>.Data>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$data$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Object invoke() {
            return new KClassImpl.Data();
        }
    });

    /* renamed from: e */
    @NotNull
    public final Class<T> f63478e;

    /* compiled from: KClassImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public final class Data extends KDeclarationContainerImpl.Data {

        /* renamed from: p */
        public static final /* synthetic */ KProperty[] f63481p = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "annotations", "getAnnotations()Ljava/util/List;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "simpleName", "getSimpleName()Ljava/lang/String;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "constructors", "getConstructors()Ljava/util/Collection;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "supertypes", "getSupertypes()Ljava/util/List;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: d */
        @NotNull
        public final ReflectProperties.LazySoftVal f63482d;

        /* renamed from: e */
        @Nullable
        public final ReflectProperties.LazySoftVal f63483e;

        /* renamed from: f */
        @Nullable
        public final ReflectProperties.LazySoftVal f63484f;

        /* renamed from: g */
        @Nullable
        public final ReflectProperties.LazyVal f63485g;

        /* renamed from: h */
        @NotNull
        public final ReflectProperties.LazySoftVal f63486h;

        /* renamed from: i */
        @NotNull
        public final ReflectProperties.LazySoftVal f63487i;

        /* renamed from: j */
        public final ReflectProperties.LazySoftVal f63488j;

        /* renamed from: k */
        public final ReflectProperties.LazySoftVal f63489k;

        /* renamed from: l */
        public final ReflectProperties.LazySoftVal f63490l;

        /* renamed from: m */
        @NotNull
        public final ReflectProperties.LazySoftVal f63491m;

        /* renamed from: n */
        @NotNull
        public final ReflectProperties.LazySoftVal f63492n;

        public Data() {
            super();
            this.f63482d = ReflectProperties.m32304a(new Function0<ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$descriptor$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public ClassDescriptor invoke() {
                    KotlinClassHeader kotlinClassHeader;
                    KClassImpl kClassImpl = KClassImpl.this;
                    int i2 = KClassImpl.f63476f;
                    ClassId m32269y = kClassImpl.m32269y();
                    ReflectProperties.LazySoftVal lazySoftVal = KClassImpl.this.f63477d.m32306a().f63518a;
                    KProperty kProperty = KDeclarationContainerImpl.Data.f63517c[0];
                    RuntimeModuleData runtimeModuleData = (RuntimeModuleData) lazySoftVal.m32305a();
                    ClassDescriptor m33562b = m32269y.f65595c ? runtimeModuleData.f63702a.m33562b(m32269y) : FindClassInModuleKt.m32519a(runtimeModuleData.f63702a.f66051c, m32269y);
                    if (m33562b != null) {
                        return m33562b;
                    }
                    KClassImpl kClassImpl2 = KClassImpl.this;
                    ReflectKotlinClass m32353a = ReflectKotlinClass.f63696c.m32353a(kClassImpl2.f63478e);
                    KotlinClassHeader.Kind kind = (m32353a == null || (kotlinClassHeader = m32353a.f63698b) == null) ? null : kotlinClassHeader.f64819a;
                    if (kind != null) {
                        int ordinal = kind.ordinal();
                        if (ordinal == 0) {
                            StringBuilder m24u = C0000a.m24u("Unknown class: ");
                            m24u.append(kClassImpl2.f63478e);
                            m24u.append(" (kind = ");
                            m24u.append(kind);
                            m24u.append(')');
                            throw new KotlinReflectionInternalError(m24u.toString());
                        }
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    StringBuilder m27x = C0000a.m27x("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection ", "library has no idea what declarations does it have. Please use Java reflection to inspect this class: ");
                                    m27x.append(kClassImpl2.f63478e);
                                    throw new UnsupportedOperationException(m27x.toString());
                                }
                                if (ordinal != 4 && ordinal != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            StringBuilder m27x2 = C0000a.m27x("Packages and file facades are not yet supported in Kotlin reflection. ", "Meanwhile please use Java reflection to inspect this class: ");
                            m27x2.append(kClassImpl2.f63478e);
                            throw new UnsupportedOperationException(m27x2.toString());
                        }
                    }
                    StringBuilder m24u2 = C0000a.m24u("Unresolved class: ");
                    m24u2.append(kClassImpl2.f63478e);
                    throw new KotlinReflectionInternalError(m24u2.toString());
                }
            });
            ReflectProperties.m32304a(new Function0<List<? extends Annotation>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$annotations$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public List<? extends Annotation> invoke() {
                    return UtilKt.m32319b(KClassImpl.Data.this.m32271a());
                }
            });
            this.f63483e = ReflectProperties.m32304a(new Function0<String>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$simpleName$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public String invoke() {
                    String str;
                    if (KClassImpl.this.f63478e.isAnonymousClass()) {
                        return null;
                    }
                    ClassId m32269y = KClassImpl.this.m32269y();
                    if (m32269y.f65595c) {
                        Class<T> cls = KClassImpl.this.f63478e;
                        String simpleName = cls.getSimpleName();
                        Method enclosingMethod = cls.getEnclosingMethod();
                        if (enclosingMethod != null) {
                            str = StringsKt.m33899Y(simpleName, enclosingMethod.getName() + "$", (r3 & 2) != 0 ? simpleName : null);
                        } else {
                            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                            if (enclosingConstructor != null) {
                                str = StringsKt.m33899Y(simpleName, enclosingConstructor.getName() + "$", (r3 & 2) != 0 ? simpleName : null);
                            } else {
                                str = StringsKt.m33900Z(simpleName, '$', null, 2, null);
                            }
                        }
                    } else {
                        str = m32269y.m33193g().f65606b;
                        Intrinsics.m32175d(str, "classId.shortClassName.asString()");
                    }
                    return str;
                }
            });
            this.f63484f = ReflectProperties.m32304a(new Function0<String>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$qualifiedName$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public String invoke() {
                    if (KClassImpl.this.f63478e.isAnonymousClass()) {
                        return null;
                    }
                    ClassId m32269y = KClassImpl.this.m32269y();
                    if (m32269y.f65595c) {
                        return null;
                    }
                    return m32269y.m33189a().f65597a.f65602a;
                }
            });
            ReflectProperties.m32304a(new Function0<List<? extends KFunction<? extends T>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$constructors$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Object invoke() {
                    Collection<ConstructorDescriptor> mo32254l = KClassImpl.this.mo32254l();
                    ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32254l, 10));
                    Iterator<T> it = mo32254l.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new KFunctionImpl(KClassImpl.this, (ConstructorDescriptor) it.next()));
                    }
                    return arrayList;
                }
            });
            ReflectProperties.m32304a(new Function0<List<? extends KClassImpl<? extends Object>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$nestedClasses$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public List<? extends KClassImpl<? extends Object>> invoke() {
                    Collection m33549a = ResolutionScope.DefaultImpls.m33549a(KClassImpl.Data.this.m32271a().mo32506u0(), null, null, 3, null);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : m33549a) {
                        if (!DescriptorUtils.m33478n((DeclarationDescriptor) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) it.next();
                        if (declarationDescriptor == null) {
                            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        }
                        Class<?> m32326i = UtilKt.m32326i((ClassDescriptor) declarationDescriptor);
                        KClassImpl kClassImpl = m32326i != null ? new KClassImpl(m32326i) : null;
                        if (kClassImpl != null) {
                            arrayList2.add(kClassImpl);
                        }
                    }
                    return arrayList2;
                }
            });
            this.f63485g = new ReflectProperties.LazyVal(new Function0<T>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$objectInstance$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final T invoke() {
                    ClassDescriptor m32271a = KClassImpl.Data.this.m32271a();
                    if (m32271a.mo32438g() != ClassKind.OBJECT) {
                        return null;
                    }
                    T t = (T) ((!m32271a.mo32446y() || CompanionObjectMapping.f63721b.m32364a(m32271a)) ? KClassImpl.this.f63478e.getDeclaredField("INSTANCE") : KClassImpl.this.f63478e.getEnclosingClass().getDeclaredField(m32271a.getName().f65606b)).get(null);
                    if (t != null) {
                        return t;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type T");
                }
            });
            ReflectProperties.m32304a(new Function0<List<? extends KTypeParameterImpl>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$typeParameters$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public List<? extends KTypeParameterImpl> invoke() {
                    List<TypeParameterDescriptor> mo32443t = KClassImpl.Data.this.m32271a().mo32443t();
                    Intrinsics.m32175d(mo32443t, "descriptor.declaredTypeParameters");
                    ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32443t, 10));
                    Iterator<T> it = mo32443t.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new KTypeParameterImpl((TypeParameterDescriptor) it.next()));
                    }
                    return arrayList;
                }
            });
            this.f63486h = ReflectProperties.m32304a(new KClassImpl$Data$supertypes$2(this));
            ReflectProperties.m32304a(new Function0<List<? extends KClassImpl<? extends T>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$sealedSubclasses$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Object invoke() {
                    Collection<ClassDescriptor> mo32431F = KClassImpl.Data.this.m32271a().mo32431F();
                    Intrinsics.m32175d(mo32431F, "descriptor.sealedSubclasses");
                    ArrayList arrayList = new ArrayList();
                    for (ClassDescriptor classDescriptor : mo32431F) {
                        if (classDescriptor == null) {
                            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        }
                        Class<?> m32326i = UtilKt.m32326i(classDescriptor);
                        KClassImpl kClassImpl = m32326i != null ? new KClassImpl(m32326i) : null;
                        if (kClassImpl != null) {
                            arrayList.add(kClassImpl);
                        }
                    }
                    return arrayList;
                }
            });
            this.f63487i = ReflectProperties.m32304a(new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredNonStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Collection<? extends KCallableImpl<?>> invoke() {
                    KClassImpl kClassImpl = KClassImpl.this;
                    return kClassImpl.m32274p(kClassImpl.m32267A(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
            this.f63488j = ReflectProperties.m32304a(new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Collection<? extends KCallableImpl<?>> invoke() {
                    KClassImpl kClassImpl = KClassImpl.this;
                    return kClassImpl.m32274p(kClassImpl.m32268B(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
            this.f63489k = ReflectProperties.m32304a(new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$inheritedNonStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Collection<? extends KCallableImpl<?>> invoke() {
                    KClassImpl kClassImpl = KClassImpl.this;
                    return kClassImpl.m32274p(kClassImpl.m32267A(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
                }
            });
            this.f63490l = ReflectProperties.m32304a(new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$inheritedStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Collection<? extends KCallableImpl<?>> invoke() {
                    KClassImpl kClassImpl = KClassImpl.this;
                    return kClassImpl.m32274p(kClassImpl.m32268B(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
                }
            });
            this.f63491m = ReflectProperties.m32304a(new Function0<List<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allNonStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public List<? extends KCallableImpl<?>> invoke() {
                    ReflectProperties.LazySoftVal lazySoftVal = KClassImpl.Data.this.f63487i;
                    KProperty[] kPropertyArr = KClassImpl.Data.f63481p;
                    KProperty kProperty = kPropertyArr[10];
                    Collection collection = (Collection) lazySoftVal.m32305a();
                    ReflectProperties.LazySoftVal lazySoftVal2 = KClassImpl.Data.this.f63489k;
                    KProperty kProperty2 = kPropertyArr[12];
                    return CollectionsKt.m32002O(collection, (Collection) lazySoftVal2.m32305a());
                }
            });
            this.f63492n = ReflectProperties.m32304a(new Function0<List<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public List<? extends KCallableImpl<?>> invoke() {
                    ReflectProperties.LazySoftVal lazySoftVal = KClassImpl.Data.this.f63488j;
                    KProperty[] kPropertyArr = KClassImpl.Data.f63481p;
                    KProperty kProperty = kPropertyArr[11];
                    Collection collection = (Collection) lazySoftVal.m32305a();
                    ReflectProperties.LazySoftVal lazySoftVal2 = KClassImpl.Data.this.f63490l;
                    KProperty kProperty2 = kPropertyArr[13];
                    return CollectionsKt.m32002O(collection, (Collection) lazySoftVal2.m32305a());
                }
            });
            ReflectProperties.m32304a(new Function0<List<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public List<? extends KCallableImpl<?>> invoke() {
                    ReflectProperties.LazySoftVal lazySoftVal = KClassImpl.Data.this.f63487i;
                    KProperty[] kPropertyArr = KClassImpl.Data.f63481p;
                    KProperty kProperty = kPropertyArr[10];
                    Collection collection = (Collection) lazySoftVal.m32305a();
                    ReflectProperties.LazySoftVal lazySoftVal2 = KClassImpl.Data.this.f63488j;
                    KProperty kProperty2 = kPropertyArr[11];
                    return CollectionsKt.m32002O(collection, (Collection) lazySoftVal2.m32305a());
                }
            });
            ReflectProperties.m32304a(new Function0<List<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public List<? extends KCallableImpl<?>> invoke() {
                    ReflectProperties.LazySoftVal lazySoftVal = KClassImpl.Data.this.f63491m;
                    KProperty[] kPropertyArr = KClassImpl.Data.f63481p;
                    KProperty kProperty = kPropertyArr[14];
                    Collection collection = (Collection) lazySoftVal.m32305a();
                    ReflectProperties.LazySoftVal lazySoftVal2 = KClassImpl.Data.this.f63492n;
                    KProperty kProperty2 = kPropertyArr[15];
                    return CollectionsKt.m32002O(collection, (Collection) lazySoftVal2.m32305a());
                }
            });
        }

        @NotNull
        /* renamed from: a */
        public final ClassDescriptor m32271a() {
            ReflectProperties.LazySoftVal lazySoftVal = this.f63482d;
            KProperty kProperty = f63481p[0];
            return (ClassDescriptor) lazySoftVal.m32305a();
        }
    }

    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            KotlinClassHeader.Kind kind = KotlinClassHeader.Kind.FILE_FACADE;
            iArr[2] = 1;
            KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.MULTIFILE_CLASS;
            iArr[4] = 2;
            KotlinClassHeader.Kind kind3 = KotlinClassHeader.Kind.MULTIFILE_CLASS_PART;
            iArr[5] = 3;
            KotlinClassHeader.Kind kind4 = KotlinClassHeader.Kind.SYNTHETIC_CLASS;
            iArr[3] = 4;
            KotlinClassHeader.Kind kind5 = KotlinClassHeader.Kind.UNKNOWN;
            iArr[0] = 5;
            KotlinClassHeader.Kind kind6 = KotlinClassHeader.Kind.CLASS;
            iArr[1] = 6;
        }
    }

    public KClassImpl(@NotNull Class<T> cls) {
        this.f63478e = cls;
    }

    @NotNull
    /* renamed from: A */
    public final MemberScope m32267A() {
        return m32270z().mo32502r().mo32791p();
    }

    @NotNull
    /* renamed from: B */
    public final MemberScope m32268B() {
        MemberScope mo32435Q = m32270z().mo32435Q();
        Intrinsics.m32175d(mo32435Q, "descriptor.staticScope");
        return mo32435Q;
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    /* renamed from: a */
    public List<KType> mo32164a() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f63477d.m32306a().f63486h;
        KProperty kProperty = Data.f63481p[8];
        return (List) lazySoftVal.m32305a();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    /* renamed from: b */
    public String mo32165b() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f63477d.m32306a().f63484f;
        KProperty kProperty = Data.f63481p[3];
        return (String) lazySoftVal.m32305a();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    /* renamed from: d */
    public String mo32166d() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f63477d.m32306a().f63483e;
        KProperty kProperty = Data.f63481p[2];
        return (String) lazySoftVal.m32305a();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof KClassImpl) && Intrinsics.m32174c(JvmClassMappingKt.m32148c(this), JvmClassMappingKt.m32148c((KClass) obj));
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    /* renamed from: f */
    public T mo32167f() {
        ReflectProperties.LazyVal lazyVal = this.f63477d.m32306a().f63485g;
        KProperty kProperty = Data.f63481p[6];
        return (T) lazyVal.m32306a();
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* renamed from: h */
    public Class<T> mo32163h() {
        return this.f63478e;
    }

    public int hashCode() {
        return JvmClassMappingKt.m32148c(this).hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* renamed from: l */
    public Collection<ConstructorDescriptor> mo32254l() {
        ClassDescriptor m32270z = m32270z();
        if (m32270z.mo32438g() == ClassKind.INTERFACE || m32270z.mo32438g() == ClassKind.OBJECT) {
            return EmptyList.f63144b;
        }
        Collection<ClassConstructorDescriptor> mo32442l = m32270z.mo32442l();
        Intrinsics.m32175d(mo32442l, "descriptor.constructors");
        return mo32442l;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* renamed from: n */
    public Collection<FunctionDescriptor> mo32255n(@NotNull Name name) {
        MemberScope m32267A = m32267A();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt.m32002O(m32267A.mo32614a(name, noLookupLocation), m32268B().mo32614a(name, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    /* renamed from: o */
    public PropertyDescriptor mo32256o(int i2) {
        Class<?> declaringClass;
        if (Intrinsics.m32174c(this.f63478e.getSimpleName(), "DefaultImpls") && (declaringClass = this.f63478e.getDeclaringClass()) != null && declaringClass.isInterface()) {
            KClass m32150e = JvmClassMappingKt.m32150e(declaringClass);
            if (m32150e != null) {
                return ((KClassImpl) m32150e).mo32256o(i2);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
        }
        ClassDescriptor m32270z = m32270z();
        if (!(m32270z instanceof DeserializedClassDescriptor)) {
            m32270z = null;
        }
        DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) m32270z;
        if (deserializedClassDescriptor == null) {
            return null;
        }
        ProtoBuf.Class r1 = deserializedClassDescriptor.f66173u;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> generatedExtension = JvmProtoBuf.f65489j;
        Intrinsics.m32175d(generatedExtension, "JvmProtoBuf.classLocalVariable");
        ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.m33121b(r1, generatedExtension, i2);
        if (property == null) {
            return null;
        }
        Class<T> cls = this.f63478e;
        DeserializationContext deserializationContext = deserializedClassDescriptor.f66161i;
        return (PropertyDescriptor) UtilKt.m32320c(cls, property, deserializationContext.f66070d, deserializationContext.f66072f, deserializedClassDescriptor.f66174v, KClassImpl$getLocalProperty$2$1$1.f63514d);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* renamed from: r */
    public Collection<PropertyDescriptor> mo32257r(@NotNull Name name) {
        MemberScope m32267A = m32267A();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt.m32002O(m32267A.mo32617e(name, noLookupLocation), m32268B().mo32617e(name, noLookupLocation));
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("class ");
        ClassId m32269y = m32269y();
        FqName fqName = m32269y.f65593a;
        Intrinsics.m32175d(fqName, "classId.packageFqName");
        String m20q = fqName.m33197b() ? "" : C0000a.m20q(new StringBuilder(), fqName.f65597a.f65602a, ".");
        String str = m32269y.f65594b.f65597a.f65602a;
        Intrinsics.m32175d(str, "classId.relativeClassName.asString()");
        m24u.append(m20q + StringsKt.m33890P(str, '.', '$', false, 4, null));
        return m24u.toString();
    }

    /* renamed from: y */
    public final ClassId m32269y() {
        RuntimeTypeMapper runtimeTypeMapper = RuntimeTypeMapper.f63639b;
        Class<T> klass = this.f63478e;
        Intrinsics.m32180i(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.m32175d(componentType, "klass.componentType");
            PrimitiveType m32313a = runtimeTypeMapper.m32313a(componentType);
            return m32313a != null ? new ClassId(KotlinBuiltIns.f63725g, m32313a.f63817c) : ClassId.m33188i(KotlinBuiltIns.f63730l.f63780g.m33207g());
        }
        if (Intrinsics.m32174c(klass, Void.TYPE)) {
            return RuntimeTypeMapper.f63638a;
        }
        PrimitiveType m32313a2 = runtimeTypeMapper.m32313a(klass);
        if (m32313a2 != null) {
            return new ClassId(KotlinBuiltIns.f63725g, m32313a2.f63816b);
        }
        ClassId m33798b = ReflectClassUtilKt.m33798b(klass);
        if (m33798b.f65595c) {
            return m33798b;
        }
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.f63882m;
        FqName m33189a = m33798b.m33189a();
        Intrinsics.m32175d(m33189a, "classId.asSingleFqName()");
        ClassId m32472j = javaToKotlinClassMap.m32472j(m33189a);
        return m32472j != null ? m32472j : m33798b;
    }

    @NotNull
    /* renamed from: z */
    public ClassDescriptor m32270z() {
        return this.f63477d.m32306a().m32271a();
    }
}
