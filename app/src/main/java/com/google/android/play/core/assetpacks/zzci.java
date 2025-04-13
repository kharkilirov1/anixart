package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzci implements ServiceConnection {

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzag f19840b = new com.google.android.play.core.internal.zzag("ExtractionForegroundServiceConnection");

    /* renamed from: c */
    public final List<com.google.android.play.core.internal.zzz> f19841c = new ArrayList();

    /* renamed from: d */
    public final Context f19842d;

    /* renamed from: e */
    @Nullable
    public ExtractionForegroundService f19843e;

    /* renamed from: f */
    @Nullable
    public Notification f19844f;

    public zzci(Context context) {
        this.f19842d = context;
    }

    /* renamed from: a */
    public final void m10772a() {
        ArrayList arrayList;
        synchronized (this.f19841c) {
            arrayList = new ArrayList(this.f19841c);
            this.f19841c.clear();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.play.core.internal.zzz zzzVar = (com.google.android.play.core.internal.zzz) arrayList.get(i2);
            try {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                Parcel m10912i = zzzVar.m10912i();
                int i3 = com.google.android.play.core.internal.zzm.f20158a;
                m10912i.writeInt(1);
                bundle.writeToParcel(m10912i, 0);
                m10912i.writeInt(1);
                bundle2.writeToParcel(m10912i, 0);
                zzzVar.m10913q(2, m10912i);
            } catch (RemoteException unused) {
                this.f19840b.m10835b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f19840b.m10834a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((zzch) iBinder).f19839a;
        this.f19843e = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f19844f);
        m10772a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
