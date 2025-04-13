package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
class TypeCheckerProcedureCallbacksImpl implements TypeCheckingProcedureCallbacks {
    @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks
    /* renamed from: a */
    public boolean mo33728a(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeCheckingProcedure typeCheckingProcedure) {
        return typeCheckingProcedure.m33740i(kotlinType, kotlinType2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks
    /* renamed from: b */
    public boolean mo33729b(@NotNull KotlinType kotlinType, @NotNull TypeProjection typeProjection) {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks
    /* renamed from: c */
    public boolean mo33704c(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2) {
        return typeConstructor.equals(typeConstructor2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks
    /* renamed from: d */
    public boolean mo33730d(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks
    /* renamed from: e */
    public boolean mo33731e(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeCheckingProcedure typeCheckingProcedure) {
        return typeCheckingProcedure.m33738b(kotlinType, kotlinType2);
    }
}
