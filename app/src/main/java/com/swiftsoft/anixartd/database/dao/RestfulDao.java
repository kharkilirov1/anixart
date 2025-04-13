package com.swiftsoft.anixartd.database.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;
import com.swiftsoft.anixartd.database.util.Identifiable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RestfulDao.kt */
@Metadata(m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H'¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H'¢\u0006\u0002\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H'¢\u0006\u0002\u0010\u0007¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/dao/RestfulDao;", "T", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "delete", "", "entity", "(Lcom/swiftsoft/anixartd/database/util/Identifiable;)V", "save", "update", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface RestfulDao<T extends Identifiable<?>> {
    @Delete
    void delete(@NotNull T entity);

    @Insert
    void save(@NotNull T entity);

    @Update
    void update(@NotNull T entity);
}
