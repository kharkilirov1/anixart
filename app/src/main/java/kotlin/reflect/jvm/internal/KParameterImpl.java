package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: KParameterImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KParameterImpl implements KParameter {

    /* renamed from: f */
    public static final /* synthetic */ KProperty[] f63564f = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KParameterImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KParameterImpl.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: b */
    public final ReflectProperties.LazySoftVal f63565b;

    /* renamed from: c */
    @NotNull
    public final KCallableImpl<?> f63566c;

    /* renamed from: d */
    public final int f63567d;

    /* renamed from: e */
    @NotNull
    public final KParameter.Kind f63568e;

    public KParameterImpl(@NotNull KCallableImpl<?> callable, int i2, @NotNull KParameter.Kind kind, @NotNull Function0<? extends ParameterDescriptor> function0) {
        Intrinsics.m32180i(callable, "callable");
        this.f63566c = callable;
        this.f63567d = i2;
        this.f63568e = kind;
        this.f63565b = ReflectProperties.m32304a(function0);
        ReflectProperties.m32304a(new Function0<List<? extends Annotation>>() { // from class: kotlin.reflect.jvm.internal.KParameterImpl$annotations$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends Annotation> invoke() {
                KParameterImpl kParameterImpl = KParameterImpl.this;
                KProperty[] kPropertyArr = KParameterImpl.f63564f;
                return UtilKt.m32319b(kParameterImpl.m32289h());
            }
        });
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof KParameterImpl) {
            KParameterImpl kParameterImpl = (KParameterImpl) obj;
            if (Intrinsics.m32174c(this.f63566c, kParameterImpl.f63566c) && Intrinsics.m32174c(m32289h(), kParameterImpl.m32289h())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    @NotNull
    /* renamed from: g, reason: from getter */
    public KParameter.Kind getF63568e() {
        return this.f63568e;
    }

    @Override // kotlin.reflect.KParameter
    @Nullable
    public String getName() {
        ParameterDescriptor m32289h = m32289h();
        if (!(m32289h instanceof ValueParameterDescriptor)) {
            m32289h = null;
        }
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) m32289h;
        if (valueParameterDescriptor == null || valueParameterDescriptor.mo32437b().mo32486B()) {
            return null;
        }
        Name name = valueParameterDescriptor.getName();
        Intrinsics.m32175d(name, "valueParameter.name");
        if (name.f65607c) {
            return null;
        }
        return name.f65606b;
    }

    @Override // kotlin.reflect.KParameter
    @NotNull
    public KType getType() {
        KotlinType type = m32289h().getType();
        Intrinsics.m32175d(type, "descriptor.type");
        return new KTypeImpl(type, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KParameterImpl$type$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Type invoke() {
                KParameterImpl kParameterImpl = KParameterImpl.this;
                KProperty[] kPropertyArr = KParameterImpl.f63564f;
                ParameterDescriptor m32289h = kParameterImpl.m32289h();
                if (!(m32289h instanceof ReceiverParameterDescriptor) || !Intrinsics.m32174c(UtilKt.m32321d(KParameterImpl.this.f63566c.mo32264o()), m32289h) || KParameterImpl.this.f63566c.mo32264o().mo32493g() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                    return KParameterImpl.this.f63566c.mo32261h().mo32328a().get(KParameterImpl.this.f63567d);
                }
                DeclarationDescriptor mo32437b = KParameterImpl.this.f63566c.mo32264o().mo32437b();
                if (mo32437b == null) {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                }
                Class<?> m32326i = UtilKt.m32326i((ClassDescriptor) mo32437b);
                if (m32326i != null) {
                    return m32326i;
                }
                throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + m32289h);
            }
        });
    }

    /* renamed from: h */
    public final ParameterDescriptor m32289h() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f63565b;
        KProperty kProperty = f63564f[0];
        return (ParameterDescriptor) lazySoftVal.m32305a();
    }

    public int hashCode() {
        return m32289h().hashCode() + (this.f63566c.hashCode() * 31);
    }

    @Override // kotlin.reflect.KParameter
    /* renamed from: j */
    public boolean mo32245j() {
        ParameterDescriptor m32289h = m32289h();
        if (!(m32289h instanceof ValueParameterDescriptor)) {
            m32289h = null;
        }
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) m32289h;
        if (valueParameterDescriptor != null) {
            return DescriptorUtilsKt.m33529b(valueParameterDescriptor);
        }
        return false;
    }

    @NotNull
    public String toString() {
        String m32310c;
        ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.f63635b;
        StringBuilder sb = new StringBuilder();
        int ordinal = this.f63568e.ordinal();
        if (ordinal == 0) {
            sb.append("instance");
        } else if (ordinal == 1) {
            sb.append("extension receiver");
        } else if (ordinal == 2) {
            StringBuilder m24u = C0000a.m24u("parameter #");
            m24u.append(this.f63567d);
            m24u.append(' ');
            m24u.append(getName());
            sb.append(m24u.toString());
        }
        sb.append(" of ");
        CallableMemberDescriptor mo32264o = this.f63566c.mo32264o();
        if (mo32264o instanceof PropertyDescriptor) {
            m32310c = reflectionObjectRenderer.m32311d((PropertyDescriptor) mo32264o);
        } else {
            if (!(mo32264o instanceof FunctionDescriptor)) {
                throw new IllegalStateException(("Illegal callable: " + mo32264o).toString());
            }
            m32310c = reflectionObjectRenderer.m32310c((FunctionDescriptor) mo32264o);
        }
        sb.append(m32310c);
        String sb2 = sb.toString();
        Intrinsics.m32175d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
