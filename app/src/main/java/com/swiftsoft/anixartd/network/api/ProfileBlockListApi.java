package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.BlockProfileListAddResponse;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ProfileBlockListApi.kt */
@Metadata(m31883d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ProfileBlockListApi;", "", "addToBlockList", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/BlockProfileListAddResponse;", "id", "", FirebaseMessagingService.EXTRA_TOKEN, "", "blockList", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "page", "", "removeFromBlockList", "Lcom/swiftsoft/anixartd/network/Response;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ProfileBlockListApi {
    @GET("profile/blocklist/add/{id}")
    @NotNull
    Observable<BlockProfileListAddResponse> addToBlockList(@Path("id") long id2, @NotNull @Query("token") String token);

    @GET("profile/blocklist/all/{page}")
    @NotNull
    Observable<PageableResponse<Profile>> blockList(@Path("page") int page, @NotNull @Query("token") String token);

    @GET("profile/blocklist/remove/{id}")
    @NotNull
    Observable<Response> removeFromBlockList(@Path("id") long id2, @NotNull @Query("token") String token);
}
