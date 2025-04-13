package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.network.request.release.video.ReleaseVideoAppealRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.release.video.appeal.ReleaseVideoAppealResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ReleaseVideoAppealApi.kt */
@Metadata(m31883d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\u0011"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ReleaseVideoAppealApi;", "", "add", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/release/video/appeal/ReleaseVideoAppealResponse;", "releaseVideoAppealRequest", "Lcom/swiftsoft/anixartd/network/request/release/video/ReleaseVideoAppealRequest;", FirebaseMessagingService.EXTRA_TOKEN, "", "appeals", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideo;", "page", "", "delete", "appealId", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ReleaseVideoAppealApi {
    @POST("/video/appeal/add")
    @NotNull
    Observable<ReleaseVideoAppealResponse> add(@Body @NotNull ReleaseVideoAppealRequest releaseVideoAppealRequest, @NotNull @Query("token") String token);

    @GET("/video/appeal/profile/{page}")
    @NotNull
    Observable<PageableResponse<ReleaseVideo>> appeals(@Path("page") int page, @NotNull @Query("token") String token);

    @GET("/video/appeal/profile/last")
    @NotNull
    Observable<PageableResponse<ReleaseVideo>> appeals(@NotNull @Query("token") String token);

    @POST("/video/appeal/delete/{appealId}")
    @NotNull
    Observable<ReleaseVideoAppealResponse> delete(@Path("appealId") long appealId, @NotNull @Query("token") String token);
}
