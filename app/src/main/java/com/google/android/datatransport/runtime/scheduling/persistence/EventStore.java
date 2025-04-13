package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.io.Closeable;

@WorkerThread
/* loaded from: classes.dex */
public interface EventStore extends Closeable {
    /* renamed from: D */
    void mo5580D(Iterable<PersistedEvent> iterable);

    /* renamed from: P */
    Iterable<PersistedEvent> mo5581P(TransportContext transportContext);

    @Nullable
    /* renamed from: S0 */
    PersistedEvent mo5582S0(TransportContext transportContext, EventInternal eventInternal);

    /* renamed from: U */
    void mo5583U(TransportContext transportContext, long j2);

    /* renamed from: U0 */
    long mo5584U0(TransportContext transportContext);

    /* renamed from: Y0 */
    boolean mo5585Y0(TransportContext transportContext);

    /* renamed from: a0 */
    Iterable<TransportContext> mo5586a0();

    /* renamed from: a1 */
    void mo5587a1(Iterable<PersistedEvent> iterable);

    /* renamed from: z */
    int mo5588z();
}
