package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class n51 {

    /* renamed from: a */
    @NotNull
    private final String f52848a;

    /* renamed from: b */
    private final boolean f52849b;

    /* renamed from: c */
    @Nullable
    private q51 f52850c;

    /* renamed from: d */
    private long f52851d;

    public /* synthetic */ n51(String str) {
        this(str, true);
    }

    /* renamed from: a */
    public final boolean m26800a() {
        return this.f52849b;
    }

    @NotNull
    /* renamed from: b */
    public final String m26801b() {
        return this.f52848a;
    }

    /* renamed from: c */
    public final long m26802c() {
        return this.f52851d;
    }

    @Nullable
    /* renamed from: d */
    public final q51 m26803d() {
        return this.f52850c;
    }

    /* renamed from: e */
    public abstract long mo26804e();

    @NotNull
    public final String toString() {
        return this.f52848a;
    }

    public n51(@NotNull String name, boolean z) {
        Intrinsics.m32179h(name, "name");
        this.f52848a = name;
        this.f52849b = z;
        this.f52851d = -1L;
    }

    /* renamed from: a */
    public final void m26798a(long j2) {
        this.f52851d = j2;
    }

    /* renamed from: a */
    public final void m26799a(@NotNull q51 queue) {
        Intrinsics.m32179h(queue, "queue");
        q51 q51Var = this.f52850c;
        if (q51Var == queue) {
            return;
        }
        if (q51Var == null) {
            this.f52850c = queue;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }
}
