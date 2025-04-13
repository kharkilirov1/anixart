package com.swiftsoft.anixartd.presentation.main.report;

import com.swiftsoft.anixartd.database.entity.ReportReason;
import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReportView.kt */
@StateStrategyType(AddToEndStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/report/ReportView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ReportView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: B2 */
    void mo15192B2();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: F3 */
    void mo15193F3();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: J1 */
    void mo15194J1();

    /* renamed from: a */
    void mo15195a();

    /* renamed from: b */
    void mo15196b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo15197c();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: n */
    void mo15198n();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: n2 */
    void mo15199n2();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: o2 */
    void mo15200o2(@NotNull List<ReportReason> list);

    /* renamed from: p */
    void mo15201p();

    /* renamed from: q */
    void mo15202q();
}
