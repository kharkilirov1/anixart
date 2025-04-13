package com.swiftsoft.anixartd.presentation.main.collection;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/CollectionView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface CollectionView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: D0 */
    void mo14391D0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: E0 */
    void mo14392E0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: N3 */
    void mo14393N3();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: Q0 */
    void mo14394Q0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: T1 */
    void mo14395T1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: W0 */
    void mo14396W0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: Y */
    void mo14397Y();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: Y3 */
    void mo14398Y3(@NotNull Collection collection);

    /* renamed from: a */
    void mo14399a();

    /* renamed from: b */
    void mo14400b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14401c();

    /* renamed from: d */
    void mo14402d();

    /* renamed from: e */
    void mo14403e();

    /* renamed from: h */
    void mo14404h();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i */
    void mo14405i(@NotNull Release release);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i0 */
    void mo14406i0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i3 */
    void mo14407i3();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i4 */
    void mo14408i4();

    /* renamed from: j */
    void mo14409j();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: j0 */
    void mo14410j0();

    /* renamed from: m */
    void mo14411m();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: n */
    void mo14412n();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: p0 */
    void mo14413p0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: s3 */
    void mo14414s3();
}
