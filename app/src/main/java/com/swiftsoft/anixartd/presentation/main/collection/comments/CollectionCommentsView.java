package com.swiftsoft.anixartd.presentation.main.collection.comments;

import com.swiftsoft.anixartd.database.entity.CollectionComment;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionCommentsView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/comments/CollectionCommentsView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface CollectionCommentsView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: A */
    void mo14431A();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: B */
    void mo14432B();

    /* renamed from: D */
    void mo14433D();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: F */
    void mo14434F();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: G */
    void mo14435G();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: H */
    void mo14436H();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: L0 */
    void mo14437L0(@NotNull CollectionComment collectionComment);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: O2 */
    void mo14438O2(@NotNull CollectionComment collectionComment);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: R0 */
    void mo14439R0(@NotNull CollectionComment collectionComment);

    /* renamed from: a */
    void mo14440a();

    /* renamed from: b */
    void mo14441b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14442c();

    /* renamed from: d */
    void mo14443d();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: d1 */
    void mo14444d1(@NotNull CollectionComment collectionComment, int i2);

    /* renamed from: e */
    void mo14445e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: f */
    void mo14446f(long j2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: f0 */
    void mo14447f0(@NotNull CollectionComment collectionComment);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: l */
    void mo14448l();

    /* renamed from: m */
    void mo14449m();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: n */
    void mo14450n();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: o */
    void mo14451o();

    /* renamed from: p */
    void mo14452p();

    /* renamed from: q */
    void mo14453q();

    /* renamed from: s */
    void mo14454s();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: x */
    void mo14455x();
}
