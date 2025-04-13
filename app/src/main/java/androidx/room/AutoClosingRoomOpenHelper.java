package androidx.room;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import androidx.sqlite.p004db.SupportSQLiteQuery;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    /* renamed from: b */
    @NonNull
    public final SupportSQLiteOpenHelper f5737b;

    /* renamed from: c */
    @NonNull
    public final AutoClosingSupportSQLiteDatabase f5738c;

    /* renamed from: d */
    @NonNull
    public final AutoCloser f5739d;

    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {

        /* renamed from: b */
        @NonNull
        public final AutoCloser f5740b;

        public AutoClosingSupportSQLiteDatabase(@NonNull AutoCloser autoCloser) {
            this.f5740b = autoCloser;
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        /* renamed from: E */
        public List<Pair<String, String>> mo4030E() {
            return (List) this.f5740b.m4027b(C0567b.f5899e);
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        /* renamed from: H */
        public void mo4031H(final int i2) {
            this.f5740b.m4027b(new Function() { // from class: androidx.room.a
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    ((SupportSQLiteDatabase) obj).mo4031H(i2);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        /* renamed from: I */
        public void mo4032I(final String str) throws SQLException {
            final int i2 = 2;
            this.f5740b.m4027b(new Function(str, i2) { // from class: androidx.room.h

                /* renamed from: a */
                public final /* synthetic */ Object f5917a;

                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    ((SupportSQLiteDatabase) obj).mo4032I((String) this.f5917a);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        /* renamed from: I0 */
        public Cursor mo4033I0(SupportSQLiteQuery supportSQLiteQuery) {
            try {
                return new KeepAliveCursor(this.f5740b.m4029d().mo4033I0(supportSQLiteQuery), this.f5740b);
            } catch (Throwable th) {
                this.f5740b.m4026a();
                throw th;
            }
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        /* renamed from: L */
        public SupportSQLiteStatement mo4034L(String str) {
            return new AutoClosingSupportSqliteStatement(str, this.f5740b);
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        /* renamed from: Q0 */
        public boolean mo4035Q0() {
            if (this.f5740b.m4028c() == null) {
                return false;
            }
            return ((Boolean) this.f5740b.m4027b(C0567b.f5898d)).booleanValue();
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        @RequiresApi
        /* renamed from: W0 */
        public boolean mo4036W0() {
            return ((Boolean) this.f5740b.m4027b(C0567b.f5897c)).booleanValue();
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        @RequiresApi
        /* renamed from: Y */
        public Cursor mo4037Y(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
            try {
                return new KeepAliveCursor(this.f5740b.m4029d().mo4037Y(supportSQLiteQuery, cancellationSignal), this.f5740b);
            } catch (Throwable th) {
                this.f5740b.m4026a();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            AutoCloser autoCloser = this.f5740b;
            synchronized (autoCloser.f5726d) {
                autoCloser.f5732j = true;
                SupportSQLiteDatabase supportSQLiteDatabase = autoCloser.f5731i;
                if (supportSQLiteDatabase != null) {
                    supportSQLiteDatabase.close();
                }
                autoCloser.f5731i = null;
            }
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        public boolean isOpen() {
            SupportSQLiteDatabase m4028c = this.f5740b.m4028c();
            if (m4028c == null) {
                return false;
            }
            return m4028c.isOpen();
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        /* renamed from: j0 */
        public void mo4038j0() {
            SupportSQLiteDatabase m4028c = this.f5740b.m4028c();
            if (m4028c == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
            m4028c.mo4038j0();
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        /* renamed from: k0 */
        public void mo4039k0() {
            try {
                this.f5740b.m4029d().mo4039k0();
            } catch (Throwable th) {
                this.f5740b.m4026a();
                throw th;
            }
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        /* renamed from: q0 */
        public Cursor mo4040q0(String str) {
            try {
                return new KeepAliveCursor(this.f5740b.m4029d().mo4040q0(str), this.f5740b);
            } catch (Throwable th) {
                this.f5740b.m4026a();
                throw th;
            }
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        /* renamed from: t */
        public String mo4041t() {
            return (String) this.f5740b.m4027b(C0567b.f5900f);
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        /* renamed from: w0 */
        public void mo4042w0() {
            if (this.f5740b.m4028c() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                this.f5740b.m4028c().mo4042w0();
            } finally {
                this.f5740b.m4026a();
            }
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteDatabase
        /* renamed from: y */
        public void mo4043y() {
            try {
                this.f5740b.m4029d().mo4043y();
            } catch (Throwable th) {
                this.f5740b.m4026a();
                throw th;
            }
        }
    }

    public static class AutoClosingSupportSqliteStatement implements SupportSQLiteStatement {

        /* renamed from: b */
        public final String f5741b;

        /* renamed from: c */
        public final ArrayList<Object> f5742c = new ArrayList<>();

        /* renamed from: d */
        public final AutoCloser f5743d;

        public AutoClosingSupportSqliteStatement(String str, AutoCloser autoCloser) {
            this.f5741b = str;
            this.f5743d = autoCloser;
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteProgram
        /* renamed from: J0 */
        public void mo4044J0(int i2) {
            m4047a(i2, null);
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteStatement
        /* renamed from: K */
        public int mo4045K() {
            return ((Integer) this.f5743d.m4027b(new C0568c(this, C0567b.f5902h))).intValue();
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteProgram
        /* renamed from: S */
        public void mo4046S(int i2, double d) {
            m4047a(i2, Double.valueOf(d));
        }

        /* renamed from: a */
        public final void m4047a(int i2, Object obj) {
            int i3 = i2 - 1;
            if (i3 >= this.f5742c.size()) {
                for (int size = this.f5742c.size(); size <= i3; size++) {
                    this.f5742c.add(null);
                }
            }
            this.f5742c.set(i3, obj);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteProgram
        /* renamed from: f */
        public void mo4048f(int i2, String str) {
            m4047a(i2, str);
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteStatement
        /* renamed from: h1 */
        public long mo4049h1() {
            return ((Long) this.f5743d.m4027b(new C0568c(this, C0567b.f5901g))).longValue();
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteProgram
        /* renamed from: i0 */
        public void mo4050i0(int i2, long j2) {
            m4047a(i2, Long.valueOf(j2));
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteProgram
        /* renamed from: l0 */
        public void mo4051l0(int i2, byte[] bArr) {
            m4047a(i2, bArr);
        }
    }

    public static final class KeepAliveCursor implements Cursor {

        /* renamed from: b */
        public final Cursor f5744b;

        /* renamed from: c */
        public final AutoCloser f5745c;

        public KeepAliveCursor(Cursor cursor, AutoCloser autoCloser) {
            this.f5744b = cursor;
            this.f5745c = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f5744b.close();
            this.f5745c.m4026a();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i2, CharArrayBuffer charArrayBuffer) {
            this.f5744b.copyStringToBuffer(i2, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
            this.f5744b.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i2) {
            return this.f5744b.getBlob(i2);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f5744b.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f5744b.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.f5744b.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i2) {
            return this.f5744b.getColumnName(i2);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f5744b.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f5744b.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i2) {
            return this.f5744b.getDouble(i2);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f5744b.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i2) {
            return this.f5744b.getFloat(i2);
        }

        @Override // android.database.Cursor
        public int getInt(int i2) {
            return this.f5744b.getInt(i2);
        }

        @Override // android.database.Cursor
        public long getLong(int i2) {
            return this.f5744b.getLong(i2);
        }

        @Override // android.database.Cursor
        @RequiresApi
        public Uri getNotificationUri() {
            return this.f5744b.getNotificationUri();
        }

        @Override // android.database.Cursor
        @Nullable
        @RequiresApi
        public List<Uri> getNotificationUris() {
            return this.f5744b.getNotificationUris();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f5744b.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i2) {
            return this.f5744b.getShort(i2);
        }

        @Override // android.database.Cursor
        public String getString(int i2) {
            return this.f5744b.getString(i2);
        }

        @Override // android.database.Cursor
        public int getType(int i2) {
            return this.f5744b.getType(i2);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f5744b.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f5744b.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f5744b.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f5744b.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f5744b.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f5744b.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i2) {
            return this.f5744b.isNull(i2);
        }

        @Override // android.database.Cursor
        public boolean move(int i2) {
            return this.f5744b.move(i2);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f5744b.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f5744b.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f5744b.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i2) {
            return this.f5744b.moveToPosition(i2);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f5744b.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f5744b.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f5744b.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
            return this.f5744b.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f5744b.respond(bundle);
        }

        @Override // android.database.Cursor
        @RequiresApi
        public void setExtras(Bundle bundle) {
            this.f5744b.setExtras(bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f5744b.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        @RequiresApi
        public void setNotificationUris(@NonNull ContentResolver contentResolver, @NonNull List<Uri> list) {
            this.f5744b.setNotificationUris(contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f5744b.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f5744b.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public AutoClosingRoomOpenHelper(@NonNull SupportSQLiteOpenHelper supportSQLiteOpenHelper, @NonNull AutoCloser autoCloser) {
        this.f5737b = supportSQLiteOpenHelper;
        this.f5739d = autoCloser;
        if (autoCloser.f5723a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            autoCloser.f5723a = supportSQLiteOpenHelper;
        }
        this.f5738c = new AutoClosingSupportSQLiteDatabase(autoCloser);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f5738c.close();
        } catch (IOException e2) {
            throw e2;
        }
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    @Nullable
    public String getDatabaseName() {
        return this.f5737b.getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @NonNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.f5737b;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    @NonNull
    @RequiresApi
    public SupportSQLiteDatabase getReadableDatabase() {
        AutoCloser autoCloser = this.f5738c.f5740b;
        try {
            autoCloser.m4029d();
            autoCloser.m4026a();
            return this.f5738c;
        } catch (Throwable th) {
            autoCloser.m4026a();
            throw th;
        }
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    @NonNull
    @RequiresApi
    public SupportSQLiteDatabase getWritableDatabase() {
        AutoCloser autoCloser = this.f5738c.f5740b;
        try {
            autoCloser.m4029d();
            autoCloser.m4026a();
            return this.f5738c;
        } catch (Throwable th) {
            autoCloser.m4026a();
            throw th;
        }
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    @RequiresApi
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f5737b.setWriteAheadLoggingEnabled(z);
    }
}
