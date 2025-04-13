package androidx.sqlite.p004db.framework;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p004db.SimpleSQLiteQuery;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteQuery;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {

    /* renamed from: c */
    public static final String[] f6021c = new String[0];

    /* renamed from: b */
    public final SQLiteDatabase f6022b;

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        this.f6022b = sQLiteDatabase;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: E */
    public List<Pair<String, String>> mo4030E() {
        return this.f6022b.getAttachedDbs();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: H */
    public void mo4031H(int i2) {
        this.f6022b.setVersion(i2);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: I */
    public void mo4032I(String str) throws SQLException {
        this.f6022b.execSQL(str);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: I0 */
    public Cursor mo4033I0(final SupportSQLiteQuery supportSQLiteQuery) {
        return this.f6022b.rawQueryWithFactory(new SQLiteDatabase.CursorFactory(this) { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase.1
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                supportSQLiteQuery.mo4085b(new FrameworkSQLiteProgram(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, supportSQLiteQuery.mo4084a(), f6021c, null);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: L */
    public SupportSQLiteStatement mo4034L(String str) {
        return new FrameworkSQLiteStatement(this.f6022b.compileStatement(str));
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: Q0 */
    public boolean mo4035Q0() {
        return this.f6022b.inTransaction();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    @RequiresApi
    /* renamed from: W0 */
    public boolean mo4036W0() {
        return this.f6022b.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    @RequiresApi
    /* renamed from: Y */
    public Cursor mo4037Y(final SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        return this.f6022b.rawQueryWithFactory(new SQLiteDatabase.CursorFactory(this) { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase.2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                supportSQLiteQuery.mo4085b(new FrameworkSQLiteProgram(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, supportSQLiteQuery.mo4084a(), f6021c, null, cancellationSignal);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6022b.close();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.f6022b.isOpen();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: j0 */
    public void mo4038j0() {
        this.f6022b.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: k0 */
    public void mo4039k0() {
        this.f6022b.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: q0 */
    public Cursor mo4040q0(String str) {
        return mo4033I0(new SimpleSQLiteQuery(str));
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: t */
    public String mo4041t() {
        return this.f6022b.getPath();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: w0 */
    public void mo4042w0() {
        this.f6022b.endTransaction();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: y */
    public void mo4043y() {
        this.f6022b.beginTransaction();
    }
}
