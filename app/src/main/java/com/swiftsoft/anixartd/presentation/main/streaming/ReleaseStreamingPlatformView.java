package com.swiftsoft.anixartd.presentation.main.streaming;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseStreamingPlatformView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/streaming/ReleaseStreamingPlatformView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ReleaseStreamingPlatformView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: K0 */
    void mo15235K0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: T0 */
    void mo15236T0(@NotNull String str);

    /* renamed from: a */
    void mo15237a();

    /* renamed from: b */
    void mo15238b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo15239c();
}
