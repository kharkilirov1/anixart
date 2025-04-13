package com.swiftsoft.anixartd.p015ui.controller.main.profile.videos;

import com.airbnb.epoxy.EpoxyModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoHosting;
import com.swiftsoft.anixartd.epoxy.Typed8EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.EmptyModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModel;
import com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoAppealListItemModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoAppealListItemModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;
import p029i.C6284a;

/* compiled from: ProfileReleaseVideosTabUiController.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00142D\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0001:\u0002\u0014\u0015B\u0005¢\u0006\u0002\u0010\bJZ\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0007H\u0014J\u0006\u0010\u0013\u001a\u00020\u0006¨\u0006\u0016"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/videos/ProfileReleaseVideosTabUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed8EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideo;", "", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/videos/ProfileReleaseVideosTabUiController$Listener;", "()V", "buildModels", "", "videos", "videoUploads", "videoAppeals", "selectedInnerTab", "totalCount", "videoAppealsTotalCount", "isLoadable", "listener", "isEmpty", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileReleaseVideosTabUiController extends Typed8EpoxyController<List<? extends ReleaseVideo>, List<? extends ReleaseVideo>, List<? extends ReleaseVideo>, String, Long, Long, Boolean, Listener> {
    private static final int ACTION_SECTION_VIDEO_APPEALS_MORE = 1;

    /* compiled from: ProfileReleaseVideosTabUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/videos/ProfileReleaseVideosTabUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/release/VideoListItemModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/release/VideoAppealListItemModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/SectionHeaderModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends VideoListItemModel.Listener, VideoAppealListItemModel.Listener, SectionHeaderModel.Listener {
    }

    public ProfileReleaseVideosTabUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$1$lambda$0(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$5$lambda$4(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed8EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends ReleaseVideo> list, List<? extends ReleaseVideo> list2, List<? extends ReleaseVideo> list3, String str, Long l2, Long l3, Boolean bool, Listener listener) {
        buildModels(list, list2, list3, str, l2.longValue(), l3.longValue(), bool.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<? extends ReleaseVideo> videos, @NotNull List<? extends ReleaseVideo> videoUploads, @NotNull List<? extends ReleaseVideo> videoAppeals, @NotNull String selectedInnerTab, long totalCount, long videoAppealsTotalCount, boolean isLoadable, @NotNull Listener listener) {
        int i2;
        Intrinsics.m32179h(videos, "videos");
        Intrinsics.m32179h(videoUploads, "videoUploads");
        Intrinsics.m32179h(videoAppeals, "videoAppeals");
        Intrinsics.m32179h(selectedInnerTab, "selectedInnerTab");
        Intrinsics.m32179h(listener, "listener");
        if (Intrinsics.m32174c(selectedInnerTab, "INNER_TAB_PROFILE_VIDEOS_ALL")) {
            i2 = C2507R.string.empty_profile_videos_all;
        } else {
            if (!Intrinsics.m32174c(selectedInnerTab, "INNER_TAB_PROFILE_VIDEOS_UPLOADED")) {
                throw new Exception("Invalid inner position");
            }
            i2 = C2507R.string.empty_profile_videos_uploaded;
        }
        int i3 = 0;
        if (Intrinsics.m32174c(selectedInnerTab, "INNER_TAB_PROFILE_VIDEOS_ALL")) {
            if (videos.isEmpty()) {
                EmptyModel_ emptyModel_ = new EmptyModel_();
                emptyModel_.m4520h2("empty");
                emptyModel_.m4524l2();
                emptyModel_.f29382k = i2;
                emptyModel_.f6932i = C6284a.f58019A;
                add(emptyModel_);
            } else {
                for (Object obj : videos) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.m32023h0();
                        throw null;
                    }
                    ReleaseVideo releaseVideo = (ReleaseVideo) obj;
                    VideoListItemModel_ videoListItemModel_ = new VideoListItemModel_();
                    videoListItemModel_.mo16227b(releaseVideo.getId());
                    long id2 = releaseVideo.getId();
                    videoListItemModel_.m4524l2();
                    videoListItemModel_.f30048k = id2;
                    String title = releaseVideo.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    videoListItemModel_.m4524l2();
                    videoListItemModel_.f30049l = title;
                    ReleaseVideoCategory category = releaseVideo.getCategory();
                    String name = category != null ? category.getName() : null;
                    videoListItemModel_.m4524l2();
                    videoListItemModel_.f30050m = name;
                    videoListItemModel_.mo16229k(releaseVideo.getProfile().getLogin());
                    long timestamp = releaseVideo.getTimestamp();
                    videoListItemModel_.m4524l2();
                    videoListItemModel_.f30052o = timestamp;
                    String titleRu = releaseVideo.getRelease().getTitleRu();
                    videoListItemModel_.m4524l2();
                    videoListItemModel_.f30053p = titleRu;
                    videoListItemModel_.mo16228c(releaseVideo.getImage());
                    ReleaseVideoHosting hosting = releaseVideo.getHosting();
                    String icon = hosting != null ? hosting.getIcon() : null;
                    videoListItemModel_.m4524l2();
                    videoListItemModel_.f30055r = icon;
                    videoListItemModel_.m4524l2();
                    videoListItemModel_.f30056s = listener;
                    add(videoListItemModel_);
                    i3 = i4;
                }
            }
        } else if (Intrinsics.m32174c(selectedInnerTab, "INNER_TAB_PROFILE_VIDEOS_UPLOADED")) {
            if (videoUploads.isEmpty() && videoAppeals.isEmpty()) {
                EmptyModel_ emptyModel_2 = new EmptyModel_();
                emptyModel_2.m4520h2("empty");
                emptyModel_2.m4524l2();
                emptyModel_2.f29382k = i2;
                emptyModel_2.f6932i = C6284a.f58020B;
                add(emptyModel_2);
            } else {
                if (!videoAppeals.isEmpty()) {
                    SectionHeaderModel_ sectionHeaderModel_ = new SectionHeaderModel_();
                    sectionHeaderModel_.m4520h2("sectionHeader1");
                    sectionHeaderModel_.m4524l2();
                    sectionHeaderModel_.f29432k = C2507R.string.profile_video_appeals;
                    sectionHeaderModel_.mo15778w1(videoAppealsTotalCount > 3 ? String.valueOf(videoAppealsTotalCount) : "");
                    boolean z = videoAppealsTotalCount > 3;
                    sectionHeaderModel_.m4524l2();
                    sectionHeaderModel_.f29435n = z;
                    sectionHeaderModel_.m4524l2();
                    sectionHeaderModel_.f29436o = 1;
                    sectionHeaderModel_.m4524l2();
                    sectionHeaderModel_.f29437p = listener;
                    add(sectionHeaderModel_);
                    int i5 = 0;
                    for (Object obj2 : videoAppeals) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.m32023h0();
                            throw null;
                        }
                        ReleaseVideo releaseVideo2 = (ReleaseVideo) obj2;
                        VideoAppealListItemModel_ videoAppealListItemModel_ = new VideoAppealListItemModel_();
                        StringBuilder m24u = C0000a.m24u("videoAppeals");
                        m24u.append(releaseVideo2.getId());
                        videoAppealListItemModel_.m4520h2(m24u.toString());
                        long id3 = releaseVideo2.getId();
                        videoAppealListItemModel_.m4524l2();
                        videoAppealListItemModel_.f30029k = id3;
                        String title2 = releaseVideo2.getTitle();
                        if (title2 == null) {
                            title2 = "";
                        }
                        videoAppealListItemModel_.m4524l2();
                        videoAppealListItemModel_.f30030l = title2;
                        ReleaseVideoCategory category2 = releaseVideo2.getCategory();
                        String name2 = category2 != null ? category2.getName() : null;
                        videoAppealListItemModel_.m4524l2();
                        videoAppealListItemModel_.f30031m = name2;
                        videoAppealListItemModel_.m16214y2(releaseVideo2.getProfile().getLogin());
                        long timestamp2 = releaseVideo2.getTimestamp();
                        videoAppealListItemModel_.m4524l2();
                        videoAppealListItemModel_.f30033o = timestamp2;
                        String titleRu2 = releaseVideo2.getRelease().getTitleRu();
                        videoAppealListItemModel_.m4524l2();
                        videoAppealListItemModel_.f30034p = titleRu2;
                        videoAppealListItemModel_.m16213x2(releaseVideo2.getImage());
                        ReleaseVideoHosting hosting2 = releaseVideo2.getHosting();
                        String icon2 = hosting2 != null ? hosting2.getIcon() : null;
                        videoAppealListItemModel_.m4524l2();
                        videoAppealListItemModel_.f30036r = icon2;
                        videoAppealListItemModel_.m4524l2();
                        videoAppealListItemModel_.f30037s = listener;
                        add(videoAppealListItemModel_);
                        i5 = i6;
                    }
                }
                SectionHeaderModel_ sectionHeaderModel_2 = new SectionHeaderModel_();
                sectionHeaderModel_2.m4520h2("sectionHeader2");
                sectionHeaderModel_2.m4524l2();
                sectionHeaderModel_2.f29432k = C2507R.string.profile_video_uploads;
                sectionHeaderModel_2.mo15778w1(String.valueOf(totalCount));
                sectionHeaderModel_2.m4524l2();
                sectionHeaderModel_2.f29435n = false;
                sectionHeaderModel_2.m4524l2();
                sectionHeaderModel_2.f29436o = -1;
                sectionHeaderModel_2.m4524l2();
                sectionHeaderModel_2.f29437p = listener;
                add(sectionHeaderModel_2);
                for (Object obj3 : videoUploads) {
                    int i7 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.m32023h0();
                        throw null;
                    }
                    ReleaseVideo releaseVideo3 = (ReleaseVideo) obj3;
                    VideoListItemModel_ videoListItemModel_2 = new VideoListItemModel_();
                    StringBuilder m24u2 = C0000a.m24u("videoUploads");
                    m24u2.append(releaseVideo3.getId());
                    videoListItemModel_2.m4520h2(m24u2.toString());
                    long id4 = releaseVideo3.getId();
                    videoListItemModel_2.m4524l2();
                    videoListItemModel_2.f30048k = id4;
                    String title3 = releaseVideo3.getTitle();
                    if (title3 == null) {
                        title3 = "";
                    }
                    videoListItemModel_2.m4524l2();
                    videoListItemModel_2.f30049l = title3;
                    ReleaseVideoCategory category3 = releaseVideo3.getCategory();
                    String name3 = category3 != null ? category3.getName() : null;
                    videoListItemModel_2.m4524l2();
                    videoListItemModel_2.f30050m = name3;
                    videoListItemModel_2.mo16229k(releaseVideo3.getProfile().getLogin());
                    long timestamp3 = releaseVideo3.getTimestamp();
                    videoListItemModel_2.m4524l2();
                    videoListItemModel_2.f30052o = timestamp3;
                    String titleRu3 = releaseVideo3.getRelease().getTitleRu();
                    videoListItemModel_2.m4524l2();
                    videoListItemModel_2.f30053p = titleRu3;
                    videoListItemModel_2.mo16228c(releaseVideo3.getImage());
                    ReleaseVideoHosting hosting3 = releaseVideo3.getHosting();
                    String icon3 = hosting3 != null ? hosting3.getIcon() : null;
                    videoListItemModel_2.m4524l2();
                    videoListItemModel_2.f30055r = icon3;
                    videoListItemModel_2.m4524l2();
                    videoListItemModel_2.f30056s = listener;
                    add(videoListItemModel_2);
                    i3 = i7;
                }
            }
        }
        if (isLoadable) {
            EpoxyModel<?> loadingModel_ = new LoadingModel_();
            loadingModel_.m4520h2("loading");
            add(loadingModel_);
        }
    }
}
