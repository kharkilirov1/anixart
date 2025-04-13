package com.swiftsoft.anixartd.p015ui.controller.main.profile;

import com.airbnb.epoxy.Typed2EpoxyController;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.p015ui.model.common.NoDataModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseHistoryCompactModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseHistoryCompactModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p029i.C6284a;

/* compiled from: ProfileHistoryUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014J\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileHistoryUiController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileHistoryUiController$Listener;", "()V", "buildModels", "", "releases", "listener", "isEmpty", "", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileHistoryUiController extends Typed2EpoxyController<List<? extends Release>, Listener> {

    /* compiled from: ProfileHistoryUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileHistoryUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/ReleaseHistoryCompactModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseHistoryCompactModel.Listener {
    }

    public ProfileHistoryUiController() {
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
            noDataModel_.mo15731d(C6284a.f58034n);
            add(noDataModel_);
            return;
        }
        for (Release release : releases) {
            Episode lastViewEpisode = release.getLastViewEpisode();
            if (lastViewEpisode != null) {
                ReleaseHistoryCompactModel_ releaseHistoryCompactModel_ = new ReleaseHistoryCompactModel_();
                releaseHistoryCompactModel_.mo16065b(release.getId());
                releaseHistoryCompactModel_.mo16068e(release.getTitleRu());
                releaseHistoryCompactModel_.mo16064K0(lastViewEpisode.getName());
                releaseHistoryCompactModel_.mo16069h1(release.getLastViewTimestamp());
                releaseHistoryCompactModel_.mo16066c(release.getImage());
                releaseHistoryCompactModel_.mo16067c1(listener);
                add(releaseHistoryCompactModel_);
            }
        }
    }
}
