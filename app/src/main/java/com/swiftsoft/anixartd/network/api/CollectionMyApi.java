package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.request.collection.CreateEditCollectionRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.collection.CreateEditCollectionResponse;
import com.swiftsoft.anixartd.network.response.collection.DeleteCollectionResponse;
import com.swiftsoft.anixartd.network.response.collection.EditImageCollectionResponse;
import com.swiftsoft.anixartd.network.response.collection.ReleaseAddCollectionResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: CollectionMyApi.kt */
@Metadata(m31883d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0007\u001a\u00020\bH'J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J(\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\u001a"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/CollectionMyApi;", "", "create", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/collection/CreateEditCollectionResponse;", "createEditCollectionRequest", "Lcom/swiftsoft/anixartd/network/request/collection/CreateEditCollectionRequest;", FirebaseMessagingService.EXTRA_TOKEN, "", "delete", "Lcom/swiftsoft/anixartd/network/response/collection/DeleteCollectionResponse;", "collectionId", "", "edit", "editImage", "Lcom/swiftsoft/anixartd/network/response/collection/EditImageCollectionResponse;", "image", "Lokhttp3/MultipartBody$Part;", "name", "Lokhttp3/RequestBody;", "releaseAdd", "Lcom/swiftsoft/anixartd/network/response/collection/ReleaseAddCollectionResponse;", "releaseId", "releases", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Release;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface CollectionMyApi {
    @POST("collectionMy/create")
    @NotNull
    Observable<CreateEditCollectionResponse> create(@Body @NotNull CreateEditCollectionRequest createEditCollectionRequest, @NotNull @Query("token") String token);

    @GET("collectionMy/delete/{collectionId}")
    @NotNull
    Observable<DeleteCollectionResponse> delete(@Path("collectionId") long collectionId, @NotNull @Query("token") String token);

    @POST("collectionMy/edit/{collectionId}")
    @NotNull
    Observable<CreateEditCollectionResponse> edit(@Path("collectionId") long collectionId, @Body @NotNull CreateEditCollectionRequest createEditCollectionRequest, @NotNull @Query("token") String token);

    @POST("collectionMy/editImage/{collectionId}")
    @NotNull
    @Multipart
    Observable<EditImageCollectionResponse> editImage(@Path("collectionId") long collectionId, @NotNull @Part MultipartBody.Part image, @NotNull @Part("name") RequestBody name, @NotNull @Query("token") String token);

    @GET("collectionMy/release/add/{collectionId}")
    @NotNull
    Observable<ReleaseAddCollectionResponse> releaseAdd(@Path("collectionId") long collectionId, @Query("release_id") long releaseId, @NotNull @Query("token") String token);

    @GET("collectionMy/{id}/releases")
    @NotNull
    Observable<PageableResponse<Release>> releases(@Path("id") long collectionId, @NotNull @Query("token") String token);
}
