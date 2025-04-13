package com.swiftsoft.anixartd.p015ui.controller.main.profile.videos;

import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.Typed4EpoxyController;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoHosting;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoAppealListItemModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoAppealListItemModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseVideoAppealsUiController.kt */
@Metadata(m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0005H\u0014J\u0006\u0010\r\u001a\u00020\u0004¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/videos/ProfileReleaseVideoAppealsUiController;", "Lcom/airbnb/epoxy/Typed4EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideo;", "", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/videos/ProfileReleaseVideoAppealsUiController$Listener;", "()V", "buildModels", "", "releaseVideos", "isLoadable", "isError", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileReleaseVideoAppealsUiController extends Typed4EpoxyController<List<? extends ReleaseVideo>, Boolean, Boolean, Listener> {

    /* compiled from: ProfileReleaseVideoAppealsUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/videos/ProfileReleaseVideoAppealsUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/release/VideoAppealListItemModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ErrorModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends VideoAppealListItemModel.Listener, ErrorModel.Listener {
    }

    public ProfileReleaseVideoAppealsUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    @Override // com.airbnb.epoxy.Typed4EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends ReleaseVideo> list, Boolean bool, Boolean bool2, Listener listener) {
        buildModels(list, bool.booleanValue(), bool2.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<? extends ReleaseVideo> releaseVideos, boolean isLoadable, boolean isError, @NotNull Listener listener) {
        Intrinsics.m32179h(releaseVideos, "releaseVideos");
        Intrinsics.m32179h(listener, "listener");
        int i2 = 0;
        for (Object obj : releaseVideos) {
            int i3 = i2 + 1;
            String str = null;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            ReleaseVideo releaseVideo = (ReleaseVideo) obj;
            VideoAppealListItemModel_ videoAppealListItemModel_ = new VideoAppealListItemModel_();
            videoAppealListItemModel_.m16212w2(releaseVideo.getId());
            long id2 = releaseVideo.getId();
            videoAppealListItemModel_.m4524l2();
            videoAppealListItemModel_.f30029k = id2;
            String title = releaseVideo.getTitle();
            if (title == null) {
                title = "";
            }
            videoAppealListItemModel_.m4524l2();
            videoAppealListItemModel_.f30030l = title;
            ReleaseVideoCategory category = releaseVideo.getCategory();
            String name = category != null ? category.getName() : null;
            videoAppealListItemModel_.m4524l2();
            videoAppealListItemModel_.f30031m = name;
            videoAppealListItemModel_.m16214y2(releaseVideo.getProfile().getLogin());
            long timestamp = releaseVideo.getTimestamp();
            videoAppealListItemModel_.m4524l2();
            videoAppealListItemModel_.f30033o = timestamp;
            String titleRu = releaseVideo.getRelease().getTitleRu();
            videoAppealListItemModel_.m4524l2();
            videoAppealListItemModel_.f30034p = titleRu;
            videoAppealListItemModel_.m16213x2(releaseVideo.getImage());
            ReleaseVideoHosting hosting = releaseVideo.getHosting();
            if (hosting != null) {
                str = hosting.getIcon();
            }
            videoAppealListItemModel_.m4524l2();
            videoAppealListItemModel_.f30036r = str;
            videoAppealListItemModel_.m4524l2();
            videoAppealListItemModel_.f30037s = listener;
            add(videoAppealListItemModel_);
            i2 = i3;
        }
        if (isLoadable && !isError) {
            EpoxyModel<?> loadingModel_ = new LoadingModel_();
            loadingModel_.m4520h2("loading");
            add(loadingModel_);
        } else if (isError) {
            ErrorModel_ errorModel_ = new ErrorModel_();
            errorModel_.m4520h2("error");
            errorModel_.m4524l2();
            errorModel_.f29383k = listener;
            add(errorModel_);
        }
    }
}
