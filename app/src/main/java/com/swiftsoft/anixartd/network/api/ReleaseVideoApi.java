package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.release.video.ReleaseVideosResponse;
import com.swiftsoft.anixartd.network.response.release.video.appeal.ReleaseVideoCategoriesResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ReleaseVideoApi.kt */
@Metadata(m31883d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J2\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J2\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00032\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H'J(\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH'¨\u0006\u0014"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ReleaseVideoApi;", "", "categories", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/release/video/appeal/ReleaseVideoCategoriesResponse;", "category", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideo;", "releaseId", "", "categoryId", "page", "", "main", "Lcom/swiftsoft/anixartd/network/response/release/video/ReleaseVideosResponse;", "profileVideo", "profileId", FirebaseMessagingService.EXTRA_TOKEN, "", "video", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ReleaseVideoApi {
    @GET("/video/release/categories")
    @NotNull
    Observable<ReleaseVideoCategoriesResponse> categories();

    @GET("/video/release/{releaseId}/category/{categoryId}/{page}")
    @NotNull
    Observable<PageableResponse<ReleaseVideo>> category(@Path("releaseId") long releaseId, @Path("categoryId") long categoryId, @Path("page") int page);

    @GET("/video/release/{releaseId}")
    @NotNull
    Observable<ReleaseVideosResponse> main(@Path("releaseId") long releaseId);

    @GET("/video/profile/{p_id}/{page}")
    @NotNull
    Observable<PageableResponse<ReleaseVideo>> profileVideo(@Path("p_id") long profileId, @Path("page") int page, @NotNull @Query("token") String token);

    @GET("/video/release/{releaseId}/{page}")
    @NotNull
    Observable<PageableResponse<ReleaseVideo>> video(@Path("releaseId") long releaseId, @Path("page") int page);
}
