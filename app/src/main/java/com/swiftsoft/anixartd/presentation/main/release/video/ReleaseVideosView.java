package com.swiftsoft.anixartd.presentation.main.release.video;

import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseVideosView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/video/ReleaseVideosView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ReleaseVideosView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: K */
    void mo15160K(@NotNull ReleaseVideo releaseVideo);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: K1 */
    void mo15161K1(boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: T0 */
    void mo15162T0(@NotNull String str);

    /* renamed from: a */
    void mo15163a();

    /* renamed from: b */
    void mo15164b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo15165c();

    /* renamed from: d */
    void mo15166d();

    /* renamed from: e */
    void mo15167e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: x1 */
    void mo15168x1(@NotNull ReleaseVideoCategory releaseVideoCategory);
}
