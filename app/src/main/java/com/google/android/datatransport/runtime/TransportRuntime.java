package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.activity.RunnableC0042c;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes.dex */
public class TransportRuntime implements TransportInternal {

    /* renamed from: e */
    public static volatile TransportRuntimeComponent f9165e;

    /* renamed from: a */
    public final Clock f9166a;

    /* renamed from: b */
    public final Clock f9167b;

    /* renamed from: c */
    public final Scheduler f9168c;

    /* renamed from: d */
    public final Uploader f9169d;

    @Inject
    public TransportRuntime(@WallTime Clock clock, @Monotonic Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.f9166a = clock;
        this.f9167b = clock2;
        this.f9168c = scheduler;
        this.f9169d = uploader;
        workInitializer.f9307a.execute(new RunnableC0042c(workInitializer, 3));
    }

    /* renamed from: b */
    public static TransportRuntime m5521b() {
        TransportRuntimeComponent transportRuntimeComponent = f9165e;
        if (transportRuntimeComponent != null) {
            return transportRuntimeComponent.mo5512b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: c */
    public static void m5522c(Context context) {
        if (f9165e == null) {
            synchronized (TransportRuntime.class) {
                if (f9165e == null) {
                    DaggerTransportRuntimeComponent.Builder builder = new DaggerTransportRuntimeComponent.Builder(null);
                    Objects.requireNonNull(context);
                    builder.f9150a = context;
                    f9165e = new DaggerTransportRuntimeComponent(context, null);
                }
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.TransportInternal
    /* renamed from: a */
    public void mo5520a(SendRequest sendRequest, TransportScheduleCallback transportScheduleCallback) {
        Scheduler scheduler = this.f9168c;
        AutoValue_SendRequest autoValue_SendRequest = (AutoValue_SendRequest) sendRequest;
        TransportContext transportContext = autoValue_SendRequest.f9121a;
        Priority mo5398c = autoValue_SendRequest.f9123c.mo5398c();
        Objects.requireNonNull(transportContext);
        TransportContext.Builder m5519a = TransportContext.m5519a();
        m5519a.mo5508b(transportContext.mo5504b());
        m5519a.mo5510d(mo5398c);
        ((AutoValue_TransportContext.Builder) m5519a).f9135b = transportContext.mo5505c();
        TransportContext mo5507a = m5519a.mo5507a();
        EventInternal.Builder m5513a = EventInternal.m5513a();
        m5513a.mo5496f(this.f9166a.mo5600a());
        m5513a.mo5498h(this.f9167b.mo5600a());
        m5513a.mo5497g(autoValue_SendRequest.f9122b);
        m5513a.mo5495e(new EncodedPayload(autoValue_SendRequest.f9125e, autoValue_SendRequest.f9124d.apply(autoValue_SendRequest.f9123c.mo5397b())));
        ((AutoValue_EventInternal.Builder) m5513a).f9116b = autoValue_SendRequest.f9123c.mo5396a();
        scheduler.mo5549a(mo5507a, m5513a.mo5492b(), transportScheduleCallback);
    }

    /* renamed from: d */
    public TransportFactory m5523d(Destination destination) {
        Set unmodifiableSet = destination instanceof EncodedDestination ? Collections.unmodifiableSet(((EncodedDestination) destination).mo5403a()) : Collections.singleton(new Encoding("proto"));
        TransportContext.Builder m5519a = TransportContext.m5519a();
        Objects.requireNonNull(destination);
        m5519a.mo5508b("cct");
        ((AutoValue_TransportContext.Builder) m5519a).f9135b = ((CCTDestination) destination).m5404c();
        return new TransportFactoryImpl(unmodifiableSet, m5519a.mo5507a(), this);
    }
}
