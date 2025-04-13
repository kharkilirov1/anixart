package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.InterfaceC4161nh;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.T1 */
/* loaded from: classes2.dex */
public abstract class AbstractC3632T1<T extends InterfaceC4161nh> {

    /* renamed from: a */
    private String f44030a;

    /* renamed from: d */
    private byte[] f44033d;

    /* renamed from: e */
    private int f44034e;

    /* renamed from: f */
    private byte[] f44035f;

    /* renamed from: g */
    public Map<String, List<String>> f44036g;

    /* renamed from: i */
    private List<String> f44038i;

    /* renamed from: j */
    @NonNull
    public final T f44039j;

    /* renamed from: k */
    @Nullable
    private Long f44040k;

    /* renamed from: l */
    @Nullable
    private Integer f44041l;

    /* renamed from: b */
    private int f44031b = 1;

    /* renamed from: c */
    private final Map<String, List<String>> f44032c = new HashMap();

    /* renamed from: h */
    private int f44037h = -1;

    /* renamed from: m */
    @NonNull
    private b f44042m = b.EMPTY;

    /* renamed from: com.yandex.metrica.impl.ob.T1$a */
    public enum a {
        REPORT,
        LOCATION,
        STARTUP,
        DIAGNOSTIC
    }

    /* renamed from: com.yandex.metrica.impl.ob.T1$b */
    public enum b {
        EMPTY,
        PENDING,
        PREPARING,
        EXECUTING,
        SUCCESS,
        FAILED,
        SHOULD_NOT_EXECUTE,
        FINISHED,
        REMOVED
    }

    public AbstractC3632T1(@NonNull T t) {
        this.f44039j = t;
    }

    /* renamed from: A */
    public boolean mo18504A() {
        b bVar = this.f44042m;
        return (bVar == b.REMOVED || bVar == b.FINISHED || this.f44037h + 1 >= this.f44038i.size()) ? false : true;
    }

    /* renamed from: a */
    public abstract void mo18427a(@NonNull Uri.Builder builder);

    /* renamed from: a */
    public final void m19113a(@Nullable Throwable th) {
        b bVar = b.FAILED;
        if (m19109a(bVar)) {
            mo18429b(th);
            this.f44042m = bVar;
        }
    }

    @NonNull
    /* renamed from: b */
    public abstract a mo18428b();

    /* renamed from: b */
    public abstract void mo18429b(@Nullable Throwable th);

    /* renamed from: b */
    public void m19116b(byte[] bArr) {
        this.f44035f = bArr;
    }

    /* renamed from: c */
    public List<String> m19117c() {
        return this.f44038i;
    }

    @NonNull
    /* renamed from: d */
    public AbstractC3694Vd m19118d() {
        return new C3719Wd(this.f44030a);
    }

    /* renamed from: e */
    public int m19119e() {
        return this.f44031b;
    }

    /* renamed from: f */
    public Map<String, List<String>> m19120f() {
        return this.f44032c;
    }

    /* renamed from: g */
    public byte[] m19121g() {
        return this.f44033d;
    }

    /* renamed from: h */
    public int m19122h() {
        return this.f44034e;
    }

    /* renamed from: i */
    public byte[] m19123i() {
        return this.f44035f;
    }

    @Nullable
    /* renamed from: j */
    public C3225Ci mo18430j() {
        return null;
    }

    @Nullable
    /* renamed from: k */
    public Long m19124k() {
        return this.f44040k;
    }

    @Nullable
    /* renamed from: l */
    public Integer m19125l() {
        return this.f44041l;
    }

    /* renamed from: m */
    public boolean m19126m() {
        return this.f44034e == 400;
    }

    /* renamed from: n */
    public final boolean m19127n() {
        b bVar = b.PREPARING;
        if (!m19109a(bVar)) {
            return false;
        }
        this.f44042m = bVar;
        return mo18431o();
    }

    /* renamed from: o */
    public abstract boolean mo18431o();

    /* renamed from: p */
    public boolean mo19128p() {
        b bVar = b.EXECUTING;
        if (!m19109a(bVar)) {
            return false;
        }
        this.f44042m = bVar;
        int i2 = this.f44037h + 1;
        this.f44037h = i2;
        Uri.Builder buildUpon = Uri.parse(this.f44038i.get(i2)).buildUpon();
        mo18427a(buildUpon);
        this.f44030a = buildUpon.build().toString();
        return true;
    }

    /* renamed from: q */
    public final boolean m19129q() {
        b bVar = b.SUCCESS;
        b bVar2 = b.FAILED;
        if (!m19109a(bVar, bVar2)) {
            return false;
        }
        boolean mo18432r = mo18432r();
        if (mo18432r) {
            this.f44042m = bVar;
        } else {
            this.f44042m = bVar2;
        }
        return mo18432r;
    }

