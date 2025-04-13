package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.profile.RemoveFriendRequestResponse;
import com.swiftsoft.anixartd.network.response.profile.SendFriendRequestResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ProfileFriendApi.kt */
@Metadata(m31883d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bH'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bH'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bH'J(\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH'J(\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH'¨\u0006\u0017"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ProfileFriendApi;", "", "friends", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "id", "", "page", "", FirebaseMessagingService.EXTRA_TOKEN, "", "recommendations", "requestHide", "Lcom/swiftsoft/anixartd/network/Response;", "requestRemove", "Lcom/swiftsoft/anixartd/network/response/profile/RemoveFriendRequestResponse;", "requestSend", "Lcom/swiftsoft/anixartd/network/response/profile/SendFriendRequestResponse;", "requestsIn", "requestsInLast", "requestsOut", "requestsOutLast", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ProfileFriendApi {
    @GET("profile/friend/all/{id}/{page}")
    @NotNull
    Observable<PageableResponse<Profile>> friends(@Path("id") long id2, @Path("page") int page, @NotNull @Query("token") String token);

    @GET("profile/friend/recommendations")
    @NotNull
    Observable<PageableResponse<Profile>> recommendations(@NotNull @Query("token") String token);

    @GET("profile/friend/request/hide/{id}")
    @NotNull
    Observable<Response> requestHide(@Path("id") long id2, @NotNull @Query("token") String token);

    @GET("profile/friend/request/remove/{id}")
    @NotNull
    Observable<RemoveFriendRequestResponse> requestRemove(@Path("id") long id2, @NotNull @Query("token") String token);

    @GET("profile/friend/request/send/{id}")
    @NotNull
    Observable<SendFriendRequestResponse> requestSend(@Path("id") long id2, @NotNull @Query("token") String token);

    @GET("profile/friend/requests/in/{page}")
    @NotNull
    Observable<PageableResponse<Profile>> requestsIn(@Path("page") int page, @NotNull @Query("token") String token);

    @GET("profile/friend/requests/in/last")
    @NotNull
    Observable<PageableResponse<Profile>> requestsInLast(@NotNull @Query("token") String token);

    @GET("profile/friend/requests/out/{page}")
    @NotNull
    Observable<PageableResponse<Profile>> requestsOut(@Path("page") int page, @NotNull @Query("token") String token);

    @GET("profile/friend/requests/out/last")
    @NotNull
    Observable<PageableResponse<Profile>> requestsOutLast(@NotNull @Query("token") String token);
}
