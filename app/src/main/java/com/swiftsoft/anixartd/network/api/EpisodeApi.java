package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.EpisodeUpdate;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.network.request.report.ReportRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.release.episode.EpisodeResponse;
import com.swiftsoft.anixartd.network.response.release.episode.EpisodeTargetResponse;
import com.swiftsoft.anixartd.network.response.release.episode.EpisodeUnwatchResponse;
import com.swiftsoft.anixartd.network.response.release.episode.EpisodeWatchResponse;
import com.swiftsoft.anixartd.network.response.release.episode.SourcesResponse;
import com.swiftsoft.anixartd.network.response.release.episode.TypesResponse;
import com.swiftsoft.anixartd.network.response.report.ReportResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: EpisodeApi.kt */
@Metadata(m31883d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'J@\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH'JF\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\u000e\u001a\u00020\u000fH'J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H'J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH'J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fH'J(\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\tH'J6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH'J,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fH'¨\u0006!"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/EpisodeApi;", "", "episodeTarget", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/release/episode/EpisodeTargetResponse;", "releaseId", "", "sourceId", "position", "", "episodes", "Lcom/swiftsoft/anixartd/network/response/release/episode/EpisodeResponse;", "typeId", "sort", FirebaseMessagingService.EXTRA_TOKEN, "", "report", "Lcom/swiftsoft/anixartd/network/response/report/ReportResponse;", "reportRequest", "Lcom/swiftsoft/anixartd/network/request/report/ReportRequest;", "Lcom/swiftsoft/anixartd/database/entity/episode/Episode;", "sources", "Lcom/swiftsoft/anixartd/network/response/release/episode/SourcesResponse;", "types", "Lcom/swiftsoft/anixartd/network/response/release/episode/TypesResponse;", "unwatch", "Lcom/swiftsoft/anixartd/network/response/release/episode/EpisodeUnwatchResponse;", "updates", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/EpisodeUpdate;", "page", "watch", "Lcom/swiftsoft/anixartd/network/response/release/episode/EpisodeWatchResponse;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface EpisodeApi {
    @GET("episode/target/{releaseId}/{sourceId}/{position}")
    @NotNull
    Observable<EpisodeTargetResponse> episodeTarget(@Path("releaseId") long releaseId, @Path("sourceId") long sourceId, @Path("position") int position);

    @GET("episode/{releaseId}/{typeId}/{sourceId}")
    @NotNull
    Observable<EpisodeResponse> episodes(@Path("releaseId") long releaseId, @Path("typeId") long typeId, @Path("sourceId") long sourceId, @Query("sort") int sort, @NotNull @Query("token") String token);

    @POST("episode/report/{releaseId}/{sourceId}/{position}")
    @NotNull
    Observable<ReportResponse> report(@Path("releaseId") long releaseId, @Path("sourceId") long sourceId, @Path("position") int position, @Body @NotNull ReportRequest<Episode> reportRequest, @NotNull @Query("token") String token);

    @GET("episode/{releaseId}/{typeId}")
    @NotNull
    Observable<SourcesResponse> sources(@Path("releaseId") long releaseId, @Path("typeId") long typeId);

    @GET("episode/{releaseId}")
    @NotNull
    Observable<TypesResponse> types(@Path("releaseId") long releaseId);

    @POST("episode/unwatch/{releaseId}/{sourceId}/{position}")
    @NotNull
    Observable<EpisodeUnwatchResponse> unwatch(@Path("releaseId") long releaseId, @Path("sourceId") long sourceId, @Path("position") int position, @NotNull @Query("token") String token);

    @POST("episode/unwatch/{releaseId}/{sourceId}")
    @NotNull
    Observable<EpisodeUnwatchResponse> unwatch(@Path("releaseId") long releaseId, @Path("sourceId") long sourceId, @NotNull @Query("token") String token);

    @GET("episode/updates/{releaseId}/{page}")
    @NotNull
    Observable<PageableResponse<EpisodeUpdate>> updates(@Path("releaseId") long releaseId, @Path("page") int page);

    @POST("episode/watch/{releaseId}/{sourceId}/{position}")
    @NotNull
    Observable<EpisodeWatchResponse> watch(@Path("releaseId") long releaseId, @Path("sourceId") long sourceId, @Path("position") int position, @NotNull @Query("token") String token);

    @POST("episode/watch/{releaseId}/{sourceId}")
    @NotNull
    Observable<EpisodeWatchResponse> watch(@Path("releaseId") long releaseId, @Path("sourceId") long sourceId, @NotNull @Query("token") String token);
}
