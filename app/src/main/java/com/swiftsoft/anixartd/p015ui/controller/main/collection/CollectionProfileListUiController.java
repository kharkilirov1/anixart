package com.swiftsoft.anixartd.p015ui.controller.main.collection;

import com.google.android.exoplayer2.trackselection.C1136a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.epoxy.Typed5EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorResourceModel_;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModel_;
import com.swiftsoft.anixartd.p015ui.model.main.collections.HeaderMyListCollectionModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.HeaderMyListCollectionModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionProfileListUiController.kt */
@Metadata(m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0006J6\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0005H\u0014J\u0006\u0010\u000e\u001a\u00020\u0004¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionProfileListUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed5EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "", "Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionProfileListUiController$Listener;", "()V", "buildModels", "", "collections", "isLoadable", "isMyList", "isEventOnlyRequired", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CollectionProfileListUiController extends Typed5EpoxyController<List<? extends Collection>, Boolean, Boolean, Boolean, Listener> {

    /* compiled from: CollectionProfileListUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionProfileListUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/HeaderMyListCollectionModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CollectionModel.Listener, HeaderMyListCollectionModel.Listener {
    }

    public CollectionProfileListUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$2$lambda$1(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed5EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Collection> list, Boolean bool, Boolean bool2, Boolean bool3, Listener listener) {
        buildModels((List<Collection>) list, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<Collection> collections, boolean isLoadable, boolean isMyList, boolean isEventOnlyRequired, @NotNull Listener listener) {
        Intrinsics.m32179h(collections, "collections");
        Intrinsics.m32179h(listener, "listener");
        if (isMyList && !isEventOnlyRequired) {
            HeaderMyListCollectionModel_ headerMyListCollectionModel_ = new HeaderMyListCollectionModel_();
            headerMyListCollectionModel_.mo15864a("headerMyListCollection");
            headerMyListCollectionModel_.mo15863O0(listener);
            add(headerMyListCollectionModel_);
        }
        if (collections.isEmpty()) {
            ErrorResourceModel_ errorResourceModel_ = new ErrorResourceModel_();
            errorResourceModel_.mo15727a("errorResource");
            errorResourceModel_.mo15726T0(isMyList ? C2507R.string.empty_my_profile_collection : C2507R.string.empty_profile_collection);
            errorResourceModel_.mo15728d(C1136a.f14056w);
            add(errorResourceModel_);
            return;
        }
        for (Collection collection : collections) {
            CollectionModel_ collectionModel_ = new CollectionModel_();
            collectionModel_.mo15843b(collection.getId());
            collectionModel_.mo15846j(collection.getTitle());
            collectionModel_.mo15844c(collection.getImage());
            collectionModel_.mo15841H(collection.getCommentCount());
            collectionModel_.mo15840G(collection.getFavoriteCount());
            collectionModel_.mo15842X(collection.getIsPrivate());
            collectionModel_.mo15845f(collection.getIsFavorite());
            collectionModel_.mo15847s1(listener);
            add(collectionModel_);
        }
    }
}
