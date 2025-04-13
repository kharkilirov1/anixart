package com.p017vk.api.sdk.auth;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: VKAuthCallback.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/auth/VKAuthCallback;", "", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public interface VKAuthCallback {

    /* compiled from: VKAuthCallback.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/auth/VKAuthCallback$Companion;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    /* renamed from: a */
    void mo15329a(int i2);

    /* renamed from: b */
    void mo15330b(@NotNull VKAccessToken vKAccessToken);
}
