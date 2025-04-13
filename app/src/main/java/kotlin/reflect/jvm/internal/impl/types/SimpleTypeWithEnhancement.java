package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes3.dex */
public final class SimpleTypeWithEnhancement extends DelegatingSimpleType implements TypeWithEnhancement {

    /* renamed from: a */
    @NotNull
    public final SimpleType f66330a;

    /* renamed from: b */
    @NotNull
    public final KotlinType f66331b;

    public SimpleTypeWithEnhancement(@NotNull SimpleType simpleType, @NotNull KotlinType kotlinType) {
        this.f66330a = simpleType;
        this.f66331b = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    /* renamed from: D */
    public KotlinType mo33655D() {
        return this.f66331b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* renamed from: M0 */
    public SimpleType mo32787K0(boolean z) {
        return (SimpleType) TypeWithEnhancementKt.m33700c(this.f66330a.mo32787K0(z), this.f66331b.mo33662J0().mo32787K0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public SimpleType mo32788L0(@NotNull Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return (SimpleType) TypeWithEnhancementKt.m33700c(this.f66330a.mo32788L0(newAnnotations), this.f66331b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* renamed from: O0 */
    public SimpleType mo32841O0() {
        return this.f66330a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    /* renamed from: z0 */
    public UnwrappedType mo33656z0() {
        return this.f66330a;
    }
}
