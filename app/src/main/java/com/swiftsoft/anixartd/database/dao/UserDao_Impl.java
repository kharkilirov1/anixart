package com.swiftsoft.anixartd.database.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import com.swiftsoft.anixartd.database.entity.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class UserDao_Impl implements UserDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<User> __deletionAdapterOfUser;
    private final EntityInsertionAdapter<User> __insertionAdapterOfUser;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final EntityDeletionOrUpdateAdapter<User> __updateAdapterOfUser;

    public UserDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.UserDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `User` (`id`,`name`,`avatar`) VALUES (nullif(?, 0),?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, User user) {
                supportSQLiteStatement.mo4050i0(1, user.getId());
                if (user.getName() == null) {
                    supportSQLiteStatement.mo4044J0(2);
                } else {
                    supportSQLiteStatement.mo4048f(2, user.getName());
                }
                if (user.getAvatar() == null) {
                    supportSQLiteStatement.mo4044J0(3);
                } else {
                    supportSQLiteStatement.mo4048f(3, user.getAvatar());
                }
            }
        };
        this.__deletionAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.UserDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `User` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, User user) {
                supportSQLiteStatement.mo4050i0(1, user.getId());
            }
        };
        this.__updateAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.UserDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `User` SET `id` = ?,`name` = ?,`avatar` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, User user) {
                supportSQLiteStatement.mo4050i0(1, user.getId());
                if (user.getName() == null) {
                    supportSQLiteStatement.mo4044J0(2);
                } else {
                    supportSQLiteStatement.mo4048f(2, user.getName());
                }
                if (user.getAvatar() == null) {
                    supportSQLiteStatement.mo4044J0(3);
                } else {
                    supportSQLiteStatement.mo4048f(3, user.getAvatar());
                }
                supportSQLiteStatement.mo4050i0(4, user.getId());
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(roomDatabase) { // from class: com.swiftsoft.anixartd.database.dao.UserDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM User";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.swiftsoft.anixartd.database.dao.UserDao
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

    @Override // com.swiftsoft.anixartd.database.dao.UserDao
    public boolean exists() {
        boolean z = false;
        RoomSQLiteQuery m4083c = RoomSQLiteQuery.m4083c("SELECT COUNT(*) > 0 FROM User", 0);
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

    @Override // com.swiftsoft.anixartd.database.dao.UserDao
    public List<User> findAll() {
        RoomSQLiteQuery m4083c = RoomSQLiteQuery.m4083c("SELECT `User`.`id` AS `id`, `User`.`name` AS `name`, `User`.`avatar` AS `avatar` FROM User", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor m4094a = DBUtil.m4094a(this.__db, m4083c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m4094a.getCount());
            while (m4094a.moveToNext()) {
                User user = new User();
                user.setId(m4094a.getLong(0));
                user.setName(m4094a.isNull(1) ? null : m4094a.getString(1));
                user.setAvatar(m4094a.isNull(2) ? null : m4094a.getString(2));
                arrayList.add(user);
            }
            return arrayList;
        } finally {
            m4094a.close();
            m4083c.m4086e();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.UserDao
    public User findFirst() {
        RoomSQLiteQuery m4083c = RoomSQLiteQuery.m4083c("SELECT `User`.`id` AS `id`, `User`.`name` AS `name`, `User`.`avatar` AS `avatar` FROM User LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        User user = null;
        String string = null;
        Cursor m4094a = DBUtil.m4094a(this.__db, m4083c, false, null);
        try {
            if (m4094a.moveToFirst()) {
                User user2 = new User();
                user2.setId(m4094a.getLong(0));
                user2.setName(m4094a.isNull(1) ? null : m4094a.getString(1));
                if (!m4094a.isNull(2)) {
                    string = m4094a.getString(2);
                }
                user2.setAvatar(string);
                user = user2;
            }
            return user;
        } finally {
            m4094a.close();
            m4083c.m4086e();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.UserDao
    public String getAvatar() {
        RoomSQLiteQuery m4083c = RoomSQLiteQuery.m4083c("SELECT avatar FROM User LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        String str = null;
        Cursor m4094a = DBUtil.m4094a(this.__db, m4083c, false, null);
        try {
            if (m4094a.moveToFirst() && !m4094a.isNull(0)) {
                str = m4094a.getString(0);
            }
            return str;
        } finally {
            m4094a.close();
            m4083c.m4086e();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.UserDao
    public String getLogin() {
        RoomSQLiteQuery m4083c = RoomSQLiteQuery.m4083c("SELECT name FROM User LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        String str = null;
        Cursor m4094a = DBUtil.m4094a(this.__db, m4083c, false, null);
        try {
            if (m4094a.moveToFirst() && !m4094a.isNull(0)) {
                str = m4094a.getString(0);
            }
            return str;
        } finally {
            m4094a.close();
            m4083c.m4086e();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.UserDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void delete(User user) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfUser.handle(user);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.UserDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void save(User user) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfUser.insert((EntityInsertionAdapter<User>) user);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.UserDao, com.swiftsoft.anixartd.database.dao.RestfulDao
    public void update(User user) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfUser.handle(user);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
