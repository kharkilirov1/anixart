package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes3.dex */
public abstract class DelegatingSimpleType extends SimpleType {
    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: G0 */
    public List<TypeProjection> mo33514G0() {
        return mo32841O0().mo33514G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: H0 */
    public TypeConstructor mo33515H0() {
        return mo32841O0().mo33515H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: I0 */
    public boolean mo32838I0() {
        return mo32841O0().mo32838I0();
    }

    @NotNull
    /* renamed from: O0 */
    public abstract SimpleType mo32841O0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return mo32841O0().getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: p */
    public MemberScope mo32791p() {
        return mo32841O0().mo32791p();
    }
}
