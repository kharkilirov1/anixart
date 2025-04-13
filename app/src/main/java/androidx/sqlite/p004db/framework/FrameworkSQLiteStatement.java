package androidx.sqlite.p004db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.p004db.SupportSQLiteStatement;

/* loaded from: classes.dex */
class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {

    /* renamed from: c */
    public final SQLiteStatement f6038c;

    public FrameworkSQLiteStatement(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f6038c = sQLiteStatement;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteStatement
    /* renamed from: K */
    public int mo4045K() {
        return this.f6038c.executeUpdateDelete();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteStatement
    /* renamed from: h1 */
    public long mo4049h1() {
        return this.f6038c.executeInsert();
    }
}
