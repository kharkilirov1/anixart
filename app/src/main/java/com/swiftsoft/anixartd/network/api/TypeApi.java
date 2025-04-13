package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.network.response.common.TypeResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: TypeApi.kt */
@Metadata(m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/TypeApi;", "", "types", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/common/TypeResponse;", "releaseId", "", FirebaseMessagingService.EXTRA_TOKEN, "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface TypeApi {
    @GET("type/{releaseId}")
    @NotNull
    Observable<TypeResponse> types(@Path("releaseId") long releaseId);

    @GET("type/all")
    @NotNull
    Observable<TypeResponse> types(@NotNull @Query("token") String token);
}
