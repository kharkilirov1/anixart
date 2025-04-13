package com.yandex.div.state.p019db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStateDbOpenHelper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/state/db/DivStateDbOpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "div-states_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivStateDbOpenHelper extends SQLiteOpenHelper {
    public DivStateDbOpenHelper(@NotNull Context context, @NotNull String str) {
        Intrinsics.m32179h(null, "context");
        throw null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db) {
        Intrinsics.m32179h(db, "db");
        db.execSQL("CREATE TABLE IF NOT EXISTS `div_card_states` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `card_id` TEXT NOT NULL, `path` TEXT NOT NULL, `state_id` TEXT NOT NULL, `modification_time` INTEGER NOT NULL)");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_div_card_states_card_id_path` ON `div_card_states` (`card_id`, `path`)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@Nullable SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
