package androidx.room;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.RoomDatabase;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteQuery;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class QueryInterceptorDatabase implements SupportSQLiteDatabase {

    /* renamed from: b */
    public final SupportSQLiteDatabase f5829b;

    /* renamed from: c */
    public final RoomDatabase.QueryCallback f5830c;

    /* renamed from: d */
    public final Executor f5831d;

    public QueryInterceptorDatabase(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, @NonNull RoomDatabase.QueryCallback queryCallback, @NonNull Executor executor) {
        this.f5829b = supportSQLiteDatabase;
        this.f5830c = queryCallback;
        this.f5831d = executor;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    @NonNull
    /* renamed from: E */
    public List<Pair<String, String>> mo4030E() {
        return this.f5829b.mo4030E();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: H */
    public void mo4031H(int i2) {
        this.f5829b.mo4031H(i2);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: I */
    public void mo4032I(@NonNull String str) throws SQLException {
        this.f5831d.execute(new RunnableC0571f(this, str, 1));
        this.f5829b.mo4032I(str);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    @NonNull
    /* renamed from: I0 */
    public Cursor mo4033I0(@NonNull SupportSQLiteQuery supportSQLiteQuery) {
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        supportSQLiteQuery.mo4085b(queryInterceptorProgram);
        this.f5831d.execute(new RunnableC0570e(this, supportSQLiteQuery, queryInterceptorProgram, 1));
        return this.f5829b.mo4033I0(supportSQLiteQuery);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    @NonNull
    /* renamed from: L */
    public SupportSQLiteStatement mo4034L(@NonNull String str) {
        return new QueryInterceptorStatement(this.f5829b.mo4034L(str), this.f5830c, str, this.f5831d);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: Q0 */
    public boolean mo4035Q0() {
        return this.f5829b.mo4035Q0();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    @RequiresApi
    /* renamed from: W0 */
    public boolean mo4036W0() {
        return this.f5829b.mo4036W0();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    @NonNull
    /* renamed from: Y */
    public Cursor mo4037Y(@NonNull SupportSQLiteQuery supportSQLiteQuery, @NonNull CancellationSignal cancellationSignal) {
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        supportSQLiteQuery.mo4085b(queryInterceptorProgram);
        this.f5831d.execute(new RunnableC0570e(this, supportSQLiteQuery, queryInterceptorProgram, 0));
        return this.f5829b.mo4033I0(supportSQLiteQuery);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5829b.close();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.f5829b.isOpen();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: j0 */
    public void mo4038j0() {
        this.f5831d.execute(new RunnableC0569d(this, 0));
        this.f5829b.mo4038j0();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: k0 */
    public void mo4039k0() {
        this.f5831d.execute(new RunnableC0569d(this, 2));
        this.f5829b.mo4039k0();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    @NonNull
    /* renamed from: q0 */
    public Cursor mo4040q0(@NonNull String str) {
        this.f5831d.execute(new RunnableC0571f(this, str, 0));
        return this.f5829b.mo4040q0(str);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    @NonNull
    /* renamed from: t */
    public String mo4041t() {
        return this.f5829b.mo4041t();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: w0 */
    public void mo4042w0() {
        this.f5831d.execute(new RunnableC0569d(this, 3));
        this.f5829b.mo4042w0();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
    /* renamed from: y */
    public void mo4043y() {
        this.f5831d.execute(new RunnableC0569d(this, 1));
        this.f5829b.mo4043y();
    }
}
