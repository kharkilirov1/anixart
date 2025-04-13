package com.swiftsoft.anixartd.database;

import com.swiftsoft.anixartd.database.dao.CustomFilterDao;
import com.swiftsoft.anixartd.database.dao.EpisodeDao;
import com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao;
import com.swiftsoft.anixartd.database.dao.SearchDao;
import com.swiftsoft.anixartd.database.dao.UserDao;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Daos.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/Daos;", "", "getCustomFilterDao", "Lcom/swiftsoft/anixartd/database/dao/CustomFilterDao;", "getEpisodeDao", "Lcom/swiftsoft/anixartd/database/dao/EpisodeDao;", "getLastWatchedEpisodeDao", "Lcom/swiftsoft/anixartd/database/dao/LastWatchedEpisodeDao;", "getSearchDao", "Lcom/swiftsoft/anixartd/database/dao/SearchDao;", "getUserDao", "Lcom/swiftsoft/anixartd/database/dao/UserDao;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface Daos {
    @NotNull
    CustomFilterDao getCustomFilterDao();

    @NotNull
    EpisodeDao getEpisodeDao();

    @NotNull
    LastWatchedEpisodeDao getLastWatchedEpisodeDao();

    @NotNull
    SearchDao getSearchDao();

    @NotNull
    UserDao getUserDao();
}
