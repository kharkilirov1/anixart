package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.q0 */
/* loaded from: classes3.dex */
public final class C5612q0 {

    /* renamed from: a */
    @NonNull
    private final HashSet f53878a = new HashSet();

    /* renamed from: b */
    @NonNull
    private final HashSet f53879b = new HashSet();

    /* renamed from: c */
    private int f53880c;

    public C5612q0(@NonNull Context context) {
        this.f53880c = m27584a(context);
    }

    /* renamed from: a */
    public final void m27586a(@NonNull Configuration configuration) {
        int i2 = configuration.orientation;
        if (i2 != this.f53880c) {
            Iterator it = this.f53878a.iterator();
            while (it.hasNext()) {
                ((InterfaceC6000x0) it.next()).m29612a();
            }
            this.f53880c = i2;
        }
    }

    /* renamed from: b */
    public final void m27588b() {
        Iterator it = this.f53879b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5665r0) it.next()).mo22944a();
        }
    }

    /* renamed from: b */
    public final void m27589b(@NonNull InterfaceC5665r0 interfaceC5665r0) {
        this.f53879b.remove(interfaceC5665r0);
    }

    /* renamed from: a */
    public final void m27585a() {
        Iterator it = this.f53879b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5665r0) it.next()).mo22945b();
        }
    }

    /* renamed from: a */
    public final void m27587a(@NonNull InterfaceC5665r0 interfaceC5665r0) {
        this.f53879b.add(interfaceC5665r0);
    }

    /* renamed from: a */
    private static int m27584a(@NonNull Context context) {
        return context.getResources().getConfiguration().orientation;
    }
}
