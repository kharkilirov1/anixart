package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.collection.FavoriteCollectionAddResponse;
import com.swiftsoft.anixartd.network.response.collection.FavoriteCollectionDeleteResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: CollectionFavoriteApi.kt */
@Metadata(m31883d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J(\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/CollectionFavoriteApi;", "", "add", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/collection/FavoriteCollectionAddResponse;", "collectionId", "", FirebaseMessagingService.EXTRA_TOKEN, "", "delete", "Lcom/swiftsoft/anixartd/network/response/collection/FavoriteCollectionDeleteResponse;", "favorites", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "page", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface CollectionFavoriteApi {
    @GET("collectionFavorite/add/{id}")
    @NotNull
    Observable<FavoriteCollectionAddResponse> add(@Path("id") long collectionId, @NotNull @Query("token") String token);

    @GET("collectionFavorite/delete/{id}")
    @NotNull
    Observable<FavoriteCollectionDeleteResponse> delete(@Path("id") long collectionId, @NotNull @Query("token") String token);

    @GET("collectionFavorite/all/{page}")
    @NotNull
    Observable<PageableResponse<Collection>> favorites(@Path("page") int page, @NotNull @Query("token") String token);
}
