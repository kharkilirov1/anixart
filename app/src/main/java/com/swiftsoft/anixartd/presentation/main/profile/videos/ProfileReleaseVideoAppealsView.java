package com.swiftsoft.anixartd.presentation.main.profile.videos;

import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseVideoAppealsView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/videos/ProfileReleaseVideoAppealsView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ProfileReleaseVideoAppealsView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: K */
    void mo14937K(@NotNull ReleaseVideo releaseVideo);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: U0 */
    void mo14938U0(@NotNull ReleaseVideo releaseVideo);

    /* renamed from: a */
    void mo14939a();

    /* renamed from: b */
    void mo14940b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14941c();

    /* renamed from: d */
    void mo14942d();

    /* renamed from: e */
    void mo14943e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: u0 */
    void mo14944u0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: x0 */
    void mo14945x0(@NotNull ReleaseVideo releaseVideo);
}
