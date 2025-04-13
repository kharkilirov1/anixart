package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.FavoritesResponse;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: FavoriteApi.kt */
@Metadata(m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J9\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00032\b\b\u0001\u0010\r\u001a\u00020\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\bH'¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/FavoriteApi;", "", "add", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/FavoritesResponse;", "id", "", FirebaseMessagingService.EXTRA_TOKEN, "", "delete", "favorites", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Release;", "page", "", "sort", "(ILjava/lang/Integer;Ljava/lang/String;)Lio/reactivex/Observable;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface FavoriteApi {
    @GET("favorite/add/{r_id}")
    @NotNull
    Observable<FavoritesResponse> add(@Path("r_id") long id2, @NotNull @Query("token") String token);

    @GET("favorite/delete/{r_id}")
    @NotNull
    Observable<FavoritesResponse> delete(@Path("r_id") long id2, @NotNull @Query("token") String token);

    @GET("favorite/all/{page}")
    @NotNull
    Observable<PageableResponse<Release>> favorites(@Path("page") int page, @Nullable @Query("sort") Integer sort, @NotNull @Query("token") String token);
}
