package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.identifiers.impl.e */
/* loaded from: classes2.dex */
public final class C3136e {

    /* renamed from: a */
    @NotNull
    public final ServiceConnectionC3135d f42489a;

    /* renamed from: b */
    public final Function1 f42490b;

    /* renamed from: c */
    public final String f42491c;

    /* renamed from: d */
    public final C3154w f42492d;

    public C3136e(@NotNull Intent intent, @NotNull Function1 converter, @NotNull String str) {
        Intrinsics.m32179h(intent, "intent");
        Intrinsics.m32179h(converter, "converter");
        ServiceConnectionC3135d serviceConnectionC3135d = new ServiceConnectionC3135d(intent, str);
        String tag = C0000a.m15l("[AdInServiceConnectionController-", str, ']');
        C3154w c3154w = new C3154w();
        Intrinsics.m32179h(tag, "tag");
        this.f42489a = serviceConnectionC3135d;
        this.f42490b = converter;
        this.f42491c = str;
        this.f42492d = c3154w;
    }

    /* renamed from: a */
    public final Object m17798a(@NotNull Context context) {
        ResolveInfo resolveInfo;
        Intrinsics.m32179h(context, "context");
        Intent intent = this.f42489a.f42486b;
        Intrinsics.m32178g(intent, "connection.intent");
        Objects.requireNonNull(this.f42492d);
        IBinder iBinder = null;
        try {
            resolveInfo = context.getPackageManager().resolveService(intent, 0);
        } catch (Throwable unused) {
            resolveInfo = null;
        }
        if (resolveInfo == null) {
            throw new C3144m(C0000a.m20q(C0000a.m24u("could not resolve "), this.f42491c, " services"));
        }
        try {
            ServiceConnectionC3135d serviceConnectionC3135d = this.f42489a;
            if (context.bindService(serviceConnectionC3135d.f42486b, serviceConnectionC3135d, 1)) {
                ServiceConnectionC3135d serviceConnectionC3135d2 = this.f42489a;
                if (serviceConnectionC3135d2.f42487c == null) {
                    synchronized (serviceConnectionC3135d2.f42488d) {
                        if (serviceConnectionC3135d2.f42487c == null) {
                            try {
                                serviceConnectionC3135d2.f42488d.wait(3000L);
                            } catch (InterruptedException unused2) {
                            }
                        }
                    }
                }
                iBinder = serviceConnectionC3135d2.f42487c;
            }
        } catch (Throwable unused3) {
        }
        if (iBinder != null) {
            return this.f42490b.invoke(iBinder);
        }
        throw new C3141j(C0000a.m20q(C0000a.m24u("could not bind to "), this.f42491c, " services"));
    }
}
