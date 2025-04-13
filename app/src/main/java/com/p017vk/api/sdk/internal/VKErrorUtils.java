package com.p017vk.api.sdk.internal;

import android.os.Bundle;
import com.p017vk.api.sdk.exceptions.VKApiException;
import com.p017vk.api.sdk.exceptions.VKApiExecutionException;
import com.p017vk.api.sdk.exceptions.VKApiIllegalResponseException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: VKErrorUtils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/internal/VKErrorUtils;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class VKErrorUtils {

    /* renamed from: a */
    public static final VKErrorUtils f30708a = new VKErrorUtils();

    @NotNull
    /* renamed from: a */
    public final VKApiException m16513a(@NotNull JSONObject errorJson, @Nullable String str) {
        Intrinsics.m32180i(errorJson, "errorJson");
        try {
            int i2 = errorJson.getInt("error_code");
            Bundle bundle = null;
            if (i2 == 5) {
                JSONObject optJSONObject = errorJson.optJSONObject("ban_info");
                if (optJSONObject != null) {
                    bundle = new Bundle();
                    bundle.putString("user_ban_info", optJSONObject.toString());
                }
            } else if (i2 == 14) {
                bundle = new Bundle();
                bundle.putString("captcha_sid", errorJson.getString("captcha_sid"));
                bundle.putString("captcha_img", errorJson.getString("captcha_img"));
            } else if (i2 == 17) {
                bundle = new Bundle();
                bundle.putString("validation_url", errorJson.getString("redirect_uri"));
            } else if (i2 == 24) {
                bundle = new Bundle();
                bundle.putString("confirmation_text", errorJson.getString("confirmation_text"));
            }
            return VKApiExecutionException.f30697f.m16506a(errorJson, str, bundle);
        } catch (Exception e2) {
            return new VKApiIllegalResponseException(e2);
        }
    }
}
