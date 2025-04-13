package com.yandex.android.beacon;

import android.net.Uri;
import com.yandex.android.net.CookieStorage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p000a.C0000a;

/* compiled from: SendBeaconRequest.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconRequest;", "", "Companion", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class SendBeaconRequest {

    /* renamed from: a */
    @NotNull
    public final Uri f30815a;

    /* renamed from: b */
    @NotNull
    public final Map<String, String> f30816b;

    /* renamed from: c */
    @Nullable
    public final JSONObject f30817c;

    /* renamed from: d */
    @Nullable
    public final CookieStorage f30818d;

    /* compiled from: SendBeaconRequest.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconRequest$Companion;", "", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    public SendBeaconRequest(@NotNull Uri url, @NotNull Map<String, String> headers, @Nullable JSONObject jSONObject, @Nullable CookieStorage cookieStorage) {
        Intrinsics.m32179h(url, "url");
        Intrinsics.m32179h(headers, "headers");
        this.f30815a = url;
        this.f30816b = headers;
        this.f30817c = jSONObject;
        this.f30818d = cookieStorage;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendBeaconRequest)) {
            return false;
        }
        SendBeaconRequest sendBeaconRequest = (SendBeaconRequest) obj;
        return Intrinsics.m32174c(this.f30815a, sendBeaconRequest.f30815a) && Intrinsics.m32174c(this.f30816b, sendBeaconRequest.f30816b) && Intrinsics.m32174c(this.f30817c, sendBeaconRequest.f30817c) && Intrinsics.m32174c(this.f30818d, sendBeaconRequest.f30818d);
    }

    public int hashCode() {
        int hashCode = (this.f30816b.hashCode() + (this.f30815a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.f30817c;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        CookieStorage cookieStorage = this.f30818d;
        return hashCode2 + (cookieStorage != null ? cookieStorage.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("SendBeaconRequest(url=");
        m24u.append(this.f30815a);
        m24u.append(", headers=");
        m24u.append(this.f30816b);
        m24u.append(", payload=");
        m24u.append(this.f30817c);
        m24u.append(", cookieStorage=");
        m24u.append(this.f30818d);
        m24u.append(')');
        return m24u.toString();
    }
}
