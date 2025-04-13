package com.swiftsoft.anixartd.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import com.swiftsoft.anixartd.database.dao.CustomFilterDao;
import com.swiftsoft.anixartd.database.dao.EpisodeDao;
import com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao;
import com.swiftsoft.anixartd.database.dao.SearchDao;
import com.swiftsoft.anixartd.database.dao.UserDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DataManager.kt */
@TypeConverters
@Database
@Metadata(m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/DataManager;", "Landroidx/room/RoomDatabase;", "Lcom/swiftsoft/anixartd/database/Daos;", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public abstract class DataManager extends RoomDatabase implements Daos {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Migration MIGRATION_2_TO_3 = new Migration() { // from class: com.swiftsoft.anixartd.database.DataManager$Companion$MIGRATION_2_TO_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.m32179h(database, "database");
            database.mo4032I("CREATE TABLE Episode_new (id INTEGER NOT NULL DEFAULT 0, releaseId INTEGER NOT NULL DEFAULT 0, sourceId INTEGER NOT NULL DEFAULT 0, name TEXT, url TEXT NOT NULL DEFAULT '', iframe INTEGER NOT NULL DEFAULT 0, position INTEGER NOT NULL DEFAULT 0, playbackPosition INTEGER NOT NULL DEFAULT 0, isWatched INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(id))");
            database.mo4032I("INSERT INTO Episode_new (id, releaseId, sourceId, name, url, position, playbackPosition, isWatched) SELECT id, releaseId, sourceId, name, iframeUrl, position, playbackPosition, isOpened FROM Episode");
            database.mo4032I("DROP TABLE Episode");
            database.mo4032I("ALTER TABLE Episode_new RENAME TO Episode");
        }
    };

    @NotNull
    private static final Migration MIGRATION_3_TO_4 = new Migration() { // from class: com.swiftsoft.anixartd.database.DataManager$Companion$MIGRATION_3_TO_4$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.m32179h(database, "database");
            database.mo4032I("CREATE TABLE Episode_new (id INTEGER NOT NULL DEFAULT 0, releaseId INTEGER NOT NULL DEFAULT 0, sourceId INTEGER NOT NULL DEFAULT 0, name TEXT, url TEXT NOT NULL DEFAULT '', iframe INTEGER NOT NULL DEFAULT 0, position INTEGER NOT NULL DEFAULT 0, playbackPosition INTEGER NOT NULL DEFAULT 0, isWatched INTEGER NOT NULL DEFAULT 0, addedDate INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(id))");
            database.mo4032I("INSERT INTO Episode_new (id, releaseId, sourceId, name, url, iframe, position, playbackPosition, isWatched) SELECT id, releaseId, sourceId, name, url, iframe, position, playbackPosition, isWatched FROM Episode");
            database.mo4032I("DROP TABLE Episode");
            database.mo4032I("ALTER TABLE Episode_new RENAME TO Episode");
        }
    };

    @NotNull
    private static final Migration MIGRATION_4_TO_5 = new Migration() { // from class: com.swiftsoft.anixartd.database.DataManager$Companion$MIGRATION_4_TO_5$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.m32179h(database, "database");
            database.mo4032I("CREATE TABLE LastWatchedEpisode (id INTEGER NOT NULL DEFAULT 0, releaseId INTEGER NOT NULL DEFAULT 0, typeId INTEGER NOT NULL DEFAULT 0, sourceId INTEGER NOT NULL DEFAULT 0, episodeId INTEGER NOT NULL DEFAULT 0, timestamp INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(id))");
        }
    };

    @NotNull
    private static final Migration MIGRATION_5_TO_6 = new Migration() { // from class: com.swiftsoft.anixartd.database.DataManager$Companion$MIGRATION_5_TO_6$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.m32179h(database, "database");
            database.mo4032I("CREATE TABLE IF NOT EXISTS `CustomFilter` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `selectedCategory` TEXT NOT NULL, `selectedStatus` TEXT NOT NULL, `selectedYear` TEXT NOT NULL, `selectedGenres` TEXT NOT NULL, `selectedStudio` TEXT NOT NULL, `selectedEpisodes` TEXT NOT NULL, `selectedSort` TEXT NOT NULL, `selectedCountry` TEXT NOT NULL, `selectedSeason` TEXT NOT NULL, `selectedEpisodeDuration` TEXT NOT NULL, `selectedAgeRatings` TEXT NOT NULL)");
        }
    };

    @NotNull
    private static final Migration MIGRATION_6_TO_7 = new Migration() { // from class: com.swiftsoft.anixartd.database.DataManager$Companion$MIGRATION_6_TO_7$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.m32179h(database, "database");
            database.mo4032I("CREATE TABLE IF NOT EXISTS `CustomFilter_new` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `selectedCategoryId` INTEGER, `selectedStatusId` INTEGER, `selectedStartYear` INTEGER, `selectedEndYear` INTEGER, `selectedStudio` TEXT NOT NULL, `selectedEpisodes` INTEGER, `selectedSort` INTEGER, `selectedCountry` TEXT NOT NULL, `selectedSeason` INTEGER, `selectedEpisodeDuration` INTEGER, `selectedGenres` TEXT NOT NULL, `selectedProfileListExclusions` TEXT NOT NULL, `selectedTypes` TEXT NOT NULL, `selectedAgeRatings` TEXT NOT NULL, `isGenresExcludeModeEnabled` INTEGER NOT NULL DEFAULT 0)");
            database.mo4032I("INSERT INTO CustomFilter_new (\n    id, \n    selectedCategoryId, \n    selectedStatusId, \n    selectedStartYear,\n    selectedEndYear,\n    selectedStudio, \n    selectedEpisodes, \n    selectedSort, \n    selectedCountry,\n    selectedSeason,\n    selectedEpisodeDuration,\n    selectedGenres,\n    selectedProfileListExclusions,\n    selectedTypes,\n    selectedAgeRatings,\n    isGenresExcludeModeEnabled\n) \nSELECT \n    id, \n    CASE WHEN selectedCategory != '' THEN CAST(selectedCategory AS INTEGER) ELSE NULL END, \n    CASE WHEN selectedStatus != '' THEN CAST(selectedStatus AS INTEGER) ELSE NULL END, \n    CASE WHEN selectedYear != '' THEN CAST(selectedYear AS INTEGER) ELSE NULL END,  \n    CASE WHEN selectedYear != '' THEN CAST(selectedYear AS INTEGER) ELSE NULL END,\n    selectedStudio, \n    CASE WHEN selectedEpisodes != '' THEN CAST(selectedEpisodes AS INTEGER) ELSE NULL END,\n    CASE WHEN selectedSort != '' THEN CAST(selectedSort AS INTEGER) ELSE NULL END, \n    selectedCountry, \n    CASE WHEN selectedSeason != '' THEN CAST(selectedSeason AS INTEGER) ELSE NULL END, \n    CASE WHEN selectedEpisodeDuration != '' THEN CAST(selectedEpisodeDuration AS INTEGER) ELSE NULL END,\n    selectedGenres,\n    '',\n    '',\n    selectedAgeRatings,\n    0\nFROM CustomFilter");
            database.mo4032I("DROP TABLE CustomFilter");
            database.mo4032I("ALTER TABLE CustomFilter_new RENAME TO CustomFilter");
        }
    };

    @NotNull
    private static final Migration MIGRATION_7_TO_8 = new Migration() { // from class: com.swiftsoft.anixartd.database.DataManager$Companion$MIGRATION_7_TO_8$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.m32179h(database, "database");
            database.mo4032I("CREATE TABLE IF NOT EXISTS `Episode_new` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `releaseId` INTEGER NOT NULL, `sourceId` INTEGER NOT NULL, `name` TEXT, `url` TEXT NOT NULL, `iframe` INTEGER NOT NULL, `position` INTEGER NOT NULL, `playbackPosition` INTEGER NOT NULL, `addedDate` INTEGER NOT NULL, `isWatched` INTEGER NOT NULL)");
            database.mo4032I("INSERT INTO Episode_new (id, releaseId, sourceId, name, url, iframe, position, playbackPosition, addedDate, isWatched) SELECT id, releaseId, sourceId, name, url, iframe, position, playbackPosition, addedDate, isWatched FROM Episode");
            database.mo4032I("DROP TABLE Episode");
            database.mo4032I("ALTER TABLE Episode_new RENAME TO Episode");
        }
    };

    @NotNull
    private static final Migration MIGRATION_8_TO_9 = new Migration() { // from class: com.swiftsoft.anixartd.database.DataManager$Companion$MIGRATION_8_TO_9$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.m32179h(database, "database");
            database.mo4032I("CREATE TABLE IF NOT EXISTS `Episode_new` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `releaseId` INTEGER NOT NULL, `sourceId` INTEGER NOT NULL, `name` TEXT, `url` TEXT NOT NULL, `iframe` INTEGER NOT NULL, `position` INTEGER NOT NULL, `playbackPosition` INTEGER NOT NULL, `addedDate` INTEGER NOT NULL, `isFiller` INTEGER NOT NULL, `isWatched` INTEGER NOT NULL)");
            database.mo4032I("INSERT INTO Episode_new (id, releaseId, sourceId, name, url, iframe, position, playbackPosition, addedDate, isFiller, isWatched) SELECT id, releaseId, sourceId, name, url, iframe, position, playbackPosition, addedDate, 0, isWatched FROM Episode");
            database.mo4032I("DROP TABLE Episode");
            database.mo4032I("ALTER TABLE Episode_new RENAME TO Episode");
        }
    };

    /* compiled from: DataManager.kt */
    @Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/DataManager$Companion;", "", "()V", "MIGRATION_2_TO_3", "Landroidx/room/migration/Migration;", "getMIGRATION_2_TO_3", "()Landroidx/room/migration/Migration;", "MIGRATION_3_TO_4", "getMIGRATION_3_TO_4", "MIGRATION_4_TO_5", "getMIGRATION_4_TO_5", "MIGRATION_5_TO_6", "getMIGRATION_5_TO_6", "MIGRATION_6_TO_7", "getMIGRATION_6_TO_7", "MIGRATION_7_TO_8", "getMIGRATION_7_TO_8", "MIGRATION_8_TO_9", "getMIGRATION_8_TO_9", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Migration getMIGRATION_2_TO_3() {
            return DataManager.MIGRATION_2_TO_3;
        }

        @NotNull
        public final Migration getMIGRATION_3_TO_4() {
            return DataManager.MIGRATION_3_TO_4;
        }

        @NotNull
        public final Migration getMIGRATION_4_TO_5() {
            return DataManager.MIGRATION_4_TO_5;
        }

        @NotNull
        public final Migration getMIGRATION_5_TO_6() {
            return DataManager.MIGRATION_5_TO_6;
        }

        @NotNull
        public final Migration getMIGRATION_6_TO_7() {
            return DataManager.MIGRATION_6_TO_7;
        }

        @NotNull
        public final Migration getMIGRATION_7_TO_8() {
            return DataManager.MIGRATION_7_TO_8;
        }

        @NotNull
        public final Migration getMIGRATION_8_TO_9() {
            return DataManager.MIGRATION_8_TO_9;
        }
    }

    @Override // com.swiftsoft.anixartd.database.Daos
    @NotNull
    public abstract /* synthetic */ CustomFilterDao getCustomFilterDao();

    @Override // com.swiftsoft.anixartd.database.Daos
    @NotNull
    public abstract /* synthetic */ EpisodeDao getEpisodeDao();

    @Override // com.swiftsoft.anixartd.database.Daos
    @NotNull
    public abstract /* synthetic */ LastWatchedEpisodeDao getLastWatchedEpisodeDao();

    @Override // com.swiftsoft.anixartd.database.Daos
    @NotNull
    public abstract /* synthetic */ SearchDao getSearchDao();

    @Override // com.swiftsoft.anixartd.database.Daos
    @NotNull
    public abstract /* synthetic */ UserDao getUserDao();
}
