package com.swiftsoft.anixartd.p015ui.controller.main.release;

import com.airbnb.epoxy.Carousel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseStreamingPlatform;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoBlock;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoHosting;
import com.swiftsoft.anixartd.epoxy.Typed8EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModel;
import com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModel_;
import com.swiftsoft.anixartd.p015ui.model.common.SeparatorModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoBannerLargeModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoBannerLargeModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoHeader_;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.carousel.VideoBlockCarouselModel_;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.VideoStreamingPlatformModel;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.VideoStreamingPlatformModel_;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.carousel.VideoStreamingPlatformCarouselModel_;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseVideosUiController.kt */
@Metadata(m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002L\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\tJb\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\bH\u0014J\u0006\u0010\u0014\u001a\u00020\u0007¨\u0006\u0016"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideosUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed8EpoxyController;", "Lcom/swiftsoft/anixartd/database/entity/Release;", "", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideo;", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoBlock;", "Lcom/swiftsoft/anixartd/database/entity/ReleaseStreamingPlatform;", "", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideosUiController$Listener;", "()V", "buildModels", "", "release", "lastVideos", "releaseVideos", "blocks", "streamingPlatforms", "isLoadable", "isError", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseVideosUiController extends Typed8EpoxyController<Release, List<? extends ReleaseVideo>, List<? extends ReleaseVideo>, List<? extends ReleaseVideoBlock>, List<? extends ReleaseStreamingPlatform>, Boolean, Boolean, Listener> {

    /* compiled from: ReleaseVideosUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideosUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/release/VideoBannerLargeModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/release/VideoListItemModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/streaming/VideoStreamingPlatformModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/SectionHeaderModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ErrorModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends VideoBannerLargeModel.Listener, VideoListItemModel.Listener, VideoStreamingPlatformModel.Listener, SectionHeaderModel.Listener, ErrorModel.Listener {
    }

    public ReleaseVideosUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed8EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Release release, List<? extends ReleaseVideo> list, List<? extends ReleaseVideo> list2, List<? extends ReleaseVideoBlock> list3, List<? extends ReleaseStreamingPlatform> list4, Boolean bool, Boolean bool2, Listener listener) {
        buildModels(release, list, list2, (List<ReleaseVideoBlock>) list3, (List<ReleaseStreamingPlatform>) list4, bool.booleanValue(), bool2.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@Nullable Release release, @NotNull List<? extends ReleaseVideo> lastVideos, @NotNull List<? extends ReleaseVideo> releaseVideos, @NotNull List<ReleaseVideoBlock> blocks, @NotNull List<ReleaseStreamingPlatform> streamingPlatforms, boolean isLoadable, boolean isError, @NotNull Listener listener) {
        Intrinsics.m32179h(lastVideos, "lastVideos");
        Intrinsics.m32179h(releaseVideos, "releaseVideos");
        Intrinsics.m32179h(blocks, "blocks");
        Intrinsics.m32179h(streamingPlatforms, "streamingPlatforms");
        Intrinsics.m32179h(listener, "listener");
        VideoHeader_ videoHeader_ = new VideoHeader_();
        videoHeader_.mo16218a("videoHeader");
        String str = null;
        videoHeader_.mo16220j(release != null ? release.getTitleRu() : null);
        videoHeader_.mo16219c(release != null ? release.getImage() : null);
        add(videoHeader_);
        int i2 = 16;
        if (!streamingPlatforms.isEmpty()) {
            VideoStreamingPlatformCarouselModel_ videoStreamingPlatformCarouselModel_ = new VideoStreamingPlatformCarouselModel_();
            videoStreamingPlatformCarouselModel_.mo16290a("videoStreamingPlatformCarousel");
            videoStreamingPlatformCarouselModel_.mo16292s(Carousel.Padding.m4493a(16, 16, 16, 0, 16));
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(streamingPlatforms, 10));
            int i3 = 0;
            for (Object obj : streamingPlatforms) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.m32023h0();
                    throw null;
                }
                ReleaseStreamingPlatform releaseStreamingPlatform = (ReleaseStreamingPlatform) obj;
                VideoStreamingPlatformModel_ videoStreamingPlatformModel_ = new VideoStreamingPlatformModel_();
                videoStreamingPlatformModel_.m16289w2(releaseStreamingPlatform.getId());
                String name = releaseStreamingPlatform.getName();
                videoStreamingPlatformModel_.m4524l2();
                Intrinsics.m32179h(name, "<set-?>");
                videoStreamingPlatformModel_.f30117k = name;
                String icon = releaseStreamingPlatform.getIcon();
                videoStreamingPlatformModel_.m4524l2();
                videoStreamingPlatformModel_.f30118l = icon;
                videoStreamingPlatformModel_.m4524l2();
                videoStreamingPlatformModel_.f30119m = listener;
                arrayList.add(videoStreamingPlatformModel_);
                i3 = i4;
            }
            videoStreamingPlatformCarouselModel_.mo16291q(arrayList);
            add(videoStreamingPlatformCarouselModel_);
        }
        if (!blocks.isEmpty()) {
            int i5 = 0;
            for (Object obj2 : blocks) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.m32023h0();
                    throw null;
                }
                ReleaseVideoBlock releaseVideoBlock = (ReleaseVideoBlock) obj2;
                SectionHeaderModel_ sectionHeaderModel_ = new SectionHeaderModel_();
                sectionHeaderModel_.mo15774a("blockSectionHeader" + i5);
                ReleaseVideoCategory category = releaseVideoBlock.getCategory();
                sectionHeaderModel_.mo15773V0(category != null ? category.getName() : str);
                sectionHeaderModel_.mo15778w1("");
                sectionHeaderModel_.mo15772G0(releaseVideoBlock.getVideos().size() >= 25);
                sectionHeaderModel_.mo15776q0(Integer.valueOf(i5));
                sectionHeaderModel_.mo15777t0(listener);
                add(sectionHeaderModel_);
                VideoBlockCarouselModel_ videoBlockCarouselModel_ = new VideoBlockCarouselModel_();
                videoBlockCarouselModel_.mo16247a("videoBlockCarousel" + i5);
                videoBlockCarouselModel_.mo16249s(Carousel.Padding.m4493a(i2, 0, i2, 8, i2));
                List<ReleaseVideo> videos = releaseVideoBlock.getVideos();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(videos, 10));
                for (ReleaseVideo releaseVideo : videos) {
                    VideoBannerLargeModel_ videoBannerLargeModel_ = new VideoBannerLargeModel_();
                    videoBannerLargeModel_.m16217w2(releaseVideo.getId());
                    videoBannerLargeModel_.m4524l2();
                    videoBannerLargeModel_.f30040k = i5;
                    String title = releaseVideo.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    videoBannerLargeModel_.m4524l2();
                    videoBannerLargeModel_.f30041l = title;
                    String image = releaseVideo.getImage();
                    videoBannerLargeModel_.m4524l2();
                    Intrinsics.m32179h(image, "<set-?>");
                    videoBannerLargeModel_.f30042m = image;
                    ReleaseVideoHosting hosting = releaseVideo.getHosting();
                    String icon2 = hosting != null ? hosting.getIcon() : null;
                    videoBannerLargeModel_.m4524l2();
                    videoBannerLargeModel_.f30043n = icon2;
                    videoBannerLargeModel_.m4524l2();
                    videoBannerLargeModel_.f30044o = listener;
                    arrayList2.add(videoBannerLargeModel_);
                }
                videoBlockCarouselModel_.mo16248q(arrayList2);
                add(videoBlockCarouselModel_);
                i5 = i6;
                str = null;
                i2 = 16;
            }
        }
        if (!lastVideos.isEmpty()) {
            SeparatorModel_ separatorModel_ = new SeparatorModel_();
            separatorModel_.mo15779a("separator");
            add(separatorModel_);
            SectionHeaderModel_ sectionHeaderModel_2 = new SectionHeaderModel_();
            sectionHeaderModel_2.mo15774a("lastVideosSectionHeader");
            sectionHeaderModel_2.mo15775e0(C2507R.string.last_videos);
            sectionHeaderModel_2.mo15777t0(listener);
            add(sectionHeaderModel_2);
            int i7 = 0;
            for (Object obj3 : lastVideos) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.m32023h0();
                    throw null;
                }
                ReleaseVideo releaseVideo2 = (ReleaseVideo) obj3;
                VideoListItemModel_ videoListItemModel_ = new VideoListItemModel_();
                videoListItemModel_.mo16227b(releaseVideo2.getId());
                videoListItemModel_.mo16224F0(releaseVideo2.getId());
                String title2 = releaseVideo2.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                videoListItemModel_.mo16233z(title2);
                ReleaseVideoCategory category2 = releaseVideo2.getCategory();
                videoListItemModel_.mo16231t1(category2 != null ? category2.getName() : null);
                videoListItemModel_.mo16229k(releaseVideo2.getProfile().getLogin());
                videoListItemModel_.mo16226P(releaseVideo2.getTimestamp());
                videoListItemModel_.mo16225O(releaseVideo2.getRelease().getTitleRu());
                videoListItemModel_.mo16228c(releaseVideo2.getImage());
                ReleaseVideoHosting hosting2 = releaseVideo2.getHosting();
                videoListItemModel_.mo16232u1(hosting2 != null ? hosting2.getIcon() : null);
                videoListItemModel_.mo16230p0(listener);
                add(videoListItemModel_);
                i7 = i8;
            }
            int i9 = 0;
            for (Object obj4 : releaseVideos) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    CollectionsKt.m32023h0();
                    throw null;
                }
                ReleaseVideo releaseVideo3 = (ReleaseVideo) obj4;
                VideoListItemModel_ videoListItemModel_2 = new VideoListItemModel_();
                videoListItemModel_2.mo16227b(releaseVideo3.getId());
                videoListItemModel_2.mo16224F0(releaseVideo3.getId());
                String title3 = releaseVideo3.getTitle();
                if (title3 == null) {
                    title3 = "";
                }
                videoListItemModel_2.mo16233z(title3);
                ReleaseVideoCategory category3 = releaseVideo3.getCategory();
                videoListItemModel_2.mo16231t1(category3 != null ? category3.getName() : null);
                videoListItemModel_2.mo16229k(releaseVideo3.getProfile().getLogin());
                videoListItemModel_2.mo16226P(releaseVideo3.getTimestamp());
                videoListItemModel_2.mo16225O(releaseVideo3.getRelease().getTitleRu());
                videoListItemModel_2.mo16228c(releaseVideo3.getImage());
                ReleaseVideoHosting hosting3 = releaseVideo3.getHosting();
                videoListItemModel_2.mo16232u1(hosting3 != null ? hosting3.getIcon() : null);
                videoListItemModel_2.mo16230p0(listener);
                add(videoListItemModel_2);
                i9 = i10;
            }
            if (isLoadable && !isError) {
                LoadingModel_ loadingModel_ = new LoadingModel_();
                loadingModel_.mo15729a("loading");
                add(loadingModel_);
            } else if (isError) {
                ErrorModel_ errorModel_ = new ErrorModel_();
                errorModel_.mo15725a("error");
                errorModel_.mo15724V1(listener);
                add(errorModel_);
            }
        }
    }
}
