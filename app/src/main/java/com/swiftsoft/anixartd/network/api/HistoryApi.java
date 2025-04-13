package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.HistoryResponse;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: HistoryApi.kt */
@Metadata(m31883d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH'J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00032\b\b\u0001\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'¨\u0006\u0012"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/HistoryApi;", "", "add", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/HistoryResponse;", "releaseId", "", "sourceId", "position", "", FirebaseMessagingService.EXTRA_TOKEN, "", "delete", "id", "history", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Release;", "page", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface HistoryApi {
    @GET("history/add/{r_id}/{s_id}/{position}")
    @NotNull
    Observable<HistoryResponse> add(@Path("r_id") long releaseId, @Path("s_id") long sourceId, @Path("position") int position, @NotNull @Query("token") String token);

    @GET("history/delete/{r_id}")
    @NotNull
    Observable<HistoryResponse> delete(@Path("r_id") long id2, @NotNull @Query("token") String token);

    @GET("history/{page}")
    @NotNull
    Observable<PageableResponse<Release>> history(@Path("page") int page, @NotNull @Query("token") String token);
}
