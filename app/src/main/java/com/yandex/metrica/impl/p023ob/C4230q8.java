package com.yandex.metrica.impl.p023ob;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.q8 */
/* loaded from: classes2.dex */
class C4230q8 {

    /* renamed from: a */
    @Nullable
    private String f46230a;

    /* renamed from: b */
    @Nullable
    private String f46231b;

    /* renamed from: a */
    public void m20573a(@Nullable String str) {
        this.f46230a = str;
    }

    /* renamed from: b */
    public void m20574b(@Nullable String str) {
        this.f46231b = str;
    }

    @NonNull
    /* renamed from: a */
    public String m20572a() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f46230a;
            if (str == null) {
                str = "";
            }
            return Base64.encodeToString(jSONObject.put("arg_ee", str).put("arg_hv", this.f46231b).toString().getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }
}
