package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Interesting;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: DiscoverApi.kt */
@Metadata(m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u001e\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H'J2\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\b\u001a\u00020\tH'¨\u0006\u0011"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/DiscoverApi;", "", "commentsWeek", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/ReleaseComment;", "discussing", "Lcom/swiftsoft/anixartd/database/entity/Release;", FirebaseMessagingService.EXTRA_TOKEN, "", "interesting", "Lcom/swiftsoft/anixartd/database/entity/Interesting;", "recommendations", "page", "", "previousPage", "watching", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface DiscoverApi {
    @POST("discover/comments")
    @NotNull
    Observable<PageableResponse<ReleaseComment>> commentsWeek();

    @POST("discover/discussing")
    @NotNull
    Observable<PageableResponse<Release>> discussing(@NotNull @Query("token") String token);

    @POST("discover/interesting")
    @NotNull
    Observable<PageableResponse<Interesting>> interesting();

    @POST("discover/recommendations/{page}")
    @NotNull
    Observable<PageableResponse<Release>> recommendations(@Path("page") int page, @Query("previous_page") int previousPage, @NotNull @Query("token") String token);

    @POST("discover/watching/{page}")
    @NotNull
    Observable<PageableResponse<Release>> watching(@Path("page") int page, @NotNull @Query("token") String token);
}
