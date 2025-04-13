package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class TypeCheckingProcedure {

    /* renamed from: a */
    public final TypeCheckingProcedureCallbacks f66397a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure$1 */
    public static /* synthetic */ class C67461 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66398a;

        static {
            int[] iArr = new int[Variance.values().length];
            f66398a = iArr;
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66398a[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66398a[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum EnrichedProjectionKind {
        IN,
        OUT,
        INV,
        STAR
    }

    public TypeCheckingProcedure(TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        this.f66397a = typeCheckingProcedureCallbacks;
    }

    @Nullable
    /* renamed from: c */
    public static KotlinType m33732c(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        return m33733d(kotlinType, kotlinType2, new TypeCheckerProcedureCallbacksImpl());
    }

    @Nullable
    /* renamed from: d */
    public static KotlinType m33733d(@NotNull KotlinType subtype, @NotNull KotlinType supertype, @NotNull TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        boolean z;
        Intrinsics.m32180i(subtype, "subtype");
        Intrinsics.m32180i(supertype, "supertype");
        Intrinsics.m32180i(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new SubtypePathNode(subtype, null));
        TypeConstructor mo33515H0 = supertype.mo33515H0();
        while (!arrayDeque.isEmpty()) {
            SubtypePathNode subtypePathNode = (SubtypePathNode) arrayDeque.poll();
            KotlinType kotlinType = subtypePathNode.f66382a;
            TypeConstructor mo33515H02 = kotlinType.mo33515H0();
            if (typeCheckingProcedureCallbacks.mo33704c(mo33515H02, mo33515H0)) {
                boolean mo32838I0 = kotlinType.mo32838I0();
                for (SubtypePathNode subtypePathNode2 = subtypePathNode.f66383b; subtypePathNode2 != null; subtypePathNode2 = subtypePathNode2.f66383b) {
                    KotlinType kotlinType2 = subtypePathNode2.f66382a;
                    List<TypeProjection> mo33514G0 = kotlinType2.mo33514G0();
                    if (!(mo33514G0 instanceof Collection) || !mo33514G0.isEmpty()) {
                        Iterator<T> it = mo33514G0.iterator();
                        while (it.hasNext()) {
                            if (((TypeProjection) it.next()).mo33671a() != Variance.INVARIANT) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        KotlinType m33688f = new TypeSubstitutor(CapturedTypeConstructorKt.m33519b(TypeConstructorSubstitution.f66342b.m33676a(kotlinType2), false, 1)).m33688f(kotlinType, Variance.INVARIANT);
                        Intrinsics.m32175d(m33688f, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                        kotlinType = CapturedTypeApproximationKt.m33755a(m33688f).f66413b;
                    } else {
                        kotlinType = new TypeSubstitutor(TypeConstructorSubstitution.f66342b.m33676a(kotlinType2)).m33688f(kotlinType, Variance.INVARIANT);
                        Intrinsics.m32175d(kotlinType, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                    }
                    mo32838I0 = mo32838I0 || kotlinType2.mo32838I0();
                }
                TypeConstructor mo33515H03 = kotlinType.mo33515H0();
                if (typeCheckingProcedureCallbacks.mo33704c(mo33515H03, mo33515H0)) {
                    SimpleType simpleType = TypeUtils.f66355a;
                    return kotlinType.mo33662J0().mo32787K0(mo32838I0);
                }
                StringBuilder m27x = C0000a.m27x("Type constructors should be equals!\n", "substitutedSuperType: ");
                m27x.append(UtilsKt.m33744a(mo33515H03));
                m27x.append(", \n\n");
                m27x.append("supertype: ");
                m27x.append(UtilsKt.m33744a(mo33515H0));
                m27x.append(" \n");
                m27x.append(typeCheckingProcedureCallbacks.mo33704c(mo33515H03, mo33515H0));
                throw new AssertionError(m27x.toString());
            }
            for (KotlinType immediateSupertype : mo33515H02.mo32602a()) {
                Intrinsics.m32175d(immediateSupertype, "immediateSupertype");
                arrayDeque.add(new SubtypePathNode(immediateSupertype, subtypePathNode));
            }
        }
        return null;
    }

    /* renamed from: e */
    public static EnrichedProjectionKind m33734e(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeProjection typeProjection) {
        EnrichedProjectionKind enrichedProjectionKind = EnrichedProjectionKind.STAR;
        Variance mo32500m = typeParameterDescriptor.mo32500m();
        Variance mo33671a = typeProjection.mo33671a();
        if (mo33671a == Variance.INVARIANT) {
            mo33671a = mo32500m;
            mo32500m = mo33671a;
        }
        Variance variance = Variance.IN_VARIANCE;
        if (mo32500m == variance && mo33671a == Variance.OUT_VARIANCE) {
            return enrichedProjectionKind;
        }
        if (mo32500m == Variance.OUT_VARIANCE && mo33671a == variance) {
            return enrichedProjectionKind;
        }
        int ordinal = mo33671a.ordinal();
        if (ordinal == 0) {
            return EnrichedProjectionKind.INV;
        }
        if (ordinal == 1) {
            return EnrichedProjectionKind.IN;
        }
        if (ordinal == 2) {
            return EnrichedProjectionKind.OUT;
        }
        throw new IllegalStateException("Unknown variance");
    }

    @NotNull
    /* renamed from: f */
    public static KotlinType m33735f(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeProjection typeProjection) {
        Variance mo33671a = typeProjection.mo33671a();
        Variance variance = Variance.OUT_VARIANCE;
        return mo33671a == variance || typeParameterDescriptor.mo32500m() == variance ? DescriptorUtilsKt.m33534g(typeParameterDescriptor).m32407q() : typeProjection.getType();
    }

    @NotNull
    /* renamed from: g */
    public static KotlinType m33736g(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeProjection typeProjection) {
        Variance mo33671a = typeProjection.mo33671a();
        Variance variance = Variance.IN_VARIANCE;
        return mo33671a == variance || typeParameterDescriptor.mo32500m() == variance ? DescriptorUtilsKt.m33534g(typeParameterDescriptor).m32408r() : typeProjection.getType();
    }

    /* renamed from: a */
    public final boolean m33737a(@NotNull TypeProjection typeProjection, @NotNull TypeProjection typeProjection2, @NotNull TypeParameterDescriptor typeParameterDescriptor) {
        Variance mo32500m = typeParameterDescriptor.mo32500m();
        Variance variance = Variance.INVARIANT;
        if (mo32500m == variance && typeProjection.mo33671a() != variance && typeProjection2.mo33671a() == variance) {
            return this.f66397a.mo33729b(typeProjection2.getType(), typeProjection);
        }
        return false;
    }

    /* renamed from: b */
    public boolean m33738b(@NotNull KotlinType receiver$0, @NotNull KotlinType receiver$02) {
        if (receiver$0 == receiver$02) {
            return true;
        }
        Intrinsics.m32180i(receiver$0, "receiver$0");
        if (receiver$0.mo33662J0() instanceof FlexibleType) {
            Intrinsics.m32180i(receiver$02, "receiver$0");
            return receiver$02.mo33662J0() instanceof FlexibleType ? !KotlinTypeKt.m33667a(receiver$0) && !KotlinTypeKt.m33667a(receiver$02) && m33740i(receiver$0, receiver$02) && m33740i(receiver$02, receiver$0) : m33739h(receiver$02, receiver$0);
        }
        Intrinsics.m32180i(receiver$02, "receiver$0");
        if (receiver$02.mo33662J0() instanceof FlexibleType) {
            return m33739h(receiver$0, receiver$02);
        }
        if (receiver$0.mo32838I0() != receiver$02.mo32838I0()) {
            return false;
        }
        if (receiver$0.mo32838I0()) {
            TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks = this.f66397a;
            SimpleType simpleType = TypeUtils.f66355a;
            return typeCheckingProcedureCallbacks.mo33731e(receiver$0.mo33662J0().mo32787K0(false), receiver$02.mo33662J0().mo32787K0(false), this);
        }
        TypeConstructor mo33515H0 = receiver$0.mo33515H0();
        TypeConstructor mo33515H02 = receiver$02.mo33515H0();
        if (!this.f66397a.mo33704c(mo33515H0, mo33515H02)) {
            return false;
        }
        List<TypeProjection> mo33514G0 = receiver$0.mo33514G0();
        List<TypeProjection> mo33514G02 = receiver$02.mo33514G0();
        if (mo33514G0.size() != mo33514G02.size()) {
            return false;
        }
        for (int i2 = 0; i2 < mo33514G0.size(); i2++) {
            TypeProjection typeProjection = mo33514G0.get(i2);
            TypeProjection typeProjection2 = mo33514G02.get(i2);
            if (!typeProjection.mo33672b() || !typeProjection2.mo33672b()) {
                TypeParameterDescriptor typeParameterDescriptor = mo33515H0.getParameters().get(i2);
                TypeParameterDescriptor typeParameterDescriptor2 = mo33515H02.getParameters().get(i2);
                if (!m33737a(typeProjection, typeProjection2, typeParameterDescriptor) && (m33734e(typeParameterDescriptor, typeProjection) != m33734e(typeParameterDescriptor2, typeProjection2) || !this.f66397a.mo33731e(typeProjection.getType(), typeProjection2.getType(), this))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: h */
    public boolean m33739h(KotlinType kotlinType, KotlinType kotlinType2) {
        return m33740i(FlexibleTypesKt.m33657a(kotlinType2).f66316a, kotlinType) && m33740i(kotlinType, FlexibleTypesKt.m33657a(kotlinType2).f66317b);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m33740i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.KotlinType r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.KotlinType r12) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.m33740i(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType):boolean");
    }
}
