package androidx.sqlite.p004db;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {

    /* renamed from: b */
    public final String f6011b;

    /* renamed from: c */
    @Nullable
    public final Object[] f6012c;

    public SimpleSQLiteQuery(String str) {
        this.f6011b = str;
        this.f6012c = null;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteQuery
    /* renamed from: a */
    public String mo4084a() {
        return this.f6011b;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteQuery
    /* renamed from: b */
    public void mo4085b(SupportSQLiteProgram supportSQLiteProgram) {
        Object[] objArr = this.f6012c;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            if (obj == null) {
                supportSQLiteProgram.mo4044J0(i2);
            } else if (obj instanceof byte[]) {
                supportSQLiteProgram.mo4051l0(i2, (byte[]) obj);
            } else if (obj instanceof Float) {
                supportSQLiteProgram.mo4046S(i2, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                supportSQLiteProgram.mo4046S(i2, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                supportSQLiteProgram.mo4050i0(i2, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                supportSQLiteProgram.mo4050i0(i2, ((Integer) obj).intValue());
            } else if (obj instanceof Short) {
                supportSQLiteProgram.mo4050i0(i2, ((Short) obj).shortValue());
            } else if (obj instanceof Byte) {
                supportSQLiteProgram.mo4050i0(i2, ((Byte) obj).byteValue());
            } else if (obj instanceof String) {
                supportSQLiteProgram.mo4048f(i2, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
                supportSQLiteProgram.mo4050i0(i2, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public SimpleSQLiteQuery(String str, @Nullable Object[] objArr) {
        this.f6011b = str;
        this.f6012c = objArr;
    }
}
