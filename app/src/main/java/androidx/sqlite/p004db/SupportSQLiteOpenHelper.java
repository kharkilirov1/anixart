package androidx.sqlite.p004db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.File;
import p000a.C0000a;

/* loaded from: classes.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    public static abstract class Callback {

        /* renamed from: a */
        public final int f6013a;

        public Callback(int i2) {
            this.f6013a = i2;
        }

        /* renamed from: a */
        public final void m4153a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e2) {
                Log.w("SupportSQLite", "delete failed: ", e2);
            }
        }

        /* renamed from: b */
        public void mo4077b(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* renamed from: c */
        public abstract void mo4078c(@NonNull SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: d */
        public void mo4079d(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, int i2, int i3) {
            throw new SQLiteException(C0000a.m9f("Can't downgrade database from version ", i2, " to ", i3));
        }

        /* renamed from: e */
        public void mo4080e(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* renamed from: f */
        public abstract void mo4081f(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, int i2, int i3);
    }

    public static class Configuration {

        /* renamed from: a */
        @NonNull
        public final Context f6014a;

        /* renamed from: b */
        @Nullable
        public final String f6015b;

        /* renamed from: c */
        @NonNull
        public final Callback f6016c;

        /* renamed from: d */
        public final boolean f6017d;

        public static class Builder {

            /* renamed from: a */
            public Context f6018a;

            /* renamed from: b */
            public String f6019b;

            /* renamed from: c */
            public Callback f6020c;

            public Builder(@NonNull Context context) {
                this.f6018a = context;
            }

            @NonNull
            /* renamed from: a */
            public Configuration m4154a() {
                Callback callback = this.f6020c;
                if (callback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                Context context = this.f6018a;
                if (context != null) {
                    return new Configuration(context, this.f6019b, callback, false);
                }
                throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
            }
        }

        public Configuration(@NonNull Context context, @Nullable String str, @NonNull Callback callback, boolean z) {
            this.f6014a = context;
            this.f6015b = str;
            this.f6016c = callback;
            this.f6017d = z;
        }
    }

    public interface Factory {
        @NonNull
        /* renamed from: a */
        SupportSQLiteOpenHelper mo4052a(@NonNull Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Nullable
    String getDatabaseName();

    SupportSQLiteDatabase getReadableDatabase();

    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi
    void setWriteAheadLoggingEnabled(boolean z);
}
