package com.swiftsoft.anixartd.p015ui.controller.main.profile.vote;

import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.Typed4EpoxyController;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.vote.EmptyModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.vote.ReleaseVoteModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.vote.ReleaseVoteModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p029i.C6284a;

/* compiled from: ProfileReleaseUnvotedUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0007J.\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006H\u0014J\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/vote/ProfileReleaseUnvotedUiController;", "Lcom/airbnb/epoxy/Typed4EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/vote/ProfileReleaseUnvotedUiController$Listener;", "()V", "buildModels", "", "releases", "totalCount", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileReleaseUnvotedUiController extends Typed4EpoxyController<List<? extends Release>, Long, Boolean, Listener> {

    /* compiled from: ProfileReleaseUnvotedUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/vote/ProfileReleaseUnvotedUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/vote/ReleaseVoteModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseVoteModel.Listener {
    }

    public ProfileReleaseUnvotedUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$1$lambda$0(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.airbnb.epoxy.Typed4EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Release> list, Long l2, Boolean bool, Listener listener) {
        buildModels((List<Release>) list, l2.longValue(), bool.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<Release> releases, long totalCount, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(releases, "releases");
        Intrinsics.m32179h(listener, "listener");
        if (releases.isEmpty()) {
            EmptyModel_ emptyModel_ = new EmptyModel_();
            emptyModel_.m4520h2("empty");
            emptyModel_.m4524l2();
            emptyModel_.f29939k = C2507R.string.empty_release_unvoted;
            emptyModel_.f6932i = C6284a.f58021C;
            add(emptyModel_);
            return;
        }
        for (Release release : releases) {
            ReleaseVoteModel_ releaseVoteModel_ = new ReleaseVoteModel_();
            releaseVoteModel_.m16159x2(release.getId());
            String titleRu = release.getTitleRu();
            releaseVoteModel_.m4524l2();
            releaseVoteModel_.f29947k = titleRu;
            Integer episodesReleased = release.getEpisodesReleased();
            releaseVoteModel_.m4524l2();
            releaseVoteModel_.f29948l = episodesReleased;
            Integer episodesTotal = release.getEpisodesTotal();
            releaseVoteModel_.m4524l2();
            releaseVoteModel_.f29949m = episodesTotal;
            Double valueOf = Double.valueOf(release.getGrade());
            releaseVoteModel_.m4524l2();
            releaseVoteModel_.f29950n = valueOf;
            String image = release.getImage();
            releaseVoteModel_.m4524l2();
            releaseVoteModel_.f29951o = image;
            boolean isFavorite = release.getIsFavorite();
            releaseVoteModel_.m4524l2();
            releaseVoteModel_.f29952p = isFavorite;
            int profileListStatus = release.getProfileListStatus();
            releaseVoteModel_.m4524l2();
            releaseVoteModel_.f29953q = profileListStatus;
            Integer myVote = release.getMyVote();
            releaseVoteModel_.m4524l2();
            releaseVoteModel_.f29954r = myVote;
            long votedAt = release.getVotedAt();
            releaseVoteModel_.m4524l2();
            releaseVoteModel_.f29955s = votedAt;
            boolean z = release.getVoteCount() > 50;
            releaseVoteModel_.m4524l2();
            releaseVoteModel_.f29957u = z;
            releaseVoteModel_.m4524l2();
            releaseVoteModel_.f29958v = listener;
            add(releaseVoteModel_);
        }
        if (isLoadable) {
            EpoxyModel<?> loadingModel_ = new LoadingModel_();
            loadingModel_.m4520h2("loading");
            add(loadingModel_);
        }
    }
}
