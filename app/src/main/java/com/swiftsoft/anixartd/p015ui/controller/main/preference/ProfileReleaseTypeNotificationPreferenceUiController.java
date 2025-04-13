package com.swiftsoft.anixartd.p015ui.controller.main.preference;

import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.epoxy.Typed5EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.EmptyModel_;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModel;
import com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseTypeNotificationPreferenceUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0007J6\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0006H\u0014J\u0006\u0010\u000f\u001a\u00020\u0005¨\u0006\u0011"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/preference/ProfileReleaseTypeNotificationPreferenceUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed5EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/preference/ProfileReleaseTypeNotificationPreferenceUiController$Listener;", "()V", "buildModels", "", "releases", "totalTypeCount", "isLoadable", "isError", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileReleaseTypeNotificationPreferenceUiController extends Typed5EpoxyController<List<? extends Release>, Integer, Boolean, Boolean, Listener> {

    /* compiled from: ProfileReleaseTypeNotificationPreferenceUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/preference/ProfileReleaseTypeNotificationPreferenceUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/preference/ReleaseNotificationPreferenceModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ErrorModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseNotificationPreferenceModel.Listener, ErrorModel.Listener {
    }

    public ProfileReleaseTypeNotificationPreferenceUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed5EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Release> list, Integer num, Boolean bool, Boolean bool2, Listener listener) {
        buildModels((List<Release>) list, num.intValue(), bool.booleanValue(), bool2.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<Release> releases, int totalTypeCount, boolean isLoadable, boolean isError, @NotNull Listener listener) {
        Intrinsics.m32179h(releases, "releases");
        Intrinsics.m32179h(listener, "listener");
        if (releases.isEmpty()) {
            EmptyModel_ emptyModel_ = new EmptyModel_();
            emptyModel_.mo15721a("empty");
            emptyModel_.mo15723k0(C2507R.string.empty_notification_release_type);
            add(emptyModel_);
        }
        if (!releases.isEmpty()) {
            for (Release release : releases) {
                ReleaseNotificationPreferenceModel_ releaseNotificationPreferenceModel_ = new ReleaseNotificationPreferenceModel_();
                releaseNotificationPreferenceModel_.mo16043b(release.getId());
                releaseNotificationPreferenceModel_.mo16045e(release.getTitleRu());
                releaseNotificationPreferenceModel_.mo16050n(release.getEpisodesReleased());
                releaseNotificationPreferenceModel_.mo16049m(release.getEpisodesTotal());
                releaseNotificationPreferenceModel_.mo16047h(Double.valueOf(release.getGrade()));
                releaseNotificationPreferenceModel_.mo16044c(release.getImage());
                releaseNotificationPreferenceModel_.mo16046f(release.getIsFavorite());
                releaseNotificationPreferenceModel_.mo16051o(release.getProfileListStatus());
                releaseNotificationPreferenceModel_.mo16048i(release.getVoteCount() > 50);
                releaseNotificationPreferenceModel_.mo16041F1(release.getProfileReleaseTypeNotificationPreferenceCount());
                releaseNotificationPreferenceModel_.mo16052p1(totalTypeCount);
                releaseNotificationPreferenceModel_.mo16042R0(listener);
                add(releaseNotificationPreferenceModel_);
            }
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
