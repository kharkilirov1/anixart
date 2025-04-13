package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import com.yandex.metrica.impl.p023ob.C4188oi;
import com.yandex.metrica.impl.p023ob.C4371vj;
import com.yandex.metrica.impl.p023ob.C4452ym;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.uj */
/* loaded from: classes2.dex */
public class C4345uj {

    /* renamed from: a */
    @NonNull
    private final C4059jj f46627a;

    /* renamed from: b */
    @NonNull
    private final C4033ij f46628b;

    /* renamed from: c */
    @NonNull
    private final C4215pj f46629c;

    /* renamed from: d */
    @NonNull
    private final C4293sj f46630d;

    /* renamed from: e */
    @NonNull
    private final C4267rj f46631e;

    /* renamed from: f */
    @NonNull
    private final C4189oj f46632f;

    /* renamed from: g */
    @NonNull
    private final C4319tj f46633g;

    /* renamed from: h */
    @NonNull
    private final C4085kj f46634h;

    /* renamed from: i */
    @NonNull
    private final C4423xj f46635i;

    /* renamed from: j */
    @NonNull
    private final C4137mj f46636j;

    /* renamed from: k */
    @NonNull
    private final C4163nj f46637k;

    /* renamed from: l */
    @NonNull
    private final C4241qj f46638l;

    /* renamed from: m */
    @NonNull
    private final C3317Ga f46639m;

    /* renamed from: n */
    @NonNull
    private final C4475zj f46640n;

    /* renamed from: o */
    @NonNull
    private final C4449yj f46641o;

    /* renamed from: p */
    @NonNull
    private final C3903dj f46642p;

    /* renamed from: q */
    @NonNull
    private final C3929ej f46643q;

    /* renamed from: r */
    @NonNull
    private final C3955fj f46644r;

    /* renamed from: s */
    @NonNull
    private final C3877cj f46645s;

    /* renamed from: t */
    @NonNull
    private final C4111lj f46646t;

    /* renamed from: u */
    @NonNull
    private final C3981gj f46647u;

    /* renamed from: v */
    @NonNull
    private final C4007hj f46648v;

    /* renamed from: w */
    @NonNull
    private final C4397wj f46649w;

    public C4345uj() {
        this(new C4111lj());
    }

    /* renamed from: a */
    public C4371vj m20898a(byte[] bArr) {
        String str;
        C4371vj c4371vj = new C4371vj();
        try {
            Objects.requireNonNull(this.f46646t);
            C4452ym.a aVar = new C4452ym.a(new String(bArr, "UTF-8"));
            JSONObject optJSONObject = aVar.optJSONObject("device_id");
            String str2 = "";
            if (optJSONObject != null) {
                str2 = optJSONObject.optString("hash");
                str = optJSONObject.optString("value");
            } else {
                str = "";
            }
            c4371vj.m21031d(str);
            c4371vj.m21028c(str2);
            m20897a(c4371vj, aVar);
            c4371vj.m21014a(C4371vj.a.OK);
            return c4371vj;
        } catch (Throwable unused) {
            C4371vj c4371vj2 = new C4371vj();
            c4371vj2.m21014a(C4371vj.a.BAD);
            return c4371vj2;
        }
    }

    @VisibleForTesting
    public C4345uj(@NonNull C4111lj c4111lj) {
        this(c4111lj, new C4059jj(), new C4033ij(), new C4215pj(), new C4293sj(), new C4267rj(), new C4189oj(), new C4319tj(), new C4085kj(), new C4423xj(), new C4137mj(), new C4163nj(), new C4241qj(), new C3317Ga(), new C4475zj(), new C4449yj(), new C3929ej(), new C3955fj(), new C3903dj(), new C3877cj(), new C3981gj(), new C4007hj(), new C4397wj());
    }

