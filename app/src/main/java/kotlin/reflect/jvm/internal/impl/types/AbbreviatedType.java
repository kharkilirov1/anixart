package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes3.dex */
public final class AbbreviatedType extends DelegatingSimpleType {

    /* renamed from: a */
    @NotNull
    public final SimpleType f66278a;

    /* renamed from: b */
    @NotNull
    public final SimpleType f66279b;

    public AbbreviatedType(@NotNull SimpleType delegate, @NotNull SimpleType abbreviation) {
        Intrinsics.m32180i(delegate, "delegate");
        Intrinsics.m32180i(abbreviation, "abbreviation");
        this.f66278a = delegate;
        this.f66279b = abbreviation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: M0 */
    public SimpleType mo32787K0(boolean z) {
        return new AbbreviatedType(this.f66278a.mo32787K0(z), this.f66279b.mo32787K0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: N0 */
    public SimpleType mo32840N0(Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return new AbbreviatedType(this.f66278a.mo32840N0(newAnnotations), this.f66279b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* renamed from: O0 */
    public SimpleType mo32841O0() {
        return this.f66278a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public AbbreviatedType mo32787K0(boolean z) {
        return new AbbreviatedType(this.f66278a.mo32787K0(z), this.f66279b.mo32787K0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public AbbreviatedType mo32788L0(@NotNull Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return new AbbreviatedType(this.f66278a.mo32840N0(newAnnotations), this.f66279b);
    }
}
