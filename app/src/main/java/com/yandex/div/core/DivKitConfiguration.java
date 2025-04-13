package com.yandex.div.core;

import com.yandex.android.beacon.SendBeaconConfiguration;
import com.yandex.div.histogram.HistogramConfiguration;
import dagger.Module;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivKitConfiguration.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/DivKitConfiguration;", "", "Builder", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@Module
/* loaded from: classes2.dex */
public final class DivKitConfiguration {

    /* renamed from: a */
    @Nullable
    public final Provider<SendBeaconConfiguration> f30962a = null;

    /* renamed from: b */
    @NotNull
    public final ExecutorService f30963b;

    /* renamed from: c */
    @NotNull
    public final Provider<HistogramConfiguration> f30964c;

    /* compiled from: DivKitConfiguration.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/DivKitConfiguration$Builder;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Builder {
    }

    public DivKitConfiguration(Provider provider, ExecutorService executorService, Provider provider2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f30963b = executorService;
        this.f30964c = provider2;
    }
}
