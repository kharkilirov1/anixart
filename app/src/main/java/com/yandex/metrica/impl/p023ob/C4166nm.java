package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.yandex.metrica.impl.p023ob.C3727Wl;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.nm */
/* loaded from: classes2.dex */
public class C4166nm extends C3727Wl {

    /* renamed from: h */
    @Nullable
    public volatile String f46022h;

    /* renamed from: i */
    @Nullable
    public volatile String f46023i;

    public C4166nm(@NonNull String str, @NonNull String str2, @Nullable C3727Wl.b bVar, int i2, boolean z) {
        super(str, str2, null, i2, z, C3727Wl.c.VIEW, C3727Wl.a.WEBVIEW);
        this.f46022h = null;
        this.f46023i = null;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3727Wl
    @Nullable
    /* renamed from: a */
    public JSONArray mo18017a(@NonNull C3428Kl c3428Kl) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", "HTML");
            if (c3428Kl.f43294j) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("u", C3658U2.m19200a(this.f46022h, c3428Kl.f43299o));
                jSONObject2.putOpt("ou", C3658U2.m19200a(this.f46023i, c3428Kl.f43299o));
                if (jSONObject2.length() > 0) {
                    jSONObject.put("i", jSONObject2);
                }
            }
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3727Wl
    /* renamed from: a */
    public boolean mo18018a() {
        return true;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3727Wl
    public String toString() {
        StringBuilder m24u = C0000a.m24u("WebViewElement{url='");
        C0576a.m4100A(m24u, this.f46022h, '\'', ", originalUrl='");
        C0576a.m4100A(m24u, this.f46023i, '\'', ", mClassName='");
        C0576a.m4100A(m24u, this.f44400a, '\'', ", mId='");
        C0576a.m4100A(m24u, this.f44401b, '\'', ", mParseFilterReason=");
        m24u.append(this.f44402c);
        m24u.append(", mDepth=");
        m24u.append(this.f44403d);
        m24u.append(", mListItem=");
        m24u.append(this.f44404e);
        m24u.append(", mViewType=");
        m24u.append(this.f44405f);
        m24u.append(", mClassType=");
        m24u.append(this.f44406g);
        m24u.append("} ");
        return m24u.toString();
    }
}
