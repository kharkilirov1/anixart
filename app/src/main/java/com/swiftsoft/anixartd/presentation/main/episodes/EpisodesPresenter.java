package com.swiftsoft.anixartd.presentation.main.episodes;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao;
import com.swiftsoft.anixartd.database.entity.EpisodeUpdate;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.database.entity.episode.LastWatchedEpisode;
import com.swiftsoft.anixartd.database.entity.episode.Source;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.HistoryResponse;
import com.swiftsoft.anixartd.network.response.release.episode.EpisodeResponse;
import com.swiftsoft.anixartd.network.response.release.episode.EpisodeTargetResponse;
import com.swiftsoft.anixartd.network.response.release.episode.EpisodeUnwatchResponse;
import com.swiftsoft.anixartd.network.response.release.episode.SourcesResponse;
import com.swiftsoft.anixartd.network.response.release.episode.TypesResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.episodes.EpisodesUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.episodes.EpisodesUiLogic;
import com.swiftsoft.anixartd.parser.Parser;
import com.swiftsoft.anixartd.parser.kodik.KodikParser;
import com.swiftsoft.anixartd.presentation.main.collection.comments.replies.C2561b;
import com.swiftsoft.anixartd.repository.EpisodeRepository;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.yandex.div2.C3033a;
import com.yandex.metrica.YandexMetrica;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.ObservableDefer;
import io.reactivex.schedulers.Schedulers;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: EpisodesPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/episodes/EpisodesPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/episodes/EpisodesView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class EpisodesPresenter extends MvpPresenter<EpisodesView> {

    /* renamed from: a */
    @NotNull
    public EpisodeRepository f26264a;

    /* renamed from: b */
    @NotNull
    public Prefs f26265b;

    /* renamed from: c */
    @NotNull
    public EpisodesUiLogic f26266c;

    /* renamed from: d */
    @NotNull
    public EpisodesUiController f26267d;

    /* renamed from: e */
    @NotNull
    public Listener f26268e;

    /* compiled from: EpisodesPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/episodes/EpisodesPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/episodes/EpisodesUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends EpisodesUiController.Listener {
    }

    @Inject
    public EpisodesPresenter(@NotNull EpisodeRepository episodeRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(episodeRepository, "episodeRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26264a = episodeRepository;
        this.f26265b = prefs;
        this.f26266c = new EpisodesUiLogic();
        this.f26267d = new EpisodesUiController();
        this.f26268e = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.episodes.TypeHintModel.Listener
            /* renamed from: a */
            public void mo14584a() {
                C3033a.m17749k(EpisodesPresenter.this.f26265b.f25344a, "TYPE_EPISODE", false);
                EpisodesPresenter.this.m14568b();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.episodes.EpisodeModel.Listener
            /* renamed from: b */
            public void mo14585b(int i2, boolean z) {
                Object obj;
                Iterator<T> it = EpisodesPresenter.this.f26266c.f29049i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Episode) obj).getPosition() == i2) {
                            break;
                        }
                    }
                }
                if (((Episode) obj) != null) {
                    EpisodesPresenter.this.m14578m(i2, z);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.episodes.SourceHintModel.Listener
            /* renamed from: c */
            public void mo14586c() {
                C3033a.m17749k(EpisodesPresenter.this.f26265b.f25344a, "SOURCE_EPISODE", false);
                EpisodesPresenter.this.m14568b();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.episodes.TypeModel.Listener
            /* renamed from: d */
            public void mo14587d(long j2) {
                Object obj;
                Iterator<T> it = EpisodesPresenter.this.f26266c.f29047g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Type) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Type type = (Type) obj;
                if (type != null) {
                    EpisodesUiLogic episodesUiLogic = EpisodesPresenter.this.f26266c;
                    episodesUiLogic.m15682c("STATE_SOURCES");
                    episodesUiLogic.f29055o = type;
                    EpisodesPresenter.this.getViewState().mo14595H1(type);
                    EpisodesPresenter.this.f26266c.m15680a();
                    EpisodesPresenter.this.m14581p();
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.episodes.EpisodeModel.Listener
            /* renamed from: e */
            public void mo14588e(int i2) {
                Object obj;
                Iterator<T> it = EpisodesPresenter.this.f26266c.f29049i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Episode) obj).getPosition() == i2) {
                            break;
                        }
                    }
                }
                Episode episode = (Episode) obj;
                if (episode != null) {
                    EpisodesPresenter.this.getViewState().mo14618y2(episode);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.episodes.SourceModel.Listener
            /* renamed from: f */
            public void mo14589f(long j2) {
                Object obj;
                Iterator<T> it = EpisodesPresenter.this.f26266c.f29048h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Source) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Source source = (Source) obj;
                if (source != null) {
                    EpisodesPresenter episodesPresenter = EpisodesPresenter.this;
                    EpisodesUiLogic episodesUiLogic = episodesPresenter.f26266c;
                    episodesUiLogic.f29044d = "STATE_EPISODES";
                    episodesUiLogic.f29056p = source;
                    episodesPresenter.getViewState().mo14609f4(source);
                    EpisodesPresenter.this.f26266c.m15680a();
                    EpisodesPresenter.m14565j(EpisodesPresenter.this, false, 1);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.episodes.EpisodeModel.Listener
            /* renamed from: g */
            public void mo14590g(int i2) {
                Object obj;
                Iterator<T> it = EpisodesPresenter.this.f26266c.f29049i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Episode) obj).getPosition() == i2) {
                            break;
                        }
                    }
                }
                Episode episode = (Episode) obj;
                if (episode != null) {
                    EpisodesPresenter.this.getViewState().mo14603Z3(episode);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.episodes.EpisodeModel.Listener
            /* renamed from: h */
            public void mo14591h(int i2) {
                Object obj;
                if (EpisodesPresenter.this.m14569c()) {
                    EpisodesPresenter.this.getViewState().mo14611m();
                    return;
                }
                Iterator<T> it = EpisodesPresenter.this.f26266c.f29049i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Episode) obj).getPosition() == i2) {
                            break;
                        }
                    }
                }
                Episode episode = (Episode) obj;
                if (episode != null) {
                    EpisodesPresenter episodesPresenter = EpisodesPresenter.this;
                    Objects.requireNonNull(episodesPresenter);
                    episodesPresenter.getViewState().mo14615s2(episode);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.episodes.EpisodeHintModel.Listener
            /* renamed from: i */
            public void mo14592i() {
                C3033a.m17749k(EpisodesPresenter.this.f26265b.f25344a, "HINT_EPISODE", false);
                EpisodesPresenter.this.m14568b();
            }
        };
    }

    /* renamed from: j */
    public static void m14565j(final EpisodesPresenter episodesPresenter, final boolean z, int i2) {
        final Source source;
        if ((i2 & 1) != 0) {
            z = episodesPresenter.f26267d.isEmpty();
        }
        EpisodesUiLogic episodesUiLogic = episodesPresenter.f26266c;
        Type type = episodesUiLogic.f29055o;
        if (type == null || (source = episodesUiLogic.f29056p) == null) {
            return;
        }
        EpisodeRepository episodeRepository = episodesPresenter.f26264a;
        episodeRepository.f27347b.episodes(episodesUiLogic.f29042b, type.getId(), source.getId(), episodesPresenter.f26266c.f29046f, episodeRepository.f27349d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2569c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onEpisodes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    episodesPresenter.getViewState().mo14605b();
                }
                return Unit.f63088a;
            }
        }, 4)).m31368j(new C2568b(z, episodesPresenter, 0)).m31370l(new C2569c(new Function1<EpisodeResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onEpisodes$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x01b6  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.Unit invoke(com.swiftsoft.anixartd.network.response.release.episode.EpisodeResponse r19) {
                /*
                    Method dump skipped, instructions count: 462
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onEpisodes$3.invoke(java.lang.Object):java.lang.Object");
            }
        }, 5), new C2569c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onEpisodes$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                EpisodesPresenter.this.getViewState().mo14606c();
                return Unit.f63088a;
            }
        }, 6), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: r */
    public static void m14566r(final EpisodesPresenter episodesPresenter, final boolean z, int i2) {
        if ((i2 & 1) != 0) {
            z = episodesPresenter.f26267d.isEmpty();
        }
        episodesPresenter.getViewState().mo14600R1();
        EpisodeRepository episodeRepository = episodesPresenter.f26264a;
        episodeRepository.f27347b.types(episodesPresenter.f26266c.f29042b).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2569c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onTypes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    episodesPresenter.getViewState().mo14605b();
                }
                return Unit.f63088a;
            }
        }, 7)).m31368j(new C2567a(episodesPresenter, 3)).m31370l(new C2569c(new Function1<TypesResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onTypes$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(TypesResponse typesResponse) {
                Object obj;
                TypesResponse typesResponse2 = typesResponse;
                if (Intrinsics.m32174c(EpisodesPresenter.this.f26266c.f29044d, "STATE_TYPES")) {
                    List<Type> types = typesResponse2.getTypes();
                    LastWatchedEpisode lastWatchedEpisode = EpisodesPresenter.this.f26266c.f29059s;
                    Iterator<T> it = types.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (lastWatchedEpisode != null && ((Type) obj).getId() == lastWatchedEpisode.getTypeId()) {
                            break;
                        }
                    }
                    Type type = (Type) obj;
                    if (types.size() == 1) {
                        EpisodesPresenter.this.m14582q(types.get(0), true);
                    } else {
                        if (EpisodesPresenter.this.f26265b.m14046B()) {
                            EpisodesPresenter episodesPresenter2 = EpisodesPresenter.this;
                            if (!episodesPresenter2.f26266c.f29060t && type != null) {
                                episodesPresenter2.m14582q(type, false);
                            }
                        }
                        EpisodesUiLogic episodesUiLogic = EpisodesPresenter.this.f26266c;
                        Objects.requireNonNull(episodesUiLogic);
                        episodesUiLogic.f29045e = "ACTION_TYPES";
                        boolean z2 = episodesUiLogic.f29052l;
                        if (z2) {
                            episodesUiLogic.f29047g.addAll(types);
                        } else {
                            episodesUiLogic.f29045e = "ACTION_TYPES";
                            if (z2) {
                                episodesUiLogic.m15680a();
                            }
                            episodesUiLogic.f29047g.addAll(types);
                            episodesUiLogic.f29052l = true;
                        }
                        EpisodesPresenter.this.m14568b();
                    }
                    EpisodesPresenter.this.getViewState().mo14598O();
                }
                return Unit.f63088a;
            }
        }, 8), new C2569c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onTypes$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                EpisodesPresenter.this.getViewState().mo14606c();
                return Unit.f63088a;
            }
        }, 9), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: a */
    public final boolean m14567a() {
        return this.f26265b.f25344a.getBoolean("HINT_EPISODE", true);
    }

    /* renamed from: b */
    public final void m14568b() {
        String str;
        EpisodeUpdate episodeLastUpdate = this.f26266c.m15681b().getEpisodeLastUpdate();
        EpisodesUiController episodesUiController = this.f26267d;
        EpisodesUiLogic episodesUiLogic = this.f26266c;
        String str2 = episodesUiLogic.f29045e;
        List<Episode> list = episodesUiLogic.f29049i;
        List<Source> list2 = episodesUiLogic.f29048h;
        List<Type> list3 = episodesUiLogic.f29047g;
        Type type = episodesUiLogic.f29055o;
        if (type == null || (str = type.getName()) == null) {
            str = "";
        }
        episodesUiController.setData(str2, list, list2, list3, str, Long.valueOf(episodeLastUpdate != null ? episodeLastUpdate.getLastEpisodeTypeUpdateId() : 0L), Long.valueOf(episodeLastUpdate != null ? episodeLastUpdate.getLastEpisodeSourceUpdateId() : 0L), Boolean.valueOf(this.f26265b.f25344a.getBoolean("TYPE_EPISODE", true)), Boolean.valueOf(this.f26265b.f25344a.getBoolean("SOURCE_EPISODE", true)), Boolean.valueOf(m14567a()), Boolean.FALSE, Boolean.valueOf(this.f26266c.m15681b().getCanTorlookSearch()), this.f26268e);
    }

    /* renamed from: c */
    public final boolean m14569c() {
        return this.f26265b.m14083z();
    }

    /* renamed from: d */
    public final boolean m14570d() {
        return this.f26265b.m14076s() == 0;
    }

    /* renamed from: e */
    public final boolean m14571e() {
        if (Intrinsics.m32174c(this.f26266c.f29044d, "STATE_SOURCES")) {
            EpisodesUiLogic episodesUiLogic = this.f26266c;
            if (!episodesUiLogic.f29050j) {
                episodesUiLogic.f29055o = null;
                episodesUiLogic.f29044d = "STATE_TYPES";
                episodesUiLogic.f29050j = false;
                episodesUiLogic.m15680a();
                m14566r(this, false, 1);
                return false;
            }
        }
        if (Intrinsics.m32174c(this.f26266c.f29044d, "STATE_EPISODES")) {
            EpisodesUiLogic episodesUiLogic2 = this.f26266c;
            if (!episodesUiLogic2.f29051k) {
                Type type = episodesUiLogic2.f29055o;
                if (type == null) {
                    return true;
                }
                episodesUiLogic2.f29056p = null;
                getViewState().mo14595H1(type);
                EpisodesUiLogic episodesUiLogic3 = this.f26266c;
                episodesUiLogic3.f29044d = "STATE_SOURCES";
                episodesUiLogic3.f29051k = false;
                episodesUiLogic3.m15680a();
                m14581p();
                return false;
            }
        }
        if (Intrinsics.m32174c(this.f26266c.f29044d, "STATE_EPISODES")) {
            EpisodesUiLogic episodesUiLogic4 = this.f26266c;
            if (!episodesUiLogic4.f29050j && episodesUiLogic4.f29051k) {
                episodesUiLogic4.f29055o = null;
                episodesUiLogic4.f29044d = "STATE_TYPES";
                episodesUiLogic4.f29050j = false;
                episodesUiLogic4.f29051k = false;
                episodesUiLogic4.m15680a();
                m14566r(this, false, 1);
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m14572f(final int i2) {
        final Episode episode = this.f26266c.f29058r;
        if (episode != null) {
            Source source = episode.getSource();
            long id2 = source != null ? source.getId() : episode.getSourceId();
            if (i2 == 0) {
                getViewState().mo14607c3(episode);
            } else if (i2 == 1 || i2 == 2) {
                this.f26264a.m15291b(this.f26266c.m15681b().getId(), id2, episode.getPosition()).m31370l(new C2561b(new Function1<EpisodeTargetResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onDownloadEpisode$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(EpisodeTargetResponse episodeTargetResponse) {
                        Episode episode2 = episodeTargetResponse.getEpisode();
                        if (episode2 == null) {
                            episode2 = Episode.this;
                        }
                        String url = episode2.getUrl();
                        Parser.Companion companion = Parser.f25796e;
                        String host = new URL(url).getHost();
                        Intrinsics.m32178g(host, "URL(url).host");
                        if (companion.m14182a(host) && this.f26265b.m14067j() && !this.f26265b.m14047C() && this.m14570d()) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("with_ad", Long.valueOf(this.f26266c.m15681b().getId()));
                            YandexMetrica.reportEvent("Показ рекламы Kodik", hashMap);
                            this.getViewState().mo14594G3(episode2, 1, i2);
                        } else {
                            String host2 = new URL(url).getHost();
                            Intrinsics.m32178g(host2, "URL(url).host");
                            if (companion.m14182a(host2) && (this.f26265b.m14047C() || !this.m14570d())) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("without_ad", Long.valueOf(this.f26266c.m15681b().getId()));
                                YandexMetrica.reportEvent("Показ рекламы Kodik", hashMap2);
                            }
                            this.m14573g(episode2, i2);
                        }
                        return Unit.f63088a;
                    }
                }, 23), new C2561b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onDownloadEpisode$2
                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        th.printStackTrace();
                        return Unit.f63088a;
                    }
                }, 24), Functions.f59621b, Functions.f59622c);
            }
        }
    }

    /* renamed from: g */
    public final void m14573g(@NotNull final Episode episode, final int i2) {
        final String url = episode.getUrl();
        if (i2 != 0) {
            new ObservableDefer(new CallableC2570d(episode, 0)).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2561b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onDownloadEpisodeParsing$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    EpisodesPresenter.this.getViewState().mo14613p3();
                    return Unit.f63088a;
                }
            }, 25)).m31365g(new C2567a(this, 0)).m31370l(new C2561b(new Function1<Parser, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onDownloadEpisodeParsing$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Parser parser) {
                    Parser parser2 = parser;
                    String m14177d = parser2.m14177d("Default");
                    String m14177d2 = parser2.m14177d("360p");
                    String m14177d3 = parser2.m14177d("480p");
                    String m14177d4 = parser2.m14177d("720p");
                    String m14177d5 = parser2.m14177d("1080p");
                    if (m14177d == null && m14177d2 == null && m14177d3 == null && m14177d4 == null && m14177d5 == null) {
                        this.getViewState().mo14602U1();
                    } else {
                        List<String> m31998K = CollectionsKt.m31998K(url, m14177d, m14177d2, m14177d3, m14177d4, m14177d5);
                        if ((parser2 instanceof KodikParser) && this.f26265b.m14067j() && !this.f26265b.m14047C()) {
                            if (this.f26265b.m14076s() == 1) {
                                m31998K.set(4, null);
                                m31998K.set(5, null);
                                System.out.println((Object) ("no ads => remove high and ultra high qualities => " + m31998K));
                            }
                        }
                        this.m14578m(episode.getPosition(), true);
                        String m16296a = new Common().m16296a(url);
                        HashMap hashMap = new HashMap();
                        int i3 = i2;
                        hashMap.put(m16296a, i3 != 1 ? i3 != 3 ? "none" : "external" : "system");
                        YandexMetrica.reportEvent("Скачивание серии", hashMap);
                        this.getViewState().mo14597N1(episode, i2, m31998K);
                    }
                    return Unit.f63088a;
                }
            }, 26), new C2561b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onDownloadEpisodeParsing$5
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    EpisodesPresenter.this.getViewState().mo14602U1();
                    return Unit.f63088a;
                }
            }, 27), Functions.f59621b, Functions.f59622c);
        }
    }

    /* renamed from: h */
    public final void m14574h(@NotNull final Episode episode, final int i2) {
        Intrinsics.m32179h(episode, "episode");
        final long id2 = this.f26266c.m15681b().getId();
        Source source = episode.getSource();
        long id3 = source != null ? source.getId() : episode.getSourceId();
        if (i2 != 0) {
            if (!m14569c()) {
                Type type = this.f26266c.f29055o;
                if (type != null) {
                    EpisodeRepository episodeRepository = this.f26264a;
                    long id4 = type.getId();
                    long id5 = episode.getId();
                    LastWatchedEpisodeDao lastWatchedEpisodeDao = episodeRepository.f27351f;
                    LastWatchedEpisode lastWatchedEpisode = new LastWatchedEpisode();
                    lastWatchedEpisode.setReleaseId(id2);
                    lastWatchedEpisode.setTypeId(id4);
                    lastWatchedEpisode.setSourceId(id3);
                    lastWatchedEpisode.setEpisodeId(id5);
                    lastWatchedEpisode.setTimestamp(System.currentTimeMillis() / 1000);
                    lastWatchedEpisodeDao.save(lastWatchedEpisode);
                }
                this.f26264a.m15290a(id2, id3, episode.getPosition()).m31370l(new C2569c(new Function1<HistoryResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onEpisode$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(HistoryResponse historyResponse) {
                        if (historyResponse.isSuccess()) {
                            Release m15681b = EpisodesPresenter.this.f26266c.m15681b();
                            m15681b.setViewed(true);
                            m15681b.setLastViewEpisode(episode);
                            m15681b.setLastViewTimestamp(System.currentTimeMillis() / 1000);
                            EventBusKt.m16327a(new OnFetchRelease(m15681b));
                        }
                        return Unit.f63088a;
                    }
                }, 12), new C2569c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onEpisode$2
                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        th.printStackTrace();
                        return Unit.f63088a;
                    }
                }, 13), Functions.f59621b, Functions.f59622c);
            }
            m14578m(episode.getPosition(), true);
        }
        if (i2 == 0) {
            getViewState().mo14616t2(episode, this.f26265b.f25344a.getInt("LAST_SELECTED_PLAYER", -1), this.f26265b.f25344a.getBoolean("SHOW_MORE_PLAYERS", false));
            return;
        }
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                this.f26264a.m15291b(id2, id3, episode.getPosition()).m31370l(new C2569c(new Function1<EpisodeTargetResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onEpisode$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(EpisodeTargetResponse episodeTargetResponse) {
                        Episode episode2 = episodeTargetResponse.getEpisode();
                        if (episode2 == null) {
                            episode2 = Episode.this;
                        }
                        String url = episode2.getUrl();
                        Parser.Companion companion = Parser.f25796e;
                        String host = new URL(url).getHost();
                        Intrinsics.m32178g(host, "URL(url).host");
                        if (companion.m14182a(host) && this.f26265b.m14067j() && !this.f26265b.m14047C() && this.m14570d()) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("with_ad", Long.valueOf(id2));
                            YandexMetrica.reportEvent("Показ рекламы Kodik", hashMap);
                            this.getViewState().mo14594G3(episode2, 0, i2);
                        } else {
                            String host2 = new URL(url).getHost();
                            Intrinsics.m32178g(host2, "URL(url).host");
                            if (companion.m14182a(host2) && this.f26265b.m14067j() && (this.f26265b.m14047C() || !this.m14570d())) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("without_ad", Long.valueOf(id2));
                                YandexMetrica.reportEvent("Показ рекламы Kodik", hashMap2);
                            }
                            this.m14576k(url, i2);
                        }
                        return Unit.f63088a;
                    }
                }, 14), new C2569c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onEpisode$4
                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        th.printStackTrace();
                        return Unit.f63088a;
                    }
                }, 15), Functions.f59621b, Functions.f59622c);
                return;
            }
            return;
        }
        String m16296a = new Common().m16296a(episode.getUrl());
        HashMap hashMap = new HashMap();
        hashMap.put(m16296a, "web");
        YandexMetrica.reportEvent("Открытие серии", hashMap);
        getViewState().mo14617v2(episode.getUrl(), episode.getIframe());
    }

    /* renamed from: i */
    public final void m14575i(@NotNull Episode episode) {
        Intrinsics.m32179h(episode, "episode");
        EpisodesUiLogic episodesUiLogic = this.f26266c;
        episodesUiLogic.m15682c("STATE_EPISODES");
        episodesUiLogic.f29057q = episode;
        m14574h(episode, this.f26265b.m14077t());
    }

    /* renamed from: k */
    public final void m14576k(@NotNull final String url, final int i2) {
        Intrinsics.m32179h(url, "url");
        new ObservableDefer(new CallableC2571e(url, 0)).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2561b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onParsing$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                EpisodesPresenter.this.getViewState().mo14613p3();
                return Unit.f63088a;
            }
        }, 28)).m31365g(new C2567a(this, 1)).m31370l(new C2561b(new Function1<Parser, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onParsing$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Parser parser) {
                Parser parser2 = parser;
                Episode episode = EpisodesPresenter.this.f26266c.f29057q;
                if (episode == null) {
                    throw new Exception("SelectedEpisode cannot be null");
                }
                String str = parser2.f25802b;
                String m14178f = parser2.m14178f("Default");
                String m14178f2 = parser2.m14178f("360p");
                String m14178f3 = parser2.m14178f("480p");
                String m14178f4 = parser2.m14178f("720p");
                String m14178f5 = parser2.m14178f("1080p");
                if (m14178f == null && m14178f2 == null && m14178f3 == null && m14178f4 == null && m14178f5 == null) {
                    EpisodesView viewState = EpisodesPresenter.this.getViewState();
                    StringBuilder m29z = C0000a.m29z("Return 1#", m14178f, " 2#", m14178f2, " 3#");
                    C0000a.m2C(m29z, m14178f3, " 4#", m14178f4, " 5#");
                    m29z.append(m14178f5);
                    viewState.mo14614r3(m29z.toString());
                    HashMap hashMap = new HashMap();
                    StringBuilder m29z2 = C0000a.m29z("Return 1#", m14178f, " 2#", m14178f2, " 3#");
                    C0000a.m2C(m29z2, m14178f3, " 4#", m14178f4, " 5#");
                    m29z2.append(m14178f5);
                    hashMap.put("error", m29z2.toString());
                    YandexMetrica.reportEvent("Episode error", hashMap);
                } else {
                    List<String> m31998K = CollectionsKt.m31998K(url, m14178f, m14178f2, m14178f3, m14178f4, m14178f5);
                    String str2 = null;
                    if ((parser2 instanceof KodikParser) && EpisodesPresenter.this.f26265b.m14067j() && !EpisodesPresenter.this.f26265b.m14047C()) {
                        if (EpisodesPresenter.this.f26265b.m14076s() == 1) {
                            m31998K.set(4, null);
                            m31998K.set(5, null);
                            System.out.println((Object) ("no ads => remove high and ultra high qualities => " + m31998K));
                        }
                    }
                    Source source = episode.getSource();
                    long id2 = source != null ? source.getId() : episode.getSourceId();
                    EpisodesPresenter episodesPresenter = EpisodesPresenter.this;
                    Long m15292c = episodesPresenter.f26264a.m15292c(episodesPresenter.f26266c.f29042b, id2, episode);
                    long longValue = m15292c != null ? m15292c.longValue() : 0L;
                    int i3 = i2;
                    if (i3 == 2) {
                        EpisodesPresenter.this.getViewState().mo14601S3(m31998K, str, Long.valueOf(longValue));
                    } else if (i3 == 3) {
                        EpisodesPresenter.this.getViewState().mo14596L3(episode, str, m31998K, EpisodesPresenter.this.f26265b.f25344a.getInt("SELECTED_THIRD_PARTY_VIDEO_QUALITY", 0));
                    }
                    int i4 = i2;
                    if (i4 == 2) {
                        str2 = "internal";
                    } else if (i4 == 3) {
                        str2 = "external";
                    }
                    if (str2 != null) {
                        String m16296a = new Common().m16296a(url);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(m16296a, str2);
                        YandexMetrica.reportEvent("Открытие серии", hashMap2);
                    }
                }
                return Unit.f63088a;
            }
        }, 29), new C2569c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onParsing$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                Throwable th2 = th;
                th2.printStackTrace();
                EpisodesPresenter.this.getViewState().mo14614r3(th2.getLocalizedMessage());
                YandexMetrica.reportError("Episode error", th2);
                return Unit.f63088a;
            }
        }, 0), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: l */
    public final void m14577l() {
        this.f26266c.m15680a();
        String str = this.f26266c.f29044d;
        int hashCode = str.hashCode();
        if (hashCode == 104438218) {
            if (str.equals("STATE_SOURCES")) {
                m14581p();
            }
        } else if (hashCode == 309704459) {
            if (str.equals("STATE_TYPES")) {
                m14566r(this, false, 1);
            }
        } else if (hashCode == 858310118 && str.equals("STATE_EPISODES")) {
            m14565j(this, false, 1);
        }
    }

    /* renamed from: m */
    public final void m14578m(int i2, boolean z) {
        Object obj;
        Observable m31369k;
        EpisodesUiLogic episodesUiLogic = this.f26266c;
        Source source = episodesUiLogic.f29056p;
        if (source == null) {
            return;
        }
        long id2 = source.getId();
        boolean z2 = !z;
        Iterator<T> it = episodesUiLogic.f29049i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Episode episode = (Episode) obj;
            Source source2 = episode.getSource();
            boolean z3 = false;
            if (((source2 != null && source2.getId() == id2) || episode.getSourceId() == id2) && episode.getPosition() == i2 && episode.getIsWatched() == z2) {
                z3 = true;
            }
        }
        Episode episode2 = (Episode) obj;
        if (episode2 == null) {
            return;
        }
        if (z) {
            m31369k = this.f26264a.m15294e(this.f26266c.f29042b, source.getId(), i2);
        } else {
            EpisodeRepository episodeRepository = this.f26264a;
            m31369k = episodeRepository.f27347b.unwatch(this.f26266c.f29042b, source.getId(), i2, episodeRepository.f27349d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        }
        if (!m14569c()) {
            m31369k.m31370l(new C2569c(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onSetIsWatched$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Response response) {
                    return Unit.f63088a;
                }
            }, 10), new C2569c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onSetIsWatched$4
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    return Unit.f63088a;
                }
            }, 11), Functions.f59621b, Functions.f59622c);
        }
        Objects.requireNonNull(this.f26266c);
        episode2.setWatched(z);
        if (!z) {
            episode2.setPlaybackPosition(0L);
        }
        this.f26264a.m15293d(this.f26266c.f29042b, source.getId(), episode2, z);
        m14568b();
    }

    /* renamed from: n */
    public final void m14579n(boolean z) {
        Observable<EpisodeUnwatchResponse> m31369k;
        EpisodesUiLogic episodesUiLogic = this.f26266c;
        Source source = episodesUiLogic.f29056p;
        if (source == null) {
            return;
        }
        long id2 = source.getId();
        boolean z2 = !z;
        List<Episode> list = episodesUiLogic.f29049i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Episode episode = (Episode) obj;
            Source source2 = episode.getSource();
            boolean z3 = false;
            if (((source2 != null && source2.getId() == id2) || episode.getSourceId() == id2) && episode.getIsWatched() == z2) {
                z3 = true;
            }
            if (z3) {
                arrayList.add(obj);
            }
        }
        if (z) {
            EpisodeRepository episodeRepository = this.f26264a;
            m31369k = episodeRepository.f27347b.watch(this.f26266c.f29042b, source.getId(), episodeRepository.f27349d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else {
            EpisodeRepository episodeRepository2 = this.f26264a;
            m31369k = episodeRepository2.f27347b.unwatch(this.f26266c.f29042b, source.getId(), episodeRepository2.f27349d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        }
        if (!m14569c()) {
            m31369k.m31370l(new C2569c(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onSetIsWatched$1
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Response response) {
                    System.out.println((Object) "WATCH OR UNWATCHHHH III IDDODODN'''T KNOOOOWWWW C:");
                    return Unit.f63088a;
                }
            }, 16), new C2569c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onSetIsWatched$2
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    return Unit.f63088a;
                }
            }, 17), Functions.f59621b, Functions.f59622c);
        }
        Objects.requireNonNull(this.f26266c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Episode) it.next()).setWatched(z);
        }
        EpisodeRepository episodeRepository3 = this.f26264a;
        long j2 = this.f26266c.f29042b;
        long id3 = source.getId();
        Objects.requireNonNull(episodeRepository3);
        episodeRepository3.f27350e.updateIsWatchedByReleaseIdAndSourceId(j2, id3, z);
        if (!z) {
            episodeRepository3.f27350e.updatePlaybackPositionByReleaseIdAndSourceId(j2, id3, 0L);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Episode episode2 = (Episode) it2.next();
            if (!episodeRepository3.f27350e.existsByReleaseIdAndSourceIdAndPosition(episode2.getReleaseId(), episode2.getSourceId(), episode2.getPosition())) {
                Release release = episode2.getRelease();
                episode2.setReleaseId(release != null ? release.getId() : 0L);
                Source source3 = episode2.getSource();
                episode2.setSourceId(source3 != null ? source3.getId() : 0L);
                episode2.setWatched(z);
                episodeRepository3.f27350e.save(episode2);
            }
        }
        m14568b();
    }

    /* renamed from: o */
    public final void m14580o(@NotNull Source source, boolean z) {
        Intrinsics.m32179h(source, "source");
        EpisodesUiLogic episodesUiLogic = this.f26266c;
        episodesUiLogic.m15682c("STATE_EPISODES");
        episodesUiLogic.f29051k = z;
        episodesUiLogic.f29056p = source;
        getViewState().mo14609f4(source);
        m14565j(this, false, 1);
    }

    /* renamed from: p */
    public final void m14581p() {
        EpisodesUiLogic episodesUiLogic = this.f26266c;
        Type type = episodesUiLogic.f29055o;
        if (type == null) {
            return;
        }
        EpisodeRepository episodeRepository = this.f26264a;
        episodeRepository.f27347b.sources(episodesUiLogic.f29042b, type.getId()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2569c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onSources$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                EpisodesPresenter.this.getViewState().mo14605b();
                return Unit.f63088a;
            }
        }, 1)).m31368j(new C2567a(this, 2)).m31370l(new C2569c(new Function1<SourcesResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onSources$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SourcesResponse sourcesResponse) {
                Object obj;
                SourcesResponse sourcesResponse2 = sourcesResponse;
                if (Intrinsics.m32174c(EpisodesPresenter.this.f26266c.f29044d, "STATE_SOURCES")) {
                    List<Source> sources = sourcesResponse2.getSources();
                    LastWatchedEpisode lastWatchedEpisode = EpisodesPresenter.this.f26266c.f29059s;
                    Iterator<T> it = sources.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (lastWatchedEpisode != null && ((Source) obj).getId() == lastWatchedEpisode.getSourceId()) {
                            break;
                        }
                    }
                    Source source = (Source) obj;
                    if (sources.size() == 1) {
                        EpisodesPresenter.this.f26266c.f29060t = true;
                        EpisodesPresenter.this.m14580o(sources.get(0), true);
                    } else {
                        if (EpisodesPresenter.this.f26265b.m14046B()) {
                            EpisodesPresenter episodesPresenter = EpisodesPresenter.this;
                            EpisodesUiLogic episodesUiLogic2 = episodesPresenter.f26266c;
                            if (!episodesUiLogic2.f29060t && source != null) {
                                episodesUiLogic2.f29060t = true;
                                episodesPresenter.m14580o(source, false);
                            }
                        }
                        EpisodesUiLogic episodesUiLogic3 = EpisodesPresenter.this.f26266c;
                        Objects.requireNonNull(episodesUiLogic3);
                        episodesUiLogic3.f29045e = "ACTION_SOURCES";
                        boolean z = episodesUiLogic3.f29053m;
                        if (z) {
                            episodesUiLogic3.f29048h.addAll(sources);
                        } else {
                            episodesUiLogic3.f29045e = "ACTION_SOURCES";
                            if (z) {
                                episodesUiLogic3.m15680a();
                            }
                            episodesUiLogic3.f29048h.addAll(sources);
                            episodesUiLogic3.f29053m = true;
                        }
                        EpisodesPresenter.this.m14568b();
                    }
                    EpisodesPresenter.this.getViewState().mo14598O();
                }
                return Unit.f63088a;
            }
        }, 2), new C2569c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter$onSources$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                EpisodesPresenter.this.getViewState().mo14606c();
                return Unit.f63088a;
            }
        }, 3), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: q */
    public final void m14582q(@NotNull Type type, boolean z) {
        Intrinsics.m32179h(type, "type");
        EpisodesUiLogic episodesUiLogic = this.f26266c;
        episodesUiLogic.m15682c("STATE_SOURCES");
        episodesUiLogic.f29050j = z;
        episodesUiLogic.f29055o = type;
        getViewState().mo14595H1(type);
        m14581p();
    }

    /* renamed from: s */
    public final void m14583s(int i2) {
        this.f26266c.f29046f = i2;
        this.f26265b.f25344a.edit().putInt("SORT_EPISODES", i2).apply();
        m14577l();
    }
}
