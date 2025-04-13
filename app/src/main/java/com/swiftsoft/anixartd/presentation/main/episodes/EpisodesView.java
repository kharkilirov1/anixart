package com.swiftsoft.anixartd.presentation.main.episodes;

import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.database.entity.episode.Source;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EpisodesView.kt */
@StateStrategyType(AddToEndStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/episodes/EpisodesView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface EpisodesView extends MvpView {

    /* compiled from: EpisodesView.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: A1 */
    void mo14593A1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: G3 */
    void mo14594G3(@NotNull Episode episode, int i2, int i3);

    /* renamed from: H1 */
    void mo14595H1(@NotNull Type type);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: L3 */
    void mo14596L3(@NotNull Episode episode, @NotNull String str, @NotNull List<String> list, int i2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: N1 */
    void mo14597N1(@NotNull Episode episode, int i2, @NotNull List<String> list);

    /* renamed from: O */
    void mo14598O();

    /* renamed from: P2 */
    void mo14599P2(int i2, int i3);

    /* renamed from: R1 */
    void mo14600R1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: S3 */
    void mo14601S3(@NotNull List<String> list, @NotNull String str, @Nullable Long l2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: U1 */
    void mo14602U1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: Z3 */
    void mo14603Z3(@NotNull Episode episode);

    /* renamed from: a */
    void mo14604a();

    /* renamed from: b */
    void mo14605b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo14606c();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c3 */
    void mo14607c3(@NotNull Episode episode);

    /* renamed from: d3 */
    void mo14608d3();

    /* renamed from: f4 */
    void mo14609f4(@NotNull Source source);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: j4 */
    void mo14610j4(@NotNull List<Type> list);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: m */
    void mo14611m();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: n */
    void mo14612n();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void onDownloadEpisode();

    /* renamed from: p3 */
    void mo14613p3();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: r3 */
    void mo14614r3(@Nullable String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: s2 */
    void mo14615s2(@NotNull Episode episode);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: t2 */
    void mo14616t2(@NotNull Episode episode, int i2, boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: v2 */
    void mo14617v2(@NotNull String str, boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: y2 */
    void mo14618y2(@NotNull Episode episode);
}