    @VisibleForTesting
    public C4345uj(@NonNull C4111lj c4111lj, @NonNull C4059jj c4059jj, @NonNull C4033ij c4033ij, @NonNull C4215pj c4215pj, @NonNull C4293sj c4293sj, @NonNull C4267rj c4267rj, @NonNull C4189oj c4189oj, @NonNull C4319tj c4319tj, @NonNull C4085kj c4085kj, @NonNull C4423xj c4423xj, @NonNull C4137mj c4137mj, @NonNull C4163nj c4163nj, @NonNull C4241qj c4241qj, @NonNull C3317Ga c3317Ga, @NonNull C4475zj c4475zj, @NonNull C4449yj c4449yj, @NonNull C3929ej c3929ej, @NonNull C3955fj c3955fj, @NonNull C3903dj c3903dj, @NonNull C3877cj c3877cj, @NonNull C3981gj c3981gj, @NonNull C4007hj c4007hj, @NonNull C4397wj c4397wj) {
        this.f46627a = c4059jj;
        this.f46628b = c4033ij;
        this.f46629c = c4215pj;
        this.f46630d = c4293sj;
        this.f46631e = c4267rj;
        this.f46632f = c4189oj;
        this.f46633g = c4319tj;
        this.f46634h = c4085kj;
        this.f46635i = c4423xj;
        this.f46636j = c4137mj;
        this.f46637k = c4163nj;
        this.f46638l = c4241qj;
        this.f46639m = c3317Ga;
        this.f46640n = c4475zj;
        this.f46641o = c4449yj;
        this.f46643q = c3929ej;
        this.f46644r = c3955fj;
        this.f46642p = c3903dj;
        this.f46645s = c3877cj;
        this.f46646t = c4111lj;
        this.f46647u = c3981gj;
        this.f46648v = c4007hj;
        this.f46649w = c4397wj;
    }

