package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0926c implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ int f9390a;

    /* renamed from: b */
    public final /* synthetic */ SQLiteEventStore f9391b;

    /* renamed from: c */
    public final /* synthetic */ TransportContext f9392c;

    public /* synthetic */ C0926c(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, int i2) {
        this.f9390a = i2;
        this.f9391b = sQLiteEventStore;
        this.f9392c = transportContext;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        int i2;
        switch (this.f9390a) {
            case 0:
                SQLiteEventStore sQLiteEventStore = this.f9391b;
                TransportContext transportContext = this.f9392c;
                Encoding encoding = SQLiteEventStore.f9360g;
                Long m5596h = sQLiteEventStore.m5596h((SQLiteDatabase) obj, transportContext);
                return m5596h == null ? Boolean.FALSE : (Boolean) SQLiteEventStore.m5593k(sQLiteEventStore.m5595g().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m5596h.toString()}), C0930g.f9409h);
            default:
                SQLiteEventStore sQLiteEventStore2 = this.f9391b;
                TransportContext transportContext2 = this.f9392c;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding2 = SQLiteEventStore.f9360g;
                Objects.requireNonNull(sQLiteEventStore2);
                ArrayList arrayList = new ArrayList();
                Long m5596h2 = sQLiteEventStore2.m5596h(sQLiteDatabase, transportContext2);
                if (m5596h2 == null) {
                    i2 = 2;
                } else {
                    i2 = 2;
                    SQLiteEventStore.m5593k(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m5596h2.toString()}, null, null, null, String.valueOf(sQLiteEventStore2.f9364e.mo5571c())), new C0927d(sQLiteEventStore2, arrayList, transportContext2, i2));
                }
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    sb.append(((PersistedEvent) arrayList.get(i3)).mo5575b());
                    if (i3 < arrayList.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                try {
                    Encoding encoding3 = SQLiteEventStore.f9360g;
                    while (query.moveToNext()) {
                        long j2 = query.getLong(0);
                        Set set = (Set) hashMap.get(Long.valueOf(j2));
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(Long.valueOf(j2), set);
                        }
                        set.add(new SQLiteEventStore.Metadata(query.getString(1), query.getString(i2), null));
                    }
                    query.close();
                    ListIterator listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        PersistedEvent persistedEvent = (PersistedEvent) listIterator.next();
                        if (hashMap.containsKey(Long.valueOf(persistedEvent.mo5575b()))) {
                            EventInternal.Builder m5516j = persistedEvent.mo5574a().m5516j();
                            for (SQLiteEventStore.Metadata metadata : (Set) hashMap.get(Long.valueOf(persistedEvent.mo5575b()))) {
                                m5516j.m5517a(metadata.f9366a, metadata.f9367b);
                            }
                            listIterator.set(new AutoValue_PersistedEvent(persistedEvent.mo5575b(), persistedEvent.mo5576c(), m5516j.mo5492b()));
                        }
                    }
                    return arrayList;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
        }
    }
}
