package com.swiftsoft.anixartd.presentation.main.schedule;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.ScheduleResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.schedule.ScheduleUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.schedule.ScheduleUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.release.video.C2619b;
import com.swiftsoft.anixartd.repository.ScheduleRepository;
import com.yandex.div2.C3033a;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: SchedulePresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/schedule/SchedulePresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/schedule/ScheduleView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SchedulePresenter extends MvpPresenter<ScheduleView> {

    /* renamed from: a */
    @NotNull
    public ScheduleRepository f27193a;

    /* renamed from: b */
    @NotNull
    public Prefs f27194b;

    /* renamed from: c */
    @NotNull
    public Listener f27195c;

    /* renamed from: d */
    @NotNull
    public ScheduleUiLogic f27196d;

    /* renamed from: e */
    @NotNull
    public ScheduleUiController f27197e;

    /* compiled from: SchedulePresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/schedule/SchedulePresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/schedule/ScheduleUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ScheduleUiController.Listener {
    }

    @Inject
    public SchedulePresenter(@NotNull ScheduleRepository scheduleRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(scheduleRepository, "scheduleRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27193a = scheduleRepository;
        this.f27194b = prefs;
        this.f27195c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.schedule.SchedulePresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.schedule.ScheduleHintModel.Listener
            /* renamed from: a */
            public void mo15204a() {
                C3033a.m17749k(SchedulePresenter.this.f27194b.f25344a, "SCHEDULE_EPISODE", false);
                SchedulePresenter schedulePresenter = SchedulePresenter.this;
                ScheduleUiController scheduleUiController = schedulePresenter.f27197e;
                ScheduleUiLogic scheduleUiLogic = schedulePresenter.f27196d;
                scheduleUiController.setData(scheduleUiLogic.f29333b, scheduleUiLogic.f29334c, scheduleUiLogic.f29335d, scheduleUiLogic.f29336e, scheduleUiLogic.f29337f, scheduleUiLogic.f29338g, scheduleUiLogic.f29339h, Boolean.valueOf(schedulePresenter.f27194b.f25344a.getBoolean("SCHEDULE_EPISODE", true)), schedulePresenter.f27195c);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.schedule.ScheduleModel.Listener
            /* renamed from: g */
            public void mo15205g(long j2) {
                Object obj;
                Object obj2;
                Object obj3;
                Object obj4;
                Object obj5;
                Object obj6;
                Object obj7;
                Iterator<T> it = SchedulePresenter.this.f27196d.f29333b.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((Release) obj2).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release = (Release) obj2;
                Iterator<T> it2 = SchedulePresenter.this.f27196d.f29334c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it2.next();
                        if (((Release) obj3).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release2 = (Release) obj3;
                Iterator<T> it3 = SchedulePresenter.this.f27196d.f29335d.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj4 = null;
                        break;
                    } else {
                        obj4 = it3.next();
                        if (((Release) obj4).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release3 = (Release) obj4;
                Iterator<T> it4 = SchedulePresenter.this.f27196d.f29336e.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj5 = null;
                        break;
                    } else {
                        obj5 = it4.next();
                        if (((Release) obj5).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release4 = (Release) obj5;
                Iterator<T> it5 = SchedulePresenter.this.f27196d.f29337f.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj6 = null;
                        break;
                    } else {
                        obj6 = it5.next();
                        if (((Release) obj6).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release5 = (Release) obj6;
                Iterator<T> it6 = SchedulePresenter.this.f27196d.f29338g.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj7 = null;
                        break;
                    } else {
                        obj7 = it6.next();
                        if (((Release) obj7).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release6 = (Release) obj7;
                Iterator<T> it7 = SchedulePresenter.this.f27196d.f29339h.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    Object next = it7.next();
                    if (((Release) next).getId() == j2) {
                        obj = next;
                        break;
                    }
                }
                Release release7 = (Release) obj;
                if (release != null) {
                    SchedulePresenter.this.getViewState().mo15209g(release.getId());
                    return;
                }
                if (release2 != null) {
                    SchedulePresenter.this.getViewState().mo15209g(release2.getId());
                    return;
                }
                if (release3 != null) {
                    SchedulePresenter.this.getViewState().mo15209g(release3.getId());
                    return;
                }
                if (release4 != null) {
                    SchedulePresenter.this.getViewState().mo15209g(release4.getId());
                    return;
                }
                if (release5 != null) {
                    SchedulePresenter.this.getViewState().mo15209g(release5.getId());
                } else if (release6 != null) {
                    SchedulePresenter.this.getViewState().mo15209g(release6.getId());
                } else if (release7 != null) {
                    SchedulePresenter.this.getViewState().mo15209g(release7.getId());
                }
            }
        };
        this.f27196d = new ScheduleUiLogic();
        this.f27197e = new ScheduleUiController();
    }

    /* renamed from: a */
    public final void m15203a() {
        this.f27193a.f27392a.schedule().m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2619b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.schedule.SchedulePresenter$onSchedule$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                SchedulePresenter.this.getViewState().mo15207b();
                return Unit.f63088a;
            }
        }, 16)).m31368j(new C2549a(this, 18)).m31370l(new C2619b(new Function1<ScheduleResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.schedule.SchedulePresenter$onSchedule$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ScheduleResponse scheduleResponse) {
                ScheduleResponse scheduleResponse2 = scheduleResponse;
                ScheduleUiLogic scheduleUiLogic = SchedulePresenter.this.f27196d;
                List<Release> scheduleMonday = scheduleResponse2.getMonday();
                List<Release> scheduleTuesday = scheduleResponse2.getTuesday();
                List<Release> scheduleWednesday = scheduleResponse2.getWednesday();
                List<Release> scheduleThursday = scheduleResponse2.getThursday();
                List<Release> scheduleFriday = scheduleResponse2.getFriday();
                List<Release> scheduleSaturday = scheduleResponse2.getSaturday();
                List<Release> scheduleSunday = scheduleResponse2.getSunday();
                Objects.requireNonNull(scheduleUiLogic);
                Intrinsics.m32179h(scheduleMonday, "scheduleMonday");
                Intrinsics.m32179h(scheduleTuesday, "scheduleTuesday");
                Intrinsics.m32179h(scheduleWednesday, "scheduleWednesday");
                Intrinsics.m32179h(scheduleThursday, "scheduleThursday");
                Intrinsics.m32179h(scheduleFriday, "scheduleFriday");
                Intrinsics.m32179h(scheduleSaturday, "scheduleSaturday");
                Intrinsics.m32179h(scheduleSunday, "scheduleSunday");
                if (scheduleUiLogic.f29340i) {
                    scheduleUiLogic.f29333b.clear();
                    scheduleUiLogic.f29334c.clear();
                    scheduleUiLogic.f29335d.clear();
                    scheduleUiLogic.f29336e.clear();
                    scheduleUiLogic.f29337f.clear();
                    scheduleUiLogic.f29338g.clear();
                    scheduleUiLogic.f29339h.clear();
                    scheduleUiLogic.f29340i = false;
                }
                scheduleUiLogic.f29333b.addAll(scheduleMonday);
                scheduleUiLogic.f29334c.addAll(scheduleTuesday);
                scheduleUiLogic.f29335d.addAll(scheduleWednesday);
                scheduleUiLogic.f29336e.addAll(scheduleThursday);
                scheduleUiLogic.f29337f.addAll(scheduleFriday);
                scheduleUiLogic.f29338g.addAll(scheduleSaturday);
                scheduleUiLogic.f29339h.addAll(scheduleSunday);
                scheduleUiLogic.f29340i = true;
                SchedulePresenter schedulePresenter = SchedulePresenter.this;
                ScheduleUiController scheduleUiController = schedulePresenter.f27197e;
                ScheduleUiLogic scheduleUiLogic2 = schedulePresenter.f27196d;
                scheduleUiController.setData(scheduleUiLogic2.f29333b, scheduleUiLogic2.f29334c, scheduleUiLogic2.f29335d, scheduleUiLogic2.f29336e, scheduleUiLogic2.f29337f, scheduleUiLogic2.f29338g, scheduleUiLogic2.f29339h, Boolean.valueOf(schedulePresenter.f27194b.f25344a.getBoolean("SCHEDULE_EPISODE", true)), SchedulePresenter.this.f27195c);
                return Unit.f63088a;
            }
        }, 17), new C2619b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.schedule.SchedulePresenter$onSchedule$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                SchedulePresenter.this.getViewState().mo15208c();
                return Unit.f63088a;
            }
        }, 18), Functions.f59621b, Functions.f59622c);
    }
}
