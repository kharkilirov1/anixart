package com.swiftsoft.anixartd.network.request.bookmarks;

import com.swiftsoft.anixartd.network.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BookmarksExportRequest.kt */
@Metadata(m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/bookmarks/BookmarksExportRequest;", "Lcom/swiftsoft/anixartd/network/Request;", "bookmarksExportProfileLists", "", "", "(Ljava/util/List;)V", "getBookmarksExportProfileLists", "()Ljava/util/List;", "setBookmarksExportProfileLists", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class BookmarksExportRequest extends Request {

    @NotNull
    private List<Integer> bookmarksExportProfileLists;

    public BookmarksExportRequest(@NotNull List<Integer> bookmarksExportProfileLists) {
        Intrinsics.m32179h(bookmarksExportProfileLists, "bookmarksExportProfileLists");
        this.bookmarksExportProfileLists = bookmarksExportProfileLists;
    }

    @NotNull
    public final List<Integer> getBookmarksExportProfileLists() {
        return this.bookmarksExportProfileLists;
    }

    public final void setBookmarksExportProfileLists(@NotNull List<Integer> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.bookmarksExportProfileLists = list;
    }
}
