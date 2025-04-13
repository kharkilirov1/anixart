package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.EnumC3124e;
import com.yandex.metrica.impl.p023ob.C3932em;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ym */
/* loaded from: classes2.dex */
public class C4452ym {

    /* renamed from: com.yandex.metrica.impl.ob.ym$a */
    public static class a extends JSONObject {
        public a() {
        }

        @Nullable
        /* renamed from: a */
        public Long m21275a(String str) {
            try {
                return Long.valueOf(getLong(str));
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: b */
        public String m21276b(String str) {
            if (!has(str) || !has(str)) {
                return "";
            }
            try {
                return getString(str);
            } catch (Throwable unused) {
                return "";
            }
        }

        /* renamed from: c */
        public String m21277c(String str) {
            if (has(str)) {
                try {
                    return getString(str);
                } catch (Throwable unused) {
                }
            }
            return "";
        }

        /* renamed from: d */
        public boolean m21278d(String str) {
            try {
                return JSONObject.NULL != get(str);
            } catch (Throwable unused) {
                return false;
            }
        }

        public a(String str) throws JSONException {
            super(str);
        }
    }

    @NonNull
    /* renamed from: a */
    public static <T> T m21236a(@Nullable T t, @NonNull T t2) {
        return t == null ? t2 : t;
    }

    @Nullable
    /* renamed from: a */
    public static String m21237a(@NonNull Context context, @NonNull String str) throws UnsupportedEncodingException {
        byte[] m21250a = m21250a(context, Base64.decode(str.getBytes("UTF-8"), 0));
        if (m21250a == null) {
            return null;
        }
        try {
            return new String(C3681V0.m19266a(new String(m21250a, "UTF-8")), "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    @NonNull
    /* renamed from: b */
    public static byte[] m21258b(@NonNull String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        return messageDigest.digest();
    }

    @NonNull
    /* renamed from: c */
    public static String m21262c(Map<String, String> map) {
        if (C3658U2.m19218b(map)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m21266d(@Nullable Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            try {
                Integer.parseInt(it.next().getValue());
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: e */
    public static JSONObject m21269e(@Nullable Map map) {
        if (C3658U2.m19218b(map)) {
            return null;
        }
        return C3658U2.m19211a(19) ? new JSONObject(map) : m21273h(map);
    }

    @Nullable
    /* renamed from: f */
    public static JSONObject m21271f(@Nullable Map map) {
        if (map == null) {
            return null;
        }
        return map.isEmpty() ? new JSONObject() : m21269e(map);
    }

    @Nullable
    /* renamed from: g */
    public static String m21272g(@Nullable Map map) {
        if (C3658U2.m19218b(map)) {
            return null;
        }
        return C3658U2.m19211a(19) ? new JSONObject(map).toString() : m21235a((Object) map).toString();
    }

    @NonNull
    /* renamed from: h */
    private static JSONObject m21273h(@NonNull Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String obj = entry.getKey().toString();
            if (obj != null) {
                linkedHashMap.put(obj, m21235a(entry.getValue()));
            }
        }
        return new JSONObject(linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r2 != (-1)) goto L28;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> m21274i(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r9 == 0) goto L6e
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        Lf:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L43
            java.lang.String r3 = ":"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L43
            java.lang.String r3 = ","
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L43
            java.lang.String r3 = "&"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L43
            r2 = 1
            goto L44
        L43:
            r2 = 0
        L44:
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L5f
            r6 = -1
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L59
            goto L5a
        L59:
            r2 = r6
        L5a:
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L5f
            goto L60
        L5f:
            r4 = 0
        L60:
            if (r4 == 0) goto Lf
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto Lf
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4452ym.m21274i(java.util.Map):java.util.Map");
    }

    @Nullable
    /* renamed from: d */
    public static HashMap<String, String> m21265d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m21254b(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    public static C4380w2 m21270f(@Nullable String str) {
        EnumC3124e enumC3124e;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("width");
                int optInt2 = jSONObject.optInt("height");
                int optInt3 = jSONObject.optInt("dpi");
                float optDouble = (float) jSONObject.optDouble("scaleFactor", 0.0d);
                String optString = jSONObject.optString("deviceType");
                EnumC3124e[] values = EnumC3124e.values();
                int i2 = 0;
                while (true) {
                    if (i2 >= 3) {
                        enumC3124e = null;
                        break;
                    }
                    EnumC3124e enumC3124e2 = values[i2];
                    if (enumC3124e2.f42437b.equals(optString)) {
                        enumC3124e = enumC3124e2;
                        break;
                    }
                    i2++;
                }
                return new C4380w2(optInt, optInt2, optInt3, optDouble, enumC3124e);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static String m21252b(@NonNull Context context, @Nullable String str) throws UnsupportedEncodingException {
        String str2;
        try {
            str2 = C3681V0.m19261a(str.getBytes("UTF-8"));
        } catch (Throwable unused) {
            str2 = null;
        }
        return Base64.encodeToString(m21250a(context, str2.getBytes("UTF-8")), 0);
    }

    @NonNull
    /* renamed from: e */
    public static HashMap<String, String> m21268e(@NonNull String str) throws JSONException {
        return m21254b(new JSONObject(str));
    }

    @NonNull
    /* renamed from: a */
    public static Map<String, String> m21241a(@Nullable String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                int indexOf = str2.indexOf(":");
                if (indexOf != -1) {
                    hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                }
            }
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: d */
    public static Long m21264d(@Nullable JSONObject jSONObject, @NonNull String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public static String m21267e(@Nullable JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getString(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public static String m21261c(@Nullable List<String> list) {
        if (C3658U2.m19217b(list)) {
            return null;
        }
        if (C3658U2.m19211a(19)) {
            return new JSONArray((Collection) list).toString();
        }
        return m21235a((Object) list).toString();
    }

    @Nullable
    /* renamed from: b */
    private static JSONArray m21256b(@Nullable Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(m21235a(it.next()));
            }
            return new JSONArray((Collection) arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public static List<String> m21263c(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        arrayList.add(jSONArray.getString(i2));
                    } catch (Throwable unused) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static long m21231a(@Nullable Long l2, @NonNull TimeUnit timeUnit, long j2) {
        return l2 == null ? j2 : timeUnit.toMillis(l2.longValue());
    }

    @Nullable
    /* renamed from: b */
    public static JSONArray m21257b(@Nullable List<?> list) {
        if (C3658U2.m19217b(list)) {
            return null;
        }
        if (C3658U2.m19211a(19)) {
            return new JSONArray((Collection) list);
        }
        return m21256b((Collection<?>) list);
    }

    @Nullable
    /* renamed from: a */
    private static byte[] m21250a(@NonNull Context context, @NonNull byte[] bArr) {
        try {
            byte[] m21258b = m21258b(context.getPackageName());
            byte[] bArr2 = new byte[bArr.length];
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr2[i2] = (byte) (bArr[i2] ^ m21258b[i2 % m21258b.length]);
            }
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public static Integer m21260c(@Nullable JSONObject jSONObject, @NonNull String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static HashMap<String, String> m21254b(JSONObject jSONObject) {
        if (JSONObject.NULL.equals(jSONObject)) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    @VisibleForTesting
    /* renamed from: a */
    public static Object m21235a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                ArrayList arrayList = new ArrayList(length);
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(m21235a(Array.get(obj, i2)));
                }
                return new JSONArray((Collection) arrayList);
            }
            if (obj instanceof Collection) {
                return m21256b((Collection<?>) obj);
            }
            return obj instanceof Map ? m21273h((Map) obj) : obj;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static C3378Il m21259c(@NonNull JSONObject jSONObject) throws JSONException {
        C3854bm c3854bm;
        C4082kg.i iVar = new C4082kg.i();
        JSONObject optJSONObject = jSONObject.optJSONObject("upc");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("uecc");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("ucfbc");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ruecc");
        boolean optBoolean = jSONObject.optBoolean("upe", iVar.f45706q);
        boolean optBoolean2 = jSONObject.optBoolean("uece", iVar.f45707r);
        boolean optBoolean3 = jSONObject.optBoolean("ucfbe", iVar.f45708s);
        boolean optBoolean4 = jSONObject.optBoolean("ruece", iVar.f45712w);
        if (optJSONObject == null) {
            c3854bm = null;
        } else {
            C4082kg.v vVar = new C4082kg.v();
            c3854bm = new C3854bm(optJSONObject.optInt("tltb", vVar.f45801b), optJSONObject.optInt("ttb", vVar.f45802c), optJSONObject.optInt("mvcl", vVar.f45803d), optJSONObject.optLong("act", vVar.f45804e), optJSONObject.optBoolean("rtsc", vVar.f45805f), optJSONObject.optBoolean("er", vVar.f45806g), optJSONObject.optBoolean("pabd", vVar.f45807h), m21240a(optJSONObject.optJSONArray("f")));
        }
        return new C3378Il(optBoolean, optBoolean2, optBoolean3, optBoolean4, c3854bm, optJSONObject2 == null ? null : m21232a(optJSONObject2, C4378w0.m21074b()), optJSONObject3 == null ? null : m21232a(optJSONObject3, C4378w0.m21073a()), optJSONObject4 != null ? m21232a(optJSONObject4, C4378w0.m21074b()) : null);
    }

    @Nullable
    /* renamed from: b */
    public static Boolean m21251b(@Nullable JSONObject jSONObject, @NonNull String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static List<String> m21255b(@Nullable JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: a */
    public static String m21239a(@Nullable Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return map.isEmpty() ? "" : m21272g(map);
    }

    /* renamed from: a */
    public static boolean m21249a(@Nullable JSONObject jSONObject, @NonNull String str, boolean z) {
        Boolean m21251b = m21251b(jSONObject, str);
        return m21251b == null ? z : m21251b.booleanValue();
    }

    @Nullable
    /* renamed from: b */
    public static String m21253b(@Nullable Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                JSONArray m21257b = m21257b((List<?>) entry.getValue());
                if (m21257b != null) {
                    jSONObject.put(entry.getKey(), m21257b.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static JSONArray m21242a(Collection<C3700Vj> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            Iterator<C3700Vj> it = collection.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(m21246a(it.next()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m21246a(C3700Vj c3700Vj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cell_id", c3700Vj.m19297b());
        jSONObject.put("signal_strength", c3700Vj.m19311p());
        jSONObject.put("lac", c3700Vj.m19300e());
        jSONObject.put("country_code", c3700Vj.m19306k());
        jSONObject.put("operator_id", c3700Vj.m19307l());
        jSONObject.put("operator_name", c3700Vj.m19309n());
        jSONObject.put("is_connected", c3700Vj.m19312q());
        jSONObject.put("cell_type", c3700Vj.m19298c());
        jSONObject.put("pci", c3700Vj.m19310o());
        jSONObject.put("last_visible_time_offset", c3700Vj.m19299d());
        jSONObject.put("lte_rsrq", c3700Vj.m19303h());
        jSONObject.put("lte_rssnr", c3700Vj.m19305j());
        jSONObject.put("arfcn", c3700Vj.m19295a());
        jSONObject.put("lte_rssi", c3700Vj.m19304i());
        jSONObject.put("lte_bandwidth", c3700Vj.m19301f());
        jSONObject.put("lte_cqi", c3700Vj.m19302g());
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m21244a(@NonNull C3378Il c3378Il) throws JSONException {
        JSONObject put = new JSONObject().put("upe", c3378Il.f43141a).put("uece", c3378Il.f43142b).put("ruece", c3378Il.f43144d).put("ucfbe", c3378Il.f43143c);
        C3854bm c3854bm = c3378Il.f43145e;
        JSONObject putOpt = put.putOpt("upc", c3854bm == null ? null : new JSONObject().put("tltb", c3854bm.f44841a).put("ttb", c3854bm.f44842b).put("mvcl", c3854bm.f44843c).put("act", c3854bm.f44844d).put("rtsc", c3854bm.f44845e).put("er", c3854bm.f44846f).put("pabd", c3854bm.f44847g).put("f", m21243a(c3854bm.f44848h)));
        C3428Kl c3428Kl = c3378Il.f43146f;
        JSONObject putOpt2 = putOpt.putOpt("uecc", c3428Kl == null ? null : m21245a(c3428Kl));
        C3428Kl c3428Kl2 = c3378Il.f43148h;
        JSONObject putOpt3 = putOpt2.putOpt("ruecc", c3428Kl2 == null ? null : m21245a(c3428Kl2));
        C3428Kl c3428Kl3 = c3378Il.f43147g;
        return putOpt3.putOpt("ucfbc", c3428Kl3 != null ? m21245a(c3428Kl3) : null);
    }

    /* renamed from: a */
    private static JSONObject m21245a(@NonNull C3428Kl c3428Kl) throws JSONException {
        return new JSONObject().put("tsc", c3428Kl.f43285a).put("rtsc1", c3428Kl.f43286b).put("tvc", c3428Kl.f43287c).put("tsc1", c3428Kl.f43288d).put("ic", c3428Kl.f43289e).put("ncvc", c3428Kl.f43290f).put("tlc", c3428Kl.f43291g).put("vh", c3428Kl.f43292h).put("if", c3428Kl.f43293i).put("wvuc", c3428Kl.f43294j).put("tltb", c3428Kl.f43295k).put("ttb", c3428Kl.f43296l).put("mec", c3428Kl.f43297m).put("mfcl", c3428Kl.f43298n).put("wvul", c3428Kl.f43299o).put("f", m21243a(c3428Kl.f43300p));
    }

    /* renamed from: a */
    private static C3428Kl m21232a(@NonNull JSONObject jSONObject, @NonNull C4082kg.u uVar) {
        return new C3428Kl(jSONObject.optBoolean("tsc", uVar.f45785b), jSONObject.optBoolean("rtsc1", uVar.f45786c), jSONObject.optBoolean("tvc", uVar.f45787d), jSONObject.optBoolean("tsc1", uVar.f45788e), jSONObject.optBoolean("ic", uVar.f45793j), jSONObject.optBoolean("ncvc", uVar.f45794k), jSONObject.optBoolean("tlc", uVar.f45795l), jSONObject.optBoolean("vh", uVar.f45796m), jSONObject.optBoolean("if", uVar.f45798o), jSONObject.optBoolean("wvuc", uVar.f45799p), jSONObject.optInt("tltb", uVar.f45789f), jSONObject.optInt("ttb", uVar.f45790g), jSONObject.optInt("mec", uVar.f45791h), jSONObject.optInt("mfcl", uVar.f45792i), jSONObject.optInt("wvul", uVar.f45800q), m21240a(jSONObject.optJSONArray("f")));
    }

    @NonNull
    /* renamed from: a */
    private static JSONArray m21243a(@NonNull List<C3932em> list) {
        JSONArray jSONArray = new JSONArray();
        for (C3932em c3932em : list) {
            try {
                jSONArray.put(new JSONObject().put("ft", c3932em.f45067a.f45074a).put("fv", c3932em.f45068b));
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    @NonNull
    /* renamed from: a */
    private static List<C3932em> m21240a(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    arrayList.add(new C3932em(C3932em.b.m19829a(jSONObject.getInt("ft")), jSONObject.optString("fv")));
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public static C3741Xa m21234a(@NonNull JSONObject jSONObject) {
        return new C3741Xa(m21233a(jSONObject, "activation"), m21233a(jSONObject, "satellite_clids"), m21233a(jSONObject, "preload_info"));
    }

    @NonNull
    /* renamed from: a */
    public static JSONObject m21248a(@NonNull C3741Xa c3741Xa) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("activation", m21247a(c3741Xa.f44474a));
            jSONObject.putOpt("preload_info", m21247a(c3741Xa.f44476c));
            jSONObject.putOpt("satellite_clids", m21247a(c3741Xa.f44475b));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Nullable
    /* renamed from: a */
    private static C3716Wa m21233a(@NonNull JSONObject jSONObject, @NonNull String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return new C3716Wa(optJSONObject.optLong("exp_t"), optJSONObject.optInt("interval"));
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    private static JSONObject m21247a(@Nullable C3716Wa c3716Wa) {
        if (c3716Wa == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exp_t", c3716Wa.f44374a).put("interval", c3716Wa.f44375b);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Nullable
    /* renamed from: a */
    public static String m21238a(@Nullable C4380w2 c4380w2) {
        JSONObject jSONObject;
        if (c4380w2 == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("width", c4380w2.m21079e()).put("height", c4380w2.m21077c()).put("dpi", c4380w2.m21076b()).put("scaleFactor", c4380w2.m21078d()).putOpt("deviceType", c4380w2.m21075a() == null ? null : c4380w2.m21075a().f42437b);
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }
}
