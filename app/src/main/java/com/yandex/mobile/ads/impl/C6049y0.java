package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.mobile.ads.impl.y0 */
/* loaded from: classes3.dex */
public final class C6049y0 {

    /* renamed from: com.yandex.mobile.ads.impl.y0$a */
    public static final class a {

        /* renamed from: a */
        public static final AtomicLong f56616a = new AtomicLong(SystemClock.elapsedRealtime() - 2000);
    }

    /* renamed from: a */
    public static void m29838a(@Nullable Context context, @NonNull wv0 wv0Var, @NonNull String str, @NonNull ResultReceiver resultReceiver, boolean z) {
        String m23598g;
        HashMap hashMap = new HashMap();
        hashMap.put("click_type", "default");
        ((C6123zh) wv0Var).m30190a(hashMap);
        if (resultReceiver != null) {
            resultReceiver.send(9, null);
        }
        if (context != null) {
            AtomicLong atomicLong = a.f56616a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long andSet = elapsedRealtime - atomicLong.getAndSet(elapsedRealtime);
            boolean z2 = true;
            if (andSet < 0 || andSet > 1000) {
                cz0 m29824a = xz0.m29823b().m29824a(context);
                int m28994a = (m29824a == null || (m23598g = m29824a.m23598g()) == null) ? 0 : C5861uh.m28994a(m23598g);
                if ((!z || m28994a != 0) && !C5782t5.m28464a(2, m28994a)) {
                    z2 = false;
                }
                if (z2 && i91.m25466a(str)) {
                    new C5395lf(context, resultReceiver).m26443a(str);
                } else if (new k91().m26091a(context, str)) {
                    resultReceiver.send(7, null);
                } else if (URLUtil.isNetworkUrl(str)) {
                    new C5395lf(context, resultReceiver).m26443a(str);
                }
            }
        }
    }
}
