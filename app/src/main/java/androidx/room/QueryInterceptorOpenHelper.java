package androidx.room;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.room.RoomDatabase;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class QueryInterceptorOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    /* renamed from: b */
    public final SupportSQLiteOpenHelper f5832b;

    /* renamed from: c */
    public final RoomDatabase.QueryCallback f5833c;

    /* renamed from: d */
    public final Executor f5834d;

    public QueryInterceptorOpenHelper(@NonNull SupportSQLiteOpenHelper supportSQLiteOpenHelper, @NonNull RoomDatabase.QueryCallback queryCallback, @NonNull Executor executor) {
        this.f5832b = supportSQLiteOpenHelper;
        this.f5833c = queryCallback;
        this.f5834d = executor;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5832b.close();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    @Nullable
    public String getDatabaseName() {
        return this.f5832b.getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @NonNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.f5832b;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        return new QueryInterceptorDatabase(this.f5832b.getReadableDatabase(), this.f5833c, this.f5834d);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        return new QueryInterceptorDatabase(this.f5832b.getWritableDatabase(), this.f5833c, this.f5834d);
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    @RequiresApi
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f5832b.setWriteAheadLoggingEnabled(z);
    }
}
