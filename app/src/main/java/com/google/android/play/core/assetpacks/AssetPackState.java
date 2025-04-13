package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.play.core.assetpacks.model.AssetPackErrorCode;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class AssetPackState {
    /* renamed from: h */
    public static AssetPackState m10673h(@NonNull String str, @AssetPackStatus int i2, @AssetPackErrorCode int i3, long j2, long j3, double d, int i4, String str2, String str3) {
        return new zzbn(str, i2, i3, j2, j3, (int) Math.rint(100.0d * d), i4, str2, str3);
    }

    /* renamed from: i */
    public static AssetPackState m10674i(Bundle bundle, String str, zzco zzcoVar, zzeb zzebVar, zzbe zzbeVar) {
        int mo10719a = zzbeVar.mo10719a(bundle.getInt(com.google.android.play.core.assetpacks.model.zzb.m10688a("status", str)), str);
        int i2 = bundle.getInt(com.google.android.play.core.assetpacks.model.zzb.m10688a("error_code", str));
        long j2 = bundle.getLong(com.google.android.play.core.assetpacks.model.zzb.m10688a("bytes_downloaded", str));
        long j3 = bundle.getLong(com.google.android.play.core.assetpacks.model.zzb.m10688a("total_bytes_to_download", str));
        double m10774a = zzcoVar.m10774a(str);
        long j4 = bundle.getLong(com.google.android.play.core.assetpacks.model.zzb.m10688a("pack_version", str));
        long j5 = bundle.getLong(com.google.android.play.core.assetpacks.model.zzb.m10688a("pack_base_version", str));
        int i3 = 1;
        int i4 = 4;
        if (mo10719a != 4) {
            i4 = mo10719a;
        } else if (j5 != 0 && j5 != j4) {
            i3 = 2;
        }
        return m10673h(str, i4, i2, j2, j3, m10774a, i3, bundle.getString(com.google.android.play.core.assetpacks.model.zzb.m10688a("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), zzebVar.m10795a(str));
    }

    /* renamed from: a */
    public abstract long mo10675a();

    @AssetPackErrorCode
    /* renamed from: b */
    public abstract int mo10676b();

    /* renamed from: c */
    public abstract String mo10677c();

    @AssetPackStatus
    /* renamed from: d */
    public abstract int mo10678d();

    /* renamed from: e */
    public abstract long mo10679e();

    /* renamed from: f */
    public abstract int mo10680f();

    /* renamed from: g */
    public abstract int mo10681g();

    /* renamed from: j */
    public abstract String mo10682j();

    /* renamed from: k */
    public abstract String mo10683k();
}
