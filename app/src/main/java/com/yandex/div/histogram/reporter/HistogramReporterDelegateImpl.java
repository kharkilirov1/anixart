package com.yandex.div.histogram.reporter;

import com.yandex.div.histogram.HistogramCallType;
import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.TaskExecutor;
import com.yandex.div.internal.Assert;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HistogramReporterDelegateImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/histogram/reporter/HistogramReporterDelegateImpl;", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class HistogramReporterDelegateImpl implements HistogramReporterDelegate {

    /* renamed from: a */
    @NotNull
    public final Provider<HistogramRecorder> f33701a;

    /* renamed from: b */
    @NotNull
    public final HistogramCallTypeProvider f33702b;

    /* renamed from: c */
    @NotNull
    public final HistogramRecordConfiguration f33703c;

    /* renamed from: d */
    @NotNull
    public final Provider<TaskExecutor> f33704d;

    public HistogramReporterDelegateImpl(@NotNull Provider<HistogramRecorder> provider, @NotNull HistogramCallTypeProvider histogramCallTypeProvider, @NotNull HistogramRecordConfiguration histogramRecordConfiguration, @NotNull Provider<TaskExecutor> taskExecutor) {
        Intrinsics.m32179h(taskExecutor, "taskExecutor");
        this.f33701a = provider;
        this.f33702b = histogramCallTypeProvider;
        this.f33703c = histogramRecordConfiguration;
        this.f33704d = taskExecutor;
    }

    @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
    /* renamed from: a */
    public void mo17296a(@NotNull final String histogramName, final long j2, @HistogramCallType @Nullable String str) {
        String str2;
        boolean mo17291h;
        Intrinsics.m32179h(histogramName, "histogramName");
        HistogramCallTypeProvider histogramCallTypeProvider = this.f33702b;
        Objects.requireNonNull(histogramCallTypeProvider);
        if (histogramCallTypeProvider.f33672b.invoke().m17282a(histogramName)) {
            histogramCallTypeProvider.m17282a(histogramName);
            str2 = "Cold";
        } else {
            str2 = histogramCallTypeProvider.m17282a(histogramName) ? "Cool" : "Warm";
        }
        final String str3 = str == null ? str2 : str;
        HistogramRecordConfiguration configuration = this.f33703c;
        Intrinsics.m32179h(configuration, "configuration");
        int hashCode = str3.hashCode();
        if (hashCode == 2106116) {
            if (str3.equals("Cold")) {
                mo17291h = configuration.mo17291h();
            }
            int i2 = Assert.f33709a;
            mo17291h = false;
        } else if (hashCode != 2106217) {
            if (hashCode == 2688677 && str3.equals("Warm")) {
                mo17291h = configuration.mo17292i();
            }
            int i22 = Assert.f33709a;
            mo17291h = false;
        } else {
            if (str3.equals("Cool")) {
                mo17291h = configuration.mo17288d();
            }
            int i222 = Assert.f33709a;
            mo17291h = false;
        }
        if (mo17291h) {
            this.f33704d.get().mo17276a(new Function0<Unit>() { // from class: com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl$reportDuration$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Unit invoke() {
                    HistogramRecorder histogramRecorder = HistogramReporterDelegateImpl.this.f33701a.get();
                    String str4 = histogramName + '.' + str3;
                    long m32235b = RangesKt.m32235b(j2, 1L);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    histogramRecorder.f33687a.mo17281a(str4, timeUnit.toMillis(m32235b), 1L, 10000L, timeUnit, 50);
                    return Unit.f63088a;
                }
            });
        }
    }
}
