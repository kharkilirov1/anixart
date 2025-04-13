package androidx.room;

import androidx.arch.core.util.Function;
import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.room.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0568c implements Function {

    /* renamed from: a */
    public final /* synthetic */ AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement f5904a;

    /* renamed from: b */
    public final /* synthetic */ Function f5905b;

    public /* synthetic */ C0568c(AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement, Function function) {
        this.f5904a = autoClosingSupportSqliteStatement;
        this.f5905b = function;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement = this.f5904a;
        Function function = this.f5905b;
        SupportSQLiteStatement mo4034L = ((SupportSQLiteDatabase) obj).mo4034L(autoClosingSupportSqliteStatement.f5741b);
        int i2 = 0;
        while (i2 < autoClosingSupportSqliteStatement.f5742c.size()) {
            int i3 = i2 + 1;
            Object obj2 = autoClosingSupportSqliteStatement.f5742c.get(i2);
            if (obj2 == null) {
                mo4034L.mo4044J0(i3);
            } else if (obj2 instanceof Long) {
                mo4034L.mo4050i0(i3, ((Long) obj2).longValue());
            } else if (obj2 instanceof Double) {
                mo4034L.mo4046S(i3, ((Double) obj2).doubleValue());
            } else if (obj2 instanceof String) {
                mo4034L.mo4048f(i3, (String) obj2);
            } else if (obj2 instanceof byte[]) {
                mo4034L.mo4051l0(i3, (byte[]) obj2);
            }
            i2 = i3;
        }
        return function.apply(mo4034L);
    }
}
