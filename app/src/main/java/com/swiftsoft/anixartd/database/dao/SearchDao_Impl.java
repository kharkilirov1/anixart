package com.swiftsoft.anixartd.database.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import com.swiftsoft.anixartd.database.entity.Search;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class SearchDao_Impl implements SearchDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<Search> __deletionAdapterOfSearch;
    private final EntityInsertionAdapter<Search> __insertionAdapterOfSearch;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final EntityDeletionOrUpdateAdapter<Search> __updateAdapterOfSearch;

    public SearchDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfSearch = new EntityInsertionAdapter<Search>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.SearchDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `Search` (`id`,`type`,`query`,`tsLastRequest`) VALUES (nullif(?, 0),?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, Search search) {
                supportSQLiteStatement.mo4050i0(1, search.getId());
                if (search.getType() == null) {
                    supportSQLiteStatement.mo4044J0(2);
                } else {
                    supportSQLiteStatement.mo4048f(2, search.getType());
                }
                if (search.getQuery() == null) {
                    supportSQLiteStatement.mo4044J0(3);
                } else {
                    supportSQLiteStatement.mo4048f(3, search.getQuery());
                }
                supportSQLiteStatement.mo4050i0(4, search.getTsLastRequest());
            }
        };
        this.__deletionAdapterOfSearch = new EntityDeletionOrUpdateAdapter<Search>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.SearchDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `Search` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, Search search) {
                supportSQLiteStatement.mo4050i0(1, search.getId());
            }
        };
        this.__updateAdapterOfSearch = new EntityDeletionOrUpdateAdapter<Search>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.SearchDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `Search` SET `id` = ?,`type` = ?,`query` = ?,`tsLastRequest` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, Search search) {
                supportSQLiteStatement.mo4050i0(1, search.getId());
                if (search.getType() == null) {
                    supportSQLiteStatement.mo4044J0(2);
                } else {
                    supportSQLiteStatement.mo4048f(2, search.getType());
                }
                if (search.getQuery() == null) {
                    supportSQLiteStatement.mo4044J0(3);
                } else {
                    supportSQLiteStatement.mo4048f(3, search.getQuery());
                }
                supportSQLiteStatement.mo4050i0(4, search.getTsLastRequest());
                supportSQLiteStatement.mo4050i0(5, search.getId());
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.SearchDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `Search` WHERE `type` = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.swiftsoft.anixartd.database.dao.SearchDao
    public void deleteAll(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteAll.acquire();
        if (str == null) {
            acquire.mo4044J0(1);
        } else {
            acquire.mo4048f(1, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.mo4045K();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(acquire);
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.SearchDao
    public Single<List<Search>> findAll(int i2, String str, int i3) {
        final RoomSQLiteQuery m4083c = RoomSQLiteQuery.m4083c("SELECT * FROM `Search` WHERE `type` = ? ORDER BY `tsLastRequest` DESC LIMIT (? - 1) * ?, ?", 4);
        if (str == null) {
            m4083c.mo4044J0(1);
        } else {
            m4083c.mo4048f(1, str);
        }
        m4083c.mo4050i0(2, i2);
        long j2 = i3;
        m4083c.mo4050i0(3, j2);
        m4083c.mo4050i0(4, j2);
        return RxRoom.m4087a(new Callable<List<Search>>() { // from class: com.swiftsoft.anixartd.database.dao.SearchDao_Impl.5
            public void finalize() {
                m4083c.m4086e();
            }

            @Override // java.util.concurrent.Callable
            public List<Search> call() throws Exception {
                Cursor m4094a = DBUtil.m4094a(SearchDao_Impl.this.__db, m4083c, false, null);
                try {
                    int m4093a = CursorUtil.m4093a(m4094a, "id");
                    int m4093a2 = CursorUtil.m4093a(m4094a, "type");
                    int m4093a3 = CursorUtil.m4093a(m4094a, "query");
                    int m4093a4 = CursorUtil.m4093a(m4094a, "tsLastRequest");
                    ArrayList arrayList = new ArrayList(m4094a.getCount());
                    while (m4094a.moveToNext()) {
                        Search search = new Search();
                        search.setId(m4094a.getLong(m4093a));
                        search.setType(m4094a.isNull(m4093a2) ? null : m4094a.getString(m4093a2));
                        search.setQuery(m4094a.isNull(m4093a3) ? null : m4094a.getString(m4093a3));
                        search.setTsLastRequest(m4094a.getLong(m4093a4));
                        arrayList.add(search);
                    }
                    return arrayList;
                } finally {
                    m4094a.close();
                }
            }
        });
    }

    @Override // com.swiftsoft.anixartd.database.dao.SearchDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void delete(Search search) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSearch.handle(search);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.SearchDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void save(Search search) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSearch.insert((EntityInsertionAdapter<Search>) search);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.SearchDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void update(Search search) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfSearch.handle(search);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
