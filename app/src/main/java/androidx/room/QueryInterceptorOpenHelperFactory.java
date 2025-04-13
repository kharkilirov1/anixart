package androidx.room;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class QueryInterceptorOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    /* renamed from: a */
    public final SupportSQLiteOpenHelper.Factory f5835a;

    /* renamed from: b */
    public final RoomDatabase.QueryCallback f5836b;

    /* renamed from: c */
    public final Executor f5837c;

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @NonNull
    /* renamed from: a */
    public SupportSQLiteOpenHelper mo4052a(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
        return new QueryInterceptorOpenHelper(this.f5835a.mo4052a(configuration), this.f5836b, this.f5837c);
    }
}
