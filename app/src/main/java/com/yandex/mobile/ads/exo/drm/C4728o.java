package com.yandex.mobile.ads.exo.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4700q;
import com.yandex.mobile.ads.exo.drm.InterfaceC4726m;
import com.yandex.mobile.ads.impl.C5192hm;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5754sn;
import com.yandex.mobile.ads.impl.C5915vf;
import com.yandex.mobile.ads.impl.InterfaceC4978dm;
import com.yandex.mobile.ads.impl.hb0;
import com.yandex.mobile.ads.impl.s91;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.exo.drm.o */
/* loaded from: classes2.dex */
public final class C4728o implements InterfaceC4729p {

    /* renamed from: a */
    private final InterfaceC4978dm.a f48037a;

    /* renamed from: b */
    @Nullable
    private final String f48038b;

    /* renamed from: c */
    private final boolean f48039c;

    /* renamed from: d */
    private final HashMap f48040d;

    public C4728o(@Nullable String str, boolean z, C5754sn.a aVar) {
        C5220ia.m25473a((z && TextUtils.isEmpty(str)) ? false : true);
        this.f48037a = aVar;
        this.f48038b = str;
        this.f48039c = z;
        this.f48040d = new HashMap();
    }

    /* renamed from: a */
    public final byte[] m22220a(InterfaceC4726m.d dVar) throws hb0 {
        return m22218a(this.f48037a, dVar.m22207b() + "&signedRequest=" + s91.m28103a(dVar.m22206a()), null, Collections.emptyMap());
    }

    /* renamed from: a */
    public final byte[] m22221a(UUID uuid, InterfaceC4726m.a aVar) throws hb0 {
        String str;
        String m22205b = aVar.m22205b();
        if (this.f48039c || TextUtils.isEmpty(m22205b)) {
            m22205b = this.f48038b;
        }
        if (!TextUtils.isEmpty(m22205b)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = C5915vf.f55811e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = C5915vf.f55809c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f48040d) {
                hashMap.putAll(this.f48040d);
            }
            return m22218a(this.f48037a, m22205b, aVar.m22204a(), hashMap);
        }
        throw new hb0(new C5192hm.a().m25240a(Uri.EMPTY).m25244a(), Uri.EMPTY, AbstractC4700q.m22063h(), 0L, new IllegalStateException("No license URL"));
    }

    /* renamed from: a */
    public final void m22219a(String str, String str2) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(str2);
        synchronized (this.f48040d) {
            this.f48040d.put(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:5:0x002f, B:6:0x003a, B:8:0x0041, B:10:0x0045, B:17:0x0050, B:26:0x0081, B:29:0x0093, B:31:0x0063, B:33:0x0067, B:35:0x0071, B:37:0x0077), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m22218a(com.yandex.mobile.ads.impl.InterfaceC4978dm.a r8, java.lang.String r9, @androidx.annotation.Nullable byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11) throws com.yandex.mobile.ads.impl.hb0 {
        /*
            com.yandex.mobile.ads.impl.d41 r0 = new com.yandex.mobile.ads.impl.d41
            com.yandex.mobile.ads.impl.dm r8 = r8.mo22497a()
            r0.<init>(r8)
            com.yandex.mobile.ads.impl.hm$a r8 = new com.yandex.mobile.ads.impl.hm$a
            r8.<init>()
            com.yandex.mobile.ads.impl.hm$a r8 = r8.m25247b(r9)
            com.yandex.mobile.ads.impl.hm$a r8 = r8.m25242a(r11)
            com.yandex.mobile.ads.impl.hm$a r8 = r8.m25245b()
            com.yandex.mobile.ads.impl.hm$a r8 = r8.m25243a(r10)
            r9 = 1
            com.yandex.mobile.ads.impl.hm$a r8 = r8.m25238a(r9)
            com.yandex.mobile.ads.impl.hm r2 = r8.m25244a()
            r8 = 0
            r10 = r2
            r11 = 0
        L2a:
            com.yandex.mobile.ads.impl.fm r1 = new com.yandex.mobile.ads.impl.fm     // Catch: java.lang.Exception -> L98
            r1.<init>(r0, r10)     // Catch: java.lang.Exception -> L98
            int r3 = com.yandex.mobile.ads.impl.s91.f54530a     // Catch: java.lang.Throwable -> L4d com.yandex.mobile.ads.impl.h00 -> L4f
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L4d com.yandex.mobile.ads.impl.h00 -> L4f
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4d com.yandex.mobile.ads.impl.h00 -> L4f
            r4.<init>()     // Catch: java.lang.Throwable -> L4d com.yandex.mobile.ads.impl.h00 -> L4f
        L3a:
            int r5 = r1.read(r3)     // Catch: java.lang.Throwable -> L4d com.yandex.mobile.ads.impl.h00 -> L4f
            r6 = -1
            if (r5 == r6) goto L45
            r4.write(r3, r8, r5)     // Catch: java.lang.Throwable -> L4d com.yandex.mobile.ads.impl.h00 -> L4f
            goto L3a
        L45:
            byte[] r8 = r4.toByteArray()     // Catch: java.lang.Throwable -> L4d com.yandex.mobile.ads.impl.h00 -> L4f
            com.yandex.mobile.ads.impl.s91.m28107a(r1)     // Catch: java.lang.Exception -> L98
            return r8
        L4d:
            r8 = move-exception
            goto L94
        L4f:
            r3 = move-exception
            int r4 = r3.f50787d     // Catch: java.lang.Throwable -> L4d
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L5a
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L5f
        L5a:
            r4 = 5
            if (r11 >= r4) goto L5f
            r4 = 1
            goto L60
        L5f:
            r4 = 0
        L60:
            if (r4 != 0) goto L63
            goto L7e
        L63:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r4 = r3.f50788e     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L7e
            java.lang.String r5 = "Location"
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L4d
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L7e
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4d
            if (r5 != 0) goto L7e
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L4d
            goto L7f
        L7e:
            r4 = 0
        L7f:
            if (r4 == 0) goto L93
            int r11 = r11 + 1
            com.yandex.mobile.ads.impl.hm$a r10 = r10.m25234a()     // Catch: java.lang.Throwable -> L4d
            com.yandex.mobile.ads.impl.hm$a r10 = r10.m25247b(r4)     // Catch: java.lang.Throwable -> L4d
            com.yandex.mobile.ads.impl.hm r10 = r10.m25244a()     // Catch: java.lang.Throwable -> L4d
            com.yandex.mobile.ads.impl.s91.m28107a(r1)     // Catch: java.lang.Exception -> L98
            goto L2a
        L93:
            throw r3     // Catch: java.lang.Throwable -> L4d
        L94:
            com.yandex.mobile.ads.impl.s91.m28107a(r1)     // Catch: java.lang.Exception -> L98
            throw r8     // Catch: java.lang.Exception -> L98
        L98:
            r8 = move-exception
            r7 = r8
            com.yandex.mobile.ads.impl.hb0 r8 = new com.yandex.mobile.ads.impl.hb0
            android.net.Uri r3 = r0.m23802g()
            java.util.Objects.requireNonNull(r3)
            java.util.Map r4 = r0.mo22489b()
            long r5 = r0.m23801f()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.drm.C4728o.m22218a(com.yandex.mobile.ads.impl.dm$a, java.lang.String, byte[], java.util.Map):byte[]");
    }
}
