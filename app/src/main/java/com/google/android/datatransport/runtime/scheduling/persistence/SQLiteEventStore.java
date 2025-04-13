package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.dagger.Lazy;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import p000a.C0000a;

@Singleton
@WorkerThread
/* loaded from: classes.dex */
public class SQLiteEventStore implements EventStore, SynchronizationGuard, ClientHealthMetricsStore {

    /* renamed from: g */
    public static final Encoding f9360g = new Encoding("proto");

    /* renamed from: b */
    public final SchemaManager f9361b;

    /* renamed from: c */
    public final Clock f9362c;

    /* renamed from: d */
    public final Clock f9363d;

    /* renamed from: e */
    public final EventStoreConfig f9364e;

    /* renamed from: f */
    public final Lazy<String> f9365f;

    public interface Function<T, U> {
        U apply(T t);
    }

    public static class Metadata {

        /* renamed from: a */
        public final String f9366a;

        /* renamed from: b */
        public final String f9367b;

        public Metadata(String str, String str2, C09231 c09231) {
            this.f9366a = str;
            this.f9367b = str2;
        }
    }

    public interface Producer<T> {
    }

    @Inject
    public SQLiteEventStore(@WallTime Clock clock, @Monotonic Clock clock2, EventStoreConfig eventStoreConfig, SchemaManager schemaManager, @Named Lazy<String> lazy) {
        this.f9361b = schemaManager;
        this.f9362c = clock;
        this.f9363d = clock2;
        this.f9364e = eventStoreConfig;
        this.f9365f = lazy;
    }

    /* renamed from: j */
    public static String m5592j(Iterable<PersistedEvent> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<PersistedEvent> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo5575b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: k */
    public static <T> T m5593k(Cursor cursor, Function<Cursor, T> function) {
        try {
            return function.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    /* renamed from: D */
    public void mo5580D(Iterable<PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder m24u = C0000a.m24u("DELETE FROM events WHERE _id in ");
            m24u.append(m5592j(iterable));
            m5595g().compileStatement(m24u.toString()).execute();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    /* renamed from: P */
    public Iterable<PersistedEvent> mo5581P(TransportContext transportContext) {
        return (Iterable) m5597i(new C0926c(this, transportContext, 1));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    @Nullable
    /* renamed from: S0 */
    public PersistedEvent mo5582S0(TransportContext transportContext, EventInternal eventInternal) {
        Logging.m5545b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", transportContext.mo5506d(), eventInternal.mo5490h(), transportContext.mo5504b());
        long longValue = ((Long) m5597i(new C0927d(this, eventInternal, transportContext, 0))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new AutoValue_PersistedEvent(longValue, transportContext, eventInternal);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    /* renamed from: U */
    public void mo5583U(TransportContext transportContext, long j2) {
        m5597i(new C0928e(j2, transportContext));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    /* renamed from: U0 */
    public long mo5584U0(TransportContext transportContext) {
        return ((Long) m5593k(m5595g().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext.mo5504b(), String.valueOf(PriorityMapping.m5603a(transportContext.mo5506d()))}), C0930g.f9405d)).longValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    /* renamed from: Y0 */
    public boolean mo5585Y0(TransportContext transportContext) {
        return ((Boolean) m5597i(new C0926c(this, transportContext, 0))).booleanValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    /* renamed from: a */
    public void mo5577a() {
        m5597i(new C0925b(this, 1));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    /* renamed from: a0 */
    public Iterable<TransportContext> mo5586a0() {
        return (Iterable) m5597i(C0930g.f9403b);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    /* renamed from: a1 */
    public void mo5587a1(Iterable<PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder m24u = C0000a.m24u("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            m24u.append(m5592j(iterable));
            m5597i(new C0927d(this, m24u.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 1));
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    /* renamed from: b */
    public <T> T mo5594b(SynchronizationGuard.CriticalSection<T> criticalSection) {
        SQLiteDatabase m5595g = m5595g();
        C0930g c0930g = C0930g.f9406e;
        long mo5600a = this.f9363d.mo5600a();
        while (true) {
            try {
                m5595g.beginTransaction();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f9363d.mo5600a() >= this.f9364e.mo5569a() + mo5600a) {
                    c0930g.apply(e2);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        try {
            T execute = criticalSection.execute();
            m5595g.setTransactionSuccessful();
            return execute;
        } finally {
            m5595g.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    /* renamed from: c */
    public ClientMetrics mo5578c() {
        int i2 = ClientMetrics.f9212e;
        ClientMetrics.Builder builder = new ClientMetrics.Builder();
        HashMap hashMap = new HashMap();
        SQLiteDatabase m5595g = m5595g();
        m5595g.beginTransaction();
        try {
            Objects.requireNonNull(this);
            ClientMetrics clientMetrics = (ClientMetrics) m5593k(m5595g.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0927d(this, hashMap, builder, 3));
            m5595g.setTransactionSuccessful();
            return clientMetrics;
        } finally {
            m5595g.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9361b.close();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    /* renamed from: e */
    public void mo5579e(final long j2, final LogEventDropped.Reason reason, final String str) {
        m5597i(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.f
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                String str2 = str;
                LogEventDropped.Reason reason2 = reason;
                long j3 = j2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.f9360g;
                if (((Boolean) SQLiteEventStore.m5593k(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(reason2.f9235b)}), C0930g.f9408g)).booleanValue()) {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j3 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(reason2.f9235b)});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(reason2.f9235b));
                    contentValues.put("events_dropped_count", Long.valueOf(j3));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    @VisibleForTesting
    /* renamed from: g */
    public SQLiteDatabase m5595g() {
        Object apply;
        SchemaManager schemaManager = this.f9361b;
        Objects.requireNonNull(schemaManager);
        C0930g c0930g = C0930g.f9404c;
        long mo5600a = this.f9363d.mo5600a();
        while (true) {
            try {
                apply = schemaManager.getWritableDatabase();
                break;
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f9363d.mo5600a() >= this.f9364e.mo5569a() + mo5600a) {
                    apply = c0930g.apply(e2);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        return (SQLiteDatabase) apply;
    }

    @Nullable
    /* renamed from: h */
    public final Long m5596h(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(transportContext.mo5504b(), String.valueOf(PriorityMapping.m5603a(transportContext.mo5506d()))));
        if (transportContext.mo5505c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transportContext.mo5505c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m5593k(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), C0930g.f9410i);
    }

    @VisibleForTesting
    /* renamed from: i */
    public <T> T m5597i(Function<SQLiteDatabase, T> function) {
        SQLiteDatabase m5595g = m5595g();
        m5595g.beginTransaction();
        try {
            T apply = function.apply(m5595g);
            m5595g.setTransactionSuccessful();
            return apply;
        } finally {
            m5595g.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    /* renamed from: z */
    public int mo5588z() {
        return ((Integer) m5597i(new C0928e(this, this.f9362c.mo5600a() - this.f9364e.mo5570b()))).intValue();
    }
}
