package com.p017vk.api.sdk.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ThreadLocalDelegate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/utils/ThreadLocalDelegateImpl;", "T", "Lcom/vk/api/sdk/utils/ThreadLocalDelegate;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ThreadLocalDelegateImpl<T> implements ThreadLocalDelegate<T> {

    /* renamed from: a */
    public final ThreadLocal<T> f30788a = new ThreadLocal<T>() { // from class: com.vk.api.sdk.utils.ThreadLocalDelegateImpl$value$1
        @Override // java.lang.ThreadLocal
        public T initialValue() {
            return ThreadLocalDelegateImpl.this.f30789b.invoke();
        }
    };

    /* renamed from: b */
    @NotNull
    public final Function0<T> f30789b;

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadLocalDelegateImpl(@NotNull Function0<? extends T> function0) {
        this.f30789b = function0;
    }

    @Override // com.p017vk.api.sdk.utils.ThreadLocalDelegate
    public T get() {
        T t = this.f30788a.get();
        if (t != null) {
            return t;
        }
        Intrinsics.m32188q();
        throw null;
    }
}
