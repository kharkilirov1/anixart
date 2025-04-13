package com.swiftsoft.anixartd.presentation.main.collection.list;

import com.swiftsoft.anixartd.database.entity.Collection;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionListView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/list/CollectionListView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface CollectionListView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: M */
    void mo14521M();

    /* renamed from: a */
    void mo14522a();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: a1 */
    void mo14523a1();

    /* renamed from: b */
    void mo14524b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14525c();

    /* renamed from: d */
    void mo14526d();

    /* renamed from: e */
    void mo14527e();

    /* renamed from: l */
    void mo14528l();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: m */
    void mo14529m();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: v */
    void mo14530v(@NotNull Collection collection);
}
