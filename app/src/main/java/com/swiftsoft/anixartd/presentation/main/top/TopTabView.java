package com.swiftsoft.anixartd.presentation.main.top;

import com.swiftsoft.anixartd.database.entity.Release;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: TopTabView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/top/TopTabView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface TopTabView extends MvpView {
    /* renamed from: K3 */
    void mo15243K3();

    /* renamed from: a */
    void mo15244a();

    /* renamed from: b */
    void mo15245b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo15246c();

    /* renamed from: d */
    void mo15247d();

    /* renamed from: e */
    void mo15248e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i */
    void mo15249i(@NotNull Release release);
}
