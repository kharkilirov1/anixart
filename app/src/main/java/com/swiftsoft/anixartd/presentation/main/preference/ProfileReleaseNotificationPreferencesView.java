package com.swiftsoft.anixartd.presentation.main.preference;

import com.swiftsoft.anixartd.database.entity.Release;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseNotificationPreferencesView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/preference/ProfileReleaseNotificationPreferencesView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ProfileReleaseNotificationPreferencesView extends MvpView {
    /* renamed from: a */
    void mo14761a();

    /* renamed from: b */
    void mo14762b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14763c();

    /* renamed from: d */
    void mo14764d();

    /* renamed from: e */
    void mo14765e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: e1 */
    void mo14766e1(long j2);

    /* renamed from: h */
    void mo14767h();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i */
    void mo14768i(@NotNull Release release);

    /* renamed from: j */
    void mo14769j();
}
