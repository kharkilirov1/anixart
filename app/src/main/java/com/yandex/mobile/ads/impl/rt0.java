package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.tf1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class rt0 implements id1 {

    /* renamed from: a */
    @NonNull
    private final tf1 f54415a;

    /* renamed from: b */
    @NonNull
    private final ArrayList f54416b = m27984a();

    /* renamed from: com.yandex.mobile.ads.impl.rt0$a */
    public static class C5711a {

        /* renamed from: a */
        @NonNull
        public final tf1.EnumC5800a f54417a;

        /* renamed from: b */
        public final float f54418b;

        public C5711a(@NonNull tf1.EnumC5800a enumC5800a, float f2) {
            this.f54417a = enumC5800a;
            this.f54418b = f2;
        }
    }

    public rt0(@NonNull tf1 tf1Var) {
        this.f54415a = tf1Var;
    }

    @Override // com.yandex.mobile.ads.impl.id1
    /* renamed from: a */
    public final void mo22386a(long j2, long j3) {
        if (j2 != 0) {
            Iterator it = this.f54416b.iterator();
            while (it.hasNext()) {
                C5711a c5711a = (C5711a) it.next();
                if (c5711a.f54418b * j2 <= j3) {
                    this.f54415a.mo25507a(c5711a.f54417a);
                    it.remove();
                }
            }
        }
    }

    @NonNull
    /* renamed from: a */
    private static ArrayList m27984a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5711a(tf1.EnumC5800a.f55109a, 0.25f));
        arrayList.add(new C5711a(tf1.EnumC5800a.f55110b, 0.5f));
        arrayList.add(new C5711a(tf1.EnumC5800a.f55111c, 0.75f));
        return arrayList;
    }
}
