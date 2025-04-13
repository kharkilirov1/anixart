package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: KotlinType.kt */
/* loaded from: classes3.dex */
public abstract class FlexibleType extends UnwrappedType implements SubtypingRepresentatives {

    /* renamed from: a */
    @NotNull
    public final SimpleType f66316a;

    /* renamed from: b */
    @NotNull
    public final SimpleType f66317b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleType(@NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
        super(null);
        Intrinsics.m32180i(lowerBound, "lowerBound");
        Intrinsics.m32180i(upperBound, "upperBound");
        this.f66316a = lowerBound;
        this.f66317b = upperBound;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives
    @NotNull
    /* renamed from: C0 */
    public KotlinType mo33513C0() {
        return this.f66316a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: G0 */
    public List<TypeProjection> mo33514G0() {
        return mo32789M0().mo33514G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: H0 */
    public TypeConstructor mo33515H0() {
        return mo32789M0().mo33515H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: I0 */
    public boolean mo32838I0() {
        return mo32789M0().mo32838I0();
    }

    @NotNull
    /* renamed from: M0 */
    public abstract SimpleType mo32789M0();

    @NotNull
    /* renamed from: N0 */
    public abstract String mo32790N0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions);

    @Override // kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives
    @NotNull
    /* renamed from: O */
    public KotlinType mo33516O() {
        return this.f66317b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives
    /* renamed from: Z */
    public boolean mo33517Z(@NotNull KotlinType kotlinType) {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return mo32789M0().getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: p */
    public MemberScope mo32791p() {
        return mo32789M0().mo32791p();
    }

    @NotNull
    public String toString() {
        return DescriptorRenderer.f65767b.mo33368x(this);
    }
}
