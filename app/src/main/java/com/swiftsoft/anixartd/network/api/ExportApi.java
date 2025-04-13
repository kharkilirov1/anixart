package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.network.request.bookmarks.BookmarksExportRequest;
import com.swiftsoft.anixartd.network.response.bookmarks.BookmarksExportResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: ExportApi.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH'¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ExportApi;", "", "bookmarks", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/bookmarks/BookmarksExportResponse;", "sort", "", "bookmarksExportRequest", "Lcom/swiftsoft/anixartd/network/request/bookmarks/BookmarksExportRequest;", FirebaseMessagingService.EXTRA_TOKEN, "", "(Ljava/lang/Integer;Lcom/swiftsoft/anixartd/network/request/bookmarks/BookmarksExportRequest;Ljava/lang/String;)Lio/reactivex/Observable;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ExportApi {
    @POST("export/bookmarks")
    @NotNull
    Observable<BookmarksExportResponse> bookmarks(@Nullable @Query("sort") Integer sort, @Body @NotNull BookmarksExportRequest bookmarksExportRequest, @NotNull @Query("token") String token);
}
