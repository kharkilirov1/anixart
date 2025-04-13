package com.p017vk.api.sdk;

import com.p017vk.api.sdk.okhttp.OkHttpExecutor;
import com.p017vk.api.sdk.okhttp.OkHttpExecutorConfig;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VKApiManager.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/VKApiManager;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public class VKApiManager {

    /* renamed from: d */
    public static final /* synthetic */ KProperty[] f30633d = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(VKApiManager.class), "executor", "getExecutor()Lcom/vk/api/sdk/okhttp/OkHttpExecutor;"))};

    /* renamed from: a */
    @Nullable
    public final VKApiValidationHandler f30634a;

    /* renamed from: b */
    @NotNull
    public final Lazy f30635b = LazyKt.m31881b(new Function0<OkHttpExecutor>() { // from class: com.vk.api.sdk.VKApiManager$executor$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public OkHttpExecutor invoke() {
            return new OkHttpExecutor(new OkHttpExecutorConfig(VKApiManager.this.f30636c));
        }
    });

    /* renamed from: c */
    @NotNull
    public final VKApiConfig f30636c;

    public VKApiManager(@NotNull VKApiConfig vKApiConfig) {
        this.f30636c = vKApiConfig;
        this.f30634a = vKApiConfig.f30615c;
    }

    /* renamed from: a */
    public final void m16489a(@NotNull String accessToken, @Nullable String str) {
        Intrinsics.m32180i(accessToken, "accessToken");
        Lazy lazy = this.f30635b;
        KProperty kProperty = f30633d[0];
        OkHttpExecutor okHttpExecutor = (OkHttpExecutor) lazy.getValue();
        Objects.requireNonNull(okHttpExecutor);
        okHttpExecutor.f30725f = accessToken;
        okHttpExecutor.f30726g = str;
    }
}
