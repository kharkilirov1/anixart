package com.swiftsoft.anixartd.p015ui.controller.main.episodes.updates;

import com.airbnb.epoxy.Typed3EpoxyController;
import com.swiftsoft.anixartd.database.entity.EpisodeUpdate;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeUpdateModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EpisodesUpdatesUiController.kt */
@Metadata(m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\u0014J\u0006\u0010\f\u001a\u00020\u0005¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/episodes/updates/EpisodesUpdatesUiController;", "Lcom/airbnb/epoxy/Typed3EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/EpisodeUpdate;", "", "", "()V", "buildModels", "", "episodesUpdates", "totalCount", "isLoadable", "isEmpty", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class EpisodesUpdatesUiController extends Typed3EpoxyController<List<? extends EpisodeUpdate>, Long, Boolean> {
    public EpisodesUpdatesUiController() {
        setDebugLoggingEnabled(true);
    }

    @Override // com.airbnb.epoxy.Typed3EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends EpisodeUpdate> list, Long l2, Boolean bool) {
        buildModels((List<EpisodeUpdate>) list, l2.longValue(), bool.booleanValue());
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<EpisodeUpdate> episodesUpdates, long totalCount, boolean isLoadable) {
        Intrinsics.m32179h(episodesUpdates, "episodesUpdates");
        int i2 = 0;
        for (Object obj : episodesUpdates) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            EpisodeUpdate episodeUpdate = (EpisodeUpdate) obj;
            EpisodeUpdateModel_ episodeUpdateModel_ = new EpisodeUpdateModel_();
            episodeUpdateModel_.mo15972D(Integer.valueOf(i2));
            episodeUpdateModel_.mo15975z(episodeUpdate.getLastEpisodeUpdateName());
            episodeUpdateModel_.mo15976z0(episodeUpdate.getLastEpisodeTypeUpdateName());
            episodeUpdateModel_.mo15974v1(episodeUpdate.getLastEpisodeSourceUpdateName());
            episodeUpdateModel_.mo15973t(episodeUpdate.getLastEpisodeUpdateDate());
            add(episodeUpdateModel_);
            i2 = i3;
        }
    }
}
