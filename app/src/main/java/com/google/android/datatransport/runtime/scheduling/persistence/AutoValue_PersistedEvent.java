package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_PersistedEvent extends PersistedEvent {

    /* renamed from: a */
    public final long f9352a;

    /* renamed from: b */
    public final TransportContext f9353b;

    /* renamed from: c */
    public final EventInternal f9354c;

    public AutoValue_PersistedEvent(long j2, TransportContext transportContext, EventInternal eventInternal) {
        this.f9352a = j2;
        Objects.requireNonNull(transportContext, "Null transportContext");
        this.f9353b = transportContext;
        Objects.requireNonNull(eventInternal, "Null event");
        this.f9354c = eventInternal;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    /* renamed from: a */
    public EventInternal mo5574a() {
        return this.f9354c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    /* renamed from: b */
    public long mo5575b() {
        return this.f9352a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    /* renamed from: c */
    public TransportContext mo5576c() {
        return this.f9353b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        return this.f9352a == persistedEvent.mo5575b() && this.f9353b.equals(persistedEvent.mo5576c()) && this.f9354c.equals(persistedEvent.mo5574a());
    }

    public int hashCode() {
        long j2 = this.f9352a;
        return this.f9354c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f9353b.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("PersistedEvent{id=");
        m24u.append(this.f9352a);
        m24u.append(", transportContext=");
        m24u.append(this.f9353b);
        m24u.append(", event=");
        m24u.append(this.f9354c);
        m24u.append("}");
        return m24u.toString();
    }
}
