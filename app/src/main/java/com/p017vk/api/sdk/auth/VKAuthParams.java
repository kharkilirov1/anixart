package com.p017vk.api.sdk.auth;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VKAuthParams.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/auth/VKAuthParams;", "", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class VKAuthParams {

    /* renamed from: a */
    public final Set<VKScope> f30670a;

    /* renamed from: b */
    public final int f30671b;

    /* renamed from: c */
    @NotNull
    public final String f30672c;

    /* compiled from: VKAuthParams.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, m31884d2 = {"Lcom/vk/api/sdk/auth/VKAuthParams$Companion;", "", "", "DEFAULT_REDIRECT_URL", "Ljava/lang/String;", "VK_APP_ID_KEY", "VK_APP_REDIRECT_URL_KEY", "VK_APP_SCOPE_KEY", "VK_EXTRA_CLIENT_ID", "VK_EXTRA_REDIRECT_URL", "VK_EXTRA_REVOKE", "VK_EXTRA_SCOPE", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    @JvmOverloads
    public VKAuthParams(int i2, @NotNull String redirectUrl, @NotNull Collection<? extends VKScope> scope) {
        Intrinsics.m32180i(redirectUrl, "redirectUrl");
        Intrinsics.m32180i(scope, "scope");
        this.f30671b = i2;
        this.f30672c = redirectUrl;
        if (i2 == 0) {
            throw new IllegalStateException("AppId is empty! Find out how to get your appId at https://vk.com/dev/access_token");
        }
        this.f30670a = new HashSet(scope);
    }
}
