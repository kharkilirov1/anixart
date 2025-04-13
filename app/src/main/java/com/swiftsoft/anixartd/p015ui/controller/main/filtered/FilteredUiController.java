package com.swiftsoft.anixartd.p015ui.controller.main.filtered;

import com.google.android.exoplayer2.trackselection.C1136a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.epoxy.Typed5EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModel_;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel_;
import com.swiftsoft.anixartd.p015ui.model.main.DescModel;
import com.swiftsoft.anixartd.p015ui.model.main.DescModel_;
import com.swiftsoft.anixartd.p015ui.model.main.filtered.EmptyModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FilteredUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0007J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H\u0014J\u0006\u0010\u000f\u001a\u00020\u0003¨\u0006\u0011"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/filtered/FilteredUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed5EpoxyController;", "", "", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "Lcom/swiftsoft/anixartd/ui/controller/main/filtered/FilteredUiController$Listener;", "()V", "buildModels", "", "viewType", "isSponsor", "releases", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class FilteredUiController extends Typed5EpoxyController<Integer, Boolean, List<? extends Release>, Boolean, Listener> {

    /* compiled from: FilteredUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/filtered/FilteredUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/DescModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ReleaseModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends DescModel.Listener, ReleaseModel.Listener {
    }

    public FilteredUiController() {
        setDebugLoggingEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$1$lambda$0(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$3$lambda$2(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed5EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Integer num, Boolean bool, List<? extends Release> list, Boolean bool2, Listener listener) {
        buildModels(num.intValue(), bool.booleanValue(), (List<Release>) list, bool2.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(int viewType, boolean isSponsor, @NotNull List<Release> releases, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(releases, "releases");
        Intrinsics.m32179h(listener, "listener");
        if (releases.isEmpty()) {
            EmptyModel_ emptyModel_ = new EmptyModel_();
            emptyModel_.mo16008a("empty");
            emptyModel_.mo16009d(C1136a.f14057x);
            add(emptyModel_);
        }
        if (!releases.isEmpty()) {
            DescModel_ descModel_ = new DescModel_();
            descModel_.mo15799a("desc");
            descModel_.mo15798M0(C2507R.string.result_of_search);
            descModel_.mo15797J1(listener);
            descModel_.mo15800d(C1136a.f14058y);
            add(descModel_);
        }
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
                releaseCardModel_.mo15735C(Long.valueOf(release.getStatusId()));
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
                releaseModel_.mo15757C(Long.valueOf(release2.getStatusId()));
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
