package com.swiftsoft.anixartd.p015ui.controller.main.release;

import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.Typed3EpoxyController;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.model.main.release.RecommendedModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.RecommendedModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.carousel.RecommendedCarouselModel_;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseRecommendedUiController.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0014J\u0006\u0010\f\u001a\u00020\r¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseRecommendedUiController;", "Lcom/airbnb/epoxy/Typed3EpoxyController;", "", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseRecommendedUiController$Listener;", "()V", "buildModels", "", "releaseId", "releases", "listener", "isEmpty", "", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseRecommendedUiController extends Typed3EpoxyController<Long, List<? extends Release>, Listener> {

    /* compiled from: ReleaseRecommendedUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseRecommendedUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/release/RecommendedModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends RecommendedModel.Listener {
    }

    public ReleaseRecommendedUiController() {
        setDebugLoggingEnabled(true);
    }

    @Override // com.airbnb.epoxy.Typed3EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Long l2, List<? extends Release> list, Listener listener) {
        buildModels(l2.longValue(), (List<Release>) list, listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(long releaseId, @NotNull List<Release> releases, @NotNull Listener listener) {
        Intrinsics.m32179h(releases, "releases");
        Intrinsics.m32179h(listener, "listener");
        RecommendedCarouselModel_ recommendedCarouselModel_ = new RecommendedCarouselModel_();
        recommendedCarouselModel_.mo16235a("carousel");
        recommendedCarouselModel_.mo16237s(Carousel.Padding.m4493a(16, 8, 16, 0, 16));
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(releases, 10));
        for (Release release : releases) {
            RecommendedModel_ recommendedModel_ = new RecommendedModel_();
            recommendedModel_.m16162w2(release.getId());
            String titleRu = release.getTitleRu();
            recommendedModel_.m4524l2();
            recommendedModel_.f29976k = titleRu;
            String image = release.getImage();
            recommendedModel_.m4524l2();
            recommendedModel_.f29977l = image;
            recommendedModel_.m4524l2();
            recommendedModel_.f29978m = listener;
            arrayList.add(recommendedModel_);
        }
        recommendedCarouselModel_.mo16236q(arrayList);
        add(recommendedCarouselModel_);
    }
}
