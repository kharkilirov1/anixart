package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.network.request.bookmarks.BookmarksImportRequest;
import com.swiftsoft.anixartd.network.response.bookmarks.BookmarksImportResponse;
import com.swiftsoft.anixartd.network.response.bookmarks.BookmarksImportStatusResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: ImportApi.kt */
@Metadata(m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ImportApi;", "", "bookmarks", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/bookmarks/BookmarksImportResponse;", "bookmarksImportRequest", "Lcom/swiftsoft/anixartd/network/request/bookmarks/BookmarksImportRequest;", FirebaseMessagingService.EXTRA_TOKEN, "", "status", "Lcom/swiftsoft/anixartd/network/response/bookmarks/BookmarksImportStatusResponse;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ImportApi {
    @POST("import/bookmarks")
    @NotNull
    Observable<BookmarksImportResponse> bookmarks(@Body @NotNull BookmarksImportRequest bookmarksImportRequest, @NotNull @Query("token") String token);

    @POST("import/status")
    @NotNull
    Observable<BookmarksImportStatusResponse> status(@NotNull @Query("token") String token);
}
