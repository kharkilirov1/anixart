package com.swiftsoft.anixartd.p015ui.controller.main.episodes;

import com.airbnb.epoxy.EpoxyModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.database.entity.episode.Source;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.epoxy.Typed13EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorResourceModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeHintModel;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeHintModel_;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeModel;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeModel_;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.EpisodeTypeNameModel_;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.SourceHintModel;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.SourceHintModel_;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.SourceModel;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.SourceModel_;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.TypeHintModel;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.TypeHintModel_;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.TypeModel;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.TypeModel_;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookTypeModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EpisodesUiController.kt */
@Metadata(m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002h\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\nJ\u008d\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\tH\u0014¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\b¨\u0006\u001d"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/episodes/EpisodesUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed13EpoxyController;", "", "", "Lcom/swiftsoft/anixartd/database/entity/episode/Episode;", "Lcom/swiftsoft/anixartd/database/entity/episode/Source;", "Lcom/swiftsoft/anixartd/database/entity/episode/Type;", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/episodes/EpisodesUiController$Listener;", "()V", "buildModels", "", "action", "episodes", "sources", "types", "selectedTypeName", "lastEpisodeTypeUpdateId", "lastEpisodeSourceUpdateId", "typeHint", "sourceHint", "episodeHint", "isLoadable", "canTorlookSearch", "listener", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZZZZZLcom/swiftsoft/anixartd/ui/controller/main/episodes/EpisodesUiController$Listener;)V", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class EpisodesUiController extends Typed13EpoxyController<String, List<? extends Episode>, List<? extends Source>, List<? extends Type>, String, Long, Long, Boolean, Boolean, Boolean, Boolean, Boolean, Listener> {

    /* compiled from: EpisodesUiController.kt */
    @Metadata(m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/episodes/EpisodesUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/episodes/TypeModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/episodes/SourceModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/episodes/EpisodeModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/episodes/TypeHintModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/episodes/SourceHintModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/episodes/EpisodeHintModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/episodes/torlook/TorlookTypeModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends TypeModel.Listener, SourceModel.Listener, EpisodeModel.Listener, TypeHintModel.Listener, SourceHintModel.Listener, EpisodeHintModel.Listener, TorlookTypeModel.Listener {
    }

    public EpisodesUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed13EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(String str, List<? extends Episode> list, List<? extends Source> list2, List<? extends Type> list3, String str2, Long l2, Long l3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Listener listener) {
        buildModels(str, (List<Episode>) list, (List<Source>) list2, (List<Type>) list3, str2, l2, l3, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull String action, @NotNull List<Episode> episodes, @NotNull List<Source> sources, @NotNull List<Type> types, @Nullable String selectedTypeName, @Nullable Long lastEpisodeTypeUpdateId, @Nullable Long lastEpisodeSourceUpdateId, boolean typeHint, boolean sourceHint, boolean episodeHint, boolean isLoadable, boolean canTorlookSearch, @NotNull Listener listener) {
        Intrinsics.m32179h(action, "action");
        Intrinsics.m32179h(episodes, "episodes");
        Intrinsics.m32179h(sources, "sources");
        Intrinsics.m32179h(types, "types");
        Intrinsics.m32179h(listener, "listener");
        int hashCode = action.hashCode();
        if (hashCode != -1887982961) {
            if (hashCode != -777204287) {
                if (hashCode == 790312208 && action.equals("ACTION_TYPES")) {
                    if (!types.isEmpty()) {
                        if (typeHint) {
                            TypeHintModel_ typeHintModel_ = new TypeHintModel_();
                            typeHintModel_.m4520h2("typeHint");
                            typeHintModel_.m4524l2();
                            typeHintModel_.f29710k = listener;
                            add(typeHintModel_);
                        }
                        for (Type type : types) {
                            TypeModel_ typeModel_ = new TypeModel_();
                            typeModel_.m15985w2(type.getId());
                            long id2 = type.getId();
                            typeModel_.m4524l2();
                            typeModel_.f29713k = id2;
                            typeModel_.m15986x2(type.getName());
                            String workers = type.getWorkers();
                            typeModel_.m4524l2();
                            typeModel_.f29715m = workers;
                            long episodesCount = type.getEpisodesCount();
                            typeModel_.m4524l2();
                            typeModel_.f29716n = episodesCount;
                            long viewCount = type.getViewCount();
                            typeModel_.m4524l2();
                            typeModel_.f29717o = viewCount;
                            typeModel_.m4524l2();
                            typeModel_.f29718p = lastEpisodeTypeUpdateId;
                            typeModel_.m4524l2();
                            typeModel_.f29719q = listener;
                            add(typeModel_);
                        }
                    } else {
                        ErrorResourceModel_ errorResourceModel_ = new ErrorResourceModel_();
                        errorResourceModel_.m4520h2("error_no_types");
                        errorResourceModel_.m4524l2();
                        errorResourceModel_.f29385k = C2507R.string.error_no_types;
                        add(errorResourceModel_);
                    }
                }
            } else if (action.equals("ACTION_EPISODES")) {
                if (!episodes.isEmpty()) {
                    if (selectedTypeName != null && (!StringsKt.m33879E(selectedTypeName))) {
                        EpisodeTypeNameModel_ episodeTypeNameModel_ = new EpisodeTypeNameModel_();
                        episodeTypeNameModel_.m4520h2("episodeTypeName");
                        episodeTypeNameModel_.m4524l2();
                        episodeTypeNameModel_.f29697k = selectedTypeName;
                        add(episodeTypeNameModel_);
                    }
                    if (episodeHint) {
                        EpisodeHintModel_ episodeHintModel_ = new EpisodeHintModel_();
                        episodeHintModel_.m4520h2("episodeHint");
                        episodeHintModel_.m4524l2();
                        episodeHintModel_.f29682k = listener;
                        add(episodeHintModel_);
                    }
                    for (Episode episode : episodes) {
                        EpisodeModel_ episodeModel_ = new EpisodeModel_();
                        episodeModel_.m4521i2(Integer.valueOf(episode.getPosition()));
                        String name = episode.getName();
                        episodeModel_.m4524l2();
                        episodeModel_.f29685k = name;
                        long playbackPosition = episode.getPlaybackPosition();
                        episodeModel_.m4524l2();
                        episodeModel_.f29686l = playbackPosition;
                        episodeModel_.m15969x2(episode.getUrl());
                        boolean isFiller = episode.getIsFiller();
                        episodeModel_.m4524l2();
                        episodeModel_.f29688n = isFiller;
                        boolean isWatched = episode.getIsWatched();
                        episodeModel_.m4524l2();
                        episodeModel_.f29689o = isWatched;
                        boolean isDownloadAvailable = episode.isDownloadAvailable();
                        episodeModel_.m4524l2();
                        episodeModel_.f29690p = isDownloadAvailable;
                        int position = episode.getPosition();
                        episodeModel_.m4524l2();
                        episodeModel_.f29691q = position;
                        episodeModel_.m4524l2();
                        episodeModel_.f29692r = listener;
                        add(episodeModel_);
                    }
                } else {
                    ErrorResourceModel_ errorResourceModel_2 = new ErrorResourceModel_();
                    errorResourceModel_2.m4520h2("error_no_types");
                    errorResourceModel_2.m4524l2();
                    errorResourceModel_2.f29385k = C2507R.string.error_no_episodes;
                    add(errorResourceModel_2);
                }
            }
        } else if (action.equals("ACTION_SOURCES")) {
            if (!sources.isEmpty()) {
                if (selectedTypeName != null && (!StringsKt.m33879E(selectedTypeName))) {
                    EpisodeTypeNameModel_ episodeTypeNameModel_2 = new EpisodeTypeNameModel_();
                    episodeTypeNameModel_2.m4520h2("episodeTypeName");
                    episodeTypeNameModel_2.m4524l2();
                    episodeTypeNameModel_2.f29697k = selectedTypeName;
                    add(episodeTypeNameModel_2);
                }
                if (sourceHint) {
                    SourceHintModel_ sourceHintModel_ = new SourceHintModel_();
                    sourceHintModel_.m4520h2("sourceHint");
                    sourceHintModel_.m4524l2();
                    sourceHintModel_.f29702k = listener;
                    add(sourceHintModel_);
                }
                for (Source source : sources) {
                    SourceModel_ sourceModel_ = new SourceModel_();
                    sourceModel_.m15980w2(source.getId());
                    long id3 = source.getId();
                    sourceModel_.m4524l2();
                    sourceModel_.f29705k = id3;
                    sourceModel_.m15981x2(source.getName());
                    long episodesCount2 = source.getEpisodesCount();
                    sourceModel_.m4524l2();
                    sourceModel_.f29707m = episodesCount2;
                    sourceModel_.m4524l2();
                    sourceModel_.f29708n = lastEpisodeSourceUpdateId;
                    sourceModel_.m4524l2();
                    sourceModel_.f29709o = listener;
                    add(sourceModel_);
                }
            } else {
                ErrorResourceModel_ errorResourceModel_3 = new ErrorResourceModel_();
                errorResourceModel_3.m4520h2("error_no_types");
                errorResourceModel_3.m4524l2();
                errorResourceModel_3.f29385k = C2507R.string.error_no_sources;
                add(errorResourceModel_3);
            }
        }
        if (isLoadable) {
            EpoxyModel<?> loadingModel_ = new LoadingModel_();
            loadingModel_.m4520h2("loading");
            add(loadingModel_);
        }
    }
}
