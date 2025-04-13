package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.impl.ob.w8 */
/* loaded from: classes2.dex */
public class C4386w8 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a */
    @NonNull
    private final String f46858a;

    /* renamed from: b */
    private final C3379Im f46859b;

    /* renamed from: c */
    public final C3265E8 f46860c;

    public C4386w8(Context context, @NonNull String str, C3265E8 c3265e8) {
        this(context, str, c3265e8, AbstractC4478zm.m21311a());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @Nullable
    public SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f46859b.m21332a(th, "", new Object[0]);
            this.f46859b.m21334b("Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f46858a);
            ((C3499Nh) C3524Oh.m18679a()).reportError("db_read_error", th);
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @Nullable
    public SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f46859b.m21332a(th, "", new Object[0]);
            this.f46859b.m21334b("Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f46858a);
            ((C3499Nh) C3524Oh.m18679a()).reportError("db_write_error", th);
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f46860c.m18001a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        this.f46860c.m18002a(sQLiteDatabase, i2, i3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        this.f46860c.m18003b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        this.f46860c.m18004b(sQLiteDatabase, i2, i3);
    }

    @VisibleForTesting
    public C4386w8(Context context, @NonNull String str, C3265E8 c3265e8, @NonNull C3379Im c3379Im) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, C3515O8.f43538a);
        this.f46860c = c3265e8;
        this.f46858a = str;
        this.f46859b = c3379Im;
    }
}
