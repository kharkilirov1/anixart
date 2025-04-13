package kotlin.reflect.jvm.internal;

import androidx.room.util.C0576a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: KPropertyImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0013\u0014\u0015\u0016B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bB5\b\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\n\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "R", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "descriptorInitialValue", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "Accessor", "Companion", "Getter", "Setter", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class KPropertyImpl<R> extends KCallableImpl<R> implements KProperty<R> {

    /* renamed from: l */
    @NotNull
    public static final Object f63586l = new Object();

    /* renamed from: f */
    public final ReflectProperties.LazySoftVal<Field> f63587f;

    /* renamed from: g */
    public final ReflectProperties.LazySoftVal<PropertyDescriptor> f63588g;

    /* renamed from: h */
    @NotNull
    public final KDeclarationContainerImpl f63589h;

    /* renamed from: i */
    @NotNull
    public final String f63590i;

    /* renamed from: j */
    @NotNull
    public final String f63591j;

    /* renamed from: k */
    @Nullable
    public final Object f63592k;

    /* compiled from: KPropertyImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static abstract class Accessor<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements KFunction<ReturnType>, KProperty.Accessor<PropertyType> {
        @Override // kotlin.reflect.KCallable
        public boolean isSuspend() {
            return mo32298s().isSuspend();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        /* renamed from: l */
        public KDeclarationContainerImpl getF63589h() {
            return mo32286t().f63589h;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @Nullable
        /* renamed from: m */
        public Caller<?> mo32263m() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* renamed from: r */
        public boolean mo32266r() {
            return !Intrinsics.m32174c(mo32286t().f63592k, CallableReference.NO_RECEIVER);
        }

        @NotNull
        /* renamed from: s */
        public abstract PropertyAccessorDescriptor mo32298s();

        @NotNull
        /* renamed from: t */
        public abstract KPropertyImpl<PropertyType> mo32286t();
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Companion;", "", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static abstract class Getter<R> extends Accessor<R, R> implements KProperty.Getter<R> {

        /* renamed from: h */
        public static final /* synthetic */ KProperty[] f63593h = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Getter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Getter.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: f */
        @NotNull
        public final ReflectProperties.LazySoftVal f63594f = ReflectProperties.m32304a(new Function0<PropertyGetterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$descriptor$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public PropertyGetterDescriptor invoke() {
                PropertyGetterDescriptor getter = KPropertyImpl.Getter.this.mo32286t().mo32264o().getGetter();
                if (getter != null) {
                    return getter;
                }
                PropertyDescriptor mo32264o = KPropertyImpl.Getter.this.mo32286t().mo32264o();
                int i2 = Annotations.f64023H1;
                return DescriptorFactory.m33456a(mo32264o, Annotations.Companion.f64024a);
            }
        });

        /* renamed from: g */
        @NotNull
        public final ReflectProperties.LazySoftVal f63595g = ReflectProperties.m32304a(new Function0<Caller<?>>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$caller$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Caller<?> invoke() {
                return KPropertyImplKt.m32299a(KPropertyImpl.Getter.this, true);
            }
        });

        @Override // kotlin.reflect.KCallable
        @NotNull
        /* renamed from: getName */
        public String getF63590i() {
            return C0576a.m4118q(C0000a.m24u("<get-"), mo32286t().f63590i, '>');
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        /* renamed from: h */
        public Caller<?> mo32261h() {
            ReflectProperties.LazySoftVal lazySoftVal = this.f63595g;
            KProperty kProperty = f63593h[1];
            return (Caller) lazySoftVal.m32305a();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* renamed from: o */
        public CallableMemberDescriptor mo32264o() {
            ReflectProperties.LazySoftVal lazySoftVal = this.f63594f;
            KProperty kProperty = f63593h[0];
            return (PropertyGetterDescriptor) lazySoftVal.m32305a();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* renamed from: s */
        public PropertyAccessorDescriptor mo32298s() {
            ReflectProperties.LazySoftVal lazySoftVal = this.f63594f;
            KProperty kProperty = f63593h[0];
            return (PropertyGetterDescriptor) lazySoftVal.m32305a();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "Lkotlin/reflect/KMutableProperty$Setter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static abstract class Setter<R> extends Accessor<R, Unit> implements KMutableProperty.Setter<R> {

        /* renamed from: h */
        public static final /* synthetic */ KProperty[] f63598h = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Setter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Setter.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: f */
        @NotNull
        public final ReflectProperties.LazySoftVal f63599f = ReflectProperties.m32304a(new Function0<PropertySetterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$descriptor$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public PropertySetterDescriptor invoke() {
                PropertySetterDescriptor setter = KPropertyImpl.Setter.this.mo32286t().mo32264o().getSetter();
                if (setter != null) {
                    return setter;
                }
                PropertyDescriptor mo32264o = KPropertyImpl.Setter.this.mo32286t().mo32264o();
                int i2 = Annotations.f64023H1;
                Annotations annotations = Annotations.Companion.f64024a;
                return DescriptorFactory.m33457b(mo32264o, annotations, annotations);
            }
        });

        /* renamed from: g */
        @NotNull
        public final ReflectProperties.LazySoftVal f63600g = ReflectProperties.m32304a(new Function0<Caller<?>>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$caller$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Caller<?> invoke() {
                return KPropertyImplKt.m32299a(KPropertyImpl.Setter.this, false);
            }
        });

        @Override // kotlin.reflect.KCallable
        @NotNull
        /* renamed from: getName */
        public String getF63590i() {
            return C0576a.m4118q(C0000a.m24u("<set-"), mo32286t().f63590i, '>');
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        /* renamed from: h */
        public Caller<?> mo32261h() {
            ReflectProperties.LazySoftVal lazySoftVal = this.f63600g;
            KProperty kProperty = f63598h[1];
            return (Caller) lazySoftVal.m32305a();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* renamed from: o */
        public CallableMemberDescriptor mo32264o() {
            ReflectProperties.LazySoftVal lazySoftVal = this.f63599f;
            KProperty kProperty = f63598h[0];
            return (PropertySetterDescriptor) lazySoftVal.m32305a();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* renamed from: s */
        public PropertyAccessorDescriptor mo32298s() {
            ReflectProperties.LazySoftVal lazySoftVal = this.f63599f;
            KProperty kProperty = f63598h[0];
            return (PropertySetterDescriptor) lazySoftVal.m32305a();
        }
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, PropertyDescriptor propertyDescriptor, Object obj) {
        this.f63589h = kDeclarationContainerImpl;
        this.f63590i = str;
        this.f63591j = str2;
        this.f63592k = obj;
        this.f63587f = ReflectProperties.m32304a(new Function0<Field>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$_javaField$1
            {
                super(0);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
            
                if (((r4 == null || !r4.getAnnotations().mo32592R0(kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.f64347a)) ? r1.getAnnotations().mo32592R0(kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.f64347a) : true) != false) goto L30;
             */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.reflect.Field invoke() {
                /*
                    r8 = this;
                    kotlin.reflect.jvm.internal.RuntimeTypeMapper r0 = kotlin.reflect.jvm.internal.RuntimeTypeMapper.f63639b
                    kotlin.reflect.jvm.internal.KPropertyImpl r1 = kotlin.reflect.jvm.internal.KPropertyImpl.this
                    kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r1 = r1.mo32264o()
                    kotlin.reflect.jvm.internal.JvmPropertySignature r0 = r0.m32315c(r1)
                    boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty
                    r2 = 0
                    if (r1 == 0) goto Lb8
                    kotlin.reflect.jvm.internal.JvmPropertySignature$KotlinProperty r0 = (kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty) r0
                    kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r1 = r0.f63455b
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.f65584b
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r4 = r0.f63456c
                    kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r5 = r0.f63458e
                    kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r6 = r0.f63459f
                    r7 = 1
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field r3 = r3.m33181b(r4, r5, r6, r7)
                    if (r3 == 0) goto Lca
                    kotlin.reflect.jvm.internal.impl.name.FqName r4 = kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.f64347a
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r4 = r1.mo32493g()
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r5 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
                    r6 = 0
                    if (r4 != r5) goto L30
                    goto L7f
                L30:
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r4 = r1.mo32437b()
                    boolean r5 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33476l(r4)
                    if (r5 == 0) goto L50
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r5 = r4.mo32437b()
                    boolean r5 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33475k(r5)
                    if (r5 == 0) goto L50
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r4
                    kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping r5 = kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping.f63721b
                    boolean r4 = r5.m32364a(r4)
                    if (r4 != 0) goto L50
                    r4 = 1
                    goto L51
                L50:
                    r4 = 0
                L51:
                    if (r4 == 0) goto L54
                    goto L80
                L54:
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r4 = r1.mo32437b()
                    boolean r4 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33476l(r4)
                    if (r4 == 0) goto L7f
                    kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor r4 = r1.mo32560o0()
                    if (r4 == 0) goto L72
                    kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4 = r4.getAnnotations()
                    kotlin.reflect.jvm.internal.impl.name.FqName r5 = kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.f64347a
                    boolean r4 = r4.mo32592R0(r5)
                    if (r4 == 0) goto L72
                    r4 = 1
                    goto L7c
                L72:
                    kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4 = r1.getAnnotations()
                    kotlin.reflect.jvm.internal.impl.name.FqName r5 = kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.f64347a
                    boolean r4 = r4.mo32592R0(r5)
                L7c:
                    if (r4 == 0) goto L7f
                    goto L80
                L7f:
                    r7 = 0
                L80:
                    if (r7 != 0) goto La3
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r0 = r0.f63456c
                    boolean r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.m33177d(r0)
                    if (r0 == 0) goto L8b
                    goto La3
                L8b:
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r1.mo32437b()
                    boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
                    if (r1 == 0) goto L9a
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r0
                    java.lang.Class r0 = kotlin.reflect.jvm.internal.UtilKt.m32326i(r0)
                    goto Laf
                L9a:
                    kotlin.reflect.jvm.internal.KPropertyImpl r0 = kotlin.reflect.jvm.internal.KPropertyImpl.this
                    kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.f63589h
                    java.lang.Class r0 = r0.mo32163h()
                    goto Laf
                La3:
                    kotlin.reflect.jvm.internal.KPropertyImpl r0 = kotlin.reflect.jvm.internal.KPropertyImpl.this
                    kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.f63589h
                    java.lang.Class r0 = r0.mo32163h()
                    java.lang.Class r0 = r0.getEnclosingClass()
                Laf:
                    if (r0 == 0) goto Lca
                    java.lang.String r1 = r3.f65573a     // Catch: java.lang.NoSuchFieldException -> Lca
                    java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> Lca
                    goto Lca
                Lb8:
                    boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField
                    if (r1 == 0) goto Lc1
                    kotlin.reflect.jvm.internal.JvmPropertySignature$JavaField r0 = (kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField) r0
                    java.lang.reflect.Field r2 = r0.f63451a
                    goto Lca
                Lc1:
                    boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty
                    if (r1 == 0) goto Lc6
                    goto Lca
                Lc6:
                    boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty
                    if (r0 == 0) goto Lcb
                Lca:
                    return r2
                Lcb:
                    kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                    r0.<init>()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImpl$_javaField$1.invoke():java.lang.Object");
            }
        });
        this.f63588g = new ReflectProperties.LazySoftVal<>(propertyDescriptor, new Function0<PropertyDescriptor>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$_descriptor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public PropertyDescriptor invoke() {
                KPropertyImpl kPropertyImpl = KPropertyImpl.this;
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kPropertyImpl.f63589h;
                String name = kPropertyImpl.f63590i;
                String signature = kPropertyImpl.f63591j;
                Objects.requireNonNull(kDeclarationContainerImpl2);
                Intrinsics.m32180i(name, "name");
                Intrinsics.m32180i(signature, "signature");
                MatchResult m33871c = KDeclarationContainerImpl.f63515b.m33871c(signature);
                if (m33871c != null) {
                    String str3 = m33871c.mo33867a().f66870a.mo33868b().get(1);
                    PropertyDescriptor mo32256o = kDeclarationContainerImpl2.mo32256o(Integer.parseInt(str3));
                    if (mo32256o != null) {
                        return mo32256o;
                    }
                    StringBuilder m28y = C0000a.m28y("Local property #", str3, " not found in ");
                    m28y.append(kDeclarationContainerImpl2.mo32163h());
                    throw new KotlinReflectionInternalError(m28y.toString());
                }
                Collection<PropertyDescriptor> mo32257r = kDeclarationContainerImpl2.mo32257r(Name.m33211d(name));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : mo32257r) {
                    if (Intrinsics.m32174c(RuntimeTypeMapper.f63639b.m32315c((PropertyDescriptor) obj2).getF63454a(), signature)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder m29z = C0000a.m29z("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                    m29z.append(kDeclarationContainerImpl2);
                    throw new KotlinReflectionInternalError(m29z.toString());
                }
                if (arrayList.size() == 1) {
                    return (PropertyDescriptor) CollectionsKt.m32011X(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Visibility visibility = ((PropertyDescriptor) next).getVisibility();
                    Object obj3 = linkedHashMap.get(visibility);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(visibility, obj3);
                    }
                    ((List) obj3).add(next);
                }
                TreeMap treeMap = new TreeMap(new Comparator<Visibility>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2
                    @Override // java.util.Comparator
                    public int compare(Visibility visibility2, Visibility visibility3) {
                        Integer m32578a = Visibilities.m32578a(visibility2, visibility3);
                        if (m32578a != null) {
                            return m32578a.intValue();
                        }
                        return 0;
                    }
                });
                treeMap.putAll(linkedHashMap);
                Collection values = treeMap.values();
                Intrinsics.m32175d(values, "properties\n             …                }).values");
                List list = (List) CollectionsKt.m31990C(values);
                if (list.size() == 1) {
                    return (PropertyDescriptor) CollectionsKt.m32044u(list);
                }
                String m31989B = CollectionsKt.m31989B(kDeclarationContainerImpl2.mo32257r(Name.m33211d(name)), "\n", null, null, 0, null, new Function1<PropertyDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1
                    @Override // kotlin.jvm.functions.Function1
                    public String invoke(PropertyDescriptor propertyDescriptor2) {
                        PropertyDescriptor descriptor = propertyDescriptor2;
                        Intrinsics.m32180i(descriptor, "descriptor");
                        return DescriptorRenderer.f65767b.mo33363r(descriptor) + " | " + RuntimeTypeMapper.f63639b.m32315c(descriptor);
                    }
                }, 30, null);
                StringBuilder m29z2 = C0000a.m29z("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                m29z2.append(kDeclarationContainerImpl2);
                m29z2.append(':');
                m29z2.append(m31989B.length() == 0 ? " no members found" : '\n' + m31989B);
                throw new KotlinReflectionInternalError(m29z2.toString());
            }
        });
    }

    public boolean equals(@Nullable Object obj) {
        FqName fqName = UtilKt.f63641a;
        KPropertyImpl kPropertyImpl = (KPropertyImpl) (!(obj instanceof KPropertyImpl) ? null : obj);
        if (kPropertyImpl == null) {
            if (!(obj instanceof PropertyReference)) {
                obj = null;
            }
            PropertyReference propertyReference = (PropertyReference) obj;
            KAnnotatedElement compute = propertyReference != null ? propertyReference.compute() : null;
            kPropertyImpl = (KPropertyImpl) (compute instanceof KPropertyImpl ? compute : null);
        }
        return kPropertyImpl != null && Intrinsics.m32174c(this.f63589h, kPropertyImpl.f63589h) && Intrinsics.m32174c(this.f63590i, kPropertyImpl.f63590i) && Intrinsics.m32174c(this.f63591j, kPropertyImpl.f63591j) && Intrinsics.m32174c(this.f63592k, kPropertyImpl.f63592k);
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    /* renamed from: getName, reason: from getter */
    public String getF63590i() {
        return this.f63590i;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    /* renamed from: h */
    public Caller<?> mo32261h() {
        return mo32290w().mo32261h();
    }

    public int hashCode() {
        return this.f63591j.hashCode() + C0576a.m4107f(this.f63590i, this.f63589h.hashCode() * 31, 31);
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
        return mo32264o().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return mo32264o().mo32576p0();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    /* renamed from: l, reason: from getter */
    public KDeclarationContainerImpl getF63589h() {
        return this.f63589h;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @Nullable
    /* renamed from: m */
    public Caller<?> mo32263m() {
        Objects.requireNonNull(mo32290w());
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* renamed from: r */
    public boolean mo32266r() {
        return !Intrinsics.m32174c(this.f63592k, CallableReference.NO_RECEIVER);
    }

    @Nullable
    /* renamed from: s */
    public final Field m32295s() {
        if (mo32264o().mo32577L()) {
            return this.f63587f.m32305a();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return r2.get(r3);
     */
    @org.jetbrains.annotations.Nullable
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m32296t(@org.jetbrains.annotations.Nullable java.lang.reflect.Field r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
            r1 = this;
            java.lang.Object r0 = kotlin.reflect.jvm.internal.KPropertyImpl.f63586l     // Catch: java.lang.IllegalAccessException -> L39
            if (r3 != r0) goto L30
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r0 = r1.mo32264o()     // Catch: java.lang.IllegalAccessException -> L39
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r0 = r0.mo32492k0()     // Catch: java.lang.IllegalAccessException -> L39
            if (r0 == 0) goto Lf
            goto L30
        Lf:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.IllegalAccessException -> L39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> L39
            r3.<init>()     // Catch: java.lang.IllegalAccessException -> L39
            r0 = 39
            r3.append(r0)     // Catch: java.lang.IllegalAccessException -> L39
            r3.append(r1)     // Catch: java.lang.IllegalAccessException -> L39
            java.lang.String r0 = "' is not an extension property and thus getExtensionDelegate() "
            r3.append(r0)     // Catch: java.lang.IllegalAccessException -> L39
            java.lang.String r0 = "is not going to work, use getDelegate() instead"
            r3.append(r0)     // Catch: java.lang.IllegalAccessException -> L39
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalAccessException -> L39
            r2.<init>(r3)     // Catch: java.lang.IllegalAccessException -> L39
            throw r2     // Catch: java.lang.IllegalAccessException -> L39
        L30:
            if (r2 == 0) goto L37
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.IllegalAccessException -> L39
            goto L38
        L37:
            r2 = 0
        L38:
            return r2
        L39:
            r2 = move-exception
            kotlin.reflect.full.IllegalPropertyDelegateAccessException r3 = new kotlin.reflect.full.IllegalPropertyDelegateAccessException
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImpl.m32296t(java.lang.reflect.Field, java.lang.Object):java.lang.Object");
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.f63635b.m32311d(mo32264o());
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public PropertyDescriptor mo32264o() {
        PropertyDescriptor m32305a = this.f63588g.m32305a();
        Intrinsics.m32175d(m32305a, "_descriptor()");
        return m32305a;
    }

    @NotNull
    /* renamed from: w */
    public abstract Getter<R> mo32290w();

    public KPropertyImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull String str, @NotNull String str2, @Nullable Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public KPropertyImpl(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r9) {
        /*
            r7 = this;
            kotlin.reflect.jvm.internal.impl.name.Name r0 = r9.getName()
            java.lang.String r3 = r0.f65606b
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.Intrinsics.m32175d(r3, r0)
            kotlin.reflect.jvm.internal.RuntimeTypeMapper r0 = kotlin.reflect.jvm.internal.RuntimeTypeMapper.f63639b
            kotlin.reflect.jvm.internal.JvmPropertySignature r0 = r0.m32315c(r9)
            java.lang.String r4 = r0.getF63454a()
            java.lang.Object r6 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImpl.<init>(kotlin.reflect.jvm.internal.KDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor):void");
    }
}
