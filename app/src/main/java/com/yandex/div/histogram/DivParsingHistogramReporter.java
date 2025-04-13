package com.yandex.div.histogram;

import com.yandex.div.core.annotations.PublicApi;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivParsingHistogramReporter.kt */
@PublicApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "", "Companion", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface DivParsingHistogramReporter {

    /* renamed from: a */
    @NotNull
    public static final Companion f33663a = Companion.f33664a;

    /* compiled from: DivParsingHistogramReporter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/histogram/DivParsingHistogramReporter$Companion;", "", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f33664a = new Companion();

        /* renamed from: b */
        @NotNull
        public static final Lazy<DefaultDivParsingHistogramReporter> f33665b = LazyKt.m31881b(DivParsingHistogramReporter$Companion$DEFAULT$2.f33666d);
    }
}
