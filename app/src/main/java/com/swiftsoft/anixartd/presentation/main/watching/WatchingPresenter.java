package com.swiftsoft.anixartd.presentation.main.watching;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.watching.WatchingUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.watching.WatchingUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.search.C2622b;
import com.swiftsoft.anixartd.repository.DiscoverRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import com.swiftsoft.anixartd.utils.OnFailed;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: WatchingPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/watching/WatchingPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/watching/WatchingView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class WatchingPresenter extends MvpPresenter<WatchingView> {

    /* renamed from: a */
    @NotNull
    public DiscoverRepository f27284a;

    /* renamed from: b */
    @NotNull
    public Prefs f27285b;

    /* renamed from: c */
    @NotNull
    public Listener f27286c;

    /* renamed from: d */
    @NotNull
    public WatchingUiLogic f27287d;

    /* renamed from: e */
    @NotNull
    public WatchingUiController f27288e;

    /* compiled from: WatchingPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/watching/WatchingPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/watching/WatchingUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends WatchingUiController.Listener {
    }

    @Inject
    public WatchingPresenter(@NotNull DiscoverRepository discoverRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(discoverRepository, "discoverRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27284a = discoverRepository;
        this.f27285b = prefs;
        this.f27286c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.watching.WatchingPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: g */
            public void mo14364g(long j2) {
                Object obj;
                Iterator<T> it = WatchingPresenter.this.f27287d.f29371c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Release) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release = (Release) obj;
                if (release != null) {
                    WatchingPresenter.this.getViewState().mo15262g(release.getId());
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: k */
            public void mo14365k(long j2) {
                Object obj;
                Iterator<T> it = WatchingPresenter.this.f27287d.f29371c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Release) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release = (Release) obj;
                if (release != null) {
                    EventBusKt.m16327a(new OnBottomSheet(release));
                }
            }
        };
        this.f27287d = new WatchingUiLogic();
        this.f27288e = new WatchingUiController();
    }

    /* renamed from: a */
    public final void m15255a() {
        WatchingUiLogic watchingUiLogic = this.f27287d;
        if (watchingUiLogic.f28956a) {
            watchingUiLogic.f29370b = 0;
            watchingUiLogic.f29372d = 0L;
            watchingUiLogic.f29371c.clear();
            m15256b(false, true);
        }
    }

    /* renamed from: b */
    public final void m15256b(final boolean z, final boolean z2) {
        this.f27284a.m15289b(this.f27287d.f29370b).m31367i(new C2622b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.watching.WatchingPresenter$onWatching$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo15258b();
                }
                if (z2) {
                    this.getViewState().mo15260d();
                }
                return Unit.f63088a;
            }
        }, 13)).m31368j(new C2553a(z, this, z2, 20)).m31370l(new C2622b(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.watching.WatchingPresenter$onWatching$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Release> pageableResponse) {
                PageableResponse<Release> pageableResponse2 = pageableResponse;
                WatchingUiLogic watchingUiLogic = WatchingPresenter.this.f27287d;
                List<Release> watchingReleases = pageableResponse2.getContent();
                long totalCount = pageableResponse2.getTotalCount();
                Objects.requireNonNull(watchingUiLogic);
                Intrinsics.m32179h(watchingReleases, "watchingReleases");
                boolean z3 = watchingUiLogic.f29373e;
                if (z3) {
                    watchingUiLogic.f29371c.addAll(watchingReleases);
                    watchingUiLogic.f29372d = totalCount;
                } else {
                    if (z3) {
                        watchingUiLogic.f29371c.clear();
                    }
                    watchingUiLogic.f29371c.addAll(watchingReleases);
                    watchingUiLogic.f29372d = totalCount;
                    watchingUiLogic.f29373e = true;
                }
                WatchingPresenter watchingPresenter = WatchingPresenter.this;
                WatchingUiController watchingUiController = watchingPresenter.f27288e;
                Integer valueOf = Integer.valueOf(watchingPresenter.f27285b.m14081x());
                WatchingUiLogic watchingUiLogic2 = WatchingPresenter.this.f27287d;
                watchingUiController.setData(valueOf, watchingUiLogic2.f29371c, Long.valueOf(watchingUiLogic2.f29372d), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), WatchingPresenter.this.f27286c);
                return Unit.f63088a;
            }
        }, 14), new C2622b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.watching.WatchingPresenter$onWatching$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (WatchingPresenter.this.f27288e.isEmpty()) {
                    WatchingPresenter.this.getViewState().mo15259c();
                } else {
                    EventBusKt.m16327a(new OnFailed());
                }
                return Unit.f63088a;
            }
        }, 15), Functions.f59621b, Functions.f59622c);
    }
}
