package com.swiftsoft.anixartd.presentation.main.profile.vote;

import com.swiftsoft.anixartd.database.entity.Release;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseVoteView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/vote/ProfileReleaseVoteView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ProfileReleaseVoteView extends MvpView {
    /* renamed from: a */
    void mo14987a();

    /* renamed from: b */
    void mo14988b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14989c();

    /* renamed from: d */
    void mo14990d();

    /* renamed from: e */
    void mo14991e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: h0 */
    void mo14992h0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i */
    void mo14993i(@NotNull Release release);

    /* renamed from: l */
    void mo14994l();
}
