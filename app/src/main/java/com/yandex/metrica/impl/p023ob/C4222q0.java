package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3156A;
import com.yandex.metrica.impl.p023ob.C3699Vi;
import com.yandex.metrica.impl.p023ob.C3718Wc;
import com.yandex.metrica.impl.p023ob.C4064jo;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.q0 */
/* loaded from: classes2.dex */
public final class C4222q0 {

    /* renamed from: a */
    @NonNull
    private final Context f46214a;

    /* renamed from: b */
    @NonNull
    private final C3456M f46215b;

    /* renamed from: c */
    @NonNull
    private final C3256E f46216c;

    /* renamed from: d */
    @NonNull
    private final C3897dd f46217d;

    /* renamed from: e */
    @NonNull
    private final C3861c3 f46218e;

    /* renamed from: f */
    private ContentValues f46219f;

    /* renamed from: g */
    private C4057jh f46220g;

    public C4222q0(Context context) {
        this(context, C3532P0.m18696i().m18702d(), C3532P0.m18696i().m18701c(), C3897dd.m19718a(context), C3835b3.m19636a(context));
    }

    /* renamed from: a */
    public C4222q0 m20563a(ContentValues contentValues) {
        this.f46219f = contentValues;
        return this;
    }

    /* renamed from: a */
    public C4222q0 m20564a(@NonNull C4057jh c4057jh) {
        this.f46220g = c4057jh;
        return this;
    }

