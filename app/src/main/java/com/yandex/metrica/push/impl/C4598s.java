package com.yandex.metrica.push.impl;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.PublicLogger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.s */
/* loaded from: classes2.dex */
public class C4598s {

    /* renamed from: A */
    @Nullable
    private final String f47505A;

    /* renamed from: B */
    @Nullable
    private Bitmap f47506B;

    /* renamed from: C */
    @Nullable
    private final Integer f47507C;

    /* renamed from: D */
    @Nullable
    private final String f47508D;

    /* renamed from: E */
    @Nullable
    private Bitmap f47509E;

    /* renamed from: F */
    private final boolean f47510F;

    /* renamed from: G */
    @Nullable
    private final Integer f47511G;

    /* renamed from: H */
    @Nullable
    private final a[] f47512H;

    /* renamed from: I */
    @Nullable
    private final String f47513I;

    /* renamed from: J */
    @Nullable
    private final Boolean f47514J;

    /* renamed from: K */
    @Nullable
    private final Long f47515K;

    /* renamed from: L */
    @Nullable
    private final Long f47516L;

    /* renamed from: M */
    private final boolean f47517M;

    /* renamed from: N */
    @NonNull
    private final c f47518N;

    /* renamed from: O */
    @NonNull
    private final Context f47519O;

    /* renamed from: P */
    @NonNull
    private final C4518D0 f47520P;

    /* renamed from: a */
    @Nullable
    private final String f47521a;

    /* renamed from: b */
    @Nullable
    private final Integer f47522b;

    /* renamed from: c */
    @Nullable
    private final String f47523c;

    /* renamed from: d */
    @Nullable
    private final Boolean f47524d;

    /* renamed from: e */
    @Nullable
    private final Integer f47525e;

    /* renamed from: f */
    @Nullable
    private final String f47526f;

    /* renamed from: g */
    @Nullable
    private final String f47527g;

    /* renamed from: h */
    @Nullable
    private final String f47528h;

    /* renamed from: i */
    @Nullable
    private final String f47529i;

    /* renamed from: j */
    @Nullable
    private final String f47530j;

    /* renamed from: k */
    @Nullable
    private final Integer f47531k;

    /* renamed from: l */
    @Nullable
    private final String f47532l;

    /* renamed from: m */
    @Nullable
    private final Boolean f47533m;

    /* renamed from: n */
    @Nullable
    private final b f47534n;

    /* renamed from: o */
    @Nullable
    private final Integer f47535o;

    /* renamed from: p */
    @Nullable
    private final Boolean f47536p;

    /* renamed from: q */
    @Nullable
    private final Boolean f47537q;

    /* renamed from: r */
    @Nullable
    private final Integer f47538r;

    /* renamed from: s */
    private final long f47539s;

    /* renamed from: t */
    @Nullable
    private final Boolean f47540t;

    /* renamed from: u */
    @Nullable
    private final String f47541u;

    /* renamed from: v */
    @Nullable
    private final long[] f47542v;

    /* renamed from: w */
    @Nullable
    private final Integer f47543w;

    /* renamed from: x */
    @Nullable
    private final String f47544x;

    /* renamed from: y */
    @Nullable
    private final Integer f47545y;

    /* renamed from: z */
    @Nullable
    private final Integer f47546z;

    /* renamed from: com.yandex.metrica.push.impl.s$a */
    public static class a {

        /* renamed from: a */
        @Nullable
        private final String f47547a;

        /* renamed from: b */
        @Nullable
        private final String f47548b;

        /* renamed from: c */
        @Nullable
        private final String f47549c;

        /* renamed from: d */
        @Nullable
        private final Integer f47550d;

        /* renamed from: e */
        @Nullable
        private final Boolean f47551e;

        /* renamed from: f */
        @Nullable
        private final Boolean f47552f;

        /* renamed from: g */
        @Nullable
        private final Boolean f47553g;

        /* renamed from: h */
        @Nullable
        private final b f47554h;

        /* renamed from: i */
        @Nullable
        private final String f47555i;

        /* renamed from: j */
        @Nullable
        private final Long f47556j;

        /* renamed from: k */
        @NonNull
        private final EnumC7011a f47557k;

        /* renamed from: l */
        private final boolean f47558l;

        /* renamed from: com.yandex.metrica.push.impl.s$a$a, reason: collision with other inner class name */
        public enum EnumC7011a {
            BROADCAST(0),
            TRANSPARENT_ACTIVITY(1),
            APPLICATION_ACTIVITY(2),
            UNKNOWN(-1);


            /* renamed from: a */
            private final int f47564a;

            EnumC7011a(int i2) {
                this.f47564a = i2;
            }

