package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.Oa */
/* loaded from: classes2.dex */
class C3517Oa implements InterfaceC4438y8 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3440L8 f43555a;

    public C3517Oa(@NonNull InterfaceC3440L8 interfaceC3440L8, @NonNull String str) {
        this.f43555a = interfaceC3440L8;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4438y8
    /* renamed from: a */
    public void mo18664a(@NonNull String str, @NonNull byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.f43555a.mo18481a();
            if (sQLiteDatabase != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabase.insertWithOnConflict("binary_data", null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    this.f43555a.mo18482a(sQLiteDatabase);
                }
            }
        } catch (Throwable unused2) {
        }
        this.f43555a.mo18482a(sQLiteDatabase);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4438y8
    /* renamed from: b */
    public void mo18666b(@NonNull String str) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f43555a.mo18481a();
            if (sQLiteDatabase != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabase.delete("binary_data", "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f43555a.mo18482a(sQLiteDatabase);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4438y8
    /* renamed from: a */
    public byte[] mo18665a(@NonNull String str) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f43555a.mo18481a();
        } catch (Throwable unused) {
            cursor = null;
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase != null) {
            try {
                cursor = sQLiteDatabase.query("binary_data", null, "data_key = ?", new String[]{str}, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                            byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("value"));
                            C3658U2.m19207a(cursor);
                            this.f43555a.mo18482a(sQLiteDatabase);
                            return blob;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (cursor != null) {
                    cursor.getCount();
                }
            } catch (Throwable unused3) {
            }
            C3658U2.m19207a(cursor);
            this.f43555a.mo18482a(sQLiteDatabase);
            return null;
        }
        cursor = null;
        C3658U2.m19207a(cursor);
        this.f43555a.mo18482a(sQLiteDatabase);
        return null;
    }
}
