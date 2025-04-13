package com.google.firebase.firestore.local;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.google.firebase.firestore.local.MemoryIndexManager;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
class SQLiteSchema {

    /* renamed from: a */
    public final SQLiteDatabase f22815a;

    /* renamed from: b */
    public final LocalSerializer f22816b = null;

    public SQLiteSchema(SQLiteDatabase sQLiteDatabase, LocalSerializer localSerializer) {
        this.f22815a = sQLiteDatabase;
    }

    /* renamed from: a */
    public final void m12413a(String[] strArr, Runnable runnable) {
        String m20q = C0000a.m20q(C0000a.m24u("["), TextUtils.join(", ", strArr), "]");
        boolean z = false;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            boolean m12416d = m12416d(str);
            if (i2 == 0) {
                z = m12416d;
            } else if (m12416d != z) {
                String m16m = C0000a.m16m("Expected all of ", m20q, " to either exist or not, but ");
                throw new IllegalStateException(z ? C0000a.m22s(C0000a.m24u(m16m), strArr[0], " exists and ", str, " does not") : C0000a.m22s(C0000a.m24u(m16m), strArr[0], " does not exist and ", str, " does"));
            }
        }
        if (z) {
            Logger.m12494a(Logger.Level.DEBUG, "SQLiteSchema", C0000a.m16m("Skipping migration because all of ", m20q, " already exist"), new Object[0]);
        } else {
            ((RunnableC2105e) runnable).run();
        }
    }

    /* renamed from: b */
    public void m12414b(int i2) {
        Cursor m12412d;
        Cursor m12412d2;
        long currentTimeMillis = System.currentTimeMillis();
        final int i3 = 1;
        if (i2 < 1) {
            m12413a(new String[]{"mutation_queues", "mutations", "document_mutations"}, new RunnableC2105e(this, 5));
            m12413a(new String[]{"targets", "target_globals", "target_documents"}, new RunnableC2105e(this, 2));
            m12413a(new String[]{"remote_documents"}, new RunnableC2105e(this, 7));
        }
        if (i2 < 3 && i2 != 0) {
            if (m12416d("targets")) {
                this.f22815a.execSQL("DROP TABLE targets");
            }
            if (m12416d("target_globals")) {
                this.f22815a.execSQL("DROP TABLE target_globals");
            }
            if (m12416d("target_documents")) {
                this.f22815a.execSQL("DROP TABLE target_documents");
            }
            m12413a(new String[]{"targets", "target_globals", "target_documents"}, new RunnableC2105e(this, 2));
        }
        final int i4 = 0;
        if (i2 < 4) {
            if (!(DatabaseUtils.queryNumEntries(this.f22815a, "target_globals") == 1)) {
                this.f22815a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
            }
            if (!m12415c("target_globals", "target_count")) {
                this.f22815a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
            }
            long queryNumEntries = DatabaseUtils.queryNumEntries(this.f22815a, "targets");
            ContentValues contentValues = new ContentValues();
            contentValues.put("target_count", Long.valueOf(queryNumEntries));
            this.f22815a.update("target_globals", contentValues, null, null);
        }
        if (i2 < 5 && !m12415c("target_documents", "sequence_number")) {
            this.f22815a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
        }
        if (i2 < 6) {
            new SQLitePersistence.Query(this.f22815a, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").m12410b(new Consumer(this) { // from class: com.google.firebase.firestore.local.c

                /* renamed from: b */
                public final /* synthetic */ SQLiteSchema f22832b;

                {
                    this.f22832b = this;
                }

                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) {
                    switch (i3) {
                        case 0:
                            SQLiteSchema sQLiteSchema = this.f22832b;
                            Cursor cursor = (Cursor) obj;
                            Objects.requireNonNull(sQLiteSchema);
                            int i5 = cursor.getInt(0);
                            try {
                                Target.Builder mo13429b = Target.m12476K(cursor.getBlob(1)).mo13429b();
                                mo13429b.m13441n();
                                Target.m12475I((Target) mo13429b.f24185c);
                                sQLiteSchema.f22815a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{mo13429b.mo13437A().mo12977i(), Integer.valueOf(i5)});
                                return;
                            } catch (InvalidProtocolBufferException unused) {
                                Assert.m12489a("Failed to decode Query data for target %s", Integer.valueOf(i5));
                                throw null;
                            }
                        case 1:
                            SQLiteSchema sQLiteSchema2 = this.f22832b;
                            Cursor cursor2 = (Cursor) obj;
                            Objects.requireNonNull(sQLiteSchema2);
                            String string = cursor2.getString(0);
                            long j2 = cursor2.getLong(1);
                            SQLitePersistence.Query query = new SQLitePersistence.Query(sQLiteSchema2.f22815a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?");
                            query.m12409a(string, Long.valueOf(j2));
                            query.m12410b(new C2104d(sQLiteSchema2, string, 2));
                            return;
                        default:
                            SQLiteSchema sQLiteSchema3 = this.f22832b;
                            Cursor cursor3 = (Cursor) obj;
                            Objects.requireNonNull(sQLiteSchema3);
                            int i6 = cursor3.getInt(0);
                            try {
                                Target m12476K = Target.m12476K(cursor3.getBlob(1));
                                Objects.requireNonNull(sQLiteSchema3.f22816b);
                                m12476K.m12477J();
                                throw null;
                            } catch (InvalidProtocolBufferException unused2) {
                                Assert.m12489a("Failed to decode Query data for target %s", Integer.valueOf(i6));
                                throw null;
                            }
                    }
                }
            });
        }
        if (i2 < 7) {
            m12412d = new SQLitePersistence.Query(this.f22815a, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").m12412d();
            try {
                Long valueOf = m12412d.moveToFirst() ? Long.valueOf(m12412d.getLong(0)) : null;
                m12412d.close();
                Assert.m12490b(valueOf != null, "Missing highest sequence number", new Object[0]);
                long longValue = valueOf.longValue();
                SQLiteStatement compileStatement = this.f22815a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
                SQLitePersistence.Query query = new SQLitePersistence.Query(this.f22815a, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?");
                query.m12409a(100);
                boolean[] zArr = new boolean[1];
                do {
                    zArr[0] = false;
                    m12412d2 = query.m12412d();
                    while (m12412d2.moveToNext()) {
                        try {
                            zArr[0] = true;
                            compileStatement.clearBindings();
                            compileStatement.bindString(1, m12412d2.getString(0));
                            compileStatement.bindLong(2, longValue);
                            Assert.m12490b(compileStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
                        } finally {
                        }
                    }
                    m12412d2.close();
                } while (zArr[0]);
            } finally {
            }
        }
        if (i2 < 8) {
            m12413a(new String[]{"collection_parents"}, new RunnableC2105e(this, 4));
            C2104d c2104d = new C2104d(new MemoryIndexManager.MemoryCollectionParentIndex(), this.f22815a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"), 1);
            m12412d = new SQLitePersistence.Query(this.f22815a, "SELECT path FROM remote_documents").m12412d();
            while (m12412d.moveToNext()) {
                try {
                    c2104d.accept(EncodedPath.m12404a(m12412d.getString(0)).m12436k());
                } finally {
                    if (m12412d == null) {
                        throw th;
                    }
                    try {
                        m12412d.close();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            m12412d.close();
            m12412d2 = new SQLitePersistence.Query(this.f22815a, "SELECT path FROM document_mutations").m12412d();
            while (m12412d2.moveToNext()) {
                try {
                    c2104d.accept(EncodedPath.m12404a(m12412d2.getString(0)).m12436k());
                } finally {
                    if (m12412d2 == null) {
                        throw th;
                    }
                    try {
                        m12412d2.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            m12412d2.close();
        }
        if (i2 < 9) {
            boolean m12415c = m12415c("remote_documents", "read_time_seconds");
            boolean m12415c2 = m12415c("remote_documents", "read_time_nanos");
            Assert.m12490b(m12415c == m12415c2, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
            if (m12415c && m12415c2) {
                new SQLitePersistence.Query(this.f22815a, "SELECT target_id, target_proto FROM targets").m12410b(new Consumer(this) { // from class: com.google.firebase.firestore.local.c

                    /* renamed from: b */
                    public final /* synthetic */ SQLiteSchema f22832b;

                    {
                        this.f22832b = this;
                    }

                    @Override // com.google.firebase.firestore.util.Consumer
                    public final void accept(Object obj) {
                        switch (i4) {
                            case 0:
                                SQLiteSchema sQLiteSchema = this.f22832b;
                                Cursor cursor = (Cursor) obj;
                                Objects.requireNonNull(sQLiteSchema);
                                int i5 = cursor.getInt(0);
                                try {
                                    Target.Builder mo13429b = Target.m12476K(cursor.getBlob(1)).mo13429b();
                                    mo13429b.m13441n();
                                    Target.m12475I((Target) mo13429b.f24185c);
                                    sQLiteSchema.f22815a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{mo13429b.mo13437A().mo12977i(), Integer.valueOf(i5)});
                                    return;
                                } catch (InvalidProtocolBufferException unused) {
                                    Assert.m12489a("Failed to decode Query data for target %s", Integer.valueOf(i5));
                                    throw null;
                                }
                            case 1:
                                SQLiteSchema sQLiteSchema2 = this.f22832b;
                                Cursor cursor2 = (Cursor) obj;
                                Objects.requireNonNull(sQLiteSchema2);
                                String string = cursor2.getString(0);
                                long j2 = cursor2.getLong(1);
                                SQLitePersistence.Query query2 = new SQLitePersistence.Query(sQLiteSchema2.f22815a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?");
                                query2.m12409a(string, Long.valueOf(j2));
                                query2.m12410b(new C2104d(sQLiteSchema2, string, 2));
                                return;
                            default:
                                SQLiteSchema sQLiteSchema3 = this.f22832b;
                                Cursor cursor3 = (Cursor) obj;
                                Objects.requireNonNull(sQLiteSchema3);
                                int i6 = cursor3.getInt(0);
                                try {
                                    Target m12476K = Target.m12476K(cursor3.getBlob(1));
                                    Objects.requireNonNull(sQLiteSchema3.f22816b);
                                    m12476K.m12477J();
                                    throw null;
                                } catch (InvalidProtocolBufferException unused2) {
                                    Assert.m12489a("Failed to decode Query data for target %s", Integer.valueOf(i6));
                                    throw null;
                                }
                        }
                    }
                });
            } else {
                this.f22815a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
                this.f22815a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
            }
        }
        if (i2 == 9) {
            new SQLitePersistence.Query(this.f22815a, "SELECT target_id, target_proto FROM targets").m12410b(new Consumer(this) { // from class: com.google.firebase.firestore.local.c

                /* renamed from: b */
                public final /* synthetic */ SQLiteSchema f22832b;

                {
                    this.f22832b = this;
                }

                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) {
                    switch (i4) {
                        case 0:
                            SQLiteSchema sQLiteSchema = this.f22832b;
                            Cursor cursor = (Cursor) obj;
                            Objects.requireNonNull(sQLiteSchema);
                            int i5 = cursor.getInt(0);
                            try {
                                Target.Builder mo13429b = Target.m12476K(cursor.getBlob(1)).mo13429b();
                                mo13429b.m13441n();
                                Target.m12475I((Target) mo13429b.f24185c);
                                sQLiteSchema.f22815a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{mo13429b.mo13437A().mo12977i(), Integer.valueOf(i5)});
                                return;
                            } catch (InvalidProtocolBufferException unused) {
                                Assert.m12489a("Failed to decode Query data for target %s", Integer.valueOf(i5));
                                throw null;
                            }
                        case 1:
                            SQLiteSchema sQLiteSchema2 = this.f22832b;
                            Cursor cursor2 = (Cursor) obj;
                            Objects.requireNonNull(sQLiteSchema2);
                            String string = cursor2.getString(0);
                            long j2 = cursor2.getLong(1);
                            SQLitePersistence.Query query2 = new SQLitePersistence.Query(sQLiteSchema2.f22815a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?");
                            query2.m12409a(string, Long.valueOf(j2));
                            query2.m12410b(new C2104d(sQLiteSchema2, string, 2));
                            return;
                        default:
                            SQLiteSchema sQLiteSchema3 = this.f22832b;
                            Cursor cursor3 = (Cursor) obj;
                            Objects.requireNonNull(sQLiteSchema3);
                            int i6 = cursor3.getInt(0);
                            try {
                                Target m12476K = Target.m12476K(cursor3.getBlob(1));
                                Objects.requireNonNull(sQLiteSchema3.f22816b);
                                m12476K.m12477J();
                                throw null;
                            } catch (InvalidProtocolBufferException unused2) {
                                Assert.m12489a("Failed to decode Query data for target %s", Integer.valueOf(i6));
                                throw null;
                            }
                    }
                }
            });
        }
        if (i2 < 11) {
            final int i5 = 2;
            new SQLitePersistence.Query(this.f22815a, "SELECT target_id, target_proto FROM targets").m12410b(new Consumer(this) { // from class: com.google.firebase.firestore.local.c

                /* renamed from: b */
                public final /* synthetic */ SQLiteSchema f22832b;

                {
                    this.f22832b = this;
                }

                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) {
                    switch (i5) {
                        case 0:
                            SQLiteSchema sQLiteSchema = this.f22832b;
                            Cursor cursor = (Cursor) obj;
                            Objects.requireNonNull(sQLiteSchema);
                            int i52 = cursor.getInt(0);
                            try {
                                Target.Builder mo13429b = Target.m12476K(cursor.getBlob(1)).mo13429b();
                                mo13429b.m13441n();
                                Target.m12475I((Target) mo13429b.f24185c);
                                sQLiteSchema.f22815a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{mo13429b.mo13437A().mo12977i(), Integer.valueOf(i52)});
                                return;
                            } catch (InvalidProtocolBufferException unused) {
                                Assert.m12489a("Failed to decode Query data for target %s", Integer.valueOf(i52));
                                throw null;
                            }
                        case 1:
                            SQLiteSchema sQLiteSchema2 = this.f22832b;
                            Cursor cursor2 = (Cursor) obj;
                            Objects.requireNonNull(sQLiteSchema2);
                            String string = cursor2.getString(0);
                            long j2 = cursor2.getLong(1);
                            SQLitePersistence.Query query2 = new SQLitePersistence.Query(sQLiteSchema2.f22815a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?");
                            query2.m12409a(string, Long.valueOf(j2));
                            query2.m12410b(new C2104d(sQLiteSchema2, string, 2));
                            return;
                        default:
                            SQLiteSchema sQLiteSchema3 = this.f22832b;
                            Cursor cursor3 = (Cursor) obj;
                            Objects.requireNonNull(sQLiteSchema3);
                            int i6 = cursor3.getInt(0);
                            try {
                                Target m12476K = Target.m12476K(cursor3.getBlob(1));
                                Objects.requireNonNull(sQLiteSchema3.f22816b);
                                m12476K.m12477J();
                                throw null;
                            } catch (InvalidProtocolBufferException unused2) {
                                Assert.m12489a("Failed to decode Query data for target %s", Integer.valueOf(i6));
                                throw null;
                            }
                    }
                }
            });
        }
        if (i2 < 12) {
            m12413a(new String[]{"bundles", "named_queries"}, new RunnableC2105e(this, 1));
        }
        if (i2 < 13) {
            if (!m12415c("remote_documents", "path_length")) {
                this.f22815a.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
            }
            SQLitePersistence.Query query2 = new SQLitePersistence.Query(this.f22815a, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?");
            query2.m12409a(100);
            SQLiteStatement compileStatement2 = this.f22815a.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
            boolean[] zArr2 = new boolean[1];
            do {
                zArr2[0] = false;
                query2.m12410b(new C2104d(zArr2, compileStatement2, 0));
            } while (zArr2[0]);
        }
        if (i2 < 14) {
            m12413a(new String[]{"document_overlays"}, new RunnableC2105e(this, 6));
            m12413a(new String[]{"data_migrations"}, new RunnableC2105e(this, 3));
            this.f22815a.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{"BUILD_OVERLAYS"});
        }
        if (i2 < 15) {
            this.f22815a.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
        }
        if (i2 < 16) {
            m12413a(new String[]{"index_configuration", "index_state", "index_entries"}, new RunnableC2105e(this, 0));
        }
        Logger.m12494a(Logger.Level.DEBUG, "SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i2), 16, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: c */
    public final boolean m12415c(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.f22815a.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursor.getColumnIndex("name");
            while (cursor.moveToNext()) {
                arrayList.add(cursor.getString(columnIndex));
            }
            cursor.close();
            return arrayList.indexOf(str2) != -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final boolean m12416d(String str) {
        new SQLitePersistence.Query(this.f22815a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").m12409a(str);
        return !r0.m12411c();
    }
}
