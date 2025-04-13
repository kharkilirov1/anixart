package com.swiftsoft.anixartd.p015ui.controller.main.schedule;

import com.airbnb.epoxy.Carousel;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.epoxy.Typed9EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.SeparatorModel_;
import com.swiftsoft.anixartd.p015ui.model.main.schedule.HeaderModel_;
import com.swiftsoft.anixartd.p015ui.model.main.schedule.ScheduleHintModel;
import com.swiftsoft.anixartd.p015ui.model.main.schedule.ScheduleHintModel_;
import com.swiftsoft.anixartd.p015ui.model.main.schedule.ScheduleModel;
import com.swiftsoft.anixartd.p015ui.model.main.schedule.ScheduleModel_;
import com.swiftsoft.anixartd.p015ui.model.main.schedule.carousel.ScheduleCarouselModel_;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ScheduleUiController.kt */
@Metadata(m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0006Jz\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0005H\u0014J\u0006\u0010\u0012\u001a\u00020\u0004¨\u0006\u0014"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/schedule/ScheduleUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed9EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "", "Lcom/swiftsoft/anixartd/ui/controller/main/schedule/ScheduleUiController$Listener;", "()V", "buildModels", "", "scheduleMonday", "scheduleTuesday", "scheduleWednesday", "scheduleThursday", "scheduleFriday", "scheduleSaturday", "scheduleSunday", "scheduleHint", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ScheduleUiController extends Typed9EpoxyController<List<? extends Release>, List<? extends Release>, List<? extends Release>, List<? extends Release>, List<? extends Release>, List<? extends Release>, List<? extends Release>, Boolean, Listener> {

    /* compiled from: ScheduleUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/schedule/ScheduleUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/schedule/ScheduleModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/schedule/ScheduleHintModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ScheduleModel.Listener, ScheduleHintModel.Listener {
    }

    public ScheduleUiController() {
        setDebugLoggingEnabled(true);
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed9EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Release> list, List<? extends Release> list2, List<? extends Release> list3, List<? extends Release> list4, List<? extends Release> list5, List<? extends Release> list6, List<? extends Release> list7, Boolean bool, Listener listener) {
        buildModels((List<Release>) list, (List<Release>) list2, (List<Release>) list3, (List<Release>) list4, (List<Release>) list5, (List<Release>) list6, (List<Release>) list7, bool.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<Release> scheduleMonday, @NotNull List<Release> scheduleTuesday, @NotNull List<Release> scheduleWednesday, @NotNull List<Release> scheduleThursday, @NotNull List<Release> scheduleFriday, @NotNull List<Release> scheduleSaturday, @NotNull List<Release> scheduleSunday, boolean scheduleHint, @NotNull Listener listener) {
        Intrinsics.m32179h(scheduleMonday, "scheduleMonday");
        Intrinsics.m32179h(scheduleTuesday, "scheduleTuesday");
        Intrinsics.m32179h(scheduleWednesday, "scheduleWednesday");
        Intrinsics.m32179h(scheduleThursday, "scheduleThursday");
        Intrinsics.m32179h(scheduleFriday, "scheduleFriday");
        Intrinsics.m32179h(scheduleSaturday, "scheduleSaturday");
        Intrinsics.m32179h(scheduleSunday, "scheduleSunday");
        Intrinsics.m32179h(listener, "listener");
        if (scheduleHint) {
            ScheduleHintModel_ scheduleHintModel_ = new ScheduleHintModel_();
            scheduleHintModel_.mo16256a("hint");
            scheduleHintModel_.mo16257j1(listener);
            add(scheduleHintModel_);
        }
        if (!scheduleMonday.isEmpty()) {
            HeaderModel_ headerModel_ = new HeaderModel_();
            headerModel_.mo16254a("header1");
            headerModel_.mo16253Y0(1);
            add(headerModel_);
            ScheduleCarouselModel_ scheduleCarouselModel_ = new ScheduleCarouselModel_();
            scheduleCarouselModel_.mo16261a("carousel1");
            scheduleCarouselModel_.mo16263s(Carousel.Padding.m4493a(16, 8, 16, 0, 16));
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(scheduleMonday, 10));
            for (Release release : scheduleMonday) {
                ScheduleModel_ scheduleModel_ = new ScheduleModel_();
                scheduleModel_.m16260w2(release.getId());
                String titleRu = release.getTitleRu();
                scheduleModel_.m4524l2();
                scheduleModel_.f30087k = titleRu;
                Integer episodesReleased = release.getEpisodesReleased();
                scheduleModel_.m4524l2();
                scheduleModel_.f30089m = episodesReleased;
                Integer episodesTotal = release.getEpisodesTotal();
                scheduleModel_.m4524l2();
                scheduleModel_.f30090n = episodesTotal;
                String image = release.getImage();
                scheduleModel_.m4524l2();
                scheduleModel_.f30088l = image;
                scheduleModel_.m4524l2();
                scheduleModel_.f30091o = listener;
                arrayList.add(scheduleModel_);
            }
            scheduleCarouselModel_.mo16262q(arrayList);
            add(scheduleCarouselModel_);
            SeparatorModel_ separatorModel_ = new SeparatorModel_();
            separatorModel_.mo15779a("separator1");
            add(separatorModel_);
        }
        if (!scheduleTuesday.isEmpty()) {
            HeaderModel_ headerModel_2 = new HeaderModel_();
            headerModel_2.mo16254a("header2");
            headerModel_2.mo16253Y0(2);
            add(headerModel_2);
            ScheduleCarouselModel_ scheduleCarouselModel_2 = new ScheduleCarouselModel_();
            scheduleCarouselModel_2.mo16261a("carousel2");
            scheduleCarouselModel_2.mo16263s(Carousel.Padding.m4493a(16, 8, 16, 0, 16));
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(scheduleTuesday, 10));
            for (Release release2 : scheduleTuesday) {
                ScheduleModel_ scheduleModel_2 = new ScheduleModel_();
                scheduleModel_2.m16260w2(release2.getId());
                String titleRu2 = release2.getTitleRu();
                scheduleModel_2.m4524l2();
                scheduleModel_2.f30087k = titleRu2;
                Integer episodesReleased2 = release2.getEpisodesReleased();
                scheduleModel_2.m4524l2();
                scheduleModel_2.f30089m = episodesReleased2;
                Integer episodesTotal2 = release2.getEpisodesTotal();
                scheduleModel_2.m4524l2();
                scheduleModel_2.f30090n = episodesTotal2;
                String image2 = release2.getImage();
                scheduleModel_2.m4524l2();
                scheduleModel_2.f30088l = image2;
                scheduleModel_2.m4524l2();
                scheduleModel_2.f30091o = listener;
                arrayList2.add(scheduleModel_2);
            }
            scheduleCarouselModel_2.mo16262q(arrayList2);
            add(scheduleCarouselModel_2);
            SeparatorModel_ separatorModel_2 = new SeparatorModel_();
            separatorModel_2.mo15779a("separator2");
            add(separatorModel_2);
        }
        if (!scheduleWednesday.isEmpty()) {
            HeaderModel_ headerModel_3 = new HeaderModel_();
            headerModel_3.mo16254a("header3");
            headerModel_3.mo16253Y0(3);
            add(headerModel_3);
            ScheduleCarouselModel_ scheduleCarouselModel_3 = new ScheduleCarouselModel_();
            scheduleCarouselModel_3.mo16261a("carousel3");
            scheduleCarouselModel_3.mo16263s(Carousel.Padding.m4493a(16, 8, 16, 0, 16));
            ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(scheduleWednesday, 10));
            for (Release release3 : scheduleWednesday) {
                ScheduleModel_ scheduleModel_3 = new ScheduleModel_();
                scheduleModel_3.m16260w2(release3.getId());
                String titleRu3 = release3.getTitleRu();
                scheduleModel_3.m4524l2();
                scheduleModel_3.f30087k = titleRu3;
                Integer episodesReleased3 = release3.getEpisodesReleased();
                scheduleModel_3.m4524l2();
                scheduleModel_3.f30089m = episodesReleased3;
                Integer episodesTotal3 = release3.getEpisodesTotal();
                scheduleModel_3.m4524l2();
                scheduleModel_3.f30090n = episodesTotal3;
                String image3 = release3.getImage();
                scheduleModel_3.m4524l2();
                scheduleModel_3.f30088l = image3;
                scheduleModel_3.m4524l2();
                scheduleModel_3.f30091o = listener;
                arrayList3.add(scheduleModel_3);
            }
            scheduleCarouselModel_3.mo16262q(arrayList3);
            add(scheduleCarouselModel_3);
            SeparatorModel_ separatorModel_3 = new SeparatorModel_();
            separatorModel_3.mo15779a("separator3");
            add(separatorModel_3);
        }
        if (!scheduleThursday.isEmpty()) {
            HeaderModel_ headerModel_4 = new HeaderModel_();
            headerModel_4.mo16254a("header4");
            headerModel_4.mo16253Y0(4);
            add(headerModel_4);
            ScheduleCarouselModel_ scheduleCarouselModel_4 = new ScheduleCarouselModel_();
            scheduleCarouselModel_4.mo16261a("carousel4");
            scheduleCarouselModel_4.mo16263s(Carousel.Padding.m4493a(16, 8, 16, 0, 16));
            ArrayList arrayList4 = new ArrayList(CollectionsKt.m32032m(scheduleThursday, 10));
            for (Release release4 : scheduleThursday) {
                ScheduleModel_ scheduleModel_4 = new ScheduleModel_();
                scheduleModel_4.m16260w2(release4.getId());
                String titleRu4 = release4.getTitleRu();
                scheduleModel_4.m4524l2();
                scheduleModel_4.f30087k = titleRu4;
                Integer episodesReleased4 = release4.getEpisodesReleased();
                scheduleModel_4.m4524l2();
                scheduleModel_4.f30089m = episodesReleased4;
                Integer episodesTotal4 = release4.getEpisodesTotal();
                scheduleModel_4.m4524l2();
                scheduleModel_4.f30090n = episodesTotal4;
                String image4 = release4.getImage();
                scheduleModel_4.m4524l2();
                scheduleModel_4.f30088l = image4;
                scheduleModel_4.m4524l2();
                scheduleModel_4.f30091o = listener;
                arrayList4.add(scheduleModel_4);
            }
            scheduleCarouselModel_4.mo16262q(arrayList4);
            add(scheduleCarouselModel_4);
            SeparatorModel_ separatorModel_4 = new SeparatorModel_();
            separatorModel_4.mo15779a("separator4");
            add(separatorModel_4);
        }
        if (!scheduleFriday.isEmpty()) {
            HeaderModel_ headerModel_5 = new HeaderModel_();
            headerModel_5.mo16254a("header5");
            headerModel_5.mo16253Y0(5);
            add(headerModel_5);
            ScheduleCarouselModel_ scheduleCarouselModel_5 = new ScheduleCarouselModel_();
            scheduleCarouselModel_5.mo16261a("carousel5");
            scheduleCarouselModel_5.mo16263s(Carousel.Padding.m4493a(16, 8, 16, 0, 16));
            ArrayList arrayList5 = new ArrayList(CollectionsKt.m32032m(scheduleFriday, 10));
            for (Release release5 : scheduleFriday) {
                ScheduleModel_ scheduleModel_5 = new ScheduleModel_();
                scheduleModel_5.m16260w2(release5.getId());
                String titleRu5 = release5.getTitleRu();
                scheduleModel_5.m4524l2();
                scheduleModel_5.f30087k = titleRu5;
                Integer episodesReleased5 = release5.getEpisodesReleased();
                scheduleModel_5.m4524l2();
                scheduleModel_5.f30089m = episodesReleased5;
                Integer episodesTotal5 = release5.getEpisodesTotal();
                scheduleModel_5.m4524l2();
                scheduleModel_5.f30090n = episodesTotal5;
                String image5 = release5.getImage();
                scheduleModel_5.m4524l2();
                scheduleModel_5.f30088l = image5;
                scheduleModel_5.m4524l2();
                scheduleModel_5.f30091o = listener;
                arrayList5.add(scheduleModel_5);
            }
            scheduleCarouselModel_5.mo16262q(arrayList5);
            add(scheduleCarouselModel_5);
            SeparatorModel_ separatorModel_5 = new SeparatorModel_();
            separatorModel_5.mo15779a("separator5");
            add(separatorModel_5);
        }
        if (!scheduleSaturday.isEmpty()) {
            HeaderModel_ headerModel_6 = new HeaderModel_();
            headerModel_6.mo16254a("header6");
            headerModel_6.mo16253Y0(6);
            add(headerModel_6);
            ScheduleCarouselModel_ scheduleCarouselModel_6 = new ScheduleCarouselModel_();
            scheduleCarouselModel_6.mo16261a("carousel6");
            scheduleCarouselModel_6.mo16263s(Carousel.Padding.m4493a(16, 8, 16, 0, 16));
            ArrayList arrayList6 = new ArrayList(CollectionsKt.m32032m(scheduleSaturday, 10));
            for (Release release6 : scheduleSaturday) {
                ScheduleModel_ scheduleModel_6 = new ScheduleModel_();
                scheduleModel_6.m16260w2(release6.getId());
                String titleRu6 = release6.getTitleRu();
                scheduleModel_6.m4524l2();
                scheduleModel_6.f30087k = titleRu6;
                Integer episodesReleased6 = release6.getEpisodesReleased();
                scheduleModel_6.m4524l2();
                scheduleModel_6.f30089m = episodesReleased6;
                Integer episodesTotal6 = release6.getEpisodesTotal();
                scheduleModel_6.m4524l2();
                scheduleModel_6.f30090n = episodesTotal6;
                String image6 = release6.getImage();
                scheduleModel_6.m4524l2();
                scheduleModel_6.f30088l = image6;
                scheduleModel_6.m4524l2();
                scheduleModel_6.f30091o = listener;
                arrayList6.add(scheduleModel_6);
            }
            scheduleCarouselModel_6.mo16262q(arrayList6);
            add(scheduleCarouselModel_6);
            SeparatorModel_ separatorModel_6 = new SeparatorModel_();
            separatorModel_6.mo15779a("separator6");
            add(separatorModel_6);
        }
        if (!scheduleSunday.isEmpty()) {
            HeaderModel_ headerModel_7 = new HeaderModel_();
            headerModel_7.mo16254a("header7");
            headerModel_7.mo16253Y0(7);
            add(headerModel_7);
            ScheduleCarouselModel_ scheduleCarouselModel_7 = new ScheduleCarouselModel_();
            scheduleCarouselModel_7.mo16261a("carousel7");
            scheduleCarouselModel_7.mo16263s(Carousel.Padding.m4493a(16, 8, 16, 0, 16));
            ArrayList arrayList7 = new ArrayList(CollectionsKt.m32032m(scheduleSunday, 10));
            for (Release release7 : scheduleSunday) {
                ScheduleModel_ scheduleModel_7 = new ScheduleModel_();
                scheduleModel_7.m16260w2(release7.getId());
                String titleRu7 = release7.getTitleRu();
                scheduleModel_7.m4524l2();
                scheduleModel_7.f30087k = titleRu7;
                Integer episodesReleased7 = release7.getEpisodesReleased();
                scheduleModel_7.m4524l2();
                scheduleModel_7.f30089m = episodesReleased7;
                Integer episodesTotal7 = release7.getEpisodesTotal();
                scheduleModel_7.m4524l2();
                scheduleModel_7.f30090n = episodesTotal7;
                String image7 = release7.getImage();
                scheduleModel_7.m4524l2();
                scheduleModel_7.f30088l = image7;
                scheduleModel_7.m4524l2();
                scheduleModel_7.f30091o = listener;
                arrayList7.add(scheduleModel_7);
            }
            scheduleCarouselModel_7.mo16262q(arrayList7);
            add(scheduleCarouselModel_7);
            SeparatorModel_ separatorModel_7 = new SeparatorModel_();
            separatorModel_7.mo15779a("separator7");
            add(separatorModel_7);
        }
    }
}
