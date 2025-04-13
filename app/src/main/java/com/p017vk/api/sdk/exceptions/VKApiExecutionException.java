package com.p017vk.api.sdk.exceptions;

import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p000a.C0000a;

/* compiled from: VKApiExecutionException.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/exceptions/VKApiExecutionException;", "Lcom/vk/api/sdk/exceptions/VKApiException;", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public class VKApiExecutionException extends VKApiException {

    /* renamed from: f */
    public static final Companion f30697f = new Companion(null);

    /* renamed from: b */
    public final int f30698b;

    /* renamed from: c */
    @NotNull
    public final String f30699c;

    /* renamed from: d */
    @Nullable
    public final Bundle f30700d;

    /* renamed from: e */
    @Nullable
    public final List<VKApiExecutionException> f30701e;

    /* compiled from: VKApiExecutionException.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/vk/api/sdk/exceptions/VKApiExecutionException$Companion;", "", "", "serialVersionUID", "J", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        @JvmOverloads
        @NotNull
        /* renamed from: a */
        public final VKApiExecutionException m16506a(@NotNull JSONObject jSONObject, @Nullable String str, @Nullable Bundle bundle) {
            if (str == null) {
                str = jSONObject.optString("method");
            }
            String str2 = str != null ? str : "";
            int i2 = jSONObject.getInt("error_code");
            String optString = jSONObject.optString("error_msg");
            String str3 = optString != null ? optString : "";
            if (jSONObject.has("error_text")) {
                String optString2 = jSONObject.optString("error_text");
                return new VKApiExecutionException(i2, str2, true, optString2 != null ? optString2 : "", bundle, null, str3, 32);
            }
            String optString3 = jSONObject.optString("error_msg");
            String str4 = optString3 != null ? optString3 : "";
            return new VKApiExecutionException(i2, str2, false, str4 + " | by [" + str2 + ']', bundle, null, str4, 32);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VKApiExecutionException(int i2, String apiMethod, boolean z, String detailMessage, Bundle bundle, List list, String str, int i3) {
        super(detailMessage);
        bundle = (i3 & 16) != 0 ? Bundle.EMPTY : bundle;
        list = (i3 & 32) != 0 ? null : list;
        Intrinsics.m32180i(apiMethod, "apiMethod");
        Intrinsics.m32180i(detailMessage, "detailMessage");
        this.f30698b = i2;
        this.f30699c = apiMethod;
        this.f30700d = bundle;
        this.f30701e = list;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKApiExecutionException)) {
            return false;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
        if (this.f30698b == vKApiExecutionException.f30698b) {
            if (!(this.f30700d != null ? !Intrinsics.m32174c(r1, r5) : vKApiExecutionException.f30700d != null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.f30698b * 31;
        Bundle bundle = this.f30700d;
        return i2 + (bundle != null ? bundle.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        StringBuilder m27x = C0000a.m27x("VKApiExecutionException{", "code=");
        m27x.append(this.f30698b);
        m27x.append(", extra=");
        m27x.append(this.f30700d);
        m27x.append(", method=");
        m27x.append(this.f30699c);
        m27x.append(", executeErrors=");
        List<VKApiExecutionException> list = this.f30701e;
        m27x.append(list != null ? CollectionsKt.m31989B(list, null, "[", "]", 0, null, null, 57, null) : null);
        m27x.append(", super=");
        return C0000a.m20q(m27x, super.toString(), "}");
    }
}
