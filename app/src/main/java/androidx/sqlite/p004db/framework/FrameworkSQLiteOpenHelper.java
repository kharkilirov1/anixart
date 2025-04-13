package androidx.sqlite.p004db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {

    /* renamed from: b */
    public final Context f6025b;

    /* renamed from: c */
    public final String f6026c;

    /* renamed from: d */
    public final SupportSQLiteOpenHelper.Callback f6027d;

    /* renamed from: e */
    public final boolean f6028e;

    /* renamed from: f */
    public final Object f6029f = new Object();

    /* renamed from: g */
    public OpenHelper f6030g;

    /* renamed from: h */
    public boolean f6031h;

    public static class OpenHelper extends SQLiteOpenHelper {

        /* renamed from: b */
        public final FrameworkSQLiteDatabase[] f6032b;

        /* renamed from: c */
        public final SupportSQLiteOpenHelper.Callback f6033c;

        /* renamed from: d */
        public boolean f6034d;

        public OpenHelper(Context context, String str, final FrameworkSQLiteDatabase[] frameworkSQLiteDatabaseArr, final SupportSQLiteOpenHelper.Callback callback) {
            super(context, str, null, callback.f6013a, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.1
                @Override // android.database.DatabaseErrorHandler
                public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    SupportSQLiteOpenHelper.Callback callback2 = SupportSQLiteOpenHelper.Callback.this;
                    FrameworkSQLiteDatabase m4156c = OpenHelper.m4156c(frameworkSQLiteDatabaseArr, sQLiteDatabase);
                    Objects.requireNonNull(callback2);
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + m4156c.mo4041t());
                    if (!m4156c.isOpen()) {
                        callback2.m4153a(m4156c.mo4041t());
                        return;
                    }
                    List<Pair<String, String>> list = null;
                    try {
                        try {
                            list = m4156c.mo4030E();
                        } finally {
                            if (list != null) {
                                Iterator<Pair<String, String>> it = list.iterator();
                                while (it.hasNext()) {
                                    callback2.m4153a((String) it.next().second);
                                }
                            } else {
                                callback2.m4153a(m4156c.mo4041t());
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        m4156c.close();
                    } catch (IOException unused2) {
                    }
                }
            });
            this.f6033c = callback;
            this.f6032b = frameworkSQLiteDatabaseArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        
            if ((r1.f6022b == r3) == false) goto L9;
         */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static androidx.sqlite.p004db.framework.FrameworkSQLiteDatabase m4156c(androidx.sqlite.p004db.framework.FrameworkSQLiteDatabase[] r2, android.database.sqlite.SQLiteDatabase r3) {
            /*
                r0 = 0
                r1 = r2[r0]
                if (r1 == 0) goto Le
                android.database.sqlite.SQLiteDatabase r1 = r1.f6022b
                if (r1 != r3) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                if (r1 != 0) goto L15
            Le:
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r1 = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase
                r1.<init>(r3)
                r2[r0] = r1
            L15:
                r2 = r2[r0]
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.m4156c(androidx.sqlite.db.framework.FrameworkSQLiteDatabase[], android.database.sqlite.SQLiteDatabase):androidx.sqlite.db.framework.FrameworkSQLiteDatabase");
        }

        /* renamed from: a */
        public synchronized SupportSQLiteDatabase m4157a() {
            this.f6034d = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (!this.f6034d) {
                return m4158b(readableDatabase);
            }
            close();
            return m4157a();
        }

        /* renamed from: b */
        public FrameworkSQLiteDatabase m4158b(SQLiteDatabase sQLiteDatabase) {
            return m4156c(this.f6032b, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f6032b[0] = null;
        }

        /* renamed from: e */
        public synchronized SupportSQLiteDatabase m4159e() {
            this.f6034d = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f6034d) {
                return m4158b(writableDatabase);
            }
            close();
            return m4159e();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f6033c.mo4077b(m4156c(this.f6032b, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f6033c.mo4078c(m4156c(this.f6032b, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f6034d = true;
            this.f6033c.mo4079d(m4156c(this.f6032b, sQLiteDatabase), i2, i3);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f6034d) {
                return;
            }
            this.f6033c.mo4080e(m4156c(this.f6032b, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f6034d = true;
            this.f6033c.mo4081f(m4156c(this.f6032b, sQLiteDatabase), i2, i3);
        }
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z) {
        this.f6025b = context;
        this.f6026c = str;
        this.f6027d = callback;
        this.f6028e = z;
    }

    /* renamed from: a */
    public final OpenHelper m4155a() {
        OpenHelper openHelper;
        synchronized (this.f6029f) {
            if (this.f6030g == null) {
                FrameworkSQLiteDatabase[] frameworkSQLiteDatabaseArr = new FrameworkSQLiteDatabase[1];
                if (Build.VERSION.SDK_INT < 23 || this.f6026c == null || !this.f6028e) {
                    this.f6030g = new OpenHelper(this.f6025b, this.f6026c, frameworkSQLiteDatabaseArr, this.f6027d);
                } else {
                    this.f6030g = new OpenHelper(this.f6025b, new File(this.f6025b.getNoBackupFilesDir(), this.f6026c).getAbsolutePath(), frameworkSQLiteDatabaseArr, this.f6027d);
                }
                this.f6030g.setWriteAheadLoggingEnabled(this.f6031h);
            }
            openHelper = this.f6030g;
        }
        return openHelper;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m4155a().close();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.f6026c;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        return m4155a().m4157a();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        return m4155a().m4159e();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    @RequiresApi
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f6029f) {
            OpenHelper openHelper = this.f6030g;
            if (openHelper != null) {
                openHelper.setWriteAheadLoggingEnabled(z);
            }
            this.f6031h = z;
        }
    }
}
