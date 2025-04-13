package com.swiftsoft.anixartd.presentation.main.release.video.category;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.release.ReleaseVideoCategoryUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.release.video.category.ReleaseVideoCategoryUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.release.video.C2619b;
import com.swiftsoft.anixartd.repository.ReleaseVideoRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheetReleaseVideo;
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

/* compiled from: ReleaseVideoCategoryPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/video/category/ReleaseVideoCategoryPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/release/video/category/ReleaseVideoCategoryView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseVideoCategoryPresenter extends MvpPresenter<ReleaseVideoCategoryView> {

    /* renamed from: a */
    @NotNull
    public ReleaseVideoRepository f27166a;

    /* renamed from: b */
    @NotNull
    public Listener f27167b;

    /* renamed from: c */
    @NotNull
    public ReleaseVideoCategoryUiLogic f27168c;

    /* renamed from: d */
    @NotNull
    public ReleaseVideoCategoryUiController f27169d;

    /* compiled from: ReleaseVideoCategoryPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/video/category/ReleaseVideoCategoryPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideoCategoryUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseVideoCategoryUiController.Listener {
    }

    @Inject
    public ReleaseVideoCategoryPresenter(@NotNull ReleaseVideoRepository releaseVideoRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(releaseVideoRepository, "releaseVideoRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27166a = releaseVideoRepository;
        this.f27167b = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.release.VideoListItemModel.Listener
            /* renamed from: b */
            public void mo14954b(long j2) {
                Object obj;
                Iterator<T> it = ReleaseVideoCategoryPresenter.this.f27168c.f29327e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseVideo) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseVideo releaseVideo = (ReleaseVideo) obj;
                if (releaseVideo != null) {
                    EventBusKt.m16327a(new OnBottomSheetReleaseVideo(releaseVideo));
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ErrorModel.Listener
            /* renamed from: c */
            public void mo14387c() {
                ReleaseVideoCategoryPresenter releaseVideoCategoryPresenter = ReleaseVideoCategoryPresenter.this;
                releaseVideoCategoryPresenter.f27169d.setData(releaseVideoCategoryPresenter.f27168c.f29327e, Boolean.TRUE, Boolean.FALSE, this);
                ReleaseVideoCategoryPresenter.m15182b(ReleaseVideoCategoryPresenter.this, false, false, 3);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.VideoListItemModel.Listener
            /* renamed from: e */
            public void mo14955e(long j2) {
                Object obj;
                Iterator<T> it = ReleaseVideoCategoryPresenter.this.f27168c.f29327e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseVideo) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseVideo releaseVideo = (ReleaseVideo) obj;
                if (releaseVideo != null) {
                    ReleaseVideoCategoryPresenter.this.getViewState().mo15184K(releaseVideo);
                }
            }
        };
        this.f27168c = new ReleaseVideoCategoryUiLogic();
        this.f27169d = new ReleaseVideoCategoryUiController();
    }

    /* renamed from: b */
    public static void m15182b(ReleaseVideoCategoryPresenter releaseVideoCategoryPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = releaseVideoCategoryPresenter.f27169d.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        releaseVideoCategoryPresenter.m15183a(z, z2);
    }

    /* renamed from: a */
    public final void m15183a(final boolean z, final boolean z2) {
        ReleaseVideoRepository releaseVideoRepository = this.f27166a;
        ReleaseVideoCategoryUiLogic releaseVideoCategoryUiLogic = this.f27168c;
        releaseVideoRepository.f27387a.category(releaseVideoCategoryUiLogic.f29324b, releaseVideoCategoryUiLogic.f29325c, releaseVideoCategoryUiLogic.f29326d).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2619b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryPresenter$onReleaseVideos$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo15186b();
                }
                if (z2) {
                    this.getViewState().mo15188d();
                }
                return Unit.f63088a;
            }
        }, 7)).m31368j(new C2553a(z, this, z2, 19)).m31370l(new C2619b(new Function1<PageableResponse<ReleaseVideo>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryPresenter$onReleaseVideos$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<ReleaseVideo> pageableResponse) {
                PageableResponse<ReleaseVideo> pageableResponse2 = pageableResponse;
                if (pageableResponse2.isSuccess()) {
                    ReleaseVideoCategoryUiLogic releaseVideoCategoryUiLogic2 = ReleaseVideoCategoryPresenter.this.f27168c;
                    List<ReleaseVideo> releaseVideos = pageableResponse2.getContent();
                    pageableResponse2.getTotalCount();
                    Objects.requireNonNull(releaseVideoCategoryUiLogic2);
                    Intrinsics.m32179h(releaseVideos, "releaseVideos");
                    boolean z3 = releaseVideoCategoryUiLogic2.f29328f;
                    if (z3) {
                        releaseVideoCategoryUiLogic2.f29327e.addAll(releaseVideos);
                    } else {
                        if (z3) {
                            releaseVideoCategoryUiLogic2.f29327e.clear();
                        }
                        releaseVideoCategoryUiLogic2.f29327e.addAll(releaseVideos);
                        releaseVideoCategoryUiLogic2.f29328f = true;
                    }
                    ReleaseVideoCategoryPresenter releaseVideoCategoryPresenter = ReleaseVideoCategoryPresenter.this;
                    releaseVideoCategoryPresenter.f27169d.setData(releaseVideoCategoryPresenter.f27168c.f29327e, Boolean.valueOf(pageableResponse2.getContent().size() >= 25), Boolean.FALSE, ReleaseVideoCategoryPresenter.this.f27167b);
                }
                return Unit.f63088a;
            }
        }, 8), new C2619b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryPresenter$onReleaseVideos$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (ReleaseVideoCategoryPresenter.this.f27169d.isEmpty()) {
                    ReleaseVideoCategoryPresenter.this.getViewState().mo15187c();
                } else {
                    ReleaseVideoCategoryPresenter releaseVideoCategoryPresenter = ReleaseVideoCategoryPresenter.this;
                    releaseVideoCategoryPresenter.f27169d.setData(releaseVideoCategoryPresenter.f27168c.f29327e, Boolean.FALSE, Boolean.TRUE, releaseVideoCategoryPresenter.f27167b);
                }
                return Unit.f63088a;
            }
        }, 9), Functions.f59621b, Functions.f59622c);
    }
}
