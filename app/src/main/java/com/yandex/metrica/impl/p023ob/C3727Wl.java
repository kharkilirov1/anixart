package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Wl */
/* loaded from: classes2.dex */
public class C3727Wl {

    /* renamed from: a */
    @NonNull
    public final String f44400a;

    /* renamed from: b */
    @NonNull
    public final String f44401b;

    /* renamed from: c */
    @Nullable
    public final b f44402c;

    /* renamed from: d */
    public final int f44403d;

    /* renamed from: e */
    public final boolean f44404e;

    /* renamed from: f */
    @NonNull
    public final c f44405f;

    /* renamed from: g */
    @NonNull
    public final a f44406g;

    /* renamed from: com.yandex.metrica.impl.ob.Wl$a */
    public enum a {
        LIST("LIST"),
        LABEL("LABEL"),
        BUTTON("BUTTON"),
        CONTAINER("CONTAINER"),
        TOOLBAR("TOOLBAR"),
        INPUT("INPUT"),
        IMAGE("IMAGE"),
        WEBVIEW("WEBVIEW"),
        OTHER("OTHER");


        /* renamed from: a */
        @NonNull
        private final String f44417a;

        a(@NonNull String str) {
            this.f44417a = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Wl$b */
    public enum b {
        TEXT_TOO_LONG("TEXT_TOO_LONG"),
        REGEXP_NOT_MATCHED("REGEXP_NOT_MATCHED"),
        IRRELEVANT_CLASS("IRRELEVANT_CLASS"),
        BAD_REGEXP_MATCHED("BAD_REGEXP_MATCHED"),
        EQUALS("EQUALS"),
        CONTAINS("CONTAINS");


        /* renamed from: a */
        @NonNull
        private final String f44425a;

        b(@NonNull String str) {
            this.f44425a = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Wl$c */
    public enum c {
        VIEW_CONTAINER("VIEW_CONTAINER"),
        VIEW("VIEW");


        /* renamed from: a */
        @NonNull
        private final String f44429a;

        c(@NonNull String str) {
            this.f44429a = str;
        }
    }

    public C3727Wl(@NonNull String str, @NonNull String str2, @Nullable b bVar, int i2, boolean z, @NonNull c cVar, @NonNull a aVar) {
        this.f44400a = str;
        this.f44401b = str2;
        this.f44402c = bVar;
        this.f44403d = i2;
        this.f44404e = z;
        this.f44405f = cVar;
        this.f44406g = aVar;
    }

    @Nullable
    /* renamed from: a */
    public b mo18016a(@NonNull C3853bl c3853bl) {
        return this.f44402c;
    }

    @Nullable
    /* renamed from: a */
    public JSONArray mo18017a(@NonNull C3428Kl c3428Kl) {
        return null;
    }

    /* renamed from: a */
    public boolean mo18018a() {
        return false;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("UiElement{mClassName='");
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
        m24u.append('}');
        return m24u.toString();
    }

    @NonNull
    /* renamed from: a */
    public JSONObject m19367a(@NonNull C3428Kl c3428Kl, @Nullable b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f44405f.f44429a);
            if (bVar == null) {
                jSONObject.put("cnt", mo18017a(c3428Kl));
            }
            if (c3428Kl.f43289e) {
                JSONObject put = new JSONObject().put("ct", this.f44406g.f44417a).put("cn", this.f44400a).put("rid", this.f44401b).put("d", this.f44403d).put("lc", this.f44404e).put("if", bVar != null);
                if (bVar != null) {
                    put.put("fr", bVar.f44425a);
                }
                jSONObject.put("i", put);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
