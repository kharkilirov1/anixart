package com.swiftsoft.anixartd.p015ui.controller.main.discover;

import com.airbnb.epoxy.Typed2EpoxyController;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionCompactModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionWeekUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014J\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/discover/CollectionWeekUiController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "Lcom/swiftsoft/anixartd/ui/controller/main/discover/CollectionWeekUiController$Listener;", "()V", "buildModels", "", "collections", "listener", "isEmpty", "", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CollectionWeekUiController extends Typed2EpoxyController<List<? extends Collection>, Listener> {

    /* compiled from: CollectionWeekUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/discover/CollectionWeekUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionCompactModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CollectionCompactModel.Listener {
    }

    public CollectionWeekUiController() {
        setDebugLoggingEnabled(true);
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Collection> list, Listener listener) {
        buildModels2((List<Collection>) list, listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@NotNull List<Collection> collections, @NotNull Listener listener) {
        Intrinsics.m32179h(collections, "collections");
        Intrinsics.m32179h(listener, "listener");
        for (Collection collection : collections) {
            CollectionCompactModel_ collectionCompactModel_ = new CollectionCompactModel_();
            collectionCompactModel_.mo15807b(collection.getId());
            collectionCompactModel_.mo15810j(collection.getTitle());
            collectionCompactModel_.mo15808c(collection.getImage());
            collectionCompactModel_.mo15805H(collection.getCommentCount());
            collectionCompactModel_.mo15804G(collection.getFavoriteCount());
            collectionCompactModel_.mo15806X(collection.getIsPrivate());
            collectionCompactModel_.mo15809f(collection.getIsFavorite());
            collectionCompactModel_.mo15811n0(listener);
            add(collectionCompactModel_);
        }
    }
}
