package com.yandex.div.histogram;

import com.yandex.div.core.annotations.PublicApi;
import javax.inject.Provider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: HistogramRecordConfiguration.kt */
@PublicApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface HistogramRecordConfiguration {
    /* renamed from: d */
    boolean mo17288d();

    /* renamed from: e */
    boolean mo17289e();

    @NotNull
    /* renamed from: g */
    Provider<RenderConfiguration> mo17290g();

    /* renamed from: h */
    boolean mo17291h();

    /* renamed from: i */
    boolean mo17292i();
}
