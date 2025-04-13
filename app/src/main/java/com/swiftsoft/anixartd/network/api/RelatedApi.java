package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: RelatedApi.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u000bH'¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/RelatedApi;", "", "related", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Release;", "relatedId", "", "page", "", FirebaseMessagingService.EXTRA_TOKEN, "", "apiVersion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface RelatedApi {

    /* compiled from: RelatedApi.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Observable related$default(RelatedApi relatedApi, long j2, int i2, String str, String str2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: related");
            }
            if ((i3 & 8) != 0) {
                str2 = "v2";
            }
            return relatedApi.related(j2, i2, str, str2);
        }
    }

    @GET("related/{relatedId}/{page}")
    @NotNull
    Observable<PageableResponse<Release>> related(@Path("relatedId") long relatedId, @Path("page") int page, @NotNull @Query("token") String token, @Header("API-Version") @NotNull String apiVersion);
}
