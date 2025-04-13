package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* renamed from: com.yandex.mobile.ads.impl.o0 */
/* loaded from: classes3.dex */
public final class C5518o0 {

    /* renamed from: a */
    @NonNull
    private final AdResponse<String> f53118a;

    /* renamed from: b */
    @Nullable
    private final sk1 f53119b;

    /* renamed from: c */
    @Nullable
    private final NativeAd f53120c;

    /* renamed from: d */
    private final int f53121d;

    /* renamed from: com.yandex.mobile.ads.impl.o0$a */
    public static class a {

        /* renamed from: a */
        @NonNull
        private final AdResponse<String> f53122a;

        /* renamed from: b */
        @Nullable
        private sk1 f53123b;

        /* renamed from: c */
        @Nullable
        private NativeAd f53124c;

        /* renamed from: d */
        private int f53125d = 0;

        public a(@NonNull AdResponse<String> adResponse) {
            this.f53122a = adResponse;
        }

        @NonNull
        /* renamed from: a */
        public final a m26976a(@NonNull sk1 sk1Var) {
            this.f53123b = sk1Var;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a m26977a(@NonNull NativeAd nativeAd) {
            this.f53124c = nativeAd;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a m26975a(int i2) {
            this.f53125d = i2;
            return this;
        }
    }

    public C5518o0(@NonNull a aVar) {
        this.f53118a = aVar.f53122a;
        this.f53119b = aVar.f53123b;
        this.f53120c = aVar.f53124c;
        this.f53121d = aVar.f53125d;
    }

    @NonNull
    /* renamed from: a */
    public final AdResponse<String> m26967a() {
        return this.f53118a;
    }

    @Nullable
    /* renamed from: b */
    public final NativeAd m26968b() {
        return this.f53120c;
    }

    /* renamed from: c */
    public final int m26969c() {
        return this.f53121d;
    }

    @Nullable
    /* renamed from: d */
    public final sk1 m26970d() {
        return this.f53119b;
    }
}
