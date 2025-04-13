package com.swiftsoft.anixartd.presentation.main.preference;

import com.swiftsoft.anixartd.database.entity.Release;
import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: DataPreferenceView.kt */
@StateStrategyType(AddToEndStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/preference/DataPreferenceView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface DataPreferenceView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: R2 */
    void mo14748R2();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: i2 */
    void mo14749i2();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: j2 */
    void mo14750j2(int i2, @NotNull List<Integer> list, @NotNull List<Integer> list2, @NotNull List<Release> list3);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: m1 */
    void mo14751m1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: r1 */
    void mo14752r1();
}
