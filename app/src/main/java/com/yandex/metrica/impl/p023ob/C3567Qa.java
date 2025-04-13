package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.Qa */
/* loaded from: classes2.dex */
public class C3567Qa {

    /* renamed from: x */
    @SuppressLint
    private static volatile C3567Qa f43670x;

    /* renamed from: a */
    private final Map<String, C4386w8> f43671a = new HashMap();

    /* renamed from: b */
    private final Map<String, InterfaceC4464z8> f43672b = new HashMap();

    /* renamed from: c */
    private final Map<String, InterfaceC4438y8> f43673c = new HashMap();

    /* renamed from: d */
    @NonNull
    private final C4334u8 f43674d;

    /* renamed from: e */
    private final Context f43675e;

    /* renamed from: f */
    @Nullable
    private C4386w8 f43676f;

    /* renamed from: g */
    @Nullable
    private C4386w8 f43677g;

    /* renamed from: h */
    @Nullable
    private InterfaceC4438y8 f43678h;

    /* renamed from: i */
    @Nullable
    private InterfaceC4438y8 f43679i;

    /* renamed from: j */
    @Nullable
    private InterfaceC4438y8 f43680j;

    /* renamed from: k */
    @Nullable
    private InterfaceC4438y8 f43681k;

    /* renamed from: l */
    @Nullable
    private InterfaceC4464z8 f43682l;

    /* renamed from: m */
    @Nullable
    private InterfaceC4464z8 f43683m;

    /* renamed from: n */
    @Nullable
    private InterfaceC4464z8 f43684n;

    /* renamed from: o */
    @Nullable
    private InterfaceC4464z8 f43685o;

    /* renamed from: p */
    @Nullable
    private InterfaceC4464z8 f43686p;

    /* renamed from: q */
    @Nullable
    private InterfaceC4464z8 f43687q;

    /* renamed from: r */
    @Nullable
    private C3190B8 f43688r;

    /* renamed from: s */
    @Nullable
    private C3165A8 f43689s;

    /* renamed from: t */
    @Nullable
    private C3215C8 f43690t;

    /* renamed from: u */
    @Nullable
    private InterfaceC4464z8 f43691u;

    /* renamed from: v */
    @Nullable
    private C3465M8 f43692v;

    /* renamed from: w */
    @NonNull
    private final C3432L0 f43693w;

    public C3567Qa(Context context, @NonNull C4334u8 c4334u8, @NonNull C3432L0 c3432l0) {
        this.f43675e = context;
        this.f43674d = c4334u8;
        this.f43693w = c3432l0;
    }

    /* renamed from: a */
    public static C3567Qa m18783a(Context context) {
        if (f43670x == null) {
            synchronized (C3567Qa.class) {
                if (f43670x == null) {
                    f43670x = new C3567Qa(context.getApplicationContext(), C3515O8.m18663a(), new C3432L0());
                }
            }
        }
        return f43670x;
    }

    /* renamed from: k */
    private InterfaceC4438y8 m18786k() {
        C4386w8 c4386w8;
        if (this.f43680j == null) {
            synchronized (this) {
                if (this.f43677g == null) {
                    this.f43677g = m18789a("metrica_aip.db", this.f43674d.m20870a());
                }
                c4386w8 = this.f43677g;
            }
            this.f43680j = new C3517Oa(new C3490N8(c4386w8), "binary_data");
        }
        return this.f43680j;
    }

    /* renamed from: l */
    private InterfaceC4464z8 m18787l() {
        C3465M8 c3465m8;
        if (this.f43686p == null) {
            synchronized (this) {
                if (this.f43692v == null) {
                    String m18784a = m18784a("metrica_client_data.db");
                    Context context = this.f43675e;
                    this.f43692v = new C3465M8(context, m18784a, new C3855bn(context, "metrica_client_data.db"), this.f43674d.m20871b());
                }
                c3465m8 = this.f43692v;
            }
            this.f43686p = new C3591Ra("preferences", c3465m8);
        }
        return this.f43686p;
    }

    /* renamed from: m */
    private InterfaceC4438y8 m18788m() {
        if (this.f43678h == null) {
            this.f43678h = new C3517Oa(new C3490N8(m18807r()), "binary_data");
        }
        return this.f43678h;
    }

    /* renamed from: b */
    public synchronized InterfaceC4464z8 m18793b(C3862c4 c3862c4) {
        InterfaceC4464z8 interfaceC4464z8;
        String c3862c42 = c3862c4.toString();
        interfaceC4464z8 = this.f43672b.get(c3862c42);
        if (interfaceC4464z8 == null) {
            interfaceC4464z8 = new C3591Ra(m18794c(c3862c4), "preferences");
            this.f43672b.put(c3862c42, interfaceC4464z8);
        }
        return interfaceC4464z8;
    }

    /* renamed from: c */
    public synchronized InterfaceC4464z8 m18795c() {
        if (this.f43687q == null) {
            this.f43687q = new C3616Sa(this.f43675e, EnumC3240D8.CLIENT, m18787l());
        }
        return this.f43687q;
    }

    /* renamed from: d */
    public synchronized InterfaceC4464z8 m18796d() {
        return m18787l();
    }

    /* renamed from: e */
    public synchronized C3165A8 m18797e() {
        if (this.f43689s == null) {
            this.f43689s = new C3165A8(m18807r());
        }
        return this.f43689s;
    }

