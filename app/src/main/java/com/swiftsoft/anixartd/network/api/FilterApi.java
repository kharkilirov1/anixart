package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.request.filter.FilterRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: FilterApi.kt */
@Metadata(m31883d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JC\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH'¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/FilterApi;", "", "filter", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Release;", "page", "", "filterRequest", "Lcom/swiftsoft/anixartd/network/request/filter/FilterRequest;", "extendedMode", "", FirebaseMessagingService.EXTRA_TOKEN, "", "(ILcom/swiftsoft/anixartd/network/request/filter/FilterRequest;Ljava/lang/Boolean;Ljava/lang/String;)Lio/reactivex/Observable;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface FilterApi {
    @POST("filter/{page}")
    @NotNull
    Observable<PageableResponse<Release>> filter(@Path("page") int page, @Body @NotNull FilterRequest filterRequest, @Nullable @Query("extended_mode") Boolean extendedMode, @NotNull @Query("token") String token);
}
