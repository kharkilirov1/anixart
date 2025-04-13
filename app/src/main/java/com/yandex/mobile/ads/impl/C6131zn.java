package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5405ln;
import com.yandex.mobile.ads.impl.InterfaceC4978dm;
import com.yandex.mobile.ads.impl.bc0;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.yandex.mobile.ads.impl.zn */
/* loaded from: classes3.dex */
public final class C6131zn implements bc0.InterfaceC4857a {

    /* renamed from: com.yandex.mobile.ads.impl.zn$a */
    public static final class a {

        /* renamed from: a */
        private final HashMap f57249a = new HashMap();

        /* renamed from: b */
        private final HashMap f57250b;

        /* renamed from: c */
        private InterfaceC4978dm.a f57251c;

        public a(C5650qn c5650qn) {
            new HashSet();
            this.f57250b = new HashMap();
        }

        /* renamed from: a */
        public final void m30230a(C5405ln.a aVar) {
            if (aVar != this.f57251c) {
                this.f57251c = aVar;
                this.f57249a.clear();
                this.f57250b.clear();
            }
        }
    }

    public C6131zn(C5405ln.a aVar, C5650qn c5650qn) {
        new a(c5650qn).m30230a(aVar);
    }
}
