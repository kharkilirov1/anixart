package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import androidx.room.util.C0576a;
import com.google.android.gms.internal.base.zaq;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SuppressLint
/* loaded from: classes.dex */
final class zac extends zaq {

    /* renamed from: a */
    public final Context f15917a;

    /* renamed from: b */
    public final /* synthetic */ GoogleApiAvailability f15918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zac(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f15918b = googleApiAvailability;
        this.f15917a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        boolean z = true;
        if (i2 != 1) {
            C0576a.m4123v(50, "Don't know how to handle this message: ", i2, "GoogleApiAvailability");
            return;
        }
        int m7918d = this.f15918b.m7918d(this.f15917a);
        Objects.requireNonNull(this.f15918b);
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f15332a;
        if (m7918d != 1 && m7918d != 2 && m7918d != 3 && m7918d != 9) {
            z = false;
        }
        if (z) {
            GoogleApiAvailability googleApiAvailability = this.f15918b;
            Context context = this.f15917a;
            googleApiAvailability.m7923i(context, m7918d, null, googleApiAvailability.m7925b(context, m7918d, 0, "n"));
        }
    }
}
