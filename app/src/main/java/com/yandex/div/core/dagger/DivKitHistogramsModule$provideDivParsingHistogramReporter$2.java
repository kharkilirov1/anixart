package com.yandex.div.core.dagger;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DivKitHistogramsModule.kt */
@Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class DivKitHistogramsModule$provideDivParsingHistogramReporter$2 extends FunctionReferenceImpl implements Function0<Executor> {
    public DivKitHistogramsModule$provideDivParsingHistogramReporter$2(Object obj) {
        super(0, obj, Provider.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public Executor invoke() {
        return (Executor) ((Provider) this.receiver).get();
    }
}
