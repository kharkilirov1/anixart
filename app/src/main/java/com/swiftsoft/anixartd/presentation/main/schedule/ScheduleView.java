package com.swiftsoft.anixartd.presentation.main.schedule;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;

/* compiled from: ScheduleView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/schedule/ScheduleView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ScheduleView extends MvpView {
    /* renamed from: a */
    void mo15206a();

    /* renamed from: b */
    void mo15207b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo15208c();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: g */
    void mo15209g(long j2);
}
