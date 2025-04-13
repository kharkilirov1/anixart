package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.ChangeLogin;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.request.profile.ProfileProcessRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.ProfileResponse;
import com.swiftsoft.anixartd.network.response.profile.ProfileSocialResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ProfileApi.kt */
@Metadata(m31883d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\n\u001a\u00020\u000bH'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bH'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bH'¨\u0006\u0015"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ProfileApi;", "", "changeLoginHistory", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/ChangeLogin;", "profileId", "", "page", "", FirebaseMessagingService.EXTRA_TOKEN, "", "process", "Lcom/swiftsoft/anixartd/network/Response;", "id", "profileProcessRequest", "Lcom/swiftsoft/anixartd/network/request/profile/ProfileProcessRequest;", "profile", "Lcom/swiftsoft/anixartd/network/response/ProfileResponse;", "social", "Lcom/swiftsoft/anixartd/network/response/profile/ProfileSocialResponse;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ProfileApi {
    @GET("profile/login/history/all/{id}/{page}")
    @NotNull
    Observable<PageableResponse<ChangeLogin>> changeLoginHistory(@Path("id") long profileId, @Path("page") int page, @NotNull @Query("token") String token);

    @POST("profile/process/{id}")
    @NotNull
    Observable<Response> process(@Path("id") long id2, @Body @NotNull ProfileProcessRequest profileProcessRequest, @NotNull @Query("token") String token);

    @GET("profile/{id}")
    @NotNull
    Observable<ProfileResponse> profile(@Path("id") long id2, @NotNull @Query("token") String token);

    @GET("profile/social/{id}")
    @NotNull
    Observable<ProfileSocialResponse> social(@Path("id") long id2, @NotNull @Query("token") String token);
}
