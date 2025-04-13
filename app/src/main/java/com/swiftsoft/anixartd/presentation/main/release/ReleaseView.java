package com.swiftsoft.anixartd.presentation.main.release;

import android.widget.ImageView;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseView.kt */
@StateStrategyType(AddToEndStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/ReleaseView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ReleaseView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: A */
    void mo15033A();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: B */
    void mo15034B();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: C3 */
    void mo15035C3(@NotNull Collection collection);

    /* renamed from: D */
    void mo15036D();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: F */
    void mo15037F();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: G */
    void mo15038G();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: I0 */
    void mo15039I0(long j2, long j3, @NotNull String str, @NotNull String str2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: I3 */
    void mo15040I3(@NotNull Release release);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: P0 */
    void mo15041P0(@NotNull String str, @NotNull ImageView imageView);

    /* renamed from: P3 */
    void mo15042P3();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: T2 */
    void mo15043T2();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: U */
    void mo15044U(@NotNull ReleaseComment releaseComment);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: W */
    void mo15045W(@NotNull ReleaseComment releaseComment, int i2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: X */
    void mo15046X(@NotNull ReleaseComment releaseComment);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: Y0 */
    void mo15047Y0(long j2);

    /* renamed from: Z1 */
    void mo15048Z1();

    /* renamed from: a */
    void mo15049a();

    /* renamed from: b */
    void mo15050b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo15051c();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c0 */
    void mo15052c0(@NotNull ReleaseComment releaseComment);

    /* renamed from: d */
    void mo15053d();

    /* renamed from: e */
    void mo15054e();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: e3 */
    void mo15055e3();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: f */
    void mo15056f(long j2);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: g */
    void mo15057g(long j2);

    /* renamed from: h */
    void mo15058h();

    /* renamed from: j */
    void mo15059j();

    /* renamed from: m */
    void mo15060m();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: m3 */
    void mo15061m3();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: n */
    void mo15062n();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: o */
    void mo15063o();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: p1 */
    void mo15064p1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: q1 */
    void mo15065q1(@NotNull Release release);

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: q2 */
    void mo15066q2();

    /* renamed from: s */
    void mo15067s();

    /* renamed from: s1 */
    void mo15068s1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: u1 */
    void mo15069u1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: w3 */
    void mo15070w3();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: x */
    void mo15071x();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: x3 */
    void mo15072x3(@NotNull Release release);

    /* renamed from: y1 */
    void mo15073y1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: z0 */
    void mo15074z0(@NotNull ReleaseComment releaseComment);

    /* renamed from: z1 */
    void mo15075z1();
}
