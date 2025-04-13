package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.C4483l;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.u0 */
/* loaded from: classes2.dex */
public class C4326u0 implements InterfaceC4379w1 {

    /* renamed from: a */
    private Location f46566a;

    /* renamed from: b */
    private Boolean f46567b;

    /* renamed from: c */
    private Boolean f46568c;

    /* renamed from: d */
    private Boolean f46569d;

    /* renamed from: e */
    private Map<String, String> f46570e = new LinkedHashMap();

    /* renamed from: f */
    private Map<String, String> f46571f = new LinkedHashMap();

    /* renamed from: g */
    @Nullable
    private String f46572g;

    /* renamed from: h */
    private boolean f46573h;

    /* renamed from: i */
    private C4146n2 f46574i;

    /* renamed from: a */
    private static boolean m20850a(Object obj) {
        return obj == null;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: a */
    public void mo18459a(boolean z) {
        this.f46568c = Boolean.valueOf(z);
        m20851b();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: b */
    public void mo18462b(boolean z) {
        this.f46567b = Boolean.valueOf(z);
        m20851b();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: c */
    public void mo18354c(String str, String str2) {
        this.f46571f.put(str, str2);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    public void setStatisticsSending(boolean z) {
        this.f46569d = Boolean.valueOf(z);
        m20851b();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    public void setUserProfileID(@Nullable String str) {
        this.f46572g = str;
    }

    /* renamed from: b */
    private void m20852b(@Nullable Map<String, String> map, @NonNull C4483l.b bVar) {
        if (C3658U2.m19218b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bVar.f47179a.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: a */
    public void mo18452a(@Nullable Location location) {
        this.f46566a = location;
    }

    /* renamed from: a */
    public C4483l m20853a(C4483l c4483l) {
        if (this.f46573h) {
            return c4483l;
        }
        C4483l.b bVar = new C4483l.b(c4483l.apiKey);
        Map<String, String> map = c4483l.f47168b;
        bVar.f47188j = c4483l.f47175i;
        bVar.f47183e = map;
        bVar.f47180b = c4483l.f47167a;
        bVar.f47179a.withPreloadInfo(c4483l.preloadInfo);
        bVar.f47179a.withLocation(c4483l.location);
        if (C3658U2.m19212a((Object) c4483l.f47170d)) {
            bVar.f47181c = c4483l.f47170d;
        }
        if (C3658U2.m19212a((Object) c4483l.appVersion)) {
            bVar.f47179a.withAppVersion(c4483l.appVersion);
        }
        if (C3658U2.m19212a(c4483l.f47172f)) {
            bVar.f47185g = Integer.valueOf(c4483l.f47172f.intValue());
        }
        if (C3658U2.m19212a(c4483l.f47171e)) {
            bVar.m21341a(c4483l.f47171e.intValue());
        }
        if (C3658U2.m19212a(c4483l.f47173g)) {
            bVar.f47186h = Integer.valueOf(c4483l.f47173g.intValue());
        }
        if (C3658U2.m19212a(c4483l.logs) && c4483l.logs.booleanValue()) {
            bVar.f47179a.withLogs();
        }
        if (C3658U2.m19212a(c4483l.sessionTimeout)) {
            bVar.f47179a.withSessionTimeout(c4483l.sessionTimeout.intValue());
        }
        if (C3658U2.m19212a(c4483l.crashReporting)) {
            bVar.f47179a.withCrashReporting(c4483l.crashReporting.booleanValue());
        }
        if (C3658U2.m19212a(c4483l.nativeCrashReporting)) {
            bVar.f47179a.withNativeCrashReporting(c4483l.nativeCrashReporting.booleanValue());
        }
        if (C3658U2.m19212a(c4483l.locationTracking)) {
            bVar.f47179a.withLocationTracking(c4483l.locationTracking.booleanValue());
        }
        if (C3658U2.m19212a((Object) c4483l.f47169c)) {
            bVar.f47184f = c4483l.f47169c;
        }
        if (C3658U2.m19212a(c4483l.firstActivationAsUpdate)) {
            bVar.f47179a.handleFirstActivationAsUpdate(c4483l.firstActivationAsUpdate.booleanValue());
        }
        if (C3658U2.m19212a(c4483l.statisticsSending)) {
            bVar.f47179a.withStatisticsSending(c4483l.statisticsSending.booleanValue());
        }
        if (C3658U2.m19212a(c4483l.f47177k)) {
            bVar.f47190l = Boolean.valueOf(c4483l.f47177k.booleanValue());
        }
        if (C3658U2.m19212a(c4483l.maxReportsInDatabaseCount)) {
            bVar.f47179a.withMaxReportsInDatabaseCount(c4483l.maxReportsInDatabaseCount.intValue());
        }
        if (C3658U2.m19212a(c4483l.f47178l)) {
            bVar.f47191m = c4483l.f47178l;
        }
        if (C3658U2.m19212a((Object) c4483l.userProfileID)) {
            bVar.f47179a.withUserProfileID(c4483l.userProfileID);
        }
        if (C3658U2.m19212a(c4483l.revenueAutoTrackingEnabled)) {
            bVar.f47179a.withRevenueAutoTrackingEnabled(c4483l.revenueAutoTrackingEnabled.booleanValue());
        }
        if (C3658U2.m19212a(c4483l.appOpenTrackingEnabled)) {
            bVar.f47179a.withAppOpenTrackingEnabled(c4483l.appOpenTrackingEnabled.booleanValue());
        }
        m20849a(this.f46570e, bVar);
        m20849a(c4483l.f47174h, bVar);
        m20852b(this.f46571f, bVar);
        m20852b(c4483l.errorEnvironment, bVar);
        Boolean bool = this.f46567b;
        if (m20850a(c4483l.locationTracking) && C3658U2.m19212a(bool)) {
            bVar.f47179a.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f46566a;
        if (m20850a((Object) c4483l.location) && C3658U2.m19212a(location)) {
            bVar.f47179a.withLocation(location);
        }
        Boolean bool2 = this.f46569d;
        if (m20850a(c4483l.statisticsSending) && C3658U2.m19212a(bool2)) {
            bVar.f47179a.withStatisticsSending(bool2.booleanValue());
        }
        if (!C3658U2.m19212a((Object) c4483l.userProfileID) && C3658U2.m19212a((Object) this.f46572g)) {
            bVar.f47179a.withUserProfileID(this.f46572g);
        }
        this.f46573h = true;
        this.f46566a = null;
        this.f46567b = null;
        this.f46569d = null;
        this.f46570e.clear();
        this.f46571f.clear();
        this.f46572g = null;
        return bVar.m21342b();
    }

    /* renamed from: b */
    private void m20851b() {
        C4146n2 c4146n2 = this.f46574i;
        if (c4146n2 != null) {
            c4146n2.m20424a(this.f46567b, this.f46569d, this.f46568c);
        }
    }

    /* renamed from: a */
    private void m20849a(@Nullable Map<String, String> map, @NonNull C4483l.b bVar) {
        if (C3658U2.m19218b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bVar.f47187i.put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public void m20854a(C4146n2 c4146n2) {
        this.f46574i = c4146n2;
    }
}
