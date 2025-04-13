package com.swiftsoft.anixartd.presentation.main.search;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SearchView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/search/SearchView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface SearchView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: C2 */
    void mo15221C2(@NotNull String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: O */
    void mo15222O();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: Q2 */
    void mo15223Q2(long j2, @NotNull String str, @Nullable String str2, @NotNull String str3);

    /* renamed from: a */
    void mo15224a();

    /* renamed from: b */
    void mo15225b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo15226c();

    /* renamed from: d */
    void mo15227d();

    /* renamed from: e */
    void mo15228e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i */
    void mo15229i(@NotNull Release release);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: j3 */
    void mo15230j3(@NotNull Profile profile);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: v */
    void mo15231v(@NotNull Collection collection);
}
