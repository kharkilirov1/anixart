package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0928e implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ int f9397a = 1;

    /* renamed from: b */
    public final /* synthetic */ long f9398b;

    /* renamed from: c */
    public final /* synthetic */ Object f9399c;

    public /* synthetic */ C0928e(long j2, TransportContext transportContext) {
        this.f9398b = j2;
        this.f9399c = transportContext;
    }

    public /* synthetic */ C0928e(SQLiteEventStore sQLiteEventStore, long j2) {
        this.f9399c = sQLiteEventStore;
        this.f9398b = j2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f9397a) {
            case 0:
                SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) this.f9399c;
                long j2 = this.f9398b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.f9360g;
                Objects.requireNonNull(sQLiteEventStore);
                String[] strArr = {String.valueOf(j2)};
                SQLiteEventStore.m5593k(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C0925b(sQLiteEventStore, 0));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                long j3 = this.f9398b;
                TransportContext transportContext = (TransportContext) this.f9399c;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                Encoding encoding2 = SQLiteEventStore.f9360g;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j3));
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transportContext.mo5504b(), String.valueOf(PriorityMapping.m5603a(transportContext.mo5506d()))}) < 1) {
                    contentValues.put("backend_name", transportContext.mo5504b());
                    contentValues.put("priority", Integer.valueOf(PriorityMapping.m5603a(transportContext.mo5506d())));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }
}