    /* renamed from: a */
    private void m20897a(C4371vj c4371vj, C4452ym.a aVar) throws JSONException {
        long j2;
        long j3;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3 = aVar.optJSONObject("queries");
        if (optJSONObject3 != null && (optJSONObject2 = optJSONObject3.optJSONObject("list")) != null) {
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("sdk_list");
            if (optJSONObject4 != null) {
                c4371vj.m21043h(optJSONObject4.optString("url", null));
            }
            JSONObject optJSONObject5 = optJSONObject2.optJSONObject("host");
            if (optJSONObject5 != null) {
                c4371vj.m21017a(optJSONObject5.optString("url", null));
            }
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = aVar.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject6 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject6 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject6.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject7 = optJSONObject6.optJSONObject(next);
                if (optJSONObject7 != null && optJSONObject7.has("value")) {
                    hashMap.put(next, optJSONObject7.getString("value"));
                }
            }
            c4371vj.m21034e(C4452ym.m21262c(hashMap));
        }
        JSONObject optJSONObject8 = aVar.optJSONObject("locale");
        c4371vj.m21024b((optJSONObject8 == null || (optJSONObject = optJSONObject8.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", ""));
        JSONObject optJSONObject9 = aVar.optJSONObject("time");
        if (optJSONObject9 != null) {
            try {
                c4371vj.m21016a(Long.valueOf(optJSONObject9.getLong("max_valid_difference_seconds")));
            } catch (Throwable unused2) {
            }
        }
        C4082kg.r rVar = new C4082kg.r();
        JSONObject optJSONObject10 = aVar.optJSONObject("stat_sending");
        if (optJSONObject10 != null) {
            rVar.f45780b = C4452ym.m21231a(C4452ym.m21264d(optJSONObject10, "disabled_reporting_interval_seconds"), TimeUnit.SECONDS, rVar.f45780b);
        }
        c4371vj.m21005a(this.f46639m.mo17817a(rVar));
        ArrayList arrayList = new ArrayList();
        JSONObject optJSONObject11 = aVar.optJSONObject("mediascope_api_keys");
        if (optJSONObject11 != null && (optJSONArray2 = optJSONObject11.optJSONArray("list")) != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                try {
                    arrayList.add(optJSONArray2.getString(i2));
                } catch (Throwable unused3) {
                }
            }
        }
        c4371vj.m21032d(arrayList);
        this.f46628b.m20067a(c4371vj, aVar);
        this.f46627a.m20160a(c4371vj, aVar);
        Objects.requireNonNull(this.f46629c);
        JSONObject optJSONObject12 = aVar.optJSONObject("permissions");
        if (optJSONObject12 != null && (optJSONArray = optJSONObject12.optJSONArray("list")) != null) {
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                JSONObject optJSONObject13 = optJSONArray.optJSONObject(i3);
                if (optJSONObject13 != null) {
                    String optString = optJSONObject13.optString("name");
                    boolean optBoolean = optJSONObject13.optBoolean("enabled");
                    if (TextUtils.isEmpty(optString)) {
                        c4371vj.m21018a("", false);
                    } else {
                        c4371vj.m21018a(optString, optBoolean);
                    }
                }
            }
        }
        this.f46630d.m20766a(c4371vj, aVar);
        Objects.requireNonNull(this.f46631e);
        C4082kg c4082kg = new C4082kg();
        JSONObject optJSONObject14 = aVar.optJSONObject("retry_policy");
        int i4 = c4082kg.f45626K;
        int i5 = c4082kg.f45627L;
        if (optJSONObject14 != null) {
            i4 = optJSONObject14.optInt("max_interval_seconds", i4);
            i5 = optJSONObject14.optInt("exponential_multiplier", c4082kg.f45627L);
        }
        c4371vj.m20998a(new C3225Ci(i4, i5));
        Objects.requireNonNull(this.f46632f);
        if (c4371vj.m21033e().f46403c) {
            JSONObject optJSONObject15 = aVar.optJSONObject("permissions_collecting");
            C4082kg.m mVar = new C4082kg.m();
            if (optJSONObject15 != null) {
                j2 = optJSONObject15.optLong("check_interval_seconds", mVar.f45753b);
                j3 = optJSONObject15.optLong("force_send_interval_seconds", mVar.f45754c);
            } else {
                j2 = mVar.f45753b;
                j3 = mVar.f45754c;
            }
            c4371vj.m20997a(new C3175Ai(j2, j3));
        }
        this.f46633g.m20839a(c4371vj, aVar);
        this.f46634h.m20304a(c4371vj, aVar);
        this.f46636j.m20403a(c4371vj, aVar);
        Objects.requireNonNull(this.f46637k);
        if (c4371vj.m21033e().f46409i) {
            C4336ua c4336ua = new C4336ua();
            C4082kg.y yVar = new C4082kg.y();
            JSONObject optJSONObject16 = aVar.optJSONObject("wakeup");
            if (optJSONObject16 != null) {
                yVar.f45814b = C4452ym.m21231a(C4452ym.m21264d(optJSONObject16, "collection_duration_seconds"), TimeUnit.SECONDS, yVar.f45814b);
                yVar.f45815c = C4452ym.m21249a(optJSONObject16, "aggressive_relaunch", yVar.f45815c);
                JSONArray optJSONArray3 = optJSONObject16.optJSONArray("collection_interval_ranges_seconds");
                C4082kg.y.a[] aVarArr = yVar.f45816d;
                if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                    try {
                        aVarArr = new C4082kg.y.a[optJSONArray3.length()];
                        for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                            aVarArr[i6] = new C4082kg.y.a();
                            JSONObject jSONObject2 = optJSONArray3.getJSONObject(i6);
                            C4082kg.y.a aVar2 = aVarArr[i6];
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            aVar2.f45818b = timeUnit.toMillis(jSONObject2.getLong("min"));
                            aVarArr[i6].f45819c = timeUnit.toMillis(jSONObject2.getLong("max"));
                        }
                    } catch (Throwable unused4) {
                    }
                }
                yVar.f45816d = aVarArr;
            }
            c4371vj.m21000a(c4336ua.mo17817a(yVar));
        }
        this.f46638l.m20601a(c4371vj, aVar);
        this.f46640n.m21306a(c4371vj, aVar);
        c4371vj.m21023b(this.f46641o.m21230a(aVar, "ui_event_sending", C4378w0.m21074b()));
        c4371vj.m21027c(this.f46641o.m21230a(aVar, "ui_raw_event_sending", C4378w0.m21074b()));
        c4371vj.m21003a(this.f46641o.m21230a(aVar, "ui_collecting_for_bridge", C4378w0.m21073a()));
        this.f46642p.m19770a(c4371vj, aVar);
        c4371vj.m21006a(this.f46635i.m21159a(aVar, "throttling"));
        c4371vj.m21011a(this.f46643q.m19825a(aVar));
        this.f46644r.m19914a(c4371vj, aVar);
        Objects.requireNonNull(this.f46645s);
        JSONObject optJSONObject17 = aVar.optJSONObject("attribution");
        if (optJSONObject17 != null) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray4 = optJSONObject17.optJSONArray("deeplink_conditions");
            if (optJSONArray4 != null) {
                for (int i7 = 0; i7 < optJSONArray4.length(); i7++) {
                    JSONObject optJSONObject18 = optJSONArray4.optJSONObject(i7);
                    String optString2 = optJSONObject18.optString("key", null);
                    if (!TextUtils.isEmpty(optString2)) {
                        String optString3 = optJSONObject18.optString("value", null);
                        arrayList2.add(new Pair(optString2, optString3 == null ? null : new C4188oi.a(optString3)));
                    }
                }
            }
            c4371vj.m21009a(new C4188oi(arrayList2));
        }
        this.f46647u.m19973a(c4371vj, aVar);
        if (c4371vj.m21033e().f46424x) {
            this.f46648v.m20024a(c4371vj, aVar);
        }
        this.f46649w.m21115a(c4371vj, aVar);
    }
}