    /* renamed from: r */
    public abstract boolean mo18432r();

    /* renamed from: s */
    public void mo18433s() {
        b bVar = b.SHOULD_NOT_EXECUTE;
        if (m19109a(bVar)) {
            this.f44042m = bVar;
        }
    }

    /* renamed from: t */
    public abstract void mo18434t();

    /* renamed from: u */
    public final boolean m19130u() {
        b bVar = b.PENDING;
        if (!m19109a(bVar)) {
            return false;
        }
        boolean mo19131v = mo19131v();
        this.f44042m = bVar;
        return mo19131v;
    }

    /* renamed from: v */
    public boolean mo19131v() {
        return true;
    }

    /* renamed from: w */
    public void mo19132w() {
        b bVar = b.FINISHED;
        if (m19109a(bVar)) {
            b bVar2 = this.f44042m;
            if (bVar2 == b.SUCCESS) {
                mo18434t();
            } else if (bVar2 == b.FAILED || bVar2 == b.SHOULD_NOT_EXECUTE) {
                mo18435y();
            }
            this.f44042m = bVar;
        }
    }

    /* renamed from: x */
    public void mo19133x() {
        b bVar = b.REMOVED;
        if (m19109a(bVar)) {
            this.f44042m = bVar;
        }
    }

    /* renamed from: y */
    public void mo18435y() {
    }

    /* renamed from: z */
    public boolean mo18436z() {
        return false;
    }

    /* renamed from: a */
    public void mo19115a(byte[] bArr) {
        this.f44031b = 2;
        this.f44033d = bArr;
    }

    /* renamed from: a */
    public void m19110a(int i2) {
        this.f44034e = i2;
    }

    @NonNull
    /* renamed from: a */
    public String mo18426a() {
        return getClass().getName();
    }

    /* renamed from: a */
    public void m19114a(List<String> list) {
        this.f44038i = list;
    }

    /* renamed from: a */
    public void m19112a(@NonNull String str, @NonNull String... strArr) {
        this.f44032c.put(str, Arrays.asList(strArr));
    }

    /* renamed from: a */
    public void m19111a(long j2) {
        this.f44040k = Long.valueOf(j2);
        this.f44041l = Integer.valueOf(C4013i.m20026a(TimeUnit.MILLISECONDS.toSeconds(j2)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private boolean m19109a(@NonNull b... bVarArr) {
        Boolean bool;
        Boolean bool2 = Boolean.TRUE;
        b bVar = this.f44042m;
        int length = bVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                switch (bVarArr[i2]) {
                    case EMPTY:
                        bool = null;
                        break;
                    case PENDING:
                        bool = Boolean.valueOf(bVar == b.EMPTY);
                        break;
                    case PREPARING:
                    case SHOULD_NOT_EXECUTE:
                        if (bVar == b.PENDING) {
                            bool = Boolean.TRUE;
                            break;
                        } else {
                            if (bVar == b.REMOVED) {
                                bool = Boolean.FALSE;
                                break;
                            }
                            bool = null;
                            break;
                        }
                    case EXECUTING:
                        if (bVar != b.PREPARING && bVar != b.SUCCESS && bVar != b.FAILED) {
                            if (bVar == b.REMOVED) {
                                bool = Boolean.FALSE;
                                break;
                            }
                            bool = null;
                            break;
                        } else {
                            bool = Boolean.TRUE;
                            break;
                        }
                        break;
                    case SUCCESS:
                    case FAILED:
                        if (bVar == b.EXECUTING) {
                            bool = Boolean.TRUE;
                            break;
                        } else {
                            if (bVar == b.REMOVED) {
                                bool = Boolean.FALSE;
                                break;
                            }
                            bool = null;
                            break;
                        }
                    case FINISHED:
                        if (bVar != b.SUCCESS && bVar != b.FAILED && bVar != b.SHOULD_NOT_EXECUTE && bVar != b.PENDING && bVar != b.PREPARING && bVar != b.EXECUTING) {
                            if (bVar == b.REMOVED) {
                                bool = Boolean.FALSE;
                                break;
                            }
                            bool = null;
                            break;
                        } else {
                            bool = Boolean.TRUE;
                            break;
                        }
                        break;
                    case REMOVED:
                        if (bVar != b.EMPTY) {
                            bool = Boolean.valueOf(bVar != b.REMOVED);
                            break;
                        }
                        bool = null;
                        break;
                    default:
                        bool = Boolean.FALSE;
                        break;
                }
                if (true ^ Boolean.TRUE.equals(bool)) {
                    bool2 = bool;
                } else {
                    i2++;
                }
            }
        }
        Boolean bool3 = Boolean.TRUE;
        bool3.equals(bool2);
        return bool3.equals(bool2);
    }
}
