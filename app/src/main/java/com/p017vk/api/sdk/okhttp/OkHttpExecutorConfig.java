package com.p017vk.api.sdk.okhttp;

import com.p017vk.api.sdk.VKApiConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: OkHttpExecutorConfig.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/OkHttpExecutorConfig;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class OkHttpExecutorConfig {

    /* renamed from: a */
    public final VKApiConfig f30731a;

    public OkHttpExecutorConfig(@NotNull VKApiConfig apiConfig) {
        Intrinsics.m32180i(apiConfig, "apiConfig");
        this.f30731a = apiConfig;
        if (apiConfig.f30613a == null) {
            throw new IllegalArgumentException("context is null");
        }
        String m16521b = m16521b();
        if (m16521b != null && m16521b.length() != 0) {
            if (m16520a() == null) {
                throw new IllegalArgumentException("Illegal accessToken value");
            }
            return;
        }
        StringBuilder m24u = C0000a.m24u("Illegal host value: ");
        if (m16521b == null) {
            Intrinsics.m32188q();
            throw null;
        }
        m24u.append(m16521b);
        throw new IllegalArgumentException(m24u.toString());
    }

    @NotNull
    /* renamed from: a */
    public final String m16520a() {
        return this.f30731a.f30622j.getValue();
    }

    @NotNull
    /* renamed from: b */
    public final String m16521b() {
        return this.f30731a.f30626n.getValue();
    }

    @NotNull
    public String toString() {
        StringBuilder m27x = C0000a.m27x("OkHttpExecutorConfig(", "host='");
        m27x.append(m16521b());
        m27x.append("', ");
        m27x.append("accessToken='");
        m27x.append(m16520a());
        m27x.append("', ");
        m27x.append("secret='");
        C0000a.m1B(m27x, this.f30731a.f30623k.getValue(), "', ", "logFilterCredentials=");
        m27x.append(this.f30731a.f30624l);
        m27x.append(')');
        return m27x.toString();
    }
}
