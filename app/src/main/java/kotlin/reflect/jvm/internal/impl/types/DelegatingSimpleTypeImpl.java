package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes3.dex */
public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {

    /* renamed from: a */
    @NotNull
    public final SimpleType f66298a;

    public DelegatingSimpleTypeImpl(@NotNull SimpleType simpleType) {
        this.f66298a = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: L0 */
    public UnwrappedType mo32788L0(Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return newAnnotations != getAnnotations() ? new AnnotatedSimpleType(this, newAnnotations) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* renamed from: M0 */
    public SimpleType mo32787K0(boolean z) {
        return z == mo32838I0() ? this : this.f66298a.mo32787K0(z).mo32840N0(getAnnotations());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: N0 */
    public SimpleType mo32840N0(Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return newAnnotations != getAnnotations() ? new AnnotatedSimpleType(this, newAnnotations) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* renamed from: O0 */
    public SimpleType mo32841O0() {
        return this.f66298a;
    }
}
