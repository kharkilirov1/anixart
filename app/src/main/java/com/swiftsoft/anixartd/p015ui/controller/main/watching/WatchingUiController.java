package com.swiftsoft.anixartd.p015ui.controller.main.watching;

import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseStatus;
import com.swiftsoft.anixartd.epoxy.Typed5EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModel_;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WatchingUiController.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002&\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\bJ6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0014J\u0006\u0010\u0010\u001a\u00020\u0006¨\u0006\u0012"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/watching/WatchingUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed5EpoxyController;", "", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/watching/WatchingUiController$Listener;", "()V", "buildModels", "", "viewType", "releases", "totalCount", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class WatchingUiController extends Typed5EpoxyController<Integer, List<? extends Release>, Long, Boolean, Listener> {

    /* compiled from: WatchingUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/watching/WatchingUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ReleaseModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseModel.Listener {
    }

    public WatchingUiController() {
        setDebugLoggingEnabled(true);
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed5EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Integer num, List<? extends Release> list, Long l2, Boolean bool, Listener listener) {
        buildModels(num.intValue(), (List<Release>) list, l2.longValue(), bool.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(int viewType, @NotNull List<Release> releases, long totalCount, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(releases, "releases");
        Intrinsics.m32179h(listener, "listener");
        if (viewType == 1) {
            for (Release release : releases) {
                ReleaseCardModel_ releaseCardModel_ = new ReleaseCardModel_();
                releaseCardModel_.mo15739b(release.getId());
                releaseCardModel_.mo15741e(release.getTitleRu());
                releaseCardModel_.mo15747n(release.getEpisodesReleased());
                releaseCardModel_.mo15746m(release.getEpisodesTotal());
                releaseCardModel_.mo15744h(Double.valueOf(release.getGrade()));
                releaseCardModel_.mo15743g(release.getDescription());
                releaseCardModel_.mo15740c(release.getImage());
                releaseCardModel_.mo15734A(release.getYear());
                releaseCardModel_.mo15736I(release.getSeason());
                ReleaseStatus status = release.getStatus();
                releaseCardModel_.mo15735C(status != null ? Long.valueOf(status.getId()) : null);
                releaseCardModel_.mo15737J(release.getAiredOnDate());
                releaseCardModel_.mo15742f(release.getIsFavorite());
                releaseCardModel_.mo15748o(release.getProfileListStatus());
                releaseCardModel_.mo15745i(release.getVoteCount() > 50);
                releaseCardModel_.mo15738L(listener);
                add(releaseCardModel_);
            }
        } else {
            for (Release release2 : releases) {
                ReleaseModel_ releaseModel_ = new ReleaseModel_();
                releaseModel_.mo15761b(release2.getId());
                releaseModel_.mo15763e(release2.getTitleRu());
                releaseModel_.mo15769n(release2.getEpisodesReleased());
                releaseModel_.mo15768m(release2.getEpisodesTotal());
                releaseModel_.mo15766h(Double.valueOf(release2.getGrade()));
                releaseModel_.mo15765g(release2.getDescription());
                releaseModel_.mo15762c(release2.getImage());
                releaseModel_.mo15756A(release2.getYear());
                releaseModel_.mo15758I(release2.getSeason());
                ReleaseStatus status2 = release2.getStatus();
                releaseModel_.mo15757C(status2 != null ? Long.valueOf(status2.getId()) : null);
                releaseModel_.mo15759J(release2.getAiredOnDate());
                releaseModel_.mo15764f(release2.getIsFavorite());
                releaseModel_.mo15770o(release2.getProfileListStatus());
                releaseModel_.mo15767i(release2.getVoteCount() > 50);
                releaseModel_.mo15760L(listener);
                add(releaseModel_);
            }
        }
        if (isLoadable) {
            LoadingModel_ loadingModel_ = new LoadingModel_();
            loadingModel_.mo15729a("loading");
            add(loadingModel_);
        }
    }
}
