package com.swiftsoft.anixartd.presentation.main.profile.lists;

import com.swiftsoft.anixartd.database.entity.Release;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileListsTabView.kt */
@StateStrategyType(AddToEndStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/lists/ProfileListsTabView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ProfileListsTabView extends MvpView {
    /* renamed from: a */
    void mo14923a();

    /* renamed from: b */
    void mo14924b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: b4 */
    void mo14925b4(long j2, @NotNull String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14926c();

    /* renamed from: d */
    void mo14927d();

    /* renamed from: e */
    void mo14928e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: f */
    void mo14929f(long j2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i */
    void mo14930i(@NotNull Release release);

    /* renamed from: l */
    void mo14931l();
}
