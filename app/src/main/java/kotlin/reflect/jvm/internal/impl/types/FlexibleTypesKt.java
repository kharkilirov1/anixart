package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: flexibleTypes.kt */
/* loaded from: classes3.dex */
public final class FlexibleTypesKt {
    @NotNull
    /* renamed from: a */
    public static final FlexibleType m33657a(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        UnwrappedType mo33662J0 = receiver$0.mo33662J0();
        if (mo33662J0 != null) {
            return (FlexibleType) mo33662J0;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
    }

    /* renamed from: b */
    public static final boolean m33658b(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return receiver$0.mo33662J0() instanceof FlexibleType;
    }

    @NotNull
    /* renamed from: c */
    public static final SimpleType m33659c(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        UnwrappedType mo33662J0 = receiver$0.mo33662J0();
        if (mo33662J0 instanceof FlexibleType) {
            return ((FlexibleType) mo33662J0).f66316a;
        }
        if (mo33662J0 instanceof SimpleType) {
            return (SimpleType) mo33662J0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: d */
    public static final SimpleType m33660d(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        UnwrappedType mo33662J0 = receiver$0.mo33662J0();
        if (mo33662J0 instanceof FlexibleType) {
            return ((FlexibleType) mo33662J0).f66317b;
        }
        if (mo33662J0 instanceof SimpleType) {
            return (SimpleType) mo33662J0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
