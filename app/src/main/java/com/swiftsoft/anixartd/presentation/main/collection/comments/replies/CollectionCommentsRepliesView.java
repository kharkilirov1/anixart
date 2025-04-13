package com.swiftsoft.anixartd.presentation.main.collection.comments.replies;

import com.swiftsoft.anixartd.database.entity.CollectionComment;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionCommentsRepliesView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/comments/replies/CollectionCommentsRepliesView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface CollectionCommentsRepliesView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: A */
    void mo14467A();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: B */
    void mo14468B();

    /* renamed from: D */
    void mo14469D();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: F */
    void mo14470F();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: G */
    void mo14471G();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: H */
    void mo14472H();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: L0 */
    void mo14473L0(@NotNull CollectionComment collectionComment);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: R0 */
    void mo14474R0(@NotNull CollectionComment collectionComment);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: R3 */
    void mo14475R3(@NotNull CollectionComment collectionComment);

    /* renamed from: a */
    void mo14476a();

    /* renamed from: b */
    void mo14477b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14478c();

    /* renamed from: d */
    void mo14479d();

    /* renamed from: d0 */
    void mo14480d0(long j2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: d1 */
    void mo14481d1(@NotNull CollectionComment collectionComment, int i2);

    /* renamed from: e */
    void mo14482e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: f */
    void mo14483f(long j2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: f0 */
    void mo14484f0(@NotNull CollectionComment collectionComment);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: l */
    void mo14485l();

    /* renamed from: m */
    void mo14486m();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: n */
    void mo14487n();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: o */
    void mo14488o();

    /* renamed from: p */
    void mo14489p();

    /* renamed from: q */
    void mo14490q();

    /* renamed from: s */
    void mo14491s();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: v0 */
    void mo14492v0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: x */
    void mo14493x();
}
