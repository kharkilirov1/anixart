package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Z2 */
/* loaded from: classes2.dex */
public class C3783Z2 {

    /* renamed from: a */
    @Nullable
    public final String f44602a;

    /* renamed from: b */
    @Nullable
    public final String f44603b;

    /* renamed from: c */
    public final boolean f44604c;

    /* renamed from: d */
    public final int f44605d;

    /* renamed from: e */
    @Nullable
    public final Long f44606e;

    public C3783Z2(@Nullable String str, @Nullable String str2, boolean z, int i2, @Nullable Long l2) {
        this.f44602a = str;
        this.f44603b = str2;
        this.f44604c = z;
        this.f44605d = i2;
        this.f44606e = l2;
    }

    @NonNull
    /* renamed from: a */
    public static JSONArray m19493a(@Nullable Collection<C3783Z2> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (C3783Z2 c3783z2 : collection) {
                Objects.requireNonNull(c3783z2);
                JSONObject jSONObject = null;
                try {
                    jSONObject = new JSONObject().put("mac", c3783z2.f44602a).put("ssid", c3783z2.f44603b).put("signal_strength", c3783z2.f44605d).put("is_connected", c3783z2.f44604c).put("last_visible_offset_seconds", c3783z2.f44606e);
                } catch (Throwable unused) {
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }
}
