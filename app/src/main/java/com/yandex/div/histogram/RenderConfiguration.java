package com.yandex.div.histogram;

import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.histogram.HistogramFilter;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RenderConfiguration.kt */
@PublicApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/histogram/RenderConfiguration;", "", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class RenderConfiguration {

    /* renamed from: a */
    @NotNull
    public final HistogramFilter f33688a;

    /* renamed from: b */
    @NotNull
    public final HistogramFilter f33689b;

    /* renamed from: c */
    @NotNull
    public final HistogramFilter f33690c;

    /* renamed from: d */
    @NotNull
    public final HistogramFilter f33691d;

    @JvmOverloads
    public RenderConfiguration() {
        this(null, null, null, null, 15);
    }

    public RenderConfiguration(HistogramFilter histogramFilter, HistogramFilter histogramFilter2, HistogramFilter histogramFilter3, HistogramFilter histogramFilter4, int i2) {
        HistogramFilter measureFilter;
        HistogramFilter layoutFilter;
        HistogramFilter drawFilter;
        HistogramFilter totalFilter = null;
        if ((i2 & 1) != 0) {
            Objects.requireNonNull(HistogramFilter.f33683D1);
            measureFilter = HistogramFilter.Companion.f33686c;
        } else {
            measureFilter = null;
        }
        if ((i2 & 2) != 0) {
            Objects.requireNonNull(HistogramFilter.f33683D1);
            layoutFilter = HistogramFilter.Companion.f33686c;
        } else {
            layoutFilter = null;
        }
        if ((i2 & 4) != 0) {
            Objects.requireNonNull(HistogramFilter.f33683D1);
            drawFilter = HistogramFilter.Companion.f33686c;
        } else {
            drawFilter = null;
        }
        if ((i2 & 8) != 0) {
            Objects.requireNonNull(HistogramFilter.f33683D1);
            totalFilter = HistogramFilter.Companion.f33685b;
        }
        Intrinsics.m32179h(measureFilter, "measureFilter");
        Intrinsics.m32179h(layoutFilter, "layoutFilter");
        Intrinsics.m32179h(drawFilter, "drawFilter");
        Intrinsics.m32179h(totalFilter, "totalFilter");
        this.f33688a = measureFilter;
        this.f33689b = layoutFilter;
        this.f33690c = drawFilter;
        this.f33691d = totalFilter;
    }
}
