package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes3.dex */
public final class StrictEqualityTypeChecker {

    /* renamed from: a */
    public static final StrictEqualityTypeChecker f66381a = new StrictEqualityTypeChecker();

    /* renamed from: a */
    public final boolean m33721a(@NotNull SimpleType a2, @NotNull SimpleType b) {
        Intrinsics.m32180i(a2, "a");
        Intrinsics.m32180i(b, "b");
        if (a2.mo32838I0() != b.mo32838I0() || (a2.mo33662J0() instanceof DefinitelyNotNullType) != (b.mo33662J0() instanceof DefinitelyNotNullType) || (!Intrinsics.m32174c(a2.mo33515H0(), b.mo33515H0())) || a2.mo33514G0().size() != b.mo33514G0().size()) {
            return false;
        }
        if (a2.mo33514G0() == b.mo33514G0()) {
            return true;
        }
        int size = a2.mo33514G0().size();
        for (int i2 = 0; i2 < size; i2++) {
            TypeProjection typeProjection = a2.mo33514G0().get(i2);
            TypeProjection typeProjection2 = b.mo33514G0().get(i2);
            if (typeProjection.mo33672b() != typeProjection2.mo33672b()) {
                return false;
            }
            if (!typeProjection.mo33672b() && (typeProjection.mo33671a() != typeProjection2.mo33671a() || !m33722b(typeProjection.getType().mo33662J0(), typeProjection2.getType().mo33662J0()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m33722b(@NotNull UnwrappedType a2, @NotNull UnwrappedType b) {
        Intrinsics.m32180i(a2, "a");
        Intrinsics.m32180i(b, "b");
        if (a2 == b) {
            return true;
        }
        if ((a2 instanceof SimpleType) && (b instanceof SimpleType)) {
            return m33721a((SimpleType) a2, (SimpleType) b);
        }
        if (!(a2 instanceof FlexibleType) || !(b instanceof FlexibleType)) {
            return false;
        }
        FlexibleType flexibleType = (FlexibleType) a2;
        FlexibleType flexibleType2 = (FlexibleType) b;
        return m33721a(flexibleType.f66316a, flexibleType2.f66316a) && m33721a(flexibleType.f66317b, flexibleType2.f66317b);
    }
}
