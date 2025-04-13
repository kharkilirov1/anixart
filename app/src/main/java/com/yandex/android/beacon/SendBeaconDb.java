package com.yandex.android.beacon;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.WorkerThread;
import com.yandex.android.beacon.BeaconItem;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p033io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SendBeaconDb.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconDb;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Companion", "Factory", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class SendBeaconDb extends SQLiteOpenHelper {

    /* renamed from: b */
    @NotNull
    public static final String[] f30811b = {"_id", "url", "headers", "add_timestamp", "payload"};

    /* renamed from: c */
    @JvmField
    @NotNull
    public static Factory f30812c = SendBeaconDb$Companion$factory$1.f30813a;

    /* compiled from: SendBeaconDb.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconDb$Companion;", "", "", "ADD_PAYLOAD_COLUMN_TO_ITEM", "Ljava/lang/String;", "COLUMN_ADD_TIMESTAMP", "COLUMN_HEADERS", "COLUMN_ID", "COLUMN_PAYLOAD", "COLUMN_URL", "DATABASE_CREATE", "", "DATABASE_INIT_VERSION", "I", "DATABASE_VERSION", "", "QUERY_COLUMNS", "[Ljava/lang/String;", "REMOVE_CLAUSE", "TABLE_ITEMS", "Lcom/yandex/android/beacon/SendBeaconDb$Factory;", "factory", "Lcom/yandex/android/beacon/SendBeaconDb$Factory;", "getFactory$beacon_release$annotations", "()V", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: SendBeaconDb.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconDb$Factory;", "", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface Factory {
    }

    @WorkerThread
    /* renamed from: a */
    public boolean m16542a(@Nullable BeaconItem.Persistent persistent) {
        if (persistent == null) {
            return false;
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            int delete = writableDatabase.delete("items", "_id = ?", new String[]{String.valueOf(persistent.f30810e)});
            CloseableKt.m32138a(writableDatabase, null);
            return delete != 0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m32138a(writableDatabase, th);
                throw th2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
        Intrinsics.m32179h(sqLiteDatabase, "sqLiteDatabase");
        sqLiteDatabase.execSQL("\n            CREATE TABLE items(\n            _id INTEGER PRIMARY KEY AUTOINCREMENT,\n            url TEXT NOT NULL,\n            headers TEXT,\n            add_timestamp INTEGER, \n            payload TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int i2, int i3) {
        Intrinsics.m32179h(sqLiteDatabase, "sqLiteDatabase");
        if (i2 == 1) {
            sqLiteDatabase.execSQL("\n            ALTER TABLE items ADD COLUMN payload TEXT;\n        ");
        }
    }
}
