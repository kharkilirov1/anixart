package com.yandex.div.histogram;

import android.os.SystemClock;
import androidx.annotation.MainThread;
import com.yandex.div.histogram.metrics.RenderMetrics;
import com.yandex.div.histogram.reporter.HistogramReporter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Div2ViewHistogramReporter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/histogram/Div2ViewHistogramReporter;", "", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@MainThread
/* loaded from: classes2.dex */
public final class Div2ViewHistogramReporter {

    /* renamed from: a */
    @NotNull
    public final Function0<HistogramReporter> f33650a;

    /* renamed from: b */
    @NotNull
    public final Function0<RenderConfiguration> f33651b;

    /* renamed from: c */
    @Nullable
    public String f33652c;

    /* renamed from: d */
    public boolean f33653d;

    /* renamed from: e */
    @Nullable
    public Long f33654e;

    /* renamed from: f */
    @Nullable
    public Long f33655f;

    /* renamed from: g */
    @Nullable
    public Long f33656g;

    /* renamed from: h */
    @Nullable
    public Long f33657h;

    /* renamed from: i */
    @Nullable
    public Long f33658i;

    /* renamed from: j */
    @Nullable
    public Long f33659j;

    /* renamed from: k */
    @Nullable
    public Long f33660k;

    /* renamed from: l */
    @NotNull
    public final Lazy f33661l;

    /* JADX WARN: Multi-variable type inference failed */
    public Div2ViewHistogramReporter(@NotNull Function0<? extends HistogramReporter> function0, @NotNull Function0<RenderConfiguration> renderConfig) {
        Intrinsics.m32179h(renderConfig, "renderConfig");
        this.f33650a = function0;
        this.f33651b = renderConfig;
        this.f33661l = LazyKt.m31880a(LazyThreadSafetyMode.NONE, Div2ViewHistogramReporter$renderMetrics$2.f33662d);
    }

    /* renamed from: a */
    public final RenderMetrics m17277a() {
        return (RenderMetrics) this.f33661l.getValue();
    }

    /* renamed from: b */
    public final void m17278b() {
        long uptimeMillis;
        long longValue;
        Long l2 = this.f33654e;
        Long l3 = this.f33655f;
        Long l4 = this.f33656g;
        RenderMetrics m17277a = m17277a();
        if (l2 != null) {
            if (l3 != null && l4 != null) {
                uptimeMillis = l3.longValue() + (SystemClock.uptimeMillis() - l4.longValue());
                longValue = l2.longValue();
            } else if (l3 == null && l4 == null) {
                uptimeMillis = SystemClock.uptimeMillis();
                longValue = l2.longValue();
            }
            long j2 = uptimeMillis - longValue;
            m17277a.f33694a = j2;
            HistogramReporter.m17295a(this.f33650a.invoke(), "Div.Binding", j2, this.f33652c, null, null, 24, null);
        }
        this.f33654e = null;
        this.f33655f = null;
        this.f33656g = null;
    }

    /* renamed from: c */
    public final void m17279c() {
        Long l2 = this.f33660k;
        if (l2 != null) {
            m17277a().f33698e += m17280d(l2.longValue());
        }
        if (this.f33653d) {
            RenderMetrics m17277a = m17277a();
            HistogramReporter invoke = this.f33650a.invoke();
            RenderConfiguration invoke2 = this.f33651b.invoke();
            HistogramReporter.m17295a(invoke, "Div.Render.Total", m17277a.f33698e + Math.max(m17277a.f33694a, m17277a.f33695b) + m17277a.f33696c + m17277a.f33697d, this.f33652c, null, invoke2.f33691d, 8, null);
            HistogramReporter.m17295a(invoke, "Div.Render.Measure", m17277a.f33696c, this.f33652c, null, invoke2.f33688a, 8, null);
            HistogramReporter.m17295a(invoke, "Div.Render.Layout", m17277a.f33697d, this.f33652c, null, invoke2.f33689b, 8, null);
            HistogramReporter.m17295a(invoke, "Div.Render.Draw", m17277a.f33698e, this.f33652c, null, invoke2.f33690c, 8, null);
        }
        this.f33653d = false;
        this.f33659j = null;
        this.f33658i = null;
        this.f33660k = null;
        RenderMetrics m17277a2 = m17277a();
        m17277a2.f33696c = 0L;
        m17277a2.f33697d = 0L;
        m17277a2.f33698e = 0L;
        m17277a2.f33694a = 0L;
        m17277a2.f33695b = 0L;
    }

    /* renamed from: d */
    public final long m17280d(long j2) {
        return SystemClock.uptimeMillis() - j2;
    }
}
