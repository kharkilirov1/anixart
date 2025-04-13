package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;

/* compiled from: CapturedTypeApproximation.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$toTypeProjection$1$descriptorRenderer$1 */
/* loaded from: classes3.dex */
final class C6750x8e300b6 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {
    static {
        new C6750x8e300b6();
    }

    public C6750x8e300b6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
        DescriptorRendererOptions receiver$0 = descriptorRendererOptions;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        receiver$0.mo33417h(ClassifierNamePolicy.FULLY_QUALIFIED.f65763a);
        return Unit.f63088a;
    }
}
