package com.swiftsoft.anixartd.presentation.main.profile;

import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileView.kt */
@StateStrategyType(AddToEndStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ProfileView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: A0 */
    void mo14841A0();

    /* renamed from: D1 */
    void mo14842D1(@NotNull Profile profile, boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: F2 */
    void mo14843F2();

    /* renamed from: G1 */
    void mo14844G1(boolean z, boolean z2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: G2 */
    void mo14845G2();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: H2 */
    void mo14846H2();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: T3 */
    void mo14847T3();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: X3 */
    void mo14848X3();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: Y2 */
    void mo14849Y2();

    /* renamed from: a */
    void mo14850a();

    /* renamed from: b */
    void mo14851b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14852c();

    /* renamed from: d */
    void mo14853d();

    /* renamed from: e */
    void mo14854e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: g3 */
    void mo14855g3();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i */
    void mo14856i(@NotNull Release release);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: l4 */
    void mo14857l4();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: t3 */
    void mo14858t3(int i2, int i3);
}
