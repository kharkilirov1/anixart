package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.AbstractC3558Q1;
import com.yandex.metrica.impl.p023ob.C3156A;
import com.yandex.metrica.impl.p023ob.C3196Be;
import com.yandex.metrica.impl.p023ob.C3535P3;
import com.yandex.metrica.impl.p023ob.C3575Qi;
import com.yandex.metrica.impl.p023ob.C3599Ri;
import com.yandex.metrica.impl.p023ob.InterfaceC3467Ma;
import com.yandex.mobile.ads.C4632R;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.G2 */
/* loaded from: classes2.dex */
public class C3309G2 extends AbstractC3558Q1 {

    /* renamed from: a */
    @NonNull
    private final C3366I9 f42934a;

    /* renamed from: b */
    @NonNull
    private final Context f42935b;

    /* renamed from: c */
    @NonNull
    private final C3340H8 f42936c;

    /* renamed from: com.yandex.metrica.impl.ob.G2$a */
    public class a extends SparseArray<AbstractC3558Q1.a> {
        public a() {
            put(29, new j(C3309G2.this.f42935b));
            put(39, new k());
            put(47, new l(C3309G2.this.f42934a));
            put(60, new m(C3309G2.this.f42934a));
            put(62, new n());
            put(66, new o());
            put(67, new g(InterfaceC3467Ma.b.m18577a(C3599Ri.class).mo18576b(C3309G2.this.f42935b), new C3391J9(C3567Qa.m18783a(C3309G2.this.f42935b).m18806q(), C3309G2.this.f42935b.getPackageName())));
            put(68, new u());
            put(72, new f(InterfaceC3467Ma.b.m18578b(C4028ie.class).mo18576b(C3309G2.this.f42935b), InterfaceC3467Ma.b.m18577a(C3599Ri.class).mo18576b(C3309G2.this.f42935b)));
            put(82, new h(InterfaceC3467Ma.b.m18578b(C4028ie.class).mo18576b(C3309G2.this.f42935b), InterfaceC3467Ma.b.m18577a(C3820ae.class).mo18576b(C3309G2.this.f42935b)));
            put(87, new i(InterfaceC3467Ma.b.m18577a(C3599Ri.class).mo18576b(C3309G2.this.f42935b)));
            put(92, new c(InterfaceC3467Ma.b.m18577a(C3599Ri.class).mo18576b(C3309G2.this.f42935b)));
            put(93, new e(C3309G2.this.f42935b, InterfaceC3467Ma.b.m18577a(C3446Le.class).mo18576b(C3309G2.this.f42935b), InterfaceC3467Ma.b.m18577a(C3196Be.class).mo18576b(C3309G2.this.f42935b)));
            put(94, new p(C3309G2.this.f42935b, InterfaceC3467Ma.b.m18577a(C3599Ri.class).mo18576b(C3309G2.this.f42935b)));
            put(98, new t(C3309G2.this.f42934a));
            put(100, new b(new C3391J9(C3567Qa.m18783a(C3309G2.this.f42935b).m18806q(), C3309G2.this.f42935b.getPackageName())));
            put(101, new q(C3309G2.this.f42934a, InterfaceC3467Ma.b.m18577a(C3599Ri.class).mo18576b(C3309G2.this.f42935b)));
            put(C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, new r(InterfaceC3467Ma.b.m18577a(C3196Be.class).mo18576b(C3309G2.this.f42935b)));
            put(C4632R.styleable.AppCompatTheme_textAppearanceListItem, new d(InterfaceC3467Ma.b.m18577a(C4302t2.class).mo18576b(C3309G2.this.f42935b), InterfaceC3467Ma.b.m18577a(C3535P3.class).mo18576b(C3309G2.this.f42935b), C3309G2.this.f42934a));
            put(C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary, new s(C3567Qa.m18783a(C3309G2.this.f42935b).m18804o()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$b */
    public static class b implements AbstractC3558Q1.a {

        /* renamed from: a */
        private final C3391J9 f42938a;

        public b(@NonNull C3391J9 c3391j9) {
            this.f42938a = c3391j9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            this.f42938a.m18396e();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$c */
    public static class c implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final C3566Q9 f42939a;

        public c(@NonNull C3566Q9 c3566q9) {
            this.f42939a = c3566q9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            C3599Ri c3599Ri = (C3599Ri) this.f42939a.m18782b();
            this.f42939a.m18781a(c3599Ri.m18991a(c3599Ri.f43918s).m19041h(c3599Ri.f43916q).m19022a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$d */
    public static class d implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final C3566Q9 f42940a;

        /* renamed from: b */
        @NonNull
        private final C3566Q9 f42941b;

        /* renamed from: c */
        @NonNull
        private final C3366I9 f42942c;

        public d(@NonNull C3566Q9 c3566q9, @NonNull C3566Q9 c3566q92, @NonNull C3366I9 c3366i9) {
            this.f42940a = c3566q9;
            this.f42941b = c3566q92;
            this.f42942c = c3366i9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            C4302t2 c4302t2 = (C4302t2) this.f42940a.m18782b();
            this.f42940a.m18780a();
            if (c4302t2.f46486b) {
                if (!C3658U2.m19218b(c4302t2.f46485a)) {
                    C3535P3.a aVar = new C3535P3.a(c4302t2.f46485a, EnumC3257E0.SATELLITE);
                    this.f42941b.m18781a(new C3535P3(aVar, Collections.singletonList(aVar)));
                }
                this.f42942c.m18296g();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$e */
    public static class e implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final C3346He f42943a;

        /* renamed from: b */
        @NonNull
        private final C3566Q9 f42944b;

        /* renamed from: c */
        @NonNull
        private final C3566Q9 f42945c;

        public e(@NonNull Context context, @NonNull C3566Q9 c3566q9, @NonNull C3566Q9 c3566q92) {
            this(c3566q9, c3566q92, new C3346He(context));
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            C3446Le invoke;
            C3446Le c3446Le = (C3446Le) this.f42944b.m18782b();
            ArrayList arrayList = new ArrayList();
            EnumC3257E0 enumC3257E0 = c3446Le.f43335e;
            if (enumC3257E0 != EnumC3257E0.UNDEFINED) {
                arrayList.add(new C3196Be.a(c3446Le.f43331a, c3446Le.f43332b, enumC3257E0));
            }
            if (c3446Le.f43335e == EnumC3257E0.RETAIL && (invoke = this.f42943a.invoke()) != null) {
                arrayList.add(new C3196Be.a(invoke.f43331a, invoke.f43332b, invoke.f43335e));
            }
            this.f42945c.m18781a(new C3196Be(c3446Le, arrayList));
            this.f42944b.m18780a();
        }

        @VisibleForTesting
        public e(@NonNull C3566Q9 c3566q9, @NonNull C3566Q9 c3566q92, @NonNull C3346He c3346He) {
            this.f42944b = c3566q9;
            this.f42945c = c3566q92;
            this.f42943a = c3346He;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$f */
    public static class f implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final C3566Q9 f42946a;

        /* renamed from: b */
        @NonNull
        private final C3566Q9 f42947b;

        /* renamed from: c */
        @NonNull
        private final C3432L0 f42948c;

        public f(@NonNull C3566Q9 c3566q9, @NonNull C3566Q9 c3566q92) {
            this(c3566q9, c3566q92, new C3432L0());
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(@NonNull Context context) {
            JSONObject jSONObject;
            String str;
            C3215C8 m18800h = C3567Qa.m18783a(context).m18800h();
            List<C4028ie> m17927b = m18800h.m17927b();
            if (m17927b != null) {
                this.f42946a.m18781a(m17927b);
                m18800h.m17926a();
            }
            C3599Ri c3599Ri = (C3599Ri) this.f42947b.m18782b();
            C3599Ri.b m18991a = c3599Ri.m18991a(c3599Ri.f43918s);
            String str2 = null;
            try {
                jSONObject = new JSONObject(C3681V0.m19260a(this.f42948c.m18472b(context.getFilesDir(), "credentials.dat")));
            } catch (Throwable unused) {
                jSONObject = null;
            }
            if (jSONObject == null && C3658U2.m19211a(21)) {
                try {
                    jSONObject = new JSONObject(C3681V0.m19260a(this.f42948c.m18472b(context.getNoBackupFilesDir(), "credentials.dat")));
                } catch (Throwable unused2) {
                }
            }
            if (jSONObject != null) {
                str2 = jSONObject.optString("device_id", null);
                str = jSONObject.optString("device_id_hash", null);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                m18991a.m19030c(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                m18991a.m19035e(str);
            }
            m18991a.m19027b(true);
            this.f42947b.m18781a(m18991a.m19022a());
            context.getSharedPreferences("com.yandex.metrica.configuration", 0).edit().clear().apply();
        }

        @VisibleForTesting
        public f(@NonNull C3566Q9 c3566q9, @NonNull C3566Q9 c3566q92, @NonNull C3432L0 c3432l0) {
            this.f42946a = c3566q9;
            this.f42947b = c3566q92;
            this.f42948c = c3432l0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$g */
    public static class g implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private C3566Q9 f42949a;

        /* renamed from: b */
        @NonNull
        private C3391J9 f42950b;

        public g(@NonNull C3566Q9 c3566q9, @NonNull C3391J9 c3391j9) {
            this.f42949a = c3566q9;
            this.f42950b = c3391j9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            this.f42949a.m18781a(this.f42950b.m18397f());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$h */
    public static class h implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final C3566Q9 f42951a;

        /* renamed from: b */
        @NonNull
        private final C3566Q9 f42952b;

        public h(@NonNull C3566Q9 c3566q9, @NonNull C3566Q9 c3566q92) {
            this.f42951a = c3566q9;
            this.f42952b = c3566q92;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            this.f42952b.m18781a(new C3820ae(new ArrayList((Collection) this.f42951a.m18782b()), null, new ArrayList()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$i */
    public static class i implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final C3566Q9 f42953a;

        public i(@NonNull C3566Q9 c3566q9) {
            this.f42953a = c3566q9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            C3566Q9 c3566q9 = this.f42953a;
            C3599Ri c3599Ri = (C3599Ri) c3566q9.m18782b();
            c3566q9.m18781a(c3599Ri.m18991a(c3599Ri.f43918s).m19027b(true).m19022a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$j */
    public static class j implements AbstractC3558Q1.a {

        /* renamed from: a */
        private C4392we f42954a;

        /* renamed from: b */
        private C3391J9 f42955b;

        public j(@NonNull Context context) {
            this.f42954a = new C4392we(context);
            this.f42955b = new C3391J9(C3567Qa.m18783a(context).m18805p(), context.getPackageName());
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            String m21100b = this.f42954a.m21100b((String) null);
            if (TextUtils.isEmpty(m21100b)) {
                return;
            }
            this.f42955b.m18400h(m21100b).m18227c();
            C4392we.m21098b(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$k */
    public static class k implements AbstractC3558Q1.a {
        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            C4314te c4314te = new C4314te(context, context.getPackageName());
            SharedPreferences m20029a = C4013i.m20029a(context, "_boundentrypreferences");
            C4444ye c4444ye = C4314te.f46522H;
            String string = m20029a.getString(c4444ye.m21203b(), null);
            C4444ye c4444ye2 = C4314te.f46523I;
            long j2 = m20029a.getLong(c4444ye2.m21203b(), -1L);
            if (string == null || j2 == -1) {
                return;
            }
            c4314te.m20818a(new C3156A.a(string, j2)).m20659b();
            m20029a.edit().remove(c4444ye.m21203b()).remove(c4444ye2.m21203b()).apply();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$l */
    public static class l implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final C3366I9 f42956a;

        public l(@NonNull C3366I9 c3366i9) {
            this.f42956a = c3366i9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            C3366I9 c3366i9 = this.f42956a;
            C4418xe c4418xe = new C4418xe(context, null);
            if (c4418xe.m21147f()) {
                c3366i9.m18291d(true);
                c4418xe.m21148g();
            }
            C3366I9 c3366i92 = this.f42956a;
            C4366ve c4366ve = new C4366ve(context, context.getPackageName());
            long m20940a = c4366ve.m20940a(0);
            if (m20940a != 0) {
                c3366i92.m18306l(m20940a);
            }
            c4366ve.m20941f();
            new C4314te(context, new C4226q4(context.getPackageName(), null).m19669b()).m20832i().m20659b();
            this.f42956a.m18227c();
            C4184oe c4184oe = new C4184oe(context);
            c4184oe.m20510a();
            c4184oe.m20511b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$m */
    public static class m implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final C3366I9 f42957a;

        public m(@NonNull C3366I9 c3366i9) {
            this.f42957a = c3366i9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            boolean z = new C3391J9(C3567Qa.m18783a(context).m18806q(), context.getPackageName()).m18397f().f43922w > 0;
            boolean z2 = this.f42957a.m18282b(-1) > 0;
            if (z || z2) {
                this.f42957a.m18289c(false).m18227c();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$n */
    public static class n implements AbstractC3558Q1.a {
        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            C3391J9 c3391j9 = new C3391J9(C3567Qa.m18783a(context).m18806q(), context.getPackageName());
            String m18399g = c3391j9.m18399g(null);
            if (m18399g != null) {
                c3391j9.m18395b(Collections.singletonList(m18399g));
            }
            String m18398f = c3391j9.m18398f(null);
            if (m18398f != null) {
                c3391j9.m18392a(Collections.singletonList(m18398f));
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$o */
    public static class o implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final C3432L0 f42958a;

        /* renamed from: com.yandex.metrica.impl.ob.G2$o$a */
        public static class a implements FilenameFilter {

            /* renamed from: a */
            public final Iterable<FilenameFilter> f42959a;

            public a(Iterable<FilenameFilter> iterable) {
                this.f42959a = iterable;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                Iterator<FilenameFilter> it = this.f42959a.iterator();
                while (it.hasNext()) {
                    if (it.next().accept(file, str)) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.G2$o$b */
        public static class b implements FilenameFilter {

            /* renamed from: a */
            private final FilenameFilter f42960a;

            public b(FilenameFilter filenameFilter) {
                this.f42960a = filenameFilter;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                if (!str.startsWith("db_metrica_")) {
                    return false;
                }
                try {
                    FilenameFilter filenameFilter = this.f42960a;
                    if (str.endsWith("-journal")) {
                        str = str.replace("-journal", "");
                    }
                    return filenameFilter.accept(file, str);
                } catch (Throwable unused) {
                    return false;
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.G2$o$c */
        public static class c implements FilenameFilter {
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith("null");
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.G2$o$d */
        public static class d implements FilenameFilter {

            /* renamed from: a */
            private final String f42961a;

            public d(@NonNull String str) {
                this.f42961a = str;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return !str.contains(this.f42961a);
            }
        }

        public o() {
            this(new C3432L0());
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            for (File file : m18125b(context) == null ? new File[0] : m18125b(context).listFiles(new a(Arrays.asList(new b(new d(context.getPackageName())), new b(new c()))))) {
                try {
                    if (!file.delete()) {
                        ((C3499Nh) C3524Oh.m18679a()).reportEvent("Can not delete file", new JSONObject().put("fileName", file.getName()).toString());
                    }
                } catch (Throwable th) {
                    ((C3499Nh) C3524Oh.m18679a()).reportError("Can not delete file", th);
                }
            }
            new C3391J9(C3567Qa.m18783a(context).m18806q(), context.getPackageName()).m18230e(new C4444ye("LAST_STARTUP_CLIDS_SAVE_TIME", null).m21201a()).m18227c();
        }

        @Nullable
        @VisibleForTesting
        /* renamed from: b */
        public File m18125b(@NonNull Context context) {
            if (C3658U2.m19211a(21)) {
                return context.getNoBackupFilesDir();
            }
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                return this.f42958a.m18472b(filesDir.getParentFile(), "databases");
            }
            return null;
        }

        @VisibleForTesting
        public o(@NonNull C3432L0 c3432l0) {
            this.f42958a = c3432l0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$r */
    public static class r implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final C3566Q9 f42972a;

        public r(@NonNull C3566Q9 c3566q9) {
            this.f42972a = c3566q9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            C3196Be c3196Be = (C3196Be) this.f42972a.m18782b();
            ArrayList arrayList = new ArrayList();
            C3196Be.a aVar = null;
            for (C3196Be.a aVar2 : c3196Be.f42624b) {
                if (aVar2.f42627c != EnumC3257E0.APP) {
                    arrayList.add(aVar2);
                } else if (aVar == null) {
                    arrayList.add(aVar2);
                    aVar = aVar2;
                }
            }
            this.f42972a.m18781a(new C3196Be(c3196Be.f42623a, arrayList));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$s */
    public static class s implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final InterfaceC4438y8 f42973a;

        public s(@NonNull InterfaceC4438y8 interfaceC4438y8) {
            this.f42973a = interfaceC4438y8;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            this.f42973a.mo18666b("notification_cache_state");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$t */
    public static class t implements AbstractC3558Q1.a {

        /* renamed from: a */
        private final C3366I9 f42974a;

        public t(@NonNull C3366I9 c3366i9) {
            this.f42974a = c3366i9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            this.f42974a.m18230e(new C4444ye("REFERRER", null).m21201a()).m18230e(new C4444ye("REFERRER_HOLDER_STATE", null).m21201a()).m18227c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$u */
    public static class u implements AbstractC3558Q1.a {
        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            C3566Q9 mo18576b = InterfaceC3467Ma.b.m18577a(C3599Ri.class).mo18576b(context);
            C3599Ri c3599Ri = (C3599Ri) mo18576b.m18782b();
            mo18576b.m18781a(c3599Ri.m18991a(c3599Ri.f43918s).m19021a(c3599Ri.f43922w > 0).m19027b(true).m19022a());
        }
    }

    @VisibleForTesting
    public C3309G2(@NonNull Context context, @NonNull C3366I9 c3366i9, @NonNull C3340H8 c3340h8) {
        this.f42935b = context;
        this.f42934a = c3366i9;
        this.f42936c = c3340h8;
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$q */
    public static class q implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final C3366I9 f42964a;

        /* renamed from: b */
        @NonNull
        private final C3566Q9 f42965b;

        /* renamed from: c */
        @NonNull
        private final C3340H8 f42966c;

        /* renamed from: d */
        @NonNull
        private final String f42967d;

        /* renamed from: e */
        @NonNull
        private final String f42968e;

        /* renamed from: f */
        @NonNull
        private final String f42969f;

        /* renamed from: g */
        @NonNull
        private final String f42970g;

        /* renamed from: h */
        @NonNull
        private final String f42971h;

        public q(@NonNull C3366I9 c3366i9, @NonNull C3566Q9 c3566q9) {
            this(c3366i9, c3566q9, C3532P0.m18696i().m18722y().m18440a());
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            C3599Ri c3599Ri = (C3599Ri) this.f42965b.m18782b();
            C4340ue c4340ue = new C4340ue(context);
            int m20885f = c4340ue.m20885f();
            if (m20885f == -1) {
                m20885f = this.f42964a.m18274a(-1);
            }
            this.f42966c.m18206a(c3599Ri.f43901b, c3599Ri.f43903d, this.f42964a.m18217a(this.f42967d, (String) null), this.f42964a.m18225b(this.f42968e) ? Boolean.valueOf(this.f42964a.m18219a(this.f42968e, false)) : null, this.f42964a.m18225b(this.f42969f) ? Long.valueOf(this.f42964a.m18216a(this.f42969f, -1L)) : null, this.f42964a.m18225b(this.f42970g) ? Long.valueOf(this.f42964a.m18216a(this.f42970g, -1L)) : null, this.f42964a.m18225b(this.f42971h) ? Long.valueOf(this.f42964a.m18216a(this.f42971h, -1L)) : null, m20885f == -1 ? null : Integer.valueOf(m20885f));
            this.f42964a.m18300i().m18230e(this.f42967d).m18230e(this.f42968e).m18230e(this.f42969f).m18230e(this.f42970g).m18230e(this.f42971h).m18227c();
            c4340ue.m20887h().m20659b();
        }

        @VisibleForTesting
        public q(@NonNull C3366I9 c3366i9, @NonNull C3566Q9 c3566q9, @NonNull C3340H8 c3340h8) {
            this.f42967d = new C4444ye("REFERRER_FROM_PLAY_SERVICES").m21201a();
            this.f42968e = new C4444ye("REFERRER_CHECKED").m21201a();
            this.f42969f = new C4444ye("L_ID").m21201a();
            this.f42970g = new C4444ye("LBS_ID").m21201a();
            this.f42971h = new C4444ye("L_REQ_NUM").m21201a();
            this.f42964a = c3366i9;
            this.f42965b = c3566q9;
            this.f42966c = c3340h8;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1
    /* renamed from: a */
    public SparseArray<AbstractC3558Q1.a> mo18122a() {
        return new a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$p */
    public static class p implements AbstractC3558Q1.a {

        /* renamed from: a */
        @NonNull
        private final C3566Q9 f42962a;

        /* renamed from: b */
        @NonNull
        private final C3276Ej f42963b;

        public p(@NonNull Context context, @NonNull C3566Q9 c3566q9) {
            this(c3566q9, C3301Fj.m18110a(context).m18112b(context, new C3401Jj(new C3575Qi.b(context))));
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            String str = this.f42963b.m18014a().f45155a;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C3599Ri c3599Ri = (C3599Ri) this.f42962a.m18782b();
            if (str.equals(c3599Ri.f43900a)) {
                return;
            }
            this.f42962a.m18781a(c3599Ri.m18991a(c3599Ri.f43918s).m19048l(str).m19022a());
        }

        @VisibleForTesting
        public p(@NonNull C3566Q9 c3566q9, @NonNull C3276Ej c3276Ej) {
            this.f42962a = c3566q9;
            this.f42963b = c3276Ej;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1
    /* renamed from: a */
    public int mo18121a(C4340ue c4340ue) {
        int m20885f = c4340ue.m20885f();
        if (m20885f == -1) {
            m20885f = this.f42934a.m18274a(-1);
        }
        return m20885f == -1 ? this.f42936c.m18211e() : m20885f;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1
    /* renamed from: a */
    public void mo18123a(C4340ue c4340ue, int i2) {
        this.f42936c.m18202a(i2);
    }
}
