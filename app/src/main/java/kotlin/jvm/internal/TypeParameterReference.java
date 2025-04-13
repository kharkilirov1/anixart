package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypeParameterReference.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/reflect/KTypeParameter;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class TypeParameterReference implements KTypeParameter {

    /* renamed from: b */
    @Nullable
    public volatile List<? extends KType> f63356b;

    /* compiled from: TypeParameterReference.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/jvm/internal/TypeParameterReference$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {

        /* compiled from: TypeParameterReference.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[KVariance.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof TypeParameterReference) {
            TypeParameterReference typeParameterReference = (TypeParameterReference) obj;
            Objects.requireNonNull(typeParameterReference);
            if (Intrinsics.m32174c(null, null)) {
                Objects.requireNonNull(typeParameterReference);
                if (Intrinsics.m32174c(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public String getName() {
        return null;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public List<KType> getUpperBounds() {
        List list = this.f63356b;
        if (list != null) {
            return list;
        }
        ReflectionFactory reflectionFactory = Reflection.f63352a;
        KClass m32193a = Reflection.m32193a(Object.class);
        List emptyList = Collections.emptyList();
        Objects.requireNonNull(reflectionFactory);
        List<KType> m31993F = CollectionsKt.m31993F(new TypeReference(m32193a, emptyList, true));
        this.f63356b = m31993F;
        return m31993F;
    }

    public int hashCode() {
        throw null;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    /* renamed from: m */
    public KVariance mo32217m() {
        return null;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int ordinal = mo32217m().ordinal();
        if (ordinal == 1) {
            sb.append("in ");
        } else if (ordinal == 2) {
            sb.append("out ");
        }
        sb.append(getName());
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
