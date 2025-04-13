package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.request.profile.PrivacyEditRequest;
import com.swiftsoft.anixartd.network.request.profile.SocialPagesEditRequest;
import com.swiftsoft.anixartd.network.request.profile.StatusEditRequest;
import com.swiftsoft.anixartd.network.response.profile.ChangeEmailConfirmResponse;
import com.swiftsoft.anixartd.network.response.profile.ChangeEmailResponse;
import com.swiftsoft.anixartd.network.response.profile.ChangeLoginInfoResponse;
import com.swiftsoft.anixartd.network.response.profile.ChangeLoginResponse;
import com.swiftsoft.anixartd.network.response.profile.ChangePasswordResponse;
import com.swiftsoft.anixartd.network.response.profile.GoogleBindResponse;
import com.swiftsoft.anixartd.network.response.profile.GoogleUnbindResponse;
import com.swiftsoft.anixartd.network.response.profile.ProfilePreferenceResponse;
import com.swiftsoft.anixartd.network.response.profile.ProfileSocialResponse;
import com.swiftsoft.anixartd.network.response.profile.SocialEditResponse;
import com.swiftsoft.anixartd.network.response.profile.VkBindResponse;
import com.swiftsoft.anixartd.network.response.profile.VkUnbindResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/* compiled from: ProfilePreferenceApi.kt */
@Metadata(m31883d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH'J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\"\u001a\u00020#2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\"\u001a\u00020#2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\"\u001a\u00020#2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010&\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\"\u001a\u00020#2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010+\u001a\u00020,2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010/\u001a\u0002002\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00032\b\b\u0001\u00103\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u00066"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/ProfilePreferenceApi;", "", "avatarEdit", "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/profile/ProfilePreferenceResponse;", FirebaseMessagingService.EXTRA_TOKEN, "", "image", "Lokhttp3/MultipartBody$Part;", "name", "Lokhttp3/RequestBody;", "changeEmail", "Lcom/swiftsoft/anixartd/network/response/profile/ChangeEmailResponse;", "currentPassword", "currentEmail", "newEmail", "changeEmailConfirm", "Lcom/swiftsoft/anixartd/network/response/profile/ChangeEmailConfirmResponse;", "changeLogin", "Lcom/swiftsoft/anixartd/network/response/profile/ChangeLoginResponse;", "login", "changeLoginInfo", "Lcom/swiftsoft/anixartd/network/response/profile/ChangeLoginInfoResponse;", "changePassword", "Lcom/swiftsoft/anixartd/network/response/profile/ChangePasswordResponse;", "newPassword", "googleBind", "Lcom/swiftsoft/anixartd/network/response/profile/GoogleBindResponse;", "idToken", "googleUnbind", "Lcom/swiftsoft/anixartd/network/response/profile/GoogleUnbindResponse;", "my", "privacyCountsEdit", "Lcom/swiftsoft/anixartd/network/Response;", "privacyEditRequest", "Lcom/swiftsoft/anixartd/network/request/profile/PrivacyEditRequest;", "privacyFriendRequestsEdit", "privacySocialEdit", "privacyStatsEdit", "social", "Lcom/swiftsoft/anixartd/network/response/profile/ProfileSocialResponse;", "socialPagesEdit", "Lcom/swiftsoft/anixartd/network/response/profile/SocialEditResponse;", "editPreferenceSocialPagesRequest", "Lcom/swiftsoft/anixartd/network/request/profile/SocialPagesEditRequest;", "statusDelete", "statusEdit", "editPreferenceStatusRequest", "Lcom/swiftsoft/anixartd/network/request/profile/StatusEditRequest;", "vkBind", "Lcom/swiftsoft/anixartd/network/response/profile/VkBindResponse;", "accessToken", "vkUnbind", "Lcom/swiftsoft/anixartd/network/response/profile/VkUnbindResponse;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ProfilePreferenceApi {
    @POST("profile/preference/avatar/edit")
    @NotNull
    @Multipart
    Observable<ProfilePreferenceResponse> avatarEdit(@NotNull @Query("token") String token, @NotNull @Part MultipartBody.Part image, @NotNull @Part("name") RequestBody name);

    @GET("profile/preference/email/change")
    @NotNull
    Observable<ChangeEmailResponse> changeEmail(@NotNull @Query("current_password") String currentPassword, @NotNull @Query("current") String currentEmail, @NotNull @Query("new") String newEmail, @NotNull @Query("token") String token);

    @GET("profile/preference/email/change/confirm")
    @NotNull
    Observable<ChangeEmailConfirmResponse> changeEmailConfirm(@NotNull @Query("current") String currentPassword, @NotNull @Query("token") String token);

    @POST("profile/preference/login/change")
    @NotNull
    Observable<ChangeLoginResponse> changeLogin(@NotNull @Query("login") String login, @NotNull @Query("token") String token);

    @POST("profile/preference/login/info")
    @NotNull
    Observable<ChangeLoginInfoResponse> changeLoginInfo(@NotNull @Query("token") String token);

    @GET("profile/preference/password/change")
    @NotNull
    Observable<ChangePasswordResponse> changePassword(@NotNull @Query("current") String currentPassword, @NotNull @Query("new") String newPassword, @NotNull @Query("token") String token);

    @FormUrlEncoded
    @POST("profile/preference/google/bind")
    @NotNull
    Observable<GoogleBindResponse> googleBind(@Field("idToken") @NotNull String idToken, @NotNull @Query("token") String token);

    @POST("profile/preference/google/unbind")
    @NotNull
    Observable<GoogleUnbindResponse> googleUnbind(@NotNull @Query("token") String token);

    @GET("profile/preference/my")
    @NotNull
    /* renamed from: my */
    Observable<ProfilePreferenceResponse> m14170my(@NotNull @Query("token") String token);

    @POST("profile/preference/privacy/counts/edit")
    @NotNull
    Observable<Response> privacyCountsEdit(@Body @NotNull PrivacyEditRequest privacyEditRequest, @NotNull @Query("token") String token);

    @POST("profile/preference/privacy/friendRequests/edit")
    @NotNull
    Observable<Response> privacyFriendRequestsEdit(@Body @NotNull PrivacyEditRequest privacyEditRequest, @NotNull @Query("token") String token);

    @POST("profile/preference/privacy/social/edit")
    @NotNull
    Observable<Response> privacySocialEdit(@Body @NotNull PrivacyEditRequest privacyEditRequest, @NotNull @Query("token") String token);

    @POST("profile/preference/privacy/stats/edit")
    @NotNull
    Observable<Response> privacyStatsEdit(@Body @NotNull PrivacyEditRequest privacyEditRequest, @NotNull @Query("token") String token);

    @GET("profile/preference/social")
    @NotNull
    Observable<ProfileSocialResponse> social(@NotNull @Query("token") String token);

    @POST("profile/preference/social/edit")
    @NotNull
    Observable<SocialEditResponse> socialPagesEdit(@Body @NotNull SocialPagesEditRequest editPreferenceSocialPagesRequest, @NotNull @Query("token") String token);

    @GET("profile/preference/status/delete")
    @NotNull
    Observable<ProfilePreferenceResponse> statusDelete(@NotNull @Query("token") String token);

    @POST("profile/preference/status/edit")
    @NotNull
    Observable<ProfilePreferenceResponse> statusEdit(@Body @NotNull StatusEditRequest editPreferenceStatusRequest, @NotNull @Query("token") String token);

    @FormUrlEncoded
    @POST("profile/preference/vk/bind")
    @NotNull
    Observable<VkBindResponse> vkBind(@Field("accessToken") @NotNull String accessToken, @NotNull @Query("token") String token);

    @POST("profile/preference/vk/unbind")
    @NotNull
    Observable<VkUnbindResponse> vkUnbind(@NotNull @Query("token") String token);
}
