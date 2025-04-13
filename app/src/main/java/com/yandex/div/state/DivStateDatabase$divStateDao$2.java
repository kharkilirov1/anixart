package com.yandex.div.state;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.div.state.p019db.DivStateDaoImpl;
import com.yandex.div.state.p019db.DivStateDbOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: DivStateDatabase.kt */
@Metadata(m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m31884d2 = {"<anonymous>", "Lcom/yandex/div/state/db/DivStateDaoImpl;", "invoke"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class DivStateDatabase$divStateDao$2 extends Lambda implements Function0<DivStateDaoImpl> {
    @Override // kotlin.jvm.functions.Function0
    public DivStateDaoImpl invoke() {
        SQLiteDatabase writableDatabase = new DivStateDbOpenHelper(null, null).getWritableDatabase();
        Intrinsics.m32178g(writableDatabase, "dbOpenHelper.writableDatabase");
        DivStateDaoImpl divStateDaoImpl = new DivStateDaoImpl(writableDatabase);
        divStateDaoImpl.m17548b(System.currentTimeMillis() - DivStateDatabase.f34364a);
        return divStateDaoImpl;
    }
}
