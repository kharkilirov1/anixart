package com.swiftsoft.anixartd.p015ui.controller.main.home;

import com.airbnb.epoxy.EpoxyModel;
import com.google.android.exoplayer2.trackselection.C1136a;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseStatus;
import com.swiftsoft.anixartd.epoxy.Typed13EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModel_;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel_;
import com.swiftsoft.anixartd.p015ui.model.common.SpaceModel_;
import com.swiftsoft.anixartd.p015ui.model.extra.ImpMessageModel;
import com.swiftsoft.anixartd.p015ui.model.extra.ImpMessageModel_;
import com.swiftsoft.anixartd.p015ui.model.extra.LiteVersionModel;
import com.swiftsoft.anixartd.p015ui.model.extra.UpdateAvailableModel;
import com.swiftsoft.anixartd.p015ui.model.extra.UpdateAvailableModel_;
import com.swiftsoft.anixartd.p015ui.model.main.home.CustomFilterEmptyModel;
import com.swiftsoft.anixartd.p015ui.model.main.home.CustomFilterEmptyModel_;
import com.swiftsoft.anixartd.p015ui.model.main.home.CustomFilterHintBigModel;
import com.swiftsoft.anixartd.p015ui.model.main.home.CustomFilterHintBigModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p029i.C6284a;

