package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes3.dex */
public final class NotNullTypeParameter extends DelegatingSimpleType implements CustomTypeVariable {

    /* renamed from: a */
    @NotNull
    public final SimpleType f64655a;

    public NotNullTypeParameter(@NotNull SimpleType delegate) {
        Intrinsics.m32180i(delegate, "delegate");
        this.f64655a = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    /* renamed from: C */
    public boolean mo32836C() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    @NotNull
    /* renamed from: G */
    public KotlinType mo32837G(@NotNull KotlinType replacement) {
        Intrinsics.m32180i(replacement, "replacement");
        UnwrappedType mo33662J0 = replacement.mo33662J0();
        if (!TypeUtils.m33694d(mo33662J0) && !TypeUtilsKt.m33750e(mo33662J0)) {
            return mo33662J0;
        }
        if (mo33662J0 instanceof SimpleType) {
            return m32842P0((SimpleType) mo33662J0);
        }
        if (mo33662J0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) mo33662J0;
            return TypeWithEnhancementKt.m33700c(KotlinTypeFactory.m33663a(m32842P0(flexibleType.f66316a), m32842P0(flexibleType.f66317b)), TypeWithEnhancementKt.m33698a(mo33662J0));
        }
        throw new IllegalStateException(("Incorrect type: " + mo33662J0).toString());
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
        return z ? this.f64655a.mo32787K0(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: N0 */
    public SimpleType mo32788L0(Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return new NotNullTypeParameter(this.f64655a.mo32788L0(newAnnotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* renamed from: O0 */
    public SimpleType mo32841O0() {
        return this.f64655a;
    }

    /* renamed from: P0 */
    public final SimpleType m32842P0(@NotNull SimpleType simpleType) {
        SimpleType mo32787K0 = simpleType.mo32787K0(false);
        return !TypeUtils.m33695e(simpleType) ? mo32787K0 : new NotNullTypeParameter(mo32787K0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public NotNullTypeParameter mo32788L0(@NotNull Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return new NotNullTypeParameter(this.f64655a.mo32788L0(newAnnotations));
    }
}
