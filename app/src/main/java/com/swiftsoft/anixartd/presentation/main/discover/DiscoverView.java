package com.swiftsoft.anixartd.presentation.main.discover;

import com.swiftsoft.anixartd.database.entity.Release;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: DiscoverView.kt */
@StateStrategyType(AddToEndStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/discover/DiscoverView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface DiscoverView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: I1 */
    void mo14553I1(long j2);

    /* renamed from: J2 */
    void mo14554J2(int i2, int i3, int i4, int i5, int i6, int i7);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: M2 */
    void mo14555M2(long j2);

    /* renamed from: a */
    void mo14556a();

    /* renamed from: b */
    void mo14557b();

    /* renamed from: c */
    void mo14558c();

    /* renamed from: d */
    void mo14559d();

    /* renamed from: e */
    void mo14560e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: f */
    void mo14561f(long j2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i */
    void mo14562i(@NotNull Release release);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: q0 */
    void mo14563q0(long j2, int i2, @NotNull String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: r2 */
    void mo14564r2(long j2);
}
