package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q30 implements b40 {

    /* renamed from: a */
    @NotNull
    private final r30 f53917a;

    /* renamed from: b */
    @NotNull
    private final C5724s3 f53918b;

    /* renamed from: c */
    @NotNull
    private final c40 f53919c;

    /* renamed from: d */
    @NotNull
    private final mc1 f53920d;

    /* renamed from: e */
    @NotNull
    private final a40 f53921e;

    /* renamed from: f */
    @NotNull
    private final mh1 f53922f;

    public q30(@NotNull Context context, @NotNull r30 itemFinishedListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(itemFinishedListener, "itemFinishedListener");
        this.f53917a = itemFinishedListener;
        C5724s3 c5724s3 = new C5724s3();
        this.f53918b = c5724s3;
        c40 c40Var = new c40(context, c5724s3, this);
        this.f53919c = c40Var;
        mc1 mc1Var = new mc1(context, c5724s3);
        this.f53920d = mc1Var;
        this.f53921e = new a40(context, mc1Var, c40Var);
        this.f53922f = new mh1();
    }

    /* renamed from: a */
    public final void m27611a(@NotNull InstreamAdRequestConfiguration configuration) {
        Intrinsics.m32179h(configuration, "configuration");
        mh1 mh1Var = this.f53922f;
        String categoryId = configuration.getCategoryId();
        String pageId = configuration.getPageId();
        Map<String, String> parameters = configuration.getParameters();
        Objects.requireNonNull(mh1Var);
        lh1 m26675a = mh1.m26675a(categoryId, pageId, parameters);
        Intrinsics.m32178g(m26675a, "vmapRequestConfigCreator…tion.parameters\n        )");
        this.f53919c.m23019a(m26675a);
        this.f53918b.m28055b(EnumC5668r3.f54170c);
        this.f53920d.m26613a(m26675a, this.f53921e);
    }

    /* renamed from: a */
    public final void m27610a(@Nullable InstreamAdLoadListener instreamAdLoadListener) {
        this.f53919c.m23020a(instreamAdLoadListener);
    }

    @Override // com.yandex.mobile.ads.impl.b40
    /* renamed from: a */
    public final void mo22716a() {
        this.f53917a.mo27158a(this);
    }
}
