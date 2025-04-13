package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.C5 */
/* loaded from: classes2.dex */
public class C3212C5 extends AbstractC4279s5 {

    /* renamed from: b */
    @NonNull
    private final C3860c2 f42661b;

    /* renamed from: c */
    @NonNull
    private final C3365I8 f42662c;

    /* renamed from: d */
    @NonNull
    private final C3729Wn f42663d;

    public C3212C5(@NonNull C3940f4 c3940f4) {
        this(c3940f4, c3940f4.m19891w(), C3532P0.m18696i().m18710m(), new C3729Wn());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4149n5
    /* renamed from: a */
    public boolean mo17815a(@NonNull C4066k0 c4066k0) {
        String str;
        C3940f4 m20685a = m20685a();
        if (this.f42662c.m18271n()) {
            return false;
        }
        C4066k0 m20188e = m20685a.m19882m().m20111Q() ? C4066k0.m20188e(c4066k0) : C4066k0.m20186c(c4066k0);
        JSONObject jSONObject = new JSONObject();
        C3729Wn c3729Wn = this.f42663d;
        Context m19876g = m20685a.m19876g();
        String m19669b = m20685a.m19874e().m19669b();
        Objects.requireNonNull(c3729Wn);
        JSONObject jSONObject2 = null;
        try {
            PackageManager packageManager = m19876g.getPackageManager();
            str = C3658U2.m19211a(30) ? C3754Xn.m19409a(packageManager, m19669b) : packageManager.getInstallerPackageName(m19669b);
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        try {
            jSONObject.put("appInstaller", str);
            C3446Le m17845a = this.f42661b.m17845a();
            if (m17845a.f43333c) {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("trackingId", m17845a.f43331a);
                    if (m17845a.f43332b.length() > 0) {
                        jSONObject2.put("additionalParams", m17845a.f43332b);
                    }
                } catch (Throwable unused2) {
                }
            }
            jSONObject.put("preloadInfo", jSONObject2);
        } catch (Throwable unused3) {
        }
        m20685a.m19887r().m20860b(m20188e.mo19071f(jSONObject.toString()));
        this.f42662c.m18257b(true);
        return false;
    }

    @VisibleForTesting
    public C3212C5(@NonNull C3940f4 c3940f4, @NonNull C3365I8 c3365i8, @NonNull C3860c2 c3860c2, @NonNull C3729Wn c3729Wn) {
        super(c3940f4);
        this.f42662c = c3365i8;
        this.f42661b = c3860c2;
        this.f42663d = c3729Wn;
    }
}
