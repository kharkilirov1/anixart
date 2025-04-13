package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class DatabaseConfiguration {

    /* renamed from: a */
    @NonNull
    public final SupportSQLiteOpenHelper.Factory f5750a;

    /* renamed from: b */
    @NonNull
    public final Context f5751b;

    /* renamed from: c */
    @Nullable
    public final String f5752c;

    /* renamed from: d */
    @NonNull
    public final RoomDatabase.MigrationContainer f5753d;

    /* renamed from: i */
    public final boolean f5758i;

    /* renamed from: j */
    public final RoomDatabase.JournalMode f5759j;

    /* renamed from: k */
    @NonNull
    public final Executor f5760k;

    /* renamed from: l */
    @NonNull
    public final Executor f5761l;

    /* renamed from: o */
    public final boolean f5764o;

    /* renamed from: p */
    public final boolean f5765p;

    /* renamed from: e */
    @Nullable
    public final List<RoomDatabase.Callback> f5754e = null;

    /* renamed from: n */
    @RestrictTo
    public final Intent f5763n = null;

    /* renamed from: m */
    public final boolean f5762m = false;

    /* renamed from: q */
    public final Set<Integer> f5766q = null;

    /* renamed from: r */
    @Nullable
    public final Callable<InputStream> f5767r = null;

    /* renamed from: f */
    @Nullable
    public final RoomDatabase.PrepackagedDatabaseCallback f5755f = null;

    /* renamed from: g */
    @NonNull
    public final List<Object> f5756g = Collections.emptyList();

    /* renamed from: h */
    @NonNull
    public final List<AutoMigrationSpec> f5757h = Collections.emptyList();

    @SuppressLint
    @RestrictTo
    public DatabaseConfiguration(@NonNull Context context, @Nullable String str, @NonNull SupportSQLiteOpenHelper.Factory factory, @NonNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<RoomDatabase.Callback> list, boolean z, @NonNull RoomDatabase.JournalMode journalMode, @NonNull Executor executor, @NonNull Executor executor2, @Nullable Intent intent, boolean z2, boolean z3, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @Nullable List<Object> list2, @Nullable List<AutoMigrationSpec> list3) {
        this.f5750a = factory;
        this.f5751b = context;
        this.f5752c = str;
        this.f5753d = migrationContainer;
        this.f5758i = z;
        this.f5759j = journalMode;
        this.f5760k = executor;
        this.f5761l = executor2;
        this.f5764o = z2;
        this.f5765p = z3;
    }

    /* renamed from: a */
    public boolean m4053a(int i2, int i3) {
        Set<Integer> set;
        return !((i2 > i3) && this.f5765p) && this.f5764o && ((set = this.f5766q) == null || !set.contains(Integer.valueOf(i2)));
    }
}
