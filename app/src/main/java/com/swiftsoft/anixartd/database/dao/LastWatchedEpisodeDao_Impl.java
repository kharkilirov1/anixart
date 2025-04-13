package com.swiftsoft.anixartd.database.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import com.swiftsoft.anixartd.database.entity.episode.LastWatchedEpisode;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class LastWatchedEpisodeDao_Impl implements LastWatchedEpisodeDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<LastWatchedEpisode> __deletionAdapterOfLastWatchedEpisode;
    private final EntityInsertionAdapter<LastWatchedEpisode> __insertionAdapterOfLastWatchedEpisode;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final EntityDeletionOrUpdateAdapter<LastWatchedEpisode> __updateAdapterOfLastWatchedEpisode;

    public LastWatchedEpisodeDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfLastWatchedEpisode = new EntityInsertionAdapter<LastWatchedEpisode>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `LastWatchedEpisode` (`id`,`releaseId`,`typeId`,`sourceId`,`episodeId`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, LastWatchedEpisode lastWatchedEpisode) {
                supportSQLiteStatement.mo4050i0(1, lastWatchedEpisode.getId());
                supportSQLiteStatement.mo4050i0(2, lastWatchedEpisode.getReleaseId());
                supportSQLiteStatement.mo4050i0(3, lastWatchedEpisode.getTypeId());
                supportSQLiteStatement.mo4050i0(4, lastWatchedEpisode.getSourceId());
                supportSQLiteStatement.mo4050i0(5, lastWatchedEpisode.getEpisodeId());
                supportSQLiteStatement.mo4050i0(6, lastWatchedEpisode.getTimestamp());
            }
        };
        this.__deletionAdapterOfLastWatchedEpisode = new EntityDeletionOrUpdateAdapter<LastWatchedEpisode>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `LastWatchedEpisode` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, LastWatchedEpisode lastWatchedEpisode) {
                supportSQLiteStatement.mo4050i0(1, lastWatchedEpisode.getId());
            }
        };
        this.__updateAdapterOfLastWatchedEpisode = new EntityDeletionOrUpdateAdapter<LastWatchedEpisode>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `LastWatchedEpisode` SET `id` = ?,`releaseId` = ?,`typeId` = ?,`sourceId` = ?,`episodeId` = ?,`timestamp` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, LastWatchedEpisode lastWatchedEpisode) {
                supportSQLiteStatement.mo4050i0(1, lastWatchedEpisode.getId());
                supportSQLiteStatement.mo4050i0(2, lastWatchedEpisode.getReleaseId());
                supportSQLiteStatement.mo4050i0(3, lastWatchedEpisode.getTypeId());
                supportSQLiteStatement.mo4050i0(4, lastWatchedEpisode.getSourceId());
                supportSQLiteStatement.mo4050i0(5, lastWatchedEpisode.getEpisodeId());
                supportSQLiteStatement.mo4050i0(6, lastWatchedEpisode.getTimestamp());
                supportSQLiteStatement.mo4050i0(7, lastWatchedEpisode.getId());
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM LastWatchedEpisode";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            acquire.mo4045K();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(acquire);
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao
    public LastWatchedEpisode findByReleaseIdOrderByTimestamp(long j2) {
        RoomSQLiteQuery m4083c = RoomSQLiteQuery.m4083c("SELECT * FROM `LastWatchedEpisode` WHERE `releaseId` = ? ORDER BY `timestamp` DESC LIMIT 1", 1);
        m4083c.mo4050i0(1, j2);
        this.__db.assertNotSuspendingTransaction();
        LastWatchedEpisode lastWatchedEpisode = null;
        Cursor m4094a = DBUtil.m4094a(this.__db, m4083c, false, null);
        try {
            int m4093a = CursorUtil.m4093a(m4094a, "id");
            int m4093a2 = CursorUtil.m4093a(m4094a, "releaseId");
            int m4093a3 = CursorUtil.m4093a(m4094a, "typeId");
            int m4093a4 = CursorUtil.m4093a(m4094a, "sourceId");
            int m4093a5 = CursorUtil.m4093a(m4094a, "episodeId");
            int m4093a6 = CursorUtil.m4093a(m4094a, "timestamp");
            if (m4094a.moveToFirst()) {
                lastWatchedEpisode = new LastWatchedEpisode();
                lastWatchedEpisode.setId(m4094a.getLong(m4093a));
                lastWatchedEpisode.setReleaseId(m4094a.getLong(m4093a2));
                lastWatchedEpisode.setTypeId(m4094a.getLong(m4093a3));
                lastWatchedEpisode.setSourceId(m4094a.getLong(m4093a4));
                lastWatchedEpisode.setEpisodeId(m4094a.getLong(m4093a5));
                lastWatchedEpisode.setTimestamp(m4094a.getLong(m4093a6));
            }
            return lastWatchedEpisode;
        } finally {
            m4094a.close();
            m4083c.m4086e();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void delete(LastWatchedEpisode lastWatchedEpisode) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfLastWatchedEpisode.handle(lastWatchedEpisode);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void save(LastWatchedEpisode lastWatchedEpisode) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfLastWatchedEpisode.insert((EntityInsertionAdapter<LastWatchedEpisode>) lastWatchedEpisode);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void update(LastWatchedEpisode lastWatchedEpisode) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfLastWatchedEpisode.handle(lastWatchedEpisode);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
