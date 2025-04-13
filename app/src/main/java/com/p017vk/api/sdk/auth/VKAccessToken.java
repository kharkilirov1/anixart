package com.p017vk.api.sdk.auth;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VKAccessToken.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/auth/VKAccessToken;", "", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class VKAccessToken {

    /* renamed from: a */
    public final int f30661a;

    /* renamed from: b */
    @NotNull
    public final String f30662b;

    /* renamed from: c */
    @Nullable
    public final String f30663c;

    /* renamed from: d */
    public final long f30664d;

    /* renamed from: e */
    @Nullable
    public final String f30665e;

    /* renamed from: f */
    @Nullable
    public final String f30666f;

    /* renamed from: g */
    @Nullable
    public final String f30667g;

    /* renamed from: h */
    public final boolean f30668h;

    /* renamed from: i */
    public final long f30669i;

    /* compiled from: VKAccessToken.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, m31884d2 = {"Lcom/vk/api/sdk/auth/VKAccessToken$Companion;", "", "", "ACCESS_TOKEN", "Ljava/lang/String;", "CREATED", "EMAIL", "EXPIRES_IN", "HTTPS_REQUIRED", "PHONE", "PHONE_ACCESS_KEY", "SECRET", "USER_ID", "VK_ACCESS_TOKEN_KEY", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    public VKAccessToken(@NotNull Map<String, String> map) {
        long currentTimeMillis;
        long j2;
        String str = map.get("user_id");
        Integer valueOf = str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
        if (valueOf == null) {
            Intrinsics.m32188q();
            throw null;
        }
        this.f30661a = valueOf.intValue();
        String str2 = map.get("access_token");
        if (str2 == null) {
            Intrinsics.m32188q();
            throw null;
        }
        this.f30662b = str2;
        this.f30663c = map.get("secret");
        this.f30668h = Intrinsics.m32174c("1", map.get("https_required"));
        if (map.containsKey("created")) {
            String str3 = map.get("created");
            if (str3 == null) {
                Intrinsics.m32188q();
                throw null;
            }
            currentTimeMillis = Long.parseLong(str3);
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f30664d = currentTimeMillis;
        if (map.containsKey("expires_in")) {
            String str4 = map.get("expires_in");
            if (str4 == null) {
                Intrinsics.m32188q();
                throw null;
            }
            j2 = Long.parseLong(str4);
        } else {
            j2 = -1;
        }
        this.f30669i = j2;
        this.f30665e = map.containsKey("email") ? map.get("email") : null;
        this.f30666f = map.containsKey("phone") ? map.get("phone") : null;
        this.f30667g = map.containsKey("phone_access_key") ? map.get("phone_access_key") : null;
    }
}
