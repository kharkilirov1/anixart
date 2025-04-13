package androidx.room;

import androidx.sqlite.p004db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class QueryInterceptorProgram implements SupportSQLiteProgram {

    /* renamed from: b */
    public List<Object> f5838b = new ArrayList();

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: J0 */
    public void mo4044J0(int i2) {
        m4071a(i2, null);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: S */
    public void mo4046S(int i2, double d) {
        m4071a(i2, Double.valueOf(d));
    }

    /* renamed from: a */
    public final void m4071a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 >= this.f5838b.size()) {
            for (int size = this.f5838b.size(); size <= i3; size++) {
                this.f5838b.add(null);
            }
        }
        this.f5838b.set(i3, obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: f */
    public void mo4048f(int i2, String str) {
        m4071a(i2, str);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: i0 */
    public void mo4050i0(int i2, long j2) {
        m4071a(i2, Long.valueOf(j2));
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: l0 */
    public void mo4051l0(int i2, byte[] bArr) {
        m4071a(i2, bArr);
    }
}
