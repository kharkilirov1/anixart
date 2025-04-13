package kotlin.jvm.internal;

import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: TypeReference.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class TypeReference implements KType {

    /* renamed from: b */
    @NotNull
    public final KClassifier f63357b;

    /* renamed from: c */
    @NotNull
    public final List<KTypeProjection> f63358c;

    /* renamed from: d */
    @Nullable
    public final KType f63359d;

    /* renamed from: e */
    public final int f63360e;

    /* compiled from: TypeReference.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lkotlin/jvm/internal/TypeReference$Companion;", "", "", "IS_MARKED_NULLABLE", "I", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: TypeReference.kt */
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

    public TypeReference(@NotNull KClassifier classifier, @NotNull List<KTypeProjection> arguments, boolean z) {
        Intrinsics.m32179h(classifier, "classifier");
        Intrinsics.m32179h(arguments, "arguments");
        this.f63357b = classifier;
        this.f63358c = arguments;
        this.f63359d = null;
        this.f63360e = z ? 1 : 0;
    }

    @Override // kotlin.reflect.KType
    @NotNull
    /* renamed from: c */
    public List<KTypeProjection> mo32218c() {
        return this.f63358c;
    }

    @Override // kotlin.reflect.KType
    @NotNull
    /* renamed from: e, reason: from getter */
    public KClassifier getF63357b() {
        return this.f63357b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) obj;
            if (Intrinsics.m32174c(this.f63357b, typeReference.f63357b) && Intrinsics.m32174c(this.f63358c, typeReference.f63358c) && Intrinsics.m32174c(this.f63359d, typeReference.f63359d) && this.f63360e == typeReference.f63360e) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final String m32220h(boolean z) {
        String name;
        KClassifier kClassifier = this.f63357b;
        KClass kClass = kClassifier instanceof KClass ? (KClass) kClassifier : null;
        Class m32147b = kClass != null ? JvmClassMappingKt.m32147b(kClass) : null;
        if (m32147b == null) {
            name = this.f63357b.toString();
        } else if ((this.f63360e & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (m32147b.isArray()) {
            name = Intrinsics.m32174c(m32147b, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.m32174c(m32147b, char[].class) ? "kotlin.CharArray" : Intrinsics.m32174c(m32147b, byte[].class) ? "kotlin.ByteArray" : Intrinsics.m32174c(m32147b, short[].class) ? "kotlin.ShortArray" : Intrinsics.m32174c(m32147b, int[].class) ? "kotlin.IntArray" : Intrinsics.m32174c(m32147b, float[].class) ? "kotlin.FloatArray" : Intrinsics.m32174c(m32147b, long[].class) ? "kotlin.LongArray" : Intrinsics.m32174c(m32147b, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        } else if (z && m32147b.isPrimitive()) {
            KClassifier kClassifier2 = this.f63357b;
            Intrinsics.m32177f(kClassifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = JvmClassMappingKt.m32148c((KClass) kClassifier2).getName();
        } else {
            name = m32147b.getName();
        }
        String m16m = C0000a.m16m(name, this.f63358c.isEmpty() ? "" : CollectionsKt.m31989B(this.f63358c, ", ", "<", ">", 0, null, new Function1<KTypeProjection, CharSequence>() { // from class: kotlin.jvm.internal.TypeReference$asString$args$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public CharSequence invoke(KTypeProjection kTypeProjection) {
                String valueOf;
                KTypeProjection it = kTypeProjection;
                Intrinsics.m32179h(it, "it");
                Objects.requireNonNull(TypeReference.this);
                if (it.f63417a == null) {
                    return "*";
                }
                KType kType = it.f63418b;
                TypeReference typeReference = kType instanceof TypeReference ? (TypeReference) kType : null;
                if (typeReference == null || (valueOf = typeReference.m32220h(true)) == null) {
                    valueOf = String.valueOf(it.f63418b);
                }
                int ordinal = it.f63417a.ordinal();
                if (ordinal == 0) {
                    return valueOf;
                }
                if (ordinal == 1) {
                    return C0000a.m14k("in ", valueOf);
                }
                if (ordinal == 2) {
                    return C0000a.m14k("out ", valueOf);
                }
                throw new NoWhenBranchMatchedException();
            }
        }, 24, null), (this.f63360e & 1) != 0 ? "?" : "");
        KType kType = this.f63359d;
        if (!(kType instanceof TypeReference)) {
            return m16m;
        }
        String m32220h = ((TypeReference) kType).m32220h(true);
        if (Intrinsics.m32174c(m32220h, m16m)) {
            return m16m;
        }
        if (Intrinsics.m32174c(m32220h, m16m + '?')) {
            return m16m + '!';
        }
        return '(' + m16m + ".." + m32220h + ')';
    }

    public int hashCode() {
        return Integer.valueOf(this.f63360e).hashCode() + ((this.f63358c.hashCode() + (this.f63357b.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return m32220h(false) + " (Kotlin reflection is not available)";
    }
}
