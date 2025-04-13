package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzed {

    /* renamed from: c */
    public static final com.google.android.play.core.internal.zzag f19998c = new com.google.android.play.core.internal.zzag("PackageStateCache");

    /* renamed from: a */
    public final Context f19999a;

    /* renamed from: b */
    public int f20000b = -1;

    public zzed(Context context) {
        this.f19999a = context;
    }

    /* renamed from: a */
    public final synchronized int m10797a() {
        if (this.f20000b == -1) {
            try {
                this.f20000b = this.f19999a.getPackageManager().getPackageInfo(this.f19999a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f19998c.m10835b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f20000b;
    }
}
