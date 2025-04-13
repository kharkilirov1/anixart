package com.p017vk.api.sdk.chain;

import com.p017vk.api.sdk.VKApiManager;
import com.p017vk.api.sdk.VKApiResponseParser;
import com.p017vk.api.sdk.okhttp.OkHttpExecutor;
import com.p017vk.api.sdk.okhttp.OkHttpMethodCall;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MethodChainCall.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/chain/MethodChainCall;", "T", "Lcom/vk/api/sdk/chain/ChainCall;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public class MethodChainCall<T> extends ChainCall<T> {

    /* renamed from: b */
    @NotNull
    public final OkHttpExecutor f30684b;

    /* renamed from: c */
    @NotNull
    public final OkHttpMethodCall.Builder f30685c;

    /* renamed from: d */
    @NotNull
    public String f30686d;

    /* renamed from: e */
    @NotNull
    public final String f30687e;

    /* renamed from: f */
    @Nullable
    public final VKApiResponseParser<T> f30688f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodChainCall(@NotNull VKApiManager vKApiManager, @NotNull OkHttpExecutor okHttpExecutor, @NotNull OkHttpMethodCall.Builder builder, @NotNull String defaultDeviceId, @NotNull String defaultLang, @Nullable VKApiResponseParser<T> vKApiResponseParser) {
        super(vKApiManager);
        Intrinsics.m32180i(okHttpExecutor, "okHttpExecutor");
        Intrinsics.m32180i(defaultDeviceId, "defaultDeviceId");
        Intrinsics.m32180i(defaultLang, "defaultLang");
        this.f30684b = okHttpExecutor;
        this.f30685c = builder;
        this.f30686d = defaultDeviceId;
        this.f30687e = defaultLang;
        this.f30688f = vKApiResponseParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    @Override // com.p017vk.api.sdk.chain.ChainCall
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T mo16503a(@org.jetbrains.annotations.NotNull com.p017vk.api.sdk.chain.ChainArgs r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p017vk.api.sdk.chain.MethodChainCall.mo16503a(com.vk.api.sdk.chain.ChainArgs):java.lang.Object");
    }
}
