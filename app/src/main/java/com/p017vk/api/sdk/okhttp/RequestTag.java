package com.p017vk.api.sdk.okhttp;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: RequestTag.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/RequestTag;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final /* data */ class RequestTag {

    /* renamed from: a */
    @Nullable
    public final Integer f30745a = null;

    /* renamed from: b */
    @Nullable
    public final Boolean f30746b = null;

    /* renamed from: c */
    @Nullable
    public final String f30747c = null;

    /* renamed from: d */
    @Nullable
    public final Integer f30748d = null;

    @JvmOverloads
    public RequestTag() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestTag)) {
            return false;
        }
        RequestTag requestTag = (RequestTag) obj;
        return Intrinsics.m32174c(this.f30745a, requestTag.f30745a) && Intrinsics.m32174c(this.f30746b, requestTag.f30746b) && Intrinsics.m32174c(this.f30747c, requestTag.f30747c) && Intrinsics.m32174c(this.f30748d, requestTag.f30748d);
    }

    public int hashCode() {
        Integer num = this.f30745a;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Boolean bool = this.f30746b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f30747c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.f30748d;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("RequestTag(uid=");
        m24u.append(this.f30745a);
        m24u.append(", awaitNetwork=");
        m24u.append(this.f30746b);
        m24u.append(", reason=");
        m24u.append(this.f30747c);
        m24u.append(", retryCount=");
        m24u.append(this.f30748d);
        m24u.append(")");
        return m24u.toString();
    }
}
