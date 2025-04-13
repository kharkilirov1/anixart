package com.swiftsoft.anixartd.network.api;

import com.swiftsoft.anixartd.database.entity.ReleaseStreamingPlatform;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: ReleaseStreamingPlatformApi.kt */
@Metadata(m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ReleaseStreamingPlatformApi;", "", "releaseStreamingPlatform", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/ReleaseStreamingPlatform;", "releaseId", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ReleaseStreamingPlatformApi {
    @GET("release/streaming/platform/{releaseId}/")
    @NotNull
    Observable<PageableResponse<ReleaseStreamingPlatform>> releaseStreamingPlatform(@Path("releaseId") long releaseId);
}
