package com.swiftsoft.anixartd.p015ui.controller.main.release;

import com.airbnb.epoxy.Typed4EpoxyController;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoHosting;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseVideoCategoryUiController.kt */
@Metadata(m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0005H\u0014J\u0006\u0010\r\u001a\u00020\u0004¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideoCategoryUiController;", "Lcom/airbnb/epoxy/Typed4EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideo;", "", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideoCategoryUiController$Listener;", "()V", "buildModels", "", "releaseVideos", "isLoadable", "isError", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseVideoCategoryUiController extends Typed4EpoxyController<List<? extends ReleaseVideo>, Boolean, Boolean, Listener> {

    /* compiled from: ReleaseVideoCategoryUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseVideoCategoryUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/release/VideoListItemModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ErrorModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends VideoListItemModel.Listener, ErrorModel.Listener {
    }

    public ReleaseVideoCategoryUiController() {
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
            VideoListItemModel_ videoListItemModel_ = new VideoListItemModel_();
            videoListItemModel_.mo16227b(releaseVideo.getId());
            videoListItemModel_.mo16224F0(releaseVideo.getId());
            String title = releaseVideo.getTitle();
            if (title == null) {
                title = "";
            }
            videoListItemModel_.mo16233z(title);
            ReleaseVideoCategory category = releaseVideo.getCategory();
            videoListItemModel_.mo16231t1(category != null ? category.getName() : null);
            videoListItemModel_.mo16229k(releaseVideo.getProfile().getLogin());
            videoListItemModel_.mo16226P(releaseVideo.getTimestamp());
            videoListItemModel_.mo16225O(releaseVideo.getRelease().getTitleRu());
            videoListItemModel_.mo16228c(releaseVideo.getImage());
            ReleaseVideoHosting hosting = releaseVideo.getHosting();
            if (hosting != null) {
                str = hosting.getIcon();
            }
            videoListItemModel_.mo16232u1(str);
            videoListItemModel_.mo16230p0(listener);
            add(videoListItemModel_);
            i2 = i3;
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
