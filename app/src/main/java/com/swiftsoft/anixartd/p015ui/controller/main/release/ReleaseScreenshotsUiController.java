package com.swiftsoft.anixartd.p015ui.controller.main.release;

import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.main.release.ScreenshotModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.ScreenshotModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.carousel.ScreenshotCarouselModel_;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseScreenshotsUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014J\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseScreenshotsUiController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseScreenshotsUiController$Listener;", "()V", "buildModels", "", "screenshots", "listener", "isEmpty", "", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseScreenshotsUiController extends Typed2EpoxyController<List<? extends String>, Listener> {

    /* compiled from: ReleaseScreenshotsUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseScreenshotsUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/release/ScreenshotModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ScreenshotModel.Listener {
    }

    public ReleaseScreenshotsUiController() {
        setDebugLoggingEnabled(true);
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends String> list, Listener listener) {
        buildModels2((List<String>) list, listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@NotNull List<String> screenshots, @NotNull Listener listener) {
        Intrinsics.m32179h(screenshots, "screenshots");
        Intrinsics.m32179h(listener, "listener");
        ScreenshotCarouselModel_ screenshotCarouselModel_ = new ScreenshotCarouselModel_();
        screenshotCarouselModel_.mo16239a("screenshotCarousel");
        screenshotCarouselModel_.mo16241s(Carousel.Padding.m4493a(16, 8, 16, 8, 16));
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(screenshots, 10));
        for (String str : screenshots) {
            ScreenshotModel_ screenshotModel_ = new ScreenshotModel_();
            screenshotModel_.m4520h2(str);
            screenshotModel_.m4524l2();
            Intrinsics.m32179h(str, "<set-?>");
            screenshotModel_.f30025k = str;
            screenshotModel_.m4524l2();
            screenshotModel_.f30026l = listener;
            arrayList.add(screenshotModel_);
        }
        screenshotCarouselModel_.mo16240q(arrayList);
        add(screenshotCarouselModel_);
    }
}
