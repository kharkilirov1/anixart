package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.r8 */
/* loaded from: classes2.dex */
public abstract class AbstractC4256r8 {

    /* renamed from: a */
    @NonNull
    private final C4386w8 f46295a;

    /* renamed from: b */
    @NonNull
    private final C3340H8 f46296b;

    /* renamed from: f */
    @NonNull
    private final ContentValues f46300f = new ContentValues();

    /* renamed from: c */
    @NonNull
    private final AtomicLong f46297c = new AtomicLong(m20643d());

    /* renamed from: d */
    @NonNull
    private final AtomicLong f46298d = new AtomicLong(m20644a(Long.MAX_VALUE));

    /* renamed from: e */
    @NonNull
    private final AtomicLong f46299e = new AtomicLong(mo17819a());

    public AbstractC4256r8(@NonNull C4386w8 c4386w8, @NonNull C3340H8 c3340h8) {
        this.f46295a = c4386w8;
        this.f46296b = c3340h8;
    }

    /* renamed from: d */
    private long m20643d() {
        try {
            SQLiteDatabase readableDatabase = this.f46295a.getReadableDatabase();
            if (readableDatabase != null) {
                return C4013i.m20028a(readableDatabase, mo17821e());
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: a */
    public abstract long mo17819a();

    /* renamed from: a */
    public synchronized void m20646a(long j2, String str) {
        try {
            SQLiteDatabase writableDatabase = this.f46295a.getWritableDatabase();
            if (writableDatabase != null) {
                this.f46300f.clear();
                this.f46300f.put("incremental_id", Long.valueOf(this.f46299e.get() + 1));
                this.f46300f.put("timestamp", Long.valueOf(j2));
                this.f46300f.put("data", str);
                if (writableDatabase.insert(mo17821e(), null, this.f46300f) != -1) {
                    this.f46297c.incrementAndGet();
                    this.f46299e.incrementAndGet();
                    mo17820b(this.f46299e.get());
                    if (this.f46298d.get() > j2) {
                        this.f46298d.set(j2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public long m20648b() {
        return this.f46298d.get();
    }

    /* renamed from: b */
    public abstract void mo17820b(long j2);

    /* renamed from: c */
    public long m20650c() {
        return this.f46297c.get();
    }

    /* renamed from: e */
    public abstract String mo17821e();

    @NonNull
    /* renamed from: f */
    public C3340H8 m20651f() {
        return this.f46296b;
    }

    /* renamed from: b */
    public synchronized int m20647b(int i2) {
        int i3 = 0;
        if (i2 < 1) {
            return 0;
        }
        String format = String.format(Locale.US, "%1$s <= (select max(%1$s) from (select %1$s from %2$s order by %1$s limit ?))", "incremental_id", mo17821e());
        try {
            SQLiteDatabase writableDatabase = this.f46295a.getWritableDatabase();
            if (writableDatabase != null && (i3 = writableDatabase.delete(mo17821e(), format, new String[]{String.valueOf(i2)})) > 0) {
                this.f46297c.getAndAdd(-i3);
                this.f46298d.set(m20644a(Long.MAX_VALUE));
            }
        } catch (Throwable unused) {
        }
        return i3;
    }

    /* renamed from: c */
    public synchronized int m20649c(long j2) {
        int i2;
        i2 = 0;
        String format = String.format(Locale.US, "%s <= ?", "incremental_id");
        try {
            SQLiteDatabase writableDatabase = this.f46295a.getWritableDatabase();
            if (writableDatabase != null && (i2 = writableDatabase.delete(mo17821e(), format, new String[]{String.valueOf(j2)})) > 0) {
                this.f46297c.getAndAdd(-i2);
                this.f46298d.set(m20644a(Long.MAX_VALUE));
            }
        } catch (Throwable unused) {
        }
        return i2;
    }

    /* renamed from: a */
    public long m20644a(long j2) {
        String format = String.format(Locale.US, "Select min(%s) from %s", "timestamp", mo17821e());
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f46295a.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(format, null);
                if (cursor.moveToFirst()) {
                    long j3 = cursor.getLong(0);
                    if (j3 != 0) {
                        j2 = j3;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        C3658U2.m19207a(cursor);
        return j2;
    }

    @NonNull
    /* renamed from: a */
    public synchronized Map<Long, String> m20645a(int i2) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f46295a.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.query(mo17821e(), new String[]{"incremental_id", "data"}, null, null, null, null, "incremental_id ASC", String.valueOf(i2));
                while (cursor.moveToNext()) {
                    this.f46300f.clear();
                    try {
                        C4013i.m20034a(cursor, this.f46300f);
                    } catch (Throwable unused) {
                    }
                    Long asLong = this.f46300f.getAsLong("incremental_id");
                    String asString = this.f46300f.getAsString("data");
                    if (asLong != null && asString != null) {
                        linkedHashMap.put(asLong, asString);
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        C3658U2.m19207a(cursor);
        return linkedHashMap;
    }
}
