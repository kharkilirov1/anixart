package com.swiftsoft.anixartd.p015ui.controller.main.bookmarks;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.epoxy.Typed9EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseHistoryModel;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel;
import com.swiftsoft.anixartd.p015ui.model.main.bookmarks.ExtraBookmarksModel;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionModel;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BookmarksTabUiController.kt */
@Metadata(m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002D\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\nJ\\\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\tH\u0014J\u0006\u0010\u0016\u001a\u00020\b¨\u0006\u0018"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/bookmarks/BookmarksTabUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed9EpoxyController;", "", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/bookmarks/BookmarksTabUiController$Listener;", "()V", "buildModels", "", "viewType", "releases", "collections", "selectedInnerTab", "totalCount", "selectedSort", "isSortEnabled", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class BookmarksTabUiController extends Typed9EpoxyController<Integer, List<? extends Release>, List<? extends Collection>, String, Long, Integer, Boolean, Boolean, Listener> {

    /* compiled from: BookmarksTabUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/bookmarks/BookmarksTabUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ReleaseModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ReleaseHistoryModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/bookmarks/ExtraBookmarksModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseModel.Listener, ReleaseHistoryModel.Listener, ExtraBookmarksModel.Listener, CollectionModel.Listener {
    }

    public BookmarksTabUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$1$lambda$0(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$3$lambda$2(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed9EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Integer num, List<? extends Release> list, List<? extends Collection> list2, String str, Long l2, Integer num2, Boolean bool, Boolean bool2, Listener listener) {
        buildModels(num.intValue(), (List<Release>) list, (List<Collection>) list2, str, l2.longValue(), num2.intValue(), bool.booleanValue(), bool2.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildModels(int r5, @org.jetbrains.annotations.NotNull java.util.List<com.swiftsoft.anixartd.database.entity.Release> r6, @org.jetbrains.annotations.NotNull java.util.List<com.swiftsoft.anixartd.database.entity.Collection> r7, @org.jetbrains.annotations.NotNull java.lang.String r8, long r9, int r11, boolean r12, boolean r13, @org.jetbrains.annotations.NotNull com.swiftsoft.anixartd.ui.controller.main.bookmarks.BookmarksTabUiController.Listener r14) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.controller.main.bookmarks.BookmarksTabUiController.buildModels(int, java.util.List, java.util.List, java.lang.String, long, int, boolean, boolean, com.swiftsoft.anixartd.ui.controller.main.bookmarks.BookmarksTabUiController$Listener):void");
    }
}
