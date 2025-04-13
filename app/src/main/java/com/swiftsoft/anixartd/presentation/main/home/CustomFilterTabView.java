package com.swiftsoft.anixartd.presentation.main.home;

import com.swiftsoft.anixartd.database.entity.Release;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomFilterTabView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/home/CustomFilterTabView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface CustomFilterTabView extends MvpView {

    /* compiled from: CustomFilterTabView.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: E3 */
    void mo14662E3();

    /* renamed from: H3 */
    void mo14663H3();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: J0 */
    void mo14664J0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: T */
    void mo14665T();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: V */
    void mo14666V();

    /* renamed from: a */
    void mo14667a();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: a0 */
    void mo14668a0(@NotNull String str);

    /* renamed from: b */
    void mo14669b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c1 */
    void mo14670c1(@Nullable String str);

    /* renamed from: d */
    void mo14671d();

    /* renamed from: e */
    void mo14672e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i */
    void mo14673i(@NotNull Release release);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: l0 */
    void mo14674l0();
}
