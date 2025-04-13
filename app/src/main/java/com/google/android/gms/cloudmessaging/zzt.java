package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class zzt {

    /* renamed from: a */
    public final Context f15299a;

    /* renamed from: b */
    @GuardedBy
    public int f15300b;

    /* renamed from: c */
    @GuardedBy
    public int f15301c = 0;

    public zzt(Context context) {
        this.f15299a = context;
    }

    /* renamed from: a */
    public final synchronized int m7909a() {
        int i2 = this.f15301c;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.f15299a.getPackageManager();
        if (Wrappers.m8251a(this.f15299a).f15914a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i3 = 1;
        if (!PlatformVersion.m8244a()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f15301c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f15301c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.m8244a()) {
            this.f15301c = 2;
            i3 = 2;
        } else {
            this.f15301c = 1;
        }
        return i3;
    }
}
