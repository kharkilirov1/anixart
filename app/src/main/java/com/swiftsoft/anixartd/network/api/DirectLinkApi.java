package com.swiftsoft.anixartd.network.api;

import com.swiftsoft.anixartd.network.request.DirectLinksRequest;
import com.swiftsoft.anixartd.network.response.DirectLinksResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: DirectLinkApi.kt */
@Metadata(m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/DirectLinkApi;", "", "links", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/DirectLinksResponse;", "directLinksRequest", "Lcom/swiftsoft/anixartd/network/request/DirectLinksRequest;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface DirectLinkApi {
    @POST("video/parse")
    @NotNull
    Observable<DirectLinksResponse> links(@Body @NotNull DirectLinksRequest directLinksRequest);
}
