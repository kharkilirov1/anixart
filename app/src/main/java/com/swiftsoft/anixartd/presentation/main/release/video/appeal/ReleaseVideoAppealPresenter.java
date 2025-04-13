package com.swiftsoft.anixartd.presentation.main.release.video.appeal;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import com.swiftsoft.anixartd.network.request.release.video.ReleaseVideoAppealRequest;
import com.swiftsoft.anixartd.network.response.release.video.appeal.ReleaseVideoAppealResponse;
import com.swiftsoft.anixartd.network.response.release.video.appeal.ReleaseVideoCategoriesResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.release.ReleaseVideosUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.release.video.appeal.ReleaseVideoAppealUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.episodes.C2568b;
import com.swiftsoft.anixartd.presentation.main.release.video.C2619b;
import com.swiftsoft.anixartd.repository.ReleaseVideoAppealRepository;
import com.swiftsoft.anixartd.repository.ReleaseVideoRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
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

/* compiled from: ReleaseVideoAppealPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/video/appeal/ReleaseVideoAppealPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/release/video/appeal/ReleaseVideoAppealView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseVideoAppealPresenter extends MvpPresenter<ReleaseVideoAppealView> {

    /* renamed from: a */
    @NotNull
    public ReleaseVideoRepository f27151a;

    /* renamed from: b */
    @NotNull
    public ReleaseVideoAppealRepository f27152b;

    /* renamed from: c */
    @NotNull
    public ReleaseVideoAppealUiLogic f27153c;

    /* compiled from: ReleaseVideoAppealPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/video/appeal/ReleaseVideoAppealPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideosUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseVideosUiController.Listener {
    }

    @Inject
    public ReleaseVideoAppealPresenter(@NotNull ReleaseVideoRepository releaseVideoRepository, @NotNull ReleaseVideoAppealRepository releaseVideoAppealRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(releaseVideoRepository, "releaseVideoRepository");
        Intrinsics.m32179h(releaseVideoAppealRepository, "releaseVideoAppealRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27151a = releaseVideoRepository;
        this.f27152b = releaseVideoAppealRepository;
        this.f27153c = new ReleaseVideoAppealUiLogic();
    }

    /* renamed from: b */
    public static void m15169b(final ReleaseVideoAppealPresenter releaseVideoAppealPresenter, final boolean z, int i2) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        releaseVideoAppealPresenter.f27151a.f27387a.categories().m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2619b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealPresenter$onCategories$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    releaseVideoAppealPresenter.getViewState().mo15176b();
                }
                return Unit.f63088a;
            }
        }, 4)).m31368j(new C2568b(z, releaseVideoAppealPresenter, 1)).m31370l(new C2619b(new Function1<ReleaseVideoCategoriesResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealPresenter$onCategories$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseVideoCategoriesResponse releaseVideoCategoriesResponse) {
                ReleaseVideoCategoriesResponse releaseVideoCategoriesResponse2 = releaseVideoCategoriesResponse;
                if (releaseVideoCategoriesResponse2.isSuccess()) {
                    ReleaseVideoAppealUiLogic releaseVideoAppealUiLogic = ReleaseVideoAppealPresenter.this.f27153c;
                    List<ReleaseVideoCategory> categories = releaseVideoCategoriesResponse2.getCategories();
                    Objects.requireNonNull(releaseVideoAppealUiLogic);
                    Intrinsics.m32179h(categories, "categories");
                    if (releaseVideoAppealUiLogic.f29323d) {
                        releaseVideoAppealUiLogic.f29322c.clear();
                    }
                    releaseVideoAppealUiLogic.f29322c.addAll(categories);
                    releaseVideoAppealUiLogic.f29323d = true;
                    ReleaseVideoAppealPresenter.this.getViewState().mo15174V1();
                }
                return Unit.f63088a;
            }
        }, 5), new C2619b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealPresenter$onCategories$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleaseVideoAppealPresenter.this.getViewState().mo15177c();
                return Unit.f63088a;
            }
        }, 6), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: a */
    public final void m15170a(@NotNull String str, @NotNull ReleaseVideoCategory releaseVideoCategory, @NotNull String str2) {
        ReleaseVideoAppealRepository releaseVideoAppealRepository = this.f27152b;
        long j2 = this.f27153c.f29321b;
        long id2 = releaseVideoCategory.getId();
        Objects.requireNonNull(releaseVideoAppealRepository);
        releaseVideoAppealRepository.f27385a.add(new ReleaseVideoAppealRequest(j2, str, id2, str2), releaseVideoAppealRepository.f27386b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2619b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealPresenter$onAppeal$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ReleaseVideoAppealPresenter.this.getViewState().mo15181q();
                return Unit.f63088a;
            }
        }, 1)).m31368j(new C2549a(this, 17)).m31370l(new C2619b(new Function1<ReleaseVideoAppealResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealPresenter$onAppeal$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseVideoAppealResponse releaseVideoAppealResponse) {
                ReleaseVideoAppealResponse releaseVideoAppealResponse2 = releaseVideoAppealResponse;
                int code = releaseVideoAppealResponse2.getCode();
                if (code == 3) {
                    ReleaseVideoAppealPresenter.this.getViewState().mo15173V0();
                } else if (code == 5) {
                    ReleaseVideoAppealPresenter.this.getViewState().mo15179k4();
                } else if (code == 6) {
                    ReleaseVideoAppealPresenter.this.getViewState().mo15172Q1();
                } else if (code == 7) {
                    ReleaseVideoAppealPresenter.this.getViewState().mo15171N2();
                } else if (releaseVideoAppealResponse2.isSuccess()) {
                    ReleaseVideoAppealPresenter.this.getViewState().mo15178d4();
                }
                return Unit.f63088a;
            }
        }, 2), new C2619b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.appeal.ReleaseVideoAppealPresenter$onAppeal$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleaseVideoAppealPresenter.this.getViewState().mo15177c();
                return Unit.f63088a;
            }
        }, 3), Functions.f59621b, Functions.f59622c);
    }
}
