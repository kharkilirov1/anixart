package androidx.sqlite.p004db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.p004db.SupportSQLiteProgram;

/* loaded from: classes.dex */
class FrameworkSQLiteProgram implements SupportSQLiteProgram {

    /* renamed from: b */
    public final SQLiteProgram f6037b;

    public FrameworkSQLiteProgram(SQLiteProgram sQLiteProgram) {
        this.f6037b = sQLiteProgram;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: J0 */
    public void mo4044J0(int i2) {
        this.f6037b.bindNull(i2);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: S */
    public void mo4046S(int i2, double d) {
        this.f6037b.bindDouble(i2, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6037b.close();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: f */
    public void mo4048f(int i2, String str) {
        this.f6037b.bindString(i2, str);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: i0 */
    public void mo4050i0(int i2, long j2) {
        this.f6037b.bindLong(i2, j2);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: l0 */
    public void mo4051l0(int i2, byte[] bArr) {
        this.f6037b.bindBlob(i2, bArr);
    }
}
