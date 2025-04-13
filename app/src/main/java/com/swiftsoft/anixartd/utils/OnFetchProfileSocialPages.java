package com.swiftsoft.anixartd.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EventBus.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/OnFetchProfileSocialPages;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OnFetchProfileSocialPages {

    /* renamed from: a */
    public final long f30197a;

    /* renamed from: b */
    @NotNull
    public final String f30198b;

    /* renamed from: c */
    @NotNull
    public final String f30199c;

    /* renamed from: d */
    @NotNull
    public final String f30200d;

    /* renamed from: e */
    @NotNull
    public final String f30201e;

    /* renamed from: f */
    @NotNull
    public final String f30202f;

    public OnFetchProfileSocialPages(long j2, @NotNull String vkPage, @NotNull String tgPage, @NotNull String instPage, @NotNull String ttPage, @NotNull String discordPage) {
        Intrinsics.m32179h(vkPage, "vkPage");
        Intrinsics.m32179h(tgPage, "tgPage");
        Intrinsics.m32179h(instPage, "instPage");
        Intrinsics.m32179h(ttPage, "ttPage");
        Intrinsics.m32179h(discordPage, "discordPage");
        this.f30197a = j2;
        this.f30198b = vkPage;
        this.f30199c = tgPage;
        this.f30200d = instPage;
        this.f30201e = ttPage;
        this.f30202f = discordPage;
    }
}
