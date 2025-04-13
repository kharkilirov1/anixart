package com.swiftsoft.anixartd.presentation.main.home;

import com.swiftsoft.anixartd.database.entity.Release;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HomeTabView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/home/HomeTabView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface HomeTabView extends MvpView {

    /* compiled from: HomeTabView.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: L1 */
    void mo14680L1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: T */
    void mo14681T();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: V */
    void mo14682V();

    /* renamed from: a */
    void mo14683a();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: a0 */
    void mo14684a0(@NotNull String str);

    /* renamed from: b */
    void mo14685b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c1 */
    void mo14686c1(@Nullable String str);

    /* renamed from: d */
    void mo14687d();

    /* renamed from: e */
    void mo14688e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i */
    void mo14689i(@NotNull Release release);
}
