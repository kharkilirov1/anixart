package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Nh */
/* loaded from: classes2.dex */
public class C3499Nh implements InterfaceC3706W0, IPluginReporter {

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC3399Jh> f43474a = new ArrayList();

    /* renamed from: b */
    @Nullable
    private volatile InterfaceC3706W0 f43475b;

    /* renamed from: com.yandex.metrica.impl.ob.Nh$a */
    public class a implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ String f43476a;

        /* renamed from: b */
        public final /* synthetic */ String f43477b;

        public a(C3499Nh c3499Nh, String str, String str2) {
            this.f43476a = str;
            this.f43477b = str2;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.mo17793d(this.f43476a, this.f43477b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$b */
    public class b implements InterfaceC3399Jh {
        public b(C3499Nh c3499Nh) {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$c */
    public class c implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ C4203p7 f43478a;

        public c(C3499Nh c3499Nh, C4203p7 c4203p7) {
            this.f43478a = c4203p7;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.mo18346a(this.f43478a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$d */
    public class d implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ String f43479a;

        public d(C3499Nh c3499Nh, String str) {
            this.f43479a = str;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.reportEvent(this.f43479a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$e */
    public class e implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ String f43480a;

        /* renamed from: b */
        public final /* synthetic */ String f43481b;

        public e(C3499Nh c3499Nh, String str, String str2) {
            this.f43480a = str;
            this.f43481b = str2;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.reportEvent(this.f43480a, this.f43481b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$f */
    public class f implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ String f43482a;

        /* renamed from: b */
        public final /* synthetic */ Map f43483b;

        public f(C3499Nh c3499Nh, String str, Map map) {
            this.f43482a = str;
            this.f43483b = map;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.reportEvent(this.f43482a, this.f43483b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$g */
    public class g implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ String f43484a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f43485b;

        public g(C3499Nh c3499Nh, String str, Throwable th) {
            this.f43484a = str;
            this.f43485b = th;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.reportError(this.f43484a, this.f43485b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$h */
    public class h implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ String f43486a;

        /* renamed from: b */
        public final /* synthetic */ String f43487b;

        /* renamed from: c */
        public final /* synthetic */ Throwable f43488c;

        public h(C3499Nh c3499Nh, String str, String str2, Throwable th) {
            this.f43486a = str;
            this.f43487b = str2;
            this.f43488c = th;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.reportError(this.f43486a, this.f43487b, this.f43488c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$i */
    public class i implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ Throwable f43489a;

        public i(C3499Nh c3499Nh, Throwable th) {
            this.f43489a = th;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.reportUnhandledException(this.f43489a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$j */
    public class j implements InterfaceC3399Jh {
        public j(C3499Nh c3499Nh) {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.resumeSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$k */
    public class k implements InterfaceC3399Jh {
        public k(C3499Nh c3499Nh) {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.pauseSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$l */
    public class l implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ String f43490a;

        public l(C3499Nh c3499Nh, String str) {
            this.f43490a = str;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.setUserProfileID(this.f43490a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$m */
    public class m implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ UserProfile f43491a;

        public m(C3499Nh c3499Nh, UserProfile userProfile) {
            this.f43491a = userProfile;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.reportUserProfile(this.f43491a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$n */
    public class n implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ C3917e7 f43492a;

        public n(C3499Nh c3499Nh, C3917e7 c3917e7) {
            this.f43492a = c3917e7;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.mo18344a(this.f43492a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$o */
    public class o implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ Revenue f43493a;

        public o(C3499Nh c3499Nh, Revenue revenue) {
            this.f43493a = revenue;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.reportRevenue(this.f43493a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$p */
    public class p implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ ECommerceEvent f43494a;

        public p(C3499Nh c3499Nh, ECommerceEvent eCommerceEvent) {
            this.f43494a = eCommerceEvent;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.reportECommerce(this.f43494a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$q */
    public class q implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ boolean f43495a;

        public q(C3499Nh c3499Nh, boolean z) {
            this.f43495a = z;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.setStatisticsSending(this.f43495a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$r */
    public class r implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ PluginErrorDetails f43496a;

        public r(C3499Nh c3499Nh, PluginErrorDetails pluginErrorDetails) {
            this.f43496a = pluginErrorDetails;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.getPluginExtension().reportUnhandledException(this.f43496a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$s */
    public class s implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ PluginErrorDetails f43497a;

        /* renamed from: b */
        public final /* synthetic */ String f43498b;

        public s(C3499Nh c3499Nh, PluginErrorDetails pluginErrorDetails, String str) {
            this.f43497a = pluginErrorDetails;
            this.f43498b = str;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.getPluginExtension().reportError(this.f43497a, this.f43498b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$t */
    public class t implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ String f43499a;

        /* renamed from: b */
        public final /* synthetic */ String f43500b;

        /* renamed from: c */
        public final /* synthetic */ PluginErrorDetails f43501c;

        public t(C3499Nh c3499Nh, String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f43499a = str;
            this.f43500b = str2;
            this.f43501c = pluginErrorDetails;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.getPluginExtension().reportError(this.f43499a, this.f43500b, this.f43501c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$u */
    public class u implements InterfaceC3399Jh {
        public u(C3499Nh c3499Nh) {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.mo18350b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$v */
    public class v implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ String f43502a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f43503b;

        public v(C3499Nh c3499Nh, String str, JSONObject jSONObject) {
            this.f43502a = str;
            this.f43503b = jSONObject;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.mo18348a(this.f43502a, this.f43503b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$w */
    public class w implements InterfaceC3399Jh {

        /* renamed from: a */
        public final /* synthetic */ String f43504a;

        /* renamed from: b */
        public final /* synthetic */ String f43505b;

        public w(C3499Nh c3499Nh, String str, String str2) {
            this.f43504a = str;
            this.f43505b = str2;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3399Jh
        /* renamed from: a */
        public void mo18413a(@NonNull InterfaceC3706W0 interfaceC3706W0) {
            interfaceC3706W0.mo17792b(this.f43504a, this.f43505b);
        }
    }

    /* renamed from: a */
    public synchronized void m18617a(@NonNull Context context) {
        this.f43475b = C4238qg.m20589a().m20593a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
        Iterator<InterfaceC3399Jh> it = this.f43474a.iterator();
        while (it.hasNext()) {
            it.next().mo18413a(this.f43475b);
        }
        this.f43474a.clear();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0
    /* renamed from: b */
    public void mo18350b() {
        m18616a(new u(this));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0, com.yandex.metrica.InterfaceC3126g
    /* renamed from: d */
    public void mo17793d(@NonNull String str, @Nullable String str2) {
        m18616a(new a(this, str, str2));
    }

    @Override // com.yandex.metrica.IReporter
    @NonNull
    public IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        m18616a(new k(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        m18616a(new p(this, eCommerceEvent));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable Throwable th) {
        m18616a(new g(this, str, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str) {
        m18616a(new d(this, str));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(@NonNull Revenue revenue) {
        m18616a(new o(this, revenue));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(@NonNull Throwable th) {
        m18616a(new i(this, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(@NonNull UserProfile userProfile) {
        m18616a(new m(this, userProfile));
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        m18616a(new j(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        m18616a(new b(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
        m18616a(new q(this, z));
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(@Nullable String str) {
        m18616a(new l(this, str));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0, com.yandex.metrica.InterfaceC3126g
    /* renamed from: b */
    public void mo17792b(@Nullable String str, @Nullable String str2) {
        m18616a(new w(this, str, str2));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable String str2) {
        m18616a(new h(this, str, str2, null));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str, @Nullable String str2) {
        m18616a(new e(this, str, str2));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        m18616a(new r(this, pluginErrorDetails));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable String str2, @NonNull Throwable th) {
        m18616a(new h(this, str, str2, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        m18616a(new f(this, str, map));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        m18616a(new s(this, pluginErrorDetails, str));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3833b1
    /* renamed from: a */
    public void mo18346a(@NonNull C4203p7 c4203p7) {
        m18616a(new c(this, c4203p7));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        m18616a(new t(this, str, str2, pluginErrorDetails));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3833b1
    /* renamed from: a */
    public void mo18344a(@NonNull C3917e7 c3917e7) {
        m18616a(new n(this, c3917e7));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0
    /* renamed from: a */
    public void mo18348a(@NonNull String str, @NonNull JSONObject jSONObject) {
        m18616a(new v(this, str, jSONObject));
    }

    /* renamed from: a */
    private synchronized void m18616a(@NonNull InterfaceC3399Jh interfaceC3399Jh) {
        if (this.f43475b == null) {
            this.f43474a.add(interfaceC3399Jh);
        } else {
            interfaceC3399Jh.mo18413a(this.f43475b);
        }
    }
}
