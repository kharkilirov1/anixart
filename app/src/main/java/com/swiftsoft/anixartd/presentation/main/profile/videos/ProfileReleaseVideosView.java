package com.swiftsoft.anixartd.presentation.main.profile.videos;

import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseVideosView.kt */
@StateStrategyType(AddToEndStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/videos/ProfileReleaseVideosView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ProfileReleaseVideosView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: K */
    void mo14956K(@NotNull ReleaseVideo releaseVideo);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: U0 */
    void mo14957U0(@NotNull ReleaseVideo releaseVideo);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: V2 */
    void mo14958V2();

    /* renamed from: a */
    void mo14959a();

    /* renamed from: b */
    void mo14960b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14961c();

    /* renamed from: d */
    void mo14962d();

    /* renamed from: e */
    void mo14963e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: f */
    void mo14964f(long j2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: k3 */
    void mo14965k3(long j2, long j3);

    /* renamed from: l */
    void mo14966l();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: u0 */
    void mo14967u0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: w1 */
    void mo14968w1(long j2, long j3);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: x0 */
    void mo14969x0(@NotNull ReleaseVideo releaseVideo);
}
