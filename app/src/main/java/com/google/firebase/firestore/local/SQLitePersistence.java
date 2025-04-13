package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class SQLitePersistence extends Persistence {

    /* renamed from: com.google.firebase.firestore.local.SQLitePersistence$1 */
    public class C20991 implements SQLiteTransactionListener {
        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onBegin() {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onCommit() {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onRollback() {
        }
    }

    public static class LongQuery {
    }

    @VisibleForTesting
    public static class OpenHelper extends SQLiteOpenHelper {

        /* renamed from: b */
        public boolean f22811b;

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f22811b = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (!this.f22811b) {
                onConfigure(sQLiteDatabase);
            }
            new SQLiteSchema(sQLiteDatabase, null).m12414b(0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            if (this.f22811b) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f22811b) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            if (!this.f22811b) {
                onConfigure(sQLiteDatabase);
            }
            new SQLiteSchema(sQLiteDatabase, null).m12414b(i2);
        }
    }

    public static class Query {

        /* renamed from: a */
        public final SQLiteDatabase f22812a;

        /* renamed from: b */
        public final String f22813b;

        /* renamed from: c */
        public SQLiteDatabase.CursorFactory f22814c;

        public Query(SQLiteDatabase sQLiteDatabase, String str) {
            this.f22812a = sQLiteDatabase;
            this.f22813b = str;
        }

        /* renamed from: a */
        public Query m12409a(final Object... objArr) {
            this.f22814c = new SQLiteDatabase.CursorFactory() { // from class: com.google.firebase.firestore.local.b
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    SQLitePersistence.m12408a(sQLiteQuery, objArr);
                    return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
                }
            };
            return this;
        }

        /* renamed from: b */
        public int m12410b(Consumer<Cursor> consumer) {
            Cursor m12412d = m12412d();
            int i2 = 0;
            while (m12412d.moveToNext()) {
                try {
                    i2++;
                    consumer.accept(m12412d);
                } catch (Throwable th) {
                    if (m12412d != null) {
                        try {
                            m12412d.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            m12412d.close();
            return i2;
        }

        /* renamed from: c */
        public boolean m12411c() {
            Cursor m12412d = m12412d();
            try {
                boolean z = !m12412d.moveToFirst();
                m12412d.close();
                return z;
            } catch (Throwable th) {
                if (m12412d != null) {
                    try {
                        m12412d.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* renamed from: d */
        public final Cursor m12412d() {
            SQLiteDatabase.CursorFactory cursorFactory = this.f22814c;
            return cursorFactory != null ? this.f22812a.rawQueryWithFactory(cursorFactory, this.f22813b, null, null) : this.f22812a.rawQuery(this.f22813b, null);
        }
    }

    /* renamed from: a */
    public static void m12408a(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sQLiteProgram.bindNull(i2 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i2 + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i2 + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i2 + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i2 + 1, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    Assert.m12489a("Unknown argument %s of type %s", obj, obj.getClass());
                    throw null;
                }
                sQLiteProgram.bindBlob(i2 + 1, (byte[]) obj);
            }
        }
    }
}
