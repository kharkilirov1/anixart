package com.google.android.play.core.splitinstall.testing;

import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Map;
import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzc extends zzt {

    /* renamed from: b */
    public final Integer f20233b;

    /* renamed from: c */
    public final Map<String, Integer> f20234c;

    public /* synthetic */ zzc(Integer num, Map map) {
        this.f20233b = num;
        this.f20234c = map;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzt
    @Nullable
    @SplitInstallErrorCode
    /* renamed from: a */
    public final Integer mo10980a() {
        return this.f20233b;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzt
    /* renamed from: b */
    public final Map<String, Integer> mo10981b() {
        return this.f20234c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzt) {
            zzt zztVar = (zzt) obj;
            Integer num = this.f20233b;
            if (num != null ? num.equals(zztVar.mo10980a()) : zztVar.mo10980a() == null) {
                if (this.f20234c.equals(zztVar.mo10981b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f20233b;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f20234c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20233b);
        String valueOf2 = String.valueOf(this.f20234c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 81 + valueOf2.length());
        C0000a.m2C(sb, "LocalTestingConfig{defaultSplitInstallErrorCode=", valueOf, ", splitInstallErrorCodeByModule=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
