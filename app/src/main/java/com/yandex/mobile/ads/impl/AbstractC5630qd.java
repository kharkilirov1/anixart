package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.AbstractC4967de;
import com.yandex.mobile.ads.impl.C5372l2;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.qd */
/* loaded from: classes3.dex */
public abstract class AbstractC5630qd<T> extends g71<C5101g2, AdResponse<T>> {

    /* renamed from: A */
    @NonNull
    public final C5956w4 f54002A;

    /* renamed from: u */
    private final String f54003u;

    /* renamed from: v */
    private final Context f54004v;

    /* renamed from: w */
    private final C5101g2 f54005w;

    /* renamed from: x */
    @NonNull
    private final C5002e3 f54006x;

    /* renamed from: y */
    @NonNull
    private final pm0<T> f54007y;

    /* renamed from: z */
    @NonNull
    private final q01 f54008z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5630qd(@NonNull Context context, @NonNull q01 q01Var, @NonNull C5101g2 c5101g2, @NonNull String str, @NonNull String str2, @NonNull pm0 pm0Var, @NonNull AbstractC4967de.a aVar, @NonNull AbstractC5912vd abstractC5912vd) {
        super(context, 1, str, aVar, c5101g2, abstractC5912vd);
        Objects.requireNonNull(c5101g2.m24788j());
        this.f54002A = new C5956w4();
        n60.m26812e("Loading data ... url: %s, query: %s", str, str2);
        m27671a(context, c5101g2.m24787i());
        this.f54003u = str2;
        this.f54005w = c5101g2;
        this.f54004v = context.getApplicationContext();
        this.f54007y = pm0Var;
        this.f54008z = q01Var;
        this.f54006x = new C5002e3();
    }

    @Override // com.yandex.mobile.ads.impl.g71
    /* renamed from: a */
    public final tw0<AdResponse<T>> mo24051a(@NonNull km0 km0Var, int i2) {
        if (mo24606b(km0Var, i2)) {
            Map<String, String> map = km0Var.f52034c;
            EnumC5007e6 m24032a = EnumC5007e6.m24032a(map.get(j00.m25754b(4)));
            if (m24032a == this.f54005w.m24775b()) {
                uh1 mo23964a = this.f54007y.mo23964a(this.f54004v, this.f54005w);
                String str = map.get(j00.m25754b(34));
                n60.m26812e("Loading data ... saving header: %s=%s", j00.m25754b(34), str);
                this.f54008z.mo27592a(str);
                AdResponse<T> m29003a = mo23964a.m29003a(km0Var, map, m24032a);
                if (!(204 == i2)) {
                    return tw0.m28764a(m29003a, k00.m26002a(km0Var));
                }
            }
        }
        int i3 = C5372l2.f52212c;
        return tw0.m28763a(C5372l2.a.m26319a(km0Var));
    }

    @VisibleForTesting
    /* renamed from: b */
    public boolean mo24606b(@NonNull km0 km0Var, int i2) {
        if (200 == i2) {
            byte[] bArr = km0Var.f52033b;
            if (bArr != null && bArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: f */
    public final Map<String, String> mo26305f() {
        HashMap hashMap = new HashMap();
        String mo27591a = this.f54008z.mo27591a();
        if (mo27591a != null) {
            n60.m26812e("Loading data ... sessionData: %s", mo27591a);
            hashMap.put(j00.m25754b(34), mo27591a);
        }
        hashMap.put(j00.m25754b(35), this.f54006x.m23999b(this.f54004v));
        hashMap.put(j00.m25754b(36), this.f54006x.m23998a(this.f54004v));
        hashMap.putAll(this.f54005w.m24788j().m26945c());
        l00.m26308a(this.f54004v, hashMap);
        return hashMap;
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: m */
    public final String mo27673m() {
        StringBuilder sb = new StringBuilder();
        if (m30322g() == 0) {
            sb.append(this.f54003u);
        }
        List<st0> m26949e = this.f54005w.m24788j().m26949e();
        if (sb.length() != 0 && m26949e.size() > 0) {
            sb.append("&");
        }
        for (int i2 = 0; i2 < m26949e.size(); i2++) {
            if (i2 != 0) {
                sb.append("&");
            }
            Objects.requireNonNull(m26949e.get(i2));
            sb.append(String.format("%s=%s", null, null));
        }
        return Uri.parse(super.mo27673m()).buildUpon().encodedQuery(sb.toString()).build().toString();
    }

    @Override // com.yandex.mobile.ads.impl.g71, com.yandex.mobile.ads.impl.zv0
    /* renamed from: b */
    public final qh1 mo24816b(qh1 qh1Var) {
        n60.m26808a(qh1Var, qh1Var.toString(), new Object[0]);
        km0 km0Var = qh1Var.f54052a;
        int i2 = C5372l2.f52212c;
        return super.mo24816b((qh1) C5372l2.a.m26319a(km0Var));
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: b */
    public final byte[] mo27672b() throws C6069yb {
        if (1 == m30322g()) {
            try {
                String str = this.f54003u;
                if (str != null) {
                    return str.getBytes("UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
                n60.m26809b("Unsupported Encoding while trying to get the bytes of %s using %s", this.f54003u, "UTF-8");
            }
        }
        return null;
    }

    public AbstractC5630qd(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull String str, @NonNull String str2, @NonNull pm0 pm0Var, @NonNull AbstractC4967de.a aVar, @NonNull AbstractC5912vd abstractC5912vd) {
        this(context, qp1.m27773a(context), c5101g2, str, str2, pm0Var, aVar, abstractC5912vd);
    }

    /* renamed from: a */
    private void m27671a(@NonNull Context context, @NonNull int i2) {
        m30310a(this.f54002A.m29374a(context, i2));
    }
}
