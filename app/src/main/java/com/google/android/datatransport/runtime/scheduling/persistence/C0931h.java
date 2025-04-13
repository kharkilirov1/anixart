package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C0931h implements SchemaManager.Migration {

    /* renamed from: b */
    public static final /* synthetic */ C0931h f9413b = new C0931h(0);

    /* renamed from: c */
    public static final /* synthetic */ C0931h f9414c = new C0931h(1);

    /* renamed from: d */
    public static final /* synthetic */ C0931h f9415d = new C0931h(2);

    /* renamed from: e */
    public static final /* synthetic */ C0931h f9416e = new C0931h(3);

    /* renamed from: f */
    public static final /* synthetic */ C0931h f9417f = new C0931h(4);

    /* renamed from: a */
    public final /* synthetic */ int f9418a;

    public /* synthetic */ C0931h(int i2) {
        this.f9418a = i2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
    /* renamed from: a */
    public final void mo5599a(SQLiteDatabase sQLiteDatabase) {
        switch (this.f9418a) {
            case 0:
                String str = SchemaManager.f9373d;
                sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                break;
            case 1:
                String str2 = SchemaManager.f9373d;
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                break;
            case 2:
                String str3 = SchemaManager.f9373d;
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                break;
            case 3:
                String str4 = SchemaManager.f9373d;
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                break;
            default:
                String str5 = SchemaManager.f9373d;
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                sQLiteDatabase.execSQL(SchemaManager.f9373d);
                break;
        }
    }
}
