package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.oe */
/* loaded from: classes2.dex */
public class C4184oe {

    /* renamed from: a */
    private Context f46070a;

    public C4184oe(Context context) {
        this.f46070a = context;
    }

    /* renamed from: a */
    public void m20510a() {
        SharedPreferences m20029a = C4013i.m20029a(this.f46070a, "_bidoptpreferences");
        if (m20029a.getAll().size() > 0) {
            C4444ye c4444ye = C4392we.f46873p;
            String string = m20029a.getString(c4444ye.m21203b(), null);
            C4392we c4392we = new C4392we(this.f46070a, null);
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(c4392we.m21100b((String) null))) {
                c4392we.m21108i(string).m20659b();
                m20029a.edit().remove(c4444ye.m21203b()).apply();
            }
            Map<String, ?> all = m20029a.getAll();
            if (all.size() > 0) {
                Iterator it = ((ArrayList) m20508a(all, C4392we.f46874q.m21203b())).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String string2 = m20029a.getString(new C4444ye(C4392we.f46874q.m21203b(), str).m21201a(), null);
                    C4392we c4392we2 = new C4392we(this.f46070a, str);
                    if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(c4392we2.m21107h(null))) {
                        c4392we2.m21109j(string2).m20659b();
                    }
                }
            }
            m20029a.edit().clear().apply();
        }
    }

    /* renamed from: b */
    public void m20511b() {
        InterfaceC4464z8 m18805p = C3567Qa.m18783a(this.f46070a).m18805p();
        SharedPreferences m20029a = C4013i.m20029a(this.f46070a, "_startupserviceinfopreferences");
        C3391J9 c3391j9 = new C3391J9(m18805p, null);
        C4444ye c4444ye = C4392we.f46873p;
        String string = m20029a.getString(c4444ye.m21203b(), null);
        if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(c3391j9.m18397f().f43901b)) {
            c3391j9.m18400h(string).m18227c();
            m20029a.edit().remove(c4444ye.m21203b()).apply();
        }
        C3391J9 c3391j92 = new C3391J9(m18805p, this.f46070a.getPackageName());
        boolean z = m20029a.getBoolean(C4392we.f46882y.m21203b(), false);
        if (z) {
            c3391j92.m18393a(z).m18227c();
        }
        m20509a(m18805p, this.f46070a.getPackageName());
        Iterator it = ((ArrayList) m20508a(m20029a.getAll(), C4392we.f46874q.m21203b())).iterator();
        while (it.hasNext()) {
            m20509a(m18805p, (String) it.next());
        }
    }

    /* renamed from: a */
    private List<String> m20508a(Map<String, ?> map, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : map.keySet()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2.replace(str, ""));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m20509a(InterfaceC4464z8 interfaceC4464z8, String str) {
        C3391J9 c3391j9 = new C3391J9(interfaceC4464z8, str);
        C4392we c4392we = new C4392we(this.f46070a, str);
        String m21107h = c4392we.m21107h(null);
        if (!TextUtils.isEmpty(m21107h)) {
            c3391j9.m18406n(m21107h);
        }
        String m21101c = c4392we.m21101c(null);
        if (!TextUtils.isEmpty(m21101c)) {
            c3391j9.m18401i(m21101c);
        }
        String m21102d = c4392we.m21102d(null);
        if (!TextUtils.isEmpty(m21102d)) {
            c3391j9.m18402j(m21102d);
        }
        String m21104f = c4392we.m21104f(null);
        if (!TextUtils.isEmpty(m21104f)) {
            c3391j9.m18404l(m21104f);
        }
        String m21103e = c4392we.m21103e(null);
        if (!TextUtils.isEmpty(m21103e)) {
            c3391j9.m18403k(m21103e);
        }
        long m21099a = c4392we.m21099a(-1L);
        if (m21099a != -1) {
            c3391j9.m18394b(m21099a);
        }
        String m21106g = c4392we.m21106g(null);
        if (!TextUtils.isEmpty(m21106g)) {
            c3391j9.m18405m(m21106g);
        }
        c3391j9.m18227c();
        c4392we.m21105f();
    }
}
