package com.p017vk.api.sdk;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: VKMethodCall.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/vk/api/sdk/VKMethodCall;", "", "Builder", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public class VKMethodCall {

    /* renamed from: a */
    @NotNull
    public final String f30644a;

    /* renamed from: b */
    @NotNull
    public final String f30645b;

    /* renamed from: c */
    @NotNull
    public final Map<String, String> f30646c;

    /* renamed from: d */
    public final int f30647d;

    /* compiled from: VKMethodCall.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/VKMethodCall$Builder;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static class Builder {

        /* renamed from: a */
        @NotNull
        public String f30648a = "";

        /* renamed from: b */
        @NotNull
        public String f30649b = "";

        /* renamed from: c */
        @NotNull
        public Map<String, String> f30650c = new LinkedHashMap();

        /* renamed from: d */
        public int f30651d = 4;
    }

    /* compiled from: VKMethodCall.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/vk/api/sdk/VKMethodCall$Companion;", "", "", "DEFAULT_RETRY_COUNT", "I", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    public VKMethodCall(@NotNull Builder builder) {
        if (StringsKt.m33879E(builder.f30648a)) {
            throw new IllegalArgumentException("method is null or empty");
        }
        if (StringsKt.m33879E(builder.f30649b)) {
            throw new IllegalArgumentException("version is null or empty");
        }
        this.f30644a = builder.f30648a;
        this.f30645b = builder.f30649b;
        this.f30646c = builder.f30650c;
        this.f30647d = builder.f30651d;
    }
}
