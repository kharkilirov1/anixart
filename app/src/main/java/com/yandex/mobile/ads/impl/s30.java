package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s30 {

    /* renamed from: c */
    @NotNull
    public static final C5725a f54491c = new C5725a(0);

    /* renamed from: d */
    @Nullable
    private static volatile s30 f54492d;

    /* renamed from: a */
    @NotNull
    private final Object f54493a;

    /* renamed from: b */
    @NotNull
    private final WeakHashMap<InstreamAdPlayer, y81> f54494b;

    /* renamed from: com.yandex.mobile.ads.impl.s30$a */
    public static final class C5725a {
        private C5725a() {
        }

        public /* synthetic */ C5725a(int i2) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final s30 m28061a() {
            s30 s30Var = s30.f54492d;
            if (s30Var == null) {
                synchronized (this) {
                    s30Var = s30.f54492d;
                    if (s30Var == null) {
                        s30Var = new s30(0);
                        s30.f54492d = s30Var;
                    }
                }
            }
            return s30Var;
        }
    }

    private s30() {
        this.f54493a = new Object();
        this.f54494b = new WeakHashMap<>();
    }

    public /* synthetic */ s30(int i2) {
        this();
    }

    /* renamed from: b */
    public final void m28060b(@NotNull InstreamAdPlayer instreamAdPlayer) {
        Intrinsics.m32179h(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f54493a) {
            this.f54494b.remove(instreamAdPlayer);
        }
    }

    @Nullable
    /* renamed from: a */
    public final y81 m28058a(@NotNull InstreamAdPlayer instreamAdPlayer) {
        y81 y81Var;
        Intrinsics.m32179h(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f54493a) {
            y81Var = this.f54494b.get(instreamAdPlayer);
        }
        return y81Var;
    }

    /* renamed from: a */
    public final void m28059a(@NotNull InstreamAdPlayer instreamAdPlayer, @NotNull y81 adBinder) {
        Intrinsics.m32179h(instreamAdPlayer, "instreamAdPlayer");
        Intrinsics.m32179h(adBinder, "adBinder");
        synchronized (this.f54493a) {
            this.f54494b.put(instreamAdPlayer, adBinder);
        }
    }
}
