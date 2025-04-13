package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i81;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.zw */
/* loaded from: classes3.dex */
public final class C6145zw<K, L> implements yv0<K, InterfaceC6044xw<L>> {

    /* renamed from: a */
    private final int f57346a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC4823at<i81<?>> f57347b;

    /* renamed from: c */
    private final long f57348c;

    /* renamed from: d */
    @NotNull
    private final LinkedHashMap f57349d;

    /* renamed from: com.yandex.mobile.ads.impl.zw$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57350a;

        static {
            int[] iArr = new int[EnumC5901v3.values().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            f57350a = iArr;
        }
    }

    public C6145zw(@Nullable Long l2, int i2, @NotNull InterfaceC4823at<i81<?>> expiredChecker) {
        Intrinsics.m32179h(expiredChecker, "expiredChecker");
        this.f57346a = i2;
        this.f57347b = expiredChecker;
        this.f57348c = l2 != null ? l2.longValue() : 86400000L;
        this.f57349d = new LinkedHashMap();
    }

    @Override // com.yandex.mobile.ads.impl.yv0
    /* renamed from: a */
    public final void mo29976a(C5994ww c5994ww, InterfaceC6044xw value) {
        Object obj;
        Intrinsics.m32179h(value, "value");
        if (this.f57349d.size() == this.f57346a) {
            Iterator it = this.f57349d.entrySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long m25460a = ((i81) ((Map.Entry) next).getValue()).m25460a();
                    do {
                        Object next2 = it.next();
                        long m25460a2 = ((i81) ((Map.Entry) next2).getValue()).m25460a();
                        if (m25460a > m25460a2) {
                            next = next2;
                            m25460a = m25460a2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null) {
                this.f57349d.remove(entry.getKey());
                ((InterfaceC6044xw) ((i81) entry.getValue()).m25461b()).mo23546c();
            }
        }
        this.f57349d.put(c5994ww, i81.C5218a.m25462a(value, this.f57348c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.yv0
    /* renamed from: b */
    public final boolean mo29977b(C5994ww c5994ww) {
        InterfaceC6044xw interfaceC6044xw;
        LinkedHashMap linkedHashMap = this.f57349d;
        InterfaceC4823at<i81<?>> interfaceC4823at = this.f57347b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (interfaceC4823at.mo22621a((i81) entry.getValue())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            this.f57349d.remove(entry2.getKey());
            ((InterfaceC6044xw) ((i81) entry2.getValue()).m25461b()).mo23546c();
        }
        i81 i81Var = (i81) this.f57349d.get(c5994ww);
        EnumC5901v3 mo23547d = (i81Var == null || (interfaceC6044xw = (InterfaceC6044xw) i81Var.m25461b()) == null) ? null : interfaceC6044xw.mo23547d();
        int i2 = mo23547d == null ? -1 : a.f57350a[mo23547d.ordinal()];
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    @Override // com.yandex.mobile.ads.impl.yv0
    public final void clear() {
        Iterator it = this.f57349d.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC6044xw) ((i81) it.next()).m25461b()).mo23546c();
        }
        this.f57349d.clear();
    }

    public /* synthetic */ C6145zw(Long l2) {
        this(l2, 3, new j81());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.yv0
    /* renamed from: a */
    public final InterfaceC6044xw mo29975a(C5994ww c5994ww) {
        LinkedHashMap linkedHashMap = this.f57349d;
        InterfaceC4823at<i81<?>> interfaceC4823at = this.f57347b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (interfaceC4823at.mo22621a((i81) entry.getValue())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            this.f57349d.remove(entry2.getKey());
            ((InterfaceC6044xw) ((i81) entry2.getValue()).m25461b()).mo23546c();
        }
        i81 i81Var = (i81) this.f57349d.remove(c5994ww);
        if (i81Var != null) {
            return (InterfaceC6044xw) i81Var.m25461b();
        }
        return null;
    }
}
