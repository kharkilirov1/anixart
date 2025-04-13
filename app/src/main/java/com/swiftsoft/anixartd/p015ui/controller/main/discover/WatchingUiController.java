package com.swiftsoft.anixartd.p015ui.controller.main.discover;

import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.model.main.discover.ReleaseCardModel;
import com.swiftsoft.anixartd.p015ui.model.main.discover.ReleaseCardModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.carousel.RecommendedCarouselModel_;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WatchingUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014J\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/discover/WatchingUiController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "Lcom/swiftsoft/anixartd/ui/controller/main/discover/WatchingUiController$Listener;", "()V", "buildModels", "", "releases", "listener", "isEmpty", "", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class WatchingUiController extends Typed2EpoxyController<List<? extends Release>, Listener> {

    /* compiled from: WatchingUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/discover/WatchingUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/discover/ReleaseCardModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseCardModel.Listener {
    }

    public WatchingUiController() {
        setDebugLoggingEnabled(true);
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Release> list, Listener listener) {
        buildModels2((List<Release>) list, listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@NotNull List<Release> releases, @NotNull Listener listener) {
        Intrinsics.m32179h(releases, "releases");
        Intrinsics.m32179h(listener, "listener");
        RecommendedCarouselModel_ recommendedCarouselModel_ = new RecommendedCarouselModel_();
        recommendedCarouselModel_.m4520h2("carousel");
        recommendedCarouselModel_.mo16237s(Carousel.Padding.m4493a(16, 8, 16, 0, 16));
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(releases, 10));
        for (Release release : releases) {
            ReleaseCardModel_ releaseCardModel_ = new ReleaseCardModel_();
            releaseCardModel_.m15949w2(release.getId());
            String titleRu = release.getTitleRu();
            releaseCardModel_.m4524l2();
            releaseCardModel_.f29637k = titleRu;
            Integer episodesReleased = release.getEpisodesReleased();
            releaseCardModel_.m4524l2();
            releaseCardModel_.f29638l = episodesReleased;
            Integer episodesTotal = release.getEpisodesTotal();
            releaseCardModel_.m4524l2();
            releaseCardModel_.f29639m = episodesTotal;
            Double valueOf = Double.valueOf(release.getGrade());
            releaseCardModel_.m4524l2();
            releaseCardModel_.f29640n = valueOf;
            String description = release.getDescription();
            releaseCardModel_.m4524l2();
            releaseCardModel_.f29641o = description;
            String image = release.getImage();
            releaseCardModel_.m4524l2();
            releaseCardModel_.f29642p = image;
            boolean isFavorite = release.getIsFavorite();
            releaseCardModel_.m4524l2();
            releaseCardModel_.f29643q = isFavorite;
            int profileListStatus = release.getProfileListStatus();
            releaseCardModel_.m4524l2();
            releaseCardModel_.f29644r = profileListStatus;
            boolean z = release.getVoteCount() > 50;
            releaseCardModel_.m4524l2();
            releaseCardModel_.f29645s = z;
            releaseCardModel_.m4524l2();
            releaseCardModel_.f29646t = listener;
            arrayList.add(releaseCardModel_);
        }
        recommendedCarouselModel_.f30061k.set(6);
        recommendedCarouselModel_.m4524l2();
        recommendedCarouselModel_.f30064n = arrayList;
        add(recommendedCarouselModel_);
    }
}
