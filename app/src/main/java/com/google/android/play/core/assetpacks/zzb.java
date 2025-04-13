package com.google.android.play.core.assetpacks;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzb extends com.google.android.play.core.internal.zzx {

    /* renamed from: a */
    public final com.google.android.play.core.internal.zzag f19712a = new com.google.android.play.core.internal.zzag("AssetPackExtractionService");

    /* renamed from: b */
    public final Context f19713b;

    /* renamed from: c */
    public final zzbh f19714c;

    /* renamed from: d */
    public final zzl f19715d;

    /* renamed from: e */
    public final zzci f19716e;

    /* renamed from: f */
    @VisibleForTesting
    public final NotificationManager f19717f;

    public zzb(Context context, zzbh zzbhVar, zzl zzlVar, zzci zzciVar) {
        this.f19713b = context;
        this.f19714c = zzbhVar;
        this.f19715d = zzlVar;
        this.f19716e = zzciVar;
        this.f19717f = (NotificationManager) context.getSystemService("notification");
    }

    @Override // com.google.android.play.core.internal.zzy
    /* renamed from: K1 */
    public final void mo10717K1(Bundle bundle, com.google.android.play.core.internal.zzz zzzVar) throws RemoteException {
        synchronized (this) {
            this.f19712a.m10834a("updateServiceState AIDL call", new Object[0]);
            if (com.google.android.play.core.internal.zzch.m10889b(this.f19713b) && com.google.android.play.core.internal.zzch.m10888a(this.f19713b)) {
                int i2 = bundle.getInt("action_type");
                zzci zzciVar = this.f19716e;
                synchronized (zzciVar.f19841c) {
                    zzciVar.f19841c.add(zzzVar);
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        this.f19712a.m10835b("Unknown action type received: %d", Integer.valueOf(i2));
                        zzzVar.m10925g(new Bundle());
                        return;
                    }
                    this.f19715d.m10818a(false);
                    zzci zzciVar2 = this.f19716e;
                    zzciVar2.f19840b.m10834a("Stopping foreground installation service.", new Object[0]);
                    zzciVar2.f19842d.unbindService(zzciVar2);
                    ExtractionForegroundService extractionForegroundService = zzciVar2.f19843e;
                    if (extractionForegroundService != null) {
                        synchronized (extractionForegroundService) {
                            extractionForegroundService.stopForeground(true);
                            extractionForegroundService.stopSelf();
                        }
                    }
                    zzciVar2.m10772a();
                    return;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 26) {
                    String string = bundle.getString("notification_channel_name");
                    synchronized (this) {
                        if (string == null) {
                            string = "File downloads by Play";
                        }
                        this.f19717f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", string, 2));
                    }
                }
                this.f19715d.m10818a(true);
                zzci zzciVar3 = this.f19716e;
                String string2 = bundle.getString("notification_title");
                String string3 = bundle.getString("notification_subtext");
                long j2 = bundle.getLong("notification_timeout", 600000L);
                Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                Notification.Builder timeoutAfter = i3 >= 26 ? new Notification.Builder(this.f19713b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j2) : new Notification.Builder(this.f19713b).setPriority(-2);
                if (parcelable instanceof PendingIntent) {
                    timeoutAfter.setContentIntent((PendingIntent) parcelable);
                }
                Notification.Builder ongoing = timeoutAfter.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false);
                if (string2 == null) {
                    string2 = "Downloading additional file";
                }
                Notification.Builder contentTitle = ongoing.setContentTitle(string2);
                if (string3 == null) {
                    string3 = "Transferring";
                }
                contentTitle.setSubText(string3);
                int i4 = bundle.getInt("notification_color");
                if (i4 != 0) {
                    timeoutAfter.setColor(i4).setVisibility(-1);
                }
                zzciVar3.f19844f = timeoutAfter.build();
                this.f19713b.bindService(new Intent(this.f19713b, (Class<?>) ExtractionForegroundService.class), this.f19716e, 1);
                return;
            }
            zzzVar.m10925g(new Bundle());
        }
    }

    @Override // com.google.android.play.core.internal.zzy
    /* renamed from: v1 */
    public final void mo10718v1(Bundle bundle, com.google.android.play.core.internal.zzz zzzVar) throws RemoteException {
        this.f19712a.m10834a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!com.google.android.play.core.internal.zzch.m10889b(this.f19713b) || !com.google.android.play.core.internal.zzch.m10888a(this.f19713b)) {
            zzzVar.m10925g(new Bundle());
            return;
        }
        zzbh.m10726l(this.f19714c.m10733h());
        Bundle bundle2 = new Bundle();
        Parcel m10912i = zzzVar.m10912i();
        int i2 = com.google.android.play.core.internal.zzm.f20158a;
        m10912i.writeInt(1);
        bundle2.writeToParcel(m10912i, 0);
        zzzVar.m10913q(4, m10912i);
    }
}
