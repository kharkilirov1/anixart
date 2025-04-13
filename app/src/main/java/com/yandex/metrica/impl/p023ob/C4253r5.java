package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.r5 */
/* loaded from: classes2.dex */
public class C4253r5 extends AbstractC4279s5 {
    public C4253r5(C3940f4 c3940f4) {
        super(c3940f4);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4149n5
    /* renamed from: a */
    public boolean mo17815a(@NonNull C4066k0 c4066k0) {
        String m20214p = c4066k0.m20214p();
        if (TextUtils.isEmpty(m20214p)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(m20214p);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            m20685a().m19891w().m18269l();
            if (!m20621a(jSONObject.optString("link"))) {
                return false;
            }
            c4066k0.m20193a(Boolean.TRUE);
            m20685a().m19891w().m18268k();
            m20685a().m19864C();
            m20685a().m19879j().m19949a();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m20621a(@androidx.annotation.Nullable java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 != 0) goto L8e
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "referrer"
            java.lang.String r11 = r11.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L8e
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L8e
            com.yandex.metrica.impl.ob.f4 r0 = r10.m20685a()     // Catch: java.lang.Throwable -> L8e
            com.yandex.metrica.impl.ob.Qi r0 = r0.m19890v()     // Catch: java.lang.Throwable -> L8e
            com.yandex.metrica.impl.ob.oi r0 = r0.m18844b()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "&"
            java.lang.String[] r11 = r11.split(r2)     // Catch: java.lang.Throwable -> L8e
            int r2 = r11.length     // Catch: java.lang.Throwable -> L8e
            r3 = 0
        L2b:
            if (r3 >= r2) goto L8e
            r4 = r11[r3]     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "="
            int r5 = r4.indexOf(r5)     // Catch: java.lang.Throwable -> L8e
            if (r5 < 0) goto L8b
            java.lang.String r6 = r4.substring(r1, r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = android.net.Uri.decode(r6)     // Catch: java.lang.Throwable -> L8e
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = android.net.Uri.decode(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "reattribution"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L8e
            r7 = 1
            if (r5 == 0) goto L5b
            java.lang.String r5 = "1"
            boolean r5 = r5.equals(r4)     // Catch: java.lang.Throwable -> L8e
            if (r5 == 0) goto L5b
            goto L85
        L5b:
            if (r0 == 0) goto L87
            java.util.List<android.util.Pair<java.lang.String, com.yandex.metrica.impl.ob.oi$a>> r5 = r0.f46086a     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L8e
        L63:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L87
            java.lang.Object r8 = r5.next()     // Catch: java.lang.Throwable -> L8e
            android.util.Pair r8 = (android.util.Pair) r8     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r9 = r8.first     // Catch: java.lang.Throwable -> L8e
            boolean r9 = com.yandex.metrica.impl.p023ob.C3658U2.m19213a(r9, r6)     // Catch: java.lang.Throwable -> L8e
            if (r9 == 0) goto L63
            java.lang.Object r8 = r8.second     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L85
            com.yandex.metrica.impl.ob.oi$a r8 = (com.yandex.metrica.impl.p023ob.C4188oi.a) r8     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = r8.f46087a     // Catch: java.lang.Throwable -> L8e
            boolean r8 = r8.equals(r4)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L63
        L85:
            r4 = 1
            goto L88
        L87:
            r4 = 0
        L88:
            if (r4 == 0) goto L8b
            return r7
        L8b:
            int r3 = r3 + 1
            goto L2b
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4253r5.m20621a(java.lang.String):boolean");
    }
}
