package com.p017vk.api.sdk.okhttp;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: OkHttpMethodCall.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/OkHttpMethodCall;", "", "Builder", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public class OkHttpMethodCall {

    /* renamed from: a */
    @NotNull
    public final String f30732a;

    /* renamed from: b */
    @NotNull
    public final String f30733b;

    /* renamed from: c */
    @NotNull
    public final Map<String, String> f30734c;

    /* compiled from: OkHttpMethodCall.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/OkHttpMethodCall$Builder;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static class Builder {

        /* renamed from: a */
        @NotNull
        public String f30735a = "";

        /* renamed from: b */
        @NotNull
        public String f30736b = "";

        /* renamed from: c */
        @NotNull
        public Map<String, String> f30737c = new HashMap();

        @NotNull
        /* renamed from: a */
        public Builder m16522a(@NotNull String str, @NotNull String value) {
            Intrinsics.m32180i(value, "value");
            this.f30737c.put(str, value);
            return this;
        }
    }

    public OkHttpMethodCall(@NotNull Builder b) {
        Intrinsics.m32180i(b, "b");
        if (StringsKt.m33879E(b.f30735a)) {
            throw new IllegalArgumentException("method is null or empty");
        }
        if (StringsKt.m33879E(b.f30736b)) {
            throw new IllegalArgumentException("version is null or empty");
        }
        this.f30732a = b.f30735a;
        this.f30733b = b.f30736b;
        this.f30734c = b.f30737c;
    }
}
