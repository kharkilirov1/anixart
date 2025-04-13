package com.swiftsoft.anixartd.p015ui.controller.main.discover;

import com.airbnb.epoxy.Typed2EpoxyController;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModel;
import com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DiscussingUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014J\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/discover/DiscussingUiController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "Lcom/swiftsoft/anixartd/ui/controller/main/discover/DiscussingUiController$Listener;", "()V", "buildModels", "", "releases", "listener", "isEmpty", "", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class DiscussingUiController extends Typed2EpoxyController<List<? extends Release>, Listener> {

    /* compiled from: DiscussingUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/discover/DiscussingUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/discover/DiscussModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends DiscussModel.Listener {
    }

    public DiscussingUiController() {
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
        for (Release release : releases) {
            DiscussModel_ discussModel_ = new DiscussModel_();
            discussModel_.mo15928b(release.getId());
            discussModel_.mo15931e(release.getTitleRu());
            discussModel_.mo15936n(release.getEpisodesReleased());
            discussModel_.mo15935m(release.getEpisodesTotal());
            discussModel_.mo15933h(Double.valueOf(release.getGrade()));
            discussModel_.mo15929b0(Integer.valueOf(release.getCommentPerDayCount()));
            discussModel_.mo15930c(release.getImage());
            discussModel_.mo15932f(release.getIsFavorite());
            discussModel_.mo15937o(release.getProfileListStatus());
            discussModel_.mo15934i(release.getVoteCount() > 50);
            discussModel_.mo15927D0(listener);
            add(discussModel_);
        }
    }
}
