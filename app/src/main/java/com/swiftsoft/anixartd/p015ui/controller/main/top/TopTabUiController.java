package com.swiftsoft.anixartd.p015ui.controller.main.top;

import com.airbnb.epoxy.Typed2EpoxyController;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel;
import com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TopTabUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014J\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/top/TopTabUiController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "Lcom/swiftsoft/anixartd/ui/controller/main/top/TopTabUiController$Listener;", "()V", "buildModels", "", "releases", "listener", "isEmpty", "", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class TopTabUiController extends Typed2EpoxyController<List<? extends Release>, Listener> {

    /* compiled from: TopTabUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/top/TopTabUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/TopReleaseModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ErrorModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends TopReleaseModel.Listener, ErrorModel.Listener {
    }

    public TopTabUiController() {
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
        int i2 = 0;
        for (Object obj : releases) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            Release release = (Release) obj;
            TopReleaseModel_ topReleaseModel_ = new TopReleaseModel_();
            topReleaseModel_.mo15786b(release.getId());
            topReleaseModel_.mo15788e(release.getTitleRu());
            topReleaseModel_.mo15794n(release.getEpisodesReleased());
            topReleaseModel_.mo15793m(release.getEpisodesTotal());
            topReleaseModel_.mo15791h(Double.valueOf(release.getGrade()));
            topReleaseModel_.mo15790g(release.getDescription());
            topReleaseModel_.mo15787c(release.getImage());
            topReleaseModel_.mo15789f(release.getIsFavorite());
            topReleaseModel_.mo15795o(release.getProfileListStatus());
            topReleaseModel_.mo15785P1(String.valueOf(i3));
            topReleaseModel_.mo15792i(release.getVoteCount() > 50);
            topReleaseModel_.mo15784C0(listener);
            add(topReleaseModel_);
            i2 = i3;
        }
    }
}