    /* renamed from: f */
    public synchronized C3190B8 m18798f() {
        if (this.f43688r == null) {
            this.f43688r = new C3190B8(m18807r());
        }
        return this.f43688r;
    }

    /* renamed from: g */
    public synchronized InterfaceC4464z8 m18799g() {
        if (this.f43691u == null) {
            String m18784a = m18784a("metrica_multiprocess_data.db");
            Context context = this.f43675e;
            this.f43691u = new C3591Ra("preferences", new C3465M8(context, m18784a, new C3855bn(context, "metrica_multiprocess_data.db"), this.f43674d.m20873d()));
        }
        return this.f43691u;
    }

    /* renamed from: h */
    public synchronized C3215C8 m18800h() {
        if (this.f43690t == null) {
            this.f43690t = new C3215C8(m18807r(), "permissions");
        }
        return this.f43690t;
    }

    /* renamed from: i */
    public synchronized InterfaceC4464z8 m18801i() {
        if (this.f43683m == null) {
            Context context = this.f43675e;
            EnumC3240D8 enumC3240D8 = EnumC3240D8.SERVICE;
            if (this.f43682l == null) {
                this.f43682l = new C3591Ra(m18807r(), "preferences");
            }
            this.f43683m = new C3616Sa(context, enumC3240D8, this.f43682l);
        }
        return this.f43683m;
    }

    /* renamed from: j */
    public synchronized InterfaceC4464z8 m18802j() {
        if (this.f43682l == null) {
            this.f43682l = new C3591Ra(m18807r(), "preferences");
        }
        return this.f43682l;
    }

    /* renamed from: n */
    public synchronized InterfaceC4438y8 m18803n() {
        if (this.f43679i == null) {
            this.f43679i = new C3542Pa(this.f43675e, EnumC3240D8.SERVICE, m18788m());
        }
        return this.f43679i;
    }

    /* renamed from: o */
    public synchronized InterfaceC4438y8 m18804o() {
        return m18788m();
    }

    /* renamed from: p */
    public synchronized InterfaceC4464z8 m18805p() {
        if (this.f43685o == null) {
            Context context = this.f43675e;
            EnumC3240D8 enumC3240D8 = EnumC3240D8.SERVICE;
            if (this.f43684n == null) {
                this.f43684n = new C3591Ra(m18807r(), "startup");
            }
            this.f43685o = new C3616Sa(context, enumC3240D8, this.f43684n);
        }
        return this.f43685o;
    }

    /* renamed from: q */
    public synchronized InterfaceC4464z8 m18806q() {
        if (this.f43684n == null) {
            this.f43684n = new C3591Ra(m18807r(), "startup");
        }
        return this.f43684n;
    }

    /* renamed from: r */
    public synchronized C4386w8 m18807r() {
        if (this.f43676f == null) {
            this.f43676f = m18789a("metrica_data.db", this.f43674d.m20874e());
        }
        return this.f43676f;
    }

    /* renamed from: c */
    public synchronized C4386w8 m18794c(C3862c4 c3862c4) {
        C4386w8 c4386w8;
        String str = "db_metrica_" + c3862c4;
        c4386w8 = this.f43671a.get(str);
        if (c4386w8 == null) {
            c4386w8 = m18789a(str, this.f43674d.m20872c());
            this.f43671a.put(str, c4386w8);
        }
        return c4386w8;
    }

    /* renamed from: b */
    public synchronized InterfaceC4438y8 m18792b() {
        return m18786k();
    }

    @NonNull
    /* renamed from: a */
    public synchronized InterfaceC4438y8 m18791a(@NonNull C3862c4 c3862c4) {
        InterfaceC4438y8 interfaceC4438y8;
        String c3862c42 = c3862c4.toString();
        interfaceC4438y8 = this.f43673c.get(c3862c42);
        if (interfaceC4438y8 == null) {
            interfaceC4438y8 = new C3517Oa(new C3490N8(m18794c(c3862c4)), "binary_data");
            this.f43673c.put(c3862c42, interfaceC4438y8);
        }
        return interfaceC4438y8;
    }

    /* renamed from: a */
    public synchronized InterfaceC4438y8 m18790a() {
        if (this.f43681k == null) {
            this.f43681k = new C3542Pa(this.f43675e, EnumC3240D8.AUTO_INAPP, m18786k());
        }
        return this.f43681k;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public C4386w8 m18789a(@NonNull String str, C3265E8 c3265e8) {
        return new C4386w8(this.f43675e, m18784a(str), c3265e8);
    }

    /* renamed from: a */
    private String m18784a(@NonNull String str) {
        if (!C3658U2.m19211a(21)) {
            return str;
        }
        try {
            File noBackupFilesDir = this.f43675e.getNoBackupFilesDir();
            if (noBackupFilesDir == null) {
                return str;
            }
            Objects.requireNonNull(this.f43693w);
            File file = new File(noBackupFilesDir, str);
            if (!file.exists() && m18785a(noBackupFilesDir, str)) {
                m18785a(noBackupFilesDir, str + "-journal");
                m18785a(noBackupFilesDir, str + "-shm");
                m18785a(noBackupFilesDir, str + "-wal");
            }
            return file.getAbsolutePath();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    private boolean m18785a(@NonNull File file, @NonNull String str) {
        File databasePath = this.f43675e.getDatabasePath(str);
        if (databasePath == null || !databasePath.exists()) {
            return false;
        }
        Objects.requireNonNull(this.f43693w);
        return databasePath.renameTo(new File(file, str));
    }
}
