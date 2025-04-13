package com.swiftsoft.anixartd.presentation.main.release.video.category;

import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseVideoCategoryView.kt */
@StateStrategyType(AddToEndSingleTagStrategy.class)
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/video/category/ReleaseVideoCategoryView;", "Lmoxy/MvpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface ReleaseVideoCategoryView extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: K */
    void mo15184K(@NotNull ReleaseVideo releaseVideo);

    /* renamed from: a */
    void mo15185a();

    /* renamed from: b */
    void mo15186b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    /* renamed from: c */
    void mo15187c();

    /* renamed from: d */
    void mo15188d();

    /* renamed from: e */
    void mo15189e();
}
