package com.p017vk.api.sdk.requests;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: VKBooleanRequest.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/requests/VKBooleanRequest;", "Lcom/vk/api/sdk/requests/VKRequest;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public class VKBooleanRequest extends VKRequest<Boolean> {
    public VKBooleanRequest(@NotNull String str) {
        super(str);
    }

    @Override // com.p017vk.api.sdk.requests.VKRequest
    /* renamed from: c */
    public Boolean mo16524c(JSONObject jSONObject) {
        return Boolean.TRUE;
    }
}
