package kotlin.reflect.jvm.internal.impl.types;

import androidx.emoji2.text.flatbuffer.C0321a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: flexibleTypes.kt */
/* loaded from: classes3.dex */
public final class FlexibleTypeImpl extends FlexibleType implements CustomTypeVariable {

    /* compiled from: flexibleTypes.kt */
    public static final class Companion {
    }

    public FlexibleTypeImpl(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        super(simpleType, simpleType2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    /* renamed from: C */
    public boolean mo32836C() {
        return (this.f66316a.mo33515H0().mo32449b() instanceof TypeParameterDescriptor) && Intrinsics.m32174c(this.f66316a.mo33515H0(), this.f66317b.mo33515H0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    @NotNull
    /* renamed from: G */
    public KotlinType mo32837G(@NotNull KotlinType replacement) {
        UnwrappedType m33663a;
        Intrinsics.m32180i(replacement, "replacement");
        UnwrappedType mo33662J0 = replacement.mo33662J0();
        if (mo33662J0 instanceof FlexibleType) {
            m33663a = mo33662J0;
        } else {
            if (!(mo33662J0 instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            SimpleType simpleType = (SimpleType) mo33662J0;
            m33663a = KotlinTypeFactory.m33663a(simpleType, simpleType.mo32787K0(true));
        }
        return TypeWithEnhancementKt.m33699b(m33663a, mo33662J0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* renamed from: K0 */
    public UnwrappedType mo32787K0(boolean z) {
        return KotlinTypeFactory.m33663a(this.f66316a.mo32787K0(z), this.f66317b.mo32787K0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* renamed from: L0 */
    public UnwrappedType mo32788L0(@NotNull Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return KotlinTypeFactory.m33663a(this.f66316a.mo32788L0(newAnnotations), this.f66317b.mo32788L0(newAnnotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* renamed from: M0 */
    public SimpleType mo32789M0() {
        return this.f66316a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* renamed from: N0 */
    public String mo32790N0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        if (!descriptorRendererOptions.mo33433p()) {
            return descriptorRenderer.mo33365u(descriptorRenderer.mo33368x(this.f66316a), descriptorRenderer.mo33368x(this.f66317b), TypeUtilsKt.m33748c(this));
        }
        StringBuilder m2872a = C0321a.m2872a('(');
        m2872a.append(descriptorRenderer.mo33368x(this.f66316a));
        m2872a.append("..");
        m2872a.append(descriptorRenderer.mo33368x(this.f66317b));
        m2872a.append(')');
        return m2872a.toString();
    }
}
