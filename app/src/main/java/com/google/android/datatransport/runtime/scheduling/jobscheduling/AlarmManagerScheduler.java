package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;

/* loaded from: classes.dex */
public class AlarmManagerScheduler implements WorkScheduler {

    /* renamed from: a */
    public final Context f9265a;

    /* renamed from: b */
    public final EventStore f9266b;

    /* renamed from: c */
    public AlarmManager f9267c;

    /* renamed from: d */
    public final SchedulerConfig f9268d;

    /* renamed from: e */
    public final Clock f9269e;

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    /* renamed from: a */
    public void mo5550a(TransportContext transportContext, int i2) {
        mo5551b(transportContext, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    /* renamed from: b */
    public void mo5551b(TransportContext transportContext, int i2, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", transportContext.mo5504b());
        builder.appendQueryParameter("priority", String.valueOf(PriorityMapping.m5603a(transportContext.mo5506d())));
        if (transportContext.mo5505c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(transportContext.mo5505c(), 0));
        }
        Intent intent = new Intent(this.f9265a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (!z) {
            if (PendingIntent.getBroadcast(this.f9265a, 0, intent, 536870912) != null) {
                Logging.m5544a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
                return;
            }
        }
        long mo5584U0 = this.f9266b.mo5584U0(transportContext);
        long m5562c = this.f9268d.m5562c(transportContext.mo5506d(), mo5584U0, i2);
        Logging.m5545b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Long.valueOf(m5562c), Long.valueOf(mo5584U0), Integer.valueOf(i2));
        this.f9267c.set(3, this.f9269e.mo5600a() + m5562c, PendingIntent.getBroadcast(this.f9265a, 0, intent, 0));
    }
}
