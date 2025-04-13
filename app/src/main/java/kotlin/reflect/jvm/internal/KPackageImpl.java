package kotlin.reflect.jvm.internal;

import com.fasterxml.jackson.core.JsonPointer;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.KPackageImpl.Data;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KPackageImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Data", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* renamed from: f */
    public static final /* synthetic */ int f63548f = 0;

    /* renamed from: d */
    public final ReflectProperties.LazyVal<Data> f63549d;

    /* renamed from: e */
    @NotNull
    public final Class<?> f63550e;

    /* compiled from: KPackageImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public final class Data extends KDeclarationContainerImpl.Data {

        /* renamed from: i */
        public static final /* synthetic */ KProperty[] f63551i = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "kotlinClass", "getKotlinClass()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PackageViewDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "methodOwner", "getMethodOwner()Ljava/lang/Class;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "metadata", "getMetadata()Lkotlin/Triple;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Data.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* renamed from: d */
        public final ReflectProperties.LazySoftVal f63552d;

        /* renamed from: e */
        @NotNull
        public final ReflectProperties.LazySoftVal f63553e;

        /* renamed from: f */
        @NotNull
        public final ReflectProperties.LazyVal f63554f;

        /* renamed from: g */
        @Nullable
        public final ReflectProperties.LazyVal f63555g;

        public Data() {
            super();
            this.f63552d = ReflectProperties.m32304a(new Function0<ReflectKotlinClass>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$kotlinClass$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public ReflectKotlinClass invoke() {
                    return ReflectKotlinClass.f63696c.m32353a(KPackageImpl.this.f63550e);
                }
            });
            this.f63553e = ReflectProperties.m32304a(new Function0<PackageViewDescriptor>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$descriptor$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public PackageViewDescriptor invoke() {
                    String m32322e;
                    ReflectProperties.LazySoftVal lazySoftVal = KPackageImpl.Data.this.f63518a;
                    KProperty kProperty = KDeclarationContainerImpl.Data.f63517c[0];
                    RuntimeModuleData runtimeModuleData = (RuntimeModuleData) lazySoftVal.m32305a();
                    ReflectKotlinClass m32288a = KPackageImpl.Data.m32288a(KPackageImpl.Data.this);
                    if (m32288a != null && (m32322e = UtilKt.m32322e(m32288a)) != null) {
                        runtimeModuleData.f63703b.m32359b(m32322e);
                    }
                    ModuleDescriptor moduleDescriptor = runtimeModuleData.f63702a.f66051c;
                    FqName fqName = ReflectClassUtilKt.m33798b(KPackageImpl.this.f63550e).f65593a;
                    Intrinsics.m32175d(fqName, "jClass.classId.packageFqName");
                    return moduleDescriptor.mo32545K(fqName);
                }
            });
            this.f63554f = new ReflectProperties.LazyVal(new Function0<Class<?>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$methodOwner$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Class<?> invoke() {
                    KotlinClassHeader kotlinClassHeader;
                    ReflectKotlinClass m32288a = KPackageImpl.Data.m32288a(KPackageImpl.Data.this);
                    String m32954a = (m32288a == null || (kotlinClassHeader = m32288a.f63698b) == null) ? null : kotlinClassHeader.m32954a();
                    if (m32954a != null) {
                        if (m32954a.length() > 0) {
                            return KPackageImpl.this.f63550e.getClassLoader().loadClass(StringsKt.m33890P(m32954a, JsonPointer.SEPARATOR, '.', false, 4, null));
                        }
                    }
                    return KPackageImpl.this.f63550e;
                }
            });
            this.f63555g = new ReflectProperties.LazyVal(new Function0<Triple<? extends JvmNameResolver, ? extends ProtoBuf.Package, ? extends JvmMetadataVersion>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$metadata$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Triple<? extends JvmNameResolver, ? extends ProtoBuf.Package, ? extends JvmMetadataVersion> invoke() {
                    KotlinClassHeader kotlinClassHeader;
                    ReflectKotlinClass m32288a = KPackageImpl.Data.m32288a(KPackageImpl.Data.this);
                    if (m32288a == null || (kotlinClassHeader = m32288a.f63698b) == null) {
                        return null;
                    }
                    String[] strArr = kotlinClassHeader.f64821c;
                    String[] strArr2 = kotlinClassHeader.f64823e;
                    if (strArr == null || strArr2 == null) {
                        return null;
                    }
                    Pair<JvmNameResolver, ProtoBuf.Package> m33179h = JvmProtoBufUtil.m33179h(strArr, strArr2);
                    return new Triple<>(m33179h.f63055b, m33179h.f63056c, kotlinClassHeader.f64820b);
                }
            });
            ReflectProperties.m32304a(new Function0<List<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$members$2
                {
                    super(0);
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0019 A[SYNTHETIC] */
                @Override // kotlin.jvm.functions.Function0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.util.List<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>> invoke() {
                    /*
                        r7 = this;
                        kotlin.reflect.jvm.internal.KPackageImpl$Data r0 = kotlin.reflect.jvm.internal.KPackageImpl.Data.this
                        kotlin.reflect.jvm.internal.KPackageImpl r0 = kotlin.reflect.jvm.internal.KPackageImpl.this
                        int r1 = kotlin.reflect.jvm.internal.KPackageImpl.f63548f
                        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r1 = r0.m32287y()
                        kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess r2 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.DECLARED
                        java.util.Collection r0 = r0.m32274p(r1, r2)
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        java.util.Iterator r0 = r0.iterator()
                    L19:
                        boolean r2 = r0.hasNext()
                        if (r2 == 0) goto L9c
                        java.lang.Object r2 = r0.next()
                        r3 = r2
                        kotlin.reflect.jvm.internal.KCallableImpl r3 = (kotlin.reflect.jvm.internal.KCallableImpl) r3
                        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = r3.mo32264o()
                        if (r3 == 0) goto L94
                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor) r3
                        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r4 = r3.mo32437b()
                        if (r4 == 0) goto L8c
                        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r4
                        boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment
                        r6 = 0
                        if (r5 != 0) goto L3c
                        r4 = r6
                    L3c:
                        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment r4 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment) r4
                        if (r4 == 0) goto L46
                        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement r5 = new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement
                        r5.<init>(r4)
                        goto L47
                    L46:
                        r5 = r6
                    L47:
                        boolean r4 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement
                        if (r4 != 0) goto L4c
                        r5 = r6
                    L4c:
                        if (r5 == 0) goto L70
                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r3 = r3.mo33603c0()
                        boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource
                        if (r4 != 0) goto L57
                        r3 = r6
                    L57:
                        kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource r3 = (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource) r3
                        if (r3 == 0) goto L5e
                        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName r3 = r3.f64793b
                        goto L5f
                    L5e:
                        r3 = r6
                    L5f:
                        if (r3 == 0) goto L70
                        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment r4 = r5.f64802b
                        java.util.Map r4 = r4.m32766G()
                        java.lang.String r3 = r3.f65940a
                        java.lang.Object r3 = r4.get(r3)
                        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r3 = (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass) r3
                        goto L71
                    L70:
                        r3 = r6
                    L71:
                        boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.components.ReflectKotlinClass
                        if (r4 != 0) goto L76
                        r3 = r6
                    L76:
                        kotlin.reflect.jvm.internal.components.ReflectKotlinClass r3 = (kotlin.reflect.jvm.internal.components.ReflectKotlinClass) r3
                        if (r3 == 0) goto L7c
                        java.lang.Class<?> r6 = r3.f63697a
                    L7c:
                        kotlin.reflect.jvm.internal.KPackageImpl$Data r3 = kotlin.reflect.jvm.internal.KPackageImpl.Data.this
                        kotlin.reflect.jvm.internal.KPackageImpl r3 = kotlin.reflect.jvm.internal.KPackageImpl.this
                        java.lang.Class<?> r3 = r3.f63550e
                        boolean r3 = kotlin.jvm.internal.Intrinsics.m32174c(r6, r3)
                        if (r3 == 0) goto L19
                        r1.add(r2)
                        goto L19
                    L8c:
                        kotlin.TypeCastException r0 = new kotlin.TypeCastException
                        java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor"
                        r0.<init>(r1)
                        throw r0
                    L94:
                        kotlin.TypeCastException r0 = new kotlin.TypeCastException
                        java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor"
                        r0.<init>(r1)
                        throw r0
                    L9c:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPackageImpl$Data$members$2.invoke():java.lang.Object");
                }
            });
        }

        @Nullable
        /* renamed from: a */
        public static final ReflectKotlinClass m32288a(Data data) {
            ReflectProperties.LazySoftVal lazySoftVal = data.f63552d;
            KProperty kProperty = f63551i[0];
            return (ReflectKotlinClass) lazySoftVal.m32305a();
        }
    }

    public KPackageImpl(@NotNull Class<?> jClass, @Nullable String str) {
        Intrinsics.m32180i(jClass, "jClass");
        this.f63550e = jClass;
        this.f63549d = new ReflectProperties.LazyVal<>(new Function0<Data>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$data$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public KPackageImpl.Data invoke() {
                return KPackageImpl.this.new Data();
            }
        });
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof KPackageImpl) && Intrinsics.m32174c(this.f63550e, ((KPackageImpl) obj).f63550e);
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* renamed from: h */
    public Class<?> mo32163h() {
        return this.f63550e;
    }

    public int hashCode() {
        return this.f63550e.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* renamed from: l */
    public Collection<ConstructorDescriptor> mo32254l() {
        return EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* renamed from: n */
    public Collection<FunctionDescriptor> mo32255n(@NotNull Name name) {
        return m32287y().mo32614a(name, NoLookupLocation.FROM_REFLECTION);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    /* renamed from: o */
    public PropertyDescriptor mo32256o(int i2) {
        ReflectProperties.LazyVal lazyVal = this.f63549d.m32306a().f63555g;
        KProperty kProperty = Data.f63551i[3];
        Triple triple = (Triple) lazyVal.m32306a();
        if (triple != null) {
            JvmNameResolver jvmNameResolver = (JvmNameResolver) triple.f63068b;
            ProtoBuf.Package r1 = (ProtoBuf.Package) triple.f63069c;
            JvmMetadataVersion jvmMetadataVersion = (JvmMetadataVersion) triple.f63070d;
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> generatedExtension = JvmProtoBuf.f65492m;
            Intrinsics.m32175d(generatedExtension, "JvmProtoBuf.packageLocalVariable");
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.m33121b(r1, generatedExtension, i2);
            if (property != null) {
                Class<?> cls = this.f63550e;
                ProtoBuf.TypeTable typeTable = r1.f65101h;
                Intrinsics.m32175d(typeTable, "packageProto.typeTable");
                return (PropertyDescriptor) UtilKt.m32320c(cls, property, jvmNameResolver, new TypeTable(typeTable), jvmMetadataVersion, KPackageImpl$getLocalProperty$1$1$1.f63563d);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* renamed from: q */
    public Class<?> mo32275q() {
        ReflectProperties.LazyVal lazyVal = this.f63549d.m32306a().f63554f;
        KProperty kProperty = Data.f63551i[2];
        return (Class) lazyVal.m32306a();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* renamed from: r */
    public Collection<PropertyDescriptor> mo32257r(@NotNull Name name) {
        return m32287y().mo32617e(name, NoLookupLocation.FROM_REFLECTION);
    }

    @NotNull
    public String toString() {
        String str;
        FqName fqName = ReflectClassUtilKt.m33798b(this.f63550e).f65593a;
        Intrinsics.m32175d(fqName, "jClass.classId.packageFqName");
        StringBuilder sb = new StringBuilder();
        sb.append("package ");
        if (fqName.m33197b()) {
            str = "<default>";
        } else {
            str = fqName.f65597a.f65602a;
            Intrinsics.m32175d(str, "fqName.asString()");
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: y */
    public final MemberScope m32287y() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f63549d.m32306a().f63553e;
        KProperty kProperty = Data.f63551i[1];
        return ((PackageViewDescriptor) lazySoftVal.m32305a()).mo32555p();
    }
}
