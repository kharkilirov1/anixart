package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.metrica.push.impl.u0 */
/* loaded from: classes2.dex */
public class C4603u0 implements InterfaceC4601t0 {

    /* renamed from: b */
    private static final C4603u0 f47583b = new C4603u0();

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC4601t0> f47584a = new CopyOnWriteArrayList();

    @NonNull
    /* renamed from: a */
    public static C4603u0 m21732a() {
        return f47583b;
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: b */
    public void mo21642b(@NonNull String str, @NonNull String str2) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21642b(str, str2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: c */
    public void mo21646c(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21646c(str, str2, str3);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: d */
    public void mo21648d(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21648d(str, str2, str3);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: e */
    public void mo21649e(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21649e(str, str2, str3);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: f */
    public void mo21650f(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21650f(str, str2, str3);
        }
    }

    /* renamed from: a */
    public void m21733a(@NonNull InterfaceC4601t0 interfaceC4601t0) {
        this.f47584a.add(interfaceC4601t0);
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: a */
    public void mo21638a(@NonNull String str, @NonNull String str2) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21638a(str, str2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: b */
    public void mo21643b(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21643b(str, str2, str3);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: c */
    public void mo21647c(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull String str4, @NonNull String str5) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21647c(str, str2, str3, str4, str5);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: a */
    public void mo21640a(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull String str4) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21640a(str, str2, str3, str4);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: b */
    public void mo21644b(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull String str4) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21644b(str, str2, str3, str4);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: a */
    public void mo21641a(@NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NonNull String str5) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21641a(str, str2, str3, str4, str5);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: b */
    public void mo21645b(@NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NonNull String str5) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21645b(str, str2, str3, str4, str5);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: a */
    public void mo21639a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Iterator<InterfaceC4601t0> it = this.f47584a.iterator();
        while (it.hasNext()) {
            it.next().mo21639a(str, str2, str3);
        }
    }
}
