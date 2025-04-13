package com.swiftsoft.anixartd.p015ui.controller.main.profile;

import com.airbnb.epoxy.Typed2EpoxyController;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.model.common.NoDataModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseHistoryCompactModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseVoteCompactModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseVoteCompactModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p029i.C6284a;

/* compiled from: ProfileReleaseVoteUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014J\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileReleaseVoteUiController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileReleaseVoteUiController$Listener;", "()V", "buildModels", "", "releases", "listener", "isEmpty", "", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileReleaseVoteUiController extends Typed2EpoxyController<List<? extends Release>, Listener> {

    /* compiled from: ProfileReleaseVoteUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileReleaseVoteUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/ReleaseHistoryCompactModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/ReleaseVoteCompactModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseHistoryCompactModel.Listener, ReleaseVoteCompactModel.Listener {
    }

    public ProfileReleaseVoteUiController() {
        setDebugLoggingEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$3$lambda$2(int i2, int i3, int i4) {
        return i2;
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
        if (!(!releases.isEmpty())) {
            NoDataModel_ noDataModel_ = new NoDataModel_();
            noDataModel_.mo15730a("empty");
            noDataModel_.mo15731d(C6284a.f58035o);
            add(noDataModel_);
            return;
        }
        for (Release release : releases) {
            ReleaseVoteCompactModel_ releaseVoteCompactModel_ = new ReleaseVoteCompactModel_();
            releaseVoteCompactModel_.mo16075b(release.getId());
            releaseVoteCompactModel_.mo16078e(release.getTitleRu());
            releaseVoteCompactModel_.mo16074a1(release.getMyVote());
            releaseVoteCompactModel_.mo16077c0(release.getVotedAt());
            releaseVoteCompactModel_.mo16076c(release.getImage());
            releaseVoteCompactModel_.mo16073T1(listener);
            add(releaseVoteCompactModel_);
        }
    }
}
