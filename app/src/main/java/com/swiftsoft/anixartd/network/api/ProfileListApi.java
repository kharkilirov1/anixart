package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.ProfileListResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ProfileListApi.kt */
@Metadata(m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH'J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH'JC\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\nH'¢\u0006\u0002\u0010\u0011JM\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\nH'¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ProfileListApi;", "", "add", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/ProfileListResponse;", "status", "", "id", "", FirebaseMessagingService.EXTRA_TOKEN, "", "delete", "profileList", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Release;", "page", "sort", "(IILjava/lang/Integer;Ljava/lang/String;)Lio/reactivex/Observable;", "profileListByProfile", "profileId", "(JIILjava/lang/Integer;Ljava/lang/String;)Lio/reactivex/Observable;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ProfileListApi {
    @GET("profile/list/add/{status}/{r_id}")
    @NotNull
    Observable<ProfileListResponse> add(@Path("status") int status, @Path("r_id") long id2, @NotNull @Query("token") String token);

    @GET("profile/list/delete/{status}/{r_id}")
    @NotNull
    Observable<ProfileListResponse> delete(@Path("status") int status, @Path("r_id") long id2, @NotNull @Query("token") String token);

    @GET("profile/list/all/{status}/{page}")
    @NotNull
    Observable<PageableResponse<Release>> profileList(@Path("status") int status, @Path("page") int page, @Nullable @Query("sort") Integer sort, @NotNull @Query("token") String token);

    @GET("profile/list/all/{p_id}/{status}/{page}")
    @NotNull
    Observable<PageableResponse<Release>> profileListByProfile(@Path("p_id") long profileId, @Path("status") int status, @Path("page") int page, @Nullable @Query("sort") Integer sort, @NotNull @Query("token") String token);
}
