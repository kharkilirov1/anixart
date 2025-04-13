package com.p017vk.api.sdk.auth;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VKAuthManager.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/auth/VKAuthManager;", "", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class VKAuthManager {

    /* compiled from: VKAuthManager.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, m31884d2 = {"Lcom/vk/api/sdk/auth/VKAuthManager$Companion;", "", "", "PREFERENCE_NAME", "Ljava/lang/String;", "SDK_APP_ID", "VK_APP_AUTH_ACTION", "", "VK_APP_AUTH_CODE", "I", "VK_APP_PACKAGE_ID", "VK_AUTH_ERROR", "VK_EXTRA_TOKEN_DATA", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    /* renamed from: a */
    public final int m16500a(@NotNull Context context) {
        try {
            return context.getResources().getInteger(context.getResources().getIdentifier("com_vk_sdk_AppId", "integer", context.getPackageName()));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Nullable
    /* renamed from: b */
    public final VKAccessToken m16501b(@NotNull Context context) {
        Intrinsics.m32180i(context, "context");
        SharedPreferences m16502c = m16502c(context);
        HashMap hashMap = new HashMap();
        for (String key : m16502c.getAll().keySet()) {
            Intrinsics.m32175d(key, "key");
            hashMap.put(key, m16502c.getString(key, ""));
        }
        if (hashMap.containsKey("access_token") && hashMap.containsKey("user_id")) {
            return new VKAccessToken(hashMap);
        }
        return null;
    }

    @NotNull
    /* renamed from: c */
    public final SharedPreferences m16502c(@NotNull Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.vkontakte.android_pref_name", 0);
        Intrinsics.m32175d(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
