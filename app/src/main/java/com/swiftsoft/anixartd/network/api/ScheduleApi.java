package com.swiftsoft.anixartd.network.api;

import com.swiftsoft.anixartd.network.response.ScheduleResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* compiled from: ScheduleApi.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ScheduleApi;", "", "schedule", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/ScheduleResponse;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ScheduleApi {
    @GET("schedule")
    @NotNull
    Observable<ScheduleResponse> schedule();
}
