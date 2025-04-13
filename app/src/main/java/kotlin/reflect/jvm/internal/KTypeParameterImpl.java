package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KTypeParameterImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "descriptor", "<init>", "(Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KTypeParameterImpl implements KTypeParameter, KClassifierImpl {

    /* renamed from: d */
    public static final /* synthetic */ KProperty[] f63623d = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: b */
    @NotNull
    public final ReflectProperties.LazySoftVal f63624b;

    /* renamed from: c */
    @NotNull
    public final TypeParameterDescriptor f63625c;

    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
        }
    }

    public KTypeParameterImpl(@NotNull TypeParameterDescriptor descriptor) {
        Intrinsics.m32180i(descriptor, "descriptor");
        this.f63625c = descriptor;
        this.f63624b = ReflectProperties.m32304a(new KTypeParameterImpl$upperBounds$2(this));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof KTypeParameterImpl) && Intrinsics.m32174c(this.f63625c, ((KTypeParameterImpl) obj).f63625c);
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public String getName() {
        String str = this.f63625c.getName().f65606b;
        Intrinsics.m32175d(str, "descriptor.name.asString()");
        return str;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public List<KType> getUpperBounds() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f63624b;
        KProperty kProperty = f63623d[0];
        return (List) lazySoftVal.m32305a();
    }

    public int hashCode() {
        return this.f63625c.hashCode();
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    /* renamed from: m */
    public KVariance mo32217m() {
        int ordinal = this.f63625c.mo32500m().ordinal();
        if (ordinal == 0) {
            return KVariance.INVARIANT;
        }
        if (ordinal == 1) {
            return KVariance.IN;
        }
        if (ordinal == 2) {
            return KVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public String toString() {
        ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.f63635b;
        TypeParameterDescriptor typeParameter = this.f63625c;
        Intrinsics.m32180i(typeParameter, "typeParameter");
        StringBuilder sb = new StringBuilder();
        int ordinal = typeParameter.mo32500m().ordinal();
        if (ordinal == 1) {
            sb.append("in ");
        } else if (ordinal == 2) {
            sb.append("out ");
        }
        sb.append(typeParameter.getName());
        String sb2 = sb.toString();
        Intrinsics.m32175d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
