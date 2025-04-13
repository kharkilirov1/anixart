package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.request.collection.CollectionReportRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.collection.CollectionReportResponse;
import com.swiftsoft.anixartd.network.response.collection.CollectionResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: CollectionApi.kt */
@Metadata(m31883d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'JF\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J2\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J<\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J2\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\u001c"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/CollectionApi;", "", "collection", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/collection/CollectionResponse;", "collectionId", "", FirebaseMessagingService.EXTRA_TOKEN, "", "collections", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Collection;", "page", "", "previousPage", "where", "sort", "profileCollections", "profileId", "releaseCollections", "releaseId", "releases", "Lcom/swiftsoft/anixartd/database/entity/Release;", "report", "Lcom/swiftsoft/anixartd/network/response/collection/CollectionReportResponse;", "id", "collectionReportRequest", "Lcom/swiftsoft/anixartd/network/request/collection/CollectionReportRequest;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface CollectionApi {
    @GET("collection/{id}")
    @NotNull
    Observable<CollectionResponse> collection(@Path("id") long collectionId, @NotNull @Query("token") String token);

    @GET("collection/all/{page}")
    @NotNull
    Observable<PageableResponse<Collection>> collections(@Path("page") int page, @Query("previous_page") int previousPage, @Query("where") int where, @Query("sort") int sort, @NotNull @Query("token") String token);

    @GET("collection/all/profile/{p_id}/{page}")
    @NotNull
    Observable<PageableResponse<Collection>> profileCollections(@Path("p_id") long profileId, @Path("page") int page, @NotNull @Query("token") String token);

    @GET("collection/all/release/{r_id}/{page}")
    @NotNull
    Observable<PageableResponse<Collection>> releaseCollections(@Path("r_id") long releaseId, @Path("page") int page, @Query("sort") int sort, @NotNull @Query("token") String token);

    @GET("collection/{id}/releases/{page}")
    @NotNull
    Observable<PageableResponse<Release>> releases(@Path("id") long collectionId, @Path("page") int page, @NotNull @Query("token") String token);

    @POST("collection/report/{id}")
    @NotNull
    Observable<CollectionReportResponse> report(@Path("id") long id2, @Body @NotNull CollectionReportRequest collectionReportRequest, @NotNull @Query("token") String token);
}
