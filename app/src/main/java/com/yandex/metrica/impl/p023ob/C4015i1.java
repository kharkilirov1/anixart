package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3157A0;
import com.yandex.metrica.push.common.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i1 */
/* loaded from: classes2.dex */
public final class C4015i1 {

    /* renamed from: a */
    private final JSONObject f45312a = new JSONObject();

    /* renamed from: b */
    @NonNull
    private final Context f45313b;

    /* renamed from: c */
    @NonNull
    private final C3157A0 f45314c;

    @VisibleForTesting
    public C4015i1(@NonNull Context context, @NonNull C3157A0 c3157a0) {
        this.f45313b = context;
        this.f45314c = c3157a0;
    }

    /* renamed from: a */
    public static <T> T m20043a(JSONObject jSONObject, String str, T t) throws JSONException {
        if (!jSONObject.has(str)) {
            jSONObject.put(str, t);
        }
        return (T) jSONObject.get(str);
    }

    /* renamed from: d */
    private void m20044d() throws JSONException {
        if (C3658U2.m19211a(24)) {
            JSONObject jSONObject = (JSONObject) m20043a(this.f45312a, "dfid", new JSONObject());
            jSONObject.putOpt("wids", (Integer) C3658U2.m19196a(new C3683V2(1), this.f45313b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
            jSONObject.putOpt("widl", (Integer) C3658U2.m19196a(new C3683V2(2), this.f45313b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
        }
    }

    /* renamed from: b */
    public C4015i1 m20046b() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = (JSONObject) m20043a(this.f45312a, "dfid", new JSONObject());
        if (C3658U2.m19211a(21)) {
            jSONArray = new JSONArray(Build.SUPPORTED_ABIS);
        } else {
            ArrayList arrayList = new ArrayList();
            String str = Build.CPU_ABI;
            if (!CoreConstants.Transport.UNKNOWN.equals(str)) {
                arrayList.add(str);
            }
            String str2 = Build.CPU_ABI2;
            if (!CoreConstants.Transport.UNKNOWN.equals(str2)) {
                arrayList.add(str2);
            }
            jSONArray = new JSONArray((Collection) arrayList);
        }
        jSONObject.put("cpu_abis", jSONArray);
        return this;
    }

    /* renamed from: c */
    public C4015i1 m20047c() {
        try {
            JSONObject jSONObject = (JSONObject) m20043a(this.f45312a, "dfid", new JSONObject());
            C3157A0.a m17809a = this.f45314c.m17809a();
            jSONObject.put("tds", m17809a.f42522a);
            jSONObject.put("fds", m17809a.f42523b);
            ((JSONObject) m20043a(this.f45312a, "dfid", new JSONObject())).put("boot_time", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000);
            m20044d();
            ((JSONObject) m20043a(this.f45312a, "dfid", new JSONObject())).put("lc", C4452ym.m21257b((List<?>) C4197p1.m20517a(this.f45313b).m20519a()));
        } catch (Throwable unused) {
        }
        try {
            Object obj = Class.forName("kotlin.KotlinVersion").getDeclaredField("CURRENT").get(null);
            int intValue = ((Integer) obj.getClass().getDeclaredMethod("getMajor", new Class[0]).invoke(obj, new Object[0])).intValue();
            int intValue2 = ((Integer) obj.getClass().getDeclaredMethod("getMinor", new Class[0]).invoke(obj, new Object[0])).intValue();
            ((JSONObject) m20043a(this.f45312a, "dfid", new JSONObject())).put("kotlin_runtime", new JSONObject().put("major", intValue).put("minor", intValue2).put("patch", ((Integer) obj.getClass().getDeclaredMethod("getPatch", new Class[0]).invoke(obj, new Object[0])).intValue()));
        } catch (Throwable unused2) {
        }
        return this;
    }

    public String toString() {
        return this.f45312a.toString();
    }

    /* renamed from: a */
    public String m20045a() {
        return this.f45312a.toString();
    }
}
