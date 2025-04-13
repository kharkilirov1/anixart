package com.p017vk.api.sdk.auth;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: VKAuthResult.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/auth/VKAuthResult;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class VKAuthResult {

    /* renamed from: a */
    @Nullable
    public final VKAccessToken f30673a;

    /* renamed from: b */
    public final int f30674b;

    public VKAuthResult(VKAccessToken vKAccessToken, int i2, int i3) {
        i2 = (i3 & 2) != 0 ? 0 : i2;
        this.f30673a = vKAccessToken;
        this.f30674b = i2;
    }
}
