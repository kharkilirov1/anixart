package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.scte35.C4771a;

/* loaded from: classes3.dex */
public interface xd0 {

    /* renamed from: a */
    public static final xd0 f56459a = new C6023a();

    /* renamed from: com.yandex.mobile.ads.impl.xd0$a */
    public class C6023a implements xd0 {
        @Override // com.yandex.mobile.ads.impl.xd0
        /* renamed from: a */
        public final boolean mo29742a(C5606pv c5606pv) {
            String str = c5606pv.f53820l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // com.yandex.mobile.ads.impl.xd0
        /* renamed from: b */
        public final g11 mo29743b(C5606pv c5606pv) {
            String str = c5606pv.f53820l;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new C5219i9();
                    case "application/x-icy":
                        return new c10();
                    case "application/id3":
                        return new d10(null);
                    case "application/x-emsg":
                        return new C5937vr();
                    case "application/x-scte35":
                        return new C4771a();
                }
            }
            throw new IllegalArgumentException(um1.m29049a("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    /* renamed from: a */
    boolean mo29742a(C5606pv c5606pv);

    /* renamed from: b */
    g11 mo29743b(C5606pv c5606pv);
}
