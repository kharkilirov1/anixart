package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.push.common.utils.Tracker;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.push.impl.I0 */
/* loaded from: classes2.dex */
public class C4528I0 implements Tracker {

    /* renamed from: a */
    @NonNull
    private final Context f47293a;

    /* renamed from: b */
    @Nullable
    private volatile IReporter f47294b;

    /* renamed from: c */
    @NonNull
    private final Object f47295c = new Object();

    public C4528I0(@NonNull Context context, @NonNull String str) {
        this.f47293a = context;
    }

    @NonNull
    /* renamed from: a */
    private IReporter m21439a() {
        if (this.f47294b == null) {
            synchronized (this.f47295c) {
                if (this.f47294b == null) {
                    this.f47294b = YandexMetrica.getReporter(this.f47293a, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
                }
            }
        }
        return this.f47294b;
    }

    @Override // com.yandex.metrica.push.common.utils.Tracker
    public void pauseSession() {
        m21439a().pauseSession();
    }

    @Override // com.yandex.metrica.push.common.utils.Tracker
    public void reportError(@NonNull String str, @Nullable Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("version_code");
        sb.append(" = ");
        sb.append(2001001);
        sb.append(";");
        C4570e m21502h = C4562a.m21488a(this.f47293a).m21502h();
        if (m21502h != null) {
            sb.append("transport");
            sb.append(" = ");
            sb.append(m21502h.m21537a().toString());
        }
        sb.append(";");
        sb.append(str);
        m21439a().reportError(sb.toString(), th);
    }

    @Override // com.yandex.metrica.push.common.utils.Tracker
    public void reportEvent(@NonNull String str) {
        reportEvent(str, null);
    }

    @Override // com.yandex.metrica.push.common.utils.Tracker
    public void reportUnhandledException(@NonNull Throwable th) {
        m21439a().reportUnhandledException(th);
    }

    @Override // com.yandex.metrica.push.common.utils.Tracker
    public void resumeSession() {
        m21439a().resumeSession();
    }

    @Override // com.yandex.metrica.push.common.utils.Tracker
    public void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("version_code", String.valueOf(2001001));
        C4570e m21502h = C4562a.m21488a(this.f47293a).m21502h();
        if (m21502h != null) {
            map.put("transport", m21502h.m21537a().toString());
        }
        m21439a().reportEvent(str, map);
    }
}
