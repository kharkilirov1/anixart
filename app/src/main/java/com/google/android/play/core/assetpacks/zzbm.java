package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import com.google.android.play.core.assetpacks.model.AssetPackStorageMethod;
import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbm extends AssetPackLocation {

    /* renamed from: a */
    public final int f19750a;

    /* renamed from: b */
    public final String f19751b;

    /* renamed from: c */
    public final String f19752c;

    public zzbm(int i2, @Nullable String str, @Nullable String str2) {
        this.f19750a = i2;
        this.f19751b = str;
        this.f19752c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    @Nullable
    /* renamed from: a */
    public final String mo10670a() {
        return this.f19752c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    @AssetPackStorageMethod
    /* renamed from: b */
    public final int mo10671b() {
        return this.f19750a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    @Nullable
    /* renamed from: c */
    public final String mo10672c() {
        return this.f19751b;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackLocation) {
            AssetPackLocation assetPackLocation = (AssetPackLocation) obj;
            if (this.f19750a == assetPackLocation.mo10671b() && ((str = this.f19751b) != null ? str.equals(assetPackLocation.mo10672c()) : assetPackLocation.mo10672c() == null) && ((str2 = this.f19752c) != null ? str2.equals(assetPackLocation.mo10670a()) : assetPackLocation.mo10670a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.f19750a ^ 1000003) * 1000003;
        String str = this.f19751b;
        int hashCode = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f19752c;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i2 = this.f19750a;
        String str = this.f19751b;
        String str2 = this.f19752c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i2);
        sb.append(", path=");
        sb.append(str);
        return C0000a.m21r(sb, ", assetsPath=", str2, "}");
    }
}
