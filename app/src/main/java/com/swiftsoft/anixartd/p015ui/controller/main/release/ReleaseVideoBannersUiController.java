package com.swiftsoft.anixartd.p015ui.controller.main.release;

import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.Typed3EpoxyController;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoBanner;
import com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoCategoryBannerModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoCategoryBannerModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoMoreBannerModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoMoreBannerModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.carousel.VideoBannerCarouselModel_;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseVideoBannersUiController.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\u0014J\u0006\u0010\f\u001a\u00020\r¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideoBannersUiController;", "Lcom/airbnb/epoxy/Typed3EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoBanner;", "", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideoBannersUiController$Listener;", "()V", "buildModels", "", "releaseVideoBanners", "releaseId", "listener", "isEmpty", "", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseVideoBannersUiController extends Typed3EpoxyController<List<? extends ReleaseVideoBanner>, Long, Listener> {

    /* compiled from: ReleaseVideoBannersUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideoBannersUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/release/ReleaseVideoCategoryBannerModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/release/ReleaseVideoMoreBannerModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseVideoCategoryBannerModel.Listener, ReleaseVideoMoreBannerModel.Listener {
    }

    public ReleaseVideoBannersUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    @Override // com.airbnb.epoxy.Typed3EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends ReleaseVideoBanner> list, Long l2, Listener listener) {
        buildModels((List<ReleaseVideoBanner>) list, l2.longValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<ReleaseVideoBanner> releaseVideoBanners, long releaseId, @NotNull Listener listener) {
        Intrinsics.m32179h(releaseVideoBanners, "releaseVideoBanners");
        Intrinsics.m32179h(listener, "listener");
        VideoBannerCarouselModel_ videoBannerCarouselModel_ = new VideoBannerCarouselModel_();
        videoBannerCarouselModel_.mo16243a("videoBannerCarousel");
        videoBannerCarouselModel_.mo16245s(Carousel.Padding.m4493a(16, 8, 16, 8, 16));
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(releaseVideoBanners, 10));
        int i2 = 0;
        for (Object obj : releaseVideoBanners) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            ReleaseVideoBanner releaseVideoBanner = (ReleaseVideoBanner) obj;
            ReleaseVideoCategoryBannerModel_ releaseVideoCategoryBannerModel_ = new ReleaseVideoCategoryBannerModel_();
            releaseVideoCategoryBannerModel_.m16203w2(i2 + releaseId);
            releaseVideoCategoryBannerModel_.m4524l2();
            releaseVideoCategoryBannerModel_.f30014k = releaseId;
            String name = releaseVideoBanner.getName();
            releaseVideoCategoryBannerModel_.m4524l2();
            Intrinsics.m32179h(name, "<set-?>");
            releaseVideoCategoryBannerModel_.f30015l = name;
            String image = releaseVideoBanner.getImage();
            releaseVideoCategoryBannerModel_.m4524l2();
            Intrinsics.m32179h(image, "<set-?>");
            releaseVideoCategoryBannerModel_.f30016m = image;
            long actionId = releaseVideoBanner.getActionId();
            releaseVideoCategoryBannerModel_.m4524l2();
            releaseVideoCategoryBannerModel_.f30017n = actionId;
            String value = releaseVideoBanner.getValue();
            releaseVideoCategoryBannerModel_.m4524l2();
            Intrinsics.m32179h(value, "<set-?>");
            releaseVideoCategoryBannerModel_.f30018o = value;
            boolean isNew = releaseVideoBanner.getIsNew();
            releaseVideoCategoryBannerModel_.m4524l2();
            releaseVideoCategoryBannerModel_.f30019p = isNew;
            releaseVideoCategoryBannerModel_.m4524l2();
            releaseVideoCategoryBannerModel_.f30020q = listener;
            arrayList.add(releaseVideoCategoryBannerModel_);
            i2 = i3;
        }
        videoBannerCarouselModel_.mo16244q(arrayList);
        add(videoBannerCarouselModel_);
        ReleaseVideoMoreBannerModel_ releaseVideoMoreBannerModel_ = new ReleaseVideoMoreBannerModel_();
        releaseVideoMoreBannerModel_.mo16206a("releaseVideoMoreBanner");
        releaseVideoMoreBannerModel_.mo16207y(releaseId);
        releaseVideoMoreBannerModel_.mo16205Q0(listener);
        add(releaseVideoMoreBannerModel_);
    }
}
