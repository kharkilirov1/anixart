package com.swiftsoft.anixartd.network.api;

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

/* compiled from: ReleaseVideoCategoryApi.kt */
@Metadata(m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J2\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH'J(\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH'¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ReleaseVideoCategoryApi;", "", "appeal", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/release/video/appeal/ReleaseVideoAppealResponse;", "releaseId", "", "releaseVideoAppealRequest", "Lcom/swiftsoft/anixartd/network/request/release/video/ReleaseVideoAppealRequest;", "category", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideo;", "categoryId", "page", "", "video", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ReleaseVideoCategoryApi {
    @POST("/video/release/{releaseId}/appeal")
    @NotNull
    Observable<ReleaseVideoAppealResponse> appeal(@Path("releaseId") long releaseId, @Body @NotNull ReleaseVideoAppealRequest releaseVideoAppealRequest);

    @GET("/video/release/{releaseId}/category/{categoryId}/{page}")
    @NotNull
    Observable<PageableResponse<ReleaseVideo>> category(@Path("releaseId") long releaseId, @Path("categoryId") long categoryId, @Path("page") int page);

    @GET("/video/release/{releaseId}/{page}")
    @NotNull
    Observable<PageableResponse<ReleaseVideo>> video(@Path("releaseId") long releaseId, @Path("page") int page);
}
