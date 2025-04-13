package com.swiftsoft.anixartd.presentation.main.bookmarks;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: BookmarksTabView.kt */
@StateStrategyType(AddToEndStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/bookmarks/BookmarksTabView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface BookmarksTabView extends MvpView {
    /* renamed from: a */
    void mo14366a();

    /* renamed from: b */
    void mo14367b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14368c();

    /* renamed from: d */
    void mo14369d();

    /* renamed from: e */
    void mo14370e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i */
    void mo14371i(@NotNull Release release);

    /* renamed from: l */
    void mo14372l();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: p2 */
    void mo14373p2(@NotNull String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: v */
    void mo14374v(@NotNull Collection collection);
}
