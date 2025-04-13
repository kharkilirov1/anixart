package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.WorkerThread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.fg */
/* loaded from: classes3.dex */
final class C5077fg {

    /* renamed from: c */
    private static final String[] f50256c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a */
    private final InterfaceC5292jm f50257a;

    /* renamed from: b */
    private String f50258b;

    public C5077fg(C4986ds c4986ds) {
        this.f50257a = c4986ds;
    }

    @WorkerThread
    /* renamed from: a */
    public final void m24585a(long j2) throws C5239im {
        try {
            String hexString = Long.toHexString(j2);
            this.f50258b = "ExoPlayerCacheFileMetadata" + hexString;
            if (mb1.m26606a(this.f50257a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f50257a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    mb1.m26607a(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f50258b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f50258b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw new C5239im(th2);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void m24587a(String str, long j2, long j3) throws C5239im {
        Objects.requireNonNull(this.f50258b);
        try {
            SQLiteDatabase writableDatabase = this.f50257a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j2));
            contentValues.put("last_touch_timestamp", Long.valueOf(j3));
            writableDatabase.replaceOrThrow(this.f50258b, null, contentValues);
        } catch (Throwable th) {
            throw new C5239im(th);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void m24586a(String str) throws C5239im {
        Objects.requireNonNull(this.f50258b);
        try {
            this.f50257a.getWritableDatabase().delete(this.f50258b, "name = ?", new String[]{str});
        } catch (Throwable th) {
            throw new C5239im(th);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void m24588a(Set<String> set) throws C5239im {
        Objects.requireNonNull(this.f50258b);
        try {
            SQLiteDatabase writableDatabase = this.f50257a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f50258b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (Throwable th) {
            throw new C5239im(th);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final HashMap m24584a() throws C5239im {
        try {
            Objects.requireNonNull(this.f50258b);
            Cursor query = this.f50257a.getReadableDatabase().query(this.f50258b, f50256c, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    Objects.requireNonNull(string);
                    hashMap.put(string, new C5024eg(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (Throwable th) {
            throw new C5239im(th);
        }
    }
}
