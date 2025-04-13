package p005c;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import java.util.Objects;
import java.util.logging.Logger;

/* compiled from: R8$$SyntheticClass */
/* renamed from: c.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0695b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f6837b;

    /* renamed from: c */
    public final /* synthetic */ Object f6838c;

    /* renamed from: d */
    public final /* synthetic */ Object f6839d;

    /* renamed from: e */
    public final /* synthetic */ Object f6840e;

    /* renamed from: f */
    public final /* synthetic */ Object f6841f;

    public /* synthetic */ RunnableC0695b(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f6837b = i2;
        this.f6838c = obj;
        this.f6839d = obj2;
        this.f6840e = obj3;
        this.f6841f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6837b) {
            case 0:
                DefaultScheduler defaultScheduler = (DefaultScheduler) this.f6838c;
                TransportContext transportContext = (TransportContext) this.f6839d;
                TransportScheduleCallback transportScheduleCallback = (TransportScheduleCallback) this.f6840e;
                EventInternal eventInternal = (EventInternal) this.f6841f;
                Logger logger = DefaultScheduler.f9249f;
                Objects.requireNonNull(defaultScheduler);
                try {
                    TransportBackend transportBackend = defaultScheduler.f9252c.get(transportContext.mo5504b());
                    if (transportBackend == null) {
                        String format = String.format("Transport backend '%s' is not registered", transportContext.mo5504b());
                        DefaultScheduler.f9249f.warning(format);
                        transportScheduleCallback.mo4129b(new IllegalArgumentException(format));
                    } else {
                        defaultScheduler.f9254e.mo5594b(new C0694a(defaultScheduler, transportContext, transportBackend.mo5407b(eventInternal)));
                        transportScheduleCallback.mo4129b(null);
                    }
                    break;
                } catch (Exception e2) {
                    DefaultScheduler.f9249f.warning("Error scheduling event " + e2.getMessage());
                    transportScheduleCallback.mo4129b(e2);
                    return;
                }
            default:
                ((MediaSourceEventListener) this.f6839d).mo5897h(((MediaSourceEventListener.EventDispatcher) this.f6838c).f12361a, (MediaSource.MediaPeriodId) this.f6840e, (MediaLoadData) this.f6841f);
                break;
        }
    }
}
