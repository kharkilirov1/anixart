package com.yandex.div.state.p019db;

import android.database.Cursor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: DivStateDaoImpl.kt */
@Metadata(m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m31884d2 = {"<anonymous>", "", "invoke"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class DivStateDaoImpl$deleteCardRootState$1 extends Lambda implements Function0<Unit> {

    /* renamed from: b */
    public final /* synthetic */ DivStateDaoImpl f34369b;

    /* renamed from: c */
    public final /* synthetic */ String f34370c;

    @Override // kotlin.jvm.functions.Function0
    public Unit invoke() {
        DivStateDaoImpl divStateDaoImpl = this.f34369b;
        Cursor rawQuery = divStateDaoImpl.f34367a.rawQuery("DELETE FROM div_card_states WHERE card_id=? AND path='/'", new String[]{this.f34370c});
        Intrinsics.m32178g(rawQuery, "writableDatabase.rawQuer…yOf(cardId)\n            )");
        DivStateDaoImpl.m17547a(divStateDaoImpl, rawQuery);
        return Unit.f63088a;
    }
}
