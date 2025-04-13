package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3456M;
import com.yandex.metrica.impl.p023ob.C3718Wc;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Cc */
/* loaded from: classes2.dex */
public class C3219Cc {

    /* renamed from: a */
    @NonNull
    private Context f42673a;

    public C3219Cc(@NonNull Context context) {
        this.f42673a = context;
    }

    @Nullable
    /* renamed from: a */
    public String m17933a(@NonNull C4209pd c4209pd) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("collection_mode", c4209pd.f46135a.m19356a());
            jSONObject.put("lat", c4209pd.m20546c().getLatitude());
            jSONObject.put("lon", c4209pd.m20546c().getLongitude());
            jSONObject.putOpt("timestamp", Long.valueOf(c4209pd.m20546c().getTime()));
            jSONObject.putOpt("receive_timestamp", Long.valueOf(c4209pd.m20548e()));
            jSONObject.put("receive_elapsed_realtime_seconds", c4209pd.m20547d());
            jSONObject.putOpt("precision", c4209pd.m20546c().hasAccuracy() ? Float.valueOf(c4209pd.m20546c().getAccuracy()) : null);
            jSONObject.putOpt("direction", c4209pd.m20546c().hasBearing() ? Float.valueOf(c4209pd.m20546c().getBearing()) : null);
            jSONObject.putOpt("speed", c4209pd.m20546c().hasSpeed() ? Float.valueOf(c4209pd.m20546c().getSpeed()) : null);
            jSONObject.putOpt("altitude", c4209pd.m20546c().hasAltitude() ? Double.valueOf(c4209pd.m20546c().getAltitude()) : null);
            jSONObject.putOpt("provider", C3509O2.m18655a(c4209pd.m20546c().getProvider(), null));
            jSONObject.put("charge_type", c4209pd.m20544a().m18537a());
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return C4452ym.m21252b(this.f42673a, str);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    public C4209pd m17934b(long j2, @NonNull String str) {
        String str2;
        try {
            str2 = C4452ym.m21237a(this.f42673a, str);
        } catch (UnsupportedEncodingException unused) {
            str2 = null;
        }
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                long optLong = jSONObject.optLong("receive_timestamp", 0L);
                long optLong2 = jSONObject.optLong("receive_elapsed_realtime_seconds", 0L);
                C3718Wc.a m19355a = C3718Wc.a.m19355a(jSONObject.optString("collection_mode"));
                Location location = new Location(jSONObject.optString("provider", null));
                location.setLongitude(jSONObject.optDouble("lon", 0.0d));
                location.setLatitude(jSONObject.optDouble("lat", 0.0d));
                location.setTime(jSONObject.optLong("timestamp", 0L));
                location.setAccuracy((float) jSONObject.optDouble("precision", 0.0d));
                location.setBearing((float) jSONObject.optDouble("direction", 0.0d));
                location.setSpeed((float) jSONObject.optDouble("speed", 0.0d));
                location.setAltitude(jSONObject.optDouble("altitude", 0.0d));
                return new C4209pd(m19355a, optLong, optLong2, location, C3456M.b.a.m18536a(Integer.valueOf(jSONObject.optInt("charge_type", Integer.MIN_VALUE))), Long.valueOf(j2));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public C3643Tc m17931a(long j2, @NonNull String str) {
        String str2;
        try {
            str2 = C4452ym.m21237a(this.f42673a, str);
        } catch (UnsupportedEncodingException unused) {
            str2 = null;
        }
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            C3643Tc c3643Tc = new C3643Tc();
            try {
                c3643Tc.m19149a(Long.valueOf(j2));
                JSONObject jSONObject = new JSONObject(str2);
                c3643Tc.m19152b(jSONObject.optLong("timestamp", 0L));
                c3643Tc.m19146a(jSONObject.optLong("elapsed_realtime_seconds", 0L));
                c3643Tc.m19150a(jSONObject.optJSONArray("cell_info"));
                c3643Tc.m19153b(jSONObject.optJSONArray("wifi_info"));
                c3643Tc.m19147a(C3456M.b.a.m18536a(Integer.valueOf(jSONObject.optInt("charge_type", Integer.MIN_VALUE))));
                c3643Tc.m19148a(C3718Wc.a.m19355a(jSONObject.optString("collection_mode")));
            } catch (Throwable unused2) {
            }
            return c3643Tc;
        } catch (Throwable unused3) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public String m17932a(@NonNull C3643Tc c3643Tc) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", c3643Tc.m19155d());
            jSONObject.put("elapsed_realtime_seconds", c3643Tc.m19154c());
            jSONObject.putOpt("wifi_info", c3643Tc.m19158g());
            jSONObject.putOpt("cell_info", c3643Tc.m19145a());
            if (c3643Tc.m19151b() != null) {
                jSONObject.put("charge_type", c3643Tc.m19151b().m18537a());
            }
            if (c3643Tc.m19156e() != null) {
                jSONObject.put("collection_mode", c3643Tc.m19156e().m19356a());
            }
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return C4452ym.m21252b(this.f42673a, str);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }
}
