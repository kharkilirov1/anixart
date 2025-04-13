package com.yandex.div.core.dagger;

import com.yandex.div.histogram.reporter.HistogramReporter;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DivKitHistogramsModule.kt */
@Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class DivKitHistogramsModule$provideDivParsingHistogramReporter$1 extends FunctionReferenceImpl implements Function0<HistogramReporter> {
    public DivKitHistogramsModule$provideDivParsingHistogramReporter$1(Object obj) {
        super(0, obj, Provider.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public HistogramReporter invoke() {
        return (HistogramReporter) ((Provider) this.receiver).get();
    }
}
