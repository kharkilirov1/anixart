package com.swiftsoft.anixartd.network.api;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.network.response.auth.FirebaseResponse;
import com.swiftsoft.anixartd.network.response.auth.GoogleResponse;
import com.swiftsoft.anixartd.network.response.auth.ResendResponse;
import com.swiftsoft.anixartd.network.response.auth.RestoreResendResponse;
import com.swiftsoft.anixartd.network.response.auth.RestoreResponse;
import com.swiftsoft.anixartd.network.response.auth.RestoreVerifyResponse;
import com.swiftsoft.anixartd.network.response.auth.SignInResponse;
import com.swiftsoft.anixartd.network.response.auth.SignUpResponse;
import com.swiftsoft.anixartd.network.response.auth.VerifyResponse;
import com.swiftsoft.anixartd.network.response.auth.VkResponse;
import com.yandex.metrica.push.common.CoreConstants;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: AuthApi.kt */
@Metadata(m31883d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'JP\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u0006H'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0006H'J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u0006H'J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0006H'J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\r\u001a\u00020\u0006H'J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\f\u001a\u00020\u0006H'J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H'J,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H'JZ\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0006H'¨\u0006#"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/api/AuthApi;", "", CoreConstants.Transport.FIREBASE, "Lio/reactivex/Observable;", "Lcom/swiftsoft/anixartd/network/response/auth/FirebaseResponse;", FirebaseMessagingService.EXTRA_TOKEN, "", "resend", "Lcom/swiftsoft/anixartd/network/response/auth/ResendResponse;", "login", "email", "password", "vkAccessToken", "googleIdToken", "hash", "restore", "Lcom/swiftsoft/anixartd/network/response/auth/RestoreResponse;", "data", "restoreResend", "Lcom/swiftsoft/anixartd/network/response/auth/RestoreResendResponse;", "restoreVerify", "Lcom/swiftsoft/anixartd/network/response/auth/RestoreVerifyResponse;", "code", "signIn", "Lcom/swiftsoft/anixartd/network/response/auth/SignInResponse;", "signInWithGoogle", "Lcom/swiftsoft/anixartd/network/response/auth/GoogleResponse;", "signInWithVk", "Lcom/swiftsoft/anixartd/network/response/auth/VkResponse;", "signUp", "Lcom/swiftsoft/anixartd/network/response/auth/SignUpResponse;", "signUpWithGoogle", "signUpWithVk", "verify", "Lcom/swiftsoft/anixartd/network/response/auth/VerifyResponse;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface AuthApi {

    /* compiled from: AuthApi.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Observable resend$default(AuthApi authApi, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
            if (obj == null) {
                return authApi.resend(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, str6);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resend");
        }

        public static /* synthetic */ Observable verify$default(AuthApi authApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, Object obj) {
            if (obj == null) {
                return authApi.verify(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, str6, str7);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verify");
        }
    }

    @POST("auth/firebase")
    @NotNull
    Observable<FirebaseResponse> firebase(@NotNull @Query("token") String token);

    @FormUrlEncoded
    @POST("auth/resend")
    @NotNull
    Observable<ResendResponse> resend(@Field("login") @NotNull String login, @Field("email") @NotNull String email, @Field("password") @Nullable String password, @Field("vkAccessToken") @Nullable String vkAccessToken, @Field("googleIdToken") @Nullable String googleIdToken, @Field("hash") @NotNull String hash);

    @FormUrlEncoded
    @POST("auth/restore")
    @NotNull
    Observable<RestoreResponse> restore(@Field("data") @NotNull String data);

    @FormUrlEncoded
    @POST("auth/restore/resend")
    @NotNull
    Observable<RestoreResendResponse> restoreResend(@Field("data") @NotNull String data, @Field("password") @NotNull String token, @Field("hash") @NotNull String hash);

    @FormUrlEncoded
    @POST("auth/restore/verify")
    @NotNull
    Observable<RestoreVerifyResponse> restoreVerify(@Field("data") @NotNull String data, @Field("password") @NotNull String token, @Field("hash") @NotNull String hash, @Field("code") @NotNull String code);

    @FormUrlEncoded
    @POST("auth/signIn")
    @NotNull
    Observable<SignInResponse> signIn(@Field("login") @NotNull String login, @Field("password") @NotNull String token);

    @FormUrlEncoded
    @POST("auth/google")
    @NotNull
    Observable<GoogleResponse> signInWithGoogle(@Field("googleIdToken") @NotNull String googleIdToken);

    @FormUrlEncoded
    @POST("auth/vk")
    @NotNull
    Observable<VkResponse> signInWithVk(@Field("vkAccessToken") @NotNull String vkAccessToken);

    @FormUrlEncoded
    @POST("auth/signUp")
    @NotNull
    Observable<SignUpResponse> signUp(@Field("login") @NotNull String login, @Field("email") @NotNull String email, @Field("password") @NotNull String token);

    @FormUrlEncoded
    @POST("auth/google")
    @NotNull
    Observable<GoogleResponse> signUpWithGoogle(@Field("login") @NotNull String login, @Field("email") @NotNull String email, @Field("googleIdToken") @NotNull String googleIdToken);

    @FormUrlEncoded
    @POST("auth/vk")
    @NotNull
    Observable<VkResponse> signUpWithVk(@Field("login") @NotNull String login, @Field("email") @NotNull String email, @Field("vkAccessToken") @NotNull String vkAccessToken);

    @FormUrlEncoded
    @POST("auth/verify")
    @NotNull
    Observable<VerifyResponse> verify(@Field("login") @NotNull String login, @Field("email") @NotNull String email, @Field("password") @Nullable String password, @Field("vkAccessToken") @Nullable String vkAccessToken, @Field("googleIdToken") @Nullable String googleIdToken, @Field("hash") @NotNull String hash, @Field("code") @NotNull String code);
}
