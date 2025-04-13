package com.swiftsoft.anixartd.presentation.main.recommendation;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;

/* compiled from: RecommendationView.kt */
@StateStrategyType(AddToEndStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/recommendation/RecommendationView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface RecommendationView extends MvpView {
    /* renamed from: a */
    void mo14997a();

    /* renamed from: b */
    void mo14998b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14999c();

    /* renamed from: d */
    void mo15000d();

    /* renamed from: e */
    void mo15001e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: g */
    void mo15002g(long j2);
}
