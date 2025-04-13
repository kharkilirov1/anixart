package com.yandex.metrica.impl.p023ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.C8 */
/* loaded from: classes2.dex */
public class C3215C8 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3440L8 f42667a;

    public C3215C8(C4386w8 c4386w8, @NonNull String str) {
        this(new C3490N8(c4386w8), str);
    }

    /* renamed from: a */
    public void m17926a() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f42667a.mo18481a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f42667a.mo18482a(sQLiteDatabase);
    }

    @Nullable
    /* renamed from: b */
    public List<C4028ie> m17927b() {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        try {
            sQLiteDatabase = this.f42667a.mo18481a();
        } catch (Throwable unused) {
            sQLiteDatabase = null;
            cursor = null;
        }
        if (sQLiteDatabase != null) {
            try {
                cursor = sQLiteDatabase.query("permissions", null, null, null, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            ArrayList arrayList = new ArrayList();
                            do {
                                arrayList.add(new C4028ie(cursor.getString(cursor.getColumnIndex("name")), cursor.getLong(cursor.getColumnIndex("granted")) == 1));
                            } while (cursor.moveToNext());
                            this.f42667a.mo18482a(sQLiteDatabase);
                            C3658U2.m19207a(cursor);
                            return arrayList;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable unused3) {
            }
            this.f42667a.mo18482a(sQLiteDatabase);
            C3658U2.m19207a(cursor);
            return null;
        }
        cursor = null;
        this.f42667a.mo18482a(sQLiteDatabase);
        C3658U2.m19207a(cursor);
        return null;
    }

    @VisibleForTesting
    public C3215C8(@NonNull InterfaceC3440L8 interfaceC3440L8, @NonNull String str) {
        this.f42667a = interfaceC3440L8;
    }
}
