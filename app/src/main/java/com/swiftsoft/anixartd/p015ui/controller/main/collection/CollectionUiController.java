package com.swiftsoft.anixartd.p015ui.controller.main.collection;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseStatus;
import com.swiftsoft.anixartd.epoxy.Typed14EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel_;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCountReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCountReleaseModel_;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionHeaderModel_;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEmpty_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionUiController.kt */
@Metadata(m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\\\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\tJ~\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\bH\u0014J\u0006\u0010\u001a\u001a\u00020\u0004¨\u0006\u001c"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed14EpoxyController;", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "", "", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "", "Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionUiController$Listener;", "()V", "buildModels", "", "collection", "avatar", "isMyCollection", "releases", "totalCount", "watchingCount", "planCount", "completedCount", "holdOnCount", "droppedCount", "isInitialLoading", "isLoadable", "isError", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CollectionUiController extends Typed14EpoxyController<Collection, String, Boolean, List<? extends Release>, Long, Long, Long, Long, Long, Long, Boolean, Boolean, Boolean, Listener> {

    /* compiled from: CollectionUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionHeaderModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ReleaseModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ErrorModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionCountReleaseModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CollectionHeaderModel.Listener, ReleaseModel.Listener, ErrorModel.Listener, CollectionCountReleaseModel.Listener {
    }

    public CollectionUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed14EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Collection collection, String str, Boolean bool, List<? extends Release> list, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Boolean bool2, Boolean bool3, Boolean bool4, Listener listener) {
        buildModels(collection, str, bool.booleanValue(), (List<Release>) list, l2.longValue(), l3.longValue(), l4.longValue(), l5.longValue(), l6.longValue(), l7.longValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull Collection collection, @NotNull String avatar, boolean isMyCollection, @NotNull List<Release> releases, long totalCount, long watchingCount, long planCount, long completedCount, long holdOnCount, long droppedCount, boolean isInitialLoading, boolean isLoadable, boolean isError, @NotNull Listener listener) {
        Intrinsics.m32179h(collection, "collection");
        Intrinsics.m32179h(avatar, "avatar");
        Intrinsics.m32179h(releases, "releases");
        Intrinsics.m32179h(listener, "listener");
        CollectionHeaderModel_ collectionHeaderModel_ = new CollectionHeaderModel_();
        collectionHeaderModel_.mo15830a("collectionHeader");
        collectionHeaderModel_.mo15833j(collection.getTitle());
        collectionHeaderModel_.mo15832g(collection.getDescription());
        collectionHeaderModel_.mo15831c(collection.getImage());
        collectionHeaderModel_.mo15837v0(collection.getCreationDate());
        collectionHeaderModel_.mo15835o1(collection.getLastUpdateDate());
        collectionHeaderModel_.mo15826H(collection.getCommentCount());
        collectionHeaderModel_.mo15825G(collection.getFavoriteCount());
        collectionHeaderModel_.mo15836s0(collection.getIsFavorite());
        collectionHeaderModel_.mo15828U(collection.getIsPrivate());
        collectionHeaderModel_.mo15834l(avatar);
        collectionHeaderModel_.mo15827H1(isMyCollection);
        collectionHeaderModel_.mo15829X0(listener);
        add(collectionHeaderModel_);
        if (!releases.isEmpty()) {
            CollectionCountReleaseModel_ collectionCountReleaseModel_ = new CollectionCountReleaseModel_();
            collectionCountReleaseModel_.mo15815a("collectionCountRelease");
            collectionCountReleaseModel_.mo15814Y(totalCount);
            collectionCountReleaseModel_.mo15813W1(watchingCount);
            collectionCountReleaseModel_.mo15819z1(planCount);
            collectionCountReleaseModel_.mo15816i0(completedCount);
            collectionCountReleaseModel_.mo15817m0(holdOnCount);
            collectionCountReleaseModel_.mo15818q1(droppedCount);
            collectionCountReleaseModel_.mo15812S0(listener);
            add(collectionCountReleaseModel_);
            for (Release release : releases) {
                ReleaseModel_ releaseModel_ = new ReleaseModel_();
                releaseModel_.mo15761b(release.getId());
                releaseModel_.mo15763e(release.getTitleRu());
                releaseModel_.mo15769n(release.getEpisodesReleased());
                releaseModel_.mo15768m(release.getEpisodesTotal());
                releaseModel_.mo15766h(Double.valueOf(release.getGrade()));
                releaseModel_.mo15765g(release.getDescription());
                releaseModel_.mo15762c(release.getImage());
                releaseModel_.mo15756A(release.getYear());
                releaseModel_.mo15758I(release.getSeason());
                ReleaseStatus status = release.getStatus();
                releaseModel_.mo15757C(status != null ? Long.valueOf(status.getId()) : null);
                releaseModel_.mo15759J(release.getAiredOnDate());
                releaseModel_.mo15764f(release.getIsFavorite());
                releaseModel_.mo15770o(release.getProfileListStatus());
                releaseModel_.mo15767i(release.getVoteCount() > 50);
                releaseModel_.mo15760L(listener);
                add(releaseModel_);
            }
        }
        if (!isInitialLoading && !isError && totalCount == 0) {
            CollectionReleaseEmpty_ collectionReleaseEmpty_ = new CollectionReleaseEmpty_();
            collectionReleaseEmpty_.mo15861a("collectionReleaseEmpty");
            add(collectionReleaseEmpty_);
        }
        if ((isInitialLoading || isLoadable) && !isError) {
            LoadingModel_ loadingModel_ = new LoadingModel_();
            loadingModel_.mo15729a("loading");
            add(loadingModel_);
        }
        if (isError) {
            ErrorModel_ errorModel_ = new ErrorModel_();
            errorModel_.mo15725a("error");
            errorModel_.mo15724V1(listener);
            add(errorModel_);
        }
    }
}
