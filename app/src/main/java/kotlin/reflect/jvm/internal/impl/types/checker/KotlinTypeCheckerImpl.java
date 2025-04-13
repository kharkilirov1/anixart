package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class KotlinTypeCheckerImpl implements KotlinTypeChecker {

    /* renamed from: b */
    public final TypeCheckingProcedure f66370b;

    public KotlinTypeCheckerImpl(@NotNull TypeCheckingProcedure typeCheckingProcedure) {
        this.f66370b = typeCheckingProcedure;
    }

    @NotNull
    /* renamed from: c */
    public static KotlinTypeChecker m33702c(@NotNull final KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        return new KotlinTypeCheckerImpl(new TypeCheckingProcedure(new TypeCheckerProcedureCallbacksImpl() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeCheckerImpl.1
            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerProcedureCallbacksImpl, kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks
            /* renamed from: c */
            public boolean mo33704c(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2) {
                return typeConstructor.equals(typeConstructor2) || KotlinTypeChecker.TypeConstructorEquality.this.mo33455a(typeConstructor, typeConstructor2);
            }
        }));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    /* renamed from: a */
    public boolean mo33701a(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        return this.f66370b.m33738b(kotlinType, kotlinType2);
    }

    /* renamed from: b */
    public boolean m33703b(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        return this.f66370b.m33740i(kotlinType, kotlinType2);
    }
}
