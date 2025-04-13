package androidx.sqlite.p004db.framework;

import androidx.annotation.NonNull;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;

/* loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @NonNull
    /* renamed from: a */
    public SupportSQLiteOpenHelper mo4052a(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
        return new FrameworkSQLiteOpenHelper(configuration.f6014a, configuration.f6015b, configuration.f6016c, configuration.f6017d);
    }
}
