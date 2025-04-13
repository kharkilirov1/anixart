package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public interface z41 {

    /* renamed from: a */
    public static final z41 f57031a = new C6106a();

    /* renamed from: com.yandex.mobile.ads.impl.z41$a */
    public class C6106a implements z41 {
        /* renamed from: a */
        public final x41 m30054a(C5606pv c5606pv) {
            String str = c5606pv.f53820l;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new C5934vq(c5606pv.f53822n);
                    case "application/pgs":
                        return new up0();
                    case "application/x-mp4-vtt":
                        return new cf0();
                    case "text/vtt":
                        return new vi1();
                    case "application/x-quicktime-tx3g":
                        return new q81(c5606pv.f53822n);
                    case "text/x-ssa":
                        return new s31(c5606pv.f53822n);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new C6122zg(c5606pv.f53806D, str);
                    case "text/x-exoplayer-cues":
                        return new C6038xs();
                    case "application/cea-708":
                        return new C4810ah(c5606pv.f53806D, c5606pv.f53822n);
                    case "application/x-subrip":
                        return new u41();
                    case "application/ttml+xml":
                        return new k81();
                }
            }
            throw new IllegalArgumentException(um1.m29049a("Attempted to create decoder for unsupported MIME type: ", str));
        }

        /* renamed from: b */
        public final boolean m30055b(C5606pv c5606pv) {
            String str = c5606pv.f53820l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }
    }
}
