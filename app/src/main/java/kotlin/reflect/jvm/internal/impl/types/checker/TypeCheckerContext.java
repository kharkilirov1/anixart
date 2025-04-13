package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypeCheckerContext.kt */
/* loaded from: classes3.dex */
public class TypeCheckerContext {

    /* renamed from: a */
    public int f66384a;

    /* renamed from: b */
    public ArrayDeque<SimpleType> f66385b;

    /* renamed from: c */
    public Set<SimpleType> f66386c;

    /* renamed from: d */
    public final boolean f66387d;

    /* renamed from: e */
    public final boolean f66388e;

    /* compiled from: TypeCheckerContext.kt */
    public enum LowerCapturedTypePolicy {
        /* JADX INFO: Fake field, exist only in values array */
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        /* JADX INFO: Fake field, exist only in values array */
        SKIP_LOWER
    }

    /* compiled from: TypeCheckerContext.kt */
    public enum SeveralSupertypesWithSameConstructorPolicy {
        /* JADX INFO: Fake field, exist only in values array */
        TAKE_FIRST_FOR_SUBTYPING,
        /* JADX INFO: Fake field, exist only in values array */
        FORCE_NOT_SUBTYPE,
        /* JADX INFO: Fake field, exist only in values array */
        CHECK_ANY_OF_THEM,
        INTERSECT_ARGUMENTS_AND_CHECK_AGAIN
    }

    /* compiled from: TypeCheckerContext.kt */
    public static abstract class SupertypesPolicy {

        /* compiled from: TypeCheckerContext.kt */
        public static final class LowerIfFlexible extends SupertypesPolicy {

            /* renamed from: a */
            public static final LowerIfFlexible f66393a = new LowerIfFlexible();

            public LowerIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SupertypesPolicy
            @NotNull
            /* renamed from: a */
            public SimpleType mo33727a(@NotNull KotlinType kotlinType) {
                return FlexibleTypesKt.m33659c(kotlinType);
            }
        }

        /* compiled from: TypeCheckerContext.kt */
        public static final class LowerIfFlexibleWithCustomSubstitutor extends SupertypesPolicy {

            /* renamed from: a */
            @NotNull
            public final TypeSubstitutor f66394a;

            public LowerIfFlexibleWithCustomSubstitutor(@NotNull TypeSubstitutor typeSubstitutor) {
                super(null);
                this.f66394a = typeSubstitutor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SupertypesPolicy
            @NotNull
            /* renamed from: a */
            public SimpleType mo33727a(@NotNull KotlinType kotlinType) {
                KotlinType m33688f = this.f66394a.m33688f(FlexibleTypesKt.m33659c(kotlinType), Variance.INVARIANT);
                Intrinsics.m32175d(m33688f, "substitutor.safeSubstitu…le(), Variance.INVARIANT)");
                return TypeSubstitutionKt.m33678a(m33688f);
            }
        }

        /* compiled from: TypeCheckerContext.kt */
        public static final class None extends SupertypesPolicy {

            /* renamed from: a */
            public static final None f66395a = new None();

            public None() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SupertypesPolicy
            /* renamed from: a */
            public SimpleType mo33727a(KotlinType kotlinType) {
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* compiled from: TypeCheckerContext.kt */
        public static final class UpperIfFlexible extends SupertypesPolicy {

            /* renamed from: a */
            public static final UpperIfFlexible f66396a = new UpperIfFlexible();

            public UpperIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SupertypesPolicy
            @NotNull
            /* renamed from: a */
            public SimpleType mo33727a(@NotNull KotlinType kotlinType) {
                return FlexibleTypesKt.m33660d(kotlinType);
            }
        }

        public SupertypesPolicy() {
        }

        @NotNull
        /* renamed from: a */
        public abstract SimpleType mo33727a(@NotNull KotlinType kotlinType);

        public SupertypesPolicy(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public TypeCheckerContext(boolean z, boolean z2, int i2) {
        z2 = (i2 & 2) != 0 ? true : z2;
        this.f66387d = z;
        this.f66388e = z2;
    }

    /* renamed from: a */
    public static final void m33723a(TypeCheckerContext typeCheckerContext) {
        ArrayDeque<SimpleType> arrayDeque = typeCheckerContext.f66385b;
        if (arrayDeque == null) {
            Intrinsics.m32188q();
            throw null;
        }
        arrayDeque.clear();
        Set<SimpleType> set = typeCheckerContext.f66386c;
        if (set != null) {
            set.clear();
        } else {
            Intrinsics.m32188q();
            throw null;
        }
    }

    /* renamed from: b */
    public static final void m33724b(TypeCheckerContext typeCheckerContext) {
        Objects.requireNonNull(typeCheckerContext);
        if (typeCheckerContext.f66385b == null) {
            typeCheckerContext.f66385b = new ArrayDeque<>(4);
        }
        if (typeCheckerContext.f66386c == null) {
            typeCheckerContext.f66386c = SmartSet.f66512d.m33786a();
        }
    }

    /* renamed from: c */
    public boolean m33725c(@NotNull TypeConstructor a2, @NotNull TypeConstructor b) {
        Intrinsics.m32180i(a2, "a");
        Intrinsics.m32180i(b, "b");
        return Intrinsics.m32174c(a2, b);
    }

    /* renamed from: d */
    public final boolean m33726d(@NotNull UnwrappedType unwrappedType) {
        return this.f66388e && (unwrappedType.mo33515H0() instanceof NewTypeVariableConstructor);
    }
}
