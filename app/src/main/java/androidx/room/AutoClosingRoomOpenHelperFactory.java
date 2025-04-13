package androidx.room;

import androidx.annotation.NonNull;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;

/* loaded from: classes.dex */
final class AutoClosingRoomOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    /* renamed from: a */
    @NonNull
    public final SupportSQLiteOpenHelper.Factory f5746a;

    /* renamed from: b */
    @NonNull
    public final AutoCloser f5747b;

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @NonNull
    /* renamed from: a */
    public SupportSQLiteOpenHelper mo4052a(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
        return new AutoClosingRoomOpenHelper(this.f5746a.mo4052a(configuration), this.f5747b);
    }
}
