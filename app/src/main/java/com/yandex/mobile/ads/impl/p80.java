package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface p80 {

    /* renamed from: com.yandex.mobile.ads.impl.p80$a */
    public interface InterfaceC5570a {
        /* renamed from: a */
        void mo22842a(@NotNull p80 p80Var, @NotNull String str);
    }

    /* renamed from: a */
    long mo27184a(@NotNull String str);

    @Nullable
    /* renamed from: a */
    Set mo27185a(@Nullable Set set);

    /* renamed from: a */
    void mo27186a(int i2, @NotNull String str);

    /* renamed from: a */
    void mo27187a(@NotNull InterfaceC5570a interfaceC5570a);

    /* renamed from: a */
    void mo27188a(@NotNull HashSet hashSet);

    /* renamed from: b */
    int mo27189b(int i2, @NotNull String str);

    @Nullable
    /* renamed from: b */
    String mo27190b(@NotNull String str);

    boolean contains(@NotNull String str);

    boolean getBoolean(@NotNull String str, boolean z);

    void putBoolean(@NotNull String str, boolean z);

    void putLong(@NotNull String str, long j2);

    void putString(@NotNull String str, @Nullable String str2);

    void remove(@NotNull String str);
}
