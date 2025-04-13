package androidx.room;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {

    /* renamed from: b */
    @Nullable
    public DatabaseConfiguration f5857b;

    /* renamed from: c */
    @NonNull
    public final Delegate f5858c;

    /* renamed from: d */
    @NonNull
    public final String f5859d;

    /* renamed from: e */
    @NonNull
    public final String f5860e;

    @RestrictTo
    public static abstract class Delegate {
        public final int version;

        public Delegate(int i2) {
            this.version = i2;
        }

        public abstract void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @NonNull
        public ValidationResult onValidateSchema(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            validateMigration(supportSQLiteDatabase);
            return new ValidationResult(true, null);
        }

        @Deprecated
        public void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @RestrictTo
    public static class ValidationResult {

        /* renamed from: a */
        public final boolean f5861a;

        /* renamed from: b */
        @Nullable
        public final String f5862b;

        public ValidationResult(boolean z, @Nullable String str) {
            this.f5861a = z;
            this.f5862b = str;
        }
    }

    public RoomOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration, @NonNull Delegate delegate, @NonNull String str, @NonNull String str2) {
        super(delegate.version);
        this.f5857b = databaseConfiguration;
        this.f5858c = delegate;
        this.f5859d = str;
        this.f5860e = str2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    /* renamed from: b */
    public void mo4077b(SupportSQLiteDatabase supportSQLiteDatabase) {
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    /* renamed from: c */
    public void mo4078c(SupportSQLiteDatabase supportSQLiteDatabase) {
        Cursor mo4040q0 = supportSQLiteDatabase.mo4040q0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (mo4040q0.moveToFirst()) {
                if (mo4040q0.getInt(0) == 0) {
                    z = true;
                }
            }
            mo4040q0.close();
            this.f5858c.createAllTables(supportSQLiteDatabase);
            if (!z) {
                ValidationResult onValidateSchema = this.f5858c.onValidateSchema(supportSQLiteDatabase);
                if (!onValidateSchema.f5861a) {
                    StringBuilder m24u = C0000a.m24u("Pre-packaged database has an invalid schema: ");
                    m24u.append(onValidateSchema.f5862b);
                    throw new IllegalStateException(m24u.toString());
                }
            }
            m4082g(supportSQLiteDatabase);
            this.f5858c.onCreate(supportSQLiteDatabase);
        } catch (Throwable th) {
            mo4040q0.close();
            throw th;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    /* renamed from: d */
    public void mo4079d(SupportSQLiteDatabase supportSQLiteDatabase, int i2, int i3) {
        mo4081f(supportSQLiteDatabase, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4080e(androidx.sqlite.p004db.SupportSQLiteDatabase r5) {
        /*
            r4 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r5.mo4040q0(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L83
            r2 = 0
            if (r1 == 0) goto L15
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r0.close()
            r0 = 0
            if (r1 == 0) goto L54
            androidx.sqlite.db.SimpleSQLiteQuery r1 = new androidx.sqlite.db.SimpleSQLiteQuery
            java.lang.String r3 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r3)
            android.database.Cursor r1 = r5.mo4033I0(r1)
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L32
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L4f
            goto L33
        L32:
            r2 = r0
        L33:
            r1.close()
            java.lang.String r1 = r4.f5859d
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L66
            java.lang.String r1 = r4.f5860e
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            goto L66
        L47:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number."
            r5.<init>(r0)
            throw r5
        L4f:
            r5 = move-exception
            r1.close()
            throw r5
        L54:
            androidx.room.RoomOpenHelper$Delegate r1 = r4.f5858c
            androidx.room.RoomOpenHelper$ValidationResult r1 = r1.onValidateSchema(r5)
            boolean r2 = r1.f5861a
            if (r2 == 0) goto L6e
            androidx.room.RoomOpenHelper$Delegate r1 = r4.f5858c
            r1.onPostMigrate(r5)
            r4.m4082g(r5)
        L66:
            androidx.room.RoomOpenHelper$Delegate r1 = r4.f5858c
            r1.onOpen(r5)
            r4.f5857b = r0
            return
        L6e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            java.lang.String r1 = r1.f5862b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L83:
            r5 = move-exception
            r0.close()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomOpenHelper.mo4080e(androidx.sqlite.db.SupportSQLiteDatabase):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x007b, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0077 A[EDGE_INSN: B:61:0x0077->B:52:0x0077 BREAK  A[LOOP:1: B:31:0x001d->B:50:0x0079], SYNTHETIC] */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4081f(androidx.sqlite.p004db.SupportSQLiteDatabase r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomOpenHelper.mo4081f(androidx.sqlite.db.SupportSQLiteDatabase, int, int):void");
    }

    /* renamed from: g */
    public final void m4082g(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.mo4032I("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        supportSQLiteDatabase.mo4032I("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.f5859d + "')");
    }
}
