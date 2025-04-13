package com.swiftsoft.anixartd.presentation.main.streaming;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseStreamingPlatform;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.streaming.ReleaseStreamingPlatformUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.streaming.ReleaseStreamingPlatformUiLogic;
import com.swiftsoft.anixartd.presentation.main.episodes.C2568b;
import com.swiftsoft.anixartd.presentation.main.search.C2622b;
import com.swiftsoft.anixartd.repository.ReleaseStreamingPlatformRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
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

/* compiled from: ReleaseStreamingPlatformPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/streaming/ReleaseStreamingPlatformPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/streaming/ReleaseStreamingPlatformView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseStreamingPlatformPresenter extends MvpPresenter<ReleaseStreamingPlatformView> {

    /* renamed from: a */
    @NotNull
    public ReleaseStreamingPlatformRepository f27245a;

    /* renamed from: b */
    @NotNull
    public Prefs f27246b;

    /* renamed from: c */
    @NotNull
    public Listener f27247c;

    /* renamed from: d */
    @NotNull
    public ReleaseStreamingPlatformUiLogic f27248d;

    /* renamed from: e */
    @NotNull
    public ReleaseStreamingPlatformUiController f27249e;

    /* compiled from: ReleaseStreamingPlatformPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/streaming/ReleaseStreamingPlatformPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/streaming/ReleaseStreamingPlatformUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseStreamingPlatformUiController.Listener {
    }

    @Inject
    public ReleaseStreamingPlatformPresenter(@NotNull ReleaseStreamingPlatformRepository releaseStreamingPlatformRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(releaseStreamingPlatformRepository, "releaseStreamingPlatformRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27245a = releaseStreamingPlatformRepository;
        this.f27246b = prefs;
        this.f27247c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.streaming.ReleaseThirdPartyPlatformModel.Listener
            /* renamed from: K0 */
            public void mo15233K0() {
                ReleaseStreamingPlatformPresenter.this.getViewState().mo15235K0();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.streaming.ReleaseStreamingPlatformModel.Listener
            /* renamed from: a */
            public void mo15234a(long j2) {
                Object obj;
                Iterator<T> it = ReleaseStreamingPlatformPresenter.this.f27248d.f29362d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseStreamingPlatform) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseStreamingPlatform releaseStreamingPlatform = (ReleaseStreamingPlatform) obj;
                if (releaseStreamingPlatform != null) {
                    ReleaseStreamingPlatformPresenter.this.getViewState().mo15236T0(releaseStreamingPlatform.getUrl());
                }
            }
        };
        this.f27248d = new ReleaseStreamingPlatformUiLogic();
        this.f27249e = new ReleaseStreamingPlatformUiController();
    }

    /* renamed from: a */
    public static void m15232a(final ReleaseStreamingPlatformPresenter releaseStreamingPlatformPresenter, final boolean z, int i2) {
        if ((i2 & 1) != 0) {
            z = releaseStreamingPlatformPresenter.f27249e.isEmpty();
        }
        ReleaseStreamingPlatformRepository releaseStreamingPlatformRepository = releaseStreamingPlatformPresenter.f27245a;
        releaseStreamingPlatformRepository.f27384a.releaseStreamingPlatform(releaseStreamingPlatformPresenter.f27248d.f29360b).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2622b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformPresenter$onStreamingPlatform$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    releaseStreamingPlatformPresenter.getViewState().mo15238b();
                }
                return Unit.f63088a;
            }
        }, 2)).m31368j(new C2568b(z, releaseStreamingPlatformPresenter, 2)).m31370l(new C2622b(new Function1<PageableResponse<ReleaseStreamingPlatform>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformPresenter$onStreamingPlatform$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<ReleaseStreamingPlatform> pageableResponse) {
                PageableResponse<ReleaseStreamingPlatform> pageableResponse2 = pageableResponse;
                ReleaseStreamingPlatformUiLogic releaseStreamingPlatformUiLogic = ReleaseStreamingPlatformPresenter.this.f27248d;
                List<ReleaseStreamingPlatform> releaseStreamingPlatforms = pageableResponse2.getContent();
                long totalCount = pageableResponse2.getTotalCount();
                Objects.requireNonNull(releaseStreamingPlatformUiLogic);
                Intrinsics.m32179h(releaseStreamingPlatforms, "releaseStreamingPlatforms");
                boolean z2 = releaseStreamingPlatformUiLogic.f29364f;
                if (z2) {
                    releaseStreamingPlatformUiLogic.f29362d.addAll(releaseStreamingPlatforms);
                    releaseStreamingPlatformUiLogic.f29363e = totalCount;
                } else {
                    if (z2) {
                        releaseStreamingPlatformUiLogic.f29362d.clear();
                    }
                    releaseStreamingPlatformUiLogic.f29362d.addAll(releaseStreamingPlatforms);
                    releaseStreamingPlatformUiLogic.f29363e = totalCount;
                    releaseStreamingPlatformUiLogic.f29364f = true;
                }
                ReleaseStreamingPlatformPresenter releaseStreamingPlatformPresenter2 = ReleaseStreamingPlatformPresenter.this;
                ReleaseStreamingPlatformUiController releaseStreamingPlatformUiController = releaseStreamingPlatformPresenter2.f27249e;
                Release release = releaseStreamingPlatformPresenter2.f27248d.f29361c;
                if (release == null) {
                    Intrinsics.m32189r("release");
                    throw null;
                }
                Long valueOf = Long.valueOf(release.getId());
                ReleaseStreamingPlatformUiLogic releaseStreamingPlatformUiLogic2 = ReleaseStreamingPlatformPresenter.this.f27248d;
                List<ReleaseStreamingPlatform> list = releaseStreamingPlatformUiLogic2.f29362d;
                Release release2 = releaseStreamingPlatformUiLogic2.f29361c;
                if (release2 != null) {
                    releaseStreamingPlatformUiController.setData(valueOf, list, Boolean.valueOf(release2.getIsThirdPartyPlatformsDisabled()), Long.valueOf(ReleaseStreamingPlatformPresenter.this.f27248d.f29363e), ReleaseStreamingPlatformPresenter.this.f27247c);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("release");
                throw null;
            }
        }, 3), new C2622b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.streaming.ReleaseStreamingPlatformPresenter$onStreamingPlatform$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleaseStreamingPlatformPresenter.this.getViewState().mo15239c();
                return Unit.f63088a;
            }
        }, 4), Functions.f59621b, Functions.f59622c);
    }
}
