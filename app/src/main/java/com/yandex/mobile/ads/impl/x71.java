package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.yandex.mobile.ads.impl.vl1;
import com.yandex.mobile.ads.impl.zl1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class x71 implements vl1.InterfaceC5926a {

    /* renamed from: h */
    private static x71 f56390h = new x71();

    /* renamed from: i */
    private static Handler f56391i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    private static Handler f56392j = null;

    /* renamed from: k */
    private static final Runnable f56393k = new RunnableC6012b();

    /* renamed from: l */
    private static final Runnable f56394l = new RunnableC6013c();

    /* renamed from: b */
    private int f56396b;

    /* renamed from: g */
    private long f56401g;

    /* renamed from: a */
    private ArrayList f56395a = new ArrayList();

    /* renamed from: c */
    private final ArrayList f56397c = new ArrayList();

    /* renamed from: e */
    private zl1 f56399e = new zl1();

    /* renamed from: d */
    private fm1 f56398d = new fm1();

    /* renamed from: f */
    private im1 f56400f = new im1(new om1());

    /* renamed from: com.yandex.mobile.ads.impl.x71$a */
    public class RunnableC6011a implements Runnable {
        public RunnableC6011a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x71.this.f56400f.m25568a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x71$b */
    public static class RunnableC6012b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            x71.m29689b(x71.m29694g());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x71$c */
    public static class RunnableC6013c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (x71.f56392j != null) {
                x71.f56392j.post(x71.f56393k);
                x71.f56392j.postDelayed(x71.f56394l, 200L);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x71$d */
    public interface InterfaceC6014d extends InterfaceC6015e {
        /* renamed from: a */
        void m29697a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.x71$e */
    public interface InterfaceC6015e {
        /* renamed from: b */
        void m29698b();
    }

    /* renamed from: b */
    public static void m29689b(x71 x71Var) {
        x71Var.f56396b = 0;
        x71Var.f56397c.clear();
        Iterator<tl1> it = ul1.m29042a().m29046c().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
        x71Var.f56401g = System.nanoTime();
        x71Var.f56399e.m30223c();
        long nanoTime = System.nanoTime();
        mm1 m24638a = x71Var.f56398d.m24638a();
        if (x71Var.f56399e.m30221b().size() > 0) {
            Iterator<String> it2 = x71Var.f56399e.m30221b().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                JSONObject mo26692a = m24638a.mo26692a(null);
                View m30219b = x71Var.f56399e.m30219b(next);
                rm1 m24639b = x71Var.f56398d.m24639b();
                String m30217a = x71Var.f56399e.m30217a(next);
                if (m30217a != null) {
                    JSONObject mo26692a2 = m24639b.mo26692a(m30219b);
                    try {
                        mo26692a2.put("adSessionId", next);
                    } catch (JSONException e2) {
                        nm1.m26926a("Error with setting ad session id", e2);
                    }
                    try {
                        mo26692a2.put("notVisibleReason", m30217a);
                    } catch (JSONException e3) {
                        nm1.m26926a("Error with setting not visible reason", e3);
                    }
                    try {
                        JSONArray optJSONArray = mo26692a.optJSONArray("childViews");
                        if (optJSONArray == null) {
                            optJSONArray = new JSONArray();
                            mo26692a.put("childViews", optJSONArray);
                        }
                        optJSONArray.put(mo26692a2);
                    } catch (JSONException unused) {
                    }
                }
                gm1.m24945a(mo26692a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                x71Var.f56400f.m25572b(mo26692a, hashSet, nanoTime);
            }
        }
        if (x71Var.f56399e.m30218a().size() > 0) {
            JSONObject mo26692a3 = m24638a.mo26692a(null);
            m24638a.mo26693a(null, mo26692a3, x71Var, true, false);
            gm1.m24945a(mo26692a3);
            x71Var.f56400f.m25570a(mo26692a3, x71Var.f56399e.m30218a(), nanoTime);
        } else {
            x71Var.f56400f.m25568a();
        }
        x71Var.f56399e.m30224d();
        long nanoTime2 = System.nanoTime() - x71Var.f56401g;
        if (x71Var.f56395a.size() > 0) {
            Iterator it3 = x71Var.f56395a.iterator();
            while (it3.hasNext()) {
                InterfaceC6015e interfaceC6015e = (InterfaceC6015e) it3.next();
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                interfaceC6015e.m29698b();
                if (interfaceC6015e instanceof InterfaceC6014d) {
                    ((InterfaceC6014d) interfaceC6015e).m29697a();
                }
            }
        }
    }

    /* renamed from: c */
    public static void m29690c() {
        Handler handler = f56392j;
        if (handler != null) {
            handler.removeCallbacks(f56394l);
            f56392j = null;
        }
    }

    /* renamed from: g */
    public static x71 m29694g() {
        return f56390h;
    }

    /* renamed from: a */
    public final void m29695a(View view, vl1 vl1Var, JSONObject jSONObject, boolean z) {
        int m30222c;
        boolean z2;
        boolean z3;
        if ((an1.m22557c(view) == null) && (m30222c = this.f56399e.m30222c(view)) != 3) {
            JSONObject mo26692a = vl1Var.mo26692a(view);
            int i2 = gm1.f50677d;
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    jSONObject.put("childViews", optJSONArray);
                }
                optJSONArray.put(mo26692a);
            } catch (JSONException unused) {
            }
            Object m30216a = this.f56399e.m30216a(view);
            if (m30216a != null) {
                try {
                    mo26692a.put("adSessionId", m30216a);
                } catch (JSONException e2) {
                    nm1.m26926a("Error with setting ad session id", e2);
                }
                try {
                    mo26692a.put("hasWindowFocus", Boolean.valueOf(this.f56399e.m30225d(view)));
                } catch (JSONException e3) {
                    nm1.m26926a("Error with setting not visible reason", e3);
                }
                this.f56399e.m30226e();
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                zl1.C6129a m30220b = this.f56399e.m30220b(view);
                if (m30220b != null) {
                    int i3 = gm1.f50677d;
                    lm1 m30227a = m30220b.m30227a();
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = m30220b.m30229b().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    try {
                        mo26692a.put("isFriendlyObstructionFor", jSONArray);
                        mo26692a.put("friendlyObstructionClass", m30227a.m26500b());
                        mo26692a.put("friendlyObstructionPurpose", m30227a.m26501c());
                        mo26692a.put("friendlyObstructionReason", m30227a.m26502d());
                    } catch (JSONException e4) {
                        nm1.m26926a("Error with setting friendly obstruction", e4);
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                vl1Var.mo26693a(view, mo26692a, this, m30222c == 1, z || z3);
            }
            this.f56396b++;
        }
    }

    /* renamed from: b */
    public final void m29696b() {
        m29690c();
        this.f56395a.clear();
        f56391i.post(new RunnableC6011a());
    }

    /* renamed from: a */
    public static void m29688a() {
        if (f56392j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f56392j = handler;
            handler.post(f56393k);
            f56392j.postDelayed(f56394l, 200L);
        }
    }
}
