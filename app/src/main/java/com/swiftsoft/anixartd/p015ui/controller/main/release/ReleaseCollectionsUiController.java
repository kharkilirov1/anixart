package com.swiftsoft.anixartd.p015ui.controller.main.release;

import com.airbnb.epoxy.EpoxyModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.epoxy.Typed6EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModel_;
import com.swiftsoft.anixartd.p015ui.model.main.collections.EmptyModel_;
import com.swiftsoft.anixartd.p015ui.model.main.collections.ExtraReleaseCollectionModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.ExtraReleaseCollectionModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p031j.C6523a;

/* compiled from: ReleaseCollectionsUiController.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002,\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\bJ>\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0007H\u0014J\u0006\u0010\u0011\u001a\u00020\u0006¨\u0006\u0013"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseCollectionsUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed6EpoxyController;", "", "", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseCollectionsUiController$Listener;", "()V", "buildModels", "", "releaseId", "collections", "totalCount", "selectedSort", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseCollectionsUiController extends Typed6EpoxyController<Long, List<? extends Collection>, Long, Integer, Boolean, Listener> {

    /* compiled from: ReleaseCollectionsUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseCollectionsUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/ExtraReleaseCollectionModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CollectionModel.Listener, ExtraReleaseCollectionModel.Listener {
    }

    public ReleaseCollectionsUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$2$lambda$1(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed6EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Long l2, List<? extends Collection> list, Long l3, Integer num, Boolean bool, Listener listener) {
        buildModels(l2.longValue(), (List<Collection>) list, l3.longValue(), num.intValue(), bool.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(long releaseId, @NotNull List<Collection> collections, long totalCount, int selectedSort, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(collections, "collections");
        Intrinsics.m32179h(listener, "listener");
        ExtraReleaseCollectionModel_ extraReleaseCollectionModel_ = new ExtraReleaseCollectionModel_();
        extraReleaseCollectionModel_.m4520h2("extraReleaseCollection");
        extraReleaseCollectionModel_.m4524l2();
        extraReleaseCollectionModel_.f29531l = C2507R.plurals.collections;
        extraReleaseCollectionModel_.m4524l2();
        extraReleaseCollectionModel_.f29532m = C2507R.string.collections_zero;
        extraReleaseCollectionModel_.m4524l2();
        extraReleaseCollectionModel_.f29533n = totalCount;
        extraReleaseCollectionModel_.m4524l2();
        extraReleaseCollectionModel_.f29534o = selectedSort;
        extraReleaseCollectionModel_.m4524l2();
        extraReleaseCollectionModel_.f29530k = listener;
        add(extraReleaseCollectionModel_);
        if (collections.isEmpty()) {
            EpoxyModel<?> emptyModel_ = new EmptyModel_();
            emptyModel_.m4520h2("empty");
            emptyModel_.f6932i = C6523a.f63015f;
            add(emptyModel_);
            return;
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
            boolean isFavorite = collection.getIsFavorite();
            collectionModel_.m4524l2();
            collectionModel_.f29510q = isFavorite;
            collectionModel_.m4524l2();
            collectionModel_.f29511r = listener;
            add(collectionModel_);
        }
    }
}
