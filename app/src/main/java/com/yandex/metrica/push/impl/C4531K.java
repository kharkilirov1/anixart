package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.InternalLogger;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.push.impl.K */
/* loaded from: classes2.dex */
public class C4531K extends AbstractC4539O {

    /* renamed from: c */
    private static final long[] f47297c = {1, 1, 1};

    /* renamed from: a */
    @NonNull
    private final Context f47298a;

    /* renamed from: b */
    @NonNull
    private final C4588n f47299b;

    public C4531K(@NonNull Context context) {
        this.f47298a = context;
        this.f47299b = new C4588n(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.yandex.metrica.push.impl.P] */
    @Override // com.yandex.metrica.push.impl.AbstractC4539O
    @NonNull
    /* renamed from: a */
    public C4541P mo21440a(@NonNull C4596r c4596r) {
        C4592p m21657b = c4596r.m21657b();
        String m21591d = m21657b == null ? null : m21657b.m21591d();
        if (CoreUtils.isEmpty(m21591d)) {
            return C4541P.m21467a(c4596r);
        }
        InterfaceC4508d.a mo21412a = C4562a.m21488a(this.f47298a).m21498d().mo21412a(c4596r);
        if (mo21412a.f47282a == InterfaceC4508d.b.f47286b) {
            throw new C4537N(mo21412a.f47283b, mo21412a.f47284c);
        }
        C4540O0 m21463a = new C4540O0("[{]", "[}]").m21463a(new C4575g0()).m21463a(new C4577h0()).m21463a(new C4583k0(c4596r.m21659d())).m21463a(new C4585l0()).m21463a(new C4581j0(this.f47299b, m21657b.m21589b()));
        String m21464a = m21463a.m21464a(m21591d);
        Map<String, String> m21588a = m21657b.m21588a();
        HashMap hashMap = new HashMap();
        if (m21588a != null) {
            for (Map.Entry<String, String> entry : m21588a.entrySet()) {
                hashMap.put(entry.getKey(), m21463a.m21464a(entry.getValue()));
            }
        }
        try {
            long[] m21590c = m21657b.m21590c();
            if (m21590c == null) {
                m21590c = f47297c;
            }
            C4579i0 m21452a = m21452a(m21464a, hashMap, m21590c);
            if (!m21452a.m21551d()) {
                return C4541P.m21468a(c4596r, "Unknown response by backend", m21452a.m21548a());
            }
            if (m21452a.m21552e()) {
                return C4541P.m21468a(c4596r, "Filtered by backend", m21452a.m21549b());
            }
            try {
                c4596r = C4541P.m21467a(c4596r.m21656a(m21452a.m21550c()));
                return c4596r;
            } catch (Throwable th) {
                return C4541P.m21468a(c4596r, "Failed merge push messages", th.getMessage());
            }
        } catch (Throwable th2) {
            return Boolean.TRUE.equals(m21657b.m21592e()) ? C4541P.m21467a(c4596r) : C4541P.m21468a(c4596r, "Backend not available", th2.getMessage());
        }
    }

    @NonNull
    /* renamed from: a */
    private C4579i0 m21452a(@NonNull String str, @NonNull Map<String, String> map, @NonNull long[] jArr) throws IOException {
        InternalLogger.m21370i("Request lazy push from %s with retry policy %s", str, Arrays.toString(jArr));
        int i2 = 0;
        while (true) {
            try {
                InternalLogger.m21370i("Request #%d for %s", Integer.valueOf(i2), str);
                C4561Z0 c4561z0 = new C4561Z0(str);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    c4561z0.m21486a(entry.getKey(), entry.getValue());
                }
                byte[] m21487a = c4561z0.m21487a();
                InternalLogger.m21370i("Response for %s: '%s'", str, new String(m21487a, Charset.forName("UTF-8")));
                return new C4579i0(m21487a);
            } catch (IOException e2) {
                if (i2 < jArr.length) {
                    int i3 = i2 + 1;
                    try {
                        long j2 = jArr[i2];
                        InternalLogger.m21370i("Wait %d seconds before next request for %s", Long.valueOf(j2), str);
                        Thread.sleep(TimeUnit.SECONDS.toMillis(j2));
                    } catch (InterruptedException e3) {
                        InternalLogger.m21369e(e3, e3.getMessage(), new Object[0]);
                        Thread.currentThread().interrupt();
                    }
                    i2 = i3;
                } else {
                    throw e2;
                }
            }
        }
    }
}
