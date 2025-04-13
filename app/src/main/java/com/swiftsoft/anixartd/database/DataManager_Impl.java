package com.swiftsoft.anixartd.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.TableInfo;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import com.swiftsoft.anixartd.database.dao.CustomFilterDao;
import com.swiftsoft.anixartd.database.dao.CustomFilterDao_Impl;
import com.swiftsoft.anixartd.database.dao.EpisodeDao;
import com.swiftsoft.anixartd.database.dao.EpisodeDao_Impl;
import com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao;
import com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao_Impl;
import com.swiftsoft.anixartd.database.dao.SearchDao;
import com.swiftsoft.anixartd.database.dao.SearchDao_Impl;
import com.swiftsoft.anixartd.database.dao.UserDao;
import com.swiftsoft.anixartd.database.dao.UserDao_Impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class DataManager_Impl extends DataManager {
    private volatile CustomFilterDao _customFilterDao;
    private volatile EpisodeDao _episodeDao;
    private volatile LastWatchedEpisodeDao _lastWatchedEpisodeDao;
    private volatile SearchDao _searchDao;
    private volatile UserDao _userDao;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.mo4032I("DELETE FROM `User`");
            writableDatabase.mo4032I("DELETE FROM `Episode`");
            writableDatabase.mo4032I("DELETE FROM `Search`");
            writableDatabase.mo4032I("DELETE FROM `LastWatchedEpisode`");
            writableDatabase.mo4032I("DELETE FROM `CustomFilter`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.mo4040q0("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.mo4035Q0()) {
                writableDatabase.mo4032I("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "User", "Episode", "Search", "LastWatchedEpisode", "CustomFilter");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(9) { // from class: com.swiftsoft.anixartd.database.DataManager_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.mo4032I("CREATE TABLE IF NOT EXISTS `User` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `avatar` TEXT NOT NULL)");
                supportSQLiteDatabase.mo4032I("CREATE TABLE IF NOT EXISTS `Episode` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `releaseId` INTEGER NOT NULL, `sourceId` INTEGER NOT NULL, `name` TEXT, `url` TEXT NOT NULL, `iframe` INTEGER NOT NULL, `position` INTEGER NOT NULL, `playbackPosition` INTEGER NOT NULL, `addedDate` INTEGER NOT NULL, `isFiller` INTEGER NOT NULL, `isWatched` INTEGER NOT NULL)");
                supportSQLiteDatabase.mo4032I("CREATE TABLE IF NOT EXISTS `Search` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `query` TEXT NOT NULL, `tsLastRequest` INTEGER NOT NULL)");
                supportSQLiteDatabase.mo4032I("CREATE TABLE IF NOT EXISTS `LastWatchedEpisode` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `releaseId` INTEGER NOT NULL, `typeId` INTEGER NOT NULL, `sourceId` INTEGER NOT NULL, `episodeId` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL)");
                supportSQLiteDatabase.mo4032I("CREATE TABLE IF NOT EXISTS `CustomFilter` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `selectedCategoryId` INTEGER, `selectedStatusId` INTEGER, `selectedStartYear` INTEGER, `selectedEndYear` INTEGER, `selectedStudio` TEXT NOT NULL, `selectedEpisodes` INTEGER, `selectedSort` INTEGER, `selectedCountry` TEXT NOT NULL, `selectedSeason` INTEGER, `selectedEpisodeDuration` INTEGER, `selectedGenres` TEXT NOT NULL, `selectedProfileListExclusions` TEXT NOT NULL, `selectedTypes` TEXT NOT NULL, `selectedAgeRatings` TEXT NOT NULL, `isGenresExcludeModeEnabled` INTEGER NOT NULL)");
                supportSQLiteDatabase.mo4032I("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.mo4032I("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2303ab9ca402a998b4f813297ba413e3')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.mo4032I("DROP TABLE IF EXISTS `User`");
                supportSQLiteDatabase.mo4032I("DROP TABLE IF EXISTS `Episode`");
                supportSQLiteDatabase.mo4032I("DROP TABLE IF EXISTS `Search`");
                supportSQLiteDatabase.mo4032I("DROP TABLE IF EXISTS `LastWatchedEpisode`");
                supportSQLiteDatabase.mo4032I("DROP TABLE IF EXISTS `CustomFilter`");
                if (DataManager_Impl.this.mCallbacks != null) {
                    int size = DataManager_Impl.this.mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Objects.requireNonNull((RoomDatabase.Callback) DataManager_Impl.this.mCallbacks.get(i2));
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (DataManager_Impl.this.mCallbacks != null) {
                    int size = DataManager_Impl.this.mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Objects.requireNonNull((RoomDatabase.Callback) DataManager_Impl.this.mCallbacks.get(i2));
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                DataManager_Impl.this.mDatabase = supportSQLiteDatabase;
                DataManager_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (DataManager_Impl.this.mCallbacks != null) {
                    int size = DataManager_Impl.this.mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Objects.requireNonNull((RoomDatabase.Callback) DataManager_Impl.this.mCallbacks.get(i2));
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                ArrayList arrayList = new ArrayList();
                Cursor mo4040q0 = supportSQLiteDatabase.mo4040q0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (mo4040q0.moveToNext()) {
                    try {
                        arrayList.add(mo4040q0.getString(0));
                    } catch (Throwable th) {
                        mo4040q0.close();
                        throw th;
                    }
                }
                mo4040q0.close();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str.startsWith("room_fts_content_sync_")) {
                        supportSQLiteDatabase.mo4032I("DROP TRIGGER IF EXISTS " + str);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap hashMap = new HashMap(3);
                hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                hashMap.put("avatar", new TableInfo.Column("avatar", "TEXT", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("User", hashMap, new HashSet(0), new HashSet(0));
                TableInfo m4096a = TableInfo.m4096a(supportSQLiteDatabase, "User");
                if (!tableInfo.equals(m4096a)) {
                    return new RoomOpenHelper.ValidationResult(false, "User(com.swiftsoft.anixartd.database.entity.User).\n Expected:\n" + tableInfo + "\n Found:\n" + m4096a);
                }
                HashMap hashMap2 = new HashMap(11);
                hashMap2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap2.put("releaseId", new TableInfo.Column("releaseId", "INTEGER", true, 0, null, 1));
                hashMap2.put("sourceId", new TableInfo.Column("sourceId", "INTEGER", true, 0, null, 1));
                hashMap2.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
                hashMap2.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, 1));
                hashMap2.put("iframe", new TableInfo.Column("iframe", "INTEGER", true, 0, null, 1));
                hashMap2.put("position", new TableInfo.Column("position", "INTEGER", true, 0, null, 1));
                hashMap2.put("playbackPosition", new TableInfo.Column("playbackPosition", "INTEGER", true, 0, null, 1));
                hashMap2.put("addedDate", new TableInfo.Column("addedDate", "INTEGER", true, 0, null, 1));
                hashMap2.put("isFiller", new TableInfo.Column("isFiller", "INTEGER", true, 0, null, 1));
                hashMap2.put("isWatched", new TableInfo.Column("isWatched", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo2 = new TableInfo("Episode", hashMap2, new HashSet(0), new HashSet(0));
                TableInfo m4096a2 = TableInfo.m4096a(supportSQLiteDatabase, "Episode");
                if (!tableInfo2.equals(m4096a2)) {
                    return new RoomOpenHelper.ValidationResult(false, "Episode(com.swiftsoft.anixartd.database.entity.episode.Episode).\n Expected:\n" + tableInfo2 + "\n Found:\n" + m4096a2);
                }
                HashMap hashMap3 = new HashMap(4);
                hashMap3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap3.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                hashMap3.put("query", new TableInfo.Column("query", "TEXT", true, 0, null, 1));
                hashMap3.put("tsLastRequest", new TableInfo.Column("tsLastRequest", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("Search", hashMap3, new HashSet(0), new HashSet(0));
                TableInfo m4096a3 = TableInfo.m4096a(supportSQLiteDatabase, "Search");
                if (!tableInfo3.equals(m4096a3)) {
                    return new RoomOpenHelper.ValidationResult(false, "Search(com.swiftsoft.anixartd.database.entity.Search).\n Expected:\n" + tableInfo3 + "\n Found:\n" + m4096a3);
                }
                HashMap hashMap4 = new HashMap(6);
                hashMap4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap4.put("releaseId", new TableInfo.Column("releaseId", "INTEGER", true, 0, null, 1));
                hashMap4.put("typeId", new TableInfo.Column("typeId", "INTEGER", true, 0, null, 1));
                hashMap4.put("sourceId", new TableInfo.Column("sourceId", "INTEGER", true, 0, null, 1));
                hashMap4.put("episodeId", new TableInfo.Column("episodeId", "INTEGER", true, 0, null, 1));
                hashMap4.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo4 = new TableInfo("LastWatchedEpisode", hashMap4, new HashSet(0), new HashSet(0));
                TableInfo m4096a4 = TableInfo.m4096a(supportSQLiteDatabase, "LastWatchedEpisode");
                if (!tableInfo4.equals(m4096a4)) {
                    return new RoomOpenHelper.ValidationResult(false, "LastWatchedEpisode(com.swiftsoft.anixartd.database.entity.episode.LastWatchedEpisode).\n Expected:\n" + tableInfo4 + "\n Found:\n" + m4096a4);
                }
                HashMap hashMap5 = new HashMap(16);
                hashMap5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap5.put("selectedCategoryId", new TableInfo.Column("selectedCategoryId", "INTEGER", false, 0, null, 1));
                hashMap5.put("selectedStatusId", new TableInfo.Column("selectedStatusId", "INTEGER", false, 0, null, 1));
                hashMap5.put("selectedStartYear", new TableInfo.Column("selectedStartYear", "INTEGER", false, 0, null, 1));
                hashMap5.put("selectedEndYear", new TableInfo.Column("selectedEndYear", "INTEGER", false, 0, null, 1));
                hashMap5.put("selectedStudio", new TableInfo.Column("selectedStudio", "TEXT", true, 0, null, 1));
                hashMap5.put("selectedEpisodes", new TableInfo.Column("selectedEpisodes", "INTEGER", false, 0, null, 1));
                hashMap5.put("selectedSort", new TableInfo.Column("selectedSort", "INTEGER", false, 0, null, 1));
                hashMap5.put("selectedCountry", new TableInfo.Column("selectedCountry", "TEXT", true, 0, null, 1));
                hashMap5.put("selectedSeason", new TableInfo.Column("selectedSeason", "INTEGER", false, 0, null, 1));
                hashMap5.put("selectedEpisodeDuration", new TableInfo.Column("selectedEpisodeDuration", "INTEGER", false, 0, null, 1));
                hashMap5.put("selectedGenres", new TableInfo.Column("selectedGenres", "TEXT", true, 0, null, 1));
                hashMap5.put("selectedProfileListExclusions", new TableInfo.Column("selectedProfileListExclusions", "TEXT", true, 0, null, 1));
                hashMap5.put("selectedTypes", new TableInfo.Column("selectedTypes", "TEXT", true, 0, null, 1));
                hashMap5.put("selectedAgeRatings", new TableInfo.Column("selectedAgeRatings", "TEXT", true, 0, null, 1));
                hashMap5.put("isGenresExcludeModeEnabled", new TableInfo.Column("isGenresExcludeModeEnabled", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("CustomFilter", hashMap5, new HashSet(0), new HashSet(0));
                TableInfo m4096a5 = TableInfo.m4096a(supportSQLiteDatabase, "CustomFilter");
                if (tableInfo5.equals(m4096a5)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "CustomFilter(com.swiftsoft.anixartd.database.entity.CustomFilter).\n Expected:\n" + tableInfo5 + "\n Found:\n" + m4096a5);
            }
        }, "2303ab9ca402a998b4f813297ba413e3", "641ec6974dc8b3bf0e28da0e5e086f6f");
        SupportSQLiteOpenHelper.Configuration.Builder builder = new SupportSQLiteOpenHelper.Configuration.Builder(databaseConfiguration.f5751b);
        builder.f6019b = databaseConfiguration.f5752c;
        builder.f6020c = roomOpenHelper;
        return databaseConfiguration.f5750a.mo4052a(builder.m4154a());
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[0]);
    }

    @Override // com.swiftsoft.anixartd.database.DataManager, com.swiftsoft.anixartd.database.Daos
    public CustomFilterDao getCustomFilterDao() {
        CustomFilterDao customFilterDao;
        if (this._customFilterDao != null) {
            return this._customFilterDao;
        }
        synchronized (this) {
            if (this._customFilterDao == null) {
                this._customFilterDao = new CustomFilterDao_Impl(this);
            }
            customFilterDao = this._customFilterDao;
        }
        return customFilterDao;
    }

    @Override // com.swiftsoft.anixartd.database.DataManager, com.swiftsoft.anixartd.database.Daos
    public EpisodeDao getEpisodeDao() {
        EpisodeDao episodeDao;
        if (this._episodeDao != null) {
            return this._episodeDao;
        }
        synchronized (this) {
            if (this._episodeDao == null) {
                this._episodeDao = new EpisodeDao_Impl(this);
            }
            episodeDao = this._episodeDao;
        }
        return episodeDao;
    }

    @Override // com.swiftsoft.anixartd.database.DataManager, com.swiftsoft.anixartd.database.Daos
    public LastWatchedEpisodeDao getLastWatchedEpisodeDao() {
        LastWatchedEpisodeDao lastWatchedEpisodeDao;
        if (this._lastWatchedEpisodeDao != null) {
            return this._lastWatchedEpisodeDao;
        }
        synchronized (this) {
            if (this._lastWatchedEpisodeDao == null) {
                this._lastWatchedEpisodeDao = new LastWatchedEpisodeDao_Impl(this);
            }
            lastWatchedEpisodeDao = this._lastWatchedEpisodeDao;
        }
        return lastWatchedEpisodeDao;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
        hashMap.put(EpisodeDao.class, EpisodeDao_Impl.getRequiredConverters());
        hashMap.put(SearchDao.class, SearchDao_Impl.getRequiredConverters());
        hashMap.put(LastWatchedEpisodeDao.class, LastWatchedEpisodeDao_Impl.getRequiredConverters());
        hashMap.put(CustomFilterDao.class, CustomFilterDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.swiftsoft.anixartd.database.DataManager, com.swiftsoft.anixartd.database.Daos
    public SearchDao getSearchDao() {
        SearchDao searchDao;
        if (this._searchDao != null) {
            return this._searchDao;
        }
        synchronized (this) {
            if (this._searchDao == null) {
                this._searchDao = new SearchDao_Impl(this);
            }
            searchDao = this._searchDao;
        }
        return searchDao;
    }

    @Override // com.swiftsoft.anixartd.database.DataManager, com.swiftsoft.anixartd.database.Daos
    public UserDao getUserDao() {
        UserDao userDao;
        if (this._userDao != null) {
            return this._userDao;
        }
        synchronized (this) {
            if (this._userDao == null) {
                this._userDao = new UserDao_Impl(this);
            }
            userDao = this._userDao;
        }
        return userDao;
    }
}
