package com.swiftsoft.anixartd.presentation.player;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.Nullable;

/* compiled from: SwiftPlayerView.kt */
@StateStrategyType(AddToEndStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/player/SwiftPlayerView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface SwiftPlayerView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: S1 */
    void mo15267S1();

    /* renamed from: a */
    void mo15268a();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: a4 */
    void mo15269a4();

    /* renamed from: b */
    void mo15270b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: h4 */
    void mo15271h4();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: l1 */
    void mo15272l1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: l2 */
    void mo15273l2(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, long j2, boolean z, boolean z2);
}
