package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import p000a.C0000a;

/* loaded from: classes.dex */
final class SchemaManager extends SQLiteOpenHelper {

    /* renamed from: d */
    public static final String f9373d;

    /* renamed from: e */
    public static int f9374e;

    /* renamed from: f */
    public static final Migration f9375f;

    /* renamed from: g */
    public static final Migration f9376g;

    /* renamed from: h */
    public static final Migration f9377h;

    /* renamed from: i */
    public static final Migration f9378i;

    /* renamed from: j */
    public static final Migration f9379j;

    /* renamed from: k */
    public static final List<Migration> f9380k;

    /* renamed from: b */
    public final int f9381b;

    /* renamed from: c */
    public boolean f9382c;

    public interface Migration {
        /* renamed from: a */
        void mo5599a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder m24u = C0000a.m24u("INSERT INTO global_log_event_state VALUES (");
        m24u.append(System.currentTimeMillis());
        m24u.append(")");
        f9373d = m24u.toString();
        f9374e = 5;
        C0931h c0931h = C0931h.f9413b;
        f9375f = c0931h;
        C0931h c0931h2 = C0931h.f9414c;
        f9376g = c0931h2;
        C0931h c0931h3 = C0931h.f9415d;
        f9377h = c0931h3;
        C0931h c0931h4 = C0931h.f9416e;
        f9378i = c0931h4;
        C0931h c0931h5 = C0931h.f9417f;
        f9379j = c0931h5;
        f9380k = Arrays.asList(c0931h, c0931h2, c0931h3, c0931h4, c0931h5);
    }

    @Inject
    public SchemaManager(Context context, @Named String str, @Named int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.f9382c = false;
        this.f9381b = i2;
    }

    /* renamed from: a */
    public final void m5598a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List<Migration> list = f9380k;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                f9380k.get(i2).mo5599a(sQLiteDatabase);
                i2++;
            }
        } else {
            StringBuilder m26w = C0000a.m26w("Migration from ", i2, " to ", i3, " was requested, but cannot be performed. Only ");
            m26w.append(list.size());
            m26w.append(" migrations are provided");
            throw new IllegalArgumentException(m26w.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f9382c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i2 = this.f9381b;
        if (!this.f9382c) {
            onConfigure(sQLiteDatabase);
        }
        m5598a(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f9382c) {
            onConfigure(sQLiteDatabase);
        }
        m5598a(sQLiteDatabase, 0, i3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f9382c) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (!this.f9382c) {
            onConfigure(sQLiteDatabase);
        }
        m5598a(sQLiteDatabase, i2, i3);
    }
}