            /* renamed from: a */
            public static EnumC7011a m21721a(int i2) {
                for (EnumC7011a enumC7011a : (EnumC7011a[]) values().clone()) {
                    if (enumC7011a.f47564a == i2) {
                        return enumC7011a;
                    }
                }
                return UNKNOWN;
            }
        }

        /* renamed from: com.yandex.metrica.push.impl.s$a$b */
        public enum b {
            OPEN_URI(0),
            OPEN_APP_URI(1),
            DO_NOTHING(2),
            INLINE(3),
            UNKNOWN(-1);


            /* renamed from: a */
            private final int f47571a;

            b(int i2) {
                this.f47571a = i2;
            }

            /* renamed from: a */
            public static b m21722a(int i2) {
                for (b bVar : (b[]) values().clone()) {
                    if (bVar.f47571a == i2) {
                        return bVar;
                    }
                }
                return UNKNOWN;
            }
        }

        public a(@NonNull Context context, @NonNull JSONObject jSONObject) {
            this.f47547a = jSONObject.optString("a");
            this.f47548b = jSONObject.optString("b");
            this.f47549c = jSONObject.optString("c");
            this.f47550d = C4530J0.m21444a(context, jSONObject.optString("d"));
            this.f47551e = C4605v0.m21734a(jSONObject, "e");
            this.f47552f = C4605v0.m21734a(jSONObject, "f");
            this.f47553g = C4605v0.m21734a(jSONObject, "g");
            this.f47554h = m21708b(jSONObject);
            this.f47555i = jSONObject.optString("i");
            this.f47556j = C4605v0.m21738c(jSONObject, "j");
            this.f47557k = m21707a(jSONObject);
            this.f47558l = C4605v0.m21736a(jSONObject, "l", true);
        }

        @Nullable
        /* renamed from: a */
        public String m21709a() {
            return this.f47549c;
        }

        @Nullable
        /* renamed from: b */
        public Boolean m21710b() {
            return this.f47552f;
        }

        @Nullable
        /* renamed from: c */
        public Boolean m21711c() {
            return this.f47553g;
        }

        @Nullable
        /* renamed from: d */
        public Long m21712d() {
            return this.f47556j;
        }

        @Nullable
        /* renamed from: e */
        public Boolean m21713e() {
            return this.f47551e;
        }

        @Nullable
        /* renamed from: f */
        public Integer m21714f() {
            return this.f47550d;
        }

        @Nullable
        /* renamed from: g */
        public String m21715g() {
            return this.f47547a;
        }

        @Nullable
        /* renamed from: h */
        public String m21716h() {
            return this.f47555i;
        }

        @NonNull
        /* renamed from: i */
        public EnumC7011a m21717i() {
            return this.f47557k;
        }

        @Nullable
        /* renamed from: j */
        public String m21718j() {
            return this.f47548b;
        }

        @Nullable
        /* renamed from: k */
        public b m21719k() {
            return this.f47554h;
        }

        /* renamed from: l */
        public boolean m21720l() {
            return this.f47558l;
        }

        @NonNull
        /* renamed from: a */
        private EnumC7011a m21707a(@NonNull JSONObject jSONObject) {
            EnumC7011a enumC7011a = EnumC7011a.UNKNOWN;
            Integer m21737b = C4605v0.m21737b(jSONObject, "k");
            return m21737b != null ? EnumC7011a.m21721a(m21737b.intValue()) : enumC7011a;
        }

