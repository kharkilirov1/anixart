package com.yandex.div.histogram;

import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: HistogramConfiguration.kt */
@PublicApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/histogram/HistogramConfiguration;", "Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "Companion", "DefaultHistogramConfiguration", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface HistogramConfiguration extends HistogramRecordConfiguration {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final HistogramConfiguration f33674a = new DefaultHistogramConfiguration();

    /* compiled from: HistogramConfiguration.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/histogram/HistogramConfiguration$Companion;", "", "Lcom/yandex/div/histogram/HistogramConfiguration;", "DEFAULT", "Lcom/yandex/div/histogram/HistogramConfiguration;", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: HistogramConfiguration.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/histogram/HistogramConfiguration$DefaultHistogramConfiguration;", "Lcom/yandex/div/histogram/HistogramConfiguration;", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class DefaultHistogramConfiguration implements HistogramConfiguration {

        /* renamed from: b */
        @NotNull
        public final Provider<HistogramBridge> f33675b = new DoubleCheckProvider(C2895xff39cbd7.f33680d);

        /* renamed from: c */
        @NotNull
        public final Provider<CpuUsageHistogramReporter> f33676c = new DoubleCheckProvider(new Function0<CpuUsageHistogramReporter>() { // from class: com.yandex.div.histogram.HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1
            @Override // kotlin.jvm.functions.Function0
            public CpuUsageHistogramReporter invoke() {
                return new CpuUsageHistogramReporter.NoOp();
            }
        });

        /* renamed from: d */
        @NotNull
        public final Provider<TaskExecutor> f33677d = new DoubleCheckProvider(C2897xf4af9b79.f33682d);

        /* renamed from: e */
        @NotNull
        public final Provider<RenderConfiguration> f33678e = new DoubleCheckProvider(C2896xd0fa058a.f33681i);

        @Override // com.yandex.div.histogram.HistogramConfiguration
        /* renamed from: a */
        public boolean mo17284a() {
            return false;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        /* renamed from: b */
        public Provider<CpuUsageHistogramReporter> mo17285b() {
            return this.f33676c;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        /* renamed from: c */
        public Provider<HistogramBridge> mo17286c() {
            return this.f33675b;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        /* renamed from: d */
        public boolean mo17288d() {
            return false;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        /* renamed from: e */
        public boolean mo17289e() {
            return false;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        /* renamed from: f */
        public Provider<TaskExecutor> mo17287f() {
            return this.f33677d;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        @NotNull
        /* renamed from: g */
        public Provider<RenderConfiguration> mo17290g() {
            return this.f33678e;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        /* renamed from: h */
        public boolean mo17291h() {
            return false;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        /* renamed from: i */
        public boolean mo17292i() {
            return false;
        }
    }

    /* renamed from: a */
    boolean mo17284a();

    @NotNull
    /* renamed from: b */
    Provider<CpuUsageHistogramReporter> mo17285b();

    @NotNull
    /* renamed from: c */
    Provider<HistogramBridge> mo17286c();

    @NotNull
    /* renamed from: f */
    Provider<TaskExecutor> mo17287f();
}
