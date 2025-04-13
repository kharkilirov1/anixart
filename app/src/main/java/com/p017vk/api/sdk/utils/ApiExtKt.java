package com.p017vk.api.sdk.utils;

import com.p017vk.api.sdk.exceptions.VKApiException;
import com.p017vk.api.sdk.internal.VKErrorUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApiExt.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"libapi-sdk-core_release"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ApiExtKt {
    @NotNull
    /* renamed from: a */
    public static final VKApiException m16532a(@NotNull String str, @Nullable String str2) {
        VKErrorUtils vKErrorUtils = VKErrorUtils.f30708a;
        JSONObject optJSONObject = new JSONObject(str).optJSONObject("error");
        Intrinsics.m32175d(optJSONObject, "JSONObject(errorJson).op…t(VKApiCodes.PARAM_ERROR)");
        return vKErrorUtils.m16513a(optJSONObject, str2);
    }
}
