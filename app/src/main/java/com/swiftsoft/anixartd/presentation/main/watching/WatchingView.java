package com.swiftsoft.anixartd.presentation.main.watching;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;

/* compiled from: WatchingView.kt */
@StateStrategyType(AddToEndStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/watching/WatchingView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface WatchingView extends MvpView {
    /* renamed from: a */
    void mo15257a();

    /* renamed from: b */
    void mo15258b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo15259c();

    /* renamed from: d */
    void mo15260d();

    /* renamed from: e */
    void mo15261e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: g */
    void mo15262g(long j2);
}
