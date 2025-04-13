package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ProfileReleaseVoteApi.kt */
@Metadata(m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'JC\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ProfileReleaseVoteApi;", "", "allReleaseUnvoted", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Release;", "page", "", FirebaseMessagingService.EXTRA_TOKEN, "", "allReleaseVoted", "profileId", "", "sort", "(JILjava/lang/Integer;Ljava/lang/String;)Lio/reactivex/Observable;", "lastReleaseUnvoted", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ProfileReleaseVoteApi {
    @GET("/profile/vote/release/unvoted/{page}")
    @NotNull
    Observable<PageableResponse<Release>> allReleaseUnvoted(@Path("page") int page, @NotNull @Query("token") String token);

    @GET("/profile/vote/release/voted/{p_id}/{page}")
    @NotNull
    Observable<PageableResponse<Release>> allReleaseVoted(@Path("p_id") long profileId, @Path("page") int page, @Nullable @Query("sort") Integer sort, @NotNull @Query("token") String token);

    @GET("/profile/vote/release/unvoted/last")
    @NotNull
    Observable<PageableResponse<Release>> lastReleaseUnvoted(@NotNull @Query("token") String token);
}
