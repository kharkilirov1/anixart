package com.swiftsoft.anixartd.p015ui.controller.main.search;

import com.airbnb.epoxy.EpoxyModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Related;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.Search;
import com.swiftsoft.anixartd.epoxy.Typed13EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModel_;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseHistoryModel;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseHistoryModel_;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel_;
import com.swiftsoft.anixartd.p015ui.model.main.DescModel;
import com.swiftsoft.anixartd.p015ui.model.main.DescModel_;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModel_;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ProfileModel;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ProfileModel_;
import com.swiftsoft.anixartd.p015ui.model.main.search.EmptyModel_;
import com.swiftsoft.anixartd.p015ui.model.main.search.SearchModel;
import com.swiftsoft.anixartd.p015ui.model.main.search.SearchModel_;
import com.swiftsoft.anixartd.p015ui.model.main.search.SearchRelatedModel;
import com.swiftsoft.anixartd.p015ui.model.main.search.SearchRelatedModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031j.C6523a;

/* compiled from: SearchUiController.kt */
@Metadata(m31883d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002j\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\fJ\u008a\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000bH\u0014J\u0006\u0010\u001c\u001a\u00020\u0003¨\u0006\u001e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/search/SearchUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed13EpoxyController;", "", "", "", "", "Lcom/swiftsoft/anixartd/database/entity/Search;", "Lcom/swiftsoft/anixartd/database/entity/Release;", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "Lcom/swiftsoft/anixartd/database/entity/Related;", "Lcom/swiftsoft/anixartd/ui/controller/main/search/SearchUiController$Listener;", "()V", "buildModels", "", "viewType", "isSponsor", "action", "searches", "releases", "collections", "profiles", "related", "selectedSearchBy", "selectedTab", "selectedInnerTab", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class SearchUiController extends Typed13EpoxyController<Integer, Boolean, String, List<? extends Search>, List<? extends Release>, List<? extends Collection>, List<? extends Profile>, Related, Integer, String, String, Boolean, Listener> {

    /* compiled from: SearchUiController.kt */
    @Metadata(m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/search/SearchUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/DescModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/search/SearchModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ReleaseModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ReleaseHistoryModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/profile/ProfileModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/search/SearchRelatedModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends DescModel.Listener, SearchModel.Listener, ReleaseModel.Listener, ReleaseHistoryModel.Listener, ProfileModel.Listener, CollectionModel.Listener, SearchRelatedModel.Listener {
    }

    public SearchUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
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
    public static final int buildModels$lambda$13$lambda$12(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$20$lambda$19$lambda$18(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$23$lambda$22$lambda$21(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$3$lambda$2(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$6$lambda$5$lambda$4(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$9$lambda$8$lambda$7(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed13EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Integer num, Boolean bool, String str, List<? extends Search> list, List<? extends Release> list2, List<? extends Collection> list3, List<? extends Profile> list4, Related related, Integer num2, String str2, String str3, Boolean bool2, Listener listener) {
        buildModels(num.intValue(), bool.booleanValue(), str, (List<Search>) list, (List<Release>) list2, (List<Collection>) list3, (List<Profile>) list4, related, num2.intValue(), str2, str3, bool2.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(int viewType, boolean isSponsor, @NotNull String action, @NotNull List<Search> searches, @NotNull List<Release> releases, @NotNull List<Collection> collections, @NotNull List<Profile> profiles, @Nullable Related related, int selectedSearchBy, @NotNull String selectedTab, @NotNull String selectedInnerTab, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(action, "action");
        Intrinsics.m32179h(searches, "searches");
        Intrinsics.m32179h(releases, "releases");
        Intrinsics.m32179h(collections, "collections");
        Intrinsics.m32179h(profiles, "profiles");
        Intrinsics.m32179h(selectedTab, "selectedTab");
        Intrinsics.m32179h(selectedInnerTab, "selectedInnerTab");
        Intrinsics.m32179h(listener, "listener");
        if (action.length() > 0) {
            if (!Intrinsics.m32174c(action, "ACTION_SEARCHES") && releases.isEmpty() && collections.isEmpty() && profiles.isEmpty()) {
                EpoxyModel<?> emptyModel_ = new EmptyModel_();
                emptyModel_.m4520h2("empty");
                emptyModel_.f6932i = C6523a.f63016g;
                add(emptyModel_);
                return;
            }
            Integer valueOf = (Intrinsics.m32174c(action, "ACTION_SEARCHES") && (searches.isEmpty() ^ true)) ? Integer.valueOf(C2507R.string.history_of_search) : ((releases.isEmpty() ^ true) || (profiles.isEmpty() ^ true)) ? Integer.valueOf(C2507R.string.result_of_search) : null;
            if (valueOf != null) {
                Intrinsics.m32176e(related);
                if (related.isEmpty() && selectedSearchBy != 0) {
                    DescModel_ descModel_ = new DescModel_();
                    descModel_.m4520h2("desc");
                    int intValue = valueOf.intValue();
                    descModel_.m4524l2();
                    descModel_.f29461k = intValue;
                    descModel_.m4524l2();
                    descModel_.f29462l = listener;
                    descModel_.f6932i = C6523a.f63017h;
                    add(descModel_);
                }
            }
            if (releases.isEmpty() && profiles.isEmpty()) {
                for (Search search : searches) {
                    SearchModel_ searchModel_ = new SearchModel_();
                    searchModel_.m16267w2(search.getId());
                    searchModel_.m16268x2(search.getQuery());
                    searchModel_.m4524l2();
                    searchModel_.f30098l = listener;
                    searchModel_.f6932i = C6523a.f63018i;
                    add(searchModel_);
                }
            }
            if (Intrinsics.m32174c(selectedInnerTab, "INNER_TAB_BOOKMARKS_HISTORY")) {
                for (Release release : releases) {
                    ReleaseHistoryModel_ releaseHistoryModel_ = new ReleaseHistoryModel_();
                    releaseHistoryModel_.m15752x2(release.getId());
                    String titleRu = release.getTitleRu();
                    releaseHistoryModel_.m4524l2();
                    releaseHistoryModel_.f29402k = titleRu;
                    Integer episodesReleased = release.getEpisodesReleased();
                    releaseHistoryModel_.m4524l2();
                    releaseHistoryModel_.f29403l = episodesReleased;
                    Integer episodesTotal = release.getEpisodesTotal();
                    releaseHistoryModel_.m4524l2();
                    releaseHistoryModel_.f29404m = episodesTotal;
                    Double valueOf2 = Double.valueOf(release.getGrade());
                    releaseHistoryModel_.m4524l2();
                    releaseHistoryModel_.f29405n = valueOf2;
                    String image = release.getImage();
                    releaseHistoryModel_.m4524l2();
                    releaseHistoryModel_.f29406o = image;
                    boolean isFavorite = release.getIsFavorite();
                    releaseHistoryModel_.m4524l2();
                    releaseHistoryModel_.f29407p = isFavorite;
                    int profileListStatus = release.getProfileListStatus();
                    releaseHistoryModel_.m4524l2();
                    releaseHistoryModel_.f29408q = profileListStatus;
                    String lastViewEpisodeName = release.getLastViewEpisodeName();
                    releaseHistoryModel_.m4524l2();
                    releaseHistoryModel_.f29409r = lastViewEpisodeName;
                    String lastViewEpisodeTypeName = release.getLastViewEpisodeTypeName();
                    releaseHistoryModel_.m4524l2();
                    releaseHistoryModel_.f29410s = lastViewEpisodeTypeName;
                    long lastViewTimestamp = release.getLastViewTimestamp();
                    releaseHistoryModel_.m4524l2();
                    releaseHistoryModel_.f29411t = lastViewTimestamp;
                    boolean z = release.getVoteCount() > 50;
                    releaseHistoryModel_.m4524l2();
                    releaseHistoryModel_.f29412u = z;
                    releaseHistoryModel_.m4524l2();
                    releaseHistoryModel_.f29413v = listener;
                    releaseHistoryModel_.f6932i = C6523a.f63019j;
                    add(releaseHistoryModel_);
                }
            } else {
                Intrinsics.m32176e(related);
                if (!related.isEmpty() && selectedSearchBy == 0) {
                    SearchRelatedModel_ searchRelatedModel_ = new SearchRelatedModel_();
                    searchRelatedModel_.m4520h2("searchRelated");
                    long id2 = related.getId();
                    searchRelatedModel_.m4524l2();
                    searchRelatedModel_.f30100k = id2;
                    searchRelatedModel_.m16273y2(related.getNameRu());
                    String description = related.getDescription();
                    searchRelatedModel_.m4524l2();
                    searchRelatedModel_.f30102m = description;
                    searchRelatedModel_.m16272x2(related.getImage());
                    long releaseCount = related.getReleaseCount();
                    searchRelatedModel_.m4524l2();
                    searchRelatedModel_.f30104o = releaseCount;
                    List<String> images = related.getImages();
                    String str = images != null ? (String) CollectionsKt.m32048y(images, 0) : null;
                    searchRelatedModel_.m4524l2();
                    searchRelatedModel_.f30105p = str;
                    List<String> images2 = related.getImages();
                    String str2 = images2 != null ? (String) CollectionsKt.m32048y(images2, 1) : null;
                    searchRelatedModel_.m4524l2();
                    searchRelatedModel_.f30106q = str2;
                    List<String> images3 = related.getImages();
                    String str3 = images3 != null ? (String) CollectionsKt.m32048y(images3, 2) : null;
                    searchRelatedModel_.m4524l2();
                    searchRelatedModel_.f30107r = str3;
                    searchRelatedModel_.m4524l2();
                    searchRelatedModel_.f30108s = listener;
                    searchRelatedModel_.f6932i = C6523a.f63020k;
                    add(searchRelatedModel_);
                    DescModel_ descModel_2 = new DescModel_();
                    descModel_2.m4520h2("descOther");
                    descModel_2.m4524l2();
                    descModel_2.f29461k = C2507R.string.result_of_search;
                    descModel_2.f6932i = C6523a.f63021l;
                    add(descModel_2);
                }
                if (viewType == 1) {
                    for (Release release2 : releases) {
                        ReleaseCardModel_ releaseCardModel_ = new ReleaseCardModel_();
                        releaseCardModel_.mo15739b(release2.getId());
                        String titleRu2 = release2.getTitleRu();
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29387k = titleRu2;
                        Integer episodesReleased2 = release2.getEpisodesReleased();
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29388l = episodesReleased2;
                        Integer episodesTotal2 = release2.getEpisodesTotal();
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29389m = episodesTotal2;
                        Double valueOf3 = Double.valueOf(release2.getGrade());
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29390n = valueOf3;
                        String description2 = release2.getDescription();
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29391o = description2;
                        String image2 = release2.getImage();
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29392p = image2;
                        String year = release2.getYear();
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29393q = year;
                        int season = release2.getSeason();
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29394r = season;
                        Long valueOf4 = Long.valueOf(release2.getStatusId());
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29396t = valueOf4;
                        long airedOnDate = release2.getAiredOnDate();
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29395s = airedOnDate;
                        boolean isFavorite2 = release2.getIsFavorite();
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29397u = isFavorite2;
                        int profileListStatus2 = release2.getProfileListStatus();
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29398v = profileListStatus2;
                        boolean z2 = release2.getVoteCount() > 50;
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29399w = z2;
                        releaseCardModel_.m4524l2();
                        releaseCardModel_.f29400x = listener;
                        add(releaseCardModel_);
                    }
                } else {
                    for (Release release3 : releases) {
                        ReleaseModel_ releaseModel_ = new ReleaseModel_();
                        releaseModel_.mo15761b(release3.getId());
                        String titleRu3 = release3.getTitleRu();
                        releaseModel_.m4524l2();
                        releaseModel_.f29416k = titleRu3;
                        Integer episodesReleased3 = release3.getEpisodesReleased();
                        releaseModel_.m4524l2();
                        releaseModel_.f29417l = episodesReleased3;
                        Integer episodesTotal3 = release3.getEpisodesTotal();
                        releaseModel_.m4524l2();
                        releaseModel_.f29418m = episodesTotal3;
                        Double valueOf5 = Double.valueOf(release3.getGrade());
                        releaseModel_.m4524l2();
                        releaseModel_.f29419n = valueOf5;
                        String description3 = release3.getDescription();
                        releaseModel_.m4524l2();
                        releaseModel_.f29420o = description3;
                        String image3 = release3.getImage();
                        releaseModel_.m4524l2();
                        releaseModel_.f29421p = image3;
                        String year2 = release3.getYear();
                        releaseModel_.m4524l2();
                        releaseModel_.f29422q = year2;
                        int season2 = release3.getSeason();
                        releaseModel_.m4524l2();
                        releaseModel_.f29423r = season2;
                        Long valueOf6 = Long.valueOf(release3.getStatusId());
                        releaseModel_.m4524l2();
                        releaseModel_.f29425t = valueOf6;
                        long airedOnDate2 = release3.getAiredOnDate();
                        releaseModel_.m4524l2();
                        releaseModel_.f29424s = airedOnDate2;
                        boolean isFavorite3 = release3.getIsFavorite();
                        releaseModel_.m4524l2();
                        releaseModel_.f29426u = isFavorite3;
                        int profileListStatus3 = release3.getProfileListStatus();
                        releaseModel_.m4524l2();
                        releaseModel_.f29427v = profileListStatus3;
                        boolean z3 = release3.getVoteCount() > 50;
                        releaseModel_.m4524l2();
                        releaseModel_.f29428w = z3;
                        releaseModel_.m4524l2();
                        releaseModel_.f29429x = listener;
                        add(releaseModel_);
                    }
                }
            }
            for (Collection collection : collections) {
                CollectionModel_ collectionModel_ = new CollectionModel_();
                collectionModel_.mo15843b(collection.getId());
                collectionModel_.mo15846j(collection.getTitle());
                collectionModel_.mo15844c(collection.getImage());
                long commentCount = collection.getCommentCount();
                collectionModel_.m4524l2();
                collectionModel_.f29507n = commentCount;
                int favoriteCount = collection.getFavoriteCount();
                collectionModel_.m4524l2();
                collectionModel_.f29508o = favoriteCount;
                boolean isPrivate = collection.getIsPrivate();
                collectionModel_.m4524l2();
                collectionModel_.f29509p = isPrivate;
                boolean isFavorite4 = collection.getIsFavorite();
                collectionModel_.m4524l2();
                collectionModel_.f29510q = isFavorite4;
                collectionModel_.m4524l2();
                collectionModel_.f29511r = listener;
                collectionModel_.f6932i = C6523a.f63022m;
                add(collectionModel_);
            }
            for (Profile profile : profiles) {
                ProfileModel_ profileModel_ = new ProfileModel_();
                profileModel_.m16055w2(profile.getId());
                profileModel_.m16056x2(profile.getLogin());
                String avatar = profile.getAvatar();
                profileModel_.m4524l2();
                profileModel_.f29831l = avatar;
                boolean isOnline = profile.getIsOnline();
                profileModel_.m4524l2();
                profileModel_.f29832m = isOnline;
                boolean isSponsor2 = profile.getIsSponsor();
                profileModel_.m4524l2();
                profileModel_.f29833n = isSponsor2;
                boolean isVerified = profile.getIsVerified();
                profileModel_.m4524l2();
                profileModel_.f29834o = isVerified;
                profileModel_.m4524l2();
                profileModel_.f29835p = listener;
                profileModel_.f6932i = C6523a.f63023n;
                add(profileModel_);
            }
            if (isLoadable) {
                EpoxyModel<?> loadingModel_ = new LoadingModel_();
                loadingModel_.m4520h2("loading");
                add(loadingModel_);
            }
        }
    }
}
