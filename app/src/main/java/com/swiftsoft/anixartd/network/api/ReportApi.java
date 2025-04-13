package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.ReportReason;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.network.request.report.ReportRequest;
import com.swiftsoft.anixartd.network.response.report.ReportResponse;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: ReportApi.kt */
@Metadata(m31883d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'¨\u0006\u0018"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ReportApi;", "", "collection", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/report/ReportResponse;", "reportRequest", "Lcom/swiftsoft/anixartd/network/request/report/ReportRequest;", "", FirebaseMessagingService.EXTRA_TOKEN, "", "collectionComment", "collectionCommentsReasons", "", "Lcom/swiftsoft/anixartd/database/entity/ReportReason;", "collectionReasons", "episode", "Lcom/swiftsoft/anixartd/database/entity/episode/Episode;", "episodeReasons", "profile", "profileReasons", "release", "releaseComment", "releaseCommentsReasons", "releaseReasons", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ReportApi {
    @POST("report/collection")
    @NotNull
    Observable<ReportResponse> collection(@Body @NotNull ReportRequest<Long> reportRequest, @NotNull @Query("token") String token);

    @POST("report/comment/collection")
    @NotNull
    Observable<ReportResponse> collectionComment(@Body @NotNull ReportRequest<Long> reportRequest, @NotNull @Query("token") String token);

    @GET("report/comment/collection/reasons")
    @NotNull
    Observable<List<ReportReason>> collectionCommentsReasons(@NotNull @Query("token") String token);

    @GET("report/collection/reasons")
    @NotNull
    Observable<List<ReportReason>> collectionReasons(@NotNull @Query("token") String token);

    @POST("report/episode")
    @NotNull
    Observable<ReportResponse> episode(@Body @NotNull ReportRequest<Episode> reportRequest, @NotNull @Query("token") String token);

    @GET("report/episode/reasons")
    @NotNull
    Observable<List<ReportReason>> episodeReasons(@NotNull @Query("token") String token);

    @POST("report/profile")
    @NotNull
    Observable<ReportResponse> profile(@Body @NotNull ReportRequest<Long> reportRequest, @NotNull @Query("token") String token);

    @GET("report/profile/reasons")
    @NotNull
    Observable<List<ReportReason>> profileReasons(@NotNull @Query("token") String token);

    @POST("report/release")
    @NotNull
    Observable<ReportResponse> release(@Body @NotNull ReportRequest<Long> reportRequest, @NotNull @Query("token") String token);

    @POST("report/comment/release")
    @NotNull
    Observable<ReportResponse> releaseComment(@Body @NotNull ReportRequest<Long> reportRequest, @NotNull @Query("token") String token);

    @GET("report/comment/release/reasons")
    @NotNull
    Observable<List<ReportReason>> releaseCommentsReasons(@NotNull @Query("token") String token);

    @GET("report/release/reasons")
    @NotNull
    Observable<List<ReportReason>> releaseReasons(@NotNull @Query("token") String token);
}
