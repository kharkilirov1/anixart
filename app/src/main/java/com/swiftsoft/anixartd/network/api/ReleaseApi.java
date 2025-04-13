package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.network.request.release.ReleaseReportRequest;
import com.swiftsoft.anixartd.network.response.release.DeleteVoteReleaseResponse;
import com.swiftsoft.anixartd.network.response.release.ReleaseReportResponse;
import com.swiftsoft.anixartd.network.response.release.ReleaseResponse;
import com.swiftsoft.anixartd.network.response.release.VoteReleaseResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ReleaseApi.kt */
@Metadata(m31883d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0007\u001a\u00020\bH'J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00132\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\u001b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ReleaseApi;", "", "deleteVote", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/release/DeleteVoteReleaseResponse;", "id", "", FirebaseMessagingService.EXTRA_TOKEN, "", "random", "Lcom/swiftsoft/anixartd/network/response/release/ReleaseResponse;", "extendedMode", "", "randomCollection", "collectionId", "randomFavorite", "randomProfileList", "profileId", "status", "", "release", "report", "Lcom/swiftsoft/anixartd/network/response/release/ReleaseReportResponse;", "releaseReportRequest", "Lcom/swiftsoft/anixartd/network/request/release/ReleaseReportRequest;", "vote", "Lcom/swiftsoft/anixartd/network/response/release/VoteReleaseResponse;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ReleaseApi {
    @GET("release/vote/delete/{r_id}")
    @NotNull
    Observable<DeleteVoteReleaseResponse> deleteVote(@Path("r_id") long id2, @NotNull @Query("token") String token);

    @GET("release/random")
    @NotNull
    Observable<ReleaseResponse> random(@Query("extended_mode") boolean extendedMode, @NotNull @Query("token") String token);

    @GET("release/collection/{id}/random")
    @NotNull
    Observable<ReleaseResponse> randomCollection(@Path("id") long collectionId, @Query("extended_mode") boolean extendedMode, @NotNull @Query("token") String token);

    @GET("release/random/favorite")
    @NotNull
    Observable<ReleaseResponse> randomFavorite(@Query("extended_mode") boolean extendedMode, @NotNull @Query("token") String token);

    @GET("release/random/profile/list/{p_id}/{status}")
    @NotNull
    Observable<ReleaseResponse> randomProfileList(@Path("p_id") long profileId, @Path("status") int status, @Query("extended_mode") boolean extendedMode, @NotNull @Query("token") String token);

    @GET("release/{r_id}")
    @NotNull
    Observable<ReleaseResponse> release(@Path("r_id") long id2, @Query("extended_mode") boolean extendedMode, @NotNull @Query("token") String token);

    @POST("release/report/{r_id}")
    @NotNull
    Observable<ReleaseReportResponse> report(@Path("r_id") long id2, @Body @NotNull ReleaseReportRequest releaseReportRequest, @NotNull @Query("token") String token);

    @GET("release/vote/add/{r_id}/{vote}")
    @NotNull
    Observable<VoteReleaseResponse> vote(@Path("r_id") long id2, @Path("vote") int vote, @NotNull @Query("token") String token);
}
