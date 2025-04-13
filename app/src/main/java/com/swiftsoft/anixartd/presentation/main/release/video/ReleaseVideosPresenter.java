package com.swiftsoft.anixartd.presentation.main.release.video;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseStreamingPlatform;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoBlock;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.release.video.ReleaseVideosResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.release.ReleaseVideosUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.release.video.ReleaseVideosUiLogic;
import com.swiftsoft.anixartd.presentation.main.release.comments.C2616b;
import com.swiftsoft.anixartd.repository.ReleaseVideoRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheetReleaseVideo;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
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
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseVideosPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/video/ReleaseVideosPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/release/video/ReleaseVideosView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseVideosPresenter extends MvpPresenter<ReleaseVideosView> {

    /* renamed from: a */
    @NotNull
    public ReleaseVideoRepository f27125a;

    /* renamed from: b */
    @NotNull
    public Prefs f27126b;

    /* renamed from: c */
    @NotNull
    public Listener f27127c;

    /* renamed from: d */
    @NotNull
    public ReleaseVideosUiLogic f27128d;

    /* renamed from: e */
    @NotNull
    public ReleaseVideosUiController f27129e;

    /* compiled from: ReleaseVideosPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/video/ReleaseVideosPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideosUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseVideosUiController.Listener {
    }

    @Inject
    public ReleaseVideosPresenter(@NotNull ReleaseVideoRepository releaseVideoRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(releaseVideoRepository, "releaseVideoRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27125a = releaseVideoRepository;
        this.f27126b = prefs;
        this.f27127c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.streaming.VideoStreamingPlatformModel.Listener
            /* renamed from: a */
            public void mo15157a(long j2) {
                Object obj;
                Iterator<T> it = ReleaseVideosPresenter.this.f27128d.f29316g.iterator();
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
                    ReleaseVideosPresenter.this.getViewState().mo15162T0(releaseStreamingPlatform.getUrl());
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.VideoListItemModel.Listener
            /* renamed from: b */
            public void mo14954b(long j2) {
                Object obj;
                Object obj2;
                Iterator<T> it = ReleaseVideosPresenter.this.f27128d.f29314e.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((ReleaseVideo) obj2).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseVideo releaseVideo = (ReleaseVideo) obj2;
                if (releaseVideo != null) {
                    EventBusKt.m16327a(new OnBottomSheetReleaseVideo(releaseVideo));
                    return;
                }
                Iterator<T> it2 = ReleaseVideosPresenter.this.f27128d.f29318i.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((ReleaseVideo) next).getId() == j2) {
                        obj = next;
                        break;
                    }
                }
                ReleaseVideo releaseVideo2 = (ReleaseVideo) obj;
                if (releaseVideo2 != null) {
                    EventBusKt.m16327a(new OnBottomSheetReleaseVideo(releaseVideo2));
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ErrorModel.Listener
            /* renamed from: c */
            public void mo14387c() {
                ReleaseVideosPresenter releaseVideosPresenter = ReleaseVideosPresenter.this;
                ReleaseVideosUiController releaseVideosUiController = releaseVideosPresenter.f27129e;
                ReleaseVideosUiLogic releaseVideosUiLogic = releaseVideosPresenter.f27128d;
                releaseVideosUiController.setData(releaseVideosUiLogic.f29313d, releaseVideosUiLogic.f29314e, releaseVideosUiLogic.f29318i, releaseVideosUiLogic.f29315f, releaseVideosUiLogic.f29316g, Boolean.TRUE, Boolean.FALSE, this);
                ReleaseVideosPresenter.m15154c(ReleaseVideosPresenter.this, false, false, 3);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.VideoBannerLargeModel.Listener
            /* renamed from: d */
            public void mo15158d(int i2, long j2) {
                Object obj;
                Iterator<T> it = ReleaseVideosPresenter.this.f27128d.f29315f.get(i2).getVideos().iterator();
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
                    ReleaseVideosPresenter.this.getViewState().mo15160K(releaseVideo);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.VideoListItemModel.Listener
            /* renamed from: e */
            public void mo14955e(long j2) {
                Object obj;
                Object obj2;
                Iterator<T> it = ReleaseVideosPresenter.this.f27128d.f29314e.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((ReleaseVideo) obj2).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseVideo releaseVideo = (ReleaseVideo) obj2;
                if (releaseVideo != null) {
                    ReleaseVideosPresenter.this.getViewState().mo15160K(releaseVideo);
                    return;
                }
                Iterator<T> it2 = ReleaseVideosPresenter.this.f27128d.f29318i.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((ReleaseVideo) next).getId() == j2) {
                        obj = next;
                        break;
                    }
                }
                ReleaseVideo releaseVideo2 = (ReleaseVideo) obj;
                if (releaseVideo2 != null) {
                    ReleaseVideosPresenter.this.getViewState().mo15160K(releaseVideo2);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.VideoBannerLargeModel.Listener
            /* renamed from: f */
            public void mo15159f(int i2, long j2) {
                Object obj;
                Iterator<T> it = ReleaseVideosPresenter.this.f27128d.f29315f.get(i2).getVideos().iterator();
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

            @Override // com.swiftsoft.anixartd.ui.model.common.SectionHeaderModel.Listener
            /* renamed from: g */
            public void mo14776g(@Nullable Integer num) {
                List<ReleaseVideoBlock> list = ReleaseVideosPresenter.this.f27128d.f29315f;
                Intrinsics.m32176e(num);
                ReleaseVideoCategory category = list.get(num.intValue()).getCategory();
                if (category != null) {
                    ReleaseVideosPresenter.this.getViewState().mo15168x1(category);
                }
            }
        };
        this.f27128d = new ReleaseVideosUiLogic();
        this.f27129e = new ReleaseVideosUiController();
    }

    /* renamed from: c */
    public static void m15154c(final ReleaseVideosPresenter releaseVideosPresenter, final boolean z, final boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = releaseVideosPresenter.m15155a();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        ReleaseVideoRepository releaseVideoRepository = releaseVideosPresenter.f27125a;
        ReleaseVideosUiLogic releaseVideosUiLogic = releaseVideosPresenter.f27128d;
        releaseVideoRepository.f27387a.video(releaseVideosUiLogic.f29311b, releaseVideosUiLogic.f29312c).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2616b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosPresenter$onReleaseVideos$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    releaseVideosPresenter.getViewState().mo15164b();
                }
                if (z2) {
                    releaseVideosPresenter.getViewState().mo15166d();
                }
                return Unit.f63088a;
            }
        }, 28)).m31368j(new C2618a(z, releaseVideosPresenter, z2, 1)).m31370l(new C2616b(new Function1<PageableResponse<ReleaseVideo>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosPresenter$onReleaseVideos$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<ReleaseVideo> pageableResponse) {
                PageableResponse<ReleaseVideo> pageableResponse2 = pageableResponse;
                if (pageableResponse2.isSuccess()) {
                    ReleaseVideosUiLogic releaseVideosUiLogic2 = ReleaseVideosPresenter.this.f27128d;
                    List<ReleaseVideo> releaseVideos = pageableResponse2.getContent();
                    pageableResponse2.getTotalCount();
                    Objects.requireNonNull(releaseVideosUiLogic2);
                    Intrinsics.m32179h(releaseVideos, "releaseVideos");
                    boolean z3 = releaseVideosUiLogic2.f29320k;
                    if (z3) {
                        releaseVideosUiLogic2.f29318i.addAll(releaseVideosUiLogic2.f29314e);
                    } else {
                        if (z3) {
                            releaseVideosUiLogic2.f29318i.clear();
                        }
                        releaseVideosUiLogic2.f29318i.addAll(releaseVideos);
                        releaseVideosUiLogic2.f29320k = true;
                    }
                    ReleaseVideosPresenter releaseVideosPresenter2 = ReleaseVideosPresenter.this;
                    ReleaseVideosUiController releaseVideosUiController = releaseVideosPresenter2.f27129e;
                    ReleaseVideosUiLogic releaseVideosUiLogic3 = releaseVideosPresenter2.f27128d;
                    releaseVideosUiController.setData(releaseVideosUiLogic3.f29313d, releaseVideosUiLogic3.f29314e, releaseVideosUiLogic3.f29318i, releaseVideosUiLogic3.f29315f, releaseVideosUiLogic3.f29316g, Boolean.valueOf(pageableResponse2.getContent().size() >= 25), Boolean.FALSE, ReleaseVideosPresenter.this.f27127c);
                }
                return Unit.f63088a;
            }
        }, 29), new C2619b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosPresenter$onReleaseVideos$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (ReleaseVideosPresenter.this.m15155a()) {
                    ReleaseVideosPresenter.this.getViewState().mo15165c();
                } else {
                    ReleaseVideosPresenter releaseVideosPresenter2 = ReleaseVideosPresenter.this;
                    ReleaseVideosUiController releaseVideosUiController = releaseVideosPresenter2.f27129e;
                    ReleaseVideosUiLogic releaseVideosUiLogic2 = releaseVideosPresenter2.f27128d;
                    releaseVideosUiController.setData(releaseVideosUiLogic2.f29313d, releaseVideosUiLogic2.f29314e, releaseVideosUiLogic2.f29318i, releaseVideosUiLogic2.f29315f, releaseVideosUiLogic2.f29316g, Boolean.FALSE, Boolean.TRUE, releaseVideosPresenter2.f27127c);
                }
                return Unit.f63088a;
            }
        }, 0), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: a */
    public final boolean m15155a() {
        return this.f27129e.isEmpty();
    }

    /* renamed from: b */
    public final void m15156b(final boolean z, final boolean z2) {
        ReleaseVideoRepository releaseVideoRepository = this.f27125a;
        releaseVideoRepository.f27387a.main(this.f27128d.f29311b).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2616b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosPresenter$onReleaseVideoMain$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo15164b();
                }
                if (z2) {
                    this.getViewState().mo15166d();
                }
                return Unit.f63088a;
            }
        }, 25)).m31368j(new C2618a(z, this, z2, 0)).m31370l(new C2616b(new Function1<ReleaseVideosResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosPresenter$onReleaseVideoMain$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseVideosResponse releaseVideosResponse) {
                ReleaseVideosResponse releaseVideosResponse2 = releaseVideosResponse;
                if (releaseVideosResponse2.getCode() == 2) {
                    ReleaseVideosPresenter.this.getViewState().mo15165c();
                } else if (releaseVideosResponse2.isSuccess()) {
                    ReleaseVideosUiLogic releaseVideosUiLogic = ReleaseVideosPresenter.this.f27128d;
                    Release release = releaseVideosResponse2.getRelease();
                    List<ReleaseVideo> lastVideos = releaseVideosResponse2.getLastVideos();
                    List<ReleaseVideoBlock> blocks = releaseVideosResponse2.getBlocks();
                    List<ReleaseStreamingPlatform> streamingPlatforms = releaseVideosResponse2.getStreamingPlatforms();
                    Objects.requireNonNull(releaseVideosUiLogic);
                    Intrinsics.m32179h(lastVideos, "lastVideos");
                    Intrinsics.m32179h(blocks, "blocks");
                    Intrinsics.m32179h(streamingPlatforms, "streamingPlatforms");
                    if (releaseVideosUiLogic.f29319j) {
                        releaseVideosUiLogic.f29313d = null;
                        releaseVideosUiLogic.f29314e.clear();
                        releaseVideosUiLogic.f29315f.clear();
                        releaseVideosUiLogic.f29316g.clear();
                    }
                    releaseVideosUiLogic.f29313d = release;
                    releaseVideosUiLogic.f29314e.addAll(lastVideos);
                    releaseVideosUiLogic.f29315f.addAll(blocks);
                    releaseVideosUiLogic.f29316g.addAll(streamingPlatforms);
                    lastVideos.size();
                    releaseVideosUiLogic.f29319j = true;
                    ReleaseVideosPresenter.this.f27128d.f29317h = releaseVideosResponse2.getCanAppeal();
                    ReleaseVideosPresenter releaseVideosPresenter = ReleaseVideosPresenter.this;
                    ReleaseVideosUiController releaseVideosUiController = releaseVideosPresenter.f27129e;
                    ReleaseVideosUiLogic releaseVideosUiLogic2 = releaseVideosPresenter.f27128d;
                    Release release2 = releaseVideosUiLogic2.f29313d;
                    List<ReleaseVideo> list = releaseVideosUiLogic2.f29314e;
                    ArrayList arrayList = new ArrayList();
                    ReleaseVideosUiLogic releaseVideosUiLogic3 = ReleaseVideosPresenter.this.f27128d;
                    releaseVideosUiController.setData(release2, list, arrayList, releaseVideosUiLogic3.f29315f, releaseVideosUiLogic3.f29316g, Boolean.valueOf(releaseVideosResponse2.getLastVideos().size() >= 25), Boolean.FALSE, ReleaseVideosPresenter.this.f27127c);
                    ReleaseVideosPresenter.this.getViewState().mo15161K1(ReleaseVideosPresenter.this.f27128d.f29317h);
                }
                return Unit.f63088a;
            }
        }, 26), new C2616b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosPresenter$onReleaseVideoMain$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleaseVideosPresenter.this.getViewState().mo15165c();
                return Unit.f63088a;
            }
        }, 27), Functions.f59621b, Functions.f59622c);
    }
}
