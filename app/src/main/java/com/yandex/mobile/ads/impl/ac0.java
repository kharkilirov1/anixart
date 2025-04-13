package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ac0 {

    /* renamed from: a */
    @NotNull
    private final lc0 f48481a = new lc0();

    /* renamed from: com.yandex.mobile.ads.impl.ac0$a */
    public static final class C4804a extends Lambda implements Function1<eh0, Set<jc0>> {
        public C4804a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Set<jc0> invoke(eh0 eh0Var) {
            Objects.requireNonNull(ac0.this.f48481a);
            HashSet m26426a = lc0.m26426a(eh0Var);
            Intrinsics.m32178g(m26426a, "mediaValuesProvider.getMediaValues(nativeAd)");
            return m26426a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ac0$b */
    public static final class C4805b extends Lambda implements Function1<jc0, ka0> {

        /* renamed from: a */
        public static final C4805b f48483a = new C4805b();

        public C4805b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ka0 invoke(jc0 jc0Var) {
            return jc0Var.m25864b();
        }
    }

    @NotNull
    /* renamed from: a */
    public final Set<ka0> m22457a(@NotNull kh0 nativeAdBlock) {
        Intrinsics.m32179h(nativeAdBlock, "nativeAdBlock");
        List<eh0> m27736d = nativeAdBlock.m26128c().m27736d();
        Intrinsics.m32178g(m27736d, "nativeAdBlock.nativeAdResponse.nativeAds");
        return SequencesKt.m33833C(SequencesKt.m33843k(SequencesKt.m33852t(SequencesKt.m33846n(CollectionsKt.m32028k(m27736d), new C4804a()), C4805b.f48483a)));
    }
}
