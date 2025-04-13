package androidx.room;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class QueryInterceptorStatement implements SupportSQLiteStatement {

    /* renamed from: b */
    public final SupportSQLiteStatement f5839b;

    /* renamed from: c */
    public final RoomDatabase.QueryCallback f5840c;

    /* renamed from: d */
    public final String f5841d;

    /* renamed from: e */
    public final List<Object> f5842e = new ArrayList();

    /* renamed from: f */
    public final Executor f5843f;

    public QueryInterceptorStatement(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull RoomDatabase.QueryCallback queryCallback, String str, @NonNull Executor executor) {
        this.f5839b = supportSQLiteStatement;
        this.f5840c = queryCallback;
        this.f5841d = str;
        this.f5843f = executor;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: J0 */
    public void mo4044J0(int i2) {
        m4072a(i2, this.f5842e.toArray());
        this.f5839b.mo4044J0(i2);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteStatement
    /* renamed from: K */
    public int mo4045K() {
        this.f5843f.execute(new RunnableC0572g(this, 1));
        return this.f5839b.mo4045K();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: S */
    public void mo4046S(int i2, double d) {
        m4072a(i2, Double.valueOf(d));
        this.f5839b.mo4046S(i2, d);
    }

    /* renamed from: a */
    public final void m4072a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 >= this.f5842e.size()) {
            for (int size = this.f5842e.size(); size <= i3; size++) {
                this.f5842e.add(null);
            }
        }
        this.f5842e.set(i3, obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5839b.close();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: f */
    public void mo4048f(int i2, String str) {
        m4072a(i2, str);
        this.f5839b.mo4048f(i2, str);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteStatement
    /* renamed from: h1 */
    public long mo4049h1() {
        this.f5843f.execute(new RunnableC0572g(this, 0));
        return this.f5839b.mo4049h1();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: i0 */
    public void mo4050i0(int i2, long j2) {
        m4072a(i2, Long.valueOf(j2));
        this.f5839b.mo4050i0(i2, j2);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: l0 */
    public void mo4051l0(int i2, byte[] bArr) {
        m4072a(i2, bArr);
        this.f5839b.mo4051l0(i2, bArr);
    }
}
