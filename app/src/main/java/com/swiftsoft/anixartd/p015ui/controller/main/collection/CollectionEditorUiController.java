package com.swiftsoft.anixartd.p015ui.controller.main.collection;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.epoxy.Typed8EpoxyControllerNullable;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModel_;
import com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModel;
import com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModel_;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectionEditorUiController.kt */
@Metadata(m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002<\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\nJc\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0003¨\u0006\u0018"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionEditorUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed8EpoxyControllerNullable;", "", "", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "Ljava/io/File;", "", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionEditorUiController$Listener;", "()V", "buildModels", "", "title", "description", "isPrivate", "collection", "imageFile", "releaseCount", "releases", "listener", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/swiftsoft/anixartd/database/entity/Collection;Ljava/io/File;Ljava/lang/Long;Ljava/util/List;Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionEditorUiController$Listener;)V", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class CollectionEditorUiController extends Typed8EpoxyControllerNullable<String, String, Boolean, Collection, File, Long, List<? extends Release>, Listener> {

    /* compiled from: CollectionEditorUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionEditorUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/editor/CollectionEditorHeaderModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionReleaseEditableModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CollectionEditorHeaderModel.Listener, CollectionReleaseEditableModel.Listener {
    }

    public CollectionEditorUiController() {
        setDebugLoggingEnabled(true);
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed8EpoxyControllerNullable
    public /* bridge */ /* synthetic */ void buildModels(String str, String str2, Boolean bool, Collection collection, File file, Long l2, List<? extends Release> list, Listener listener) {
        buildModels2(str, str2, bool, collection, file, l2, (List<Release>) list, listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@Nullable String title, @Nullable String description, @Nullable Boolean isPrivate, @Nullable Collection collection, @Nullable File imageFile, @Nullable Long releaseCount, @Nullable List<Release> releases, @Nullable Listener listener) {
        CollectionEditorHeaderModel_ collectionEditorHeaderModel_ = new CollectionEditorHeaderModel_();
        collectionEditorHeaderModel_.mo15960a("collectionEditorHeader");
        if (title != null) {
            collectionEditorHeaderModel_.mo15963j(title);
        }
        if (description != null) {
            collectionEditorHeaderModel_.mo15962g(description);
        }
        if (isPrivate != null) {
            collectionEditorHeaderModel_.mo15957U(isPrivate.booleanValue());
        }
        if (collection != null) {
            collectionEditorHeaderModel_.mo15961c(collection.getImage());
        }
        if (imageFile != null) {
            collectionEditorHeaderModel_.mo15959Z(imageFile);
        }
        if (releaseCount != null) {
            collectionEditorHeaderModel_.mo15958Y(releaseCount.longValue());
        }
        collectionEditorHeaderModel_.mo15964r1(listener);
        add(collectionEditorHeaderModel_);
        if (releases == null || !(!releases.isEmpty())) {
            return;
        }
        for (Release release : releases) {
            CollectionReleaseEditableModel_ collectionReleaseEditableModel_ = new CollectionReleaseEditableModel_();
            collectionReleaseEditableModel_.mo15851b(release.getId());
            collectionReleaseEditableModel_.mo15853e(release.getTitleRu());
            collectionReleaseEditableModel_.mo15859n(release.getEpisodesReleased());
            collectionReleaseEditableModel_.mo15858m(release.getEpisodesTotal());
            collectionReleaseEditableModel_.mo15856h(Double.valueOf(release.getGrade()));
            collectionReleaseEditableModel_.mo15855g(release.getDescription());
            collectionReleaseEditableModel_.mo15852c(release.getImage());
            collectionReleaseEditableModel_.mo15854f(release.getIsFavorite());
            collectionReleaseEditableModel_.mo15860o(release.getProfileListStatus());
            collectionReleaseEditableModel_.mo15857i(release.getVoteCount() > 50);
            collectionReleaseEditableModel_.mo15850K1(listener);
            add(collectionReleaseEditableModel_);
        }
    }
}
