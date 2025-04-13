package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.impl.AbstractC4593p0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.o0 */
/* loaded from: classes2.dex */
public class C4591o0 extends AbstractC4593p0 {

    /* renamed from: c */
    @NonNull
    private final String f47417c;

    /* renamed from: d */
    @NonNull
    private final a f47418d;

    /* renamed from: com.yandex.metrica.push.impl.o0$a */
    public static class a {

        /* renamed from: a */
        @NonNull
        private final b f47419a;

        public a(@NonNull b bVar) {
            this.f47419a = bVar;
        }

        @NonNull
        /* renamed from: a */
        public JSONObject mo21583a() throws JSONException {
            return new JSONObject().put("type", b.m21584a(this.f47419a));
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.yandex.metrica.push.impl.o0$b */
    public static final class b {

        /* renamed from: b */
        public static final b f47420b = new b("RECEIVE", 0, "receive");

        /* renamed from: c */
        public static final b f47421c = new b("DISMISS", 1, "dismiss");

        /* renamed from: d */
        public static final b f47422d = new b("OPEN", 2, "open");

        /* renamed from: e */
        public static final b f47423e = new b("CUSTOM", 3, "custom");

        /* renamed from: f */
        public static final b f47424f = new b("PROCESSED", 4, "processed");

        /* renamed from: g */
        public static final b f47425g = new b("SHOWN", 5, "shown");

        /* renamed from: h */
        public static final b f47426h = new b("IGNORED", 6, "ignored");

        /* renamed from: i */
        public static final b f47427i = new b("EXPIRED", 7, "expired");

        /* renamed from: j */
        public static final b f47428j = new b("REMOVED", 8, "removed");

        /* renamed from: k */
        public static final b f47429k = new b("REPLACE", 9, "replace");

        /* renamed from: a */
        @NonNull
        private final String f47430a;

        private b(String str, int i2, String str2) {
            this.f47430a = str2;
        }

        /* renamed from: a */
        public static String m21584a(b bVar) {
            return bVar.f47430a;
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.o0$c */
    public static class c extends a {

        /* renamed from: b */
        @Nullable
        private final String f47431b;

        /* renamed from: c */
        @Nullable
        private final String f47432c;

        public c(@Nullable String str, @Nullable String str2) {
            super(b.f47423e);
            this.f47431b = str;
            this.f47432c = str2;
        }

        @Override // com.yandex.metrica.push.impl.C4591o0.a
        @NonNull
        /* renamed from: a */
        public JSONObject mo21583a() throws JSONException {
            return super.mo21583a().put("id", this.f47431b).put("text", this.f47432c);
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.o0$d */
    public static class d extends a {

        /* renamed from: b */
        @Nullable
        private final String f47433b;

        public d(@Nullable String str) {
            super(b.f47427i);
            this.f47433b = str;
        }

        @Override // com.yandex.metrica.push.impl.C4591o0.a
        @NonNull
        /* renamed from: a */
        public JSONObject mo21583a() throws JSONException {
            return super.mo21583a().put("category", this.f47433b);
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.o0$e */
    public static class e extends a {

        /* renamed from: b */
        @Nullable
        private final String f47434b;

        /* renamed from: c */
        @Nullable
        private final String f47435c;

        public e(@Nullable String str, @Nullable String str2) {
            super(b.f47426h);
            this.f47434b = str;
            this.f47435c = str2;
        }

        @Override // com.yandex.metrica.push.impl.C4591o0.a
        @NonNull
        /* renamed from: a */
        public JSONObject mo21583a() throws JSONException {
            return super.mo21583a().put("category", this.f47434b).put("details", this.f47435c);
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.o0$f */
    public static class f extends a {

        /* renamed from: b */
        @Nullable
        private final String f47436b;

        /* renamed from: c */
        @Nullable
        private final String f47437c;

        public f(@Nullable String str, @Nullable String str2) {
            super(b.f47428j);
            this.f47436b = str;
            this.f47437c = str2;
        }

        @Override // com.yandex.metrica.push.impl.C4591o0.a
        @NonNull
        /* renamed from: a */
        public JSONObject mo21583a() throws JSONException {
            return super.mo21583a().put("category", this.f47436b).put("details", this.f47437c);
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.o0$g */
    public static class g extends a {

        /* renamed from: b */
        @NonNull
        private final String f47438b;

        public g(@NonNull String str) {
            super(b.f47429k);
            this.f47438b = str;
        }

        @Override // com.yandex.metrica.push.impl.C4591o0.a
        @NonNull
        /* renamed from: a */
        public JSONObject mo21583a() throws JSONException {
            return super.mo21583a().put("new_push_id", this.f47438b);
        }
    }

    private C4591o0(@NonNull String str, @NonNull String str2, @NonNull a aVar) {
        super(AbstractC4593p0.a.f47457d, str2);
        this.f47417c = str;
        this.f47418d = aVar;
    }

    @NonNull
    /* renamed from: a */
    public static C4591o0 m21572a(@NonNull String str, @NonNull String str2) {
        return new C4591o0(str, str2, new a(b.f47421c));
    }

    @NonNull
    /* renamed from: b */
    public static C4591o0 m21575b(@NonNull String str, @NonNull String str2) {
        return new C4591o0(str, str2, new a(b.f47422d));
    }

    @NonNull
    /* renamed from: c */
    public static C4591o0 m21578c(@NonNull String str, @NonNull String str2) {
        return new C4591o0(str, str2, new a(b.f47424f));
    }

    @NonNull
    /* renamed from: d */
    public static C4591o0 m21581d(@NonNull String str, @NonNull String str2) {
        return new C4591o0(str, str2, new a(b.f47420b));
    }

    @NonNull
    /* renamed from: e */
    public static C4591o0 m21582e(@NonNull String str, @NonNull String str2) {
        return new C4591o0(str, str2, new a(b.f47425g));
    }

    @NonNull
    /* renamed from: a */
    public static C4591o0 m21573a(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        return new C4591o0(str, str3, new c(str2, null));
    }

    @NonNull
    /* renamed from: b */
    public static C4591o0 m21577b(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4) {
        return new C4591o0(str, str4, new c(str2, str3));
    }

    @NonNull
    /* renamed from: c */
    public static C4591o0 m21580c(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull String str4) {
        return new C4591o0(str, str4, new f(str2, str3));
    }

    @NonNull
    /* renamed from: b */
    public static C4591o0 m21576b(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        return new C4591o0(str, str3, new d(str2));
    }

    @NonNull
    /* renamed from: c */
    public static C4591o0 m21579c(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return new C4591o0(str, str3, new g(str2));
    }

    @NonNull
    /* renamed from: a */
    public static C4591o0 m21574a(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull String str4) {
        return new C4591o0(str, str4, new e(str2, str3));
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4589n0
    @NonNull
    /* renamed from: a */
    public String mo21558a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notification_id", this.f47417c);
            jSONObject.put("action", this.f47418d.mo21583a());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