    /* renamed from: a */
    public void m20565a() {
        JSONObject jSONObject = new JSONObject();
        try {
            m20561a(jSONObject);
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        this.f46219f.put("report_request_parameters", jSONObject.toString());
    }

    @VisibleForTesting
    public C4222q0(@NonNull Context context, @NonNull C3456M c3456m, @NonNull C3256E c3256e, @NonNull C3897dd c3897dd, @NonNull C3835b3 c3835b3) {
        this.f46214a = context;
        this.f46215b = c3456m;
        this.f46216c = c3256e;
        this.f46217d = c3897dd;
        this.f46218e = c3835b3.m19640a();
    }

    /* renamed from: a */
    private void m20561a(@NonNull JSONObject jSONObject) throws JSONException {
        JSONObject putOpt = jSONObject.putOpt("dId", this.f46220g.m19751g()).putOpt("uId", this.f46220g.m19768x()).putOpt("appVer", this.f46220g.m19750f()).putOpt("appBuild", this.f46220g.m19742b());
        Objects.requireNonNull(this.f46220g);
        JSONObject putOpt2 = putOpt.putOpt("analyticsSdkVersionName", "5.0.0");
        Objects.requireNonNull(this.f46220g);
        JSONObject putOpt3 = putOpt2.putOpt("kitBuildNumber", "45001354").putOpt("kitBuildType", this.f46220g.m19755k()).putOpt("osVer", this.f46220g.m19760p()).putOpt("osApiLev", Integer.valueOf(this.f46220g.m19759o())).putOpt("lang", this.f46220g.m19756l()).putOpt("root", this.f46220g.m19753i()).putOpt("app_debuggable", this.f46220g.m19968A()).putOpt("app_framework", this.f46220g.m19744c()).putOpt("attribution_id", Integer.valueOf(this.f46220g.m20098D()));
        Objects.requireNonNull(this.f46220g);
        putOpt3.putOpt("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m20566a(@NonNull C4063jn c4063jn, @NonNull C3156A.a aVar, @NonNull InterfaceC3960fo<C3699Vi.b, Object> interfaceC3960fo) {
        Location location;
        C3913e3 c3913e3;
        C4066k0 c4066k0 = c4063jn.f45511a;
        this.f46219f.put("name", c4066k0.f45520a);
        this.f46219f.put("value", c4066k0.f45521b);
        this.f46219f.put("type", Integer.valueOf(c4066k0.f45524e));
        this.f46219f.put("custom_type", Integer.valueOf(c4066k0.f45525f));
        this.f46219f.put("error_environment", c4066k0.m20206h());
        this.f46219f.put("user_info", c4066k0.m20213o());
        this.f46219f.put("truncated", Integer.valueOf(c4066k0.f45527h));
        this.f46219f.put("connection_type", Integer.valueOf(C3834b2.m19634b(this.f46214a)));
        this.f46219f.put("profile_id", c4066k0.m20210l());
        this.f46219f.put("encrypting_mode", Integer.valueOf(c4063jn.f45512b.m20405a()));
        this.f46219f.put("first_occurrence_status", Integer.valueOf(c4066k0.m20207i().f43453a));
        EnumC3357I0 m20211m = c4066k0.m20211m();
        if (m20211m != null) {
            this.f46219f.put("source", Integer.valueOf(m20211m.f43080a));
        }
        Boolean m20201c = c4066k0.m20201c();
        if (m20201c != null) {
            this.f46219f.put("attribution_id_changed", m20201c);
        }
        this.f46219f.put("open_id", c4066k0.m20208j());
        this.f46219f.put("app_environment", aVar.f42518a);
        this.f46219f.put("app_environment_revision", Long.valueOf(aVar.f42519b));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enabled", this.f46220g.m20112R());
            if (this.f46220g.m20112R()) {
                location = this.f46220g.m20103I();
                if (location == null) {
                    location = this.f46217d.m19722a();
                    c3913e3 = null;
                } else {
                    c3913e3 = C3913e3.m19782a(location);
                }
            } else {
                location = null;
                c3913e3 = null;
            }
            if (c3913e3 == null && location != null) {
                c3913e3 = C3913e3.m19783b(location);
            }
            if (c3913e3 != null) {
                m20562a(jSONObject, c3913e3);
            }
            this.f46219f.put("location_info", jSONObject.toString());
        } catch (Throwable unused) {
        }
        EnumMap enumMap = new EnumMap(C3699Vi.b.class);
        C4450yk m18720w = C3532P0.m18696i().m18720w();
        LinkedList linkedList = new LinkedList();
        m18720w.mo19052a(new C4196p0(this, linkedList));
        C3699Vi.b bVar = C3699Vi.b.WIFI;
        enumMap.put((EnumMap) bVar, (C3699Vi.b) this.f46218e.mo18725a());
        C3699Vi.b bVar2 = C3699Vi.b.CELL;
        enumMap.put((EnumMap) bVar2, (C3699Vi.b) (linkedList.isEmpty() ? null : (Collection) linkedList.getFirst()));
        C4064jo<Map<C3699Vi.b, Object>> c4064jo = interfaceC3960fo.get(enumMap);
        this.f46219f.put("has_omitted_data", Integer.valueOf(c4064jo.f45513a == C4064jo.a.NOT_CHANGED ? 1 : 0));
        C4064jo.a aVar2 = c4064jo.f45513a;
        D d = c4064jo.f45514b;
        Collection collection = d == 0 ? null : (Collection) ((Map) d).get(bVar2);
        m18720w.mo19050a(new C4170o0(this));
        C4064jo.a aVar3 = C4064jo.a.NEW;
        if ((aVar2 == aVar3 || aVar2 == C4064jo.a.REFRESH) && collection != null) {
            this.f46219f.put("cell_info", C4452ym.m21242a((Collection<C3700Vj>) collection).toString());
        }
        C4064jo.a aVar4 = c4064jo.f45513a;
        D d2 = c4064jo.f45514b;
        Collection collection2 = d2 != 0 ? (Collection) ((Map) d2).get(bVar) : null;
        if ((aVar4 == C4064jo.a.REFRESH || aVar4 == aVar3) && collection2 != null) {
            this.f46219f.put("wifi_network_info", C3783Z2.m19493a(collection2).toString());
        }
        this.f46219f.put("battery_charge_type", Integer.valueOf(this.f46215b.m18535b().m18537a()));
        this.f46219f.put("collection_mode", C3718Wc.a.m19354a(this.f46216c.m17992c()).m19356a());
    }

    /* renamed from: a */
    private void m20562a(@NonNull JSONObject jSONObject, @NonNull C3913e3 c3913e3) throws JSONException {
        jSONObject.put("lat", c3913e3.getLatitude());
        jSONObject.put("lon", c3913e3.getLongitude());
        jSONObject.putOpt("timestamp", Long.valueOf(c3913e3.getTime()));
        jSONObject.putOpt("precision", c3913e3.hasAccuracy() ? Float.valueOf(c3913e3.getAccuracy()) : null);
        jSONObject.putOpt("direction", c3913e3.hasBearing() ? Float.valueOf(c3913e3.getBearing()) : null);
        jSONObject.putOpt("speed", c3913e3.hasSpeed() ? Float.valueOf(c3913e3.getSpeed()) : null);
        jSONObject.putOpt("altitude", c3913e3.hasAltitude() ? Double.valueOf(c3913e3.getAltitude()) : null);
        jSONObject.putOpt("provider", C3509O2.m18655a(c3913e3.getProvider(), null));
        jSONObject.putOpt("original_provider", c3913e3.m19784a());
    }
}
