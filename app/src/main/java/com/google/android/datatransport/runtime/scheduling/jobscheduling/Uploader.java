package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.view.inputmethod.C0273a;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.firestore.local.SQLiteDocumentOverlayCache;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* loaded from: classes.dex */
public class Uploader {

    /* renamed from: a */
    public final Context f9289a;

    /* renamed from: b */
    public final BackendRegistry f9290b;

    /* renamed from: c */
    public final EventStore f9291c;

    /* renamed from: d */
    public final WorkScheduler f9292d;

    /* renamed from: e */
    public final Executor f9293e;

    /* renamed from: f */
    public final SynchronizationGuard f9294f;

    /* renamed from: g */
    public final Clock f9295g;

    /* renamed from: h */
    public final Clock f9296h;

    /* renamed from: i */
    public final ClientHealthMetricsStore f9297i;

    @Inject
    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock, @Monotonic Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.f9289a = context;
        this.f9290b = backendRegistry;
        this.f9291c = eventStore;
        this.f9292d = workScheduler;
        this.f9293e = executor;
        this.f9294f = synchronizationGuard;
        this.f9295g = clock;
        this.f9296h = clock2;
        this.f9297i = clientHealthMetricsStore;
    }

    /* renamed from: a */
    public BackendResponse m5564a(final TransportContext transportContext, int i2) {
        TransportBackend transportBackend = this.f9290b.get(transportContext.mo5504b());
        long j2 = 0;
        BackendResponse m5538e = BackendResponse.m5538e(0L);
        while (true) {
            if (!((Boolean) this.f9294f.mo5594b(new SynchronizationGuard.CriticalSection(this) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b

                /* renamed from: c */
                public final /* synthetic */ Uploader f9321c;

                {
                    this.f9321c = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    switch (r3) {
                        case 0:
                            Uploader uploader = this.f9321c;
                            return Boolean.valueOf(uploader.f9291c.mo5585Y0(transportContext));
                        default:
                            Uploader uploader2 = this.f9321c;
                            return uploader2.f9291c.mo5581P(transportContext);
                    }
                }
            })).booleanValue()) {
                this.f9294f.mo5594b(new C0920f(this, transportContext, j2, 0));
                return m5538e;
            }
            final int i3 = 1;
            final Iterable iterable = (Iterable) this.f9294f.mo5594b(new SynchronizationGuard.CriticalSection(this) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b

                /* renamed from: c */
                public final /* synthetic */ Uploader f9321c;

                {
                    this.f9321c = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    switch (i3) {
                        case 0:
                            Uploader uploader = this.f9321c;
                            return Boolean.valueOf(uploader.f9291c.mo5585Y0(transportContext));
                        default:
                            Uploader uploader2 = this.f9321c;
                            return uploader2.f9291c.mo5581P(transportContext);
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return m5538e;
            }
            if (transportBackend == null) {
                Logging.m5544a("Uploader", "Unknown backend for %s, deleting event batch for it...", transportContext);
                m5538e = BackendResponse.m5536a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PersistedEvent) it.next()).mo5574a());
                }
                if (transportContext.mo5505c() != null) {
                    SynchronizationGuard synchronizationGuard = this.f9294f;
                    ClientHealthMetricsStore clientHealthMetricsStore = this.f9297i;
                    Objects.requireNonNull(clientHealthMetricsStore);
                    ClientMetrics clientMetrics = (ClientMetrics) synchronizationGuard.mo5594b(new C0273a(clientHealthMetricsStore, 3));
                    EventInternal.Builder m5513a = EventInternal.m5513a();
                    m5513a.mo5496f(this.f9295g.mo5600a());
                    m5513a.mo5498h(this.f9296h.mo5600a());
                    m5513a.mo5497g("GDT_CLIENT_METRICS");
                    Encoding encoding = new Encoding("proto");
                    Objects.requireNonNull(clientMetrics);
                    ProtobufEncoder protobufEncoder = ProtoEncoderDoNotUse.f9154a;
                    Objects.requireNonNull(protobufEncoder);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        protobufEncoder.m12386a(clientMetrics, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    m5513a.mo5495e(new EncodedPayload(encoding, byteArrayOutputStream.toByteArray()));
                    arrayList.add(transportBackend.mo5407b(m5513a.mo5492b()));
                }
                BackendRequest.Builder m5535a = BackendRequest.m5535a();
                m5535a.mo5527b(arrayList);
                m5535a.mo5528c(transportContext.mo5505c());
                m5538e = transportBackend.mo5406a(m5535a.mo5526a());
            }
            if (m5538e.mo5530c() == BackendResponse.Status.TRANSIENT_ERROR) {
                final long j3 = j2;
                this.f9294f.mo5594b(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.c
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        Uploader uploader = Uploader.this;
                        Iterable<PersistedEvent> iterable2 = iterable;
                        TransportContext transportContext2 = transportContext;
                        long j4 = j3;
                        uploader.f9291c.mo5587a1(iterable2);
                        uploader.f9291c.mo5583U(transportContext2, uploader.f9295g.mo5600a() + j4);
                        return null;
                    }
                });
                this.f9292d.mo5551b(transportContext, i2 + 1, true);
                return m5538e;
            }
            this.f9294f.mo5594b(new C0919e(this, iterable, r6));
            if (m5538e.mo5530c() == BackendResponse.Status.OK) {
                j2 = Math.max(j2, m5538e.mo5529b());
                if ((transportContext.mo5505c() != null ? 1 : 0) != 0) {
                    this.f9294f.mo5594b(new C0273a(this, 2));
                }
            } else if (m5538e.mo5530c() == BackendResponse.Status.INVALID_PAYLOAD) {
                HashMap hashMap = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String mo5490h = ((PersistedEvent) it2.next()).mo5574a().mo5490h();
                    if (hashMap.containsKey(mo5490h)) {
                        hashMap.put(mo5490h, Integer.valueOf(((Integer) hashMap.get(mo5490h)).intValue() + 1));
                    } else {
                        hashMap.put(mo5490h, 1);
                    }
                }
                this.f9294f.mo5594b(new C0919e(this, hashMap, i3));
            }
        }
    }

    /* renamed from: b */
    public void m5565b(final TransportContext transportContext, final int i2, final Runnable runnable) {
        final int i3 = 0;
        this.f9293e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        Uploader uploader = (Uploader) this;
                        TransportContext transportContext2 = (TransportContext) transportContext;
                        int i4 = i2;
                        Runnable runnable2 = (Runnable) runnable;
                        Objects.requireNonNull(uploader);
                        try {
                            try {
                                SynchronizationGuard synchronizationGuard = uploader.f9294f;
                                EventStore eventStore = uploader.f9291c;
                                Objects.requireNonNull(eventStore);
                                synchronizationGuard.mo5594b(new C0273a(eventStore, 1));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) uploader.f9289a.getSystemService("connectivity")).getActiveNetworkInfo();
                                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                                    uploader.m5564a(transportContext2, i4);
                                } else {
                                    uploader.f9294f.mo5594b(new C0918d(uploader, transportContext2, i4));
                                }
                            } catch (SynchronizationException unused) {
                                uploader.f9292d.mo5550a(transportContext2, i4 + 1);
                            }
                            return;
                        } finally {
                            runnable2.run();
                        }
                    default:
                        ((SQLiteDocumentOverlayCache) this).m12407a((byte[]) transportContext, i2);
                        throw null;
                }
            }
        });
    }
}
