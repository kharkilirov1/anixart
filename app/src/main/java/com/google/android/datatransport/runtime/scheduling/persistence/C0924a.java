package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0924a implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ int f9386a;

    /* renamed from: b */
    public final /* synthetic */ long f9387b;

    public /* synthetic */ C0924a(long j2, int i2) {
        this.f9386a = i2;
        this.f9387b = j2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f9386a) {
            case 0:
                long j2 = this.f9387b;
                Encoding encoding = SQLiteEventStore.f9360g;
                return (TimeWindow) SQLiteEventStore.m5593k(((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C0924a(j2, 1));
            default:
                long j3 = this.f9387b;
                Cursor cursor = (Cursor) obj;
                Encoding encoding2 = SQLiteEventStore.f9360g;
                cursor.moveToNext();
                long j4 = cursor.getLong(0);
                TimeWindow.Builder builder = new TimeWindow.Builder();
                builder.f9247a = j4;
                builder.f9248b = j3;
                return new TimeWindow(j4, j3);
        }
    }
}
