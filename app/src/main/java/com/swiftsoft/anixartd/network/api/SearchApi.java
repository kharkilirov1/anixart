package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.request.SearchRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.ReleaseSearchResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: SearchApi.kt */
@Metadata(m31883d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J2\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J2\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J2\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'JF\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\n\u001a\u00020\u000bH'J<\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J2\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J6\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\u001a\u001a\u00020\u000bH'¨\u0006\u001b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/SearchApi;", "", "collectionSearch", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "page", "", "searchRequest", "Lcom/swiftsoft/anixartd/network/request/SearchRequest;", FirebaseMessagingService.EXTRA_TOKEN, "", "favoriteCollectionsSearch", "favoritesSearch", "Lcom/swiftsoft/anixartd/database/entity/Release;", "historySearch", "profileCollectionSearch", "profileId", "", "releaseId", "profileListSearch", "status", "profileSearch", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "releaseSearch", "Lcom/swiftsoft/anixartd/network/response/ReleaseSearchResponse;", "apiVersion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface SearchApi {

    /* compiled from: SearchApi.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Observable releaseSearch$default(SearchApi searchApi, int i2, SearchRequest searchRequest, String str, String str2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: releaseSearch");
            }
            if ((i3 & 8) != 0) {
                str2 = "v2";
            }
            return searchApi.releaseSearch(i2, searchRequest, str, str2);
        }
    }

    @POST("search/collections/{page}")
    @NotNull
    Observable<PageableResponse<Collection>> collectionSearch(@Path("page") int page, @Body @NotNull SearchRequest searchRequest, @NotNull @Query("token") String token);

    @POST("search/favoriteCollections/{page}")
    @NotNull
    Observable<PageableResponse<Collection>> favoriteCollectionsSearch(@Path("page") int page, @Body @NotNull SearchRequest searchRequest, @NotNull @Query("token") String token);

    @POST("search/favorites/{page}")
    @NotNull
    Observable<PageableResponse<Release>> favoritesSearch(@Path("page") int page, @Body @NotNull SearchRequest searchRequest, @NotNull @Query("token") String token);

    @POST("search/history/{page}")
    @NotNull
    Observable<PageableResponse<Release>> historySearch(@Path("page") int page, @Body @NotNull SearchRequest searchRequest, @NotNull @Query("token") String token);

    @POST("search/profileCollections/{p_id}/{page}")
    @NotNull
    Observable<PageableResponse<Collection>> profileCollectionSearch(@Path("p_id") long profileId, @Path("page") int page, @Body @NotNull SearchRequest searchRequest, @Query("release_id") long releaseId, @NotNull @Query("token") String token);

    @POST("search/profile/list/{status}/{page}")
    @NotNull
    Observable<PageableResponse<Release>> profileListSearch(@Path("status") int status, @Path("page") int page, @Body @NotNull SearchRequest searchRequest, @NotNull @Query("token") String token);

    @POST("search/profiles/{page}")
    @NotNull
    Observable<PageableResponse<Profile>> profileSearch(@Path("page") int page, @Body @NotNull SearchRequest searchRequest, @NotNull @Query("token") String token);

    @POST("search/releases/{page}")
    @NotNull
    Observable<ReleaseSearchResponse> releaseSearch(@Path("page") int page, @Body @NotNull SearchRequest searchRequest, @NotNull @Query("token") String token, @Header("API-Version") @NotNull String apiVersion);
}
