package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.H2 */
/* loaded from: classes2.dex */
public final class C3334H2 {

    /* renamed from: a */
    private static final C3729Wn f43030a = new C3729Wn();

    /* renamed from: a */
    public static Intent m18185a(Context context) {
        return new Intent(context, (Class<?>) MetricaService.class).setAction("com.yandex.metrica.IMetricaService").setData(new Uri.Builder().scheme("metrica").authority(context.getPackageName()).build()).addFlags(32);
    }

    /* renamed from: b */
    public static Intent m18186b(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Intent m18185a = m18185a(context);
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        try {
            bundle = applicationInfo.metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused2) {
            bundle = new Bundle();
        }
        Intent putExtras = m18185a.putExtras(bundle);
        putExtras.setData(putExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", C3659U3.f44128c).build());
        C4380w2 m21286a = C4458z2.m21284a(context).m21286a();
        putExtras.putExtra("screen_size", m21286a != null ? C4452ym.m21238a(m21286a) : null);
        return putExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
