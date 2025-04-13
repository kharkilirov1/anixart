package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f9270a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        TransportRuntime.m5522c(context);
        TransportContext.Builder m5519a = TransportContext.m5519a();
        m5519a.mo5508b(queryParameter);
        m5519a.mo5510d(PriorityMapping.m5604b(intValue));
        if (queryParameter2 != null) {
            m5519a.mo5509c(Base64.decode(queryParameter2, 0));
        }
        TransportRuntime.m5521b().f9169d.m5565b(m5519a.mo5507a(), i2, RunnableC0915a.f9315c);
    }
}
