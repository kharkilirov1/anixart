package com.yandex.metrica.impl.p023ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.G8 */
/* loaded from: classes2.dex */
public class C3315G8 implements InterfaceC3290F8 {

    /* renamed from: a */
    private final HashMap<String, List<String>> f42981a;

    public C3315G8(@NonNull String str, @NonNull HashMap<String, List<String>> hashMap) {
        this.f42981a = hashMap;
    }

    /* renamed from: a */
    public boolean m18131a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z = true;
            for (Map.Entry<String, List<String>> entry : this.f42981a.entrySet()) {
                try {
                    Cursor query = sQLiteDatabase.query(entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        C3658U2.m19207a(query);
                        return false;
                    }
                    entry.getKey();
                    List<String> value = entry.getValue();
                    List asList = Arrays.asList(query.getColumnNames());
                    Collections.sort(asList);
                    z &= value.equals(asList);
                    C3658U2.m19207a(query);
                } catch (Throwable th) {
                    C3658U2.m19207a((Cursor) null);
                    throw th;
                }
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
