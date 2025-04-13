package com.p017vk.api.sdk.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ThreadLocalDelegate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"libapi-sdk-core_release"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ThreadLocalDelegateKt {
    @NotNull
    /* renamed from: a */
    public static final <T> ThreadLocalDelegate<T> m16534a(@NotNull Function0<? extends T> factory) {
        Intrinsics.m32180i(factory, "factory");
        return new ThreadLocalDelegateImpl(factory);
    }
}
