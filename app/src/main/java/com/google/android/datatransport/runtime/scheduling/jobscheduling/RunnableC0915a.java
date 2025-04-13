package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.swiftsoft.anixartd.p015ui.CustomClickListener;
import com.swiftsoft.anixartd.p015ui.fragment.main.notifications.NotificationsFragment;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnNotificationsRead;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0915a implements Runnable {

    /* renamed from: c */
    public static final /* synthetic */ RunnableC0915a f9315c = new RunnableC0915a(0);

    /* renamed from: d */
    public static final /* synthetic */ RunnableC0915a f9316d = new RunnableC0915a(1);

    /* renamed from: e */
    public static final /* synthetic */ RunnableC0915a f9317e = new RunnableC0915a(2);

    /* renamed from: f */
    public static final /* synthetic */ RunnableC0915a f9318f = new RunnableC0915a(3);

    /* renamed from: b */
    public final /* synthetic */ int f9319b;

    public /* synthetic */ RunnableC0915a(int i2) {
        this.f9319b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9319b) {
            case 0:
                int i2 = AlarmManagerSchedulerBroadcastReceiver.f9270a;
                break;
            case 1:
                CustomClickListener.f27398b = true;
                break;
            case 2:
                KProperty<Object>[] kPropertyArr = NotificationsFragment.f28273i;
                EventBusKt.m16327a(new OnNotificationsRead());
                break;
            default:
                KProperty<Object>[] kPropertyArr2 = NotificationsFragment.f28273i;
                EventBusKt.m16327a(new OnNotificationsRead());
                break;
        }
    }
}
