package com.swiftsoft.anixartd.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EpisodeDao.kt */
@Dao
@Metadata(m31883d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H'J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H'J \u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH'J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\nH'J\"\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH'J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\nH'J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H'¨\u0006\u0014"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/dao/EpisodeDao;", "Lcom/swiftsoft/anixartd/database/dao/RestfulDao;", "Lcom/swiftsoft/anixartd/database/entity/episode/Episode;", "deleteAll", "", "deleteAllByReleaseIdAndSourceId", "releaseId", "", "sourceId", "existsByReleaseIdAndSourceIdAndPosition", "", "position", "", "findAllByReleaseIdAndSourceIdAndIsWatched", "", "isWatched", "findByReleaseIdAndSourceIdAndPosition", "updateIsWatchedByReleaseIdAndSourceId", "updatePlaybackPositionByReleaseIdAndSourceId", "playbackPosition", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface EpisodeDao extends RestfulDao<Episode> {
    @Override // com.swiftsoft.anixartd.database.dao.RestfulDao
    @Delete
    /* synthetic */ void delete(@NotNull Episode episode);

    @Query
    void deleteAll();

    @Query
    void deleteAllByReleaseIdAndSourceId(long releaseId, long sourceId);

    @Query
    boolean existsByReleaseIdAndSourceIdAndPosition(long releaseId, long sourceId, int position);

    @Query
    @NotNull
    List<Episode> findAllByReleaseIdAndSourceIdAndIsWatched(long releaseId, long sourceId, boolean isWatched);

    @Query
    @Nullable
    Episode findByReleaseIdAndSourceIdAndPosition(long releaseId, long sourceId, int position);

    @Override // com.swiftsoft.anixartd.database.dao.RestfulDao
    @Insert
    /* synthetic */ void save(@NotNull Episode episode);

    @Override // com.swiftsoft.anixartd.database.dao.RestfulDao
    @Update
    /* synthetic */ void update(@NotNull Episode episode);

    @Query
    void updateIsWatchedByReleaseIdAndSourceId(long releaseId, long sourceId, boolean isWatched);

    @Query
    void updatePlaybackPositionByReleaseIdAndSourceId(long releaseId, long sourceId, long playbackPosition);
}
