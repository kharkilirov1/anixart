package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C0930g implements SQLiteEventStore.Function {

    /* renamed from: b */
    public static final /* synthetic */ C0930g f9403b = new C0930g(0);

    /* renamed from: c */
    public static final /* synthetic */ C0930g f9404c = new C0930g(1);

    /* renamed from: d */
    public static final /* synthetic */ C0930g f9405d = new C0930g(2);

    /* renamed from: e */
    public static final /* synthetic */ C0930g f9406e = new C0930g(3);

    /* renamed from: f */
    public static final /* synthetic */ C0930g f9407f = new C0930g(4);

    /* renamed from: g */
    public static final /* synthetic */ C0930g f9408g = new C0930g(5);

    /* renamed from: h */
    public static final /* synthetic */ C0930g f9409h = new C0930g(6);

    /* renamed from: i */
    public static final /* synthetic */ C0930g f9410i = new C0930g(7);

    /* renamed from: j */
    public static final /* synthetic */ C0930g f9411j = new C0930g(8);

    /* renamed from: a */
    public final /* synthetic */ int f9412a;

    public /* synthetic */ C0930g(int i2) {
        this.f9412a = i2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f9412a) {
            case 0:
                Encoding encoding = SQLiteEventStore.f9360g;
                return (List) SQLiteEventStore.m5593k(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), f9407f);
            case 1:
                Encoding encoding2 = SQLiteEventStore.f9360g;
                throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
            case 2:
                Cursor cursor = (Cursor) obj;
                Encoding encoding3 = SQLiteEventStore.f9360g;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case 3:
                Encoding encoding4 = SQLiteEventStore.f9360g;
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 4:
                Cursor cursor2 = (Cursor) obj;
                Encoding encoding5 = SQLiteEventStore.f9360g;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    TransportContext.Builder m5519a = TransportContext.m5519a();
                    m5519a.mo5508b(cursor2.getString(1));
                    m5519a.mo5510d(PriorityMapping.m5604b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    m5519a.mo5509c(string == null ? null : Base64.decode(string, 0));
                    arrayList.add(m5519a.mo5507a());
                }
                return arrayList;
            case 5:
                Encoding encoding6 = SQLiteEventStore.f9360g;
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            case 6:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 7:
                Cursor cursor3 = (Cursor) obj;
                Encoding encoding7 = SQLiteEventStore.f9360g;
                if (cursor3.moveToNext()) {
                    return Long.valueOf(cursor3.getLong(0));
                }
                return null;
            default:
                Cursor cursor4 = (Cursor) obj;
                Encoding encoding8 = SQLiteEventStore.f9360g;
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                while (cursor4.moveToNext()) {
                    byte[] blob = cursor4.getBlob(0);
                    arrayList2.add(blob);
                    i2 += blob.length;
                }
                byte[] bArr = new byte[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i4);
                    System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                    i3 += bArr2.length;
                }
                return bArr;
        }
    }
}
