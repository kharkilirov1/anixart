package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface TypeCheckingProcedureCallbacks {
    /* renamed from: a */
    boolean mo33728a(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeCheckingProcedure typeCheckingProcedure);

    /* renamed from: b */
    boolean mo33729b(@NotNull KotlinType kotlinType, @NotNull TypeProjection typeProjection);

    /* renamed from: c */
    boolean mo33704c(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2);

    /* renamed from: d */
    boolean mo33730d(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2);

    /* renamed from: e */
    boolean mo33731e(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeCheckingProcedure typeCheckingProcedure);
}
