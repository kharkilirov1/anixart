package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes3.dex */
public final class FlexibleTypeWithEnhancement extends FlexibleType implements TypeWithEnhancement {

    /* renamed from: c */
    @NotNull
    public final FlexibleType f66318c;

    /* renamed from: d */
    @NotNull
    public final KotlinType f66319d;

    public FlexibleTypeWithEnhancement(@NotNull FlexibleType flexibleType, @NotNull KotlinType kotlinType) {
        super(flexibleType.f66316a, flexibleType.f66317b);
        this.f66318c = flexibleType;
        this.f66319d = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    /* renamed from: D */
    public KotlinType mo33655D() {
        return this.f66319d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* renamed from: K0 */
    public UnwrappedType mo32787K0(boolean z) {
        return TypeWithEnhancementKt.m33700c(this.f66318c.mo32787K0(z), this.f66319d.mo33662J0().mo32787K0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* renamed from: L0 */
    public UnwrappedType mo32788L0(@NotNull Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return TypeWithEnhancementKt.m33700c(this.f66318c.mo32788L0(newAnnotations), this.f66319d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* renamed from: M0 */
    public SimpleType mo32789M0() {
        return this.f66318c.mo32789M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* renamed from: N0 */
    public String mo32790N0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        return descriptorRendererOptions.mo33415g() ? descriptorRenderer.mo33368x(this.f66319d) : this.f66318c.mo32790N0(descriptorRenderer, descriptorRendererOptions);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    /* renamed from: z0 */
    public UnwrappedType mo33656z0() {
        return this.f66318c;
    }
}
