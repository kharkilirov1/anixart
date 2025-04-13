package com.swiftsoft.anixartd.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.swiftsoft.anixartd.database.entity.User;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserDao.kt */
@Dao
@Metadata(m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH'J\b\u0010\t\u001a\u00020\u0002H'J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH'J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH'¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/dao/UserDao;", "Lcom/swiftsoft/anixartd/database/dao/RestfulDao;", "Lcom/swiftsoft/anixartd/database/entity/User;", "deleteAll", "", "exists", "", "findAll", "", "findFirst", "getAvatar", "", "getLogin", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface UserDao extends RestfulDao<User> {
    @Override // com.swiftsoft.anixartd.database.dao.RestfulDao
    @Delete
    /* synthetic */ void delete(@NotNull User user);

    @Query
    void deleteAll();

    @Query
    boolean exists();

    @Query
    @NotNull
    List<User> findAll();

    @Query
    @NotNull
    User findFirst();

    @Query
    @Nullable
    String getAvatar();

    @Query
    @Nullable
    String getLogin();

    @Override // com.swiftsoft.anixartd.database.dao.RestfulDao
    @Insert
    /* synthetic */ void save(@NotNull User user);

    @Override // com.swiftsoft.anixartd.database.dao.RestfulDao
    @Update
    /* synthetic */ void update(@NotNull User user);
}
