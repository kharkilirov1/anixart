package androidx.window.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowMetricsCalculator.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends FunctionReferenceImpl implements Function1<WindowMetricsCalculator, WindowMetricsCalculator> {
    @Override // kotlin.jvm.functions.Function1
    public WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
        WindowMetricsCalculator p0 = windowMetricsCalculator;
        Intrinsics.m32179h(p0, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).m4468a(p0);
    }
}
