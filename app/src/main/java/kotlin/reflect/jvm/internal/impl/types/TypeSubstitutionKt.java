package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes3.dex */
public final class TypeSubstitutionKt {
    @NotNull
    /* renamed from: a */
    public static final SimpleType m33678a(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        UnwrappedType mo33662J0 = receiver$0.mo33662J0();
        if (!(mo33662J0 instanceof SimpleType)) {
            mo33662J0 = null;
        }
        SimpleType simpleType = (SimpleType) mo33662J0;
        if (simpleType != null) {
            return simpleType;
        }
        throw new IllegalStateException(("This is should be simple type: " + receiver$0).toString());
    }

    @JvmOverloads
    @NotNull
    /* renamed from: b */
    public static final KotlinType m33679b(@NotNull KotlinType receiver$0, @NotNull List<? extends TypeProjection> newArguments, @NotNull Annotations newAnnotations) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(newArguments, "newArguments");
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        if ((newArguments.isEmpty() || newArguments == receiver$0.mo33514G0()) && newAnnotations == receiver$0.getAnnotations()) {
            return receiver$0;
        }
        UnwrappedType mo33662J0 = receiver$0.mo33662J0();
        if (mo33662J0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) mo33662J0;
            return KotlinTypeFactory.m33663a(m33680c(flexibleType.f66316a, newArguments, newAnnotations), m33680c(flexibleType.f66317b, newArguments, newAnnotations));
        }
        if (mo33662J0 instanceof SimpleType) {
            return m33680c((SimpleType) mo33662J0, newArguments, newAnnotations);
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmOverloads
    @NotNull
    /* renamed from: c */
    public static final SimpleType m33680c(@NotNull SimpleType receiver$0, @NotNull List<? extends TypeProjection> newArguments, @NotNull Annotations newAnnotations) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(newArguments, "newArguments");
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return (newArguments.isEmpty() && newAnnotations == receiver$0.getAnnotations()) ? receiver$0 : newArguments.isEmpty() ? receiver$0.mo32788L0(newAnnotations) : KotlinTypeFactory.m33665c(newAnnotations, receiver$0.mo33515H0(), newArguments, receiver$0.mo32838I0());
    }

    @JvmOverloads
    @NotNull
    /* renamed from: d */
    public static /* synthetic */ SimpleType m33681d(SimpleType simpleType, List list, Annotations annotations, int i2) {
        if ((i2 & 1) != 0) {
            list = simpleType.mo33514G0();
        }
        return m33680c(simpleType, list, (i2 & 2) != 0 ? simpleType.getAnnotations() : null);
    }
}
