package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.L1 */
/* loaded from: classes2.dex */
public class C3433L1 {

    /* renamed from: a */
    @NonNull
    private final C3432L0 f43308a;

    /* renamed from: b */
    private boolean f43309b;

    public C3433L1(@NonNull C3254Dm c3254Dm) {
        this(c3254Dm, new C3432L0());
    }

    /* renamed from: a */
    public void m18474a(@NonNull Context context) {
        long j2;
        String m19260a;
        synchronized (this) {
        }
        if (this.f43309b) {
            return;
        }
        synchronized (this) {
            try {
                m19260a = C3681V0.m19260a(this.f43308a.m18469a(context, "metrica_service_settings.dat"));
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(m19260a)) {
                j2 = new JSONObject(m19260a).optLong("delay");
            }
            j2 = 0;
        }
        if (j2 > 0) {
            try {
                Thread.sleep(j2);
            } catch (Throwable unused2) {
            }
        }
        this.f43309b = true;
    }

    @VisibleForTesting
    public C3433L1(@NonNull C3254Dm c3254Dm, @NonNull C3432L0 c3432l0) {
        this.f43309b = false;
        this.f43308a = c3432l0;
    }
}
