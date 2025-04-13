package com.swiftsoft.anixartd.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.swiftsoft.anixartd.database.entity.CustomFilter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomFilterDao.kt */
@Dao
@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H'J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/dao/CustomFilterDao;", "Lcom/swiftsoft/anixartd/database/dao/RestfulDao;", "Lcom/swiftsoft/anixartd/database/entity/CustomFilter;", "deleteAll", "", "exists", "", "findFirst", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface CustomFilterDao extends RestfulDao<CustomFilter> {
    @Override // com.swiftsoft.anixartd.database.dao.RestfulDao
    @Delete
    /* synthetic */ void delete(@NotNull CustomFilter customFilter);

    @Query
    void deleteAll();

    @Query
    boolean exists();

    @Query
    @Nullable
    CustomFilter findFirst();

    @Override // com.swiftsoft.anixartd.database.dao.RestfulDao
    @Insert
    /* synthetic */ void save(@NotNull CustomFilter customFilter);

    @Override // com.swiftsoft.anixartd.database.dao.RestfulDao
    @Update
    /* synthetic */ void update(@NotNull CustomFilter customFilter);
}
