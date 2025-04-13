package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zal {

    /* renamed from: a */
    public final SparseIntArray f15765a;

    /* renamed from: b */
    public GoogleApiAvailabilityLight f15766b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zal() {
        this(GoogleApiAvailability.f15326e);
        int i2 = GoogleApiAvailability.f15324c;
    }

    /* renamed from: a */
    public final int m8187a(@NonNull Context context, @NonNull Api.Client client) {
        java.util.Objects.requireNonNull(context, "null reference");
        java.util.Objects.requireNonNull(client, "null reference");
        int i2 = 0;
        if (!client.mo7943j()) {
            return 0;
        }
        int mo7877l = client.mo7877l();
        int i3 = this.f15765a.get(mo7877l, -1);
        if (i3 == -1) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.f15765a.size()) {
                    i2 = -1;
                    break;
                }
                int keyAt = this.f15765a.keyAt(i4);
                if (keyAt > mo7877l && this.f15765a.get(keyAt) == 0) {
                    break;
                }
                i4++;
            }
            i3 = i2 == -1 ? this.f15766b.mo7917c(context, mo7877l) : i2;
            this.f15765a.put(mo7877l, i3);
        }
        return i3;
    }

    public zal(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f15765a = new SparseIntArray();
        java.util.Objects.requireNonNull(googleApiAvailabilityLight, "null reference");
        this.f15766b = googleApiAvailabilityLight;
    }
}
