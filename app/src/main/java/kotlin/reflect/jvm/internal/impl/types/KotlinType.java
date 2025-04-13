package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KotlinType.kt */
/* loaded from: classes3.dex */
public abstract class KotlinType implements Annotated {
    public KotlinType() {
    }

    @NotNull
    /* renamed from: G0 */
    public abstract List<TypeProjection> mo33514G0();

    @NotNull
    /* renamed from: H0 */
    public abstract TypeConstructor mo33515H0();

    /* renamed from: I0 */
    public abstract boolean mo32838I0();

    @NotNull
    /* renamed from: J0 */
    public abstract UnwrappedType mo33662J0();

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinType)) {
            return false;
        }
        KotlinType kotlinType = (KotlinType) obj;
        return mo32838I0() == kotlinType.mo32838I0() && StrictEqualityTypeChecker.f66381a.m33722b(mo33662J0(), kotlinType.mo33662J0());
    }

    public final int hashCode() {
        if (KotlinTypeKt.m33667a(this)) {
            return super.hashCode();
        }
        return ((mo33514G0().hashCode() + (mo33515H0().hashCode() * 31)) * 31) + (mo32838I0() ? 1 : 0);
    }

    @NotNull
    /* renamed from: p */
    public abstract MemberScope mo32791p();

    public KotlinType(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
