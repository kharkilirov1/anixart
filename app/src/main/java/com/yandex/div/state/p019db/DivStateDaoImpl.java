package com.yandex.div.state.p019db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivStateDaoImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/state/db/DivStateDaoImpl;", "Lcom/yandex/div/state/db/DivStateDao;", "div-states_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivStateDaoImpl implements DivStateDao {

    /* renamed from: a */
    @NotNull
    public final SQLiteDatabase f34367a;

    /* renamed from: b */
    @NotNull
    public final SQLiteStatement f34368b;

    public DivStateDaoImpl(@NotNull SQLiteDatabase sQLiteDatabase) {
        this.f34367a = sQLiteDatabase;
        if (sQLiteDatabase.isReadOnly()) {
            Intrinsics.m32187p(DivStateDaoImpl.class.getName(), " require writable database!");
        }
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("INSERT OR REPLACE INTO `div_card_states` (`card_id`,`path`,`state_id`,`modification_time`) VALUES (?,?,?,?)");
        Intrinsics.m32178g(compileStatement, "writableDatabase.compile…QL_UPSERT_QUERY_TEMPLATE)");
        this.f34368b = compileStatement;
    }

    /* renamed from: a */
    public static final void m17547a(DivStateDaoImpl divStateDaoImpl, Cursor cursor) {
        Objects.requireNonNull(divStateDaoImpl);
        cursor.moveToLast();
        cursor.close();
    }

    /* renamed from: b */
    public void m17548b(final long j2) {
        m17549c(this.f34367a, new Function0<Unit>() { // from class: com.yandex.div.state.db.DivStateDaoImpl$deleteModifiedBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                DivStateDaoImpl divStateDaoImpl = DivStateDaoImpl.this;
                Cursor rawQuery = divStateDaoImpl.f34367a.rawQuery("DELETE FROM div_card_states WHERE modification_time < ?", new String[]{String.valueOf(j2)});
                Intrinsics.m32178g(rawQuery, "writableDatabase.rawQuer…toString())\n            )");
                DivStateDaoImpl.m17547a(divStateDaoImpl, rawQuery);
                return Unit.f63088a;
            }
        });
    }

    /* renamed from: c */
    public final void m17549c(SQLiteDatabase sQLiteDatabase, Function0<Unit> function0) {
        sQLiteDatabase.beginTransaction();
        try {
            function0.invoke();
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
