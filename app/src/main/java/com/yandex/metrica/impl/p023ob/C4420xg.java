package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.C3130i;
import com.yandex.metrica.C4483l;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.xg */
/* loaded from: classes2.dex */
public class C4420xg {
    @NonNull
    /* renamed from: a */
    public C4483l m21151a(@NonNull C4483l c4483l) {
        if (!C3658U2.m19212a(c4483l.maxReportsInDatabaseCount)) {
            return c4483l;
        }
        C4483l.b m21340a = C4483l.m21340a(c4483l);
        m21340a.f47181c = new ArrayList();
        if (C3658U2.m19212a((Object) c4483l.f47167a)) {
            m21340a.f47180b = c4483l.f47167a;
        }
        if (C3658U2.m19212a((Object) c4483l.f47168b) && C3658U2.m19212a(c4483l.f47175i)) {
            Map<String, String> map = c4483l.f47168b;
            m21340a.f47188j = c4483l.f47175i;
            m21340a.f47183e = map;
        }
        if (C3658U2.m19212a(c4483l.f47171e)) {
            m21340a.m21341a(c4483l.f47171e.intValue());
        }
        if (C3658U2.m19212a(c4483l.f47172f)) {
            m21340a.f47185g = Integer.valueOf(c4483l.f47172f.intValue());
        }
        if (C3658U2.m19212a(c4483l.f47173g)) {
            m21340a.f47186h = Integer.valueOf(c4483l.f47173g.intValue());
        }
        if (C3658U2.m19212a((Object) c4483l.f47169c)) {
            m21340a.f47184f = c4483l.f47169c;
        }
        if (C3658U2.m19212a((Object) c4483l.f47174h)) {
            for (Map.Entry<String, String> entry : c4483l.f47174h.entrySet()) {
                m21340a.f47187i.put(entry.getKey(), entry.getValue());
            }
        }
        if (C3658U2.m19212a(c4483l.f47176j)) {
            m21340a.f47189k = Boolean.valueOf(c4483l.f47176j.booleanValue());
        }
        if (C3658U2.m19212a((Object) c4483l.f47170d)) {
            m21340a.f47181c = c4483l.f47170d;
        }
        if (C3658U2.m19212a(c4483l.f47177k)) {
            m21340a.f47190l = Boolean.valueOf(c4483l.f47177k.booleanValue());
        }
        m21340a.f47179a.withMaxReportsInDatabaseCount(m21149a(c4483l.maxReportsInDatabaseCount, c4483l.apiKey));
        return m21340a.m21342b();
    }

    @NonNull
    /* renamed from: a */
    public C3130i m21150a(@NonNull C3130i c3130i) {
        if (!C3658U2.m19212a(c3130i.maxReportsInDatabaseCount)) {
            return c3130i;
        }
        C3130i.a aVar = new C3130i.a(c3130i.apiKey);
        if (C3658U2.m19212a(c3130i.sessionTimeout)) {
            aVar.f42479a.withSessionTimeout(c3130i.sessionTimeout.intValue());
        }
        if (C3658U2.m19212a(c3130i.logs) && c3130i.logs.booleanValue()) {
            aVar.f42479a.withLogs();
        }
        if (C3658U2.m19212a(c3130i.statisticsSending)) {
            aVar.f42479a.withStatisticsSending(c3130i.statisticsSending.booleanValue());
        }
        if (C3658U2.m19212a(c3130i.maxReportsInDatabaseCount)) {
            aVar.f42479a.withMaxReportsInDatabaseCount(c3130i.maxReportsInDatabaseCount.intValue());
        }
        if (C3658U2.m19212a(c3130i.f42476a)) {
            aVar.f42481c = Integer.valueOf(c3130i.f42476a.intValue());
        }
        if (C3658U2.m19212a(c3130i.f42477b)) {
            aVar.f42480b = Integer.valueOf(c3130i.f42477b.intValue());
        }
        if (C3658U2.m19212a((Object) c3130i.f42478c)) {
            for (Map.Entry<String, String> entry : c3130i.f42478c.entrySet()) {
                aVar.f42482d.put(entry.getKey(), entry.getValue());
            }
        }
        if (C3658U2.m19212a((Object) c3130i.userProfileID)) {
            aVar.f42479a.withUserProfileID(c3130i.userProfileID);
        }
        aVar.f42479a.withMaxReportsInDatabaseCount(m21149a(c3130i.maxReportsInDatabaseCount, c3130i.apiKey));
        return new C3130i(aVar);
    }

    /* renamed from: a */
    private int m21149a(@Nullable Integer num, @NonNull String str) {
        if (num.intValue() < 100) {
            AbstractC4478zm.m21313b(str).m21336c("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to %d, but was: %d. Default value (%d) will be used", 100, num, 100);
            return 100;
        }
        if (num.intValue() > 10000) {
            AbstractC4478zm.m21313b(str).m21336c("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to %d, but was: %d. Default value (%d) will be used", Integer.valueOf(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND), num, Integer.valueOf(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND));
            return YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        }
        return num.intValue();
    }
}
