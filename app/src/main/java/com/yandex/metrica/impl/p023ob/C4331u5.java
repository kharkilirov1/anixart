package com.yandex.metrica.impl.p023ob;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.AbstractC3767Yb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.u5 */
/* loaded from: classes2.dex */
public class C4331u5 extends AbstractC4279s5 {

    /* renamed from: b */
    @NonNull
    private final C3729Wn f46589b;

    public C4331u5(C3940f4 c3940f4) {
        this(c3940f4, new C3729Wn());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4149n5
    /* renamed from: a */
    public boolean mo17815a(@NonNull C4066k0 c4066k0) {
        C3940f4 m20685a = m20685a();
        if (m20685a.m19891w().m18270m() && m20685a.m19863B()) {
            C3316G9 m19875f = m20685a.m19875f();
            String m18141f = m20685a().m19875f().m18141f();
            HashSet hashSet = null;
            if (!TextUtils.isEmpty(m18141f)) {
                try {
                    HashSet hashSet2 = new HashSet();
                    JSONArray jSONArray = new JSONArray(m18141f);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        hashSet2.add(new C3792Zb(jSONArray.getJSONObject(i2)));
                    }
                    hashSet = hashSet2;
                } catch (Throwable unused) {
                }
            }
            try {
                ArrayList<C3792Zb> m20867b = m20867b();
                if (C4013i.m20037a(hashSet, m20867b)) {
                    m20685a.m19892x();
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator<C3792Zb> it = m20867b.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next().m19507a());
                    }
                    m20685a.m19887r().m20861c(C4066k0.m20182a(c4066k0, new JSONObject().put("features", jSONArray2).toString()));
                    m19875f.m18143g(jSONArray2.toString());
                }
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: b */
    public ArrayList<C3792Zb> m20867b() {
        FeatureInfo[] featureInfoArr;
        try {
            C3940f4 m20685a = m20685a();
            PackageInfo m19373b = this.f46589b.m19373b(m20685a.m19876g(), m20685a.m19876g().getPackageName(), 16384);
            ArrayList<C3792Zb> arrayList = new ArrayList<>();
            AbstractC3767Yb aVar = C3658U2.m19211a(24) ? new AbstractC3767Yb.a() : new AbstractC3767Yb.b();
            if (m19373b != null && (featureInfoArr = m19373b.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(aVar.m19445a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    public C4331u5(C3940f4 c3940f4, @NonNull C3729Wn c3729Wn) {
        super(c3940f4);
        this.f46589b = c3729Wn;
    }
}
