package androidx.room;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
class SQLiteCopyOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    /* renamed from: a */
    @Nullable
    public final String f5886a;

    /* renamed from: b */
    @Nullable
    public final File f5887b;

    /* renamed from: c */
    @Nullable
    public final Callable<InputStream> f5888c;

    /* renamed from: d */
    @NonNull
    public final SupportSQLiteOpenHelper.Factory f5889d;

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @NonNull
    /* renamed from: a */
    public SupportSQLiteOpenHelper mo4052a(SupportSQLiteOpenHelper.Configuration configuration) {
        return new SQLiteCopyOpenHelper(configuration.f6014a, this.f5886a, this.f5887b, this.f5888c, configuration.f6016c.f6013a, this.f5889d.mo4052a(configuration));
    }
}
