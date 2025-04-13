package com.swiftsoft.anixartd.presentation.main.release.comments.replies;

import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseCommentsRepliesView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/comments/replies/ReleaseCommentsRepliesView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ReleaseCommentsRepliesView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: A */
    void mo15127A();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: B */
    void mo15128B();

    /* renamed from: D */
    void mo15129D();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: F */
    void mo15130F();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: G */
    void mo15131G();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: H */
    void mo15132H();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: K2 */
    void mo15133K2(@NotNull ReleaseComment releaseComment);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: U */
    void mo15134U(@NotNull ReleaseComment releaseComment);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: W */
    void mo15135W(@NotNull ReleaseComment releaseComment, int i2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: X */
    void mo15136X(@NotNull ReleaseComment releaseComment);

    /* renamed from: a */
    void mo15137a();

    /* renamed from: b */
    void mo15138b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo15139c();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c0 */
    void mo15140c0(@NotNull ReleaseComment releaseComment);

    /* renamed from: d */
    void mo15141d();

    /* renamed from: e */
    void mo15142e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: f */
    void mo15143f(long j2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: g */
    void mo15144g(long j2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: l */
    void mo15145l();

    /* renamed from: m */
    void mo15146m();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: n */
    void mo15147n();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: o */
    void mo15148o();

    /* renamed from: p */
    void mo15149p();

    /* renamed from: q */
    void mo15150q();

    /* renamed from: s */
    void mo15151s();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: v0 */
    void mo15152v0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: x */
    void mo15153x();
}
