package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.InternalLogger;
import java.nio.charset.Charset;
import java.util.Locale;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.push.impl.i0 */
/* loaded from: classes2.dex */
public class C4579i0 {

    /* renamed from: a */
    @Nullable
    private String f47387a = null;

    /* renamed from: b */
    @Nullable
    private String f47388b = null;

    /* renamed from: c */
    @Nullable
    private JSONObject f47389c = null;

    public C4579i0(@NonNull byte[] bArr) {
        m21547a(bArr);
    }

    /* renamed from: a */
    private void m21547a(@NonNull byte[] bArr) {
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, Charset.forName("UTF-8")));
            if (jSONObject.length() > 1) {
                this.f47387a = String.format(Locale.US, "Lazy push response have %d elements", Integer.valueOf(jSONObject.length()));
            } else if (jSONObject.has("ignored")) {
                this.f47388b = jSONObject.getJSONObject("ignored").getString("details");
            } else if (jSONObject.has("yamp")) {
                this.f47389c = jSONObject;
            } else {
                this.f47387a = "Lazy push response does not contain ignored message or push message";
            }
        } catch (Throwable th) {
            StringBuilder m24u = C0000a.m24u("Failed to parse lazy push response: ");
            m24u.append(th.getMessage());
            InternalLogger.m21368e(m24u.toString(), th);
            this.f47387a = "Failed to parse lazy push response: " + th.getMessage();
        }
    }

    @Nullable
    /* renamed from: b */
    public String m21549b() {
        return this.f47388b;
    }

    @Nullable
    /* renamed from: c */
    public JSONObject m21550c() {
        return this.f47389c;
    }

    /* renamed from: d */
    public boolean m21551d() {
        return this.f47387a == null;
    }

    /* renamed from: e */
    public boolean m21552e() {
        return this.f47388b != null;
    }

    @Nullable
    /* renamed from: a */
    public String m21548a() {
        return this.f47387a;
    }
}
