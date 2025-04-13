package com.swiftsoft.anixartd.p015ui.controller.main.collection;

import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.Typed4EpoxyController;
import com.google.android.exoplayer2.trackselection.C1136a;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModel_;
import com.swiftsoft.anixartd.p015ui.model.main.collections.EmptyModel_;
import com.swiftsoft.anixartd.p015ui.model.main.collections.ExtraCollectionModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.ExtraCollectionModel_;
import com.swiftsoft.anixartd.p015ui.model.main.collections.HeaderCollectionModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.HeaderCollectionModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionListUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0007J.\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006H\u0014J\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionListUiController;", "Lcom/airbnb/epoxy/Typed4EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionListUiController$Listener;", "()V", "buildModels", "", "collections", "selectedSort", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CollectionListUiController extends Typed4EpoxyController<List<? extends Collection>, Integer, Boolean, Listener> {

    /* compiled from: CollectionListUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionListUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/ExtraCollectionModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/HeaderCollectionModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CollectionModel.Listener, ExtraCollectionModel.Listener, HeaderCollectionModel.Listener {
    }

    public CollectionListUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$3$lambda$2(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.airbnb.epoxy.Typed4EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Collection> list, Integer num, Boolean bool, Listener listener) {
        buildModels((List<Collection>) list, num.intValue(), bool.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<Collection> collections, int selectedSort, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(collections, "collections");
        Intrinsics.m32179h(listener, "listener");
        HeaderCollectionModel_ headerCollectionModel_ = new HeaderCollectionModel_();
        headerCollectionModel_.m4520h2("createCollection");
        headerCollectionModel_.m4524l2();
        headerCollectionModel_.f29538k = listener;
        add(headerCollectionModel_);
        ExtraCollectionModel_ extraCollectionModel_ = new ExtraCollectionModel_();
        extraCollectionModel_.m4520h2("extra");
        extraCollectionModel_.m4524l2();
        extraCollectionModel_.f29525l = selectedSort;
        extraCollectionModel_.m4524l2();
        extraCollectionModel_.f29524k = listener;
        add(extraCollectionModel_);
        if (collections.isEmpty()) {
            EpoxyModel<?> emptyModel_ = new EmptyModel_();
            emptyModel_.m4520h2("empty");
            emptyModel_.f6932i = C1136a.f14055v;
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
