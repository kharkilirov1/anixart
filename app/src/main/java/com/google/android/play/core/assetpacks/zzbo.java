package com.google.android.play.core.assetpacks;

import java.util.Map;
import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbo extends AssetPackStates {

    /* renamed from: a */
    public final long f19762a;

    /* renamed from: b */
    public final Map<String, AssetPackState> f19763b;

    public zzbo(long j2, Map<String, AssetPackState> map) {
        this.f19762a = j2;
        this.f19763b = map;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackStates
    /* renamed from: a */
    public final Map<String, AssetPackState> mo10685a() {
        return this.f19763b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackStates
    /* renamed from: b */
    public final long mo10686b() {
        return this.f19762a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackStates) {
            AssetPackStates assetPackStates = (AssetPackStates) obj;
            if (this.f19762a == assetPackStates.mo10686b() && this.f19763b.equals(assetPackStates.mo10685a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f19762a;
        return this.f19763b.hashCode() ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j2 = this.f19762a;
        String valueOf = String.valueOf(this.f19763b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j2);
        sb.append(", packStates=");
        return C0000a.m20q(sb, valueOf, "}");
    }
}
