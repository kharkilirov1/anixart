package com.yandex.metrica.push.core.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.YandexMetricaPush;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.impl.C4530J0;
import com.yandex.metrica.push.impl.C4562a;
import com.yandex.metrica.push.impl.C4566c;
import com.yandex.metrica.push.impl.C4594q;
import com.yandex.metrica.push.impl.C4596r;
import com.yandex.metrica.push.impl.C4598s;

/* renamed from: com.yandex.metrica.push.core.notification.b */
/* loaded from: classes2.dex */
public class C4499b extends AbstractC4507j {

    /* renamed from: b */
    @NonNull
    private final C4498a f47251b = new C4498a();

    /* JADX WARN: Removed duplicated region for block: B:227:0x0497  */
    @Override // com.yandex.metrica.push.core.notification.AbstractC4507j
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.core.app.NotificationCompat.Builder mo21392a(@androidx.annotation.NonNull android.content.Context r37, @androidx.annotation.NonNull com.yandex.metrica.push.impl.C4596r r38) {
        /*
            Method dump skipped, instructions count: 1663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.push.core.notification.C4499b.mo21392a(android.content.Context, com.yandex.metrica.push.impl.r):androidx.core.app.NotificationCompat$Builder");
    }

    @Nullable
    /* renamed from: a */
    public Long m21394a(@NonNull C4596r c4596r) {
        Long m21701u = c4596r.m21658c() == null ? null : c4596r.m21658c().m21701u();
        Long m21675E = c4596r.m21658c() != null ? c4596r.m21658c().m21675E() : null;
        if (m21701u == null || m21675E == null) {
            return m21675E != null ? Long.valueOf(m21675E.longValue() - System.currentTimeMillis()) : m21701u;
        }
        return Long.valueOf(Math.min(m21701u.longValue(), m21675E.longValue() - System.currentTimeMillis()));
    }

    @NonNull
    /* renamed from: a */
    public PendingIntent m21390a(@NonNull Context context, @NonNull C4594q c4594q) {
        Intent intent = new Intent(context, (Class<?>) MetricaPushDummyActivity.class);
        intent.putExtra("com.yandex.metrica.push.extra.ACTION_INFO", c4594q);
        intent.setPackage(context.getPackageName());
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        return PendingIntent.getActivity(context, m21389a(context), intent, C4530J0.m21441a(268435456, c4594q.f47464e == EnumC4501d.INLINE_ACTION));
    }

    @NonNull
    /* renamed from: a */
    public PendingIntent m21391a(@NonNull Context context, @NonNull C4594q c4594q, boolean z) {
        Intent m21388a = !z ? this.f47251b.m21388a(context, c4594q.f47462c) : null;
        if (m21388a == null) {
            m21388a = new Intent("com.yandex.metrica.push.action.NOTIFICATION_ACTION");
            m21388a.putExtra("com.yandex.metrica.push.extra.ACTION_INFO", c4594q);
            m21388a.setPackage(context.getPackageName());
            if (c4594q.f47475p) {
                m21388a.addFlags(268435456);
            }
        } else {
            String str = c4594q.f47461b;
            String str2 = c4594q.f47465f;
            int i2 = c4594q.f47467h;
            String str3 = c4594q.f47466g;
            boolean z2 = c4594q.f47470k;
            boolean z3 = c4594q.f47471l;
            String str4 = c4594q.f47460a;
            Bundle bundle = new Bundle();
            bundle.putString("push_id", str);
            bundle.putString("action_id", str2);
            bundle.putInt("notification_id", i2);
            bundle.putString("notification_tag", str3);
            bundle.putBoolean("hide_quick_control_panel", z2);
            bundle.putBoolean("dismiss_on_additional_action", z3);
            bundle.putString("transport", str4);
            m21388a.putExtra(YandexMetricaPush.EXTRA_ACTION_INFO, bundle);
            Bundle bundle2 = c4594q.f47472m;
            if (bundle2 != null) {
                m21388a.putExtras(bundle2);
            }
            if (c4594q.f47473n) {
                m21388a.setPackage(context.getPackageName());
            }
            m21388a.putExtra(YandexMetricaPush.EXTRA_PAYLOAD, c4594q.f47463d);
        }
        int m21389a = m21389a(context);
        int m21441a = C4530J0.m21441a(268435456, c4594q.f47464e == EnumC4501d.INLINE_ACTION);
        if (z) {
            return PendingIntent.getBroadcast(context, m21389a, m21388a, m21441a);
        }
        return PendingIntent.getActivity(context, m21389a, m21388a, m21441a);
    }

    @NonNull
    /* renamed from: a */
    public C4594q m21393a(@NonNull EnumC4501d enumC4501d, @NonNull C4596r c4596r, @Nullable String str, @Nullable C4598s.a aVar) {
        Integer m21699s = c4596r.m21658c() == null ? null : c4596r.m21658c().m21699s();
        String m21684d = c4596r.m21658c() == null ? null : c4596r.m21658c().m21684d();
        String m21700t = c4596r.m21658c() == null ? null : c4596r.m21658c().m21700t();
        Boolean m21692l = c4596r.m21658c() == null ? null : c4596r.m21658c().m21692l();
        C4594q.b m21621a = C4594q.m21604a(c4596r.m21664i()).m21632d(c4596r.m21660e()).m21634e(c4596r.m21659d()).m21624a(enumC4501d).m21636f(str).m21630c(m21700t).m21621a(m21699s == null ? 0 : m21699s.intValue());
        if (CoreUtils.isEmpty(m21684d)) {
            m21684d = "yandex_metrica_push_v2";
        }
        C4594q.b m21635e = m21621a.m21628b(m21684d).m21623a((Bundle) null).m21635e(c4596r.m21658c().m21676F());
        if (aVar != null) {
            m21635e.m21625a(aVar.m21715g());
            m21635e.m21635e(aVar.m21720l());
            if (aVar.m21712d() != null) {
                m21635e.m21622a(aVar.m21712d().longValue());
            }
            if (aVar.m21713e() != null) {
                m21635e.m21633d(aVar.m21713e().booleanValue());
            }
            if (aVar.m21710b() != null) {
                m21635e.m21626a(aVar.m21710b().booleanValue());
            }
            if (aVar.m21719k() != null) {
                if (aVar.m21719k() == C4598s.a.b.OPEN_APP_URI) {
                    m21692l = Boolean.TRUE;
                }
                if (aVar.m21719k() == C4598s.a.b.DO_NOTHING) {
                    m21635e.m21629b(true);
                }
            } else {
                m21692l = aVar.m21711c();
            }
        }
        m21635e.m21631c(m21692l != null ? m21692l.booleanValue() : false);
        return m21635e.m21627a();
    }

    /* renamed from: a */
    private int m21389a(@NonNull Context context) {
        C4566c m21499e = C4562a.m21488a(context).m21499e();
        int intValue = Integer.valueOf(m21499e.m21524a().getInt("pending_intent_id", 0)).intValue();
        if (intValue < 1512312345 || intValue > 1512322343) {
            intValue = 1512312345;
        }
        int i2 = intValue + 1;
        m21499e.m21524a().edit().putInt("pending_intent_id", i2).apply();
        return i2;
    }
}
