package com.swiftsoft.anixartd.database.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import com.swiftsoft.anixartd.database.entity.CustomFilter;
import com.swiftsoft.anixartd.utils.database.Converter;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class CustomFilterDao_Impl implements CustomFilterDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<CustomFilter> __deletionAdapterOfCustomFilter;
    private final EntityInsertionAdapter<CustomFilter> __insertionAdapterOfCustomFilter;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final EntityDeletionOrUpdateAdapter<CustomFilter> __updateAdapterOfCustomFilter;

    public CustomFilterDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfCustomFilter = new EntityInsertionAdapter<CustomFilter>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.CustomFilterDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `CustomFilter` (`id`,`selectedCategoryId`,`selectedStatusId`,`selectedStartYear`,`selectedEndYear`,`selectedStudio`,`selectedEpisodes`,`selectedSort`,`selectedCountry`,`selectedSeason`,`selectedEpisodeDuration`,`selectedGenres`,`selectedProfileListExclusions`,`selectedTypes`,`selectedAgeRatings`,`isGenresExcludeModeEnabled`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, CustomFilter customFilter) {
                supportSQLiteStatement.mo4050i0(1, customFilter.getId());
                if (customFilter.getSelectedCategoryId() == null) {
                    supportSQLiteStatement.mo4044J0(2);
                } else {
                    supportSQLiteStatement.mo4050i0(2, customFilter.getSelectedCategoryId().longValue());
                }
                if (customFilter.getSelectedStatusId() == null) {
                    supportSQLiteStatement.mo4044J0(3);
                } else {
                    supportSQLiteStatement.mo4050i0(3, customFilter.getSelectedStatusId().longValue());
                }
                if (customFilter.getSelectedStartYear() == null) {
                    supportSQLiteStatement.mo4044J0(4);
                } else {
                    supportSQLiteStatement.mo4050i0(4, customFilter.getSelectedStartYear().intValue());
                }
                if (customFilter.getSelectedEndYear() == null) {
                    supportSQLiteStatement.mo4044J0(5);
                } else {
                    supportSQLiteStatement.mo4050i0(5, customFilter.getSelectedEndYear().intValue());
                }
                if (customFilter.getSelectedStudio() == null) {
                    supportSQLiteStatement.mo4044J0(6);
                } else {
                    supportSQLiteStatement.mo4048f(6, customFilter.getSelectedStudio());
                }
                if (customFilter.getSelectedEpisodes() == null) {
                    supportSQLiteStatement.mo4044J0(7);
                } else {
                    supportSQLiteStatement.mo4050i0(7, customFilter.getSelectedEpisodes().intValue());
                }
                if (customFilter.getSelectedSort() == null) {
                    supportSQLiteStatement.mo4044J0(8);
                } else {
                    supportSQLiteStatement.mo4050i0(8, customFilter.getSelectedSort().intValue());
                }
                if (customFilter.getSelectedCountry() == null) {
                    supportSQLiteStatement.mo4044J0(9);
                } else {
                    supportSQLiteStatement.mo4048f(9, customFilter.getSelectedCountry());
                }
                if (customFilter.getSelectedSeason() == null) {
                    supportSQLiteStatement.mo4044J0(10);
                } else {
                    supportSQLiteStatement.mo4050i0(10, customFilter.getSelectedSeason().intValue());
                }
                if (customFilter.getSelectedEpisodeDuration() == null) {
                    supportSQLiteStatement.mo4044J0(11);
                } else {
                    supportSQLiteStatement.mo4050i0(11, customFilter.getSelectedEpisodeDuration().intValue());
                }
                supportSQLiteStatement.mo4048f(12, Converter.m16456a(customFilter.getSelectedGenres()));
                supportSQLiteStatement.mo4048f(13, Converter.m16456a(customFilter.getSelectedProfileListExclusions()));
                supportSQLiteStatement.mo4048f(14, Converter.m16456a(customFilter.getSelectedTypes()));
                supportSQLiteStatement.mo4048f(15, Converter.m16456a(customFilter.getSelectedAgeRatings()));
                supportSQLiteStatement.mo4050i0(16, customFilter.getIsGenresExcludeModeEnabled() ? 1L : 0L);
            }
        };
        this.__deletionAdapterOfCustomFilter = new EntityDeletionOrUpdateAdapter<CustomFilter>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.CustomFilterDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `CustomFilter` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, CustomFilter customFilter) {
                supportSQLiteStatement.mo4050i0(1, customFilter.getId());
            }
        };
        this.__updateAdapterOfCustomFilter = new EntityDeletionOrUpdateAdapter<CustomFilter>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.CustomFilterDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `CustomFilter` SET `id` = ?,`selectedCategoryId` = ?,`selectedStatusId` = ?,`selectedStartYear` = ?,`selectedEndYear` = ?,`selectedStudio` = ?,`selectedEpisodes` = ?,`selectedSort` = ?,`selectedCountry` = ?,`selectedSeason` = ?,`selectedEpisodeDuration` = ?,`selectedGenres` = ?,`selectedProfileListExclusions` = ?,`selectedTypes` = ?,`selectedAgeRatings` = ?,`isGenresExcludeModeEnabled` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, CustomFilter customFilter) {
                supportSQLiteStatement.mo4050i0(1, customFilter.getId());
                if (customFilter.getSelectedCategoryId() == null) {
                    supportSQLiteStatement.mo4044J0(2);
                } else {
                    supportSQLiteStatement.mo4050i0(2, customFilter.getSelectedCategoryId().longValue());
                }
                if (customFilter.getSelectedStatusId() == null) {
                    supportSQLiteStatement.mo4044J0(3);
                } else {
                    supportSQLiteStatement.mo4050i0(3, customFilter.getSelectedStatusId().longValue());
                }
                if (customFilter.getSelectedStartYear() == null) {
                    supportSQLiteStatement.mo4044J0(4);
                } else {
                    supportSQLiteStatement.mo4050i0(4, customFilter.getSelectedStartYear().intValue());
                }
                if (customFilter.getSelectedEndYear() == null) {
                    supportSQLiteStatement.mo4044J0(5);
                } else {
                    supportSQLiteStatement.mo4050i0(5, customFilter.getSelectedEndYear().intValue());
                }
                if (customFilter.getSelectedStudio() == null) {
                    supportSQLiteStatement.mo4044J0(6);
                } else {
                    supportSQLiteStatement.mo4048f(6, customFilter.getSelectedStudio());
                }
                if (customFilter.getSelectedEpisodes() == null) {
                    supportSQLiteStatement.mo4044J0(7);
                } else {
                    supportSQLiteStatement.mo4050i0(7, customFilter.getSelectedEpisodes().intValue());
                }
                if (customFilter.getSelectedSort() == null) {
                    supportSQLiteStatement.mo4044J0(8);
                } else {
                    supportSQLiteStatement.mo4050i0(8, customFilter.getSelectedSort().intValue());
                }
                if (customFilter.getSelectedCountry() == null) {
                    supportSQLiteStatement.mo4044J0(9);
                } else {
                    supportSQLiteStatement.mo4048f(9, customFilter.getSelectedCountry());
                }
                if (customFilter.getSelectedSeason() == null) {
                    supportSQLiteStatement.mo4044J0(10);
                } else {
                    supportSQLiteStatement.mo4050i0(10, customFilter.getSelectedSeason().intValue());
                }
                if (customFilter.getSelectedEpisodeDuration() == null) {
                    supportSQLiteStatement.mo4044J0(11);
                } else {
                    supportSQLiteStatement.mo4050i0(11, customFilter.getSelectedEpisodeDuration().intValue());
                }
                supportSQLiteStatement.mo4048f(12, Converter.m16456a(customFilter.getSelectedGenres()));
                supportSQLiteStatement.mo4048f(13, Converter.m16456a(customFilter.getSelectedProfileListExclusions()));
                supportSQLiteStatement.mo4048f(14, Converter.m16456a(customFilter.getSelectedTypes()));
                supportSQLiteStatement.mo4048f(15, Converter.m16456a(customFilter.getSelectedAgeRatings()));
                supportSQLiteStatement.mo4050i0(16, customFilter.getIsGenresExcludeModeEnabled() ? 1L : 0L);
                supportSQLiteStatement.mo4050i0(17, customFilter.getId());
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.CustomFilterDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM CustomFilter";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.swiftsoft.anixartd.database.dao.CustomFilterDao
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

    @Override // com.swiftsoft.anixartd.database.dao.CustomFilterDao
    public boolean exists() {
        boolean z = false;
        RoomSQLiteQuery m4083c = RoomSQLiteQuery.m4083c("SELECT COUNT(*) > 0 FROM CustomFilter", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor m4094a = DBUtil.m4094a(this.__db, m4083c, false, null);
        try {
            if (m4094a.moveToFirst()) {
                if (m4094a.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            m4094a.close();
            m4083c.m4086e();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.CustomFilterDao
    public CustomFilter findFirst() {
        RoomSQLiteQuery m4083c = RoomSQLiteQuery.m4083c("SELECT `CustomFilter`.`id` AS `id`, `CustomFilter`.`selectedCategoryId` AS `selectedCategoryId`, `CustomFilter`.`selectedStatusId` AS `selectedStatusId`, `CustomFilter`.`selectedStartYear` AS `selectedStartYear`, `CustomFilter`.`selectedEndYear` AS `selectedEndYear`, `CustomFilter`.`selectedStudio` AS `selectedStudio`, `CustomFilter`.`selectedEpisodes` AS `selectedEpisodes`, `CustomFilter`.`selectedSort` AS `selectedSort`, `CustomFilter`.`selectedCountry` AS `selectedCountry`, `CustomFilter`.`selectedSeason` AS `selectedSeason`, `CustomFilter`.`selectedEpisodeDuration` AS `selectedEpisodeDuration`, `CustomFilter`.`selectedGenres` AS `selectedGenres`, `CustomFilter`.`selectedProfileListExclusions` AS `selectedProfileListExclusions`, `CustomFilter`.`selectedTypes` AS `selectedTypes`, `CustomFilter`.`selectedAgeRatings` AS `selectedAgeRatings`, `CustomFilter`.`isGenresExcludeModeEnabled` AS `isGenresExcludeModeEnabled` FROM CustomFilter LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        CustomFilter customFilter = null;
        String string = null;
        Cursor m4094a = DBUtil.m4094a(this.__db, m4083c, false, null);
        try {
            if (m4094a.moveToFirst()) {
                CustomFilter customFilter2 = new CustomFilter();
                customFilter2.setId(m4094a.getLong(0));
                customFilter2.setSelectedCategoryId(m4094a.isNull(1) ? null : Long.valueOf(m4094a.getLong(1)));
                customFilter2.setSelectedStatusId(m4094a.isNull(2) ? null : Long.valueOf(m4094a.getLong(2)));
                customFilter2.setSelectedStartYear(m4094a.isNull(3) ? null : Integer.valueOf(m4094a.getInt(3)));
                customFilter2.setSelectedEndYear(m4094a.isNull(4) ? null : Integer.valueOf(m4094a.getInt(4)));
                customFilter2.setSelectedStudio(m4094a.isNull(5) ? null : m4094a.getString(5));
                customFilter2.setSelectedEpisodes(m4094a.isNull(6) ? null : Integer.valueOf(m4094a.getInt(6)));
                customFilter2.setSelectedSort(m4094a.isNull(7) ? null : Integer.valueOf(m4094a.getInt(7)));
                customFilter2.setSelectedCountry(m4094a.isNull(8) ? null : m4094a.getString(8));
                customFilter2.setSelectedSeason(m4094a.isNull(9) ? null : Integer.valueOf(m4094a.getInt(9)));
                customFilter2.setSelectedEpisodeDuration(m4094a.isNull(10) ? null : Integer.valueOf(m4094a.getInt(10)));
                customFilter2.setSelectedGenres(Converter.m16457b(m4094a.isNull(11) ? null : m4094a.getString(11)));
                customFilter2.setSelectedProfileListExclusions(Converter.m16457b(m4094a.isNull(12) ? null : m4094a.getString(12)));
                customFilter2.setSelectedTypes(Converter.m16457b(m4094a.isNull(13) ? null : m4094a.getString(13)));
                if (!m4094a.isNull(14)) {
                    string = m4094a.getString(14);
                }
                customFilter2.setSelectedAgeRatings(Converter.m16457b(string));
                customFilter2.setGenresExcludeModeEnabled(m4094a.getInt(15) != 0);
                customFilter = customFilter2;
            }
            return customFilter;
        } finally {
            m4094a.close();
            m4083c.m4086e();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.CustomFilterDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void delete(CustomFilter customFilter) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfCustomFilter.handle(customFilter);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.CustomFilterDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void save(CustomFilter customFilter) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfCustomFilter.insert((EntityInsertionAdapter<CustomFilter>) customFilter);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.CustomFilterDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void update(CustomFilter customFilter) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfCustomFilter.handle(customFilter);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