        @Nullable
        /* renamed from: b */
        private b m21708b(@NonNull JSONObject jSONObject) {
            Integer m21737b = C4605v0.m21737b(jSONObject, "h");
            if (m21737b != null) {
                return b.m21722a(m21737b.intValue());
            }
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.s$b */
    public static class b {

        /* renamed from: a */
        @Nullable
        private final Integer f47572a;

        /* renamed from: b */
        @Nullable
        private final Integer f47573b;

        /* renamed from: c */
        @Nullable
        private final Integer f47574c;

        public b(@NonNull JSONObject jSONObject) {
            this.f47572a = C4605v0.m21737b(jSONObject, "a");
            this.f47573b = C4605v0.m21737b(jSONObject, "b");
            this.f47574c = C4605v0.m21737b(jSONObject, "c");
        }

        @Nullable
        /* renamed from: a */
        public Integer m21723a() {
            return this.f47572a;
        }

        @Nullable
        /* renamed from: b */
        public Integer m21724b() {
            return this.f47574c;
        }

        @Nullable
        /* renamed from: c */
        public Integer m21725c() {
            return this.f47573b;
        }

        /* renamed from: d */
        public boolean m21726d() {
            return (this.f47572a == null || this.f47573b == null || this.f47574c == null) ? false : true;
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.s$c */
    public enum c {
        BROADCAST(0),
        TRANSPARENT_ACTIVITY(1),
        APPLICATION_ACTIVITY(2),
        UNKNOWN(-1);


        /* renamed from: a */
        private final int f47580a;

        c(int i2) {
            this.f47580a = i2;
        }

        /* renamed from: a */
        public static c m21727a(int i2) {
            for (c cVar : (c[]) values().clone()) {
                if (cVar.f47580a == i2) {
                    return cVar;
                }
            }
            return UNKNOWN;
        }
    }

    @VisibleForTesting
    public C4598s(@NonNull Context context, @NonNull JSONObject jSONObject, @NonNull C4518D0 c4518d0) {
        this.f47519O = context;
        this.f47520P = c4518d0;
        this.f47521a = jSONObject.optString("ag");
        this.f47522b = C4605v0.m21737b(jSONObject, "a");
        this.f47523c = jSONObject.optString("b");
        this.f47524d = C4605v0.m21734a(jSONObject, "c");
        this.f47525e = C4605v0.m21737b(jSONObject, "d");
        this.f47526f = jSONObject.optString("e");
        this.f47527g = jSONObject.optString("f");
        this.f47528h = jSONObject.optString("g");
        this.f47529i = jSONObject.optString("h");
        this.f47530j = jSONObject.optString("i");
        this.f47531k = C4605v0.m21737b(jSONObject, "j");
        this.f47532l = jSONObject.optString("k");
        this.f47533m = C4605v0.m21734a(jSONObject, "l");
        this.f47534n = m21667a(jSONObject);
        this.f47535o = C4605v0.m21737b(jSONObject, "n");
        this.f47536p = C4605v0.m21734a(jSONObject, "o");
        this.f47537q = C4605v0.m21734a(jSONObject, "p");
        this.f47538r = C4605v0.m21737b(jSONObject, "q");
        this.f47539s = jSONObject.optLong("r", System.currentTimeMillis());
        this.f47540t = C4605v0.m21734a(jSONObject, "s");
        this.f47541u = jSONObject.optString("t");
        this.f47542v = m21668a(jSONObject, "u");
        this.f47543w = C4605v0.m21737b(jSONObject, "v");
        this.f47545y = C4530J0.m21444a(context, jSONObject.optString("x"));
        this.f47505A = jSONObject.optString("y");
        this.f47508D = jSONObject.optString("aa");
        this.f47510F = jSONObject.optInt("ab", 0) == 1;
        this.f47511G = C4530J0.m21450b(context, jSONObject.optString("ai"));
        this.f47544x = jSONObject.optString("w");
        this.f47512H = m21669a(context, jSONObject);
        this.f47513I = jSONObject.optString("ac");
        this.f47514J = C4605v0.m21734a(jSONObject, "ad");
        this.f47546z = C4530J0.m21444a(context, jSONObject.optString("ae"));
        this.f47507C = C4530J0.m21444a(context, jSONObject.optString("af"));
        this.f47515K = C4605v0.m21738c(jSONObject, "ah");
        this.f47516L = C4605v0.m21738c(jSONObject, "aj");
        this.f47517M = C4605v0.m21736a(jSONObject, "ak", true);
        this.f47518N = m21670b(jSONObject);
    }

    @Nullable
    /* renamed from: a */
    private b m21667a(@NonNull JSONObject jSONObject) {
        if (!jSONObject.has("m")) {
            return null;
        }
        try {
            return new b(jSONObject.getJSONObject("m"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @NonNull
    /* renamed from: b */
    private c m21670b(@NonNull JSONObject jSONObject) {
        c cVar = c.UNKNOWN;
        Integer m21737b = C4605v0.m21737b(jSONObject, "al");
        return m21737b != null ? c.m21727a(m21737b.intValue()) : cVar;
    }

    @Nullable
    /* renamed from: A */
    public Boolean m21671A() {
        return this.f47540t;
    }

    @Nullable
    /* renamed from: B */
    public String m21672B() {
        return this.f47541u;
    }

    @Nullable
    /* renamed from: C */
    public Uri m21673C() {
        if (this.f47511G == null) {
            return null;
        }
        Resources resources = this.f47519O.getResources();
        return new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(this.f47511G.intValue())).appendPath(resources.getResourceTypeName(this.f47511G.intValue())).appendPath(resources.getResourceEntryName(this.f47511G.intValue())).build();
    }

    @Nullable
    /* renamed from: D */
    public String m21674D() {
        return this.f47530j;
    }

    @Nullable
    /* renamed from: E */
    public Long m21675E() {
        return this.f47516L;
    }

    /* renamed from: F */
    public boolean m21676F() {
        return this.f47517M;
    }

    @Nullable
    /* renamed from: G */
    public long[] m21677G() {
        return this.f47542v;
    }

    @Nullable
    /* renamed from: H */
    public Integer m21678H() {
        return this.f47543w;
    }

    @NonNull
    /* renamed from: I */
    public Long m21679I() {
        return Long.valueOf(this.f47539s);
    }

    /* renamed from: J */
    public boolean m21680J() {
        return this.f47510F;
    }

    @Nullable
    /* renamed from: c */
    public String m21683c() {
        return this.f47523c;
    }

    @Nullable
    /* renamed from: d */
    public String m21684d() {
        return this.f47513I;
    }

    @Nullable
    /* renamed from: e */
    public Integer m21685e() {
        return this.f47525e;
    }

    @Nullable
    /* renamed from: f */
    public String m21686f() {
        return this.f47527g;
    }

    @Nullable
    /* renamed from: g */
    public String m21687g() {
        return this.f47529i;
    }

    @Nullable
    /* renamed from: h */
    public String m21688h() {
        return this.f47528h;
    }

    @Nullable
    /* renamed from: i */
    public String m21689i() {
        return this.f47526f;
    }

    @Nullable
    /* renamed from: j */
    public Integer m21690j() {
        return this.f47531k;
    }

    @Nullable
    /* renamed from: k */
    public Integer m21691k() {
        return this.f47535o;
    }

    @Nullable
    /* renamed from: l */
    public Boolean m21692l() {
        return this.f47514J;
    }

    @Nullable
    /* renamed from: m */
    public String m21693m() {
        return this.f47532l;
    }

    @Nullable
    /* renamed from: n */
    public Boolean m21694n() {
        return this.f47533m;
    }

    @Nullable
    /* renamed from: o */
    public Integer m21695o() {
        return this.f47545y;
    }

    @Nullable
    /* renamed from: p */
    public Bitmap m21696p() {
        if (this.f47509E == null) {
            this.f47509E = m21666a(this.f47519O, this.f47520P, this.f47507C, this.f47508D, -1.0f, -1.0f);
        }
        return this.f47509E;
    }

    @Nullable
    /* renamed from: q */
    public Bitmap m21697q() {
        if (this.f47506B == null) {
            this.f47506B = m21666a(this.f47519O, this.f47520P, this.f47546z, this.f47505A, this.f47519O.getResources().getDimension(R.dimen.notification_large_icon_width), this.f47519O.getResources().getDimension(R.dimen.notification_large_icon_height));
        }
        return this.f47506B;
    }

    @Nullable
    /* renamed from: r */
    public b m21698r() {
        return this.f47534n;
    }

    @Nullable
    /* renamed from: s */
    public Integer m21699s() {
        return this.f47522b;
    }

    @Nullable
    /* renamed from: t */
    public String m21700t() {
        return this.f47521a;
    }

    @Nullable
    /* renamed from: u */
    public Long m21701u() {
        return this.f47515K;
    }

    @Nullable
    /* renamed from: v */
    public Boolean m21702v() {
        return this.f47536p;
    }

    @Nullable
    /* renamed from: w */
    public Boolean m21703w() {
        return this.f47537q;
    }

    @Nullable
    /* renamed from: x */
    public String m21704x() {
        return this.f47544x;
    }

    /* renamed from: y */
    public c m21705y() {
        return this.f47518N;
    }

    @Nullable
    /* renamed from: z */
    public Integer m21706z() {
        return this.f47538r;
    }

    @Nullable
    /* renamed from: a */
    private a[] m21669a(@NonNull Context context, @NonNull JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("z");
            a[] aVarArr = new a[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                aVarArr[i2] = new a(context, jSONArray.getJSONObject(i2));
            }
            return aVarArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    public Boolean m21682b() {
        return this.f47524d;
    }

    @Nullable
    /* renamed from: a */
    private static long[] m21668a(@NonNull JSONObject jSONObject, @NonNull String str) {
        if (!jSONObject.has(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            long[] jArr = new long[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public a[] m21681a() {
        return this.f47512H;
    }

    @Nullable
    /* renamed from: a */
    private static Bitmap m21666a(@NonNull Context context, @NonNull C4518D0 c4518d0, @Nullable Integer num, @Nullable String str, float f2, float f3) {
        Bitmap bitmap;
        if (num != null) {
            PublicLogger.m21385i("Get bitmap from resources with id: %d", num);
            bitmap = C4530J0.m21442a(context, num.intValue(), f2, f3);
        } else {
            bitmap = null;
        }
        if (bitmap != null || CoreUtils.isEmpty(str)) {
            return bitmap;
        }
        PublicLogger.m21385i("Download bitmap for url: %s", str);
        return c4518d0.m21425a(context, str, f2, f3);
    }
}
