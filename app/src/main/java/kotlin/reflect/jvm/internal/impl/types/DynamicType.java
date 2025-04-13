package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: dynamicTypes.kt */
/* loaded from: classes3.dex */
public final class DynamicType extends FlexibleType {

    /* renamed from: c */
    @NotNull
    public final Annotations f66301c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DynamicType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4) {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r3.m32407q()
            java.lang.String r1 = "builtIns.nothingType"
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r3.m32408r()
            java.lang.String r1 = "builtIns.nullableAnyType"
            kotlin.jvm.internal.Intrinsics.m32175d(r3, r1)
            r2.<init>(r0, r3)
            r2.f66301c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.DynamicType.<init>(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: I0 */
    public boolean mo32838I0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: K0 */
    public UnwrappedType mo32787K0(boolean z) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: L0 */
    public UnwrappedType mo32788L0(Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return new DynamicType(TypeUtilsKt.m33748c(this.f66317b), newAnnotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* renamed from: M0 */
    public SimpleType mo32789M0() {
        return this.f66317b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* renamed from: N0 */
    public String mo32790N0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        return "dynamic";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f66301c;
    }
}
