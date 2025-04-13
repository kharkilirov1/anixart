package com.p017vk.api.sdk;

import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VKApiValidationHandler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/vk/api/sdk/VKApiValidationHandler;", "", "Callback", "Credentials", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public interface VKApiValidationHandler {

    /* compiled from: VKApiValidationHandler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/VKApiValidationHandler$Callback;", "T", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Callback<T> {

        /* renamed from: a */
        @Nullable
        public volatile T f30638a;

        /* renamed from: b */
        public final CountDownLatch f30639b;

        public Callback(@NotNull CountDownLatch countDownLatch) {
            this.f30639b = countDownLatch;
        }

        /* renamed from: a */
        public final void m16495a(T t) {
            this.f30638a = t;
            this.f30639b.countDown();
        }
    }

    /* compiled from: VKApiValidationHandler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/VKApiValidationHandler$Credentials;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Credentials {

        /* renamed from: a */
        public final boolean f30640a;

        /* renamed from: b */
        @Nullable
        public final String f30641b;

        /* renamed from: c */
        @Nullable
        public final String f30642c;

        public Credentials(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
            this.f30641b = str;
            this.f30642c = str2;
            this.f30640a = true ^ (str2 == null || StringsKt.m33879E(str2));
        }
    }

    /* renamed from: a */
    void mo16492a(@NotNull String str, @NotNull Callback<Credentials> callback);

    /* renamed from: b */
    void mo16493b(@NotNull String str, @NotNull Callback<Boolean> callback);

    /* renamed from: c */
    void mo16494c(@NotNull String str, @NotNull Callback<String> callback);
}