/* compiled from: CustomFilterTabUiController.kt */
@Metadata(m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002V\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\tJv\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bH\u0014J\u0006\u0010\u0019\u001a\u00020\u0006¨\u0006\u001b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/home/CustomFilterTabUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed13EpoxyController;", "", "", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/home/CustomFilterTabUiController$Listener;", "()V", "buildModels", "", "viewType", "id", "releases", "isLoadable", "isError", "lastVersionCode", "impMessageEnabled", "impMessageText", "impMessageBackgroundColor", "impMessageTextColor", "impMessageLink", "customTabHint", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CustomFilterTabUiController extends Typed13EpoxyController<Integer, Long, List<? extends Release>, Boolean, Boolean, Integer, Boolean, String, String, String, String, Boolean, Listener> {

    /* compiled from: CustomFilterTabUiController.kt */
    @Metadata(m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/home/CustomFilterTabUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ReleaseModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ErrorModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/extra/UpdateAvailableModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/extra/LiteVersionModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/extra/ImpMessageModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/home/CustomFilterEmptyModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/home/CustomFilterHintBigModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseModel.Listener, ErrorModel.Listener, UpdateAvailableModel.Listener, LiteVersionModel.Listener, ImpMessageModel.Listener, CustomFilterEmptyModel.Listener, CustomFilterHintBigModel.Listener {
    }

    public CustomFilterTabUiController() {
        setDebugLoggingEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$1$lambda$0(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$11$lambda$10(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$3$lambda$2(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$5$lambda$4(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$7$lambda$6(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$9$lambda$8(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed13EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Integer num, Long l2, List<? extends Release> list, Boolean bool, Boolean bool2, Integer num2, Boolean bool3, String str, String str2, String str3, String str4, Boolean bool4, Listener listener) {
        buildModels(num.intValue(), l2.longValue(), (List<Release>) list, bool.booleanValue(), bool2.booleanValue(), num2.intValue(), bool3.booleanValue(), str, str2, str3, str4, bool4.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(int viewType, long id2, @NotNull List<Release> releases, boolean isLoadable, boolean isError, int lastVersionCode, boolean impMessageEnabled, @NotNull String impMessageText, @NotNull String impMessageBackgroundColor, @NotNull String impMessageTextColor, @NotNull String impMessageLink, boolean customTabHint, @NotNull Listener listener) {
        Intrinsics.m32179h(releases, "releases");
        Intrinsics.m32179h(impMessageText, "impMessageText");
        Intrinsics.m32179h(impMessageBackgroundColor, "impMessageBackgroundColor");
        Intrinsics.m32179h(impMessageTextColor, "impMessageTextColor");
        Intrinsics.m32179h(impMessageLink, "impMessageLink");
        Intrinsics.m32179h(listener, "listener");
        EpoxyModel<?> spaceModel_ = new SpaceModel_();
        spaceModel_.m4520h2("space");
        spaceModel_.f6932i = C1136a.f14059z;
        add(spaceModel_);
        if (24111318 < lastVersionCode && id2 == 0) {
            UpdateAvailableModel_ updateAvailableModel_ = new UpdateAvailableModel_();
            updateAvailableModel_.m4520h2("updateAvailable");
            updateAvailableModel_.m4524l2();
            updateAvailableModel_.f29460k = listener;
            updateAvailableModel_.f6932i = C6284a.f58023c;
            add(updateAvailableModel_);
        }
        if (impMessageEnabled && id2 == 0) {
            ImpMessageModel_ impMessageModel_ = new ImpMessageModel_();
            impMessageModel_.m4520h2("impMessage");
            impMessageModel_.m4524l2();
            impMessageModel_.f29454k = impMessageText;
            impMessageModel_.m4524l2();
            impMessageModel_.f29456m = impMessageBackgroundColor;
            impMessageModel_.m4524l2();
            impMessageModel_.f29457n = impMessageTextColor;
            impMessageModel_.m4524l2();
            impMessageModel_.f29455l = impMessageLink;
            impMessageModel_.m4524l2();
            impMessageModel_.f29458o = listener;
            impMessageModel_.f6932i = C6284a.f58024d;
            add(impMessageModel_);
        }
        if (releases.isEmpty()) {
            CustomFilterEmptyModel_ customFilterEmptyModel_ = new CustomFilterEmptyModel_();
            customFilterEmptyModel_.m4520h2("customFilterEmpty");
            customFilterEmptyModel_.m4524l2();
            customFilterEmptyModel_.f29741k = listener;
            customFilterEmptyModel_.f6932i = C6284a.f58025e;
            add(customFilterEmptyModel_);
        } else if (customTabHint) {
            CustomFilterHintBigModel_ customFilterHintBigModel_ = new CustomFilterHintBigModel_();
            customFilterHintBigModel_.m4520h2("customFilterHint");
            customFilterHintBigModel_.m4524l2();
            customFilterHintBigModel_.f29743k = listener;
            customFilterHintBigModel_.f6932i = C6284a.f58026f;
            add(customFilterHintBigModel_);
        }
        if (viewType == 1) {
            for (Release release : releases) {
                ReleaseCardModel_ releaseCardModel_ = new ReleaseCardModel_();
                releaseCardModel_.mo15739b(release.getId());
                String titleRu = release.getTitleRu();
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29387k = titleRu;
                Integer episodesReleased = release.getEpisodesReleased();
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29388l = episodesReleased;
                Integer episodesTotal = release.getEpisodesTotal();
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29389m = episodesTotal;
                Double valueOf = Double.valueOf(release.getGrade());
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29390n = valueOf;
                String description = release.getDescription();
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29391o = description;
                String image = release.getImage();
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29392p = image;
                String year = release.getYear();
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29393q = year;
                int season = release.getSeason();
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29394r = season;
                ReleaseStatus status = release.getStatus();
                Long valueOf2 = status != null ? Long.valueOf(status.getId()) : null;
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29396t = valueOf2;
                long airedOnDate = release.getAiredOnDate();
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29395s = airedOnDate;
                boolean isFavorite = release.getIsFavorite();
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29397u = isFavorite;
                int profileListStatus = release.getProfileListStatus();
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29398v = profileListStatus;
                boolean z = release.getVoteCount() > 50;
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29399w = z;
                releaseCardModel_.m4524l2();
                releaseCardModel_.f29400x = listener;
                add(releaseCardModel_);
            }
        } else {
            for (Release release2 : releases) {
                ReleaseModel_ releaseModel_ = new ReleaseModel_();
                releaseModel_.mo15761b(release2.getId());
                String titleRu2 = release2.getTitleRu();
                releaseModel_.m4524l2();
                releaseModel_.f29416k = titleRu2;
                Integer episodesReleased2 = release2.getEpisodesReleased();
                releaseModel_.m4524l2();
                releaseModel_.f29417l = episodesReleased2;
                Integer episodesTotal2 = release2.getEpisodesTotal();
                releaseModel_.m4524l2();
                releaseModel_.f29418m = episodesTotal2;
                Double valueOf3 = Double.valueOf(release2.getGrade());
                releaseModel_.m4524l2();
                releaseModel_.f29419n = valueOf3;
                String description2 = release2.getDescription();
                releaseModel_.m4524l2();
                releaseModel_.f29420o = description2;
                String image2 = release2.getImage();
                releaseModel_.m4524l2();
                releaseModel_.f29421p = image2;
                String year2 = release2.getYear();
                releaseModel_.m4524l2();
                releaseModel_.f29422q = year2;
                int season2 = release2.getSeason();
                releaseModel_.m4524l2();
                releaseModel_.f29423r = season2;
                ReleaseStatus status2 = release2.getStatus();
                Long valueOf4 = status2 != null ? Long.valueOf(status2.getId()) : null;
                releaseModel_.m4524l2();
                releaseModel_.f29425t = valueOf4;
                long airedOnDate2 = release2.getAiredOnDate();
                releaseModel_.m4524l2();
                releaseModel_.f29424s = airedOnDate2;
                boolean isFavorite2 = release2.getIsFavorite();
                releaseModel_.m4524l2();
                releaseModel_.f29426u = isFavorite2;
                int profileListStatus2 = release2.getProfileListStatus();
                releaseModel_.m4524l2();
                releaseModel_.f29427v = profileListStatus2;
                boolean z2 = release2.getVoteCount() > 50;
                releaseModel_.m4524l2();
                releaseModel_.f29428w = z2;
                releaseModel_.m4524l2();
                releaseModel_.f29429x = listener;
                add(releaseModel_);
            }
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
