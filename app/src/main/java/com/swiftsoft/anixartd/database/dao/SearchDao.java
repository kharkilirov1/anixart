package com.swiftsoft.anixartd.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.swiftsoft.anixartd.database.entity.Search;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SearchDao.kt */
@Dao
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rJ\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H'J0\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH'¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/dao/SearchDao;", "Lcom/swiftsoft/anixartd/database/dao/RestfulDao;", "Lcom/swiftsoft/anixartd/database/entity/Search;", "deleteAll", "", "searchType", "", "findAll", "Lio/reactivex/Single;", "", "page", "", "perPage", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface SearchDao extends RestfulDao<Search> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int PER_PAGE = 25;

    /* compiled from: SearchDao.kt */
    @Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/dao/SearchDao$Companion;", "", "()V", "PER_PAGE", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int PER_PAGE = 25;

        private Companion() {
        }
    }

    /* compiled from: SearchDao.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void deleteAll$default(SearchDao searchDao, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAll");
            }
            if ((i2 & 1) != 0) {
                str = Search.TYPE_RELEASE;
            }
            searchDao.deleteAll(str);
        }

        public static /* synthetic */ Single findAll$default(SearchDao searchDao, int i2, String str, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findAll");
            }
            if ((i4 & 2) != 0) {
                str = Search.TYPE_RELEASE;
            }
            if ((i4 & 4) != 0) {
                i3 = 25;
            }
            return searchDao.findAll(i2, str, i3);
        }
    }

    @Override // com.swiftsoft.anixartd.database.dao.RestfulDao
    @Delete
    /* synthetic */ void delete(@NotNull Search search);

    @Query
    void deleteAll(@NotNull String searchType);

    @Query
    @NotNull
    Single<List<Search>> findAll(int page, @NotNull String searchType, int perPage);

    @Override // com.swiftsoft.anixartd.database.dao.RestfulDao
    @Insert
    /* synthetic */ void save(@NotNull Search search);

    @Override // com.swiftsoft.anixartd.database.dao.RestfulDao
    @Update
    /* synthetic */ void update(@NotNull Search search);
}
