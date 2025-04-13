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
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class EpisodeDao_Impl implements EpisodeDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<Episode> __deletionAdapterOfEpisode;
    private final EntityInsertionAdapter<Episode> __insertionAdapterOfEpisode;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllByReleaseIdAndSourceId;
    private final SharedSQLiteStatement __preparedStmtOfUpdateIsWatchedByReleaseIdAndSourceId;
    private final SharedSQLiteStatement __preparedStmtOfUpdatePlaybackPositionByReleaseIdAndSourceId;
    private final EntityDeletionOrUpdateAdapter<Episode> __updateAdapterOfEpisode;

    public EpisodeDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfEpisode = new EntityInsertionAdapter<Episode>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.EpisodeDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `Episode` (`id`,`releaseId`,`sourceId`,`name`,`url`,`iframe`,`position`,`playbackPosition`,`addedDate`,`isFiller`,`isWatched`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, Episode episode) {
                supportSQLiteStatement.mo4050i0(1, episode.getId());
                supportSQLiteStatement.mo4050i0(2, episode.getReleaseId());
                supportSQLiteStatement.mo4050i0(3, episode.getSourceId());
                if (episode.getName() == null) {
                    supportSQLiteStatement.mo4044J0(4);
                } else {
                    supportSQLiteStatement.mo4048f(4, episode.getName());
                }
                if (episode.getUrl() == null) {
                    supportSQLiteStatement.mo4044J0(5);
                } else {
                    supportSQLiteStatement.mo4048f(5, episode.getUrl());
                }
                supportSQLiteStatement.mo4050i0(6, episode.getIframe() ? 1L : 0L);
                supportSQLiteStatement.mo4050i0(7, episode.getPosition());
                supportSQLiteStatement.mo4050i0(8, episode.getPlaybackPosition());
                supportSQLiteStatement.mo4050i0(9, episode.getAddedDate());
                supportSQLiteStatement.mo4050i0(10, episode.getIsFiller() ? 1L : 0L);
                supportSQLiteStatement.mo4050i0(11, episode.getIsWatched() ? 1L : 0L);
            }
        };
        this.__deletionAdapterOfEpisode = new EntityDeletionOrUpdateAdapter<Episode>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.EpisodeDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `Episode` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, Episode episode) {
                supportSQLiteStatement.mo4050i0(1, episode.getId());
            }
        };
        this.__updateAdapterOfEpisode = new EntityDeletionOrUpdateAdapter<Episode>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.EpisodeDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `Episode` SET `id` = ?,`releaseId` = ?,`sourceId` = ?,`name` = ?,`url` = ?,`iframe` = ?,`position` = ?,`playbackPosition` = ?,`addedDate` = ?,`isFiller` = ?,`isWatched` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, Episode episode) {
                supportSQLiteStatement.mo4050i0(1, episode.getId());
                supportSQLiteStatement.mo4050i0(2, episode.getReleaseId());
                supportSQLiteStatement.mo4050i0(3, episode.getSourceId());
                if (episode.getName() == null) {
                    supportSQLiteStatement.mo4044J0(4);
                } else {
                    supportSQLiteStatement.mo4048f(4, episode.getName());
                }
                if (episode.getUrl() == null) {
                    supportSQLiteStatement.mo4044J0(5);
                } else {
                    supportSQLiteStatement.mo4048f(5, episode.getUrl());
                }
                supportSQLiteStatement.mo4050i0(6, episode.getIframe() ? 1L : 0L);
                supportSQLiteStatement.mo4050i0(7, episode.getPosition());
                supportSQLiteStatement.mo4050i0(8, episode.getPlaybackPosition());
                supportSQLiteStatement.mo4050i0(9, episode.getAddedDate());
                supportSQLiteStatement.mo4050i0(10, episode.getIsFiller() ? 1L : 0L);
                supportSQLiteStatement.mo4050i0(11, episode.getIsWatched() ? 1L : 0L);
                supportSQLiteStatement.mo4050i0(12, episode.getId());
            }
        };
        this.__preparedStmtOfUpdateIsWatchedByReleaseIdAndSourceId = new SharedSQLiteStatement(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.EpisodeDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE `Episode` SET `isWatched` = ? WHERE `releaseId` = ? AND `sourceId` = ? AND isWatched != ?";
            }
        };
        this.__preparedStmtOfUpdatePlaybackPositionByReleaseIdAndSourceId = new SharedSQLiteStatement(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.EpisodeDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE `Episode` SET `playbackPosition` = ? WHERE `releaseId` = ? AND `sourceId` = ?";
            }
        };
        this.__preparedStmtOfDeleteAllByReleaseIdAndSourceId = new SharedSQLiteStatement(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.EpisodeDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `Episode` WHERE `releaseId` = ? AND `sourceId` = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.EpisodeDao_Impl.7
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `Episode`";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.swiftsoft.anixartd.database.dao.EpisodeDao
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

    @Override // com.swiftsoft.anixartd.database.dao.EpisodeDao
    public void deleteAllByReleaseIdAndSourceId(long j2, long j3) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteAllByReleaseIdAndSourceId.acquire();
        acquire.mo4050i0(1, j2);
        acquire.mo4050i0(2, j3);
        this.__db.beginTransaction();
        try {
            acquire.mo4045K();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAllByReleaseIdAndSourceId.release(acquire);
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.EpisodeDao
    public boolean existsByReleaseIdAndSourceIdAndPosition(long j2, long j3, int i2) {
        RoomSQLiteQuery m4083c = RoomSQLiteQuery.m4083c("SELECT COUNT(`id`) > 0 FROM `Episode` WHERE `releaseId` = ? AND `sourceId` = ? AND `position` = ?", 3);
        m4083c.mo4050i0(1, j2);
        m4083c.mo4050i0(2, j3);
        m4083c.mo4050i0(3, i2);
        this.__db.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor m4094a = DBUtil.m4094a(this.__db, m4083c, false, null);
        try {
            if (m4094a.moveToFirst()) {
                z = m4094a.getInt(0) != 0;
            }
            return z;
        } finally {
            m4094a.close();
            m4083c.m4086e();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.EpisodeDao
    public List<Episode> findAllByReleaseIdAndSourceIdAndIsWatched(long j2, long j3, boolean z) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery m4083c = RoomSQLiteQuery.m4083c("SELECT * FROM `Episode` WHERE `releaseId` = ? AND `sourceId` = ? AND isWatched = ?", 3);
        m4083c.mo4050i0(1, j2);
        m4083c.mo4050i0(2, j3);
        m4083c.mo4050i0(3, z ? 1L : 0L);
        this.__db.assertNotSuspendingTransaction();
        Cursor m4094a = DBUtil.m4094a(this.__db, m4083c, false, null);
        try {
            int m4093a = CursorUtil.m4093a(m4094a, "id");
            int m4093a2 = CursorUtil.m4093a(m4094a, "releaseId");
            int m4093a3 = CursorUtil.m4093a(m4094a, "sourceId");
            int m4093a4 = CursorUtil.m4093a(m4094a, "name");
            int m4093a5 = CursorUtil.m4093a(m4094a, "url");
            int m4093a6 = CursorUtil.m4093a(m4094a, "iframe");
            int m4093a7 = CursorUtil.m4093a(m4094a, "position");
            int m4093a8 = CursorUtil.m4093a(m4094a, "playbackPosition");
            int m4093a9 = CursorUtil.m4093a(m4094a, "addedDate");
            int m4093a10 = CursorUtil.m4093a(m4094a, "isFiller");
            int m4093a11 = CursorUtil.m4093a(m4094a, "isWatched");
            ArrayList arrayList = new ArrayList(m4094a.getCount());
            while (m4094a.moveToNext()) {
                Episode episode = new Episode();
                roomSQLiteQuery = m4083c;
                ArrayList arrayList2 = arrayList;
                try {
                    episode.setId(m4094a.getLong(m4093a));
                    episode.setReleaseId(m4094a.getLong(m4093a2));
                    episode.setSourceId(m4094a.getLong(m4093a3));
                    episode.setName(m4094a.isNull(m4093a4) ? null : m4094a.getString(m4093a4));
                    episode.setUrl(m4094a.isNull(m4093a5) ? null : m4094a.getString(m4093a5));
                    episode.setIframe(m4094a.getInt(m4093a6) != 0);
                    episode.setPosition(m4094a.getInt(m4093a7));
                    episode.setPlaybackPosition(m4094a.getLong(m4093a8));
                    episode.setAddedDate(m4094a.getLong(m4093a9));
                    episode.setFiller(m4094a.getInt(m4093a10) != 0);
                    episode.setWatched(m4094a.getInt(m4093a11) != 0);
                    arrayList2.add(episode);
                    arrayList = arrayList2;
                    m4083c = roomSQLiteQuery;
                } catch (Throwable th) {
                    th = th;
                    m4094a.close();
                    roomSQLiteQuery.m4086e();
                    throw th;
                }
            }
            RoomSQLiteQuery roomSQLiteQuery2 = m4083c;
            ArrayList arrayList3 = arrayList;
            m4094a.close();
            roomSQLiteQuery2.m4086e();
            return arrayList3;
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = m4083c;
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.EpisodeDao
    public Episode findByReleaseIdAndSourceIdAndPosition(long j2, long j3, int i2) {
        Episode episode;
        RoomSQLiteQuery m4083c = RoomSQLiteQuery.m4083c("SELECT * FROM `Episode` WHERE `releaseId` = ? AND `sourceId` = ? AND `position` = ?", 3);
        m4083c.mo4050i0(1, j2);
        m4083c.mo4050i0(2, j3);
        m4083c.mo4050i0(3, i2);
        this.__db.assertNotSuspendingTransaction();
        Cursor m4094a = DBUtil.m4094a(this.__db, m4083c, false, null);
        try {
            int m4093a = CursorUtil.m4093a(m4094a, "id");
            int m4093a2 = CursorUtil.m4093a(m4094a, "releaseId");
            int m4093a3 = CursorUtil.m4093a(m4094a, "sourceId");
            int m4093a4 = CursorUtil.m4093a(m4094a, "name");
            int m4093a5 = CursorUtil.m4093a(m4094a, "url");
            int m4093a6 = CursorUtil.m4093a(m4094a, "iframe");
            int m4093a7 = CursorUtil.m4093a(m4094a, "position");
            int m4093a8 = CursorUtil.m4093a(m4094a, "playbackPosition");
            int m4093a9 = CursorUtil.m4093a(m4094a, "addedDate");
            int m4093a10 = CursorUtil.m4093a(m4094a, "isFiller");
            int m4093a11 = CursorUtil.m4093a(m4094a, "isWatched");
            if (m4094a.moveToFirst()) {
                Episode episode2 = new Episode();
                episode2.setId(m4094a.getLong(m4093a));
                episode2.setReleaseId(m4094a.getLong(m4093a2));
                episode2.setSourceId(m4094a.getLong(m4093a3));
                episode2.setName(m4094a.isNull(m4093a4) ? null : m4094a.getString(m4093a4));
                episode2.setUrl(m4094a.isNull(m4093a5) ? null : m4094a.getString(m4093a5));
                episode2.setIframe(m4094a.getInt(m4093a6) != 0);
                episode2.setPosition(m4094a.getInt(m4093a7));
                episode2.setPlaybackPosition(m4094a.getLong(m4093a8));
                episode2.setAddedDate(m4094a.getLong(m4093a9));
                episode2.setFiller(m4094a.getInt(m4093a10) != 0);
                episode2.setWatched(m4094a.getInt(m4093a11) != 0);
                episode = episode2;
            } else {
                episode = null;
            }
            return episode;
        } finally {
            m4094a.close();
            m4083c.m4086e();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.EpisodeDao
    public void updateIsWatchedByReleaseIdAndSourceId(long j2, long j3, boolean z) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfUpdateIsWatchedByReleaseIdAndSourceId.acquire();
        acquire.mo4050i0(1, z ? 1L : 0L);
        acquire.mo4050i0(2, j2);
        acquire.mo4050i0(3, j3);
        acquire.mo4050i0(4, z ? 1L : 0L);
        this.__db.beginTransaction();
        try {
            acquire.mo4045K();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateIsWatchedByReleaseIdAndSourceId.release(acquire);
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.EpisodeDao
    public void updatePlaybackPositionByReleaseIdAndSourceId(long j2, long j3, long j4) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfUpdatePlaybackPositionByReleaseIdAndSourceId.acquire();
        acquire.mo4050i0(1, j4);
        acquire.mo4050i0(2, j2);
        acquire.mo4050i0(3, j3);
        this.__db.beginTransaction();
        try {
            acquire.mo4045K();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdatePlaybackPositionByReleaseIdAndSourceId.release(acquire);
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.EpisodeDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void delete(Episode episode) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfEpisode.handle(episode);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.EpisodeDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void save(Episode episode) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfEpisode.insert((EntityInsertionAdapter<Episode>) episode);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.EpisodeDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void update(Episode episode) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfEpisode.handle(episode);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
