package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0925b implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ int f9388a;

    /* renamed from: b */
    public final /* synthetic */ SQLiteEventStore f9389b;

    public /* synthetic */ C0925b(SQLiteEventStore sQLiteEventStore, int i2) {
        this.f9388a = i2;
        this.f9389b = sQLiteEventStore;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f9388a) {
            case 0:
                SQLiteEventStore sQLiteEventStore = this.f9389b;
                Cursor cursor = (Cursor) obj;
                Encoding encoding = SQLiteEventStore.f9360g;
                Objects.requireNonNull(sQLiteEventStore);
                while (cursor.moveToNext()) {
                    sQLiteEventStore.mo5579e(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                break;
            case 1:
                SQLiteEventStore sQLiteEventStore2 = this.f9389b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding2 = SQLiteEventStore.f9360g;
                Objects.requireNonNull(sQLiteEventStore2);
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + sQLiteEventStore2.f9362c.mo5600a()).execute();
                break;
            default:
                SQLiteEventStore sQLiteEventStore3 = this.f9389b;
                Cursor cursor2 = (Cursor) obj;
                Encoding encoding3 = SQLiteEventStore.f9360g;
                Objects.requireNonNull(sQLiteEventStore3);
                while (cursor2.moveToNext()) {
                    sQLiteEventStore3.mo5579e(cursor2.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor2.getString(1));
                }
                break;
        }
        return null;
    }
}
