package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GoogleApiAvailabilityLight {

    /* renamed from: a */
    @KeepForSdk
    public static final int f15327a;

    /* renamed from: b */
    public static final GoogleApiAvailabilityLight f15328b;

    static {
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f15332a;
        f15327a = 12451000;
        f15328b = new GoogleApiAvailabilityLight();
    }

    @KeepForSdk
    public GoogleApiAvailabilityLight() {
    }

    @Nullable
    @ShowFirstParty
    @KeepForSdk
    /* renamed from: a */
    public Intent mo7916a(@Nullable Context context, int i2, @Nullable String str) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            int i3 = com.google.android.gms.common.internal.zzt.f15828a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && DeviceProperties.m8240b(context)) {
            int i4 = com.google.android.gms.common.internal.zzt.f15828a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder m24u = C0000a.m24u("gcore_");
        m24u.append(f15327a);
        m24u.append("-");
        if (!TextUtils.isEmpty(str)) {
            m24u.append(str);
        }
        m24u.append("-");
        if (context != null) {
            m24u.append(context.getPackageName());
        }
        m24u.append("-");
        if (context != null) {
            try {
                m24u.append(Wrappers.m8251a(context).m8250b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb = m24u.toString();
        int i5 = com.google.android.gms.common.internal.zzt.f15828a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    @Nullable
    @ShowFirstParty
    @KeepForSdk
    /* renamed from: b */
    public PendingIntent m7925b(@NonNull Context context, int i2, int i3, @Nullable String str) {
        Intent mo7916a = mo7916a(context, i2, str);
        if (mo7916a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, mo7916a, com.google.android.gms.internal.common.zzd.f16249a | 134217728);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:2|3)|4|(4:8|2c|15|(2:17|(2:19|20))(2:22|23))|38|(4:40|(3:42|(1:48)(1:46)|47)|49|(12:51|(1:53)(1:101)|54|(2:97|98)(1:56)|57|58|59|(1:61)(2:(2:69|(1:71))|(7:77|(1:79)(1:94)|(1:81)|(1:83)(6:84|(2:89|90)|86|(1:88)|64|(1:66)(1:67))|63|64|(0)(0))(1:76))|62|63|64|(0)(0)))|102|(0)(0)|54|(0)(0)|57|58|59|(0)(0)|62|63|64|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a4, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo7917c(@androidx.annotation.NonNull android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailabilityLight.mo7917c(android.content.Context, int):int");
    }
}
