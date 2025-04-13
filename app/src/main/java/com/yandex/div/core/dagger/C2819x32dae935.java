package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramColdTypeChecker;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DivHistogramsModule.kt */
@Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* renamed from: com.yandex.div.core.dagger.DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1 */
/* loaded from: classes2.dex */
final /* synthetic */ class C2819x32dae935 extends FunctionReferenceImpl implements Function0<HistogramColdTypeChecker> {
    public C2819x32dae935(Object obj) {
        super(0, obj, Provider.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public HistogramColdTypeChecker invoke() {
        return (HistogramColdTypeChecker) ((Provider) this.receiver).get();
    }
}
