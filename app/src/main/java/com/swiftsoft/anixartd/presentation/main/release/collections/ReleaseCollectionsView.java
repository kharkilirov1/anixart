package com.swiftsoft.anixartd.presentation.main.release.collections;

import com.swiftsoft.anixartd.database.entity.Collection;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseCollectionsView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/collections/ReleaseCollectionsView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ReleaseCollectionsView extends MvpView {
    /* renamed from: a */
    void mo15079a();

    /* renamed from: b */
    void mo15080b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo15081c();

    /* renamed from: d */
    void mo15082d();

    /* renamed from: e */
    void mo15083e();

    /* renamed from: l */
    void mo15084l();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: v */
    void mo15085v(@NotNull Collection collection);
}
