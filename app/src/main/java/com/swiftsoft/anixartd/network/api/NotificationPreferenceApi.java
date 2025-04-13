package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.request.preferences.ProfileReleaseTypeNotificationPreferencesEditRequest;
import com.swiftsoft.anixartd.network.request.preferences.ProfileStatusNotificationPreferencesEditRequest;
import com.swiftsoft.anixartd.network.request.preferences.ProfileTypeNotificationPreferencesEditRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.preferences.NotificationPreferenceResponse;
import com.swiftsoft.anixartd.network.response.preferences.ProfileReleaseTypeNotificationPreferencesResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: NotificationPreferenceApi.kt */
@Metadata(m31883d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006!"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/NotificationPreferenceApi;", "", "commentNotificationsEdit", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/Response;", FirebaseMessagingService.EXTRA_TOKEN, "", "episodeNotificationsEdit", "firstEpisodeNotificationsEdit", "my", "Lcom/swiftsoft/anixartd/network/response/preferences/NotificationPreferenceResponse;", "myCollectionCommentNotificationsEdit", "profileReleaseNotificationPreferences", "Lcom/swiftsoft/anixartd/network/response/PageableResponse;", "Lcom/swiftsoft/anixartd/database/entity/Release;", "page", "", "profileReleaseTypeNotificationPreferences", "Lcom/swiftsoft/anixartd/network/response/preferences/ProfileReleaseTypeNotificationPreferencesResponse;", "releaseId", "", "profileReleaseTypeNotificationPreferencesEdit", "profileReleaseTypeNotificationPreferencesEditRequest", "Lcom/swiftsoft/anixartd/network/request/preferences/ProfileReleaseTypeNotificationPreferencesEditRequest;", "profileStatusNotificationPreferencesEdit", "profileStatusNotificationPreferencesEditRequest", "Lcom/swiftsoft/anixartd/network/request/preferences/ProfileStatusNotificationPreferencesEditRequest;", "profileTypeNotificationPreferencesEdit", "profileTypeNotificationPreferencesEditRequest", "Lcom/swiftsoft/anixartd/network/request/preferences/ProfileTypeNotificationPreferencesEditRequest;", "relatedReleaseNotificationsEdit", "reportProcessNotificationsEdit", "selectedReleasesNotificationsEdit", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface NotificationPreferenceApi {
    @GET("profile/preference/notification/comment/edit")
    @NotNull
    Observable<Response> commentNotificationsEdit(@NotNull @Query("token") String token);

    @GET("profile/preference/notification/episode/edit")
    @NotNull
    Observable<Response> episodeNotificationsEdit(@NotNull @Query("token") String token);

    @GET("profile/preference/notification/episode/first/edit")
    @NotNull
    Observable<Response> firstEpisodeNotificationsEdit(@NotNull @Query("token") String token);

    @GET("profile/preference/notification/my")
    @NotNull
    /* renamed from: my */
    Observable<NotificationPreferenceResponse> m14169my(@NotNull @Query("token") String token);

    @GET("profile/preference/notification/my/collection/comment/edit")
    @NotNull
    Observable<Response> myCollectionCommentNotificationsEdit(@NotNull @Query("token") String token);

    @GET("profile/preference/notification/release/all/{page}")
    @NotNull
    Observable<PageableResponse<Release>> profileReleaseNotificationPreferences(@Path("page") int page, @NotNull @Query("token") String token);

    @GET("profile/preference/notification/release/type/{releaseId}")
    @NotNull
    Observable<ProfileReleaseTypeNotificationPreferencesResponse> profileReleaseTypeNotificationPreferences(@Path("releaseId") long releaseId, @NotNull @Query("token") String token);

    @POST("profile/preference/notification/release/type/edit")
    @NotNull
    Observable<Response> profileReleaseTypeNotificationPreferencesEdit(@Body @NotNull ProfileReleaseTypeNotificationPreferencesEditRequest profileReleaseTypeNotificationPreferencesEditRequest, @NotNull @Query("token") String token);

    @POST("profile/preference/notification/status/edit")
    @NotNull
    Observable<Response> profileStatusNotificationPreferencesEdit(@Body @NotNull ProfileStatusNotificationPreferencesEditRequest profileStatusNotificationPreferencesEditRequest, @NotNull @Query("token") String token);

    @POST("profile/preference/notification/type/edit")
    @NotNull
    Observable<Response> profileTypeNotificationPreferencesEdit(@Body @NotNull ProfileTypeNotificationPreferencesEditRequest profileTypeNotificationPreferencesEditRequest, @NotNull @Query("token") String token);

    @GET("profile/preference/notification/related/release/edit")
    @NotNull
    Observable<Response> relatedReleaseNotificationsEdit(@NotNull @Query("token") String token);

    @GET("profile/preference/notification/report/process/edit")
    @NotNull
    Observable<Response> reportProcessNotificationsEdit(@NotNull @Query("token") String token);

    @GET("profile/preference/notification/selected/releases/edit")
    @NotNull
    Observable<Response> selectedReleasesNotificationsEdit(@NotNull @Query("token") String token);
}
