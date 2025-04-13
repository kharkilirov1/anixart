package com.p017vk.api.sdk;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.p017vk.api.sdk.VKOkHttpProvider;
import com.p017vk.api.sdk.utils.log.DefaultApiLogger;
import com.p017vk.api.sdk.utils.log.Logger;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: VKApiConfig.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/VKApiConfig;", "", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final /* data */ class VKApiConfig {

    /* renamed from: a */
    @NotNull
    public final Context f30613a;

    /* renamed from: b */
    public final int f30614b;

    /* renamed from: c */
    @Nullable
    public final VKApiValidationHandler f30615c;

    /* renamed from: d */
    @NotNull
    public final Lazy<String> f30616d;

    /* renamed from: e */
    @NotNull
    public final String f30617e;

    /* renamed from: f */
    @NotNull
    public final VKOkHttpProvider f30618f;

    /* renamed from: g */
    public final long f30619g;

    /* renamed from: h */
    public final long f30620h;

    /* renamed from: i */
    @NotNull
    public final Logger f30621i;

    /* renamed from: j */
    @NotNull
    public final Lazy<String> f30622j;

    /* renamed from: k */
    @NotNull
    public final Lazy<String> f30623k;

    /* renamed from: l */
    public final boolean f30624l;

    /* renamed from: m */
    public final int f30625m;

    /* renamed from: n */
    @NotNull
    public final Lazy<String> f30626n;

    /* renamed from: o */
    @NotNull
    public final String f30627o;

    /* compiled from: VKApiConfig.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/vk/api/sdk/VKApiConfig$Companion;", "", "", "DEFAULT_API_DOMAIN", "Ljava/lang/String;", "DEFAULT_API_VERSION", "DEFAULT_DOMAIN", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    public VKApiConfig(Context context, int i2, VKApiValidationHandler vKApiValidationHandler, Lazy lazy, String str, VKOkHttpProvider vKOkHttpProvider, long j2, long j3, Logger logger, Lazy lazy2, Lazy lazy3, boolean z, int i3, Lazy lazy4, String str2, int i4) {
        int i5;
        String lang;
        int i6 = (i4 & 2) != 0 ? 0 : i2;
        Lazy<String> deviceId = (i4 & 8) != 0 ? LazyKt.m31881b(new Function0<String>() { // from class: com.vk.api.sdk.VKApiConfig.1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ String invoke() {
                return "";
            }
        }) : null;
        String version = (i4 & 16) != 0 ? "5.90" : null;
        VKOkHttpProvider.DefaultProvider okHttpProvider = (i4 & 32) != 0 ? new VKOkHttpProvider.DefaultProvider() : null;
        long millis = (i4 & 64) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j2;
        long millis2 = (i4 & 128) != 0 ? TimeUnit.MINUTES.toMillis(5L) : j3;
        DefaultApiLogger logger2 = (i4 & 256) != 0 ? new DefaultApiLogger(LazyKt.m31881b(new Function0<Logger.LogLevel>() { // from class: com.vk.api.sdk.VKApiConfig.2
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Logger.LogLevel invoke() {
                return Logger.LogLevel.NONE;
            }
        }), "VKSdkApi") : null;
        Lazy<String> accessToken = (i4 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? LazyKt.m31881b(new Function0<String>() { // from class: com.vk.api.sdk.VKApiConfig.3
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ String invoke() {
                return "";
            }
        }) : null;
        Lazy<String> secret = (i4 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) != 0 ? LazyKt.m31881b(new Function0() { // from class: com.vk.api.sdk.VKApiConfig.4
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                return null;
            }
        }) : null;
        boolean z2 = (i4 & RecyclerView.ViewHolder.FLAG_MOVED) != 0 ? true : z;
        int i7 = (i4 & RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 3 : i3;
        Lazy<String> httpApiHost = (i4 & RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) != 0 ? LazyKt.m31881b(new Function0<String>() { // from class: com.vk.api.sdk.VKApiConfig.5
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ String invoke() {
                return "api.vk.com";
            }
        }) : null;
        if ((i4 & 16384) != 0) {
            lang = "en";
            i5 = i7;
        } else {
            i5 = i7;
            lang = null;
        }
        Intrinsics.m32180i(deviceId, "deviceId");
        Intrinsics.m32180i(version, "version");
        Intrinsics.m32180i(okHttpProvider, "okHttpProvider");
        Intrinsics.m32180i(logger2, "logger");
        Intrinsics.m32180i(accessToken, "accessToken");
        Intrinsics.m32180i(secret, "secret");
        Intrinsics.m32180i(httpApiHost, "httpApiHost");
        Intrinsics.m32180i(lang, "lang");
        this.f30613a = context;
        this.f30614b = i6;
        this.f30615c = vKApiValidationHandler;
        this.f30616d = deviceId;
        this.f30617e = version;
        this.f30618f = okHttpProvider;
        this.f30619g = millis;
        this.f30620h = millis2;
        this.f30621i = logger2;
        this.f30622j = accessToken;
        this.f30623k = secret;
        this.f30624l = z2;
        this.f30625m = i5;
        this.f30626n = httpApiHost;
        this.f30627o = lang;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKApiConfig)) {
            return false;
        }
        VKApiConfig vKApiConfig = (VKApiConfig) obj;
        return Intrinsics.m32174c(this.f30613a, vKApiConfig.f30613a) && this.f30614b == vKApiConfig.f30614b && Intrinsics.m32174c(this.f30615c, vKApiConfig.f30615c) && Intrinsics.m32174c(this.f30616d, vKApiConfig.f30616d) && Intrinsics.m32174c(this.f30617e, vKApiConfig.f30617e) && Intrinsics.m32174c(this.f30618f, vKApiConfig.f30618f) && this.f30619g == vKApiConfig.f30619g && this.f30620h == vKApiConfig.f30620h && Intrinsics.m32174c(this.f30621i, vKApiConfig.f30621i) && Intrinsics.m32174c(this.f30622j, vKApiConfig.f30622j) && Intrinsics.m32174c(this.f30623k, vKApiConfig.f30623k) && this.f30624l == vKApiConfig.f30624l && this.f30625m == vKApiConfig.f30625m && Intrinsics.m32174c(this.f30626n, vKApiConfig.f30626n) && Intrinsics.m32174c(this.f30627o, vKApiConfig.f30627o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Context context = this.f30613a;
        int hashCode = (((context != null ? context.hashCode() : 0) * 31) + this.f30614b) * 31;
        VKApiValidationHandler vKApiValidationHandler = this.f30615c;
        int hashCode2 = (hashCode + (vKApiValidationHandler != null ? vKApiValidationHandler.hashCode() : 0)) * 31;
        Lazy<String> lazy = this.f30616d;
        int hashCode3 = (hashCode2 + (lazy != null ? lazy.hashCode() : 0)) * 31;
        String str = this.f30617e;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        VKOkHttpProvider vKOkHttpProvider = this.f30618f;
        int hashCode5 = (hashCode4 + (vKOkHttpProvider != null ? vKOkHttpProvider.hashCode() : 0)) * 31;
        long j2 = this.f30619g;
        int i2 = (hashCode5 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f30620h;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Logger logger = this.f30621i;
        int hashCode6 = (i3 + (logger != null ? logger.hashCode() : 0)) * 31;
        Lazy<String> lazy2 = this.f30622j;
        int hashCode7 = (hashCode6 + (lazy2 != null ? lazy2.hashCode() : 0)) * 31;
        Lazy<String> lazy3 = this.f30623k;
        int hashCode8 = (hashCode7 + (lazy3 != null ? lazy3.hashCode() : 0)) * 31;
        boolean z = this.f30624l;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (((hashCode8 + i4) * 31) + this.f30625m) * 31;
        Lazy<String> lazy4 = this.f30626n;
        int hashCode9 = (i5 + (lazy4 != null ? lazy4.hashCode() : 0)) * 31;
        String str2 = this.f30627o;
        return hashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("VKApiConfig(context=");
        m24u.append(this.f30613a);
        m24u.append(", appId=");
        m24u.append(this.f30614b);
        m24u.append(", validationHandler=");
        m24u.append(this.f30615c);
        m24u.append(", deviceId=");
        m24u.append(this.f30616d);
        m24u.append(", version=");
        m24u.append(this.f30617e);
        m24u.append(", okHttpProvider=");
        m24u.append(this.f30618f);
        m24u.append(", defaultTimeoutMs=");
        m24u.append(this.f30619g);
        m24u.append(", postRequestsTimeout=");
        m24u.append(this.f30620h);
        m24u.append(", logger=");
        m24u.append(this.f30621i);
        m24u.append(", accessToken=");
        m24u.append(this.f30622j);
        m24u.append(", secret=");
        m24u.append(this.f30623k);
        m24u.append(", logFilterCredentials=");
        m24u.append(this.f30624l);
        m24u.append(", callsPerSecondLimit=");
        m24u.append(this.f30625m);
        m24u.append(", httpApiHost=");
        m24u.append(this.f30626n);
        m24u.append(", lang=");
        return C0000a.m20q(m24u, this.f30627o, ")");
    }
}
