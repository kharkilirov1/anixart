package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: KotlinType.kt */
/* loaded from: classes3.dex */
public abstract class WrappedType extends KotlinType {
    public WrappedType() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: G0 */
    public List<TypeProjection> mo33514G0() {
        return mo33668K0().mo33514G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: H0 */
    public TypeConstructor mo33515H0() {
        return mo33668K0().mo33515H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: I0 */
    public boolean mo32838I0() {
        return mo33668K0().mo32838I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: J0 */
    public final UnwrappedType mo33662J0() {
        KotlinType mo33668K0 = mo33668K0();
        while (mo33668K0 instanceof WrappedType) {
            mo33668K0 = ((WrappedType) mo33668K0).mo33668K0();
        }
        if (mo33668K0 != null) {
            return (UnwrappedType) mo33668K0;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
    }

    @NotNull
    /* renamed from: K0 */
    public abstract KotlinType mo33668K0();

    /* renamed from: L0 */
    public boolean mo33669L0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return mo33668K0().getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: p */
    public MemberScope mo32791p() {
        return mo33668K0().mo32791p();
    }

    @NotNull
    public String toString() {
        return mo33669L0() ? mo33668K0().toString() : "<Not computed yet>";
    }
}
