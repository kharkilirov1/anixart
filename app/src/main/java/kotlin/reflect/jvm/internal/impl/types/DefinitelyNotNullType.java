package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes3.dex */
public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeVariable {

    /* renamed from: b */
    public static final Companion f66295b = new Companion(null);

    /* renamed from: a */
    @NotNull
    public final SimpleType f66296a;

    /* compiled from: SpecialTypes.kt */
    public static final class Companion {
        public Companion() {
        }

        @Nullable
        /* renamed from: a */
        public final DefinitelyNotNullType m33643a(@NotNull UnwrappedType unwrappedType) {
            if (unwrappedType instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) unwrappedType;
            }
            boolean z = false;
            if (((unwrappedType.mo33515H0() instanceof NewTypeVariableConstructor) || (unwrappedType.mo33515H0().mo32449b() instanceof TypeParameterDescriptor) || (unwrappedType instanceof NewCapturedType)) && !NullabilityChecker.f66380a.m33720b(unwrappedType)) {
                z = true;
            }
            if (!z) {
                return null;
            }
            if (unwrappedType instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrappedType;
                Intrinsics.m32174c(flexibleType.f66316a.mo33515H0(), flexibleType.f66317b.mo33515H0());
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.m33659c(unwrappedType), null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DefinitelyNotNullType(SimpleType simpleType) {
        this.f66296a = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    /* renamed from: C */
    public boolean mo32836C() {
        return (this.f66296a.mo33515H0() instanceof NewTypeVariableConstructor) || (this.f66296a.mo33515H0().mo32449b() instanceof TypeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    @NotNull
    /* renamed from: G */
    public KotlinType mo32837G(@NotNull KotlinType replacement) {
        Intrinsics.m32180i(replacement, "replacement");
        UnwrappedType receiver$0 = replacement.mo33662J0();
        Intrinsics.m32180i(receiver$0, "receiver$0");
        DefinitelyNotNullType m33643a = f66295b.m33643a(receiver$0);
        return m33643a != null ? m33643a : receiver$0.mo32787K0(false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: I0 */
    public boolean mo32838I0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* renamed from: M0 */
    public SimpleType mo32787K0(boolean z) {
        return z ? this.f66296a.mo32787K0(z) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: N0 */
    public SimpleType mo32788L0(Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return new DefinitelyNotNullType(this.f66296a.mo32788L0(newAnnotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* renamed from: O0 */
    public SimpleType mo32841O0() {
        return this.f66296a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public DefinitelyNotNullType mo32788L0(@NotNull Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return new DefinitelyNotNullType(this.f66296a.mo32788L0(newAnnotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        return this.f66296a + "!!";
    }

    public DefinitelyNotNullType(@NotNull SimpleType simpleType, DefaultConstructorMarker defaultConstructorMarker) {
        this.f66296a = simpleType;
    }
}
