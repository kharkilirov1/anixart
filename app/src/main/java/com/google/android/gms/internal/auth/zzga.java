package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzga implements zzfn {

    /* renamed from: a */
    public final zzfq f16146a;

    /* renamed from: b */
    public final Object[] f16147b;

    /* renamed from: c */
    public final int f16148c;

    public zzga(zzfq zzfqVar, String str, Object[] objArr) {
        this.f16146a = zzfqVar;
        this.f16147b = objArr;
        char charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt < 55296) {
            this.f16148c = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i3);
            if (charAt2 < 55296) {
                this.f16148c = (charAt2 << i4) | i2;
                return;
            } else {
                i2 |= (charAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.zzfn
    /* renamed from: u */
    public final zzfq mo8431u() {
        return this.f16146a;
    }

    @Override // com.google.android.gms.internal.auth.zzfn
    /* renamed from: v */
    public final int mo8432v() {
        return (this.f16148c & 1) == 1 ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.auth.zzfn
    /* renamed from: w */
    public final boolean mo8433w() {
        return (this.f16148c & 2) == 2;
    }
}
