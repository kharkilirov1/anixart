package com.swiftsoft.anixartd.presentation.main.release.comments;

import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseCommentsView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/comments/ReleaseCommentsView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ReleaseCommentsView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: A */
    void mo15094A();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: B */
    void mo15095B();

    /* renamed from: D */
    void mo15096D();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: F */
    void mo15097F();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: G */
    void mo15098G();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: H */
    void mo15099H();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: U */
    void mo15100U(@NotNull ReleaseComment releaseComment);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: W */
    void mo15101W(@NotNull ReleaseComment releaseComment, int i2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: X */
    void mo15102X(@NotNull ReleaseComment releaseComment);

    /* renamed from: a */
    void mo15103a();

    /* renamed from: b */
    void mo15104b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo15105c();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c0 */
    void mo15106c0(@NotNull ReleaseComment releaseComment);

    /* renamed from: d */
    void mo15107d();

    /* renamed from: e */
    void mo15108e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: f */
    void mo15109f(long j2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: l */
    void mo15110l();

    /* renamed from: m */
    void mo15111m();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: n */
    void mo15112n();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: o */
    void mo15113o();

    /* renamed from: p */
    void mo15114p();

    /* renamed from: q */
    void mo15115q();

    /* renamed from: s */
    void mo15116s();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: x */
    void mo15117x();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: z0 */
    void mo15118z0(@NotNull ReleaseComment releaseComment);
}
